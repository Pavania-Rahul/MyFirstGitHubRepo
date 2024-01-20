package properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	

	public String getValueFromProperties(String key) {
		
		FileInputStream fileInputStream = null;
		Properties properties;
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\utils\\config.txt");
		System.out.println(file);
		
		
		try {
			 fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		properties = new Properties();
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  return properties.getProperty(key);
	}

		

}