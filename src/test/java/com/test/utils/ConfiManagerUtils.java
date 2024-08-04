package com.test.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfiManagerUtils {


	static String configFileName = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\config.properties";
	private static Properties prop;

	public static void loadProperties() {
		prop = new Properties();

		try {

			InputStream inputStream = new FileInputStream(configFileName);
			prop.load(inputStream);
			inputStream.close();

		} catch (IOException ex) {

		}

	}

	public static String getProperty(String propertName) {

		loadProperties();
		return prop.getProperty(propertName);

	}

}
