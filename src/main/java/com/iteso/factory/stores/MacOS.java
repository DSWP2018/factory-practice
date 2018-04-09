package com.iteso.factory.stores;

import com.iteso.factory.Constants;
import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class MacOS extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        setTargetOS("MacOS");
        if(operatingSystemVersion.equals(Constants.FREE)) {
            return new MacOSFree();
        }
        else if (operatingSystemVersion.equals(Constants.HOME)) {
            return new MacOSHome();
        }
        else if (operatingSystemVersion.equals(Constants.PROFESSIONAL)){
            return new MacOSProfessional();
        }
        else return null;
    }
}
