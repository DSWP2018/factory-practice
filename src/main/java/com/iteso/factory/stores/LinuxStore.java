package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.linux.LinuxFreeInstaller;
import com.iteso.factory.installers.linux.LinuxHomeInstaller;
import com.iteso.factory.installers.linux.LinuxProfessionalInstaller;

public class LinuxStore extends DownloadFactory {
    public LinuxStore() {
        setTargetOS("Linux");
    }

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        switch (operatingSystemVersion) {
            case "free":
                return new LinuxFreeInstaller();
            case "home":
                return new LinuxHomeInstaller();
            case "professional":
                return new LinuxProfessionalInstaller();
        }

        return null;
    }
}
