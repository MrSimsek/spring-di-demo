package com.makercodes.service;

public class EmailServiceImpl implements MessageService {
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + " with Message=" + msg);
        return true;
    }
}
