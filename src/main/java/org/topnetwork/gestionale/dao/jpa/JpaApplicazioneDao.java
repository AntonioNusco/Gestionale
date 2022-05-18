package org.topnetwork.gestionale.dao.jpa;

import org.topnetwork.gestionale.dao.model.ApplicazioneDao;

public class JpaApplicazioneDao implements ApplicazioneDao {

	private static JpaApplicazioneDao instance = new JpaApplicazioneDao();
	
	private JpaApplicazioneDao() {}

	public static JpaApplicazioneDao getInstance() {
		return instance;
	}
	
	
}
