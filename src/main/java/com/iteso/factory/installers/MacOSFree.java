package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.MacOSPackage;

public class MacOSFree extends Installer
{
    public MacOSFree(){
        name = "FreeMacOS";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }
}
