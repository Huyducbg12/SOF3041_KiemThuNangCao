package com.example.ph5819906_03_2026.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VitimexTest {
    WebDriver driver;
    String testEmail = "duc" + System.currentTimeMillis() + "@gmail.com";
    String pass = "Duc123456!";

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Kịch bản: Đăng ký thành công sau đó Đăng nhập")
    void testRegisterAndLogin() throws InterruptedException {
        // --- BƯỚC 1: ĐĂNG KÝ ---
        driver.get("https://vitimex.com.vn/account/register");
        Thread.sleep(2000);

        driver.findElement(By.id("last_name")).sendKeys("Nguyễn Huy");
        driver.findElement(By.id("first_name")).sendKeys("Đức");
        driver.findElement(By.id("radio2")).click(); // Chọn Nam
        driver.findElement(By.id("birthday")).sendKeys("01/01/2000");
        driver.findElement(By.id("email")).sendKeys(testEmail);
        driver.findElement(By.id("password")).sendKeys(pass);

        // Click nút Đăng ký (Dựa vào class trong HTML em gửi)
        driver.findElement(By.xpath("//input[@value='Đăng ký']")).click();
        Thread.sleep(3000);

        // --- BƯỚC 2: ĐĂNG NHẬP LẠI ---
        driver.get("https://vitimex.com.vn/account/login");
        Thread.sleep(2000);

        // Điền Email và Password (ID lấy từ màn hình Đăng nhập)
        driver.findElement(By.id("email")).sendKeys(testEmail);
        driver.findElement(By.id("password")).sendKeys(pass);

        // Click nút Đăng nhập
        driver.findElement(By.xpath("//button[contains(text(),'ĐĂNG NHẬP')]")).click();
        Thread.sleep(3000);

        // Kiểm tra xem đã vào trang tài khoản chưa (URL chứa /account)
        assertTrue(driver.getCurrentUrl().contains("account"), "Đăng nhập thất bại!");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) driver.quit();
    }
}