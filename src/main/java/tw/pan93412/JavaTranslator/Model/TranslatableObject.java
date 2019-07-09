package tw.pan93412.JavaTranslator.Model;
import java.util.HashMap;

/**
 * 可翻譯通用物件。
 * <p>
 * 每個可翻譯物件（例如 Properties 檔或 strings.xml） 都可以被解析成 <code>TranslatableObject</code>
 * 物件。 <code>TranslatableObject</code> 如同 <code>HashMap</code> （實際上也是 HashMap
 * 的繼承），但是也附加了些功能，例如 setLang() 設定語言（標籤）等等。
 * </p>
 * 
 * <p>
 * 因為是繼承 <code>HashMap</code>，所以大部分的功能請都直接參考
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">
 * 這份文件</a>，基本上你可以把 <code>HashMap</code> 的 <code>key</code> 想成 「原文 / 原文
 * ID」，<code>value</code> 想成「譯文」。
 * </p>
 * 
 */
public class TranslatableObject extends HashMap<String, String> {
    private static final long serialVersionUID = 7327929052697765649L;
    private static String language;

    /**
     * 設定這個 TranslatableObject 的語言。
     * 其實「設定語言」現在是沒什麼用的，但在未來
     * 提供複數規則之後，可能會在設定語言時直接填入
     * 相對應的規則。直至 v0.1 釋出時，這僅是一個
     * 用來指明「可翻譯通用物件」語言的標籤。
     * 
     * @param lang 語言名稱，
     * 例如 zh_TW、zh_CN、en_US。
     */
    public void setLang(String lang) {
        language = lang;
    }

    /**
     * 取得 TranslatableObject 的語言。
     * 這標籤可以用來在您的程式顯示，例如：
     * [正在翻譯 xxx 語言]。
     * 
     * @return 語言名稱，例如 zh_TW、en_US。
     */
    public String getLang() {
        return language;
    }

    /**
     * 合併 ref 和現有 TranslatableObject 物件 (def)。
     * 先遞迴 ref 的 Key，如果 def 也有相對應的 Key，
     * 則將 <code>(ref 的 Key, def 的 Value)</code> 寫入 
     * result (新的 TranslatableObject 物件)，如果 def
     * 沒有相對應的 Key，則寫入 <code>(ref 的 Key, ref 的 Value)</code>。
     * 
     * def 與 ref 是來自 Gettext 工具。
     * 
     * @param ref 參考來源 (reference)
     * @return 合併過的 TranslatableObject。
     */
    public TranslatableObject mergeWith(TranslatableObject ref) {
        TranslatableObject def = this;
        TranslatableObject result = new TranslatableObject();

        for ( String refKey : ref.keySet() ) {
			if (def.containsKey(refKey)) {
                result.put(refKey, def.get(refKey));
            } else {
                result.put(refKey, ref.get(refKey));
            }
        }
        return result;
    }
}