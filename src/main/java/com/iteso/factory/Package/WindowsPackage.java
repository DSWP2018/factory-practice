package com.iteso.factory.Package;

import com.iteso.factory.InstallerPackage;

public class WindowsPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "executeando Windows";
    }

    @Override
    public void decode() {
        System.out.println("decodificando Windows");
    }

    @Override
    public void extract() {
        System.out.println("extrayendo Windows");
    }

    @Override
    public void encode() {
        System.out.println("codificando Windows");
    }
}
