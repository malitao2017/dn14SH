package com.techstar.project.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techstar.project.dao.BaseDao;

public class OpenSessionInViewFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("destroy-OpenSessionInViewFilter");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		//恒泰实达之成都垃圾发电项目的需要：增加ip地址过滤，部署两套系统，同一个用户，内网中有CURD，外网只能查询
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpServletRequest request = (HttpServletRequest)req;

		String uri = request.getRequestURI();
		System.out.println("uri: "+uri);
		String url = request.getRequestURL().toString();
		System.out.println("url: "+url);
//		http://172.16.14.186:8080/dn14SH/project/list.action
		int portSite = url.indexOf(":8080");
		String ip = url.substring(7,portSite);
		//172.16.14.186
		if(ip.contains("172.16.14.")){//跳出去
			String skip = url.substring(0,url.indexOf("/", 4))+"/ipAddressFilter.jsp";
			skip="/ipAddressFilter.jsp";
//			response.sendRedirect(skip);
			System.out.println("localport: "+request.getLocalPort());
			System.out.println("getContextPath: "+request.getContextPath());
			System.out.println("getLocalAddr: "+request.getLocalAddr());
			System.out.println("getMethod: "+request.getMethod());
			System.out.println("getRemoteAddr: "+request.getRemoteAddr());
			System.out.println("getRemoteHost: "+request.getRemoteHost());
			System.out.println("getRemotePort: "+request.getRemotePort());
			System.out.println("getRemoteUser: "+request.getRemoteUser());
			System.out.println("getRemoteUser: "+request.getServerName());
			System.out.println("getServerPort: "+request.getServerPort());
			System.out.println("getServletPath: "+request.getServletPath());
			request.setAttribute("msg", "外网用户只能查询");
			request.getRequestDispatcher(skip).forward(request, response);
		}
		else{
			chain.doFilter(req,resp);
		}
		
		
		//本项目的应用
//		Session session = BaseDao.openSession();
//		Transaction tx = session.beginTransaction();
//		try{
//			chain.doFilter(req, resp);
//			tx.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//			tx.rollback();
//		}
//		BaseDao.closeSession();
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init-OpenSessionInViewFilter");
	}

}
