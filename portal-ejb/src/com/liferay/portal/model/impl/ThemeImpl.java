/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Theme;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.util.ListUtil;
import com.liferay.util.Validator;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * <a href="ThemeImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class ThemeImpl extends PluginBaseImpl implements Theme {

	public static final String PLUGIN_TYPE = "theme";

	public static String getDefaultThemeId() {
		return PortalUtil.getJsSafePortletName(
			PropsUtil.get(PropsUtil.DEFAULT_THEME_ID));
	}

	public ThemeImpl() {
	}

	public ThemeImpl(String themeId) {
		_themeId = themeId;
	}

	public ThemeImpl(String themeId, String name) {
		_themeId = themeId;
		_name = name;
	}

	public String getThemeId() {
		return _themeId;
	}

	public String getPluginId() {
		return getThemeId();
	}

	public String getPluginType() {
		return PLUGIN_TYPE;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getRootPath() {
		return _rootPath;
	}

	public void setRootPath(String rootPath) {
		_rootPath = rootPath;
	}

	public String getTemplatesPath() {
		return _templatesPath;
	}

	public void setTemplatesPath(String templatesPath) {
		_templatesPath = templatesPath;
	}

	public String getImagesPath() {
		return _imagesPath;
	}

	public void setImagesPath(String imagesPath) {
		_imagesPath = imagesPath;
	}

	public String getTemplateExtension() {
		return _templateExtension;
	}

	public void setTemplateExtension(String templateExtension) {
		_templateExtension = templateExtension;
	}

	public boolean isEnableDragAndDrop() {
		return _enableDragAndDrop;
	}

	public void setEnableDragAndDrop(boolean enableDragAndDrop) {
		_enableDragAndDrop = enableDragAndDrop;
	}

	public Properties getSettings() {
		return _settings;
	}

	public String getSetting(String key) {
		return _settings.getProperty(key);
	}

	public void setSetting(String key, String value) {
		_settings.setProperty(key, value);
	}

	public List getColorSchemes() {
		List colorSchemes = ListUtil.fromCollection(_colorSchemesMap.values());

		Collections.sort(colorSchemes);

		return colorSchemes;
	}

	public Map getColorSchemesMap() {
		return _colorSchemesMap;
	}

	public String getServletContextName() {
		return _servletContextName;
	}

	public void setServletContextName(String servletContextName) {
		_servletContextName = servletContextName;

		if (Validator.isNotNull(_servletContextName)) {
			_warFile = true;
		}
		else {
			_warFile = false;
		}
	}

	public boolean getWARFile() {
		return _warFile;
	}

	public boolean isWARFile() {
		return _warFile;
	}

	public String getContextPath() {
		if (isWARFile()) {
			return StringPool.SLASH + getServletContextName();
		}
		else {
			String contextPath = PropsUtil.get(PropsUtil.PORTAL_CTX);

			if (contextPath.equals(StringPool.SLASH)) {
				contextPath = StringPool.BLANK;
			}

			return contextPath;
		}
	}

	public int compareTo(Object obj) {
		if (obj == null) {
			return -1;
		}

		Theme theme = (Theme)obj;

		return getName().compareTo(theme.getName());
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Theme theme = null;

		try {
			theme = (Theme)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String themeId = theme.getThemeId();

		if (getThemeId().equals(themeId)) {
			return true;
		}
		else {
			return false;
		}
	}

	private String _themeId;
	private String _name;
	private String _rootPath;
	private String _templatesPath;
	private String _imagesPath;
	private String _templateExtension = "jsp";
	private boolean _enableDragAndDrop = true;
	private Properties _settings = new Properties();
	private Map _colorSchemesMap = new HashMap();
	private String _servletContextName;
	private boolean _warFile;

}