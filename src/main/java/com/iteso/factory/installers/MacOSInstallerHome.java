package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacOSInstallerHome extends Installer {
    public MacOSInstallerHome(){
        name = "MacOS Installer Home";

    }

    public InstallerPackage getPackage() {
        return null;
    }
}