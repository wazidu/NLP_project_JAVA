package com.wazidu.nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class Pipeline {

    private static Properties properties;
//    here ...tokenize for tokenization ...ssplit for sentence recogniser
    private static String propertiesName="tokenize, ssplit";
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
