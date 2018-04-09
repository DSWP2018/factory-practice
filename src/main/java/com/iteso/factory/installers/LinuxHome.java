package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxHome extends Installer {
    public LinuxHome(){
        name = "Linux Home Installer";


    }

    public InstallerPackage getPackage() {
        return null;
    }
}
