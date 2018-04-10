package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class MacOSFactory extends DownloadFactory{

    final String factoryOS = "MacOS";
    @Override
    protected Installer createInstallerPackage(String operatingSystem) {
        switch (operatingSystem){
            case "Free":
                return  new FreeMacOSInstaller();
            case "Home":
                return new HomeMacOSInstaller();
            case "Professional":
                return new ProfessionalMacOSInstaller();
            default:
                return null;
        }
    }
}
