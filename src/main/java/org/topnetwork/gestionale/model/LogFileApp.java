package org.topnetwork.gestionale.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class LogFileApp implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLogApp;
	@Column
	private LocalDateTime data;
	@Column
	private Integer nodoConsole;
	@Column
	private Time launchingMeetingDataGatheringStarting;
	@Column
	private BigDecimal avgAnalysisTime;
	@Column
	private Date automationEnablingDate;
	@Column
	private boolean done;
	@Column
	private String nome_App, apmCode, insertedInCastProgram, stakeholderEngagement,
	stakeholderBrief, onBoardingKitDelivery, primaRestitution, ownerOnboarding, ownerAFP, gdsUnit, tecnologia, serverManager,
	soloCMS, macchina, noteOnboarding, fase, afpStatus, pubblicatoDashboard, noteAppOwner,  jiraautomationActivation,
	repoAvailability, automationStatus, automationNotes, greenItIndex, onboardingKitClosing, sourceCodeFinalDelivery,
	linkConfluence, businessCriticality, devMethodology, provider;
	@Column
	private int idPreUpdate;
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_idUtente", referencedColumnName = "idUtente")
	@JsonBackReference
	private Utente utente;
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_idApp", referencedColumnName = "idApplicazione")
	@JsonBackReference
	private Applicazione applicazione;
	
	
	@Override
	public String toString() {
		return "LogFileApp [data=" + data + ", valorePrecedente=" + ", nuovoValore=" 
				+ ", action=" + ", utente=" + utente + ", applicazione=" + applicazione + "]";
	}


	public LogFileApp(LocalDateTime data, Integer nodoConsole, Time launchingMeetingDataGatheringStarting,
			BigDecimal avgAnalysisTime, Date automationEnablingDate, boolean done, String nome_App, String apmCode,
			String insertedInCastProgram, String stakeholderEngagement, String stakeholderBrief,
			String onBoardingKitDelivery, String primaRestitution, String ownerOnboarding, String ownerAFP,
			String gdsUnit, String tecnologia, String serverManager, String soloCMS, String macchina,
			String noteOnboarding, String fase, String afpStatus, String pubblicatoDashboard, String noteAppOwner,
			String jiraautomationActivation, String repoAvailability, String automationStatus, String automationNotes,
			String greenItIndex, String onboardingKitClosing, String sourceCodeFinalDelivery, String linkConfluence,
			String businessCriticality, String devMethodology, String provider, int idPreUpdate) {
		this.data = data;
		this.nodoConsole = nodoConsole;
		this.launchingMeetingDataGatheringStarting = launchingMeetingDataGatheringStarting;
		this.avgAnalysisTime = avgAnalysisTime;
		this.automationEnablingDate = automationEnablingDate;
		this.done = done;
		this.nome_App = nome_App;
		this.apmCode = apmCode;
		this.insertedInCastProgram = insertedInCastProgram;
		this.stakeholderEngagement = stakeholderEngagement;
		this.stakeholderBrief = stakeholderBrief;
		this.onBoardingKitDelivery = onBoardingKitDelivery;
		this.primaRestitution = primaRestitution;
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
		this.jiraautomationActivation = jiraautomationActivation;
		this.repoAvailability = repoAvailability;
		this.automationStatus = automationStatus;
		this.automationNotes = automationNotes;
		this.greenItIndex = greenItIndex;
		this.onboardingKitClosing = onboardingKitClosing;
		this.sourceCodeFinalDelivery = sourceCodeFinalDelivery;
		this.linkConfluence = linkConfluence;
		this.businessCriticality = businessCriticality;
		this.devMethodology = devMethodology;
		this.provider = provider;
		this.idPreUpdate = idPreUpdate;
	}



	
	
	
	
	
	
}
