package com.example.faris.revisi.Model;

import android.app.Notification;

public class Sender {
    public String to;
    public com.example.faris.revisi.Model.Notification notification;

    public Sender(String to, com.example.faris.revisi.Model.Notification notification) {
        this.to = to;
        this.notification = notification;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public com.example.faris.revisi.Model.Notification getNotification() {
        return notification;
    }

    public void setNotification(com.example.faris.revisi.Model.Notification notification) {
        this.notification = notification;
    }
}
