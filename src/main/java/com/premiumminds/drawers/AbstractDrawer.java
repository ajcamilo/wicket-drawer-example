package com.premiumminds.drawers;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.panel.Panel;

public abstract class AbstractDrawer extends Panel {
	private static final long serialVersionUID = -2491143545263074862L;
	
	private DrawerManager manager;
	
	private boolean allowClose = true;

	public AbstractDrawer() {
		super("drawer");
		setOutputMarkupId(true);
	}

	public void setManager(DrawerManager manager){
		this.manager = manager;
	}
	
	public DrawerManager getManager(){
		return manager;
	}

	public boolean isAllowClose() {
		return allowClose;
	}

	public void setAllowClose(boolean allowClose) {
		this.allowClose = allowClose;
	}
	
	public void onClose(AjaxRequestTarget target){
	}
}
