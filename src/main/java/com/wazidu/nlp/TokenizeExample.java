package com.wazidu.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

//import static com.wazidu.nlp.Pipeline.*;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class TokenizeExample {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP =Pipeline.getPipeline();

        String text= "Hey! This is Wazid Ullah Murad";

        CoreDocument coreDocument= new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList=coreDocument.tokens();

        for (CoreLabel coreLabel: coreLabelList)
        {
            System.out.println(coreLabel.originalText());
        }
    }
}
