package com.techstar.project.action;

import java.util.List;

import com.techstar.project.dao.ProjectDao;
import com.techstar.project.po.Project;

public class ProjectListAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private List<Project> projectList;

	private ProjectDao projectDao = new ProjectDao();
	
	@Override
	public String execute() throws Exception {
		projectList = projectDao.findAll();
		return "success";
	}
	
	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
}
