package com.company.java;

import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4569268367476478344L;
	

	public int doStartTag() throws JspException {
		JspWriter out=pageContext.getOut();
		try{
			out.print(Calendar.getInstance().getTime());
		}catch(Exception e){System.out.println(e);}
		return SKIP_BODY;
	}

}
