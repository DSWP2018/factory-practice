package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.WindowsPackage;

public class WindowsHome extends Installer {
    public WindowsHome(){
        name = "HomeWindows";
    }
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}