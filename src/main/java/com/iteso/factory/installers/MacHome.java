package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacHome extends Installer {
    public MacHome(){
        name = "MacHome";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}