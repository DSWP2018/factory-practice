package com.iteso.factory.installers.linux;

import com.iteso.factory.Installer;
import com.iteso.factory.installerpackages.InstallerPackage;
import com.iteso.factory.installerpackages.LinuxInstallerPackage;

public class LinuxHomeInstaller extends Installer {
    public LinuxHomeInstaller() { name = "Linux home installer"; }

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
