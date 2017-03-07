package com.techstar.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseDao {

	private static Configuration conf; 
	private static SessionFactory sf;
	static{
		conf = new Configuration();
		conf.configure();
		sf = conf.buildSessionFactory();
	}
	
	
	/**
	 * 常规模式： 每次都会生成新的
	 * 缺点：不能解决懒加载的编辑问题
	 * @return
	 */
	/*protected Session openSession(){
		return sf.openSession();
	}*/
	
	
//	解决懒加载问题： 使用 OpenSessionInView 技术 和ThreadLocal 类 
//	使用方法：Dao 中调用 getSession()方法获取一个 Session，当页面显示数据结束后，
//	在拦截器中调用 closeSession()关闭 Session。以后使用这个 HibernateUtil 即可。
//	注意两不用： DAO查询的时候不用调用关闭方法 ; 把事务管理写到filter中，增删改查不用再重复写
	//第一步：创建拦截器
	/*1.创建方法：OpenSessionInViewFilter
	2.web.xml 中
	<filter>
		<filter-name>OpenSessionInViewFilter</filter-name>
		<filter-class>com.techstar.project.filter.OpenSessionInViewFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>OpenSessionInViewFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>

// 	第二步：修改session的创建方案
	/**
	 * 方案1：创建ThreadLocal
	 * 推荐使用，自己维护ThreadLocal
	 */
	//自己创建ThreadLocal
    private static ThreadLocal<Session> tl = new ThreadLocal<Session>();
	public static Session openSession(){
		Session session = tl.get();
		if(session == null){
			session = sf.openSession();
			tl.set(session);
		}
		return session;
	}
	public static void closeSession(){
		Session session = tl.get();
		if(session != null){
			session.close();
			tl.set(null);
		}
	}
	
	/**
	 * 方案2： hibernate的配置方式
	 */
	//配置方式
	//hibernate.cfg.xml中添加：  <property name="current_session_context_class">thread</property>
	/*public static Session openSession(){
		Session session = sf.getCurrentSession();
		return session;
	}
	public static void closeSession(){
		Session session = sf.getCurrentSession();
		if(session != null){
			session.close();
		}
	}*/
	
	//测试
	public static void main(String[] args) {
		System.out.println(openSession());
	}
}
