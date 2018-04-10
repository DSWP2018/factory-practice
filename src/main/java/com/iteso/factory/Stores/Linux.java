package com.iteso.factory.Stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.LinuxFree;
import com.iteso.factory.installers.LinuxHome;
import com.iteso.factory.installers.LinuxProfessional;

public class Linux extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("Linux");
        if(operatingSystemVersion == "LinuxFree")
            return new LinuxFree();
        else if(operatingSystemVersion == "LinuxHome")
            return  new LinuxHome();
        else if(operatingSystemVersion == "LinuxProfessional")
            return new LinuxProfessional();
        else
            return null;
    }
}
