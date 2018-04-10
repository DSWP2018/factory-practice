package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.LIP;

public class LinuxHome extends Installer{
    public LinuxHome() {
        name="Linux Home Installer";
    }
    @Override
    public InstallerPackage getPackage(){

        InstallerPackage i= new LIP();
        return i;
    }
}
