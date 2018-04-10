package com.iteso.factory.installerPackages;

import com.iteso.factory.InstallerPackage;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "executing Linux";
    }

    @Override
    public String decode() {

        return "decoding Linux";
    }

    @Override
    public String extract() {
        return "extract Linux";
    }

    @Override
    public String encode() {
        return "encode Linux";
    }
}
