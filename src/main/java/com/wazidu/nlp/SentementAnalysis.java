package com.wazidu.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class SentementAnalysis {


    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP =Pipeline.getPipeline();

        String text="you are so pretty. i really love you. but i hate your attitude";

        CoreDocument coreDocument =new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> coreSentences=coreDocument.sentences();

        for(CoreSentence sentence: coreSentences)
        {
            String sentiment=sentence.sentiment();

            System.out.println(sentiment+"\t"+sentence);
        }


    }




}
