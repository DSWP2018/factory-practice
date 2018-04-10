package com.iteso.factory.Stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.MacOSFree;
import com.iteso.factory.installers.MacOSHome;
import com.iteso.factory.installers.MacOSProfessional;

public class MacOS extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("MacOS");
        if(operatingSystemVersion == "Free")
            return new MacOSFree();
        else if(operatingSystemVersion == "Home")
            return new MacOSHome();
        else if(operatingSystemVersion == "MacOSProfessional")
            return new MacOSProfessional();
        else
            return null;
    }
}
