package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installer_packages.LinuxInstallerPackage;
import com.iteso.factory.installer_packages.MacOSInstallerPackage;

public class MacOsFreeInstaller extends Installer {
    public MacOsFreeInstaller(){
        name = "MacOS Free Installer";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
