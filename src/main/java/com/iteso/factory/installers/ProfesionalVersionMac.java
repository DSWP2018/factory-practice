package com.iteso.factory.installers;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class ProfesionalVersionMac extends Installer {
    @Override
    public InstallerPackage getPackage() {
        return null;
    }
    @Override
    public void getVersion(){
        System.out.println("Pro Mac");
    }
}
