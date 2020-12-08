package org.example.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils {
    public static void makeScreenshot(WebDriver webDriver, String filepath){
        File distanationFile=new File(filepath);

        TakesScreenshot scrot=(TakesScreenshot) webDriver;
        File img=scrot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(img,distanationFile);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
