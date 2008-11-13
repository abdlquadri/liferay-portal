/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.journal.service.impl;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.service.base.JournalArticleServiceBaseImpl;
import com.liferay.portlet.journal.service.permission.JournalArticlePermission;
import com.liferay.portlet.journal.service.permission.JournalPermission;

import java.io.File;

import java.util.Map;

import javax.portlet.PortletPreferences;

/**
 * <a href="JournalArticleServiceImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class JournalArticleServiceImpl extends JournalArticleServiceBaseImpl {

	public JournalArticle addArticle(
			long groupId, String articleId, boolean autoArticleId, String title,
			String description, String content, String type, String structureId,
			String templateId, int displayDateMonth, int displayDateDay,
			int displayDateYear, int displayDateHour, int displayDateMinute,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire, int reviewDateMonth,
			int reviewDateDay, int reviewDateYear, int reviewDateHour,
			int reviewDateMinute, boolean neverReview, boolean indexable,
			String articleURL, String[] tagsEntries, String[] categoriesEntries,
			boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PortalException, SystemException {

		JournalPermission.check(
			getPermissionChecker(), groupId, ActionKeys.ADD_ARTICLE);

		return journalArticleLocalService.addArticle(
			getUserId(), groupId, articleId, autoArticleId, title, description,
			content, type, structureId, templateId, displayDateMonth,
			displayDateDay, displayDateYear, displayDateHour, displayDateMinute,
			expirationDateMonth, expirationDateDay, expirationDateYear,
			expirationDateHour, expirationDateMinute, neverExpire,
			reviewDateMonth, reviewDateDay, reviewDateYear, reviewDateHour,
			reviewDateMinute, neverReview, indexable, false, null, null, null,
			articleURL, null, tagsEntries, categoriesEntries,
			addCommunityPermissions, addGuestPermissions);
	}

	public JournalArticle addArticle(
			long groupId, String articleId, boolean autoArticleId, String title,
			String description, String content, String type, String structureId,
			String templateId, int displayDateMonth, int displayDateDay,
			int displayDateYear, int displayDateHour, int displayDateMinute,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire, int reviewDateMonth,
			int reviewDateDay, int reviewDateYear, int reviewDateHour,
			int reviewDateMinute, boolean neverReview, boolean indexable,
			boolean smallImage, String smallImageURL, File smallFile,
			Map<String, byte[]> images, String articleURL,
			PortletPreferences preferences, String[] tagsEntries,
			String[] categoriesEntries, boolean addCommunityPermissions,
			boolean addGuestPermissions)
		throws PortalException, SystemException {

		JournalPermission.check(
			getPermissionChecker(), groupId, ActionKeys.ADD_ARTICLE);

		return journalArticleLocalService.addArticle(
			getUserId(), groupId, articleId, autoArticleId, title, description,
			content, type, structureId, templateId, displayDateMonth,
			displayDateDay, displayDateYear, displayDateHour, displayDateMinute,
			expirationDateMonth, expirationDateDay, expirationDateYear,
			expirationDateHour, expirationDateMinute, neverExpire,
			reviewDateMonth, reviewDateDay, reviewDateYear, reviewDateHour,
			reviewDateMinute, neverReview, indexable, smallImage, smallImageURL,
			smallFile, images, articleURL, preferences, tagsEntries,
			categoriesEntries, addCommunityPermissions, addGuestPermissions);
	}

	public JournalArticle addArticle(
			long groupId, String articleId, boolean autoArticleId, String title,
			String description, String content, String type, String structureId,
			String templateId, int displayDateMonth, int displayDateDay,
			int displayDateYear, int displayDateHour, int displayDateMinute,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire, int reviewDateMonth,
			int reviewDateDay, int reviewDateYear, int reviewDateHour,
			int reviewDateMinute, boolean neverReview, boolean indexable,
			String articleURL, String[] tagsEntries, String[] categoriesEntries,
			String[] communityPermissions, String[] guestPermissions)
		throws PortalException, SystemException {

		JournalPermission.check(
			getPermissionChecker(), groupId, ActionKeys.ADD_ARTICLE);

		return journalArticleLocalService.addArticle(
			getUserId(), groupId, articleId, autoArticleId, title, description,
			content, type, structureId, templateId, displayDateMonth,
			displayDateDay, displayDateYear, displayDateHour, displayDateMinute,
			expirationDateMonth, expirationDateDay, expirationDateYear,
			expirationDateHour, expirationDateMinute, neverExpire,
			reviewDateMonth, reviewDateDay, reviewDateYear, reviewDateHour,
			reviewDateMinute, neverReview, indexable, false, null, null, null,
			articleURL, null, tagsEntries, categoriesEntries,
			communityPermissions, guestPermissions);
	}

	public JournalArticle addArticle(
			long groupId, String articleId, boolean autoArticleId, String title,
			String description, String content, String type, String structureId,
			String templateId, int displayDateMonth, int displayDateDay,
			int displayDateYear, int displayDateHour, int displayDateMinute,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire, int reviewDateMonth,
			int reviewDateDay, int reviewDateYear, int reviewDateHour,
			int reviewDateMinute, boolean neverReview, boolean indexable,
			boolean smallImage, String smallImageURL, File smallFile,
			Map<String, byte[]> images, String articleURL,
			PortletPreferences preferences, String[] tagsEntries,
			String[] categoriesEntries, String[] communityPermissions,
			String[] guestPermissions)
		throws PortalException, SystemException {

		JournalPermission.check(
			getPermissionChecker(), groupId, ActionKeys.ADD_ARTICLE);

		return journalArticleLocalService.addArticle(
			getUserId(), groupId, articleId, autoArticleId, title, description,
			content, type, structureId, templateId, displayDateMonth,
			displayDateDay, displayDateYear, displayDateHour, displayDateMinute,
			expirationDateMonth, expirationDateDay, expirationDateYear,
			expirationDateHour, expirationDateMinute, neverExpire,
			reviewDateMonth, reviewDateDay, reviewDateYear, reviewDateHour,
			reviewDateMinute, neverReview, indexable, smallImage, smallImageURL,
			smallFile, images, articleURL, preferences, tagsEntries,
			categoriesEntries, communityPermissions, guestPermissions);
	}

	public JournalArticle approveArticle(
			long groupId, String articleId, double version, String articleURL,
			PortletPreferences preferences)
		throws PortalException, SystemException {

		User user = getUser();

		JournalPermission.check(
			getPermissionChecker(), groupId, ActionKeys.APPROVE_ARTICLE);

		return journalArticleLocalService.approveArticle(
			user.getUserId(), groupId, articleId, version, articleURL,
			preferences);
	}

	public JournalArticle copyArticle(
			long groupId, String oldArticleId, String newArticleId,
			boolean autoArticleId, double version)
		throws PortalException, SystemException {

		JournalPermission.check(
			getPermissionChecker(), groupId, ActionKeys.ADD_ARTICLE);

		return journalArticleLocalService.copyArticle(
			getUserId(), groupId, oldArticleId, newArticleId, autoArticleId,
			version);
	}

	public JournalArticle getArticle(
			long groupId, String articleId, double version)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.VIEW);

		return journalArticleLocalService.getArticle(
			groupId, articleId, version);
	}

	public String getArticleContent(
			long groupId, String articleId, String languageId,
			ThemeDisplay themeDisplay)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.VIEW);

		return journalArticleLocalService.getArticleContent(
			groupId, articleId, languageId, themeDisplay);
	}

	public String getArticleContent(
			long groupId, String articleId, double version, String languageId,
			ThemeDisplay themeDisplay)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.VIEW);

		return journalArticleLocalService.getArticleContent(
			groupId, articleId, version, languageId, themeDisplay);
	}

	public void deleteArticle(
			long groupId, String articleId, double version, String articleURL,
			PortletPreferences preferences)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.DELETE);

		journalArticleLocalService.deleteArticle(
			groupId, articleId, version, articleURL, preferences);
	}

	public void expireArticle(
			long groupId, String articleId, double version, String articleURL,
			PortletPreferences preferences)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.EXPIRE);

		journalArticleLocalService.expireArticle(
			groupId, articleId, version, articleURL, preferences);
	}

	public void removeArticleLocale(long companyId, String languageId)
		throws PortalException, SystemException {

		for (JournalArticle article :
				journalArticlePersistence.findByCompanyId(companyId)) {

			removeArticleLocale(
				article.getGroupId(), article.getArticleId(),
				article.getVersion(), languageId);
		}
	}

	public JournalArticle removeArticleLocale(
			long groupId, String articleId, double version, String languageId)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.UPDATE);

		return journalArticleLocalService.removeArticleLocale(
			groupId, articleId, version, languageId);
	}

	public JournalArticle updateArticle(
			long groupId, String articleId, double version,
			boolean incrementVersion, String title, String description,
			String content, String type, String structureId, String templateId,
			int displayDateMonth, int displayDateDay, int displayDateYear,
			int displayDateHour, int displayDateMinute, int expirationDateMonth,
			int expirationDateDay, int expirationDateYear,
			int expirationDateHour, int expirationDateMinute,
			boolean neverExpire, int reviewDateMonth, int reviewDateDay,
			int reviewDateYear, int reviewDateHour, int reviewDateMinute,
			boolean neverReview, boolean indexable, boolean smallImage,
			String smallImageURL, File smallFile, Map<String, byte[]> images,
			String articleURL, PortletPreferences preferences,
			String[] tagsEntries, String[] categoriesEntries)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.UPDATE);

		return journalArticleLocalService.updateArticle(
			getUserId(), groupId, articleId, version, incrementVersion, title,
			description, content, type, structureId, templateId,
			displayDateMonth, displayDateDay, displayDateYear, displayDateHour,
			displayDateMinute, expirationDateMonth, expirationDateDay,
			expirationDateYear, expirationDateHour, expirationDateMinute,
			neverExpire, reviewDateMonth, reviewDateDay, reviewDateYear,
			reviewDateHour, reviewDateMinute, neverReview, indexable,
			smallImage, smallImageURL, smallFile, images, articleURL,
			preferences, tagsEntries, categoriesEntries);
	}

	public JournalArticle updateContent(
			long groupId, String articleId, double version, String content)
		throws PortalException, SystemException {

		JournalArticlePermission.check(
			getPermissionChecker(), groupId, articleId, ActionKeys.UPDATE);

		return journalArticleLocalService.updateContent(
			groupId, articleId, version, content);
	}

}