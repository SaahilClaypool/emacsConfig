_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
        public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class Chromaticity, the category name is <CODE>"chromaticity"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class Chromaticity, the category is the class Chromaticity itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class Chromaticity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for class Chromaticity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
    protected Chromaticity(int value) {

    /**
     * Construct a new chromaticity enumeration value with the given integer
     * value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
    public static final Chromaticity COLOR = new Chromaticity(1);

    /**
     * Color printing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
    public static final Chromaticity MONOCHROME = new Chromaticity(0);

    /**
     * Monochrome printing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/Chromaticity.java
public final class Chromaticity extends EnumSyntax

/**
 * Class Chromaticity is a printing attribute class, an enumeration, that
 * specifies monochrome or color printing. This is used by a print client
 * to specify how the print data should be generated or processed. It is not
 * descriptive of the color capabilities of the device. Query the service's
 * {@link ColorSupported ColorSupported} attribute to determine if the device
 * can be verified to support color printing.
 * <P>
 * The table below shows the effects of specifying a Chromaticity attribute of
 * {@link #MONOCHROME MONOCHROME} or {@link #COLOR COLOR}
 * for a monochrome or color document.
 * <P>
 * <TABLE BORDER=1 CELLPADDING=2 CELLSPACING=1 SUMMARY="Shows effects of specifying MONOCHROME or COLOR Chromaticity attributes">
 * <TR>
 * <TH>
 * Chromaticity<BR>Attribute
 * </TH>
 * <TH>
 * Effect on<BR>Monochrome Document
 * </TH>
 * <TH>
 * Effect on<BR>Color Document
 * </TH>
 * </TR>
 * <TR>
 * <TD>
 * {@link #MONOCHROME MONOCHROME}
 * </TD>
 * <TD>
 * Printed as is, in monochrome
 * </TD>
 * <TD>
 * Printed in monochrome, with colors converted to shades of gray
 * </TD>
 * </TR>
 * <TR>
 * <TD>
 * {@link #COLOR COLOR}
 * </TD>
 * <TD>
 * Printed as is, in monochrome
 * </TD>
 * <TD>
 * Printed as is, in color
 * </TD>
 * </TR>
 * </TABLE>
 * <P>
 * <P>
 * <B>IPP Compatibility:</B> Chromaticity is not an IPP attribute at present.
 * <P>
 *
 * @author  Alan Kaminsky
 */
