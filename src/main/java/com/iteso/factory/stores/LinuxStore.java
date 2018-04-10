package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installers.LinuxFreeInstaller;
import com.iteso.factory.installers.LinuxHomeInstaller;
import com.iteso.factory.installers.LinuxProfesionalInstaller;

public class LinuxStore extends DownloadFactory{
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion == "Home")
            return new LinuxHomeInstaller();
        else if(operatingSystemVersion == "Free")
            return new LinuxFreeInstaller();
        else if(operatingSystemVersion == "Profesional")
            return new LinuxProfesionalInstaller();
        else
            return null;
    }
}
