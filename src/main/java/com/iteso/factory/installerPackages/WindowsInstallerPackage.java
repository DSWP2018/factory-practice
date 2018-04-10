package com.iteso.factory.installerPackages;

import com.iteso.factory.InstallerPackage;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "executing Windows";
    }

    @Override
    public String decode() {

        return "decoding Windows";
    }

    @Override
    public String extract() {
        return "extract Windows";
    }

    @Override
    public String encode() {
        return "encode Windows";
    }
}
