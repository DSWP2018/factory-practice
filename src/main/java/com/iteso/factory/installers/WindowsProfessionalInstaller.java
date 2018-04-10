package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.InstallerPackages.WindowsInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsProfessionalInstaller extends Installer {

    public WindowsProfessionalInstaller() {
        name = "Windows Professional Installer";


    }

    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
