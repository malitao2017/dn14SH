package com.techstar.project.action;

import com.techstar.project.dao.ProjectDao;
import com.techstar.project.po.Project;

public class ProjectLoadAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private ProjectDao projectDao = new ProjectDao();
	private Project project;
	@Override
	public String execute() throws Exception {
		project = projectDao.findById(project.getId());
		return super.execute();
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
}
