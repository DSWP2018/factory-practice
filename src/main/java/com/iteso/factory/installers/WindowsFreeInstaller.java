package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsFreeInstaller extends Installer {
    public WindowsFreeInstaller(){
        name = "Windows Installer";

        System.out.println("This is the Windows Free installer");


    }

    public InstallerPackage getPackage() {
        return null;
    }
}
