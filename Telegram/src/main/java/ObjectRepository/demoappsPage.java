package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class demoappsPage {

	public demoappsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[.='UI Testing Concepts']")
	private static WebElement UITestingConceptsLink;
	
	public WebElement getUITestingConceptsLink()
	{
		return UITestingConceptsLink;
	}
	
	@FindBy(xpath = "//section[.='Popups']")
	private static WebElement popUpsLink;
	
	public WebElement getpopUpsLink()
	{
		return popUpsLink;
	}
	
	@FindBy(linkText = "Modal")
	private static WebElement modalLink;
	
	public WebElement getmodalLink()
	{
		return modalLink;
	}
	
	@FindBy(xpath = "//a[.='Multiple Modal']")
	private static WebElement multipleModalLink;
	
	public WebElement getmultipleModalLink()
	{
		return multipleModalLink;
	}
	
	@FindBy(linkText = "Open Modal")
	private static WebElement openModalButton;
	
	public WebElement getopenModalButton()
	{
		return openModalButton;
	}
	
	@FindBy(linkText = "Scroll")
	private static WebElement scroll;
	
	public WebElement getscroll()
	{
		return scroll;
	}
	
	@FindBy(xpath = "//a//section[.='Scroll']")
	private static WebElement scrollLink;
	
	public WebElement getscrollLink()
	{
		return scrollLink;
	}
	
	@FindBy(linkText = "Open In New Tab")
	private static WebElement OpeninNewTabButton;
	
	public WebElement getOpeninNewTabButton()
	{
		return OpeninNewTabButton;
	}
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement checkbox;
	
	public WebElement getcheckbox()
	{
		return checkbox;
	}
	
	@FindBy(xpath = "//button[.='Accept Our Policy']")
	private static WebElement acceptPolicy;
	
	public WebElement getacceptPolicy()
	{
		return acceptPolicy;
	}
	
	@FindBy(xpath = "//section[.='Synchronization']")
	private static WebElement synchronization;
	
	public WebElement getsynchronization()
	{
		return synchronization;
	}
	
	@FindBy(xpath = "//section[.='Progress Bar']")
	private static WebElement progressBar;
	
	public WebElement getprogressBar()
	{
		return progressBar;
	}
	
	@FindBy(xpath = "//a[.='Disabled Element']")
	private static WebElement disabledElement;
	
	public WebElement getdisabledElement()
	{
		return disabledElement;
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter time in seconds']")
	private static WebElement secondtext;
	
	public WebElement getsecondtext()
	{
		return secondtext;
	}
	
	@FindBy(xpath = "//button[.='Start']")
	private static WebElement startButton;
	
	public WebElement getstartButton()
	{
		return startButton;
	}
	
	@FindBy(linkText = "Print")
	private static WebElement print;
	
	public WebElement getprint()
	{
		return print;
	}
	
	@FindBy(linkText = "Print this out!")
	private static WebElement printOut;
	
	public WebElement getprintOut()
	{
		return printOut;
	}
	
	@FindBy(linkText =  "    Save     ")
	private static WebElement save;
	
	public WebElement getsave()
	{
		return save;
	}
	
	@FindBy(linkText = "Others")
	private static WebElement Others;
	
	public WebElement getOthers()
	{
		return Others;
	}
	
	@FindBy(linkText = "Keyboard Actions")
	private static WebElement keyboardActions;
	
	public WebElement getkeyboardActions()
	{
		return keyboardActions;
	}
	
	@FindBy(linkText = "Keyboard")
	private static WebElement keyboard;
	
	public WebElement getkeyboard()
	{
		return keyboard;
	}
	
	@FindBy(linkText = "Virtual Keyboard")
	private static WebElement virtualKeyboard;
	
	public WebElement getvirtualKeyboard()
	{
		return virtualKeyboard;
	}
	
	@FindBy(id = "email")
	private static WebElement email;
	
	public WebElement getemail()
	{
		return email;
	}
	
	@FindBy(id = "password")
	private static WebElement password;
	
	public WebElement getpassword()
	{
		return password;
	}
	
	@FindBy(linkText = "Submit")
	private static WebElement submit;
	
	public WebElement getsubmit()
	{
		return submit;
	}
	
	@FindBy(linkText = "confirmPassword")
	private static WebElement confirmPassword;
	
	public WebElement getconfirmPassword()
	{
		return confirmPassword;
	}
	
	@FindBy(name = "removefromcart")
	private static WebElement remove;
	
	public WebElement getremove()
	{
		return remove;
	}
	
	@FindBy(name = "updatecart")
	private static WebElement updateShopping;
	
	public WebElement getupdateShopping()
	{
		return updateShopping;
	}
	
	@FindBy(xpath = "//section[.='Web Elements']")
	private static WebElement webElement;
	
	public WebElement getwebElement()
	{
		return webElement;
	}
	
	@FindBy(linkText = "Toggle")
	private static WebElement toggle;
	
	public WebElement gettoggle()
	{
		return toggle;
	}
	
	@FindBy(xpath = "//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out']")
	private static WebElement togglebutton;
	
	public WebElement gettogglebutton()
	{
		return togglebutton;
	}
	
	@FindBy(linkText = "Place Order")
	private static WebElement placeOrder;
	
	public WebElement getplaceOrder()
	{
		return placeOrder;
	}
	
	@FindBy(linkText = "Text Box")
	private static WebElement textboxbutton;
	
	public WebElement gettextboxbutton()
	{
		return textboxbutton;
	}
	
	@FindBy(name = "name")
	private static WebElement nametxt;
	
	public WebElement getnametxt()
	{
		return nametxt;
	}
	
	@FindBy(name = "email")
	private static WebElement emailId;
	
	public WebElement getemailId()
	{
		return emailId;
	}
	
	@FindBy(name = "password")
	private static WebElement passwordtxt;
	
	public WebElement getpasswordtxt()
	{
		return passwordtxt;
	}
	
	@FindBy(linkText = "Register")
	private static WebElement registerbutton;
	
	public WebElement getregisterButton()
	{
		return registerbutton;
	}
	
	@FindBy(linkText = "Button")
	private static WebElement buttonweb ;
	
	public WebElement getbuttonweb()
	{
		return buttonweb;
	}
	
	@FindBy(linkText = "Yes")
	private static WebElement yes;
	
	public WebElement getyes()
	{
		return yes;
	}
	
	@FindBy(xpath = "//button[.=\"Yes\"]/article[@class='ps-10 pb-8']")
	private static WebElement yes1 ;
	
	public WebElement getyes1()
	{
		return yes1;
	}
	
	@FindBy(xpath = "//button[.='Yes']/p[@class='2. Do you have any concerns about the registration process?']")
	private static WebElement yes2;
	
	public WebElement getyes2()
	{
		return yes2;
	}
	
	@FindBy(id = "btn4")
	private static WebElement num1;
	
	public WebElement getnum1()
	{
		return num1;
	}
	
	@FindBy(linkText = "Image")
	private static WebElement image;
	
	public WebElement getimage()
	{
		return image;
	}
	
	@FindBy(linkText = "Men's Clothing")
	private static WebElement clothingtype;
	
	public WebElement getclothingtype()
	{
		return clothingtype;
	}
	
}
