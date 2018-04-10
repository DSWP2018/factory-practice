package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LIP;

public class LinuxProfessional extends Installer {
    public LinuxProfessional() {
        name="Linux Professional Installer";
    }
    @Override
    public InstallerPackage getPackage()
    {
        InstallerPackage i= new LIP();
        return i;
    }
}
