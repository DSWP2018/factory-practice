package com.iteso.factory.installers;

import com.iteso.factory.installers.installerpackages.InstallerPackage;
import com.iteso.factory.installers.installerpackages.LinuxPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxHomeInstaller extends Installer {
    public LinuxHomeInstaller(){
        name = "Linux Home Installer";
    }

    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
