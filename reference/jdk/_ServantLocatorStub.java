_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/_ServantLocatorStub.java
  public void postinvoke (byte[] oid, org.omg.PortableServer.POA adapter, String operation, java.lang.Object the_cookie, org.omg.PortableServer.Servant the_servant)

  /**
	 * This operation is invoked whenener a servant completes
	 * a request.
	 * @param oid the object id ssociated with object on which
	 *            the request was made.
	 * @param adapter the reference for POA in which the
	 *                object was active.
	 * @param the_cookie  an opaque value that contains
	 *                    the data set by preinvoke.
	 * @param the_servant reference to the servant that is
	 *                    associated with the object.
	 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/_ServantLocatorStub.java
  public org.omg.PortableServer.Servant preinvoke (byte[] oid, org.omg.PortableServer.POA adapter, String operation, org.omg.PortableServer.ServantLocatorPackage.CookieHolder the_cookie) throws org.omg.PortableServer.ForwardRequest

  /**
	 * This operations is used to get a servant that will be
	 * used to process the request that caused preinvoke to
	 * be called.
	 * @param oid the object id associated with object on
	 *            which the request was made. 
	 * @param adapter the reference for POA in which the
	 *                object is being activated.
	 * @param operation the operation name.
	 * @param the_cookie  an opaque value that can be set
	 *                    by the servant manager to be used
	 *                    during postinvoke.
	 * @return Servant used to process incoming request.
	 * @exception ForwardRequest to indicate to the ORB 
	 *            that it is responsible for delivering 
	 *            the current request and subsequent 
	 *            requests to the object denoted in the 
	 *            forward_reference member of the exception.
	 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/_ServantLocatorStub.java
public class _ServantLocatorStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.PortableServer.ServantLocator

/**
	 * When the POA has the NON_RETAIN policy it uses servant 
	 * managers that are ServantLocators. Because the POA 
	 * knows that the servant returned by this servant 
	 * manager will be used only for a single request, 
	 * it can supply extra information to the servant 
	 * manager's operations and the servant manager's pair 
	 * of operations may be able to cooperate to do 
	 * something different than a ServantActivator. 
	 * When the POA uses the ServantLocator interface, 
	 * immediately after performing the operation invocation 
	 * on the servant returned by preinvoke, the POA will 
	 * invoke postinvoke on the servant manager, passing the 
	 * ObjectId value and the Servant value as parameters 
	 * (among others). This feature may be used to force 
	 * every request for objects associated with a POA to 
	 * be mediated by the servant manager.
	 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/_ServantLocatorStub.java


/**
* org/omg/PortableServer/_ServantLocatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, October 6, 2015 4:40:34 PM PDT
*/
