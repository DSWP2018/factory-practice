package com.iteso.factory;

import com.iteso.factory.installers.*;

public class WindowsFactory extends DownloadFactory{

    @Override
    protected Installer createInstallerPackage(String OSVersion) {
        Installer installer = null;

        if (OSVersion.equals("Free")) installer = new WindowsFree();
        else if (OSVersion.equals("Home")) installer = new WindowsHome();
        else if (OSVersion.equals("Professional")) installer = new WindowsProfessional();

        return installer;
    }
}
