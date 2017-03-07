package com.techstar.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
//import org.hibernate.Transaction;

import com.techstar.project.po.Project;

/**
 * 增加了拦截器影响：
 * 1.可以实现懒加载
 * 2.增删改 可以不用手动加事务了
 * @author malitao
 *
 */
public class ProjectDao extends BaseDao{
	
	@SuppressWarnings("unchecked")
	public List<Project> findAll(){
		Session session = openSession();
		Query query = session.createQuery("from Project");
		List<Project> list = query.list(); 
		return list;
	}
	
	public void insert(Project project){
		Session session = openSession();
//		Transaction tx = session.beginTransaction();
//		try{
			session.save(project);
//			tx.commit();
//		}catch(Exception ex){
//			ex.printStackTrace();
//			tx.rollback();
//		}
	}
	
	public void delete(Integer[] ids){
		Session session = openSession();
//		Transaction tx = session.beginTransaction();
//		try{
			for(Integer id:ids){
				Project project = new Project();
				project.setId(id);
				session.delete(project);
			}
//			tx.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//			tx.rollback();
//		}
	}
	
	/**
	 * 使用懒加载
	 * @param id
	 * @return
	 */
	public Project findById(Integer id){
		Session session = openSession();
		//一般方式
//		Project project = (Project) session.get(Project.class, id);
		//使用懒加载
		Project project = (Project) session.load(Project.class, id);
		return project ;
	}
	
	public void update(Project project){
		Session session = openSession();
//		Transaction tx = session.beginTransaction();
//		try{
			session.update(project);
//			tx.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//			tx.rollback();
//		}
	}
}
