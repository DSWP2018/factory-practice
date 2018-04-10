package com.iteso.factory.installerpackages;

public class MacOSInstallerPackage implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("MacOS installer executing...");
    }

    @Override
    public void decode() {
        System.out.println("MacOS installer decoding...");
    }

    @Override
    public void extract() {
        System.out.println("MacOS installer extracting...");
    }

    @Override
    public void encode() {
        System.out.println("MacOS installer encoding...");
    }

}
