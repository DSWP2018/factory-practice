package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LinuxInstaller;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxProfessional extends Installer {
    public LinuxProfessional(){
        name = "Linux Professional Installer";

    }

    public InstallerPackage getPackage() {
        return new LinuxInstaller();
    }
}
