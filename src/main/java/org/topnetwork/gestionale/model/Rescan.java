package org.topnetwork.gestionale.model;

import lombok.Getter;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rescan {
	
	private int idRescan,nRescan,newOb,py,ytd;
	private String aefpe,yoyRolling,lastRescan;
	private boolean pnGoing,archive;
	private Date rkd;
	
	
	
	
	
	
	
	
	
}
