package com.wazidu.nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class Pipeline {

    private static Properties properties;
////    here ...tokenize for tokenization ...ssplit for sentence recogniser
//    pos for parts of speech
//    lemma for lemmatization
//    ner for named entity recognisation
//    parse, sentiment for sentiment analysis
    private static String propertiesName="tokenize, ssplit, pos, lemma,ner,parse,sentiment";
    private static StanfordCoreNLP stanfordCoreNLP;

    private Pipeline()
    {
    }

    static {

        properties=new Properties();
        properties.setProperty("annotators",propertiesName);
    }
    public static StanfordCoreNLP getPipeline()
    {
        if(stanfordCoreNLP==null)
        {
            stanfordCoreNLP=new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }
}
