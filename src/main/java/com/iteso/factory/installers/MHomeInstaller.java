package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MHomeInstaller extends Installer {

    public MHomeInstaller() {
        name = "Home MacOS";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
