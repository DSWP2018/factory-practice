package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LHomeInstaller extends Installer{

    public LHomeInstaller() {
        name = "Home Linux";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
