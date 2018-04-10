package com.iteso.factory;

import com.iteso.factory.installers.*;
public class LinuxFactory extends DownloadFactory {


        @Override
        protected Installer createInstallerPackage(String operatingSystemVersion) {
            Installer installer ;
            if(operatingSystemVersion.equals("Free"))
                installer=new LinuxFree();
            if(operatingSystemVersion.equals("Home"))
                installer=new LinuxHome();
            else
                installer=new LinuxProfessional();
            return installer;
        }

}
