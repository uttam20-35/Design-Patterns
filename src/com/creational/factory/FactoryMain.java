package com.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        System.out.println("CREATIONAL: Factory Design Pattern");

        // Design Pattern : Creational ---> Factory Pattern -Main Logic
        OperatingSystemFactory operatingSystemFactory= new OperatingSystemFactory();

        //Scenario 1:
        System.out.println("Scenario 1:");
        OperatingSystem os=operatingSystemFactory.getInstance("Open");
        os.spec();

        //Scenario 2:
        System.out.println("Scenario 2:");
        OperatingSystem OS=operatingSystemFactory.getInstance("Close");
        OS.spec();

        //Scenario 3:
        System.out.println("Scenario 3:");
        OperatingSystem Os=operatingSystemFactory.getInstance("anything");
        Os.spec();
    }
}