/**
 * http://surenpi.com
 */
package org.suren.autotest.web.framework.selenium.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author suren
 * @date 2016年7月27日 下午12:11:23
 */
public abstract class SeleniumTextLocator extends AbstractLocator<WebElement>
{

	@Override
	public String getType()
	{
		return "byText";
	}

	@Override
	public WebElement findElement(WebDriver driver)
	{
		String text = getValue();
		
		By by = getBy();

		List<WebElement> elementList = driver.findElements(by);
		for(WebElement ele : elementList)
		{
			new Actions(driver).moveToElement(ele);
			if(text.equals(ele.getText()))
			{
				return ele;
			}
		}
		
		return null;
	}

}
