package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfesionalInstaller;

public class WindowsStore extends DownloadFactory{
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion == "Home")
            return new WindowsHomeInstaller();
        else if(operatingSystemVersion == "Free")
            return new WindowsFreeInstaller();
        else if(operatingSystemVersion == "Profesional")
            return new WindowsProfesionalInstaller();
        else
            return null;
    }

}
