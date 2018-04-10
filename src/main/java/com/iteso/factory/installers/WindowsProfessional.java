package com.iteso.factory.installers;
import com.iteso.factory.Installer;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.WIP;

public class WindowsProfessional extends Installer {
    public WindowsProfessional() {
        name="Windows Professional Installer";
    }
    @Override
    public InstallerPackage getPackage(){

        InstallerPackage i= new WIP();
        return i;
    }
}
