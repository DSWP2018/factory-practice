package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.WindowsPackage;

public class FreeWindows extends Installer {
    public FreeWindows(){
        name = "FreeWindows";
    }
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
