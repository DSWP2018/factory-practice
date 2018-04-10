package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class WindowsProfessionalInstaller  extends Installer {
    public WindowsProfessionalInstaller(){
        name = "Windows Professional Installer";

        System.out.println("This is the Windows Professional installer");


    }

    public InstallerPackage getPackage() {
        return null;
    }
}