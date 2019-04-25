package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement loginbutton;
	@FindBy(how = How.CLASS_NAME,using="btnbtn-nav active")
	 public static WebElement AddCName;
	@FindBy(how = How.ID,using="catgName")
	public static WebElement CategoryNmae;
	@FindBy(how = How.CSS,using="input[value='Add']")
	public static WebElement CategoryNmaeDesc;
	@FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/b/i")
	public static WebElement message;

	@FindBy(how = How.CLASS_NAME,using="btnbtn-nav")	 
	public static WebElement AddSubCName;
	@FindBy(how = How.CSS,using="select[id='subCatgId']")
	public static WebElement AddCatName;
	@FindBy(how = How.CSS,using="select[id='subCatgName']")
	public static WebElement AddSubCatName;
	@FindBy(how = How.CSS,using="select[id='subCatgDesc']")
	public static WebElement AddSubCatDesc;
	@FindBy(how = How.CSS,using="select[value='Add']")
	public static WebElement AddSubCat;
	@FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/b/i")
	public static WebElement ASCmessage;


	@FindBy(how = How.XPATH,using= "/html/body/main/div/div/div/div[1]/button")
	 public static WebElement AddProduct;
	 @FindBy(how = How.CSS,using= "select[id='categorydropid']")
	public static WebElement Cname;
	@FindBy(how = How.CSS,using= "select[id='subcategorydropid']")
	public static WebElement SCname;
	@FindBy(how = How.CSS,using= "input[id='prodid']")
	 
	public static WebElement Pname;
	 
	@FindBy(how = How.CSS,using= "input[id='priceid']")
	 
	public static WebElement price;
	 
	@FindBy(how = How.CSS,using= "input[id='quantityid']")
	 
	public static WebElement quantity;
	 
	@FindBy(how = How.CSS,using= "input[id='brandid']")
	 
	public static WebElement brand;
	 
	@FindBy(how = How.ID,using="description")
	 
	public static WebElement description;
	 
	@FindBy(how = How.NAME,using="input-file-preview")
	 
	public static WebElement file;
	 
	@FindBy(how = How.CSS,using= "input[value='Add Product']")
	 
	public static WebElement Product;
	 
	@FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/b/i")
	 
	public static WebElement AddProductSuccessfully;


	 


	
}
