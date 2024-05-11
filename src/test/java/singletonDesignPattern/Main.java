package singletonDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		String browser="chrome";
		
		SingletonLazyInitialization.getInstance().setDriver(browser);
		SingletonLazyInitialization.getInstance().getDriver().get("https://www.saucedemo.com/");
		SingletonLazyInitialization.getInstance().getDriver().manage().window().maximize();
		SingletonLazyInitialization.getInstance().getDriver().get("https://www.google.com/");

	}

}
