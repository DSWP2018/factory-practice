package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.MacOSPackage;

public class MacOSHomeInstaller  extends Installer {
    @Override
    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }

    public MacOSHomeInstaller() {
        name ="MacOS Home Installer";
    }
    public String getName(){
        return name;
    }
}
