package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.InstallerWindowsPackage;

public class WindowsHomeInstaller extends Installer {
    public WindowsHomeInstaller(){
        name = "Windows Home Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new InstallerWindowsPackage();
    }
}
