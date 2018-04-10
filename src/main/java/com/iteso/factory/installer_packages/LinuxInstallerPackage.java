package com.iteso.factory.installer_packages;

import com.iteso.factory.InstallerPackage;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        String executeLinux = "Executing Linux";
        return executeLinux;
    }

    @Override
    public String decode() {
        String decodeLinux = "Decoding Linux";
        return decodeLinux;
    }

    @Override
    public String extract() {
        String extractLinux = "Extracting Linux";
        return extractLinux;
    }

    @Override
    public String encode() {
        String encodeLinux = "Encoding Linux";
        return encodeLinux;
    }
}
