package com.wazidu.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class Lemmatization {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();

        String text="I'm trying to learn new technologies";

        CoreDocument coreDocument=new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList=coreDocument.tokens();

        for (CoreLabel coreLabel: coreLabelList)
        {
            String lemma= coreLabel.lemma();

            System.out.println(coreLabel.originalText()+" = "+lemma);
        }

    }
}
