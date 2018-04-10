package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MIP;

public class MacOSProfessional extends Installer {
    public MacOSProfessional() {
        name="MacOSProfessional Installer";
    }
    @Override
    public InstallerPackage getPackage(){

        InstallerPackage i= new MIP();
        return i;
    }
}
