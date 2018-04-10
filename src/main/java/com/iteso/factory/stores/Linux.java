package com.iteso.factory.stores;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;

public class Linux extends DownloadFactory{
    @Override
    protected Installer createInstallerPackage(String operatingSystem) {
        return null;
    }
}
