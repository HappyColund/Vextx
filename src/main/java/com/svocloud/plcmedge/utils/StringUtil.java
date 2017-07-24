package com.svocloud.plcmedge.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class StringUtil {

	final static int BUFFER_SIZE = 4096;

	public static boolean isEmpty(String str) {
		if (str != null && str != "" && !str.equals("null") && str.length() > 0)
			return false;
		return true;
	}

	public static boolean isLong(String str) {
		boolean b = false;
		if (!isEmpty(str)) {
			try {
				Long.parseLong(str);
				b = true;
			} catch (Exception e) {
				// not is long
				System.out.println("this " + str + " not is long");
			}
		}
		return b;
	}

	public static boolean isJsonString(String str) {
		boolean b = false;
		if (!isEmpty(str)) {
			if(str.charAt(0)=='{'||str.charAt(0)=='[')
			try {
				JSON.parse(str);
				b = true;
			} catch (Exception e) {
				// not is long
				System.out.println("this " + str + " not is jsonString");
			}
		}
		return b;
	}

	public static boolean isInt(String str) {
		boolean b = false;
		if (!isEmpty(str)) {
			try {
				Integer.parseInt(str);
				b = true;
			} catch (Exception e) {
				// not is int
				System.out.println("this " + str + " not is int");
			}
		}
		return b;
	}

	public static String getJsonString(Object object) {
		String StringValue;
		if (object.getClass().equals(String.class))
			StringValue = String.valueOf(object);
		else
			StringValue = JSON.toJSONString(object);
		return StringValue;
	}

	/**
	 * 获取网址的最后一部分
	 * 
	 * @param url
	 * @return
	 */
	public static String getLastPartOfUrl(String url) {
		if (isEmpty(url))
			return "";
		if (url.lastIndexOf("/") == url.length() - 1)
			url = url.substring(0, url.length() - 1);
		return url.substring(url.lastIndexOf("/") + 1);
	}

	public static String InputStreamTOString(InputStream in,int count) {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[BUFFER_SIZE];
		outStream.write(data, 0, count);
		data = null;
		try {
			return new String(outStream.toByteArray(), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static String InputStreamTOString(InputStream in) {

		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[BUFFER_SIZE];
		int count = -1;
		try {
			while ((count = in.read(data, 0, BUFFER_SIZE)) != -1)
				outStream.write(data, 0, count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		data = null;
		try {
			return new String(outStream.toByteArray(), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String getHost(String path) {
		String host = null;
		if (path.contains("://")) {
			path = path.split("://")[1];
		}
		host = path.substring(0, path.indexOf("/"));
		return host;
	}


	public static String split(String str, JSONObject jo) {

		System.out.println(str);
		final String[] string = {str};
		List<String> keys = new ArrayList<>();
		for (String s : str.split("#")) {
			if (s.charAt(0) == '{')
				keys.add(s.substring(s.indexOf("{") + 1, s.indexOf("}")));
		}
		keys.forEach(s -> {
			if (s.equals("date"))
				string[0] = string[0].replace("#{" + s + "}", LocalDate.now().toString());
			else if (s.equals("dateTime"))
				string[0] = string[0].replace("#{" + s + "}", LocalDateTime.now().toString());
			else
				string[0] = string[0].replace("#{" + s + "}", jo.getString(s).replace(" ", ""));
		});


		return string[0];
	}

	public static void main(String[] args) {
		String string = "rtmp://live.d.com/live/37BB4465DD4736C2";
		string = string.substring(0, getCharacterPosition(string, "/", 3))
				+ string.substring(getCharacterPosition(string, "/", 3)).replace("live", "pub");
		System.out.println(string);

	}

	public static int getCharacterPosition(String string, String str, int i) {
		//这里是获取"/"符号的位置
		Matcher slashMatcher = Pattern.compile(str).matcher(string);
		int mIdx = 0;
		while (slashMatcher.find()) {
			mIdx++;
			//当"/"符号第三次出现的位置
			if (mIdx == i) {
				break;
			}
		}
		return slashMatcher.start();
	}

}
