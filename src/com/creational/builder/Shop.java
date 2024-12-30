package com.creational.builder;

public class Shop {

    public static void main(String[] args) {
       //Without Builder Pattern:
        // if any value not passed in parameter then gets a compilation error.
        Phone phone= new Phone("Android",8 ,"MediaTek", 5.5,3000);
        System.out.println(phone);

        //With Builder Pattern:
            // We can pass required data members into the phone, not required to pass all the members,
        Phone phoneOne= new PhoneBuilder().setOs("IOS").setBattery(5000).setRam(16).getPhone();
        System.out.println(phoneOne);
    }
}