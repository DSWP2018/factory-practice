package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class LinuxFactory extends DownloadFactory{

    final String factoryOS = "Linux";
    @Override
    protected Installer createInstallerPackage(String operatingSystem) {
        switch (operatingSystem){
            case "Free":
                return  new FreeLinuxInstaller();
            case "Home":
                return new HomeLinuxInstaller();
            case "Professional":
                return new ProfessionalLinuxInstaller();
            default:
                return null;
        }
    }
}
