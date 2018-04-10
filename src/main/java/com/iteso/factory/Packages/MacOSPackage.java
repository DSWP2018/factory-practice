package com.iteso.factory.Packages;

import com.iteso.factory.InstallerPackage;

public class MacOSPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Executing for MacOS";
    }

    @Override
    public String decode() {
        return "Decoding for MacOS";
    }

    @Override
    public String extract() {
        return "Extracting for MacOS";
    }

    @Override
    public String encode() {
        return "Encoding for MacOS";
    }
}
