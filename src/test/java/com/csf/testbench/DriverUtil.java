package com.csf.testbench;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

class DriverUtil {

	private DriverUtil() {}

	static PhantomJSDriver getPhantomjsDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "D:/oudam/testdriver/phantomjsdriver/bin/phantomjs.exe");
		return new PhantomJSDriver(capabilities);
	}

	static ChromeDriver getChromeDriver() {
		return new ChromeDriver();
	}
}
