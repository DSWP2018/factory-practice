package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.LinuxPackage;

public class HomeLinux extends Installer {
    public HomeLinux(){
        name = "HomeLinux";
    }
    @Override
    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
