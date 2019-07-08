package tw.pan93412.JavaTranslator.Model;
import java.util.Properties;

/*
 * INFO: 已簡易重構。
 * 與 v1.0-SNAPSHOT **完全不相容**。
 */

/**
 * 將 Java 的 .properties 轉換成 TranslatableObject。
 * TranslatableObject 是 JavaTranslator 唯一認可的翻譯物件，
 * 而這個轉換函式，可以將 properties 檔轉換成 JavaTranslator 
 * 可以認可的翻譯物件。
 */
public class PropertiesConverter {
    private Properties pObj = new Properties();
    private TranslatableObject tranObj = new TranslatableObject();

    /**
     * 建立 PropertiesConverter 物件，用來將
     * Properties 物件轉成 TranslatableObject。
     * 
     * @param propertiesObject properties 物件
     */
    public PropertiesConverter(Properties propertiesObject) {
        pObj = propertiesObject;
    }
    
    /**
     * 建立 PropertiesConverter 物件，用來將
     * TranslatableObject 轉成 Properties。
     * 
     * @param translatableObject TranslatableObject 物件
     */
    public PropertiesConverter(TranslatableObject translatableObject) {
        tranObj = translatableObject;
    }

    /**
     * 將 Properties 物件轉換成 JavaTranslator 認可的
     * TranslatableObject 物件。
     * 
     * @return TranslatableObject 物件
     */
    public TranslatableObject ConvertToTranslatableObject() {
        for (String key : pObj.stringPropertyNames()) {
            tranObj.put(key, pObj.getProperty(key));
        }

        return tranObj;
    }

    /**
     * 將 TranslatableObject 物件轉換成
     * Properties 物件。
     * 
     * @return Properties 物件
     */ 
    public Properties ConvertToProperties() {
        for (String tranKey : tranObj.keySet()) {
            pObj.setProperty(tranKey, tranObj.get(tranKey));
        }

        return pObj;
    }
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
