package tw.pan93412.JavaTranslator.View;
import java.util.ResourceBundle;
import java.util.Locale;

/**
 * I18N 函式。
 */
public class I18n {
    private static ResourceBundle L10nRes = ResourceBundle.getBundle("strings.messages");
    private static ResourceBundle I18nRes = ResourceBundle.getBundle("strings.messages", Locale.ROOT);
    /**
     * 將指定的字串國際化。ID 是類似 <code>view.helpscreenactivity.help1</code>
     * 的東西。
     * 
     * @param id 字串 ID
     * @return 存在預設字串檔的字串。
     */
    public static String i18n(String id) throws NullPointerException, 
                                        java.util.MissingResourceException {
        if (L10nRes.containsKey(id)) {
            return L10nRes.getString(id);
        }
        return I18nRes.getString(id);
    }
}