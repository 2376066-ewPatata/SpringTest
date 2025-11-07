package com.irang.springtest.lifecycle;

public class BulletinBoard {

    private String title;
    private String user;
    private String content;

    public BulletinBoard(String title, String user, String content){

        this.title = title;
        this.user = user;
        this.content = content;

    }

    @Override
    public String toString(){
        return "title: " + title + ",\n" + "user: " + user + ",\n" + "content: " + content;
    }

    public String getTitle(){
        return title;
    }
    public String getUser(){
        return user;
    }
    public String getContent(){
        return content;
    }


}
