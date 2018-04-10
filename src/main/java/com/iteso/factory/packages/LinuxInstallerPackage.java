package com.iteso.factory.packages;

import com.iteso.factory.InstallerPackage;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Executing for Linux";
    }

    @Override
    public String decode() {
        return "Decoding for Linux";
    }

    @Override
    public String extract() {
        return "Extracting for Linux";
    }

    @Override
    public String encode() {
        return "Encoding for Linux";
    }
}
