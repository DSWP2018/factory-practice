package com.iteso.factory.packages;
import com.iteso.factory.InstallerPackage;

public class LinuxPackage implements InstallerPackage{
    @Override
    public void execute(){
        System.out.println("Executing for Linux");
    }

    @Override
    public void decode(){
        System.out.println("Decoding for Linux");
    }

    @Override
    public void extract(){
        System.out.println("Extracting for Linux");
    }

    @Override
    public void encode(){
        System.out.println("Ecoding for Linux");
    }
}
