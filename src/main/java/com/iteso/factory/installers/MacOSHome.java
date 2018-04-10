package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.MacOSPackage;

public class MacOSHome extends Installer {
    public MacOSHome(){
        name = "MacOSHome";
    }
    @Override
    public InstallerPackage getPackage() {

        return new MacOSPackage();
    }
}