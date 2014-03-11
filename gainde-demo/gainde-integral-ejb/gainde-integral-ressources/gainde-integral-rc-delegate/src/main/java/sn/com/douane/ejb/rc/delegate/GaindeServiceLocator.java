package sn.com.douane.ejb.rc.delegate;

import javax.naming.Context;
import javax.naming.NamingException;

import sn.com.douane.utils.GaindePropertiesReader;

/**
 * This component is responsible for the service of searching EJB references
 * from the JNDI context by lookup. It's a singleton component to be
 * instantiated just one time in the application.
 * 
 * @author Wadii
 */
public final class GaindeServiceLocator {

	// In OpenEJB 4 an EJB is referenced from the path
	// "java:global/localhost/gainde/" in the JNDI context
	// private static final String JNDI_REFERENCE_PATH =
	// "java:global/localhost/gainde/";

	// In WAS 7 4 an EJB is referenced from the path "ejblocal:package" in the
	// JNDI context
	// private static final String JNDI_REFERENCE_PATH = "ejblocal:package";

	private String JNDI_REFERENCE_PATH;

	private static GaindeServiceLocator serviceLocator;
	private String container;

	private GaindeServiceLocator(Context context, String container) {
		super();
		this.container = container;
	}

	public static synchronized GaindeServiceLocator getServiceLocator(
			Context context, String container) {
		if (serviceLocator == null) {
			serviceLocator = new GaindeServiceLocator(context, container);
		}
		return serviceLocator;
	}
	
	

	/**
	 * This method looks up an EJB from the JNDI context having its JNDI-NAME.
	 * 
	 * @param ejbName
	 *            the ejb-name of the EJB to lookup
	 * @param context
	 *            the context where to lookup for the EJB name passed as
	 *            parameter
	 * @return the resolved ejb reference found in the context
	 */
	public Object getEjbReference(Class ejbName, Context context) {
		try {
			if ("openejb".equalsIgnoreCase(container)) {
				String contextWeb = GaindePropertiesReader.getInstance().getProperty("context");
				JNDI_REFERENCE_PATH = "java:global/"+contextWeb+"/";
			}else if ("jboss".equalsIgnoreCase(container)) {				
				JNDI_REFERENCE_PATH = getJbossJndi(ejbName);
				
			} else {
				// websphere
				JNDI_REFERENCE_PATH = "ejblocal:"
						+ ejbName.getPackage().getName() + ".";
		
			}
//			System.out.println("context = "+context
//					.lookup(JNDI_REFERENCE_PATH + ejbName.getSimpleName()));
			return context
					.lookup(JNDI_REFERENCE_PATH + ejbName.getSimpleName());
		} catch (NamingException e) {
			return null;
		}
	}
	
	public String getJbossJndi(Class interfaceEjb){
		String interfaceLocation = interfaceEjb.getProtectionDomain().getCodeSource().getLocation().toString();
		int index = interfaceLocation.lastIndexOf("lib");
		//eliminer de la chaine la partie extension du jar comme api-1.0.jar
		//puis rajouter l'extension ejb car nos ejb seront dans les modules ejb par api
		String trunk = interfaceLocation.substring((index+4),interfaceLocation.length()-11);
		String ejbModule = trunk.concat("ejb");
		System.out.println(ejbModule);
		String ejbContext = "java:app/"+ejbModule+"/" ;
		return ejbContext;
		
		
	}
	
}
