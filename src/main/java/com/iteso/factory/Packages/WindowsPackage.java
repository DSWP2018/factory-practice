package com.iteso.factory.Packages;

import com.iteso.factory.InstallerPackage;

public class WindowsPackage implements InstallerPackage {
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
