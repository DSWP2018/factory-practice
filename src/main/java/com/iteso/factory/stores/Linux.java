package com.iteso.factory.stores;

import com.iteso.factory.Constants;
import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class Linux extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("Linux");

        if(operatingSystemVersion.equals(Constants.FREE)) {
            return new LinuxFree();
        }
        else if (operatingSystemVersion.equals(Constants.HOME)) {
            return new LinuxHome();
        }
        else if (operatingSystemVersion.equals(Constants.PROFESSIONAL)){
            return new LinuxProfessional();
        }
        else return null;
    }
}
