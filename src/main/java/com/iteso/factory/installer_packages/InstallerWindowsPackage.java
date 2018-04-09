package com.iteso.factory.installer_packages;

import com.iteso.factory.InstallerPackage;

public class InstallerWindowsPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Executing Windows");
    }

    @Override
    public void decode() {
        System.out.println("Decoding Windows");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Windows");
    }

    @Override
    public void encode() {
        System.out.println("Encoding Windows");
    }
}
