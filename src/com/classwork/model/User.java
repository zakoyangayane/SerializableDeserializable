package com.classwork.model;

import java.io.*;

public class User implements Serializable {
    private String userName;
    private String name;
    private String phone;
    private boolean servedInArmy;
    private transient String password;
    private Address address;

    public User(String userName, String name, String phone, boolean servedInArmy,
                String password, Address address) {
        this.userName = userName;
        this.name = name;
        this.phone = phone;
        this.servedInArmy = servedInArmy;
        this.password = password;
        this.address = address;
    }

    public static class Address implements Serializable {
        private String city;
        private String street;

        public Address(String city, String street) {
            this.city = city;
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isServedInArmy() {
        return servedInArmy;
    }

    public void setServedInArmy(boolean servedInArmy) {
        this.servedInArmy = servedInArmy;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void serializeUser(User user) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("users.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("already serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User deSerializeUser() {
        User user = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("users.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            user = (User) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("already deSerialized");
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        return user;
    }

    public void printInfo() {
        System.out.println("username - " + userName);
        System.out.println("name - " + name);
        System.out.println("phone - " + phone);
        System.out.println("servedInArmy - " + servedInArmy);
        System.out.println("password - " + password);
        System.out.println("address - city: " + address.city + ", street: " + address.street);
        System.out.println("---------------------------");
    }
}
