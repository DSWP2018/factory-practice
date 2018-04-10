package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.MacOSPackage;

public class HomeMacOS extends Installer {
    public HomeMacOS(){
        name = "HomeMacOS";
    }
    @Override
    public InstallerPackage getPackage() {

        return new MacOSPackage();
    }
}
