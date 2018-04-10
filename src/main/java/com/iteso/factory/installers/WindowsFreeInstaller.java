package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.WindowsInstallerPackage;

public class WindowsFreeInstaller extends Installer {
    public WindowsFreeInstaller(){
        name = "Windows Free Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
