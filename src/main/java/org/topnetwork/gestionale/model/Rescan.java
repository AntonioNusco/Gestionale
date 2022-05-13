package org.topnetwork.gestionale.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Rescan {
	
	private int idRescan;
	private int nRescan,newOb,py,ytd;
	private String aefpe,yoyRolling,lastRescan;
	private boolean pnGoing,archive;
	private Date rkd;
	
	
	
	
	
	
	
	
	
}
