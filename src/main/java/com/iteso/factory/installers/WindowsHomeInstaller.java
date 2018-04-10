package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.InstallerPackages.WindowsInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsHomeInstaller extends Installer {

    public WindowsHomeInstaller() {
        name = "Windows Home Installer";


    }

    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
