package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LinuxFree extends Installer {
    public LinuxFree(){
        name = "LinuxFree";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}