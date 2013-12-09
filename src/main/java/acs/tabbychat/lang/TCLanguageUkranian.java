package acs.tabbychat.lang;

import java.util.Properties;

public class TCLanguageUkranian extends TCLanguage {
	protected static String provides;
	protected final static Properties defaults = new Properties();
	static {
		provides = "uk_UA";
		defaults.clear();
		
		//  Ukranian, from eXtendedZero
		//  UKRANIAN STRINGS FOR DELIMITERS
		defaults.setProperty("delims.angles", "<\u041a\u0443\u0442\u0438>");
		defaults.setProperty("delims.braces", "{\u0424\u0456\u0433\u0443\u0440\u043d\u0456}");
		defaults.setProperty("delims.brackets", "[\u041a\u0432\u0430\u0434\u0440\u0430\u0442\u043d\u0456]");
		defaults.setProperty("delims.parenthesis", "(\u041a\u0440\u0443\u0433\u043b\u0456)");
		defaults.setProperty("delims.anglesparenscombo", "<(\u041a\u043e\u043c\u0431\u043e)Pl.>");
		defaults.setProperty("delims.anglesbracketscombo", "<(\u041a\u043e\u043c\u0431\u043e)Pl.>");
		// 
		//  UKRANIAN STRINGS FOR COLORS
		defaults.setProperty("colors.default", "\u041f\u043e \u0437\u0430\u043c\u043e\u0432\u0447.");
		defaults.setProperty("colors.darkblue", "\u0422\u0435\u043c\u043d\u043e \u0421\u0438\u043d\u0456\u0439");
		defaults.setProperty("colors.darkgreen", "\u0422\u0435\u043c\u043d\u043e \u0417\u0435\u043b\u0435\u043d\u0438\u0439");
		defaults.setProperty("colors.darkaqua", "\u0422\u0435\u043c\u043d\u043e \u0413\u043e\u043b\u0443\u0431\u0438\u0439");
		defaults.setProperty("colors.darkred", "\u0422\u0435\u043c\u043d\u043e \u0427\u0435\u0440\u0432\u043e\u043d\u0438\u0439");
		defaults.setProperty("colors.purple", "\u0424\u0456\u043e\u043b\u0435\u0442\u043e\u0432\u0438\u0439");
		defaults.setProperty("colors.gold", "\u0417\u043e\u043b\u043e\u0442\u0438\u0439");
		defaults.setProperty("colors.gray", "\u0421\u0456\u0440\u0438\u0439");
		defaults.setProperty("colors.darkgray", "\u0422\u0435\u043c\u043d\u043e \u0421\u0456\u0440\u0438\u0439");
		defaults.setProperty("colors.indigo", "\u0406\u043d\u0434\u0456\u0433\u043e");
		defaults.setProperty("colors.brightgreen", "\u0421\u0456\u0442\u043b\u043e \u0417\u0435\u043b\u0435\u043d\u0438\u0439");
		defaults.setProperty("colors.aqua", "\u0413\u043e\u043b\u0443\u0431\u0438\u0439");
		defaults.setProperty("colors.red", "\u0427\u0435\u0440\u0432\u043e\u043d\u0438\u0439");
		defaults.setProperty("colors.pink", "\u0420\u043e\u0436\u0435\u0432\u0438\u0439");
		defaults.setProperty("colors.yellow", "\u0416\u043e\u0432\u0442\u0438\u0439");
		defaults.setProperty("colors.white", "\u0411\u0456\u043b\u0438\u0439");
		// 
		//  UKRANIAN STRINGS FOR FORMATS
		defaults.setProperty("formats.default", "\u041f\u043e \u0437\u0430\u043c\u043e\u0432\u0447.");
		defaults.setProperty("formats.bold", "\u0416\u0438\u0440\u043d\u0438\u0439");
		defaults.setProperty("formats.striked", "\u0417\u0430\u043a\u0440\u0435\u0441\u043b\u0435\u043d\u0438\u0439");
		defaults.setProperty("formats.underline", "\u041f\u0456\u0434\u0441\u043a\u0440\u0435\u0441\u043b\u0435\u043d\u0438\u0439");
		defaults.setProperty("formats.italic", "\u041a\u0443\u0440\u0441\u0438\u0432");
		// 
		//  UKRANIAN STRINGS FOR SOUNDS
		defaults.setProperty("sounds.orb", "\u0414\u043e\u0441\u0432\u0456\u0434");
		defaults.setProperty("sounds.anvil", "\u041a\u043e\u0432\u0430\u0434\u043b\u043e");
		defaults.setProperty("sounds.bowhit", "\u0421\u0442\u0440\u0456\u043b\u0430");
		defaults.setProperty("sounds.break", "\u0417\u043b\u0430\u043c\u0430\u0432");
		defaults.setProperty("sounds.click", "\u041a\u043b\u0456\u043a");
		defaults.setProperty("sounds.glass", "\u0421\u043a\u043b\u043e");
		defaults.setProperty("sounds.bass", "\u0411\u0430\u0441");
		defaults.setProperty("sounds.harp", "\u0410\u0440\u0444\u0430");
		defaults.setProperty("sounds.pling", "Pling");
		defaults.setProperty("sounds.cat", "\u041a\u0456\u0442");
		defaults.setProperty("sounds.blast", "\u0412\u0438\u0431\u0443\u0445");
		defaults.setProperty("sounds.splash", "\u0421\u043f\u043b\u0435\u0441\u043a");
		defaults.setProperty("sounds.swim", "\u0421\u043f\u0440\u0443\u0442");
		defaults.setProperty("sounds.bat", "\u041b\u0435\u0442\u044e\u0447\u0430 \u041c\u0438\u0448\u0430");
		defaults.setProperty("sounds.blaze", "\u0411\u043b\u0435\u0439\u0437");
		defaults.setProperty("sounds.chicken", "\u041a\u0443\u0440\u043a\u0430");
		defaults.setProperty("sounds.cow", "\u041a\u043e\u0440\u043e\u0432\u0430");
		defaults.setProperty("sounds.dragon", "\u0414\u0440\u0430\u043a\u043e\u043d");
		defaults.setProperty("sounds.endermen", "\u0415\u043d\u0434\u0435\u0440\u043c\u0430\u043d");
		defaults.setProperty("sounds.ghast", "\u0413\u0430\u0441\u0442");
		defaults.setProperty("sounds.pig", "\u0421\u0432\u0438\u043d\u044f");
		defaults.setProperty("sounds.wolf", "\u0412\u043e\u0432\u043a");
		// 
		//  UKRANIAN STRINGS FOR SETTINGS - COMMON
		defaults.setProperty("settings.save", "\u0417\u0431\u0435\u0440\u0435\u0433\u0442\u0438");
		defaults.setProperty("settings.cancel", "\u0412\u0456\u0434\u043c\u0456\u043d\u0430");
		defaults.setProperty("settings.new", "\u041d\u043e\u0432\u0438\u0439");
		defaults.setProperty("settings.delete", "\u0412\u0438\u0434\u0430\u043b\u0438\u0442\u0438");
		// 
		//  UKRANIAN STRINGS FOR SETTINGS - 'GENERAL CONFIG'
		defaults.setProperty("settings.general.name", "\u0413\u043e\u043b\u043e\u0432\u043d\u0435");
		defaults.setProperty("settings.general.tabbychatenable", "TabbyChat \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0439");
		defaults.setProperty("settings.general.savechatlog", "\u041b\u043e\u0433 \u0447\u0430\u0442\u0443 \u0443 \u0444\u0430\u0439\u043b");
		defaults.setProperty("settings.general.timestampenable", "\u0412\u0456\u0434\u043c\u0456\u0442\u043a\u0430 \u0447\u0430\u0441\u0443 \u0447\u0430\u0442\u0443");
		defaults.setProperty("settings.general.timestampstyle", "\u0421\u0442\u0438\u043b\u044c \u0432\u0456\u0434\u043c\u0456\u0442\u043a\u0438 \u0447\u0430\u0441\u0443");
		defaults.setProperty("settings.general.timestampcolor", "\u041a\u043e\u043b\u0456\u0440 \u0432\u0456\u0434\u043c\u0456\u0442\u043a\u0438 \u0447\u0430\u0441\u0443");
		defaults.setProperty("settings.general.groupspam", "\u0413\u0440\u0443\u043f\u0443\u0432\u0430\u0442\u0438 \u043e\u0434\u043d\u0430\u043a\u043e\u0432\u0456 \u043f\u043e\u0432\u0456\u0434\u043e\u043c\u043b\u0435\u043d\u043d\u044f");
		defaults.setProperty("settings.general.unreadflashing", "\u041f\u043e\u0432\u0456\u0434\u043e\u043c\u043b\u0435\u043d\u043d\u044f \u043f\u0440\u043e \u043d\u0435\u043f\u0440\u043e\u0447\u0438\u0442\u0430\u043d\u0435");
		// 
		//  UKRANIAN STRING FOR SETTINGS - 'SERVER CONFIG'
		defaults.setProperty("settings.server.name", "\u0421\u0435\u0440\u0432\u0435\u0440");
		defaults.setProperty("settings.server.autochannelsearch", "\u0410\u0432\u0442\u043e \u043f\u043e\u0448\u0443\u043a \u043d\u043e\u0432\u0438\u0445 \u043a\u0430\u043d\u0430\u043b\u0456\u0432");
		defaults.setProperty("settings.server.delimiterchars", "\u0420\u043e\u0437\u0434\u0456\u043b\u044c\u043d\u0438\u043a \u043a\u0430\u043d\u0430\u043b\u0456\u0432");
		defaults.setProperty("settings.server.delimcolorbool", "\u041a\u043e\u043b\u044c\u043e\u0440\u043e\u0432\u0456 \u0440\u043e\u0437\u0434\u0456\u043b\u044c\u043d\u0438\u043a\u0438");
		defaults.setProperty("settings.server.delimformatbool", "\u0424\u043e\u0440\u043c\u0430\u0442\u043e\u0432\u0430\u043d\u0456 \u0440\u043e\u0437\u0434\u0456\u043b\u044c\u043d\u0438\u043a\u0438");
		defaults.setProperty("settings.server.defaultchannels", "\u041a\u0430\u043d\u0430\u043b\u0438 \u043f\u043e \u0437\u0430\u043c\u043e\u0432\u0447\u0443\u0432\u0430\u043d\u043d\u0456");
		defaults.setProperty("settings.server.ignoredchannels", "\u041a\u0430\u043d\u0430\u043b\u0438, \u0449\u043e \u0456\u0433\u043d\u043e\u0440\u0443\u044e\u0442\u044c\u0441\u044f");
		// 
		//  UKRANIAN STRING FOR SETTINGS - 'CUSTOM FILTERS'
		defaults.setProperty("settings.filters.name", "\u0424\u0456\u043b\u044c\u0442\u0440\u0438");
		defaults.setProperty("settings.filters.inversematch", "\u0406\u043d\u0432\u0435\u0440\u0442\u0443\u0432\u0430\u0442\u0438");
		defaults.setProperty("settings.filters.casesensitive", "\u0412\u0440\u0430\u0445\u043e\u0432\u0443\u0432\u0430\u0442\u0438 \u0440\u0435\u0433\u0456\u0441\u0442\u0440");
		defaults.setProperty("settings.filters.highlightbool", "\u041f\u0456\u0434\u0441\u0432\u0456\u0447\u0443\u0432\u0430\u0442\u0438 \u0441\u043f\u0456\u0432\u043f\u0430\u0434\u0430\u043d\u043d\u044f");
		defaults.setProperty("settings.filters.highlightcolor", "\u041a\u043e\u043b\u0456\u0440");
		defaults.setProperty("settings.filters.highlightformat", "\u0424\u043e\u0440\u043c\u0430\u0442");
		defaults.setProperty("settings.filters.audionotificationbool", "\u0410\u0443\u0434\u0456\u043e \u0441\u043f\u043e\u0432\u0456\u0449\u0435\u043d\u043d\u044f");
		defaults.setProperty("settings.filters.audionotificationsound", "\u0417\u0432\u0443\u043a");
		defaults.setProperty("settings.filters.filtername", "\u0406\u043c'\u044f \u0424\u0456\u043b\u044c\u0442\u0440\u0443");
		defaults.setProperty("settings.filters.sendtotabbool", "\u041d\u0430\u0434\u0441\u0438\u043b\u0430\u0442\u0438 \u0441\u043f\u0456\u0432\u043f\u0430\u0434\u0430\u043d\u043d\u044f \u0443 \u0432\u043a\u043b\u0430\u0434\u043a\u0443");
		defaults.setProperty("settings.filters.sendtotabname", "\u0406\u043c'\u044f \u0412\u043a\u043b\u0430\u0434\u043a\u0438");
		defaults.setProperty("settings.filters.sendtoalltabs", "\u0412\u0441\u0456 \u0432\u043a\u043b\u0430\u0434\u043a\u0438");
		defaults.setProperty("settings.filters.removematches", "\u0425\u043e\u0432\u0430\u0442\u0438 \u0441\u043f\u0456\u0432\u043f\u0430\u0434\u0430\u043d\u043d\u044f \u0437 \u0447\u0430\u0442\u0443");
		defaults.setProperty("settings.filters.expressionstring", "\u0412\u0438\u0440\u0430\u0437");
		// 
		//  UKRANIAN STRINGS FOR SETTINGS - 'ADVANCED SETTINGS'
		defaults.setProperty("settings.advanced.name", "\u0414\u043e\u0434\u0430\u0442\u043a\u043e\u0432\u043e");
		defaults.setProperty("settings.advanced.chatscrollhistory", "\u0406\u0441\u0442\u043e\u0440\u0456\u044f \u0447\u0430\u0442\u0443 (\u043b\u0456\u043d\u0456\u0457)");
		defaults.setProperty("settings.advanced.maxlengthchannelname", "\u041c\u0430\u043a\u0441. \u0434\u043e\u0432\u0436\u0438\u043d\u0430 \u0456\u043c\u0435\u043d\u0456 \u043a\u0430\u043d\u0430\u043b\u0443");
		defaults.setProperty("settings.advanced.multichatdelay", "\u0417\u0430\u0442\u0440\u0438\u043c\u043a\u0430 \u0432\u0456\u0434\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u043d\u044f \u0443 \u043c\u0443\u043b\u044c\u0442\u0438\u0447\u0430\u0442 (\u041c\u0441)");
		defaults.setProperty("settings.advanced.chatboxunfocheight", "\u0412\u0438\u0441\u043e\u0442\u0430 \u043d\u0435\u0430\u043a\u0442\u0438\u0432\u043d\u043e\u0433\u043e \u0447\u0430\u0442\u0443");
		defaults.setProperty("settings.advanced.chatfadeticks", "\u0427\u0430\u0441 \u0437\u043d\u0438\u043a\u043d\u0435\u043d\u043d\u044f (\u0442\u0456\u043a)");
		defaults.setProperty("settings.advanced.forceunicode", "\u042e\u043d\u0456\u043a\u043e\u0434 \u0440\u0435\u043d\u0434\u0435\u0440\u0438\u043d\u0433");
		// 
		//  UKRANIAN STRINGS FOR SETTINGS - CHAT CHANNEL
		defaults.setProperty("settings.channel.notificationson", "\u041d\u0435\u043f\u0440\u043e\u0447\u0438\u0442\u0430\u043d\u0456 \u043f\u043e\u0432\u0456\u0434\u043e\u043c\u043b\u0435\u043d\u043d\u044f");
		defaults.setProperty("settings.channel.alias", "\u0410\u043b\u0456\u0430\u0441\u0438");
		defaults.setProperty("settings.channel.cmdprefix", "\u041f\u0440\u0435\u0444\u0456\u043a\u0441 \u043a\u043e\u043c\u0430\u043d\u0434 \u0447\u0430\u0442\u0443");
		defaults.setProperty("settings.channel.position", "\u041f\u043e\u0437\u0438\u0446\u0456\u044f:");
		defaults.setProperty("settings.channel.of", "\u0437");
		// 
		//  UKRANIAN STRINGS FOR MESSAGES
		defaults.setProperty("messages.update1", "\u0417\u043d\u0430\u0439\u0434\u0435\u043d\u043e \u043e\u043d\u043e\u0432\u043b\u0435\u043d\u043d\u044f! (\u041f\u043e\u0442\u043e\u0447\u043d\u0430 \u0432\u0435\u0440\u0441\u0456\u044f ");
		defaults.setProperty("messages.update2", ", \u043d\u043e\u0432\u0430 ");
		defaults.setProperty("messages.update3", "\u0412\u0456\u0434\u0432\u0456\u0434\u0430\u0439\u0442\u0435 \u0444\u043e\u0440\u0443\u043c TabbyChat \u043d\u0430 minecraftforum.net \u0434\u043b\u044f \u043e\u043d\u043e\u0432\u043b\u0435\u043d\u043d\u044f.");
	}
}
