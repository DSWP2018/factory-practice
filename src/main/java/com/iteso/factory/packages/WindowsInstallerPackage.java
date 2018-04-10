package com.iteso.factory.packages;

import com.iteso.factory.InstallerPackage;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Executing for Windows";
    }

    @Override
    public String decode() {
        return "Decoding for Windows";
    }

    @Override
    public String extract() {
        return "Extracting for Windows";
    }

    @Override
    public String encode() {
        return "Encoding for Windows";
    }
}
