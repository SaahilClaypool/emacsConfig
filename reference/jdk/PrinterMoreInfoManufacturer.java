_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterMoreInfoManufacturer.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PrinterMoreInfoManufacturer, the category name is
     * <CODE>"printer-more-info-manufacturer"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterMoreInfoManufacturer.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PrinterMoreInfoManufacturer, the category is
     * class PrinterMoreInfoManufacturer itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterMoreInfoManufacturer.java
    public boolean equals(Object object) {

    /**
     * Returns whether this printer more info manufacturer attribute is
     * equivalent to the passed in object. To be equivalent, all of the
     * following conditions must be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>object</CODE> is not null.
     * <LI>
     * <CODE>object</CODE> is an instance of class
     * PrinterMoreInfoManufacturer.
     * <LI>
     * This printer more info manufacturer attribute's URI and
     * <CODE>object</CODE>'s URI are equal.
     * </OL>
     *
     * @param  object  Object to compare to.
     *
     * @return  True if <CODE>object</CODE> is equivalent to this printer
     *          more info manufacturer attribute, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterMoreInfoManufacturer.java
    public PrinterMoreInfoManufacturer(URI uri) {

    /**
     * Constructs a new printer more info manufacturer attribute with the
     * specified URI.
     *
     * @param  uri  URI.
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>uri</CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PrinterMoreInfoManufacturer.java
public final class PrinterMoreInfoManufacturer extends URISyntax

/**
 * Class PrinterMoreInfoManufacturer is a printing attribute class, a URI,
 * that is used to obtain more information about this type of device.
 * The information obtained from this URI is intended for end user
 * consumption. Features outside the scope of the Print Service API
 * can be accessed from this URI (e.g.,
 * latest firmware, upgrades, service proxies, optional features available,
 * details on color support). The information is intended to be germane to
 * this kind of printer without regard to site specific modifications or
 * services.
 * <P>
 * In contrast, the {@link PrinterMoreInfo PrinterMoreInfo} attribute is used
 * to find out more information about this specific printer rather than this
 * general kind of printer.
 * <P>
 * <P>
 * <B>IPP Compatibility:</B> The string form returned by
 * <CODE>toString()</CODE> gives the IPP uri value.
 * The category name returned by <CODE>getName()</CODE>
 * gives the IPP attribute name.
 * <P>
 *
 * @author  Alan Kaminsky
 */