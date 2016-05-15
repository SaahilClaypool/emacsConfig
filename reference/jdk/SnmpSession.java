_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpSession</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Removes all the requests for this SNMP session, closes the socket and
     * sets all the references to the <CODE>SnmpSession</CODE> object to <CODE>null</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private synchronized void killSessionThread() {

    /**
     * Make sure you are killing the thread when it is active. Instead
     * prepare for a graceful exit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    final void destroySession() {

    /**
     * Destroys any pending inform requests and then stops the session.
     * The session will not be usable after this method returns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    void addResponse(SnmpInformRequest reqc) {

    /**
     * Adds the inform request object which received a response to an inform request
     * generated by the session.  This is added to a private store, which
     * will be eventually picked up by the dispatcher for processing.
     * @param reqc The inform request that received the response from the manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private void cancelAllRequests() {

    /**
     * Cancels all pending inform requests in this session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    synchronized void removeInformRequest(SnmpInformRequest snmpreq) {

    /**
     * Deletes an inform request.
     * @param snmpreq The inform request to delete.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    synchronized void addInformRequest(SnmpInformRequest snmpreq) throws SnmpStatusException {

    /**
     * Adds an inform request.
     * @param snmpreq The inform request to add.
     * @exception SnmpStatusException SNMP adaptor is not ONLINE or session is dead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    @Override

    /**
     * Dispatcher method for this session thread. This is the dispatcher method
     * which goes in an endless-loop and waits for servicing inform requests
     * which received a reply from the manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    void waitForResponse(SnmpInformRequest req, long waitTime) {

    /**
     * Performs sync operations on active requests. Any number of inform requests
     * can be done in sync mode but only one per thread.
     * The user can do synchronous operation using the request handle only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    SnmpInformRequest makeAsyncRequest(InetAddress addr, String cs,
                                       SnmpInformHandler cb,
                                       SnmpVarBindList vblst, int port)

    /**
     * Sends an inform request to the specified InetAddress destination using the specified community string.
     * @param addr The InetAddress destination for this inform request.
     * @param cs The community string to be used for the inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param vblst A list of SnmpVarBind instances or null.
     * @exception SnmpStatusException SNMP adaptor is not ONLINE or session
     *            is dead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    boolean thisSessionContext() {

    /**
     * Returns <CODE>true</CODE> if the current executing thread is this session's dispatcher.
     * Typically used to detect whether the user is doing a sync operation from
     * this dispatcher context. For instance, a user gives a sync command
     * from within a request callback using its associated session.
     * @return <CODE>true</CODE> if current thread is this session's dispatcher, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private synchronized boolean syncInProgress() {

    /**
     * Indicates whether this session is performing synchronous operation for an inform request.
     * @return <CODE>true</CODE> if the session is performing synchronous operation, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    SnmpQManager getSnmpQManager() {

    /**
     * Gets the SnmpQManager which will be used by inform requests created in this session.
     * @return The SnmpQManager which will be used in this session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    SnmpSocket getSocket() {

    /**
     * Gets the SnmpSocket which will be used by inform requests created in this session.
     * @return The socket which will be used in this session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    synchronized boolean isSessionActive() {

    /**
     * Indicates whether the thread for this session is active and the SNMP adaptor server ONLINE.
     * @return true if active, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    protected synchronized void initialize(SnmpAdaptorServer adp,
                                           SnmpResponseHandler snmpRespHdlr)

    /**
     * Initializes the SnmpSession.
     * @param adp The SNMP adaptor associated with this SnmpSession.
     * @exception SocketException Unable to initialize the SnmpSocket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    public SnmpSession() throws SocketException {

    /**
     * Constructor for creating a new session. Allows subclassing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    public SnmpSession(SnmpAdaptorServer adp) throws SocketException {

    /**
     * Constructor for creating a new session.
     * @param adp The SNMP adaptor associated with this SnmpSession.
     * @exception SocketException Unable to initialize the SnmpSocket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private transient Thread myThread = null;

    /**
     * The dispatcher that will service all inform responses to inform requests generated
     * using this session object. An SnmpSession object creates one or more inform requests.
     * Thus it services all inform requests, which are created by this session object,
     * when an inform response arrives for an inform request generated by the session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private transient Stack<SnmpInformRequest> informRespq =

    /**
     * This table maintains the list of inform responses.
     * A FIFO queue is needed here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private transient Hashtable<SnmpInformRequest, SnmpInformRequest> informRequestList =

    /**
     * This table maintains the list of inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    protected transient SnmpAdaptorServer adaptor;

    /**
     * The SNMP adaptor associated with this SnmpSession.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
class SnmpSession implements SnmpDefinitions, Runnable {

/**
 * This class is used for sending INFORM REQUESTS from an agent to a manager.
 *
 * Creates, controls, and manages one or more inform requests.
 *
 * The SnmpSession maintains the list of all active inform requests and inform responses.
 * Each SnmpSession has a dispatcher that is a thread used to service all the inform requests it creates
 * and each SnmpSession uses a separate socket for sending/receiving inform requests/responses.
 *
 * An SnmpSession object is associated with an SNMP adaptor server.
 * It is created the first time an inform request is sent by the SNMP adaptor server
 * and is destroyed (with its associated SnmpSocket) when the SNMP adaptor server is stopped.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpSession</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Removes all the requests for this SNMP session, closes the socket and
     * sets all the references to the <CODE>SnmpSession</CODE> object to <CODE>null</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private synchronized void killSessionThread() {

    /**
     * Make sure you are killing the thread when it is active. Instead
     * prepare for a graceful exit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    final void destroySession() {

    /**
     * Destroys any pending inform requests and then stops the session.
     * The session will not be usable after this method returns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    void addResponse(SnmpInformRequest reqc) {

    /**
     * Adds the inform request object which received a response to an inform request
     * generated by the session.  This is added to a private store, which
     * will be eventually picked up by the dispatcher for processing.
     * @param reqc The inform request that received the response from the manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private void cancelAllRequests() {

    /**
     * Cancels all pending inform requests in this session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    synchronized void removeInformRequest(SnmpInformRequest snmpreq) {

    /**
     * Deletes an inform request.
     * @param snmpreq The inform request to delete.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    synchronized void addInformRequest(SnmpInformRequest snmpreq) throws SnmpStatusException {

    /**
     * Adds an inform request.
     * @param snmpreq The inform request to add.
     * @exception SnmpStatusException SNMP adaptor is not ONLINE or session is dead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    @Override

    /**
     * Dispatcher method for this session thread. This is the dispatcher method
     * which goes in an endless-loop and waits for servicing inform requests
     * which received a reply from the manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    void waitForResponse(SnmpInformRequest req, long waitTime) {

    /**
     * Performs sync operations on active requests. Any number of inform requests
     * can be done in sync mode but only one per thread.
     * The user can do synchronous operation using the request handle only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    SnmpInformRequest makeAsyncRequest(InetAddress addr, String cs,
                                       SnmpInformHandler cb,
                                       SnmpVarBindList vblst, int port)

    /**
     * Sends an inform request to the specified InetAddress destination using the specified community string.
     * @param addr The InetAddress destination for this inform request.
     * @param cs The community string to be used for the inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param vblst A list of SnmpVarBind instances or null.
     * @exception SnmpStatusException SNMP adaptor is not ONLINE or session
     *            is dead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    boolean thisSessionContext() {

    /**
     * Returns <CODE>true</CODE> if the current executing thread is this session's dispatcher.
     * Typically used to detect whether the user is doing a sync operation from
     * this dispatcher context. For instance, a user gives a sync command
     * from within a request callback using its associated session.
     * @return <CODE>true</CODE> if current thread is this session's dispatcher, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private synchronized boolean syncInProgress() {

    /**
     * Indicates whether this session is performing synchronous operation for an inform request.
     * @return <CODE>true</CODE> if the session is performing synchronous operation, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    SnmpQManager getSnmpQManager() {

    /**
     * Gets the SnmpQManager which will be used by inform requests created in this session.
     * @return The SnmpQManager which will be used in this session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    SnmpSocket getSocket() {

    /**
     * Gets the SnmpSocket which will be used by inform requests created in this session.
     * @return The socket which will be used in this session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    synchronized boolean isSessionActive() {

    /**
     * Indicates whether the thread for this session is active and the SNMP adaptor server ONLINE.
     * @return true if active, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    protected synchronized void initialize(SnmpAdaptorServer adp,
                                           SnmpResponseHandler snmpRespHdlr)

    /**
     * Initializes the SnmpSession.
     * @param adp The SNMP adaptor associated with this SnmpSession.
     * @exception SocketException Unable to initialize the SnmpSocket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    public SnmpSession() throws SocketException {

    /**
     * Constructor for creating a new session. Allows subclassing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    public SnmpSession(SnmpAdaptorServer adp) throws SocketException {

    /**
     * Constructor for creating a new session.
     * @param adp The SNMP adaptor associated with this SnmpSession.
     * @exception SocketException Unable to initialize the SnmpSocket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private transient Thread myThread = null;

    /**
     * The dispatcher that will service all inform responses to inform requests generated
     * using this session object. An SnmpSession object creates one or more inform requests.
     * Thus it services all inform requests, which are created by this session object,
     * when an inform response arrives for an inform request generated by the session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private transient Stack<SnmpInformRequest> informRespq =

    /**
     * This table maintains the list of inform responses.
     * A FIFO queue is needed here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    private transient Hashtable<SnmpInformRequest, SnmpInformRequest> informRequestList =

    /**
     * This table maintains the list of inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
    protected transient SnmpAdaptorServer adaptor;

    /**
     * The SNMP adaptor associated with this SnmpSession.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSession.java
class SnmpSession implements SnmpDefinitions, Runnable {

/**
 * This class is used for sending INFORM REQUESTS from an agent to a manager.
 *
 * Creates, controls, and manages one or more inform requests.
 *
 * The SnmpSession maintains the list of all active inform requests and inform responses.
 * Each SnmpSession has a dispatcher that is a thread used to service all the inform requests it creates
 * and each SnmpSession uses a separate socket for sending/receiving inform requests/responses.
 *
 * An SnmpSession object is associated with an SNMP adaptor server.
 * It is created the first time an inform request is sent by the SNMP adaptor server
 * and is destroyed (with its associated SnmpSocket) when the SNMP adaptor server is stopped.
 *
 */