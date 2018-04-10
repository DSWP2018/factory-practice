package com.iteso.factory.packages;

import com.iteso.factory.InstallerPackage;

public class LinuxPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "I'm a Linux Package :)";
    }

    @Override
    public String decode() {
        return "I'm decoding for Linux...";
    }

    @Override
    public String extract() {
        return "I'm extracting for Linux...";
    }

    @Override
    public String encode() {
        return "I'm encoding for Linux...";
    }
}
