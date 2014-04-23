/**
 */
package FmiModelDescriptionV1.util;

import FmiModelDescriptionV1.FmiModelDescriptionV1Package;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelDescriptionV1XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelDescriptionV1XMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, FmiModelDescriptionV1Package.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the FmiModelDescriptionV1ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new FmiModelDescriptionV1ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new FmiModelDescriptionV1ResourceFactoryImpl());
		}
		return registrations;
	}

} //FmiModelDescriptionV1XMLProcessor
