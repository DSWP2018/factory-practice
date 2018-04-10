package com.iteso.factory.Factory;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.MacOSInstallerFree;
import com.iteso.factory.installers.MacOSInstallerHome;
import com.iteso.factory.installers.MacOSInstallerProfessional;


public class MacOSFactory extends DownloadFactory {
    final String factoryOS = "MacOS";

    public MacOSFactory(){
        setTargetOS(factoryOS);
    }
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        switch (operatingSystemVersion) {
            case "Free":
                return new MacOSInstallerFree();
            case "Home":
                return new MacOSInstallerHome();
            case "Professional":
                return new MacOSInstallerProfessional();
            default:
                return null;
        }
    }
}
