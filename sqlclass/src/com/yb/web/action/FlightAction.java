package com.yb.web.action;

import com.mysql.jdbc.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yb.domain.Flight;
import com.yb.service.IFlightService;
import com.yb.service.impl.FlightServiceImpl;
import com.yb.utils.ValueUtils;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/16.
 */
public class FlightAction extends ActionSupport implements ModelDriven<Flight> {
    private String username;
    private String password;
    private String year;
    private String month;
    private String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    Flight flight=new Flight();
    IFlightService flightService=new FlightServiceImpl();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    /**对login进行验证*/
    public void validateLogin() {
        if(StringUtils.isNullOrEmpty(username)){
            this.addFieldError("error","用户名不能为空");
        }else if(StringUtils.isNullOrEmpty(password)){
            this.addFieldError("error","密码不能为空");
        }else if(!"yb".equals(username)||!"123".equals(password)){
            this.addFieldError("error","用户名或密码错误");
        }
    }

    @Override
    public Flight getModel() {
        return flight;
    }
    /**登陆*/
    public String login(){
        return  "list";
    }
    /**，查询所有，显示list页面*/
    public String home(){
        //从数据库中查询所有
        List<Flight> flightList=flightService.findAll();
        ValueUtils.putValuStack("flightList",flightList);
        return SUCCESS;
    }
    /**跳转到add页面*/
    public String add(){
        return "add";
    }
    /**add页面的保存操作*/
    public String save(){
        flightService.add(flight);
        return "list";
    }
    /**调到修改页面，把要修改的对象根据id号查出来，用于回显数据*/
    public String edit(){
        Integer id=flight.getFid();
        Flight f=flightService.findById(id);
        ValueUtils.putValuStacktop(f);
        return "edit";
    }
    /**修改页面的update操作*/
    public String update(){
        flightService.update(flight);
        return "list";
    }
    /**删除，根据id号*/
    public String delete(){
        Integer id=flight.getFid();
        flightService.delete(id);
        return  "list";
    }
    /**条件查询*/
    public String find(){
        String number=flight.getNumber();
        String date=year+"-"+month+"-"+day;
        List<Flight> flightList=flightService.findByNumberAndDate(number,date);
        ValueUtils.putValuStack("flightList",flightList);
        return SUCCESS;
    }
    /**普通用户的条件查询，回显到普通用户页面*/
    public String find2(){
        String number=flight.getNumber();
        String date=year+"-"+month+"-"+day;
        List<Flight> flightList=flightService.findByNumberAndDate(number,date);
        ValueUtils.putValuStack("flightList",flightList);
        return "success2";
    }
    /**普通用户的查询所有*/
    public String home2(){
        List<Flight> flightList=flightService.findAll();
        ValueUtils.putValuStack("flightList",flightList);
        return "success2";
    }
}
