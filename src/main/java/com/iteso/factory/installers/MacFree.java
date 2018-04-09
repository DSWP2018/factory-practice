package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MacInstaller;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacFree extends Installer {
    public MacFree(){
        name = "MacOS Free Installer";

    }

    public InstallerPackage getPackage() {
        return new MacInstaller();
    }
}
