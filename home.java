package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class home {
    //pojo class

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    private int doorNo;

    {
        System.out.println("connect to the internet");
    }
}
