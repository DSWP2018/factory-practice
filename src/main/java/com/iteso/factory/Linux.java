package com.iteso.factory;

import com.iteso.factory.installers.LFreeInstaller;
import com.iteso.factory.installers.LHomeInstaller;
import com.iteso.factory.installers.LProfessionalInstaller;

public class Linux extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion.equals("Free Linux")){
            return new LFreeInstaller();
        }else if(operatingSystemVersion.equals("Home Linux")){
            return new LHomeInstaller();
        }else{
            return new LProfessionalInstaller();
        }
    }
}
