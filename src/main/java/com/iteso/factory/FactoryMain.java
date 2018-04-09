package com.iteso.factory;

public class FactoryMain {
    public static void main(String[] args) {
        WindowsFactory windowsFactory = new WindowsFactory();
        MacFactory macFactory = new MacFactory();
        LinuxFactory linuxFactory = new LinuxFactory();

        Installer windows = windowsFactory.getOs("Windows Home");
        windows.getName();
        windows = windowsFactory.getOs("Windows Professional");
        windows.getName();
        windows = windowsFactory.getOs("Windows Free");
        windows.getName();
    }
}
