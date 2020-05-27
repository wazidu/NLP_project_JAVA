package com.wazidu.nlp;

import edu.stanford.nlp.ling.CoreAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

/**
 * Created by Wazid Ullah Murad on 5/27/2020.
 */
public class PartsOfSpeech {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();

        String text="Hey! This is Murad";

        CoreDocument coreDocument=new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList=coreDocument.tokens();

        for (CoreLabel coreLabel: coreLabelList)
        {
           String pos=coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(coreLabel.originalText()+" = "+pos);

        }
//        u will find some parts of speech named UH,DT,VBZ...etc..
//        these are the NLP parts of speech.. these means...
//        CC Coordinating conjunction
//        CD Cardinal number
//        DT Determiner
//        EX Existential there
//        FW Foreign word
//        IN Preposition or subordinating conjunction
//        JJ Adjective
//        JJR Adjective, comparative
//        JJS Adjective, superlative
//        LS List item marker
//        MD Modal
//        NN Noun, singular or mass
//        NNS Noun, plural
//        NNP Proper noun, singular
//        NNPS Proper noun, plural
//        PDT Predeterminer
//        POS Possessive ending
//        PRP Personal pronoun
//        PRP$ Possessive pronoun
//        RB Adverb
//        RBR Adverb, comparative
//        RBS Adverb, superlative
//        RP Particle
//        SYM Symbol
//        TO to
//        UH Interjection
//        VB Verb, base form
//        VBD Verb, past tense
//        VBG Verb, gerund or present participle
//        VBN Verb, past participle
//        VBP Verb, non­3rd person singular present
//        VBZ Verb, 3rd person singular present
//        WDT Wh­determiner
//        WP Wh­pronoun
//        WP$ Possessive wh­pronoun
//        WRB Wh­adverb
    }
}
