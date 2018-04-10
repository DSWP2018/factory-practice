package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackage.MacOSInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class HomeMacOSInstaller extends Installer {
    public HomeMacOSInstaller(){
        name = "MacOS Free Installer";


    }

    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
