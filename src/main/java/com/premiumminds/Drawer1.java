package com.premiumminds;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;

import com.premiumminds.drawers.Drawer;

@SuppressWarnings("serial")
public class Drawer1 extends Drawer {

	public Drawer1() {
		add(new AjaxLink<Void>("drawer2") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				getManager().push(new Drawer2(), target);
			}
		});
	}
}
