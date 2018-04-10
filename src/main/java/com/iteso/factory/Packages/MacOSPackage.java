package com.iteso.factory.Packages;

import com.iteso.factory.InstallerPackage;

public class MacOSPackage implements InstallerPackage
{
    @Override
    public void execute() {
        System.out.println("MacOS se está ejecutando");
    }

    @Override
    public void decode() {
        System.out.println("Decoding MacOS");
    }

    @Override
    public void extract() {
        System.out.println("Extracting MacOS");
    }

    @Override
    public void encode() {
        System.out.println("MacOS se está codificando");
    }
}
