package com.iteso.factory.installerPackage;

import com.iteso.factory.InstallerPackage;

public class MacOSInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Executing MacOS Installer Package";
    }

    @Override
    public String decode() {
        return "Decoding MacOS Installer Package";
    }

    @Override
    public String extract() {
        return "Extracting MacOS Installer Package";
    }

    @Override
    public String encode() {
        return "Encoding MacOS Installer Package";
    }
}
