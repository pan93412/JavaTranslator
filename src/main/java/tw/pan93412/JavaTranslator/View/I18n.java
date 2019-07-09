package tw.pan93412.JavaTranslator.View;
import java.util.ResourceBundle;

/**
 * I18N 函式。預設字串檔放在 ...。
 */
public class I18n {
    private ResourceBundle I18nResource = ResourceBundle.getBundle("strings.messages");

    /**
     * 將指定的字串國際化。ID 是類似 <code>view.helpscreenactivity.help1</code>
     * 的東西。
     * 
     * @param id 字串 ID
     * @return 存在預設字串檔的字串。
     */
    public String i18n(String id) throws NullPointerException, java.util.MissingResourceException {
        return I18nResource.getString(id);
    }
}