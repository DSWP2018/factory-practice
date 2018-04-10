package com.iteso.factory.installerPackage;

import com.iteso.factory.InstallerPackage;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Executing Windows Installer Package";
    }

    @Override
    public String decode() {
        return  "Decoding Windows Installer Package";
    }

    @Override
    public String extract() {
        return "Extracting Windows Installer Package";
    }

    @Override
    public String encode() {
        return "Encoding Windows Installer Package";
    }
}
