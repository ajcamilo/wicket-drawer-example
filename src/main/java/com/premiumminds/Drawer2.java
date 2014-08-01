package com.premiumminds;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;

import com.premiumminds.drawers.Drawer;

@SuppressWarnings("serial")
public class Drawer2 extends Drawer {

	public Drawer2() {
		add(new AjaxLink<Void>("drawer3") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				getManager().push(new Drawer3(), target);
			}
		});
	}
}
