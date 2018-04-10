package com.iteso.factory.packages;

import com.iteso.factory.InstallerPackage;

public class MacOSPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "I'm a MacOS Package :)";
    }

    @Override
    public String decode() {
        return "I'm decoding for MacOS...";
    }

    @Override
    public String extract() {
        return "I'm extracting for MacOS...";
    }

    @Override
    public String encode() {
        return "I'm encoding for MacOS...";
    }
}
