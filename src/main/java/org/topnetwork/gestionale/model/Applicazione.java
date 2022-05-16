package org.topnetwork.gestionale.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Applicazione {
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
	private boolean done;
	@Column
	private String nomeApp, apmCode, ownerOnboarding, ownerAFP, gdsUnit, tecnologia, serverManager,
	soloCMS, macchina, noteOnboarding, fase, afpStatus, pubblicatoDashboard, noteAppOwner, jiraAutomationAcitvision,
	repoAvailability, automationStatus, automationNotes, greenItIndex, onboardingKitClosing, sourceCodeFinalDelivery,
	linkConfluence, businessCritically, devMethodology, provider;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_idAppOwner", referencedColumnName = "idAppOwner")
	private AppOwner appowner;
}
