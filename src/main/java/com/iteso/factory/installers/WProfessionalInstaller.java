package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

import javax.naming.InsufficientResourcesException;

public class WProfessionalInstaller extends Installer{

    public WProfessionalInstaller() {
        name = "Professional Windows";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
