package com.iteso.factory.installers;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class ProfesionalVersionMac extends Installer {
    @Override
    public InstallerPackage getPackage() {
        InstallerPackage inst = new Mac();
        return inst;
    }
    @Override
    public void getVersion(){
        System.out.println("Pro Mac");
    }
}
