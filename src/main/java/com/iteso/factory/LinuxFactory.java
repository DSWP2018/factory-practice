package com.iteso.factory;

import com.iteso.factory.installers.*;

public class LinuxFactory extends DownloadFactory {
    private String targetOS = "Linux";

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) { //home, free, pro
        Installer installer = null;

        if(operatingSystemVersion.equals("free")) {
            installer = new LinuxFreeInstaller();
        } else if(operatingSystemVersion.equals("home")) {
            installer = new LinuxHomeInstaller();
        } else if(operatingSystemVersion.equals("professional")) {
            installer = new LinuxProfessionalInstaller();
        } else {
            return null;
        }
        return installer;
    }
}
