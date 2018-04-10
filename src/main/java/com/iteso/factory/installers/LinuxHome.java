package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerpackage.LinuxPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxHome extends Installer {
    public LinuxHome(){
        name = "Linux Home Installer";
        setPackage(new LinuxPackage());

    }

    public InstallerPackage getPackage() {
        return this.packageType;
    }
}
