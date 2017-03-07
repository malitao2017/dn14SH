package com.techstar.project.action;

import com.techstar.project.dao.ProjectDao;

public class ProjectDeleteAction extends BaseAction{
	private static final long serialVersionUID = -4869982935295332125L;

	private ProjectDao projectDao = new ProjectDao();
	private Integer[] ids ;
	@Override
	public String execute() throws Exception {
		projectDao.delete(ids);
		return "success";
	}
	public Integer[] getIds() {
		return ids;
	}
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
			
	
}
