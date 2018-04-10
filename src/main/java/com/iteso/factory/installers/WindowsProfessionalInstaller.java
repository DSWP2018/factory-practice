package com.iteso.factory.installers;

import com.iteso.factory.installers.installerpackages.InstallerPackage;
import com.iteso.factory.installers.installerpackages.WindowsPackage;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class WindowsProfessionalInstaller extends Installer {
    public WindowsProfessionalInstaller(){
        name = "Windows Professional Installer";
    }

    public InstallerPackage getPackage() {
        WindowsPackage windowsPackage = new WindowsPackage();
		return windowsPackage;
    }
}
