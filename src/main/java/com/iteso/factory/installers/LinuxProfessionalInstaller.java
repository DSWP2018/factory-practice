package com.iteso.factory.installers;

import com.iteso.factory.installers.installerpackages.InstallerPackage;
import com.iteso.factory.installers.installerpackages.LinuxPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxProfessionalInstaller extends Installer {
    public LinuxProfessionalInstaller(){
        name = "Linux Professional Installer";
    }

    public InstallerPackage getPackage() {
        return new LinuxPackage();
    }
}
