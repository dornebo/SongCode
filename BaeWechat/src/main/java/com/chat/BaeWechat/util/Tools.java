package com.chat.BaeWechat.util;

public class Tools {
	
	/**
	 * ����ַ����Ƿ�Ϊ��(null,"","null")
	 * @param s
	 * @return Ϊ���򷵻�true�������򷵻�false
	 */
	public static boolean isEmpty(String s){
		return s==null || "".equals(s) || "null".equals(s);
	}
}
