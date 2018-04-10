package com.iteso.factory.Stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.WindowsFree;
import com.iteso.factory.installers.WindowsHome;
import com.iteso.factory.installers.WindowsProfessional;

public class Windows extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("Windows");
        if(operatingSystemVersion == "Free")
            return new WindowsFree();
        else if(operatingSystemVersion == "Home")
            return  new WindowsHome();
        else if(operatingSystemVersion == "WindowsProfessional")
            return new WindowsProfessional();
        else
            return null;
    }
}
