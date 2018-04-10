package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackages.MacOSInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacOSInstallerFree extends Installer {
    public MacOSInstallerFree(){
        name = "MacOS Installer Free";

    }

    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
