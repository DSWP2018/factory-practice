package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.LinuxFreeInstaller;
import com.iteso.factory.installers.LinuxHomeInstaller;
import com.iteso.factory.installers.LinuxProfessionalInstaller;

public class LinuxFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion.equals("Linux Free Installer")){
            return new LinuxFreeInstaller();
        }
        else if(operatingSystemVersion.equals("Linux Home Installer")){
            return new LinuxHomeInstaller();
        }
        else if(operatingSystemVersion.equals("Linux Professional Installer")){
            return new LinuxProfessionalInstaller();
        }
        return null;
    }

}
