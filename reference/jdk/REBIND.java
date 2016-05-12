_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/REBIND.java
    public REBIND(String detailMessage,
                  int minorCode,
                  CompletionStatus completionStatus) {

    /**
     * Constructs an <code>REBIND</code> exception with the
     * specified message, minor code, and completion status.
     *
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/REBIND.java
    public REBIND(int minorCode,
                  CompletionStatus completionStatus) {

    /**
     * Constructs an <code>REBIND</code> exception with the
     * specified minor code and completion status.
     *
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/REBIND.java
    public REBIND(String detailMessage) {

    /**
     * Constructs an <code>REBIND</code> exception with the
     * specified message.
     *
     * @param detailMessage string containing a detailed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/REBIND.java
    public REBIND() {

    /**
     * Constructs an <code>REBIND</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/REBIND.java
public final class REBIND extends SystemException {

/**
 * <code>REBIND</code> is raised when the current effective RebindPolicy,
 * has a value of NO_REBIND or NO_RECONNECT and an invocation on a bound
 * object reference results in a LocateReply message with status
 * OBJECT_FORWARD or a Reply message with status LOCATION_FORWARD.
 * This exception is also raised if the current effective RebindPolicy has
 * a value of NO_RECONNECT and a connection must be reopened.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @since   J2SE 1.5
 */
