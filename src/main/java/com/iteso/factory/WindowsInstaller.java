package com.iteso.factory;

public class WindowsInstaller implements InstallerPackage{
    @Override
    public void execute() {
        System.out.println("Executing 'Install.exe'");
    }

    @Override
    public void decode() {
        System.out.println("Decoding 'Install.exe'");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Windows in the HD");
    }

    @Override
    public void encode() {
        System.out.println("Ecoding OS");
    }
}
