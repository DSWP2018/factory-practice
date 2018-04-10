package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.WIP;

public class WindowsHome extends Installer{
    public WindowsHome() {
        name="Windows Home Installer";
    }
    @Override
    public InstallerPackage getPackage(){

        InstallerPackage i= new WIP();
        return i;
    }
}
