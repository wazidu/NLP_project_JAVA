package com.wazidu.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class SentenceRecognizer {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();

        String text="Hey! I'm Wazid Ullah Murad. I'm a bachelor Student.";

        CoreDocument coreDocument= new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences =coreDocument.sentences();
    }
}
