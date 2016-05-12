_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/URISyntax.java
    public String toString() {

    /**
     * Returns a String identifying this URI attribute. The String is the
     * string representation of the attribute's underlying URI.
     *
     * @return  A String identifying this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/URISyntax.java
    public boolean equals(Object object) {

    /**
     * Returns whether this URI attribute is equivalent to the passed in
     * object.
     * To be equivalent, all of the following conditions must be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>object</CODE> is not null.
     * <LI>
     * <CODE>object</CODE> is an instance of class URISyntax.
     * <LI>
     * This URI attribute's underlying URI and <CODE>object</CODE>'s
     * underlying URI are equal.
     * </OL>
     *
     * @param  object  Object to compare to.
     *
     * @return  True if <CODE>object</CODE> is equivalent to this URI
     *          attribute, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/URISyntax.java
    public int hashCode() {

    /**
     * Returns a hashcode for this URI attribute.
     *
     * @return  A hashcode value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/URISyntax.java
    public URI getURI()  {

    /**
     * Returns this URI attribute's URI value.
     * @return the URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/URISyntax.java
    protected URISyntax(URI uri) {

    /**
     * Constructs a URI attribute with the specified URI.
     *
     * @param  uri  URI.
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>uri</CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/URISyntax.java
    private URI uri;

    /**
     * URI value of this URI attribute.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/URISyntax.java
public abstract class URISyntax implements Serializable, Cloneable {

/**
 * Class URISyntax is an abstract base class providing the common
 * implementation of all attributes whose value is a Uniform Resource
 * Identifier (URI). Once constructed, a URI attribute's value is immutable.
 * <P>
 *
 * @author  Alan Kaminsky
 */
