package com.iteso.factory;

import com.iteso.factory.installers.LinuxInstaller;
import com.iteso.factory.installers.MacInstaller;
import com.iteso.factory.installers.WindowsInstaller;

public class Main {
    public static void main (String[] args){
        DownloadFactory freeWindows = new WindowsInstaller();
        Installer free = freeWindows.createInstallerPackage("Free");
        free.getVersion();
        DownloadFactory homeLinux = new LinuxInstaller();
        Installer home = homeLinux.createInstallerPackage("Home");
        home.getVersion();
        DownloadFactory proMac = new MacInstaller();
        Installer prof = proMac.createInstallerPackage("Profesional");
        prof.getVersion();
    }
}
