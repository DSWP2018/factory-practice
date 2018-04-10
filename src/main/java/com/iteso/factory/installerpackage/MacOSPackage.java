package com.iteso.factory.installerpackage;

import com.iteso.factory.InstallerPackage;

public class MacOSPackage implements InstallerPackage{
    @Override
    public void execute() {
        System.out.println("Executing for MacOS");
    }

    @Override
    public void decode() {
        System.out.println("Decoding for MacOS");
    }

    @Override
    public void extract() {
        System.out.println("Extracting for MacOS");
    }

    @Override
    public void encode() {
        System.out.println("Encoding for MacOS");
    }
}
