package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installers.*;

public class Linux extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {

        switch (operatingSystemVersion) {
            case "Linux Free":
                setTargetOS("Linux Free");
                return new LinuxFree();
            case "Linux Home":
                setTargetOS("Linux Home");
                return new LinuxHome();
            case "Linux Professional":
                setTargetOS("Linux Professional");
                return new LinuxProfessional();
        }

        return null;
    }

}
