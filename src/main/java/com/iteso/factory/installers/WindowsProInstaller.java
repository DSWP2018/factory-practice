package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsProInstaller extends Installer {
    public WindowsProInstaller(){
        name = "Windows Professional Installer";
    }

    public InstallerPackage getPackage() {
        return null;
    }
}
