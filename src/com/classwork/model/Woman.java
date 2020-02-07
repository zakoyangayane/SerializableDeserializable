package com.classwork.model;

public class Woman extends User {

    public Woman(String userName, String name, String phone, boolean servedInArmy, String password, Address address) {
        super(userName, name, phone, servedInArmy, password, address);
        if (servedInArmy) {
            throw new IllegalArgumentException("Women don't serve in army");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
