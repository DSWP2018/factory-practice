package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackages.WindowsInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsInstallerHome extends Installer {
    public WindowsInstallerHome(){
        name = "Windows Installer Home";

    }

    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
