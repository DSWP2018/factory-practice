package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.packages.WindowsPackage;

public class WindowsProfesionalInstaller extends Installer {
    public WindowsProfesionalInstaller(){
        name = "WindowsStore Profesional Installer";
    }

    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
