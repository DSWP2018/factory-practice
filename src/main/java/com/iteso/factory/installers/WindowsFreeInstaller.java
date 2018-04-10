package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.WindowsPackage;

public class WindowsFreeInstaller extends Installer {
    public WindowsFreeInstaller(){
        name = "WindowsStore Free Installer";
    }

    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
