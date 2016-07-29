/**
 * http://surenpi.com
 */
package org.suren.autotest.web.framework.selenium.locator;


/**
 * @author suren
 * @date 2016年7月27日 下午4:23:21
 */
public abstract class SeleniumValueLocator extends SeleniumAttrLocator
{

	@Override
	public String getType()
	{
		return "byValue";
	}

	@Override
	public String getAttrName()
	{
		return "value";
	}
}
