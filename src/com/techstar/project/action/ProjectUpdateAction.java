package com.techstar.project.action;

import com.techstar.project.dao.ProjectDao;
import com.techstar.project.po.Project;

public class ProjectUpdateAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private Project project;
	private ProjectDao projectDao = new ProjectDao();

	@Override
	public String execute() throws Exception {
		projectDao.update(project);
		return super.execute();
	}
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
