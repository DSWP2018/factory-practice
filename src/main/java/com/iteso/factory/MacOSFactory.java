package com.iteso.factory;
import com.iteso.factory.installers.*;

public class MacOSFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        Installer installer ;
        if(operatingSystemVersion.equals("Free"))
            installer=new MacOSFree();
        if(operatingSystemVersion.equals("Home"))
            installer=new MacOSHome();
        else
            installer=new MacOSProfessional();
        return installer;
    }
}
