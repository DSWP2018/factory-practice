package com.iteso.factory;

public class FactoryMain {
    public static void main(String[] args) {
        WindowsFactory windowsFactory = new WindowsFactory();
        MacFactory macFactory = new MacFactory();
        LinuxFactory linuxFactory = new LinuxFactory();

        System.out.println("=========WINDOWS=========");
        Installer windows = windowsFactory.getOs("Windows Home");
        windows.getName();
        windowsFactory.execute();
        windowsFactory.decode();
        windowsFactory.extract();
        windowsFactory.encode();
        windows = windowsFactory.getOs("Windows Professional");
        windows.getName();
        windowsFactory.execute();
        windowsFactory.decode();
        windowsFactory.extract();
        windowsFactory.encode();
        windows = windowsFactory.getOs("Windows Free");
        windows.getName();
        windowsFactory.execute();
        windowsFactory.decode();
        windowsFactory.extract();
        windowsFactory.encode();
        System.out.println("=========MAC=========");
        Installer mac = macFactory.getOs("Mac Home");
        mac.getName();
        macFactory.execute();
        macFactory.decode();
        macFactory.extract();
        macFactory.encode();
        mac = macFactory.getOs("Mac Professional");
        mac.getName();
        macFactory.execute();
        macFactory.decode();
        macFactory.extract();
        macFactory.encode();
        mac = macFactory.getOs("Mac Free");
        mac.getName();
        macFactory.execute();
        macFactory.decode();
        macFactory.extract();
        macFactory.encode();
        System.out.println("=========AMAZING LINUX=========");
        Installer linux = linuxFactory.getOs("Linux Home");
        linux.getName();
        linuxFactory.execute();
        linuxFactory.decode();
        linuxFactory.extract();
        linuxFactory.encode();
        linux = linuxFactory.getOs("Linux Professional");
        linux.getName();
        linuxFactory.execute();
        linuxFactory.decode();
        linuxFactory.extract();
        linuxFactory.encode();
        linux = linuxFactory.getOs("Linux Free");
        linux.getName();
        linuxFactory.execute();
        linuxFactory.decode();
        linuxFactory.extract();
        linuxFactory.encode();

    }
}
