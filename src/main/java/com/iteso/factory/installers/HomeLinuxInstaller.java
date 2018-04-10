package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackage.LinuxInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class HomeLinuxInstaller extends Installer {
    public HomeLinuxInstaller(){
        name = "Linux Home Installer";


    }

    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
