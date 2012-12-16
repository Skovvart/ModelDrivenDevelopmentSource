
package dk.itu.bddcontracts;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GherkinStandaloneSetup extends GherkinStandaloneSetupGenerated{

	public static void doSetup() {
		new GherkinStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

