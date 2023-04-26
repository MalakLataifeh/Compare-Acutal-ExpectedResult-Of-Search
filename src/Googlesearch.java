import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Googlesearch extends Parameter {

    @Test()
    public void verify_the_search_result() {

    	
    	driver.findElement(By.xpath( "//*[@id=\"SIvCob\"]/a[2]")).click();
    	driver.findElement(By.name("q")).sendKeys("Malak Lataifeh"+Keys.ENTER);
    	String search_result = driver.findElement(By.id( "result-stats")).getText();
    	String splitedText [] =  search_result.split(" ");
    	
    	System.out.println(splitedText.length + "****************");
    	for(int i=0;i<splitedText.length;i++)
    	{System.out.println(splitedText[i]);
    	}
    	
    	
    	System.out.println(splitedText[1]);
    	String numberOfTheSearch = splitedText[1];
    	System.out.println("**********before*********");
    	System.out.println(numberOfTheSearch);
    	
    	
    	System.out.println("-----------------------");
    	
    	
    	System.out.println("*********After***********");
    	System.out.println(numberOfTheSearch.replace(",", ""));
    	
    	
    	String numberOfTheSearchUpdated = numberOfTheSearch.replace(",", "");
    	int ActualResultNumber = Integer.parseInt(numberOfTheSearchUpdated);
    	
    	
    	int expectedNumber = 10;
    	myAssertion.assertEquals(ActualResultNumber, expectedNumber, "Test");
    	myAssertion.assertAll();
    	
     }

}
 