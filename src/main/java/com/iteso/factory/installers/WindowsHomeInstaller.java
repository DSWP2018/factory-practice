package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class WindowsHomeInstaller extends Installer {
    public WindowsHomeInstaller(){
        name = "Windows Home Installer";

        System.out.println("This is the Windows Home installer");


    }

    public InstallerPackage getPackage() {
        return null;
    }
}