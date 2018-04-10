package com.iteso.factory;

import com.iteso.factory.installers.Installer;
import com.iteso.factory.stores.DownloadFactory;

public class Main{
    public static void main(String[] args) {
        DownloadFactory windowsStore = StoreFactory.createStore("Windows");
        DownloadFactory macOSStore = StoreFactory.createStore("MacOS");
        DownloadFactory linuxStore = StoreFactory.createStore("Linux");

        Installer w1 = windowsStore.downloadInstaller("Free");
        Installer w2 = windowsStore.downloadInstaller("Home");
        Installer w3 = windowsStore.downloadInstaller("Professional");
        
        Installer m1 = macOSStore.downloadInstaller("Free");
        Installer m2 = macOSStore.downloadInstaller("Home");
        Installer m3 = macOSStore.downloadInstaller("Professional");

        Installer l1 = linuxStore.downloadInstaller("Free");
        Installer l2 = linuxStore.downloadInstaller("Home");
        Installer l3 = linuxStore.downloadInstaller("Professional");

        System.out.println("OS w1: " + w1.name);
        System.out.println("OS w2: " + w2.name);
        System.out.println("OS w3: " + w3.name);

        System.out.println("OS m1: " + m1.name);
        System.out.println("OS m2: " + m2.name);
        System.out.println("OS m3: " + m3.name);

        System.out.println("OS l1 " + l1.name);
        System.out.println("OS l2 " + l2.name);
        System.out.println("OS l3 " + l3.name);

    }
}