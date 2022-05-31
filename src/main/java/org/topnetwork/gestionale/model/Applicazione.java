package org.topnetwork.gestionale.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	private Integer nodoConsole;
	@Column
	private Time launchingMeetingDataGatheringStarting;
	@Column
	private BigDecimal avgAnalysisTime;
	@Column
	private Date automationEnablingDate;
	@Column
	private boolean done,exist;
	@Column
	private String nome_App, apmCode, insertedInCastProgram, stakeholderEngagement,
	stakeholderBrief, onBoardingKitDelivery, primaRestitution, ownerOnboarding, ownerAFP, gdsUnit, tecnologia, serverManager,
	soloCMS, macchina, noteOnboarding, fase, afpStatus, pubblicatoDashboard, noteAppOwner,  jiraautomationActivation,
	repoAvailability, automationStatus, automationNotes, greenItIndex, onboardingKitClosing, sourceCodeFinalDelivery,
	linkConfluence, businessCriticality, devMethodology, provider;
	@OneToMany(mappedBy="applicazione")
	@JsonManagedReference
	private Set<Rescan> rescans;
	@ManyToMany(mappedBy="applicazione")
	@JsonIgnoreProperties("applicazione")
	private Set<AppOwner> owners;
	@OneToMany (mappedBy = "applicazione")
	@JsonManagedReference
	private Set<LogFileApp> logFiles;
	@OneToMany(mappedBy = "rescan")
	@JsonManagedReference
	private Set<LogFileRescan> logFile;
	@Override
	public String toString() {
		return "Applicazione -> nome_App : " + nome_App + ", apmCode : "
				+ apmCode;
	}
	
	
	
	
	
	
	
	
	
}
