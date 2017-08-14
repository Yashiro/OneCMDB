/*
 * Lokomo OneCMDB - An Open Source Software for Configuration
 * Management of Datacenter Resources
 *
 * Copyright (C) 2006 Lokomo Systems AB
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 * 
 * Lokomo Systems AB can be contacted via e-mail: info@lokomo.com or via
 * paper mail: Lokomo Systems AB, Svärdvägen 27, SE-182 33
 * Danderyd, Sweden.
 *
 */
package org.onecmdb.ui.gwt.desktop.client.service.model;

import java.util.List;

import com.extjs.gxt.ui.client.data.BaseModel;

public class CMDBDesktopConfig extends BaseModel {
	// Need to include this for the RPC serierilizer to accept it...
	private CMDBDesktopMenuItem config;
	private CMDBDesktopShortcut shortcut;

	
	public List<CMDBDesktopShortcut> getShortcuts() {
		return(get("menuitem"));
	}
	
	public List<CMDBDesktopMenuItem> getMenuItems() {
		return(get("menuitem"));
	}
	
	public CMDBPermissions getPermissions(BaseModel local) {
		Object o = get("permissions");
		CMDBPermissions perm = new CMDBPermissions();
		
		if (o instanceof BaseModel) {
			perm.setDefaultPermission((BaseModel)o);
		}
		perm.setLocalPermission(local);
		return(perm);
	}
}
