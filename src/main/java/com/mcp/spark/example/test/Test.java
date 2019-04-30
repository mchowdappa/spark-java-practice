/**
 * 
 */
package com.mcp.spark.example.test;

import org.apache.spark.sql.SparkSession;

/**
 * @author cm1
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SparkSession  ss = SparkSession.builder().appName("test").master("local[3]").getOrCreate();
	}

}
