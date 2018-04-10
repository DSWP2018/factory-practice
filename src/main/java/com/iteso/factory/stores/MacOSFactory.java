package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.MacOSFreeInstaller;
import com.iteso.factory.installers.MacOSHomeInstaller;
import com.iteso.factory.installers.MacOSProfessionalInstaller;

public class MacOSFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion.equals("MacOS Free Installer")){
            return new MacOSFreeInstaller();
        }
        else if(operatingSystemVersion.equals("MacOS Home Installer")){
            return new MacOSHomeInstaller();
        }
        else if(operatingSystemVersion.equals("MacOS Professional Installer")){
            return new MacOSProfessionalInstaller();
        }
        return null;
    }
}
