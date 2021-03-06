package com.company.devices;

import com.company.Human;
import com.company.creatures.Salleable;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device implements Salleable{
    public final String producer;
    public final String model;
    public final Double screenSize;
    public final boolean isAndroid;
    public final Integer yearOfProduction;
    public static final double appVersion = 1.0;
    public static final String serverIP = "208.66.221.221";
    public static final String appUrl = "www.gottacatchthemall.com";

    public Phone(String producer, String model, Double screenSize, boolean isAndroid, Integer yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Phone" +
                " produced by'" + producer +
                ", model:" + model +
                ", screenSize:" + screenSize +
                ", isAndroid:" + isAndroid +
                "yearOfProduction: " + yearOfProduction;
    }

    @Override
    public String producer() {
        return null;
    }

    @Override
    public String model() {
        return null;
    }

    @Override
    public Integer yearOfProduction() {
        return null;
    }

    @Override
    public void turnOn() {
        System.out.println("BEEP BEEP, READY TO USE CHIEF");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone == this && buyer.cash >= price)
        {
            seller.cash += price;
            seller.phone = null;
            buyer.cash -= price;
            buyer.phone = this;
            System.out.println(seller + " Just sold his phone to " + buyer + " for just "+ price);
        }
        else
        {
            System.out.println("Someone one here is lying about their savings or possessing a certain phone");
        }
    }

    public void installAnApp(String appName) {
        System.out.println(appName + " has been successfully installed!");
    }

    public void installAnApp(String appName, double AppVersion)  {
        System.out.println(appVersion + " version of the " + appName + " has been successfully installed!");
    }

    public void installAnApp(String appName, String url, double AppVersion) {
        System.out.println(appVersion + " version of the " + appName + "downloaded from" + appUrl
                +" has been successfully installed!");
    }

    public void installAnApp(String appName, double AppVersion, String url) {
        System.out.println(AppVersion + " version of the " + appName
                +" has been successfully downloaded from " + appUrl);
    }
}
