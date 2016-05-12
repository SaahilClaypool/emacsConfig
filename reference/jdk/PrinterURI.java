_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterURI.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PrinterURI and any vendor-defined subclasses, the category
     * name is <CODE>"printer-uri"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterURI.java
    public final Class<? extends Attribute> getCategory() {

   /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PrinterURI and any vendor-defined subclasses, the category is
     * class PrinterURI itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterURI.java
    public boolean equals(Object object) {

    /**
     * Returns whether this printer name attribute is equivalent to the passed
     * in object. To be equivalent, all of the following conditions must be
     * true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>object</CODE> is not null.
     * <LI>
     * <CODE>object</CODE> is an instance of class PrinterURI.
     * <LI>
     * This PrinterURI attribute's underlying URI and
     * <CODE>object</CODE>'s underlying URI are equal.
     * </OL>
     *
     * @param  object  Object to compare to.
     *
     * @return  True if <CODE>object</CODE> is equivalent to this PrinterURI
     *          attribute, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterURI.java
    public PrinterURI(URI uri) {

    /**
     * Constructs a new PrinterURI attribute with the specified URI.
     *
     * @param  uri  URI of the printer
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>uri</CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterURI.java
public final class PrinterURI extends URISyntax

/**
 * Class PrinterURI is a printing attribute class, a URI, that specifies the
 * globally unique name of a printer.  If it has such a name, an administrator
 * determines a printer's URI and sets this attribute to that name.
 * <P>
 * <B>IPP Compatibility:</B>  This implements the
 * IPP printer-uri attribute. The string form returned by
 * <CODE>toString()</CODE>  gives the IPP printer-uri value.
 * The category name returned by <CODE>getName()</CODE>
 * gives the IPP attribute name.
 * <P>
 *
 * @author  Robert Herriot
 */
