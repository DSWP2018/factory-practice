package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.FreeWindowsInstaller;
import com.iteso.factory.installers.HomeWindowsInstaller;
import com.iteso.factory.installers.ProfessionalWindowsInstaller;

public class WindowsFactory  extends DownloadFactory{

    final String factoryOS = "Windows";
    @Override
    protected Installer createInstallerPackage(String operatingSystem) {
        switch (operatingSystem){
            case "Free":
                return  new FreeWindowsInstaller();
            case "Home":
                return new HomeWindowsInstaller();
            case "Professional":
                return new ProfessionalWindowsInstaller();
            default:
                return null;
        }
    }
}
