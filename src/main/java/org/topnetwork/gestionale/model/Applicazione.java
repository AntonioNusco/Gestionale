package org.topnetwork.gestionale.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table
public class Applicazione implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idApplicazione;
	@Column
	private int nodoConsole;
	@Column
	private Time avgAnalysisTime, launchingMeetingDataGatheringStarting;
	@Column
	private Date automationEnablingDate, insertedInCastProgram, stakeholderEngagement,
	stakeholderBrief, onBoardingKitDelivery, primaRestitution;
	@Column
	private boolean done,exist;
	@Column
	private String nomeApp, apmCode, ownerOnboarding, ownerAFP, gdsUnit, tecnologia, serverManager,
	soloCMS, macchina, noteOnboarding, fase, afpStatus, pubblicatoDashboard, noteAppOwner, jiraAutomationAcitvision,
	repoAvailability, automationStatus, automationNotes, greenItIndex, onboardingKitClosing, sourceCodeFinalDelivery,
	linkConfluence, businessCritically, devMethodology, provider;
	@OneToMany(mappedBy="applicazione")
	private Set<Rescan> rescans;
	@ManyToMany(mappedBy="applications")
	private Set<AppOwner> owners;
}
