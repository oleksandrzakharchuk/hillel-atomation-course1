package org.example.progeckts.orangehrm.pageFactory.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopLinksBar {

    private final WebElement root;

    public TopLinksBar(WebElement root) {
        this.root = root;
    }
    public WebElement adminButton(){
        return root.findElement(By.className("drop current"));
    }

    }

