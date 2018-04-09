package com.iteso.factory;

import com.iteso.factory.installers.*;

public class MacOSFactory extends DownloadFactory{

    @Override
    protected Installer createInstallerPackage(String OSVersion) {
        Installer installer = null;

        if (OSVersion.equals("Free")) installer = new MacFree();
        else if (OSVersion.equals("Home")) installer = new MacHome();
        else if (OSVersion.equals("Professional")) installer = new MacProfessional();

        return installer;
    }
}
