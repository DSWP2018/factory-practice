package com.iteso.factory.stores;

import com.iteso.factory.installers.Installer;
import com.iteso.factory.installers.MacOSFreeInstaller;
import com.iteso.factory.installers.MacOSHomeInstaller;
import com.iteso.factory.installers.MacOSProfessionalInstaller;

public class MacOSStore extends DownloadFactory{

    public MacOSStore(){
        setTargetOS("MacOS");
    }

	@Override
	protected Installer createInstallerPackage(String operatingSystemVersion) {
		switch(operatingSystemVersion) {
			case "Free":
				return new MacOSFreeInstaller();

			case "Home":
				return new MacOSHomeInstaller();

			case "Professional":
				return new MacOSProfessionalInstaller();

			default:
				return null;
		}
	}

}