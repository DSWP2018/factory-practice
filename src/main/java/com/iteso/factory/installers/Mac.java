package com.iteso.factory.installers;

import com.iteso.factory.InstallerPackage;

public class Mac implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Mac exec");
    }

    @Override
    public void decode() {
        System.out.println("Mac decode");
    }

    @Override
    public void extract() {
        System.out.println("Mac extract");
    }

    @Override
    public void encode() {
        System.out.println("Mac encode");
    }
}
