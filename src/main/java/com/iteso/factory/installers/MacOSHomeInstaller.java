package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.InstallerPackages.MacOSInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacOSHomeInstaller extends Installer {

    public MacOSHomeInstaller() {
        name = "MacOS Home Installer";


    }

    public InstallerPackage getPackage() {
        return (InstallerPackage) new MacOSInstallerPackage();
    }
}
