package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.macos.FreeMacOS;
import com.iteso.factory.installers.macos.HomeMacOS;
import com.iteso.factory.installers.macos.ProfessionalMacOS;
import com.iteso.factory.installers.windows.WindowsFreeInstaller;
import com.iteso.factory.installers.windows.WindowsHomeInstaller;
import com.iteso.factory.installers.windows.WindowsProfessionalInstaller;

public class MacOSStore extends DownloadFactory {
    public MacOSStore() {
        setTargetOS("MacOS");
    }

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        switch (operatingSystemVersion) {
            case "free":
                return new FreeMacOS();
            case "home":
                return new HomeMacOS();
            case "professional":
                return new ProfessionalMacOS();
        }

        return null;
    }
}
