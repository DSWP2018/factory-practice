package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerpackage.WindowsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsHome extends Installer {
    public WindowsHome(){
        name = "Windows Home Installer";
        setPackage(new WindowsPackage());


    }

    public InstallerPackage getPackage() {
        return this.packageType;
    }
}
