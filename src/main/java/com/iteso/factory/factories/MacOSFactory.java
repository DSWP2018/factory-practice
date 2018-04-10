package com.iteso.factory.factories;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class MacOSFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        Installer macOSInstaller;
        if(operatingSystemVersion.equals("Free"))
            macOSInstaller = new MacOsFreeInstaller();
        else if(operatingSystemVersion.equals("Home"))
            macOSInstaller = new MacOsHomeInstaller();
        else if(operatingSystemVersion.equals("Professional"))
            macOSInstaller = new MacOsProfessionalInstaller();
        else
            macOSInstaller = null;
        return macOSInstaller;
    }
}
