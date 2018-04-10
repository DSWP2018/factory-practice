package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MFreeInstaller extends Installer {

    public MFreeInstaller() {
        name = "Free MacOS";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
