package com.iteso.factory;

public class MacInstaller implements InstallerPackage{
    @Override
    public void execute() {
        System.out.println("Executing 'Install.dmg'");
    }

    @Override
    public void decode() {
        System.out.println("Decoding 'Install.dmg'");
    }

    @Override
    public void extract() {
        System.out.println("Extracting MacOS High Sierra in the HD");
    }

    @Override
    public void encode() {
        System.out.println("Ecoding OS");
    }
}
