package com.iteso.factory.installers.linux;

import com.iteso.factory.Installer;
import com.iteso.factory.installerpackages.InstallerPackage;
import com.iteso.factory.installerpackages.LinuxInstallerPackage;

public class LinuxProfessionalInstaller extends Installer {
    public LinuxProfessionalInstaller() { name = "Linux professional installer";}

    @Override
    public InstallerPackage getPackage() {
        return new LinuxInstallerPackage();
    }
}
