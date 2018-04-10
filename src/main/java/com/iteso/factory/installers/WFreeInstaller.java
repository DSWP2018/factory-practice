package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WFreeInstaller extends Installer {

    public WFreeInstaller() {
        name = "Free Windows";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
