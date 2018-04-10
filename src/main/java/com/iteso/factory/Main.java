package com.iteso.factory;

import com.iteso.factory.installers.LinuxInstaller;
import com.iteso.factory.installers.MacInstaller;
import com.iteso.factory.installers.WindowsInstaller;

public class Main {
    public static void main (String[] args){
        DownloadFactory freeWindows = new WindowsInstaller();
        Installer free = freeWindows.createInstallerPackage("Free");
        free.getVersion();
        free.getPackage().encode();
        DownloadFactory homeLinux = new LinuxInstaller();
        Installer home = homeLinux.createInstallerPackage("Home");
        home.getVersion();
        home.getPackage().encode();
        DownloadFactory proMac = new MacInstaller();
        Installer prof = proMac.createInstallerPackage("Profesional");
        prof.getVersion();
        prof.getPackage().encode();
    }
}
