package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.WindowsPackage;

public class WindowsHomeInstaller extends Installer {
    public WindowsHomeInstaller(){
        name = "WindowsStore Home Installer";
    }

    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
