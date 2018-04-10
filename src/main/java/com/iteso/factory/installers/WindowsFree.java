package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.WindowsInstallerPackage;

public class WindowsFree extends Installer {

    public WindowsFree() {
        name = "Windows Free";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
