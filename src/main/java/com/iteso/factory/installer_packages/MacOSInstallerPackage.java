package com.iteso.factory.installer_packages;

import com.iteso.factory.InstallerPackage;

public class MacOSInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        String executeMacOS = "Executing MacOS";
        return executeMacOS;
    }

    @Override
    public String decode() {
        String decodeMacOS = "Decoding MacOS";
        return decodeMacOS;
    }

    @Override
    public String extract() {
        String extractMacOS = "Extracting MacOS";
        return extractMacOS;
    }

    @Override
    public String encode() {
        String encodeMacOS = "Encoding MacOS";
        return encodeMacOS;
    }
}
