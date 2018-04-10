package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class LFreeInstaller extends Installer{

    public LFreeInstaller() {
        name = "Free Linux";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
