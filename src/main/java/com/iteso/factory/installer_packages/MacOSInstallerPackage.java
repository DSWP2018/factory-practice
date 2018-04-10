package com.iteso.factory.installer_packages;

import com.iteso.factory.InstallerPackage;

public class MacOSInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Executing MacOS");
    }

    @Override
    public void decode() {
        System.out.println("Decoding MacOS");
    }

    @Override
    public void extract() {
        System.out.println("Extracting MacOS");
    }

    @Override
    public void encode() {
        System.out.println("Encoding MacOS");
    }
}
