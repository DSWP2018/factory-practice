package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LinuxInstaller;
import com.iteso.factory.WindowsInstaller;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxFree extends Installer {
    public LinuxFree(){
        name = "Linux Free Installer";

    }

    public InstallerPackage getPackage() {
        return new LinuxInstaller();
    }
}
