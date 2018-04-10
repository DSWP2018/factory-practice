package com.iteso.factory.Factory;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.WindowsInstallerFree;
import com.iteso.factory.installers.WindowsInstallerHome;
import com.iteso.factory.installers.WindowsInstallerProfessional;

public class WindowsFactory extends DownloadFactory {
    final String factoryOS = "Windows";

    public WindowsFactory() {
        setTargetOS(factoryOS);
    }

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        switch (operatingSystemVersion) {
            case "Free":
                return new WindowsInstallerFree();
            case "Home":
                return new WindowsInstallerHome();
            case "Professional":
                return new WindowsInstallerProfessional();
            default:
                return null;
        }
    }
}
