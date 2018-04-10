package com.iteso.factory.Stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.LinuxFreeInstaller;
import com.iteso.factory.installers.LinuxHomeInstaller;
import com.iteso.factory.installers.LinuxProfessionalInstaller;

public class LinuxFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String OSVersion) {
        if(OSVersion.equals("Free")){
            return new LinuxFreeInstaller();
        }
        else if(OSVersion.equals("Home")){
            return new LinuxHomeInstaller();
        }
        else if(OSVersion.equals("Professional")){
            return new
                    LinuxProfessionalInstaller();
        }
        else return null;
    }


}
