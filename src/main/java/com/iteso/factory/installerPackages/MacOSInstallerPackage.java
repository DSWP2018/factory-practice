package com.iteso.factory.installerPackages;

import com.iteso.factory.InstallerPackage;

public class MacOSInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "executing MacOS";
    }

    @Override
    public String decode() {

        return "decoding MacOS";
    }

    @Override
    public String extract() {
        return "extract MacOS";
    }

    @Override
    public String encode() {
        return "encode MacOS";
    }
}
