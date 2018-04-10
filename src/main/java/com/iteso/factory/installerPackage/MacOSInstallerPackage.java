package com.iteso.factory.installerPackage;

import com.iteso.factory.InstallerPackage;

public class MacOSInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Executing MacOS Installer Package");
    }

    @Override
    public void decode() {
        System.out.println("Decoding MacOS Installer Package");
    }

    @Override
    public void extract() {
        System.out.println("Extracting MacOS Installer Package");
    }

    @Override
    public void encode() {
        System.out.println("Encoding MacOS Installer Package");
    }
}
