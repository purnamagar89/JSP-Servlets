package com.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SumTagHandler extends TagSupport {

	private static final long serialVersionUID = 1L;
	private int number;

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print(number + number);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
