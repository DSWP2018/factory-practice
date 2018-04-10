package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.WindowsPackage;

public class ProfessionalWindows extends Installer {
    public ProfessionalWindows(){
        name = "ProfessionalWindows";
    }
    @Override
    public InstallerPackage getPackage() {
        return new WindowsPackage();
    }
}
