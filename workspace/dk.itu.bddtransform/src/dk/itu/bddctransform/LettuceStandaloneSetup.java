
package dk.itu.bddctransform;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LettuceStandaloneSetup extends LettuceStandaloneSetupGenerated{

	public static void doSetup() {
		new LettuceStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

