package com.example.demo3;


public class Greeting {

    private String job;

    public Greeting() {
    }

    public Greeting(String par) {
        this.job = par + "job";
    }

    public String getJob() {
        return this.job;
    }

    public void getJob(String job) {
        this.job = job;
    }
    public void setMessage(String job) {
        this.job = job;
    }
}