package com.iteso.factory.factories;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfessionalInstaller;

public class WindowsFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        Installer windowsInstaller;
        if(operatingSystemVersion.equals("Free"))
            windowsInstaller = new WindowsFreeInstaller();
        else if(operatingSystemVersion.equals("Home"))
            windowsInstaller = new WindowsHomeInstaller();
        else if(operatingSystemVersion.equals("Professional"))
            windowsInstaller = new WindowsProfessionalInstaller();
        else
            windowsInstaller = null;
        return windowsInstaller;
    }
}
