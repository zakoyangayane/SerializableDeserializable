package com.classwork.model;

public class Man extends User {

    public Man(String userName, String name, String phone, boolean servedInArmy, String password, Address address) {
        super(userName, name, phone, servedInArmy, password, address);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
