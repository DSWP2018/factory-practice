package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacProInstaller extends Installer {
    public MacProInstaller() {
        name = "Mac Professional Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
