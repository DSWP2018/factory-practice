package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.InstallerPackages.LinuxInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxFreeInstaller extends Installer {
    public LinuxFreeInstaller(){
        name = "Linux Free Installer";


    }

    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
