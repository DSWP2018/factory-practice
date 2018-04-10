package com.iteso.factory.installers;

import com.iteso.factory.InstallerPackage;

public class Windows implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Windows exec");
    }

    @Override
    public void decode() {
        System.out.println("Windows decode");
    }

    @Override
    public void extract() {
        System.out.println("Windows extract");
    }

    @Override
    public void encode() {
        System.out.println("Windows encode");
    }
}
