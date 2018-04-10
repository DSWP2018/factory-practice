package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacOSProfessionalInstaller  extends  Installer{
    public MacOSProfessionalInstaller(){
        name = "MacOS Professional Installer";

        System.out.println("This is the MacOS Professional installer");


    }

    public InstallerPackage getPackage() {
        return null;
    }

}