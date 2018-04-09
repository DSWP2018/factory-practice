package com.iteso.factory;

import com.iteso.factory.installers.LinuxFree;
import com.iteso.factory.installers.LinuxHome;
import com.iteso.factory.installers.LinuxProfessional;

public class LinuxFactory extends DownloadFactory{

    @Override
    protected Installer createInstallerPackage(String OSVersion) {
        Installer installer = null;

        if (OSVersion.equals("Free")) installer = new LinuxFree();
        else if (OSVersion.equals("Home")) installer = new LinuxHome();
        else if (OSVersion.equals("Professional")) installer = new LinuxProfessional();

        return installer;
    }
}
