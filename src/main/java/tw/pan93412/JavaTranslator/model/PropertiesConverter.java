package tw.pan93412.javatranslator.model;
import java.util.Properties;
import java.io.Reader;

/*
 * TODO: 未來會重構
 */

/**
 * 將 Java 的 .properties 轉換成 Translatab
 * leObject。
 * TranslatableObject 是 JavaTranslator 唯一認可的翻譯物件，
 * 而這個轉換函式，可以將 properties 檔轉換成 JavaTranslator 
 * 可以認可的翻譯物件。
 */
public class PropertiesConverter {
    private final Reader source;
    private TranslatableObject tranObj;

    /**
     * 建立 PropertiesConverter 物件，用來將
     * properties 檔轉成 TranslatableObject。
     * 
     * @param source Properties 檔來源，可以使用 
     * <code>java.io.InputStreamReader</code> 等等。
     */
    public PropertiesConverter(Reader source) {
        this.source = source;
    }

    /**
     * 建立 PropertiesConverter 物件，用來將
     * TranslatableObject 轉成 properties 檔。
     *
     * @param tranObj TranslatableObject 物件。
     */
    public PropertiesConverter(TranslatableObject tranObj) {
        this.tranObj = tranObj;
    }
    
    /**
     * 將 .properties 檔轉換成 JavaTranslator 認可的
     * TranslatableObject 物件。
     * 
     * @return TranslatableObject 物件。
     */
    public TranslatableObject ConvertToTranslatableObject() {
        // 將 Reader 轉換成 Properties。
        Properties pObj = new Properties();
        try {
            pObj.load(source);
        } catch (java.io.IOException err) {
            System.err.println("Something Wrong when reading source!"); // TODO: i18n
        }
        
        // 接著，取得 Properties 的所有 Key。
        java.util.Set<String> pObjKeys = pObj.stringPropertyNames();

        // 接著就是將 Properties 的內容遞迴寫入 TranslatableObject 啦！
        for (String key : pObjKeys) {
            tranObj.put(key, pObj.getProperty(key));
        }

        return tranObj;
    }

    /**
     * 將 TranslatableObject 物件轉成可用於
     * 寫入 properties 檔的 Writer。
     * 
     * @return Writer 物件
     */ 
    public TranslatableObject ConvertToProperties() {
        
}



/**
 * 恭喜您找到彩蛋！歡迎回覆這則訊息
 * 表示你找到這顆彩蛋！
 * 
 * 
 * https://t.me/archlinuxcn_offtopic/1415952
 * 迫 真 O C
 */
// da
// Are you OK
// Hello ??? ?A???a//"aolewaOs

// 草 歌詞真難打"
