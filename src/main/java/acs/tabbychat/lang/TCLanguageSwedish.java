package acs.tabbychat.lang;

import java.util.Properties;

public class TCLanguageSwedish extends TCLanguage {
	protected static String provides;
	protected final static Properties defaults = new Properties();
	static {
		provides = "sv_SE";
		defaults.clear();
		
		// Swedish, from Fluffy_lol
		// SWEDISH STRINGS FOR DELIMITERS
		defaults.setProperty("delims.angles", "<Vinklar>");
		defaults.setProperty("delims.braces", "{Klammrar}");
		defaults.setProperty("delims.brackets", "[Konsoler]");
		defaults.setProperty("delims.parenthesis", "(Parenteser)");
		defaults.setProperty("delims.anglesparenscombo", "<(Kombo)Pl.>");
		defaults.setProperty("delims.anglesbracketscombo", "<[Kombo]Pl.>");
		//
		// SWEDISH STRINGS FOR COLORS
		defaults.setProperty("colors.default", "Standard");
		defaults.setProperty("colors.darkblue", "M\u00f6rkbl\u00e5");
		defaults.setProperty("colors.darkgreen", "M\u00f6rkgr\u00f6n");
		defaults.setProperty("colors.darkaqua", "M\u00f6rk Aqua");
		defaults.setProperty("colors.darkred", "M\u00f6rkr\u00f6d");
		defaults.setProperty("colors.purple", "Lila");
		defaults.setProperty("colors.gold", "Guld");
		defaults.setProperty("colors.gray", "Gr\u00e5");
		defaults.setProperty("colors.darkgray", "M\u00f6rkgr\u00e5");
		defaults.setProperty("colors.indigo", "Indigo");
		defaults.setProperty("colors.brightgreen", "Ljusgr\u00f6n");
		defaults.setProperty("colors.aqua", "Aqua");
		defaults.setProperty("colors.red", "R\u00f6d");
		defaults.setProperty("colors.pink", "Rosa");
		defaults.setProperty("colors.yellow", "Gul");
		defaults.setProperty("colors.white", "Vit");
		//
		// SWEDISH STRINGS FOR FORMATS
		defaults.setProperty("formats.default", "Standard");
		defaults.setProperty("formats.bold", "Fetstil");
		defaults.setProperty("formats.striked", "Genomstrykt");
		defaults.setProperty("formats.underline", "Understruket");
		defaults.setProperty("formats.italic", "Kursiv");
		//
		// SWEDISH STRINGS FOR SOUNDS
		// you should really just load this from the language files
		defaults.setProperty("sounds.orb", "Erfarenhetsklot");
		defaults.setProperty("sounds.anvil", "St\u00e4d");
		defaults.setProperty("sounds.bowhit", "Pilb\u00e5gstr\u00e4ff");
		defaults.setProperty("sounds.break", "Bryning");
		defaults.setProperty("sounds.click", "Klick");
		defaults.setProperty("sounds.glass", "Glas");
		defaults.setProperty("sounds.bass", "Bas");
		defaults.setProperty("sounds.harp", "Harpa");
		defaults.setProperty("sounds.pling", "Pling");
		defaults.setProperty("sounds.cat", "Katt");
		defaults.setProperty("sounds.blast", "Explosion");
		defaults.setProperty("sounds.splash", "Skv\u00e4tt");
		defaults.setProperty("sounds.swim", "Simma");
		defaults.setProperty("sounds.bat", "Fladdermus");
		defaults.setProperty("sounds.blaze", "Br\u00e4nnare");
		defaults.setProperty("sounds.chicken", "Kyckling");
		defaults.setProperty("sounds.cow", "Ko");
		defaults.setProperty("sounds.dragon", "Drake");
		defaults.setProperty("sounds.endermen", "Endermen");
		defaults.setProperty("sounds.ghast", "Ghast");
		defaults.setProperty("sounds.pig", "Gris");
		defaults.setProperty("sounds.wolf", "Varg");
		//
		// SWEDISH STRINGS FOR SETTINGS - COMMON
		defaults.setProperty("settings.save", "Spara");
		defaults.setProperty("settings.cancel", "Avbryt");
		defaults.setProperty("settings.new", "Ny");
		defaults.setProperty("settings.delete", "Ta bort");
		//
		// SWEDISH STRINGS FOR SETTINGS - 'GENERAL CONFIG'
		defaults.setProperty("settings.general.name", "Allm\u00e4nt");
		defaults.setProperty("settings.general.tabbychatenable", "TabbyChat Aktiverad");
		defaults.setProperty("settings.general.savechatlog", "Logga chatt till fil");
		defaults.setProperty("settings.general.timestampenable", "Tidsst\u00e4mpla chatt");
		defaults.setProperty("settings.general.timestampstyle", "Tidsst\u00e4mpelstil");
		defaults.setProperty("settings.general.timestampcolor", "Tidsst\u00e4mpelf\u00e4rg");
		defaults.setProperty("settings.general.groupspam", "Konsolidera spammad chat");
		defaults.setProperty("settings.general.unreadflashing", "Blinkade ol\u00e4sta meddelanden som standard");
		//
		// SWEDISH STRING FOR SETTINGS - 'SERVER CONFIG'
		defaults.setProperty("settings.server.name", "Server");
		defaults.setProperty("settings.server.autochannelsearch", "S\u00f6k automatiskt efter nya kanaler");
		defaults.setProperty("settings.server.autopmsearch", "S\u00f6k automatiskt efter nya PMs");
		defaults.setProperty("settings.server.delimiterchars", "Chatt-kanals avgr\u00e4nsare");
		defaults.setProperty("settings.server.delimcolorbool", "F\u00e4rgare avgr\u00e4nsare");
		defaults.setProperty("settings.server.delimformatbool", "Formaterade avgr\u00e4nsare");
		defaults.setProperty("settings.server.defaultchannels", "Standard kanaler");
		defaults.setProperty("settings.server.ignoredchannels", "Ignorerade kanaler");
		//
		// SWEDISH STRING FOR SETTINGS - 'CUSTOM FILTERS'
		defaults.setProperty("settings.filters.name", "Filter");
		defaults.setProperty("settings.filters.inversematch", "Invers match");
		defaults.setProperty("settings.filters.casesensitive", "Skiftl\u00e4gesk\u00e4nsligt");
		defaults.setProperty("settings.filters.highlightbool", "Markera matcher");
		defaults.setProperty("settings.filters.highlightcolor", "F\u00e4rg");
		defaults.setProperty("settings.filters.highlightformat", "Format");
		defaults.setProperty("settings.filters.audionotificationbool", "Ljudnotifiering");
		defaults.setProperty("settings.filters.audionotificationsound", "Ljud");
		defaults.setProperty("settings.filters.filtername", "Filter Namn");
		defaults.setProperty("settings.filters.sendtotabbool", "Skicka matcher till flik");
		defaults.setProperty("settings.filters.sendtotabname", "Fliknamn");
		defaults.setProperty("settings.filters.sendtoalltabs", "Alla flikar");
		defaults.setProperty("settings.filters.removematches", "G\u00f6m matcher fr\u00e5n chatten");
		defaults.setProperty("settings.filters.expressionstring", "Uttryck");
		//
		// SWEDISH STRINGS FOR SETTINGS - 'ADVANCED SETTINGS'
		defaults.setProperty("settings.advanced.name", "Avancerat");
		defaults.setProperty("settings.advanced.chatscrollhistory", "Chatt historik att spara (rader)");
		defaults.setProperty("settings.advanced.maxlengthchannelname", "Kanalnamn max. l\u00e4ngd");
		defaults.setProperty("settings.advanced.multichatdelay", "Multi-chatt skickningsf\u00f6rdr\u00f6jning (ms)");
		defaults.setProperty("settings.advanced.chatboxunfocheight", "Ofokuserad h\u00f6jd");
		defaults.setProperty("settings.advanced.chatfadeticks", "Chatt borttonings tid (ticks)");
		defaults.setProperty("settings.advanced.forceunicode", "Tvinga Unicode Chatt Rendering");
		//
		// SWEDISH STRINGS FOR SETTINGS - CHAT CHANNEL
		defaults.setProperty("settings.channel.notificationson", "Ol\u00e4sta meddelanden");
		defaults.setProperty("settings.channel.alias", "Alias");
		defaults.setProperty("settings.channel.cmdprefix", "Chatt kommando prefix");
		defaults.setProperty("settings.channel.position", "Position:");
		defaults.setProperty("settings.channel.of", "av");
		defaults.setProperty("settings.channel.hideprefix", "G\u00f6m prefix medans du skriver");
		//
		// SWEDISH STRINGS FOR MESSAGES
		defaults.setProperty("messages.update1", "En uppdatering \u00e4r tillg\u00e4nglig! (Nuvarande version \u00e4r");
		defaults.setProperty("messages.update2", ", nyaste \u00e4r");
		defaults.setProperty("messages.update3", "Bes\u00f6k TabbyChat forum tr\u00e5den p\u00e5 minecraftforum.net f\u00f6r att ladda ner");
	}

}
