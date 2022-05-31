package com.cts;

import com.cts.service.SomeService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wlcome to project");
		System.out.println("Hope you are able to follow?");
		
		SomeService ss= new SomeService();
		System.out.println(ss.findLength("program"));

	}

}
