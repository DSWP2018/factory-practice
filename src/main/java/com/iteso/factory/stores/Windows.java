package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfessionalInstaller;

public class Windows extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion.equals("Windows Free Installer"))
            return new WindowsFreeInstaller();
        else if(operatingSystemVersion.equals("Windows Home Installer"))
            return new WindowsHomeInstaller();
        else if(operatingSystemVersion.equals("Windows Professional Installer"))
            return new WindowsProfessionalInstaller();
        else
            return null;
    }
}
