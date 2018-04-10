package com.iteso.factory.installerpackages;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Linux installer executing...");
    }

    @Override
    public void decode() {
        System.out.println("Linux installer decoding...");
    }

    @Override
    public void extract() {
        System.out.println("Linux installer extracting...");
    }

    @Override
    public void encode() {
        System.out.println("Linux installer encoding...");
    }
}
