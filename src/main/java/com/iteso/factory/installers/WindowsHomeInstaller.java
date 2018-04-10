package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.WindowsPackage;

public class WindowsHomeInstaller extends Installer {
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }

    public WindowsHomeInstaller() {
        name ="Windows Home Installer";
    }
    public String getName(){
        return name;
    }
}
