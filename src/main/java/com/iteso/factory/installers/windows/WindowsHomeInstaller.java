package com.iteso.factory.installers.windows;

import com.iteso.factory.Installer;
import com.iteso.factory.installerpackages.InstallerPackage;
import com.iteso.factory.installerpackages.WindowsInstallerPackage;

public class WindowsHomeInstaller extends Installer {
    public WindowsHomeInstaller() { name = "Windows home installer"; }

    @Override
    public InstallerPackage getPackage() {
        return new WindowsInstallerPackage();
    }
}
