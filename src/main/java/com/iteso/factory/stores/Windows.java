package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class Windows extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {

        switch (operatingSystemVersion) {
            case "Windows Free":
                setTargetOS("Windows Free");
                return new WindowsFree();
            case "Windows Home":
                setTargetOS("Windows Home");
                return new WindowsHome();
            case "Windows Professional":
                setTargetOS("Windows Professional");
                return new WindowsProfessional();
        }

        return null;
    }

}
