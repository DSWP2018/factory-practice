package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installers.MacOSFreeInstaller;
import com.iteso.factory.installers.MacOSHomeInstaller;
import com.iteso.factory.installers.MacOSProfesionalInstaller;

public class MacOSStore extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion == "Home")
            return new MacOSHomeInstaller();
        else if(operatingSystemVersion == "Free")
            return new MacOSFreeInstaller();
        else if(operatingSystemVersion == "Profesional")
            return new MacOSProfesionalInstaller();
        else
            return null;
    }
}
