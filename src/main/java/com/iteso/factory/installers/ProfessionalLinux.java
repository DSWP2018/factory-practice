package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.Package.LinuxPackage;

public class ProfessionalLinux extends Installer {
    public ProfessionalLinux(){
        name = "ProfessionalLinux";
    }
    @Override
    public InstallerPackage getPackage() {

        return new LinuxPackage();
    }
}
