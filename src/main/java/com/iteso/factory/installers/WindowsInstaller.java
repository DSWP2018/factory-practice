package com.iteso.factory.installers;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsInstaller extends DownloadFactory {
    String os;

    public WindowsInstaller(){
        os = "Windows";
    }

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion){
        if(operatingSystemVersion.equals("Free")){
            Installer wInstaller = new FreeVersionWindows();
            return wInstaller;
        }else if(operatingSystemVersion.equals("Home")){
            Installer wInstaller = new HomeVersionWindows();
            return wInstaller;
        }else if(operatingSystemVersion.equals("Profesional")){
            Installer wInstaller = new ProfesionalVersionWindows();
            return wInstaller;
        }
        return null;
    }
}
