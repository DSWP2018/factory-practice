package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.LinuxPackage;

public class LinuxFree extends Installer
{
    public LinuxFree()
    {
        name = "LinuxFree";
    }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
