/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.controlpanel.categories.category.addcategoryviewablebysitemembers;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewCategoryViewableBySiteMembersTest extends BaseTestCase {
	public void testViewCategoryViewableBySiteMembers()
		throws Exception {
		selenium.open("/web/guest/home/");

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("link=Control Panel")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Categories",
			RuntimeVariables.replace("Categories"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//li/div/div[4]")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		assertEquals(RuntimeVariables.replace("Category Name"),
			selenium.getText("//li/div/div[4]"));
		selenium.clickAt("//li/div/div[4]",
			RuntimeVariables.replace("Category Name"));

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible(
							"//div[@class='view-category']/div/h1/span")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		assertEquals(RuntimeVariables.replace("Category Name"),
			selenium.getText("//div[@class='view-category']/div/h1/span"));
		assertEquals(RuntimeVariables.replace(
				"Description: Category Description"),
			selenium.getText("//div[@class='view-category']/div[2]"));
		selenium.clickAt("//input[@id='updateCategoryPermissions']",
			RuntimeVariables.replace("Permissions"));
		selenium.waitForPageToLoad("30000");
		assertFalse(selenium.isChecked("//tr[3]/td[6]/input"));
		assertTrue(selenium.isChecked("//tr[4]/td[6]/input"));
		assertFalse(selenium.isChecked("//tr[5]/td[6]/input"));
		assertFalse(selenium.isChecked("//tr[6]/td[6]/input"));
		assertTrue(selenium.isChecked("//tr[7]/td[6]/input"));
	}
}