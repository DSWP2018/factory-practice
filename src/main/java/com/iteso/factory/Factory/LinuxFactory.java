package com.iteso.factory.Factory;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.LinuxInstallerElementary;
import com.iteso.factory.installers.LinuxInstallerFedora;
import com.iteso.factory.installers.LinuxInstallerUbuntu;

public class LinuxFactory extends DownloadFactory {
    final String factoryOS = "Linux";

    public LinuxFactory(){
        setTargetOS(factoryOS);
    }
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        switch (operatingSystemVersion) {
            case "Ubuntu":
                return new LinuxInstallerUbuntu();
            case "Elementary":
                return new LinuxInstallerElementary();
            case "Fedora":
                return new LinuxInstallerFedora();
            default:
                return null;
        }
    }
}
