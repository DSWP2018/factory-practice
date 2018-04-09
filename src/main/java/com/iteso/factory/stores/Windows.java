package com.iteso.factory.stores;

import com.iteso.factory.Constants;
import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.WindowsFree;
import com.iteso.factory.installers.WindowsHome;
import com.iteso.factory.installers.WindowsProfessional;

public class Windows extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("Windows");

        if(operatingSystemVersion.equals(Constants.FREE)){
            return new WindowsFree();
        }
        else if (operatingSystemVersion.equals(Constants.HOME)) {
            return new WindowsHome();
        }
        else if (operatingSystemVersion.equals(Constants.PROFESSIONAL)){
            return new WindowsProfessional();
        }
        else return null;
    }
}
