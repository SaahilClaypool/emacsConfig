_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DoubleHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Return the <code>TypeCode</code> of this holder object.
     *
     * @return the <code>TypeCode</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DoubleHolder.java
    public void _write(OutputStream output) {

    /**
     * Write the double value stored in this holder to an
     * <code>OutputStream</code>.
     *
     * @param output the <code>OutputStream</code> to write into.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DoubleHolder.java
    public void _read(InputStream input) {

    /**
     * Read a double value from the input stream and store it in the
     * value member.
     *
     * @param input the <code>InputStream</code> to read from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DoubleHolder.java
    public DoubleHolder(double initial) {

    /**
     * Constructs a new <code>DoubleHolder</code> object for the given
     * <code>double</code>.
     * @param initial the <code>double</code> with which to initialize
     *                the <code>value</code> field of the new
     *                <code>DoubleHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DoubleHolder.java
    public DoubleHolder() {

    /**
     * Constructs a new <code>DoubleHolder</code> object with its
     * <code>value</code> field initialized to 0.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DoubleHolder.java
    public double value;

    /**
     * The <code>double</code> value held by this <code>DoubleHolder</code>
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DoubleHolder.java
public final class DoubleHolder implements Streamable {

/**
 * The Holder for <tt>Double</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a <code>double</code>
 * that is used to store "out" and "inout" parameters in IDL methods.
 * If an IDL method signature has an IDL <code>double</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>DoubleHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myDoubleHolder</code> is an instance of <code>DoubleHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myDoubleHolder.value</code>.
 *
 * @since       JDK1.2
 */
