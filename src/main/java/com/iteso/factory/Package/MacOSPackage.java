package com.iteso.factory.Package;

import com.iteso.factory.InstallerPackage;

public class MacOSPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "executeando MacOSStore";
    }

    @Override
    public void decode() {
        System.out.println("decodificando MacOSStore");
    }

    @Override
    public void extract() {
        System.out.println("extrayendo MacOSStore");
    }

    @Override
    public void encode() {
        System.out.println("codificando MacOSStore");
    }
}
