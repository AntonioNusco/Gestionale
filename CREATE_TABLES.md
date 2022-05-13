# CREATE_TABLES

 create table if not exists "anagrafica" (
    "idapplicazione" int primary key,
    "nome_app" text not null,
    "apmcode" text not null,
    "owneroonboarding" text not null,
    "ownerafp" text not null,
    "gdsunit" text not null,
    "tecnologia" text not null,
    "servermanager" text not null,
    "solocms" text not null,
    "nodoconsole" int,
    "macchina" text not null,
    "noteonboarding" text,
    "fase" text,
    "afpstatus" text,
    "pubblicatodashboard" text,
    "noteappowner" int,
    "avganalysistime" numeric(5, 2),
    "jiraautomationactivation" text,
    "repoavailability" text,
    "automatiostatus" text,
    "automationenablingdate" date,
    "automationnotes" text,
    "greenitindex" text,
    "insertedincastprogram" text,
    "stakeholderengagement" text,
    "launchingmeetingdataggtheringstarting" timestamp,
    "stakeholderbrief" text,
    "onboardingkitdelivery" text,
    "onboardingkitclosing" text,
    "sourcecodefinaldelivery" text,
    "primarestitution" text,
    "done" boolean,
    "linkconfluence" text,
    "businesscriticality" text,
    "devmethodology" text,
    "provider" text
);

create table if not exists "appowner" (
    "idappowner" int primary key,
    "nome" text not null,
    "cognome" text not null,
    "email" text not null ,
    "cell" text,
    "dsunit" text not null
);


create table if not exists "rescan" (
    "idrescan" int primary key,
    "nrescan" int not null,
    "ongoing" int,
    "archive" int,
    "rkd" date,
    "afpe" text,
    "newob" int not null,
    "py" int not null,
    "ytd" int not null,
    "yoyrolling" text,
    "last_rescan" text,
    "fk_idapplicazione" int,
    "fk_idappowner" int,
    foreign key(fk_idapplicazione) references anagrafica(idapplicazione),
    foreign key(fk_idappowner) references appowner(idappowner)
);


create table if not exists "utente" (
  "idutente" int primary key,
  "nome" text not null,
  "cognome" text not null,
  "password" text not null,
  "e-mail" text not null,
  "ruolo" boolean
);

create table if not exists "logfileapp" (
  "idlogapp" int primary key,
  "data" date not null,
  "valoreprecedente" text not null,
  "nuovovalore" text not null,
  "fk_idutente" int not null,
  "fk_idapp" int not null,
  foreign key(fk_idutente) references utente(idutente),
  foreign key(fk_idapp) references anagrafica(idapplicazione)
);

create table if not exists "logfilerescan" (
  "idlogrescan" int primary key,
  "data" date not null,
  "valoreprecedente" text not null,
  "nuovovalore" text not null,
  "fk_idutente" int not null,
  "fk_idrescan" int not null,
  foreign key(fk_idutente) references utente(idutente),
  foreign key(fk_idrescan) references rescan(idrescan)
);

create table if not exists "monitoraggio"(
  "idmonitoraggio" int primary key,
  "fk_idapplicazione" int not null,
  "fk_idappowner" int not null,
  foreign key(fk_idapplicazione) references anagrafica(idapplicazione),
  foreign key(fk_idappowner) references appowner(idappowner)
);



