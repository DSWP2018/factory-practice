package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsHomeInstaller extends Installer {
    public WindowsHomeInstaller(){
        name = "Windows Home Installer";
    }

    public InstallerPackage getPackage() {
        return null;
    }
}
