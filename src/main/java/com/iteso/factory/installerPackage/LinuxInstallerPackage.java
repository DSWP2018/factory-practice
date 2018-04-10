package com.iteso.factory.installerPackage;

import com.iteso.factory.InstallerPackage;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Executing Linux Installer Package");
    }

    @Override
    public void decode() {
        System.out.println("Decoding Linux Installer Package");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Linux Installer Package");
    }

    @Override
    public void encode() {
        System.out.println("Encoding Linux Installer Package");
    }
}
