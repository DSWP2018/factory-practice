package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerpackage.MacOSPackage;
import com.iteso.factory.installerpackage.WindowsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsFree extends Installer {
    public WindowsFree(){
        name = "Windows Free Installer";
        setPackage(new WindowsPackage());


    }

    public InstallerPackage getPackage() {
        return this.packageType;
    }
}
