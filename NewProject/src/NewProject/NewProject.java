package NewProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Carnival\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.google.com");
		obj.manage().window().maximize();

	}

}
