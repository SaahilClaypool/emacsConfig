_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  org.omg.IOP.ServiceContext get_reply_service_context (int id);

  /**
     * Returns a copy of the service context with the given ID that 
     * is associated with the reply. 
     * 
     * @param id The <code>IOP.ServiceId</code> of the service context 
     *     which is to be returned. 
     * @return The <code>IOP.ServiceContext</code> obtained with the given 
     *     identifier. 
     * @exception BAD_PARAM thrown with a standard minor code of 26 if the 
     *     request's service context does not contain an entry for that ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  org.omg.IOP.ServiceContext get_request_service_context (int id);

  /**
     * Returns a copy of the service context with the given ID that 
     * is associated with the request. 
     * <p>
     * @param id The <code>IOP.ServiceId</code> of the service context 
     *     which is to be returned. 
     * @return The <code>IOP.ServiceContext</code> obtained with the 
     *     given identifier.
     * @exception BAD_PARAM thrown with a standard minor code of 26, if the 
     *     request's service context does not contain an entry for that ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  org.omg.CORBA.Any get_slot (int id) throws org.omg.PortableInterceptor.InvalidSlot;

  /**
     * Returns the data from the given slot of the 
     * <code>PortableInterceptor.Current</code> that is in the scope of 
     * the request. 
     * <p>
     * If the given slot has not been set, then an any containing a 
     * type code with a <code>TCKind</code> value of <code>tk_null</code> is 
     * returned. 
     *
     * @param id The <code>SlotId</code> of the slot which is to be 
     *     returned. 
     * @return The slot data, in the form of an any, obtained with the 
     *     given identifier.
     * @exception InvalidSlot thrown if the ID does not define an 
     *    allocated slot.
     * @see Current
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  org.omg.CORBA.Object forward_reference ();

  /** 
     * Contains the object to which the request will be forwarded, if the 
     * <code>reply_status</code> attribute is <code>LOCATION_FORWARD</code>.
     * It is indeterminate whether a forwarded request will actually occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  short reply_status ();

  /**
     * Describes the state of the result of the operation invocation. The
     * return value can be one of the following: 
     * <ul>
     *   <li><code>PortableInterceptor.SUCCESSFUL</code></li>
     *   <li><code>PortableInterceptor.SYSTEM_EXCEPTION</code></li>
     *   <li><code>PortableInterceptor.USER_EXCEPTION</code></li>
     *   <li><code>PortableInterceptor.LOCATION_FORWARD</code></li>
     *   <li><code>PortableInterceptor.TRANSPORT_RETRY</code></li>
     * </ul>
     * On the client:
     * <ul>
     *   <li>Within the <code>receive_reply</code> interception point, this 
     *       will only return <code>SUCCESSFUL</code></li>.
     *   <li>Within the <code>receive_exception</code> interception point, 
     *       this will be either <code>SYSTEM_EXCEPTION</code> or 
     *       <code>USER_EXCEPTION</code>.</li>
     *   <li>Within the <code>receive_other</code> interception point, this 
     *       will be any of: <code>SUCCESSFUL</code>, 
     *       <code>LOCATION_FORWARD</code>, or <code>TRANSPORT_RETRY</code>. 
     *       <code>SUCCESSFUL</code> means an asynchronous request returned 
     *       successfully. <code>LOCATION_FORWARD</code> means that a reply 
     *       came back with <code>LOCATION_FORWARD</code> as its status. 
     *       <code>TRANSPORT_RETRY</code> means that the transport 
     *       mechanism indicated a retry - a GIOP reply with a status of 
     *       <code>NEEDS_ADDRESSING_MODE</code>, for instance. </li>
     * </ul>
     * On the server: 
     * <ul>
     *   <li>Within the <code>send_reply</code> interception point, this 
     *       will only be <code>SUCCESSFUL</code>.</li>
     *   <li>Within the <code>send_exception</code> interception point, 
     *       this will be either <code>SYSTEM_EXCEPTION</code> or 
     *       <code>USER_EXCEPTION</code>.</li>
     *   <li>Within the <code>send_other</code> interception point, this 
     *       attribute will be any of: <code>SUCCESSFUL</code>, or 
     *       <code>LOCATION_FORWARD</code>. <code>SUCCESSFUL</code> means 
     *       an asynchronous request returned successfully. 
     *       <code>LOCATION_FORWARD</code> means that a reply came back 
     *       with <code>LOCATION_FORWARD</code> as its status.</li>
     * </ul>
     * 
     * @see SUCCESSFUL
     * @see SYSTEM_EXCEPTION
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     * @see TRANSPORT_RETRY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  short sync_scope ();

  /**
     * Defines how far the request shall progress before control is returned
     * to the client.  This is defined in the Messaging specification, and 
     * is pertinent only when <code>response_expected</code> is false. If 
     * <code>response_expected</code> is true, the value of 
     * <code>sync_scope</code> is undefined. This attribute may have one of 
     * the following values: 
     * <ul>
     *   <li><code>Messaging.SYNC_NONE</code></li>
     *   <li><code>Messaging.SYNC_WITH_TRANSPORT</code></li>
     *   <li><code>Messaging.SYNC_WITH_SERVER</code></li>
     *   <li><code>Messaging.SYNC_WITH_TARGET</code></li>
     * </ul>
     * On the server, for all scopes, a reply will be created from the 
     * return of the target operation call, but the reply will not return 
     * to the client. Although it does not return to the client, it does 
     * occur, so the normal server-side interception points are 
     * followed (i.e., <code>receive_request_service_contexts</code>, 
     * <code>receive_request</code>, <code>send_reply</code> or 
     * <code>send_exception</code>). 
     * <p>
     * For <code>SYNC_WITH_SERVER</code> and <code>SYNC_WITH_TARGET</code>, 
     * the server does send an empty reply back to the client before the 
     * target is invoked. This reply is not intercepted by server-side 
     * Interceptors.
     * 
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  boolean response_expected ();

  /**
     * Indicates whether a response is expected. 
     * <p>
     * On the client, a reply is not returned when 
     * <code>response_expected</code> is false, so <code>receive_reply</code> 
     * cannot be called. <code>receive_other</code> is called unless an 
     * exception occurs, in which case <code>receive_exception</code> is 
     * called. 
     * <p>
     * On the client, within <code>send_poll</code>, this attribute is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  org.omg.CORBA.Any result ();

  /**
     * Returns an any containing the result of the operation invocation. 
     * If the operation return type is void, this attribute will be an any 
     * containing a type code with a <code>TCKind</code> value of 
     * <code>tk_void</code> and no value. 
     * <p>
     * Not all environments provide access to the result. With the Java 
     * portable bindings, for example, the result is not available. In 
     * these environments, when this attribute is accessed, 
     * <code>NO_RESOURCES</code> will be thrown with a standard minor code of 
     * 1.
     * <p>
     * <i>Note: Result is available for DSI/DII calls.</i>
     *
     * @exception NO_RESOURCES thrown if result is not available.
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  String[] operation_context ();

  /**
     * Returns an array of <code>String</code> objects containing the 
     * contexts being sent on the request.
     * <p>
     * Not all environments provide access to the context. With the Java 
     * portable bindings, for example, the context is not available. In 
     * these environments, when this attribute is accessed, NO_RESOURCES will 
     * be thrown with standard minor code of 1.
     * <p>
     * <i>Note: <code>operation_context</code> is available for 
     * DSI/DII calls.</i>
     *
     * @exception NO_RESOURCES thrown if operation context is not available.
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  String[] contexts ();

  /**
     * Returns an array of <code>String</code> objects describing the 
     * contexts that may be passed on this operation invocation.  If there 
     * are no contexts, this will return a zero length array. 
     * <p>
     * Not all environments provide access to the context list. With the 
     * Java portable bindings, for example, the context list is not 
     * available. In these environments, when this attribute is accessed, 
     * <code>NO_RESOURCES</code> will be thrown with a standard minor code 
     * of 1.
     * <p>
     * <i>Note: Contexts are available for DSI/DII calls.</i>
     *
     * @exception NO_RESOURCES thrown if contexts are not available.
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  org.omg.CORBA.TypeCode[] exceptions ();

  /**
     * Returns an array of <code>TypeCode</code> objects describing the 
     * <code>TypeCode</code>s of the user exceptions that this operation 
     * invocation may throw. If there are no user exceptions, this 
     * will return a zero length array. 
     * <p>
     * Not all environments provide access to the exception list. With 
     * the Java portable bindings, for example, the exception list is 
     * not available. In these environments, when this attribute is 
     * accessed, <code>NO_RESOURCES</code> will be thrown with a 
     * standard minor code of 1.
     * <p>
     * <i>Note: Exceptions are available for DSI/DII calls.</i>
     *
     * @exception NO_RESOURCES thrown if exceptions are not available.
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  org.omg.Dynamic.Parameter[] arguments ();

  /**
     * Returns an array of <code>Parameter</code> objects, containing the 
     * arguments on the operation being invoked.  If there are no arguments, 
     * this attribute will be a zero length array. 
     * <p>
     * Not all environments provide access to the arguments. With the Java 
     * portable bindings, for example, the arguments are not available. 
     * In these environments, when this attribute is accessed, 
     * <code>NO_RESOURCES</code> will be thrown with a standard minor code 
     * of 1.
     * <p>
     * <i>Note: Arguments are available for DSI/DII calls.</i>
     *
     * @exception NO_RESOURCES thrown if arguments are not available.
     * @see <a href="package-summary.html#unimpl">
     *     <code>PortableInterceptor</code> package comments for 
     *     limitations / unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  String operation ();

  /**
     * Returns the name of the operation being invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
  int request_id ();

  /**
     * Returns an id that uniquely identifies an active request/reply 
     * sequence. Once a request/reply sequence is concluded this ID may be 
     * reused. Note that this id is not the same as the GIOP 
     * <code>request_id</code>. If GIOP is the transport mechanism used, 
     * then these IDs may very well be the same, but this is not guaranteed 
     * nor required.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java
public interface RequestInfoOperations 

/**
   * Request Information, accessible to Interceptors.
   * <p>
   * Each interception point is given an object through which the 
   * Interceptor can access request information. Client-side and server-side 
   * interception points are concerned with different information, so there 
   * are two information objects: <code>ClientRequestInfo</code> is passed 
   * to the client-side interception points and <code>ServerRequestInfo</code>
   * is passed to the server-side interception points. But there is 
   * information that is common to both, so they both inherit from a common 
   * interface: <code>RequestInfo</code>.
   *
   * @see ClientRequestInfo
   * @see ServerRequestInfo
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/RequestInfoOperations.java


/**
* org/omg/PortableInterceptor/RequestInfoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, October 6, 2015 4:40:34 PM PDT
*/
