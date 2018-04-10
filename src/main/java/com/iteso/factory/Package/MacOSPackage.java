package com.iteso.factory.Package;

import com.iteso.factory.InstallerPackage;

public class MacOSPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "executeando MacOS";
    }

    @Override
    public void decode() {
        System.out.println("decodificando MacOS");
    }

    @Override
    public void extract() {
        System.out.println("extrayendo MacOS");
    }

    @Override
    public void encode() {
        System.out.println("codificando MacOS");
    }
}
