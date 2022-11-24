package test.ch11.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objkey : keys) {
			String key = (String)objkey;	//강제 형변환
			System.out.println(key); 	//사용할 수 있는 key 출력
			System.out.println(System.getProperty(key)); 	//사용할 수 있는 key 출력
		}
		
	}

}
