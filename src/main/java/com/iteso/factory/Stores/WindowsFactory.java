package com.iteso.factory.Stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfessionalInstaller;


public class WindowsFactory extends DownloadFactory{
    @Override
    protected Installer createInstallerPackage(String OSVersion) {

        if(OSVersion.equals("Free")){
            return new WindowsFreeInstaller();
        }
        else if(OSVersion.equals("Home")){
            return new WindowsHomeInstaller();
        }
        else if(OSVersion.equals("Professional")){
            return new
                    WindowsProfessionalInstaller();
        }
        else return null;
    }

}
