package com.iteso.factory.factories;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class LinuxFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        Installer linuxInstaller;
        if(operatingSystemVersion.equals("Free"))
            linuxInstaller = new LinuxFreeInstaller();
        else if(operatingSystemVersion.equals("Home"))
            linuxInstaller = new LinuxHomeInstaller();
        else if(operatingSystemVersion.equals("Professional"))
            linuxInstaller = new LinuxProfessionalInstaller();
        else
            linuxInstaller = null;
        return linuxInstaller;
    }
}
