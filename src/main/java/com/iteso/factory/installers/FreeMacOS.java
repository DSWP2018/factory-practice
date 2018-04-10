package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.LinuxPackage;
import com.iteso.factory.Package.MacOSPackage;

public class FreeMacOS extends Installer {
    public FreeMacOS(){
        name = "FreeMacOS";
    }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSPackage();
    }
}
