package com.yb.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yb.domain.BookList;
import com.yb.domain.User;
import com.yb.util.ValueUtils;

import java.io.*;
import java.util.List;

/**
 * Created by 杨波 on 2016/11/13.
 */
public class DisplayAction extends ActionSupport {
    private String paymethod;

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    private User user;
    private List<BookList> book;

    public List<BookList> getBook() {
        return book;
    }

    public void setBook(List<BookList> book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    /**跳转显示操作*/
    public String display(){
        //讲user对象放到request域中
        ValueUtils.putValuStacktop(user);
        //移除quantity为空的一行
        for (int i=0;i<book.size();) {
            if (book.get(i).getQuantity()==null) {
                book.remove(i);
            }else {i++;}
        }
        Double totalcast=0.0;
        int total=0;
        //计算总价和总书的个数
        for(int i=0;i<book.size();i++){
            totalcast=totalcast+book.get(i).getPrice()*book.get(i).getQuantity();
            total=total+book.get(i).getQuantity();
        }

        //定义要写到文件中的内容
        String textFile=user.getUsername()+"  has bought  "+total+"  books  "+"\r\n"+user.getUsername()+"  paid  "+totalcast+"\r\n"
                +"paid by  "+paymethod+"\r\n";

        //文件操作
        File file=new File("d:/newFile.txt");
        try {
            DataOutputStream os = new DataOutputStream(new FileOutputStream(file));
            os.writeChars(textFile);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //放到request域中
        ValueUtils.putValuStack("book",book);
        ValueUtils.putValuStack("totalcast",totalcast);
        ValueUtils.putValuStack("total",total);
        ValueUtils.putValuStack("paymethod",paymethod);
        return "display";
    }
    /*public String addFile(){
        Double totalcast=0.0;
        int total=0;
        for(int i=0;i<book.size();i++){
            totalcast=totalcast+book.get(i).getPrice()*book.get(i).getQuantity();
            total=total+book.get(i).getQuantity();
        }
        String textFile=user.getUsername()+"has bought"+total+"books"+"/r/n"+user.getUsername()+"paid"+totalcast+"/r/n"
                +"paid by"+paymethod;

        File file=new File("d:/newFile.txt");
        try {
            DataOutputStream os = new DataOutputStream(new FileOutputStream(file));
            os.writeChars(textFile);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "addFile";
    }*/
}
