package com.iteso.factory.installers;

import com.iteso.factory.InstallerPackage;

public class Linux implements InstallerPackage {
    @Override
    public void execute() {
        System.out.println("Linux exec");
    }

    @Override
    public void decode() {
        System.out.println("Linux decode");
    }

    @Override
    public void extract() {
        System.out.println("Linux extract");
    }

    @Override
    public void encode() {
        System.out.println("Linux encode");
    }
}
