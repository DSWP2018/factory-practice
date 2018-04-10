package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.windows.WindowsFreeInstaller;
import com.iteso.factory.installers.windows.WindowsHomeInstaller;
import com.iteso.factory.installers.windows.WindowsProfessionalInstaller;

public class WindowsStore extends DownloadFactory {
    public WindowsStore() {
        setTargetOS("Windows");
    }

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        switch (operatingSystemVersion) {
            case "free":
                return new WindowsFreeInstaller();
            case "home":
                return new WindowsHomeInstaller();
            case "professional":
                return new WindowsProfessionalInstaller();
        }

        return null;
    }
}
