_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/LongHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Returns the <code>TypeCode</code> object
     * corresponding to the value held in the Holder.
     *
     * @return    the TypeCode of the value held in the holder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/LongHolder.java
    public void _write(OutputStream output) {

    /**
     * Marshals to <code>output</code> the value in the Holder.
     *
     * @param output the OutputStream which will contain the CDR formatted data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/LongHolder.java
    public void _read(InputStream input) {

    /**
     * Reads from <code>input</code> and initalizes the value in the Holder
     * with the unmarshalled data.
     *
     * @param input the InputStream containing CDR formatted data from the wire
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/LongHolder.java
    public LongHolder(long initial) {

    /**
     * Constructs a new <code>LongHolder</code> object with its
     * <code>value</code> field initialized to the given
     * <code>long</code>.
     * @param initial the <code>long</code> with which to initialize
     *                the <code>value</code> field of the newly-created
     *                <code>LongHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/LongHolder.java
    public LongHolder() {

    /**
     * Constructs a new <code>LongHolder</code> object with its
     * <code>value</code> field initialized to <code>0</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/LongHolder.java
    public long value;

    /**
     * The <code>long</code> value held by this <code>LongHolder</code>
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/LongHolder.java
public final class LongHolder implements Streamable {

/**
 * The Holder for <tt>Long</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a <code>long</code>
 * that is used to store "out" and "inout" parameters in IDL methods.
 * If an IDL method signature has an IDL <code>long long</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>LongHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myLongHolder</code> is an instance of <code>LongHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myLongHolder.value</code>.
 *
 * @since       JDK1.2
 */
