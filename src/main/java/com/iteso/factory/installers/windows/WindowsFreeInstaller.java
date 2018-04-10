package com.iteso.factory.installers.windows;

import com.iteso.factory.Installer;
import com.iteso.factory.installerpackages.InstallerPackage;
import com.iteso.factory.installerpackages.WindowsInstallerPackage;

public class WindowsFreeInstaller extends Installer {
    public WindowsFreeInstaller() { name = "Windows free installer"; }

    @Override
    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
