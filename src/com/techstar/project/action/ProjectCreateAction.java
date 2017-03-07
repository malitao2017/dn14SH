package com.techstar.project.action;

import com.techstar.project.dao.ProjectDao;
import com.techstar.project.po.Project;

public class ProjectCreateAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private Project project;
	private ProjectDao projectDao = new ProjectDao();
	
	@Override
	public String execute() throws Exception {
		projectDao.insert(project);
		return "success";
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
