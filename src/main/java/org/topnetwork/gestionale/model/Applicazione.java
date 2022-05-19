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
	@OneToMany (mappedBy = "applicazione")
	private Set<LogFileApp> logFiles;
	@OneToMany(mappedBy = "rescan")
	private Set<LogFileRescan> logFile;
	
	public Applicazione(int idApplicazione, int nodoConsole, Time avgAnalysisTime,
			Time launchingMeetingDataGatheringStarting, Date automationEnablingDate, Date insertedInCastProgram,
			Date stakeholderEngagement, Date stakeholderBrief, Date onBoardingKitDelivery, Date primaRestitution,
			boolean done, boolean exist, String nomeApp, String apmCode, String ownerOnboarding, String ownerAFP,
			String gdsUnit, String tecnologia, String serverManager, String soloCMS, String macchina,
			String noteOnboarding, String fase, String afpStatus, String pubblicatoDashboard, String noteAppOwner,
			String jiraAutomationAcitvision, String repoAvailability, String automationStatus, String automationNotes,
			String greenItIndex, String onboardingKitClosing, String sourceCodeFinalDelivery, String linkConfluence,
			String businessCritically, String devMethodology, String provider) {
		super();
		this.idApplicazione = idApplicazione;
		this.nodoConsole = nodoConsole;
		this.avgAnalysisTime = avgAnalysisTime;
		this.launchingMeetingDataGatheringStarting = launchingMeetingDataGatheringStarting;
		this.automationEnablingDate = automationEnablingDate;
		this.insertedInCastProgram = insertedInCastProgram;
		this.stakeholderEngagement = stakeholderEngagement;
		this.stakeholderBrief = stakeholderBrief;
		this.onBoardingKitDelivery = onBoardingKitDelivery;
		this.primaRestitution = primaRestitution;
		this.done = done;
		this.exist = exist;
		this.nomeApp = nomeApp;
		this.apmCode = apmCode;
		this.ownerOnboarding = ownerOnboarding;
		this.ownerAFP = ownerAFP;
		this.gdsUnit = gdsUnit;
		this.tecnologia = tecnologia;
		this.serverManager = serverManager;
		this.soloCMS = soloCMS;
		this.macchina = macchina;
		this.noteOnboarding = noteOnboarding;
		this.fase = fase;
		this.afpStatus = afpStatus;
		this.pubblicatoDashboard = pubblicatoDashboard;
		this.noteAppOwner = noteAppOwner;
		this.jiraAutomationAcitvision = jiraAutomationAcitvision;
		this.repoAvailability = repoAvailability;
		this.automationStatus = automationStatus;
		this.automationNotes = automationNotes;
		this.greenItIndex = greenItIndex;
		this.onboardingKitClosing = onboardingKitClosing;
		this.sourceCodeFinalDelivery = sourceCodeFinalDelivery;
		this.linkConfluence = linkConfluence;
		this.businessCritically = businessCritically;
		this.devMethodology = devMethodology;
		this.provider = provider;
	}
	
}
