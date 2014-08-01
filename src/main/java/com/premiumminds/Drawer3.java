package com.premiumminds;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;

import com.premiumminds.drawers.Drawer;

@SuppressWarnings("serial")
public class Drawer3 extends Drawer {

	public Drawer3() {
		add(new AjaxLink<Void>("close") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				getManager().pop(Drawer3.this, target);
			}
		});
	}
}
