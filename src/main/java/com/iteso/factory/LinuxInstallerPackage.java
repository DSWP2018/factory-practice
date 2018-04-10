package com.iteso.factory;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Execute for Linux");
    }

    @Override
    public void decode() {
        System.out.println("Decode for Linux");
    }

    @Override
    public void extract() {
        System.out.println("Extract for Linux");
    }

    @Override
    public void encode() {
        System.out.println("Encode for Linux");
    }
}
