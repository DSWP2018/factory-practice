package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LIP;

public class LinuxFree extends Installer {
    public LinuxFree() {
        name="Linux Free Installer";
    }
    @Override
    public InstallerPackage getPackage(){

        InstallerPackage i= new LIP();
        return i;
    }
}
