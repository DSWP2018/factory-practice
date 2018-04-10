package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerpackage.WindowsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsProfessional extends Installer {
    public WindowsProfessional(){
        name = "Windows Professional Installer";
        setPackage(new WindowsPackage());


    }

    public InstallerPackage getPackage() {
        return this.packageType;
    }
}
