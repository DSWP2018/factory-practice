package com.iteso.factory;

import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfessionalInstaller;

public class WindowsFactory extends DownloadFactory {
    private String targetOS = "Windows";

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) { //home, free, pro
        Installer installer = null;

        if(operatingSystemVersion.equals("free")) {
            installer = new WindowsFreeInstaller();
        } else if(operatingSystemVersion.equals("home")) {
            installer = new WindowsHomeInstaller();
        } else if(operatingSystemVersion.equals("professional")) {
            installer = new WindowsProfessionalInstaller();
        } else {
            return null;
        }
        return installer;
    }
}
