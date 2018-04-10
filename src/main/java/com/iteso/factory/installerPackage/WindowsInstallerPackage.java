package com.iteso.factory.installerPackage;

import com.iteso.factory.InstallerPackage;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Executing Windows Installer Package");
    }

    @Override
    public void decode() {
        System.out.println("Decoding Windows Installer Package");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Windows Installer Package");
    }

    @Override
    public void encode() {
        System.out.println("Encoding Windows Installer Package");
    }
}
