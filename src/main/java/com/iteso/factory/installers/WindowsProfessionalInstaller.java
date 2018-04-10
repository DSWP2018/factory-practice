package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.WindowsPackage;

public class WindowsProfessionalInstaller extends Installer {
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }

    public WindowsProfessionalInstaller() {
        name ="Windows Professional Installer";
    }
    public String getName(){
        return name;
    }
}
