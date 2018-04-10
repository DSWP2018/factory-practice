package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class WHomeInstaller extends Installer{

    public WHomeInstaller() {
        name = "Home Windows";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
