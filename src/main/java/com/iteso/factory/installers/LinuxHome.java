package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LinuxHome extends Installer {
    public LinuxHome(){
        name = "LinuxHome";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}