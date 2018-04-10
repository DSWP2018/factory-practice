package com.iteso.factory.installerPackage;

import com.iteso.factory.InstallerPackage;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Executing Linux Installer Package";
    }

    @Override
    public String decode() {
        return "Decoding Linux Installer Package";
    }

    @Override
    public String extract() {
        return "Extracting Linux Installer Package";
    }

    @Override
    public String  encode() {
        return "Encoding Linux Installer Package";
    }
}
