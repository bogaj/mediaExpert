package pl.pb.mediaexpert.manager;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;

import java.io.*;
import java.util.Set;

public class SaveCookies {

    // ścieżka do pliku z ciasteczkami
    private static final String COOKIES_FILE_PATH = "src\\main\\resources\\cookies.data";

    public static void save() {
        // pobierz aktualne ciasteczka
        Set<Cookie> cookies = WebDriverRunner.getWebDriver().manage().getCookies();
        File file = new File(COOKIES_FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
        // zapisz ciasteczka do pliku
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(COOKIES_FILE_PATH))) {
            outputStream.writeObject(cookies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void load() {
        // wczytaj ciasteczka z pliku
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(COOKIES_FILE_PATH))) {
            Set<Cookie> cookies = (Set<Cookie>) inputStream.readObject();

            // ustaw ciasteczka dla przeglądarki
            for (Cookie cookie : cookies) {
                WebDriverRunner.getWebDriver().manage().addCookie(cookie);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void cookieReader(){
        Set<Cookie> cookies = WebDriverRunner.getWebDriver().manage().getCookies();

        for (Cookie cookie : cookies) {
            System.out.println("Nazwa ciasteczka: " + cookie.getName());
            System.out.println("Wartość ciasteczka: " + cookie.getValue());
        }
    }
}
