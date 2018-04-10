package com.iteso.factory.Store;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.FreeWindows;
import com.iteso.factory.installers.HomeWindows;
import com.iteso.factory.installers.ProfessionalWindows;

public class WindowsStore extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("Windows");
        if(operatingSystemVersion == "Free")
            return new FreeWindows();
        else if(operatingSystemVersion == "Home")
            return  new HomeWindows();
        else if(operatingSystemVersion == "Professional")
            return new ProfessionalWindows();
        else
            return null;
    }
}
