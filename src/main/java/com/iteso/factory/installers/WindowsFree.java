package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.WindowsPackage;

public class WindowsFree extends Installer
{
    public WindowsFree(){
        name = "WindowsFree";
    }
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
