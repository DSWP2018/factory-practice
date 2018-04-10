package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.WIP;

public class WindowsFree extends Installer{

    public WindowsFree() {
        name="Windows Free Installer";
    }
    @Override
    public InstallerPackage getPackage(){

        InstallerPackage i= new WIP();
        return i;
    }
}
