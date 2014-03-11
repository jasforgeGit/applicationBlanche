package sn.com.douane.utils;

import java.io.InputStream;
import java.util.Properties;

public class GaindePropertiesReader {
	private static GaindePropertiesReader instance = null;

	private Properties properties = null;

	private GaindePropertiesReader() {
		properties = new Properties();
		try {
			InputStream inputStream = this.getClass().getClassLoader()
					.getResourceAsStream("gainde.properties");
			properties.load(inputStream);
		} catch (Exception e) {
			//System.out.println("Erreur de lecture du fichier de properties:" + e);
		}
	}

	public synchronized static GaindePropertiesReader getInstance() {
		if (instance == null){
			instance = new GaindePropertiesReader();
		}
		return instance;
	}

	// get property value by name
	public String getProperty(String key) {
		String value = null;
		if (properties.containsKey(key)){
			value = (String) properties.get(key);
		}
		return value;
	}
}