package com.iteso.factory.installer_packages;

import com.iteso.factory.InstallerPackage;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        String executeWindows = "Executing Windows";
        return executeWindows;
    }

    @Override
    public String decode() {
        String decodeWindows = "Decoding Windows";
        return decodeWindows;
    }

    @Override
    public String extract() {
        String extractWindows = "Extracting Windows";
        return extractWindows;
    }

    @Override
    public String encode() {
        String encodeWindows = "Encoding Windows";
        return encodeWindows;
    }
}
