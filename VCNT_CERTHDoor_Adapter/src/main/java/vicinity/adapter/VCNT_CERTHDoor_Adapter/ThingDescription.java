package vicinity.adapter.VCNT_CERTHDoor_Adapter;


import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

public class ThingDescription {
	
	final static String file_name = "TD.json";
	
	protected static String readTDFile(){

        
        String thingsDescription = "";
        ClassPathResource res = new ClassPathResource(file_name);    
        try {
			InputStream is = res.getInputStream();
			int content;
			while ((content = is.read()) != -1) {
				// convert to char and display it
				thingsDescription +=(char) content;
				System.out.print((char) content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return thingsDescription;
	}

}
