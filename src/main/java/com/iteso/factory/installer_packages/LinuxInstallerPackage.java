package com.iteso.factory.installer_packages;

import com.iteso.factory.InstallerPackage;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Executing Linux");
    }

    @Override
    public void decode() {
        System.out.println("Decoding Linux");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Linux");
    }

    @Override
    public void encode() {
        System.out.println("Encoding Linux");
    }
}
