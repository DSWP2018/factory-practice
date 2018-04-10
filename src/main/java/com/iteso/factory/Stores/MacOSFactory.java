package com.iteso.factory.Stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.MacOSFreeInstaller;
import com.iteso.factory.installers.MacOSHomeInstaller;
import com.iteso.factory.installers.MacOSProfessionalInstaller;

public class MacOSFactory extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String OSVersion) {

        if(OSVersion.equals("Free")){
            return new MacOSFreeInstaller();
        }
        else if(OSVersion.equals("Home")){
            return new MacOSHomeInstaller();
        }
        else if(OSVersion.equals("Professional")){
            return new
                    MacOSProfessionalInstaller();
        }
        else return null;
    }

}
