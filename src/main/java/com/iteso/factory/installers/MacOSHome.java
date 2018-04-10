package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MIP;

public class MacOSHome extends Installer {
    public MacOSHome() {
        name="MacOSHome Installer";
    }
    @Override
    public InstallerPackage getPackage(){
        InstallerPackage i= new MIP();
        return i;    }
}
