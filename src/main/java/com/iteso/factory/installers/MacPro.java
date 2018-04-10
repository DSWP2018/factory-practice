package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class MacPro extends Installer {
    public MacPro(){
        name = "MacPro";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}