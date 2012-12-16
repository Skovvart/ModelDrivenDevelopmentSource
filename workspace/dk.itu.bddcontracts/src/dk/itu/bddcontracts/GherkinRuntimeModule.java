/*
 * generated by Xtext
 */
package dk.itu.bddcontracts;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import BDDModel.Model;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class GherkinRuntimeModule extends dk.itu.bddcontracts.AbstractGherkinRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return GherkinQualifiedNameProvider.class;
	}

}

class GherkinQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	QualifiedName qualifiedName(Model m) {
		return QualifiedName.create(m.eResource().getURI().toString());
	}
	
}