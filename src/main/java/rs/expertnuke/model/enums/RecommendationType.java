package rs.expertnuke.model.enums;

public enum RecommendationType {

	R1("Postepena redukcija", "Kontrolisano smanjenje fisione aktivnosti spuštanjem kontrolnih šipki u jezgro"),
	R2("Hitno gašenje reaktora",
			"Ubacivanje svih kontrolnih šipki u jezgro odjednom - momentalni prestanak lančane reakcije"),
	R3("Povećanje protoka rashladne vode",
			"Aktiviranje rezervnih pumpi primarnog rashladnog kola radi boljeg odvođenja toplote iz jezgra"),
	R4("Aktiviranje ECCS-a (Emergency Core Cooling System)",
			"Automatsko paljenje sistema koji vodom preplavljuje jezgro"),
	R5("Aktiviranje sekundarnog sistema hlađenja",
			"Prebacivanje na rezervni rashladni krug kada primarni zakaže ili bude izolovan"),
	R6("Zatvaranje ventila pri curenju rashladnog kola", "Zatvaranje ventila na cevima kroz koje teče rashladna voda"),
	R7("Kontrolisana dekompresija primarnog kola",
			"Namerno otvaranje ventila za ispuštanje pritiska kada preti pucanje cevi ili reaktorskog suda"),
	R8("Prelazak na rezervno napajanje - dizel-generatori",
			"Pokretanje dizel-generatora koji napajaju pumpe i sisteme sigurnosti pri nestanku struje"),
	R9("Pasivno hlađenje gravitacijom i konvekcijom",
			"Hlađenje jezgra bez pumpi i struje - voda cirkuliše sama zbog razlike temperatura i gravitacije"),
	R10("Zabrana podizanja snage - zaključavanje komandi",
			"Softverska blokada koja onemogućava operateru da poveća snagu u nestabilnom režimu"),
	R11("Hemijsko gašenje reakcije bornom kiselinom",
			"Ubrizgavanje borne kiseline u rashladnu vodu koja apsorbuje neutrone"),
	R12("Prelazak na hot standby režim",
			"Reaktor ostaje topao, ali ne proizvodi energiju - spreman za hlađenje ili ponovni start pod nadzorom"),
	R13("Hladno gašenje reaktora - cold shutdown režim",
			"Trajno gašenje i hlađenje jezgra ispod 100°C, dugotrajna procedura koja traje više sati"),
	R14("Hermetičko zatvaranje zaštitne zgrade",
			"Zatvaranje svih otvora, ventila i prolaza kroz betonsku zgradu da bi se sprečilo curenje radijacije"),
	R15("Evakuacija osoblja iz kontrolne sale",
			"Povlačenje osoblja na sigurnu lokaciju i prelazak na daljinsko upravljanje reaktorom"),
	R16("Proglašavanje nuklearne vanredne situacije",
			"Obaveštavanje državnih organa, IAEA i aktiviranje kriznog štaba za upravljanje nesrećom"),
	R17("Potiskivanje kiseonika azotom",
			"Punjenje zaštitne zgrade azotom koji istiskuje kiseonik i onemogućava eksploziju vodonika"),
	R18("Katalitičko uklanjanje vodonika",
			"Pasivni uređaji koji spajaju vodonik sa kiseonikom u vodu pre nego što dostigne eksplozivnih 4% zapremine"),
	R19("Stabilizacija u ksenon-jami",
			"Zadržavanje reaktora na niskoj snazi i čekanje da se ksenon prirodno raspadne, bez pokušaja podizanja snage"),
	R20("Zabrana nestandardnih testova i eksperimenata",
			"Blokada svih planiranih eksperimenata i nerutinskih procedura dok je reaktor u nestabilnom stanju"),
	R21("Kontrolisano ispuštanje pritiska kroz filtere",
			"Namerno ispuštanje gasa iz zaštitne zgrade kroz filtere koji zadržavaju radioaktivne čestice"),
	R22("Inspekcija i zamena oštećenih kontrolnih šipki",
			"Nalog za pregled mehanizma šipki pri detektovanom zaglavljivanju ili nepotpunom ubacivanju u jezgro"),
	R23("Monitoring tla i podzemnih voda",
			"Aktiviranje senzora koji prate da li radioaktivne materije cure iz postrojenja u okolno tlo i vodu"),
	R24("Korekcija distribucije snage po jezgru",
			"Preraspodela šipki radi uklanjanja žarišta u pojedinim zonama jezgra"),
	R25("Zaštita i hlađenje bazena istrošenog goriva",
			"Osiguravanje nivoa vode i hlađenja u bazenu gde se čuva istrošeno gorivo")

	;

	private final String name;
	private final String description;

	RecommendationType(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
