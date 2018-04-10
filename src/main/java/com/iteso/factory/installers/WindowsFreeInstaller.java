package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsFreeInstaller extends Installer {
    public WindowsFreeInstaller(){
        name = "Windows Free Installer";
        System.out.println("Free installer");
    }

    public InstallerPackage getPackage() {
        return null;
    }
}
