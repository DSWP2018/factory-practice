package com.iteso.factory;

import com.iteso.factory.installers.*;

public class MacOSFactory extends DownloadFactory {
    private String targetOS = "MacOS";

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) { //home, free, pro
        Installer installer = null;

        if(operatingSystemVersion.equals("free")) {
            installer = new MacOSFreeInstaller();
        } else if(operatingSystemVersion.equals("home")) {
            installer = new MacOSHomeInstaller();
        } else if(operatingSystemVersion.equals("professional")) {
            installer = new MacOSProfessionalInstaller();
        } else {
            return null;
        }
        return installer;
    }
}
