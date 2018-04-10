package com.iteso.factory.installers;

import com.iteso.factory.installers.installerpackages.InstallerPackage;
import com.iteso.factory.installers.installerpackages.WindowsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsHomeInstaller extends Installer {
    public WindowsHomeInstaller(){
        name = "Windows Home Installer";
    }

    public InstallerPackage getPackage() {
        WindowsPackage windowsPackage = new WindowsPackage();
		return windowsPackage;
    }
}
