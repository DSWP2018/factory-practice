package com.iteso.factory;

import com.iteso.factory.stores.Linux;
import com.iteso.factory.stores.MacOS;
import com.iteso.factory.stores.Windows;

public class Main {

    public static void main(String[] args) {

        //Linux Store.
        DownloadFactory linux = new Linux();
        linux.createInstallerPackage("Linux Free");
        System.out.println("Linux: " + linux.getTargetOS());


        //MacOS Store.
        DownloadFactory macOS = new MacOS();
        macOS.createInstallerPackage("MacOS Home");
        System.out.println("MacOS: " + macOS.getTargetOS());


        //Windows Store.
        DownloadFactory windows = new Windows();
        windows.createInstallerPackage("Windows Professional");
        System.out.println("Windows: " + windows.getTargetOS());



        Installer installer = windows.downloadInstaller("Windows Home");
        System.out.println("Installer name: " + installer.getName());
        System.out.println("Installer package: " + installer.getPackage());

        

    }

}
