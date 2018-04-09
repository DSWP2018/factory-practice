package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacOSFreeInstaller extends Installer {

    public MacOSFreeInstaller() {
        name = "MacOS Free Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
