package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;

public class MacOS extends DownloadFactory {

    @Override
    protected Installer createInstallerPackage(String operatingSystemVersion) {

        switch (operatingSystemVersion) {
            case "MacOS Free":
                setTargetOS("MacOS Free");
                return new MacosFree();
            case "MacOS Home":
                setTargetOS("MacOS Home");
                return new MacosHome();
            case "MacOS Professional":
                setTargetOS("MacOS Professional");
                return new MacosProfessional();
        }

        return null;
    }

}
