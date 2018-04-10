package com.iteso.factory;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Execute for Windows");
    }

    @Override
    public void decode() {
        System.out.println("Decode for Windows");
    }

    @Override
    public void extract() {
        System.out.println("Extract for Windows");
    }

    @Override
    public void encode() {
        System.out.println("Encode for Windows");
    }
}
