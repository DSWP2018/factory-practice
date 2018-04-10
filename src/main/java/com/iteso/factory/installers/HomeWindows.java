package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.WindowsPackage;

public class HomeWindows extends Installer {
    public HomeWindows(){
        name = "HomeWindows";
    }
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
