package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class WindowsFree extends Installer {
    public WindowsFree(){
        name = "WindowsFree";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}