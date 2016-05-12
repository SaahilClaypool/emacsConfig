_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Current.java
public interface Current extends CurrentOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity

/**
* Interfaces derived from the <tt>Current</tt> interface enable ORB and CORBA
* services to provide access to information (context) associated with
* the thread of execution in which they are running. This information
* is accessed in a structured manner using interfaces derived from the
* <tt>Current</tt> interface defined in the CORBA module.
*
* <P>Each ORB or CORBA service that needs its own context derives an
* interface from the CORBA module's <tt>Current</tt>. Users of the
* service can obtain an instance of the appropriate <tt>Current</tt>
* interface by invoking <tt>ORB::resolve_initial_references</tt>.<P>
*
* org/omg/CORBA/Current.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../src/share/classes/org/omg/PortableServer/corba.idl
* Saturday, July 17, 1999 12:26:21 AM PDT.
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/Current.java
public interface Current extends CurrentOperations, org.omg.CORBA.Current, org.omg.CORBA.portable.IDLEntity 

/**
   * Portable Interceptors Current (also known as <code>PICurrent</code>) 
   * is merely a slot table, the slots of which are used by each service to 
   * transfer their context data between their context and the request's or 
   * reply's service context. Each service which wishes to use PICurrent 
   * reserves a slot or slots at initialization time and uses those slots 
   * during the processing of requests and replies.
   * <p>
   * Before an invocation is made, PICurrent is obtained via a call to 
   * <code>ORB.resolve_initial_references( "PICurrent" )</code>. From within 
   * the interception points, the data on PICurrent that has moved from the 
   * thread scope to the request scope is available via the 
   * <code>get_slot</code> operation on the <code>RequestInfo</code> object. 
   * A PICurrent can still be obtained via 
   * <code>resolve_initial_references</code>, but that is the Interceptor's 
   * thread scope PICurrent.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/Current.java


/**
* org/omg/PortableInterceptor/Current.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, October 6, 2015 4:40:34 PM PDT
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Current.java
public interface Current extends CurrentOperations, org.omg.CORBA.Current, org.omg.CORBA.portable.IDLEntity 

/**
	 * The PortableServer::Current interface, derived from 
	 * CORBA::Current, provides method implementations with 
	 * access to the identity of the object on which the 
	 * method was invoked. The Current interface is provided 
	 * to support servants that implement multiple objects, 
	 * but can be used within the context of POA-dispatched 
	 * method invocations on any servant. To provide location 
	 * transparency, ORBs are required to support use of 
	 * Current in the context of both locally and remotely 
	 * invoked operations. An instance of Current can be 
	 * obtained by the application by issuing the 
	 * CORBA::ORB::resolve_initial_references("POACurrent") 
	 * operation. Thereafter, it can be used within the 
	 * context of a method dispatched by the POA to obtain 
	 * the POA and ObjectId that identify the object on 
	 * which that operation was invoked.
	 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Current.java


/**
* org/omg/PortableServer/Current.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, October 6, 2015 4:40:34 PM PDT
*/
