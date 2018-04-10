package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacHomeInstaller extends Installer{
    public MacHomeInstaller() {
        name = "Mac Home Installer";
        System.out.println("Home installer");
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
