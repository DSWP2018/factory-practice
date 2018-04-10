package com.iteso.factory.Packages;

import com.iteso.factory.InstallerPackage;

public class WindowsPackage implements InstallerPackage
{
    @Override
    public void execute() {
        System.out.println("Windows se está ejecutando");
    }

    @Override
    public void decode() {
        System.out.println("Decoding Windows");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Windows");
    }

    @Override
    public void encode() {
        System.out.println("Windows se está codificando");
    }
}
