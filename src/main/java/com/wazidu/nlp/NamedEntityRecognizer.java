package com.wazidu.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class NamedEntityRecognizer {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();

        String text= "Hey! This is Murad and i have friend his name is Mamun.";

        CoreDocument coreDocument=new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabels=coreDocument.tokens();

        for (CoreLabel coreLabel:coreLabels)
        {
            String ner= coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(coreLabel.originalText()+" "+ner);
        }
    }
}
