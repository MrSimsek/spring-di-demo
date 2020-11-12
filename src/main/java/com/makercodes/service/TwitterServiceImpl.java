package com.makercodes.service;

public class TwitterServiceImpl implements MessageService {
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Tweet DM sent to " + rec + " with Message=" + msg);
        return true;
    }
}
