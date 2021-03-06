package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_Search_Page {


    public Wiki_Search_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement wikiSearchBox;

    @FindBy( xpath = "//i[@class=\"sprite svg-search-icon\"]")
    public WebElement clickButton;

    @FindBy(id = "firstHeading")
    public WebElement header;

    @FindBy(className = "fn")
    public WebElement imageHeader;



}
