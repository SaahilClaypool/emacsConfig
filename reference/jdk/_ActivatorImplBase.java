_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 11:  // PortableActivationIDL/Activator/lookupPOATemplate

  /** Find the server template that corresponds to the ORBD's
	* adapter id.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 10:  // PortableActivationIDL/Activator/getORBNames

  /** list all registered ORBs for a server
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 9:  // PortableActivationIDL/Activator/getActiveServers

  /** list active servers
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 8:  // PortableActivationIDL/Activator/uninstall

  /** Invoke the server uninstall hook.  If the server is not
	* currently running, this method will activate it.
	* After this hook completes, the server may still be running.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 7:  // PortableActivationIDL/Activator/install

  /** Invoke the server install hook.  If the server is not 
	* currently running, this method will activate it.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 6:  // PortableActivationIDL/Activator/shutdown

  /** If the server is running, shut it down
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 5:  // PortableActivationIDL/Activator/activate

  /** If the server is not running, start it up.  This is allowed
	* whether or not the server has been installed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 4:  // PortableActivationIDL/Activator/poaDestroyed

  /** Called whenever a POA is destroyed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 3:  // PortableActivationIDL/Activator/registerPOA

  /** Construct or find an ORBD object template corresponding to the 
	* server's object template and return it.  Called whenever a 
	* persistent POA is created.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 2:  // PortableActivationIDL/Activator/registerORB

  /** Called whenever an ORB instance is created.  This registers
	* the transport endpoints and the ORB proxy callback object.
	* Note that we cannot detect when an ORB shuts down, although
	* all of the POA shutdowns should still be reported.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 1:  // PortableActivationIDL/Activator/serverGoingDown

  /** A server is shutting down that was started by this activator.
	* Complete termination of the server is detected by the death of the
	* process implementing the server.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 0:  // PortableActivationIDL/Activator/registerServer

  /** A new ORB started server registers itself with the Activator
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java


/**
* com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/activation/_ActivatorImplBase.java
public abstract class _ActivatorImplBase extends org.omg.CORBA.portable.ObjectImpl

/**
* com/sun/corba/se/spi/activation/_ActivatorImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 11:  // PortableActivationIDL/Activator/lookupPOATemplate

  /** Find the server template that corresponds to the ORBD's
	* adapter id.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 10:  // PortableActivationIDL/Activator/getORBNames

  /** list all registered ORBs for a server
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 9:  // PortableActivationIDL/Activator/getActiveServers

  /** list active servers
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 8:  // PortableActivationIDL/Activator/uninstall

  /** Invoke the server uninstall hook.  If the server is not
	* currently running, this method will activate it.
	* After this hook completes, the server may still be running.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 7:  // PortableActivationIDL/Activator/install

  /** Invoke the server install hook.  If the server is not 
	* currently running, this method will activate it.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 6:  // PortableActivationIDL/Activator/shutdown

  /** If the server is running, shut it down
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 5:  // PortableActivationIDL/Activator/activate

  /** If the server is not running, start it up.  This is allowed
	* whether or not the server has been installed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 4:  // PortableActivationIDL/Activator/poaDestroyed

  /** Called whenever a POA is destroyed.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 3:  // PortableActivationIDL/Activator/registerPOA

  /** Construct or find an ORBD object template corresponding to the 
	* server's object template and return it.  Called whenever a 
	* persistent POA is created.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 2:  // PortableActivationIDL/Activator/registerORB

  /** Called whenever an ORB instance is created.  This registers
	* the transport endpoints and the ORB proxy callback object.
	* Note that we cannot detect when an ORB shuts down, although
	* all of the POA shutdowns should still be reported.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 1:  // PortableActivationIDL/Activator/serverGoingDown

  /** A server is shutting down that was started by this activator.
	* Complete termination of the server is detected by the death of the
	* process implementing the server.
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java
       case 0:  // PortableActivationIDL/Activator/registerServer

  /** A new ORB started server registers itself with the Activator
	*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java


/**
* com/sun/corba/se/PortableActivationIDL/_ActivatorImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/activation/_ActivatorImplBase.java
public abstract class _ActivatorImplBase extends org.omg.CORBA.portable.ObjectImpl

/**
* com/sun/corba/se/spi/activation/_ActivatorImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/