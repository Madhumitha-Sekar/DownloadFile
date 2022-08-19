package com.bootdemo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonUtils {
	public static final Logger log = LoggerFactory.getLogger(CommonUtils.class);
	public static ObjectMapper mapper = new ObjectMapper();

	/**
	 * Convert from Java Object to JSON Object using 'Jackson' method
	 * 
	 * @param obj
	 * @return String
	 */
	public static String convertToJSONObject(Object obj) {
		mapper.setSerializationInclusion(Include.NON_NULL); // "null" values removed from the JSON object
		String resultJSON = "";
		
		try {
			resultJSON = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return resultJSON;
	}
}
