package com.premiumminds.drawers;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.AbstractReadOnlyModel;

public class Drawer extends AbstractDrawer {
	private static final long serialVersionUID = -7007986066149957821L;

	
	public Drawer(){
		add(new Label("title", new AbstractReadOnlyModel<String>() {
			private static final long serialVersionUID = -3070568255859449524L;

			@Override
			public String getObject() {
				return getString("title", getDefaultModel(), "NO TITLE");
			}
		}));
	}
}
