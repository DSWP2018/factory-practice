package com.iteso.factory;

public class LinuxInstaller implements InstallerPackage{
    @Override
    public void execute() {
        System.out.println("Executing 'Install.dev'");
    }

    @Override
    public void decode() {
        System.out.println("Decoding 'Install.dev'");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Linux in the HD");
    }

    @Override
    public void encode() {
        System.out.println("Ecoding OS");
    }
}
