/*
* generated by Xtext
*/
package dk.itu.bddcontracts.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.itu.bddcontracts.services.GherkinGrammarAccess;

public class GherkinParser extends AbstractContentAssistParser {
	
	@Inject
	private GherkinGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.itu.bddcontracts.ui.contentassist.antlr.internal.InternalGherkinParser createParser() {
		dk.itu.bddcontracts.ui.contentassist.antlr.internal.InternalGherkinParser result = new dk.itu.bddcontracts.ui.contentassist.antlr.internal.InternalGherkinParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getScenarioAccess().getAlternatives(), "rule__Scenario__Alternatives");
					put(grammarAccess.getContentAccess().getAlternatives(), "rule__Content__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getAnyAccess().getAlternatives(), "rule__Any__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_4(), "rule__Feature__Group_4__0");
					put(grammarAccess.getFeatureAccess().getGroup_5(), "rule__Feature__Group_5__0");
					put(grammarAccess.getBackgroundAccess().getGroup(), "rule__Background__Group__0");
					put(grammarAccess.getBackgroundAccess().getGroup_3(), "rule__Background__Group_3__0");
					put(grammarAccess.getBehaviorAccess().getGroup(), "rule__Behavior__Group__0");
					put(grammarAccess.getBehaviorAccess().getGroup_2(), "rule__Behavior__Group_2__0");
					put(grammarAccess.getBehaviorAccess().getGroup_2_2(), "rule__Behavior__Group_2_2__0");
					put(grammarAccess.getBehaviorAccess().getGroup_3(), "rule__Behavior__Group_3__0");
					put(grammarAccess.getBehaviorAccess().getGroup_3_2(), "rule__Behavior__Group_3_2__0");
					put(grammarAccess.getSentenceAccess().getGroup(), "rule__Sentence__Group__0");
					put(grammarAccess.getScenarioSpecificAccess().getGroup(), "rule__ScenarioSpecific__Group__0");
					put(grammarAccess.getScenarioSpecificAccess().getGroup_4(), "rule__ScenarioSpecific__Group_4__0");
					put(grammarAccess.getScenarioSpecificAccess().getGroup_5(), "rule__ScenarioSpecific__Group_5__0");
					put(grammarAccess.getScenarioSpecificAccess().getGroup_5_2(), "rule__ScenarioSpecific__Group_5_2__0");
					put(grammarAccess.getScenarioSpecificAccess().getGroup_8(), "rule__ScenarioSpecific__Group_8__0");
					put(grammarAccess.getScenarioOutlineAccess().getGroup(), "rule__ScenarioOutline__Group__0");
					put(grammarAccess.getScenarioOutlineAccess().getGroup_4(), "rule__ScenarioOutline__Group_4__0");
					put(grammarAccess.getScenarioOutlineAccess().getGroup_5(), "rule__ScenarioOutline__Group_5__0");
					put(grammarAccess.getScenarioOutlineAccess().getGroup_5_2(), "rule__ScenarioOutline__Group_5_2__0");
					put(grammarAccess.getScenarioOutlineAccess().getGroup_8(), "rule__ScenarioOutline__Group_8__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getExampleAccess().getGroup(), "rule__Example__Group__0");
					put(grammarAccess.getExampleAccess().getGroup_2(), "rule__Example__Group_2__0");
					put(grammarAccess.getExampleAccess().getGroup_5(), "rule__Example__Group_5__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getValueAccess().getGroup_2(), "rule__Value__Group_2__0");
					put(grammarAccess.getModelAccess().getFeaturesAssignment_1_0(), "rule__Model__FeaturesAssignment_1_0");
					put(grammarAccess.getModelAccess().getFeaturesAssignment_1_1(), "rule__Model__FeaturesAssignment_1_1");
					put(grammarAccess.getFeatureAccess().getDescriptionAssignment_1(), "rule__Feature__DescriptionAssignment_1");
					put(grammarAccess.getFeatureAccess().getSummaryAssignment_2(), "rule__Feature__SummaryAssignment_2");
					put(grammarAccess.getFeatureAccess().getBackgroundAssignment_3(), "rule__Feature__BackgroundAssignment_3");
					put(grammarAccess.getFeatureAccess().getScenariosAssignment_4_0(), "rule__Feature__ScenariosAssignment_4_0");
					put(grammarAccess.getFeatureAccess().getScenariosAssignment_4_1(), "rule__Feature__ScenariosAssignment_4_1");
					put(grammarAccess.getFeatureAccess().getBehaviorsAssignment_5_0(), "rule__Feature__BehaviorsAssignment_5_0");
					put(grammarAccess.getFeatureAccess().getBehaviorsAssignment_5_1(), "rule__Feature__BehaviorsAssignment_5_1");
					put(grammarAccess.getBackgroundAccess().getGivenBlocksAssignment_2(), "rule__Background__GivenBlocksAssignment_2");
					put(grammarAccess.getBackgroundAccess().getGivenBlocksAssignment_3_1(), "rule__Background__GivenBlocksAssignment_3_1");
					put(grammarAccess.getBehaviorAccess().getDescriptionAssignment_1(), "rule__Behavior__DescriptionAssignment_1");
					put(grammarAccess.getBehaviorAccess().getRequiringBlocksAssignment_2_1(), "rule__Behavior__RequiringBlocksAssignment_2_1");
					put(grammarAccess.getBehaviorAccess().getRequiringBlocksAssignment_2_2_1(), "rule__Behavior__RequiringBlocksAssignment_2_2_1");
					put(grammarAccess.getBehaviorAccess().getEnsuringBlocksAssignment_3_1(), "rule__Behavior__EnsuringBlocksAssignment_3_1");
					put(grammarAccess.getBehaviorAccess().getEnsuringBlocksAssignment_3_2_1(), "rule__Behavior__EnsuringBlocksAssignment_3_2_1");
					put(grammarAccess.getSentenceAccess().getWordsAssignment_0(), "rule__Sentence__WordsAssignment_0");
					put(grammarAccess.getSentenceAccess().getWordsAssignment_1(), "rule__Sentence__WordsAssignment_1");
					put(grammarAccess.getScenarioSpecificAccess().getDescriptionAssignment_1(), "rule__ScenarioSpecific__DescriptionAssignment_1");
					put(grammarAccess.getScenarioSpecificAccess().getGivenBlocksAssignment_3(), "rule__ScenarioSpecific__GivenBlocksAssignment_3");
					put(grammarAccess.getScenarioSpecificAccess().getGivenBlocksAssignment_4_1(), "rule__ScenarioSpecific__GivenBlocksAssignment_4_1");
					put(grammarAccess.getScenarioSpecificAccess().getWhenBlocksAssignment_5_1(), "rule__ScenarioSpecific__WhenBlocksAssignment_5_1");
					put(grammarAccess.getScenarioSpecificAccess().getWhenBlocksAssignment_5_2_1(), "rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1");
					put(grammarAccess.getScenarioSpecificAccess().getThenBlocksAssignment_7(), "rule__ScenarioSpecific__ThenBlocksAssignment_7");
					put(grammarAccess.getScenarioSpecificAccess().getThenBlocksAssignment_8_1(), "rule__ScenarioSpecific__ThenBlocksAssignment_8_1");
					put(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_1(), "rule__ScenarioOutline__DescriptionAssignment_1");
					put(grammarAccess.getScenarioOutlineAccess().getGivenBlocksAssignment_3(), "rule__ScenarioOutline__GivenBlocksAssignment_3");
					put(grammarAccess.getScenarioOutlineAccess().getGivenBlocksAssignment_4_1(), "rule__ScenarioOutline__GivenBlocksAssignment_4_1");
					put(grammarAccess.getScenarioOutlineAccess().getWhenBlocksAssignment_5_1(), "rule__ScenarioOutline__WhenBlocksAssignment_5_1");
					put(grammarAccess.getScenarioOutlineAccess().getWhenBlocksAssignment_5_2_1(), "rule__ScenarioOutline__WhenBlocksAssignment_5_2_1");
					put(grammarAccess.getScenarioOutlineAccess().getThenBlocksAssignment_7(), "rule__ScenarioOutline__ThenBlocksAssignment_7");
					put(grammarAccess.getScenarioOutlineAccess().getThenBlocksAssignment_8_1(), "rule__ScenarioOutline__ThenBlocksAssignment_8_1");
					put(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_10(), "rule__ScenarioOutline__ExamplesAssignment_10");
					put(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_11(), "rule__ScenarioOutline__ExamplesAssignment_11");
					put(grammarAccess.getReferenceAccess().getValueAssignment_2(), "rule__Reference__ValueAssignment_2");
					put(grammarAccess.getWordAccess().getValueAssignment(), "rule__Word__ValueAssignment");
					put(grammarAccess.getExampleAccess().getKeysAssignment_1(), "rule__Example__KeysAssignment_1");
					put(grammarAccess.getExampleAccess().getKeysAssignment_2_1(), "rule__Example__KeysAssignment_2_1");
					put(grammarAccess.getExampleAccess().getValuesAssignment_4(), "rule__Example__ValuesAssignment_4");
					put(grammarAccess.getExampleAccess().getValuesAssignment_5_1(), "rule__Example__ValuesAssignment_5_1");
					put(grammarAccess.getValueAccess().getElementsAssignment_1(), "rule__Value__ElementsAssignment_1");
					put(grammarAccess.getValueAccess().getElementsAssignment_2_1(), "rule__Value__ElementsAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.itu.bddcontracts.ui.contentassist.antlr.internal.InternalGherkinParser typedParser = (dk.itu.bddcontracts.ui.contentassist.antlr.internal.InternalGherkinParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GherkinGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GherkinGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
