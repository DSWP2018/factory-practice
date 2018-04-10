package com.iteso.factory.stores;

import com.iteso.factory.installers.Installer;
import com.iteso.factory.installers.LinuxFreeInstaller;
import com.iteso.factory.installers.LinuxHomeInstaller;
import com.iteso.factory.installers.LinuxProfessionalInstaller;

public class LinuxStore extends DownloadFactory{

    public LinuxStore(){
        setTargetOS("Linux");
    }

	@Override
	protected Installer createInstallerPackage(String operatingSystemVersion) {
		switch(operatingSystemVersion) {
			case "Free":
				return new LinuxFreeInstaller();

			case "Home":
				return new LinuxHomeInstaller();

			case "Professional":
				return new LinuxProfessionalInstaller();

			default:
				return null;
		}
	}

}