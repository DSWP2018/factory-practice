package com.iteso.factory.installers.linux;

import com.iteso.factory.Installer;
import com.iteso.factory.installerpackages.InstallerPackage;
import com.iteso.factory.installerpackages.LinuxInstallerPackage;

public class LinuxFreeInstaller extends Installer {
    public LinuxFreeInstaller() { name = "Linux free installer"; }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
