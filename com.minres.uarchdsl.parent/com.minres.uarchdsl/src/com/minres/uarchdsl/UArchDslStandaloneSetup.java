/*
 * generated by Xtext 2.25.0
 */
package com.minres.uarchdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class UArchDslStandaloneSetup extends UArchDslStandaloneSetupGenerated {

	public static void doSetup() {
		new UArchDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
