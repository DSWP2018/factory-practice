package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.LinuxPackage;

public class FreeLinux extends Installer {
    public FreeLinux(){
        name = "LinuxFree";
    }
    @Override
    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
