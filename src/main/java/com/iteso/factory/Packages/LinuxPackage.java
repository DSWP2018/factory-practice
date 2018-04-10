package com.iteso.factory.Packages;

import com.iteso.factory.InstallerPackage;

public class LinuxPackage implements InstallerPackage
{
    @Override
    public void execute() {
        System.out.println("Linux se está ejecutando");
    }

    @Override
    public void decode() {
        System.out.println("Decoding Linux");
    }

    @Override
    public void extract() {
        System.out.println("Extracting Linux");
    }

    @Override
    public void encode() {
        System.out.println("Linux se está codificando");
    }
}
