package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackage.WindowsInstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class HomeWindowsInstaller extends Installer {
    public HomeWindowsInstaller(){
        name = "Windows Home Installer";


    }

    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
