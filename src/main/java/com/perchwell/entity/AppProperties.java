package com.perchwell.entity;

import com.perchwell.crossPlatform.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Properties;

public class AppProperties implements Serializable {
public static final AppProperties INSTANCE = new AppProperties();

private Properties props = null;

	private AppProperties() {
			props = new Properties();
			try {
				if(Config.isAndroid()) {
					FileInputStream file = new FileInputStream(
							new File("app.propertiesAndroid"));
					props.load(file);
				} else {
					FileInputStream file = new FileInputStream(
							new File("app.properties"));
					props.load(file);
				}
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
			System.out.println(key +" is not found!!!");
			// сообщит о том, что свойство не найдено?
		}
		return value;
	}

	public synchronized void setProperty(String key, String value) {
		if (props.containsKey(key)) {
			props.setProperty(key, value);
			try {
				FileOutputStream file = new FileOutputStream(
						new File("app.properties"));
				props.store(file,"");
			} catch (Exception e) {
				System.out.println("Can't store file app.properties");
			}
		}
		else {
			System.out.println(key +" is not found!!!");
		}
	}

}
