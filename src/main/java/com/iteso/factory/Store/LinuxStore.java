package com.iteso.factory.Store;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.FreeLinux;
import com.iteso.factory.installers.HomeLinux;
import com.iteso.factory.installers.ProfessionalLinux;

public class LinuxStore extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("Linux");
        if(operatingSystemVersion == "Free")
        return new FreeLinux();
        else if(operatingSystemVersion == "Home")
            return  new HomeLinux();
        else if(operatingSystemVersion == "ProfessionalLinux")
            return new ProfessionalLinux();
        else
        return null;
    }
}
