package org.body;

public class PayLoad {
	public static String addplace() {
		String a = "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
				+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"exhale System\",\r\n"
				+ "  \"phone_number\": \"9998877766\",\r\n" + "  \"address\": \"29, side mumbai, cohen 09\",\r\n"
				+ "  \"types\": [\r\n" + "    \"herbal park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"English-IN\"\r\n" + "}\r\n" + "\r\n"
				+ "";
		return a;
	}

	public static String addPlace2() {
		String b = "{\\r\\n\" + \r\n" + "			\"  \\\"location\\\": {\\r\\n\" + \r\n"
				+ "			\"    \\\"lat\\\": -38.383494,\\r\\n\" +\r\n"
				+ "			\"    \\\"lng\\\": 33.427362\\r\\n\" + \r\n" + "			\"  },\\r\\n\" + \r\n"
				+ "			\"  \\\"accuracy\\\": 50,\\r\\n\" + \r\n"
				+ "			\"  \\\"name\\\": \\\"TechNerds\\\",\\r\\n\" + \r\n"
				+ "			\"  \\\"phone_number\\\": \\\"9876543210\\\",\\r\\n\" + \r\n"
				+ "			\"  \\\"address\\\": \\\"perungudi,chennai\\\",\\r\\n\" + \r\n"
				+ "			\"  \\\"types\\\": [\\r\\n\" + \r\n"
				+ "			\"    \\\"herbal park\\\",\\r\\n\" + \r\n" + "			\"    \\\"shop\\\"\\r\\n\" + \r\n"
				+ "			\"  ],\\r\\n\" + \r\n"
				+ "			\"  \\\"website\\\": \\\"http://google.com\\\",\\r\\n\" + \r\n"
				+ "			\"  \\\"language\\\": \\\"English-IN\\\"\\r\\n\" + \r\n" + "			\"}\\r\\n\" + \r\n"
				+ "			\"\\r\\n\" + \r\n" + "			\"";
		return b;
	}
	
	public static String courseDetails() {
		String courseData="{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 910,\r\n" + 
				"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Selenium Python\",\r\n" + 
				"      \"price\": 50,\r\n" + 
				"      \"copies\": 6\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Cypress\",\r\n" + 
				"      \"price\": 40,\r\n" + 
				"      \"copies\": 4\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"RPA\",\r\n" + 
				"      \"price\": 45,\r\n" + 
				"      \"copies\": 10\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}\r\n" + 
				"";
		return courseData;
		
	}

}
