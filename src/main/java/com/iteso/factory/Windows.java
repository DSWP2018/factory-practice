package com.iteso.factory;

import com.iteso.factory.installers.*;

public class Windows extends DownloadFactory {
    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion.equals("Free Windows")){
            return new WFreeInstaller();
        }else if(operatingSystemVersion.equals("Home Windows")){
            return new WHomeInstaller();
        }else{
            return new WProfessionalInstaller();
        }
    }
}
