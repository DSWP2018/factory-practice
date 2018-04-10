package com.iteso.factory.installers;

import com.iteso.factory.installers.installerpackages.InstallerPackage;
import com.iteso.factory.installers.installerpackages.MacOsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacOSHomeInstaller extends Installer {
    public MacOSHomeInstaller(){
        name = "MacOs Home Installer";
    }

    public InstallerPackage getPackage() {
        return new MacOsPackage();
    }
}
