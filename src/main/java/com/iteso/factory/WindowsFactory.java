package com.iteso.factory;

import com.iteso.factory.installers.*;

public class WindowsFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        Installer installer ;
        if(operatingSystemVersion.equals("Free"))
            installer=new WindowsFree();
        if(operatingSystemVersion.equals("Home"))
            installer=new WindowsHome();
        else
            installer=new WindowsProfessional();
        return installer;
    }
}
