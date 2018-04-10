package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacFreeInstaller extends Installer{
    public MacFreeInstaller() {
        name = "Mac Free Installer";
        System.out.println("Free installer");
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
