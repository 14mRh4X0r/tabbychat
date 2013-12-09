package acs.tabbychat.lang;

import java.util.Properties;

public class TCLanguageFinnish extends TCLanguage {
	protected static String provides;
	protected final static Properties defaults = new Properties();
	static {
		provides = "fi_FI";
		defaults.clear();
		
		// Finnish, from CutePanda
		//  FINNISH STRINGS FOR DELIMITERS
		defaults.setProperty("delims.angles", "<Kulmat>");
		defaults.setProperty("delims.braces", "{Aaltosulkeet}");
		defaults.setProperty("delims.brackets", "[Sulkeet]");
		defaults.setProperty("delims.parenthesis", "(Kaarisulkeet)");
		defaults.setProperty("delims.anglesparenscombo", "<(Yhdistelm\u00e4)>");
		defaults.setProperty("delims.anglesbracketscombo", "<[Yhdistelm\u00e4]>");
		// 
		//  FINNISH STRINGS FOR COLORS
		defaults.setProperty("colors.default", "Tavallinen");
		defaults.setProperty("colors.darkblue", "Tummansininen");
		defaults.setProperty("colors.darkgreen", "Tummanvihre\u00e4");
		defaults.setProperty("colors.darkaqua", "Meriveden Tumma");
		defaults.setProperty("colors.darkred", "Tummanpunainen");
		defaults.setProperty("colors.purple", "Purppura");
		defaults.setProperty("colors.gold", "Kultainen");
		defaults.setProperty("colors.gray", "Harmaa");
		defaults.setProperty("colors.darkgray", "Tummanharmaa");
		defaults.setProperty("colors.indigo", "Syv\u00e4n Sininen");
		defaults.setProperty("colors.brightgreen", "Vaaleanvihre\u00e4");
		defaults.setProperty("colors.aqua", "Meriveden Sininen");
		defaults.setProperty("colors.red", "Punainen");
		defaults.setProperty("colors.pink", "Vaaleanpunainen");
		defaults.setProperty("colors.yellow", "Keltainen");
		defaults.setProperty("colors.white", "Valkoinen");
		// 
		//  FINNISH STRINGS FOR FORMATS
		defaults.setProperty("formats.default", "Tavallinen");
		defaults.setProperty("formats.bold", "Lihava");
		defaults.setProperty("formats.striked", "Yliviivattu");
		defaults.setProperty("formats.underline", "Alleviivattu");
		defaults.setProperty("formats.italic", "Kursivoitu");
		// 
		//  FINNISH STRINGS FOR SOUNDS
		defaults.setProperty("sounds.orb", "Xp");
		defaults.setProperty("sounds.anvil", "Alasin");
		defaults.setProperty("sounds.bowhit", "Jousen Osuma");
		defaults.setProperty("sounds.break", "Rikkuminen");
		defaults.setProperty("sounds.click", "Napsahdus");
		defaults.setProperty("sounds.glass", "Lasi");
		defaults.setProperty("sounds.bass", "Basso");
		defaults.setProperty("sounds.harp", "Harppu");
		defaults.setProperty("sounds.pling", "Pling");
		defaults.setProperty("sounds.cat", "Kissa");
		defaults.setProperty("sounds.blast", "R\u00e4j\u00e4hdys");
		defaults.setProperty("sounds.splash", "Roiske");
		defaults.setProperty("sounds.swim", "Uinti");
		defaults.setProperty("sounds.bat", "Lepakko");
		defaults.setProperty("sounds.blaze", "Roihu");
		defaults.setProperty("sounds.chicken", "Kana");
		defaults.setProperty("sounds.cow", "Lehm\u00e4");
		defaults.setProperty("sounds.dragon", "Lohik\u00e4\u00e4rme");
		defaults.setProperty("sounds.endermen", "\u00c4\u00e4rel\u00e4inen");
		defaults.setProperty("sounds.ghast", "Hornanhenki");
		defaults.setProperty("sounds.pig", "Sika");
		defaults.setProperty("sounds.wolf", "Susi");
		// 
		//  FINNISH STRINGS FOR SETTINGS - COMMON
		defaults.setProperty("settings.save", "Tallenna");
		defaults.setProperty("settings.cancel", "Peruuta");
		defaults.setProperty("settings.new", "Uusi");
		defaults.setProperty("settings.delete", "Poista");
		// 
		//  FINNISH STRINGS FOR SETTINGS - 'GENERAL CONFIG'
		defaults.setProperty("settings.general.name", "Yleiset");
		defaults.setProperty("settings.general.tabbychatenable", "TabbyChat p\u00e4\u00e4ll\u00e4");
		defaults.setProperty("settings.general.savechatlog", "Merkitse keskustelu tiedostoon");
		defaults.setProperty("settings.general.timestampenable", "Aikaleima juttelussa");
		defaults.setProperty("settings.general.timestampstyle", "Aikaleiman tyyli");
		defaults.setProperty("settings.general.timestampcolor", "Aikaleiman v\u00e4ri");
		defaults.setProperty("settings.general.groupspam", "Tallenna sp\u00e4mm\u00e4tty keskustelu");
		defaults.setProperty("settings.general.unreadflashing", "Tavallinen lukemattoman viestin v\u00e4lkkyminen");
		// 
		//  FINNISH STRING FOR SETTINGS - 'SERVER CONFIG'
		defaults.setProperty("settings.server.name", "Palvelin");
		defaults.setProperty("settings.server.autochannelsearch", "Etsi automaattisesti uusia kanavia");
		defaults.setProperty("settings.server.delimiterchars", "Keskustelu kanavien eroittelu");
		defaults.setProperty("settings.server.delimcolorbool", "V\u00e4rilliset eroittimet");
		defaults.setProperty("settings.server.delimformatbool", "Muotoillut eroittimet");
		defaults.setProperty("settings.server.defaultchannels", "Tavalliset kanavat");
		defaults.setProperty("settings.server.ignoredchannels", "Sivuutetut kanavat");
		// 
		//  FINNISH STRING FOR SETTINGS - 'CUSTOM FILTERS'
		defaults.setProperty("settings.filters.name", "Suodattimet");
		defaults.setProperty("settings.filters.inversematch", "K\u00e4\u00e4nteinen osuma");
		defaults.setProperty("settings.filters.casesensitive", "Yhteensopiva");
		defaults.setProperty("settings.filters.highlightbool", "Korosta osumat");
		defaults.setProperty("settings.filters.highlightcolor", "V\u00e4ri");
		defaults.setProperty("settings.filters.highlightformat", "Muotoilu");
		defaults.setProperty("settings.filters.audionotificationbool", "\u00c4\u00e4ni huomautus");
		defaults.setProperty("settings.filters.audionotificationsound", "\u00c4\u00e4ni");
		defaults.setProperty("settings.filters.filtername", "Suodattimen nimi");
		defaults.setProperty("settings.filters.sendtotabbool", "L\u00e4het\u00e4 osumat v\u00e4lilehteen");
		defaults.setProperty("settings.filters.sendtotabname", "V\u00e4lilehden nimi");
		defaults.setProperty("settings.filters.sendtoalltabs", "Kaikki v\u00e4lilehdet");
		defaults.setProperty("settings.filters.removematches", "Piilota osumat keskustelusta");
		defaults.setProperty("settings.filters.expressionstring", "Ilmaisu");
		// 
		//  FINNISH STRINGS FOR SETTINGS - 'ADVANCED SETTINGS'
		defaults.setProperty("settings.advanced.name", "Edistynyt");
		defaults.setProperty("settings.advanced.chatscrollhistory", "Keskustelun s\u00e4ilytetty historia (rivit)");
		defaults.setProperty("settings.advanced.maxlengthchannelname", "Kanavan nimen maksimi pituus");
		defaults.setProperty("settings.advanced.multichatdelay", "Monen viestin v\u00e4liss\u00e4 oleva aika (ms)");
		defaults.setProperty("settings.advanced.chatboxunfocheight", "Huomioimattomien korkeus (rivit)");
		defaults.setProperty("settings.advanced.chatfadeticks", "Keskustelun haalistumis aika (tickit)");
		defaults.setProperty("settings.advanced.forceunicode", "Pakota Unicode Keskustelun n\u00e4ytt\u00e4minen");
		// 
		//  FINNISH STRINGS FOR SETTINGS - CHAT CHANNEL
		defaults.setProperty("settings.channel.notificationson", "Lukemattomat muistiinpanot");
		defaults.setProperty("settings.channel.alias", "Toiselta nimelt\u00e4\u00e4n");
		defaults.setProperty("settings.channel.cmdprefix", "Keskustellun komennon etuliite");
		defaults.setProperty("settings.channel.position", "Sijainti:");
		defaults.setProperty("settings.channel.of", "");
		// 
		//  FINNISH STRINGS FOR MESSAGES
		defaults.setProperty("messages.update1", "Uusi p\u00e4ivitys on saatavissa! (T\u00e4m\u00e4n hetkinen versio on");
		defaults.setProperty("messages.update2", ", uusin on");
		defaults.setProperty("messages.update3", "K\u00e4y katsomassa TabbyChat forumi minecraftforum.net:ss\u00e4 lataaksesi sen");
	}
}
