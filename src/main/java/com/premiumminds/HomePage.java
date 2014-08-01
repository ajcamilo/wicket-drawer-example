package com.premiumminds;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;

import com.premiumminds.drawers.DrawerManager;

@SuppressWarnings("serial")
public class HomePage extends WebPage {

	public HomePage(final PageParameters parameters) {
		super(parameters);
		
		final DrawerManager manager = new DrawerManager("drawer-manager");

		add(new AjaxLink<Void>("drawer1") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				manager.push(new Drawer1(), target);
			}
		});
		
		
		add(manager);
    }
}
