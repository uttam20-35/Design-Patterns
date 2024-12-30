package com.creational.factory;

public class OperatingSystemFactory {

    public OperatingSystem getInstance(String s){
        if (s.equals("Open"))
            return new Android();
        else if (s.equals("Close"))
            return new AppleIOS();
        else
            return new Windows();
    }
}
