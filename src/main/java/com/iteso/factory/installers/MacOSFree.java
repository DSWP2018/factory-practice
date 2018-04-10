package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MIP;

public class MacOSFree extends Installer {
    public MacOSFree() {
        name="MacOS Free Installer";
    }
    @Override
    public InstallerPackage getPackage(){

        InstallerPackage i= new MIP();
        return i;

    }
}
