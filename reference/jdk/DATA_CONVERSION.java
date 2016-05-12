_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DATA_CONVERSION.java
    public DATA_CONVERSION(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>DATA_CONVERSION</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DATA_CONVERSION.java
    public DATA_CONVERSION(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>DATA_CONVERSION</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DATA_CONVERSION.java
    public DATA_CONVERSION(String s) {

    /**
     * Constructs a <code>DATA_CONVERSION</code> exception with the specified detail.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DATA_CONVERSION.java
    public DATA_CONVERSION() {

    /**
     * Constructs a <code>DATA_CONVERSION</code> exception with a default minor code
     * of 0 and a completion state of COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DATA_CONVERSION.java
public final class DATA_CONVERSION extends SystemException {

/**
 * This exception is raised if an ORB cannot convert the representation
 * of data as marshaled into its native representation or vice-versa.
 * For example, DATA_CONVERSION can be raised if wide character codeset
 * conversion fails, or if an ORB cannot convert floating point values
 * between different representations.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 * <P>
 * See the section <A href="../../../../technotes/guides/idl/jidlExceptions.html#minorcodemeanings">meaning
 * of minor codes</A> to see the minor codes for this exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
