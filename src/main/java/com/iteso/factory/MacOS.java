package com.iteso.factory;

import com.iteso.factory.installers.*;

public class MacOS extends DownloadFactory{

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {
        if(operatingSystemVersion.equals("Free MacOS")){
            return new MFreeInstaller();
        }else if(operatingSystemVersion.equals("Home MacOS")){
            return new MHomeInstaller();
        }else{
            return new MProfessionalInstaller();
        }
    }
}
