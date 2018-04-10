package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackage.WindowsInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class ProfessionalWindowsInstaller extends Installer {
    public ProfessionalWindowsInstaller(){
        name = "Windows Professional Installer";


    }

    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
