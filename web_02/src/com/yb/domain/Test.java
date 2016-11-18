package com.yb.domain;

/**
 * Created by 杨波 on 2016/11/11.
 */
public class Test {
    private Book book;
    private User user;

    public Test(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
