package com.iteso.factory.installers.windows;

import com.iteso.factory.Installer;
import com.iteso.factory.installerpackages.InstallerPackage;
import com.iteso.factory.installerpackages.WindowsInstallerPackage;

public class WindowsProfessionalInstaller extends Installer {
    public WindowsProfessionalInstaller() { name = "Windows professional installer"; }

    @Override
    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
