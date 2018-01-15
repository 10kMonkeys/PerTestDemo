package com.perchwell.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Properties;

public class AppProperties implements Serializable {
public static final AppProperties INSTANCE = new AppProperties();

private Properties props = null;

	private AppProperties() {
			props = new Properties();
			try {
				FileInputStream file = new FileInputStream(
						new File("app.properties"));
				props.load(file);
			}
			catch (Exception e) {
				System.out.println("Cann't read file app.properties");
				// обработа ошибку чтения конфигураци?
			}
	}

	public synchronized String getProperty(String key) {
		String value = null;
		if (props.containsKey(key))
			value = (String) props.get(key);
		else {
			System.out.println(key +" not found");
			// сообщит о том, что свойство не найдено?
		}
		return value;
	}

}
