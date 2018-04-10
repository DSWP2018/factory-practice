package com.iteso.factory.installers;

import com.iteso.factory.installers.installerpackages.InstallerPackage;
import com.iteso.factory.installers.installerpackages.MacOsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacOSFreeInstaller extends Installer {
    public MacOSFreeInstaller(){
        name = "MacOs Free Installer";
    }

    public InstallerPackage getPackage() {
        return new MacOsPackage();
    }
}
