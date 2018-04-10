package com.iteso.factory.installers.installerpackages;

public class LinuxPackage implements InstallerPackage{

	@Override
	public void execute() {
		System.out.println("Executing bin");
	}

	@Override
	public void decode() {
		System.out.println("Decoding Linux");
	}

	@Override
	public void extract() {
		System.out.println("Extracting tar.gz");
	}

	@Override
	public void encode() {
		System.out.println("Encoding Linux");
	}

}