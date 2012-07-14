package com.tfnico.examples.building.methone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Methone {

	@Override
	public String toString() {
		return "methone";
	}

	public String getVersion() {
		String file = getClass().getClassLoader().getResource("version.properties").getFile();
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fileInputStream);
			return props.getProperty("version");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
