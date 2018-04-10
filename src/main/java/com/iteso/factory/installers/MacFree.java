package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacFree extends Installer {
    public MacFree(){
        name = "MacFree";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}