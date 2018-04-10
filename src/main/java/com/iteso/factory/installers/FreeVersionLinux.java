package com.iteso.factory.installers;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class FreeVersionLinux extends Installer {
    @Override
    public InstallerPackage getPackage() {
        InstallerPackage inst = new Linux();
        return inst;
    }
    @Override
    public void getVersion(){
        System.out.println("Free Linux");
    }
}
