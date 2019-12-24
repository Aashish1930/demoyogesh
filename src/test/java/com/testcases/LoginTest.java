package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.testcore.TestBase;

public class LoginTest extends TestBase {

	public LoginTest() throws IOException {
		super();
	}

	@BeforeSuite
	public void setup() {
		initilization();
	}

	//@Test
	public void start() {

		System.out.println("start");
	}

}
