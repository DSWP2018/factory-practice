package com.iteso.factory.installerpackage;

import com.iteso.factory.InstallerPackage;

public class WindowsPackage implements InstallerPackage{
    @Override
    public void execute() {
        System.out.println("Executing for Windows");
    }

    @Override
    public void decode() {
        System.out.println("Decoding for Windows");
    }

    @Override
    public void extract() {
        System.out.println("Extracting for Windows");
    }

    @Override
    public void encode() {
        System.out.println("Encoding for Windows");
    }
}
