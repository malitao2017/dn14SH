package com.techstar.project.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware,
ServletContextAware,ServletRequestAware,ServletResponseAware{
	private static final long serialVersionUID = 1L;
	protected Map<String, Object> session;
	protected ServletContext application;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		
	}

	@Override
	public void setServletContext(ServletContext arg0) {
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		
	}
	
}
