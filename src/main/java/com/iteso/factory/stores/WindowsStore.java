package com.iteso.factory.stores;

import com.iteso.factory.installers.Installer;
import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfessionalInstaller;

public class WindowsStore extends DownloadFactory{

    public WindowsStore(){
        setTargetOS("Windows");
    }

	@Override
	protected Installer createInstallerPackage(String operatingSystemVersion) {
		switch(operatingSystemVersion) {
			case "Free":
				return new WindowsFreeInstaller();

			case "Home":
				return new WindowsHomeInstaller();

			case "Professional":
				return new WindowsProfessionalInstaller();

			default:
				return null;
		}
	}

}