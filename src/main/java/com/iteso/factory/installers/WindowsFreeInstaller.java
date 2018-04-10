package com.iteso.factory.installers;

import com.iteso.factory.installers.installerpackages.InstallerPackage;
import com.iteso.factory.installers.installerpackages.WindowsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsFreeInstaller extends Installer {
    public WindowsFreeInstaller(){
        name = "Windows Free Installer";
    }

    public InstallerPackage getPackage() {
        WindowsPackage windowsPackage = new WindowsPackage();
		return windowsPackage;
    }
}
