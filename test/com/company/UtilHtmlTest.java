package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilHtmlTest {
    static UtilHtml uh;

    @BeforeAll
    static void initest(){
        uh = new UtilHtml();
    }
    
    @Test
    void toHtmlTab() {
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab =
                "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
    }

    @Test
    void toHtmlTabVide() {
        String arg[] = {};
        String expectedHtmlTab = "(vide)";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 10));
    }

    @Test
    void toHtmlTabUnElem() {
        String arg[] = {"A"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
    }

    @Test
    void toHtmlTabNElemToNMoinsUnElem() {
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab =
                "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length-1));
    }
    @Test
    void toHtmlTabWithOne(){
        String arg[] = {"A"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
    }
    @Test
    void toHtmlTabWithOneRequestZero(){
        String arg[] = {"A"};
        String expectedHtmlTab = "";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 0));
    }
    @Test
    void toHtmlTabWithTwoRequestOne(){
        String arg[] = {"A","B"};
        String expectedHtmlTab = "<table><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 1));
    }
    @Test
    void toHtmlTabWithNRequestTwo(){
        String arg[] = {"A","B","C","D","E"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 2));
    }
    @Test
    void toHtmlTabNRequestNmoins1(){
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab =  "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length+2));
    }
    @Test
    void toHtmlTabNRequestNDiviser2(){
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab = "<table><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length/2));
    }

    @Test
    void toHtmlTabAutresData() {
        String arg[] = {"2", "2", "0", "0", "0"};
        String expectedHtmlTab =
                "<table><tr><td>2</td></tr>" +
                        "<tr><td>2</td></tr>" +
                        "<tr><td>0</td></tr>" +
                        "<tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 4));
    }
}