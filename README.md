# JavaTranslator

## 概述
這個專案可以讓 properties, string.xml 之類的東西能夠使用方便的介面來翻譯。目前僅支援 properties，不過因為程式架構本身就是設計成支援多格式（不然何必有 TranslationObject），所以 string.xml 及 Gettext 格式 (.po) 未來也會支援。

這個軟體可以讓 Minecraft (.properties)、Android (strings.xml) 的翻譯簡便許多。以往要翻譯 properties 都得用 Notepad 開啟，而且還會擔心「會不會不小心把原來的 properties 檔案某個 ID 弄壞」，而且在 JavaTranslator 出現之前，還要擔心新舊 properties 的合併問題，JavaTranslator 就是要來解決這問題的。

JavaTranslator 會有個翻譯介面（ [詳情見此](#spec) ），而且翻譯介面還會內建合併工具，能用非常簡單的方式合併兩個字串檔。

目前這程式是依我自己的翻譯經驗製作的，當然你也可以在這裡提出「想要什麼功能」，但目前我更偏好於把目前的程式先寫完。

## <a id="spec">規格</a>
```
狀態：第 3 條字串，共 105 條字串。
      未翻譯
      
原文： %red%Welcome to PluginWorld!

翻譯： %red%歡迎來到 PluginWorld！|

----

[指令列表]
輸入指令之後按下 Enter！

::next
       跳至下一條
::prev
       跳至上一條
::to <第 n 條>
       前往第 n 條
::copy
       直接複製原文（不經修改）
::save
       儲存 Properties
::saveas [檔名]
       另存 Properties
::load [檔名]
       載入 Properties
::merge [參考檔案]
       合併 Properties
       必須先 load 才能使用 merge
::exit
       離開程式
::help
       顯示此說明
輸入 q 按 Enter 回到原畫面

:
---

狀態：未載入檔案！
      
原文： 請使用 ::load 載入檔案
       或使用 ::help 取得說明

翻譯： ::load
目前位置：/home/pan93412/trans
.. Test.properties

 [ 輸入 ::back 回去上個畫面！ ]
請輸入檔名，或輸入路徑跳至某目錄：
Test.properties

---
```

## 作者
pan93412, 2019.