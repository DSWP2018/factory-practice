package com.iteso.factory;

public class MacOSInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Execute for MacOS");
    }

    @Override
    public void decode() {
        System.out.println("Decode for MacOS");
    }

    @Override
    public void extract() {
        System.out.println("Extract for MacOS");
    }

    @Override
    public void encode() {
        System.out.println("Encode for MacOS");
    }
}
