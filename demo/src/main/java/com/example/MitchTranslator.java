package com.example;

import net.suuft.libretranslate.Translator;

public class MitchTranslator {
  
  public static String newTranslate(String fromLang, String toLang, String translateText){
    return Translator.translate(fromLang, toLang, translateText);
  }
}
