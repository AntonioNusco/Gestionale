package org.topnetwork.gestionale.dao.model;

import java.util.List;

import org.topnetwork.gestionale.model.LogFileApp;

public interface LogFileAppDao {

	public LogFileApp lfaObjectInfoCreation(String s);
	public LogFileApp lfaObjectWarnCreation(String s);
	List<LogFileAppDao> getAll();
	
	
}
