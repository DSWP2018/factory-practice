package com.iteso.factory.Store;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.FreeMacOS;
import com.iteso.factory.installers.HomeMacOS;
import com.iteso.factory.installers.ProfessionalMacOS;
import com.iteso.factory.installers.ProfessionalWindows;

public class MacOS extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("MacOS");
        if(operatingSystemVersion == "Free")
            return new FreeMacOS();
        else if(operatingSystemVersion == "Home")
            return new HomeMacOS();
        else if(operatingSystemVersion == "ProfessionalLinux")
            return new ProfessionalMacOS();
        else
            return null;
    }
}
