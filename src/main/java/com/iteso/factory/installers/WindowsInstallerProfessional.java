package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackages.WindowsInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsInstallerProfessional extends Installer {
    public WindowsInstallerProfessional(){
        name = "Windows Installer Professional";

    }

    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
