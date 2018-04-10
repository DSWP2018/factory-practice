package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Packages.WindowsPackage;

public class WindowsProfessional extends Installer {
    public WindowsProfessional(){
        name = "WindowsProfessional";
    }
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
