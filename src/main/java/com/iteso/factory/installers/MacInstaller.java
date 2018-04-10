package com.iteso.factory.installers;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacInstaller extends DownloadFactory {
    String os;

    public MacInstaller(){
        os = "Mac";
    }

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion){
        if(operatingSystemVersion.equals("Free")){
            Installer mInstaller = new FreeVersionMac();
            return mInstaller;
        }else if(operatingSystemVersion.equals("Home")){
            Installer mInstaller = new HomeVersionMac();
            return mInstaller;
        }else if(operatingSystemVersion.equals("Profesional")){
            Installer mInstaller = new ProfesionalVersionMac();
            return mInstaller;
        }
        return null;
    }
}
