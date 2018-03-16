package com.test;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from table_test where 1=1";
		sql = sql.toUpperCase();
		System.out.println("select nvl(count(1),0) "+sql.substring(sql.indexOf("FROM"), sql.length()));
		
		System.out.println("asd");
		System.out.println(""); 
	}

}
