# CREATE_TABLES
 CREATE TABLE IF NOT EXISTS "anagrafica" (
    "idApplicazione" INT PRIMARY KEY,
    "nome_app" TEXT NOT NULL,
    "apmCode" TEXT NOT NULL,
    "ownerOonboarding" TEXT NOT NULL,
    "ownerAFP" TEXT NOT NULL,
    "gdsUnit" TEXT NOT NULL,
    "tecnologia" TEXT NOT NULL,
    "serverManager" TEXT NOT NULL,
    "soloCMS" TEXT NOT NULL,
    "nodoConsole" INT,
    "macchina" TEXT NOT NULL,
    "noteOnboarding" TEXT,
    "fase" TEXT,
    "afpStatus" TEXT,
    "pubblicatoDashboard" TEXT,
    "noteAppOwner" INT,
    "avgAnalysisTime" NUMERIC(5, 2),
    "jiraAutomationActivation" TEXT,
    "repoAvailability" TEXT,
    "automatioStatus" TEXT,
    "automationEnablingDate" DATE,
    "automationNotes" TEXT,
    "greenItIndex" TEXT,
    "InsertedInCastProgram" TEXT,
    "StakeholderEngagement" TEXT,
    "launchingMeetingDatagGtheringStarting" TIMESTAMP,
    "stakeholderBrief" TEXT,
    "onboardingKitDelivery" TEXT,
    "onboardingKitClosing" TEXT,
    "sourceCodeFinalDelivery" TEXT,
    "primaRestitution" TEXT,
    "done" BOOLEAN,
    "linkConfluence" TEXT,
    "businessCriticality" TEXT,
    "devMethodology" TEXT,
    "provider" TEXT
);

CREATE TABLE IF NOT EXISTS "appowner" (
    "idAppOwner" INT PRIMARY KEY,
    "nome" TEXT NOT NULL,
    "cognome" TEXT NOT NULL,
    "email" TEXT NOT NULL ,
    "cell" TEXT,
    "dsUnit" TEXT NOT NULL
);


CREATE TABLE IF NOT EXISTS "rescan" (
    "idRescan" TEXT PRIMARY KEY,
    "nRescan" INT NOT NULL,
    "ongoing" INT,
    "archive" INT,
    "RKD" DATE,
    "AFPE" TEXT,
    "newOB" INT NOT NULL,
    "py" INT NOT NULL,
    "ytd" INT NOT NULL,
    "yoyRolling" TEXT,
    "Last_Rescan" TEXT,
    "FK_idApplicazione" INT,
    "FK_idAppOwner" INT,
    FOREIGN KEY(FK_idApplicazione) REFERENCES anagrafica(idApplicazione),
    FOREIGN KEY(FK_idAppOwner) REFERENCES appowner(idAppOwner)
);



