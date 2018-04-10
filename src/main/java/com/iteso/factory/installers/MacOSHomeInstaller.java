package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacOSHomeInstaller  extends  Installer{
    public MacOSHomeInstaller(){
        name = "MacOS Home Installer";

        System.out.println("This is the MacOS Home installer");


    }

    public InstallerPackage getPackage() {
        return null;
    }

}