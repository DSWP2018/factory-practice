package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.MacOSPackage;

public class ProfessionalMacOS extends Installer {
    public ProfessionalMacOS(){
        name = "ProfessionalMacOS";
    }
    @Override
    public InstallerPackage getPackage() {

        return new MacOSPackage();
    }
}
