_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public void destroy () throws org.omg.CosNaming.NamingContextPackage.NotEmpty

  /** 
 * The destroy operation deletes a naming context. If the naming 
 * context contains bindings, the NotEmpty exception is raised.
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotEmpty Indicates that the Naming Context contains bindings.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public org.omg.CosNaming.NamingContext bind_new_context (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.AlreadyBound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName

  /**
 * This operation creates a new context and binds it to the name
 * supplied as an argument. The newly-created context is implemented 
 * by the same naming server as the context in which it was bound (that 
 * is, the naming server that implements the context denoted by the 
 * name argument excluding the last component).
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound Indicates an object is already 
 * bound to the specified name.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public org.omg.CosNaming.NamingContext new_context ()

  /**
 * This operation returns a naming context implemented by the same
 * naming server as the context on which the operation was invoked. 
 * The new context is not bound to any name.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public void list (int how_many, org.omg.CosNaming.BindingListHolder bl, org.omg.CosNaming.BindingIteratorHolder bi)

  /**
 * The list operation allows a client to iterate through a set of
 * bindings in a naming context. <p>
 * 
 * The list operation returns at most the requested number of
 * bindings in BindingList bl. 
 * <ul>
 * <li>If the naming context contains additional 
 * bindings, the list operation returns a BindingIterator with the 
 * additional bindings. 
 * <li>If the naming context does not contain additional 
 * bindings, the binding iterator is a nil object reference.
 * </ul>
 * 
 * @param how_many the maximum number of bindings to return <p>
 * 
 * @param bl the returned list of bindings <p>
 * 
 * @param bi the returned binding iterator <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public void unbind (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName

  /** 
 * The unbind operation removes a name binding from a context.
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public org.omg.CORBA.Object resolve (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName

  /** 
 * The resolve operation is the process of retrieving an object
 * bound to a name in a given context. The given name must exactly 
 * match the bound name. The naming service does not return the type 
 * of the object. Clients are responsible for "narrowing" the object 
 * to the appropriate type. That is, clients typically cast the returned 
 * object from Object to a more specialized interface.
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public void rebind_context (org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName

  /** 
 * Creates a binding of a name and a naming context in the naming
 * context even if the name is already bound in the context. Naming 
 * contexts that are bound using rebind_context() participate in name 
 * resolution when compound names are passed to be resolved.
 * 
 * @param n Name of the object <p>
 * 
 * @param nc NamingContect object to rebind with the given name <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public void rebind (org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName

  /**
 * Creates a binding of a name and an object in the naming context
 * even if the name is already bound in the context. Naming contexts 
 * that are bound using rebind do not participate in name resolution 
 * when compound names are passed to be resolved.
 * 
 * @param  n Name of the object <p>
 * 
 * @param obj The Object to rebind with the given name <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public void bind_context (org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName, org.omg.CosNaming.NamingContextPackage.AlreadyBound

  /**
 * Names an object that is a naming context. Naming contexts that
 * are bound using bind_context() participate in name resolution 
 * when compound names are passed to be resolved.
 * 
 * @param n Name of the object <p>
 * 
 * @param nc NamingContect object to bind with the given name <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 *
 * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound Indicates an object is already 
 * bound to the specified name.<p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public void bind (org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName, org.omg.CosNaming.NamingContextPackage.AlreadyBound

  /**
 * Creates a binding of a name and an object in the naming context.
 * Naming contexts that are bound using bind do not participate in name
 * resolution when compound names are passed to be resolved. 
 * 
 * @param n Name of the object <p>
 * 
 * @param obj The Object to bind with the given name<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates
 * the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed 
 * Indicates that the implementation has given up for some reason.
 * The client, however, may be able to continue the operation
 * at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName 
 * Indicates that the name is invalid. <p>
 *
 * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound 
 * Indicates an object is already bound to the specified name.<p> 
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public org.omg.CORBA.Object resolve_str (String sn) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName

  /**
 * This operation resolves the Stringified name into the object
 * reference. 
 * 
 * @param sn Stringified Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound
 * Indicates there is no object reference for the given name. <p>
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
 * Indicates that the given compound name is incorrect <p>
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * 
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public String to_url (String addr, String sn) throws org.omg.CosNaming.NamingContextExtPackage.InvalidAddress, org.omg.CosNaming.NamingContextPackage.InvalidName

  /**
 * This operation creates a URL based "iiopname://" format name
 * from the Stringified Name of the object.
 * 
 * @param addr internet based address of the host machine where  Name Service is running <p>
 * @param sn Stringified Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
 * Indicates the internet based address of the host machine is 
 * incorrect <p>
 * 
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public org.omg.CosNaming.NameComponent[] to_name (String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName

  /**
 * This operation  converts a Stringified Name into an  equivalent array
 * of Name Components. 
 * 
 * @param sn Stringified Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * 
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
  public String to_string (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.InvalidName

  /**
 * This operation creates a stringified name from the array of Name
 * components.
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * 
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java
public class _NamingContextExtStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.CosNaming.NamingContextExt

/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/_NamingContextExtStub.java


/**
* org/omg/CosNaming/_NamingContextExtStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/