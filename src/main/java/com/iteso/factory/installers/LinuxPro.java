package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LinuxPro extends Installer {
    public LinuxPro(){
        name = "LinuxPro";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}