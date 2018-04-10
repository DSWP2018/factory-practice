package com.iteso.factory.installers.macos;

import com.iteso.factory.Installer;
import com.iteso.factory.installerpackages.InstallerPackage;
import com.iteso.factory.installerpackages.MacOSInstallerPackage;

public class ProfessionalMacOS extends Installer{
    public ProfessionalMacOS() { name = "Profeddional MacOS installer"; }

    @Override
    public InstallerPackage getPackage() {
        return new MacOSInstallerPackage();
    }
}
