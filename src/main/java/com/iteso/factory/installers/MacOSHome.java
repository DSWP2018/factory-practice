package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerpackage.MacOSPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacOSHome extends Installer {
    public MacOSHome(){
        name = "MacOS Home Installer";
        setPackage(new MacOSPackage());

    }

    public InstallerPackage getPackage() {
        return this.packageType;
    }
}
