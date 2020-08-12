package com.providencepolice.data.api;
//import kong.unirest.HttpResponse;

import kong.unirest.Unirest;

public class API {
	public static String GetCaseLogData() throws Exception {
		
		return Unirest.get("https://data.providenceri.gov/resource/rz3y-pz8v.json").asString().getBody();
		
	}
	
	public static String GetArrestLogData() throws Exception {
		
		return Unirest.get("https://data.providenceri.gov/resource/vank-fyx9.json").asString().getBody();
		
	}
	
}
