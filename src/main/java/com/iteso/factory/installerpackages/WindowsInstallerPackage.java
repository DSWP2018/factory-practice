package com.iteso.factory.installerpackages;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Windows installer executing...");
    }

    @Override
    public void decode() {
        System.out.println("Windows installer decoding...");
    }

    @Override
    public void extract() {
        System.out.println("Windows installer extracting...");
    }

    @Override
    public void encode() {
        System.out.println("Windows installer encoding...");
    }
}
