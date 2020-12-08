package org.example.utils;

public enum JavaScripts {
    META_BLOCK_TEXT("return document.querySelector('frmLogin').textContent"),
    SCROLL_TO_ELEMENT("arguments[0].scrollIntoView(true);");
    //GOOGLE-SELENIUM JS SCROLL TO ELEMENT

    private String js;

    JavaScripts(String js) {
        this.js = js;
    }

    public String getJs() {
        return js;
    }
}
