package com.iteso.factory.installers;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class LinuxInstaller extends DownloadFactory {
    String os;

    public LinuxInstaller(){
        os = "Linux";
    }

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion){
        if(operatingSystemVersion.equals("Free")){
            Installer lInstaller = new FreeVersionLinux();
            return lInstaller;
        }else if(operatingSystemVersion.equals("Home")){
            Installer lInstaller = new HomeVersionLinux();
            return lInstaller;
        }else if(operatingSystemVersion.equals("Profesional")){
            Installer lInstaller = new ProfesionalVersionLinux();
            return lInstaller;
        }
        return null;
    }
}
