package org.topnetwork.gestionale.model;

import java.sql.Date;
import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Applicazione {
	private int idApplicazione;
	private int nodoConsole;
	private Time avgAnalysisTime, launchingMeetingDataGatheringStarting;
	private Date automationEnablingDate, insertedInCastProgram, stakeholderEngagement,
	stakeholderBrief, onBoardingKitDelivery, primaRestitution;
	private boolean done;
	private String nomeApp, apmCode, ownerOnboarding, ownerAFP, gdsUnit, tecnologia, serverManager,
	soloCMS, macchina, noteOnboarding, fase, afpStatus, pubblicatoDashboard, noteAppOwner, jiraAutomationAcitvision,
	repoAvailability, automationStatus, automationNotes, greenItIndex, onboardingKitClosing, sourceCodeFinalDelivery,
	linkConfluence, businessCritically, devMethodology, provider;
	
}
