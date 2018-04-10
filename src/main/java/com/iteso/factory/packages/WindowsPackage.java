package com.iteso.factory.packages;

import com.iteso.factory.InstallerPackage;

public class WindowsPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "I'm a Windows Package :)";
    }

    @Override
    public String decode() {
        return "I'm decoding for Windows...";
    }

    @Override
    public String extract() {
        return "I'm extracting for Windows...";
    }

    @Override
    public String encode() {
        return "I'm encoding for Windows...";
    }
}
