/*
* generated by Xtext
*/
package dk.itu.bddcontracts.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GherkinAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.tokens");
	}
}
