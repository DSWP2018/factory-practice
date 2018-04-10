package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.WindowsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsFreeInstaller extends Installer {
    public WindowsFreeInstaller(){
        name = "Windows Free Installer";
    }

    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
    public String getName(){
        return name;
    }
}
