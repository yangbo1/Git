package com.yb.web.action;

import com.mysql.jdbc.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Validateable;
import com.opensymphony.xwork2.util.ValueStack;
import com.yb.domain.Book;
import com.yb.domain.Order;
import com.yb.domain.User;
import com.yb.service.IBookService;
import com.yb.service.IOrderService;
import com.yb.service.IUserService;
import com.yb.service.impl.BookServiceImpl;
import com.yb.service.impl.OrderServiceImpl;
import com.yb.service.impl.UserServiceImpl;
import com.yb.util.ValueUtils;
import org.apache.struts2.ServletActionContext;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/10.
 */
public class UserAction extends ActionSupport{
    private User user;

    private List<Book> book;

    private List<Order> order;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    IUserService userService=new UserServiceImpl();
    IBookService bookService=new BookServiceImpl();
    IOrderService orderService=new OrderServiceImpl();

    @Override
    /**非空验证*/
    public void validate() {
        String username=user.getUsername();
        if(StringUtils.isNullOrEmpty(username)){
            addFieldError("error","名字不能为空！");
        }
    }
    /**添加操作*/
    public String add(){
        //把user对象存到数据库user表
        userService.addUser(user);

        //book对象的list遍历添加到数据库book表
        for(int i=0;i<book.size();i++){
            bookService.addBook(book.get(i));

        }

        //order对象的list集合遍历添加到数据库order1表
        for(int i=0;i<order.size();i++){
            order.get(i).setUsername(user.getUsername());
            order.get(i).setBookname(book.get(i).getBookname());
            order.get(i).setPublisher(book.get(i).getPublisher());
            //如果页面的quantity值为空，设为0
            if(order.get(i).getQuantity()==null){
                order.get(i).setQuantity(0);
            }
            orderService.addOrder(order.get(i));
        }

        return "add";
    }
    /**查询操作*/
    public String find(){
        Double totalprice=0.0;
        //根据用户名查询order1表，返回list集合
        List<Order> result=orderService.findByUsername(user.getUsername());
        //如果集合为空，跳到错误页面
        if(result.size()==0){
            return "error";
        }
        //计算总价
         totalprice=5.0*result.get(0).getQuantity()+6.2*result.get(1).getQuantity()+10.0*result.get(2).getQuantity()+7.8*result.get(3).getQuantity();
        //查询到的结果result进行判断，移除数量为空的一行
        for (int i=0;i<result.size();) {
            if (result.get(i).getQuantity()==0) {
                result.remove(i);
            }else {i++;}
        }
        //把结果集放到request中
        ValueUtils.putValuStack("result",result);
        ValueUtils.putValuStack("totalprice",totalprice);

        return "find";
    }


}
