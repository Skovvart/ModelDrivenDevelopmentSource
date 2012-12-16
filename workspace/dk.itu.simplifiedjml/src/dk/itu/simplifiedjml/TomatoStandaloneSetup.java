
package dk.itu.simplifiedjml;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TomatoStandaloneSetup extends TomatoStandaloneSetupGenerated{

	public static void doSetup() {
		new TomatoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

