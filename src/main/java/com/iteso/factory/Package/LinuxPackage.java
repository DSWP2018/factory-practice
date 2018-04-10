package com.iteso.factory.Package;

import com.iteso.factory.InstallerPackage;

public class LinuxPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "executeando Linux";
    }

    @Override
    public void decode() {
        System.out.println("decodificando Linux");
    }

    @Override
    public void extract() {
        System.out.println("extrayendo Linux");
    }

    @Override
    public void encode() {
        System.out.println("codificando Linux");
    }
}
