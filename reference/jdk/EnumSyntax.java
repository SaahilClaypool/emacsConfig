_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    protected int getOffset() {

    /**
     * Returns the lowest integer value used by this enumeration value's
     * enumeration class.
     * <P>
     * The default implementation returns 0. If the enumeration class (a
     * subclass of class EnumSyntax) uses integer values starting at other than
     * 0, override this method in the subclass.
     * @return the offset of the lowest enumeration value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for this enumeration value's
     * enumeration class. The enumeration class's integer values are assumed to
     * lie in the range <I>L</I>..<I>L</I>+<I>N</I>-1, where <I>L</I> is the
     * value returned by {@link #getOffset() getOffset()} and
     * <I>N</I> is the length of the enumeration value table. The element in the
     * enumeration value table at index <I>i</I>-<I>L</I> is the enumeration
     * value object whose integer value is <I>i</I>; the {@link #readResolve()
     * readResolve()} method needs this to preserve singleton
     * semantics during deserialization of an enumeration instance. If an
     * integer within the above range is not used by any enumeration value,
     * leave the corresponding table element null.
     * <P>
     * The default implementation returns null. If the enumeration class (a
     * subclass of class EnumSyntax) does not override this method to return
     * a non-null enumeration value table, and the subclass does not override
     * the {@link #readResolve() readResolve()} method, the base
     * class {@link #readResolve() readResolve()} method will throw
     * an exception whenever an enumeration instance is deserialized from an
     * object input stream.
     * @return the value table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    protected String[] getStringTable() {

    /**
     * Returns the string table for this enumeration value's enumeration class.
     * The enumeration class's integer values are assumed to lie in the range
     * <I>L</I>..<I>L</I>+<I>N</I>-1, where <I>L</I> is the value returned by
     * {@link #getOffset() getOffset()} and <I>N</I> is the length
     * of the string table. The element in the string table at index
     * <I>i</I>-<I>L</I> is the value returned by {@link #toString()
     * toString()} for the enumeration value whose integer value
     * is <I>i</I>. If an integer within the above range is not used by any
     * enumeration value, leave the corresponding table element null.
     * <P>
     * The default implementation returns null. If the enumeration class (a
     * subclass of class EnumSyntax) does not override this method to return a
     * non-null string table, and the subclass does not override the {@link
     * #toString() toString()} method, the base class {@link
     * #toString() toString()} method will return just a string
     * representation of this enumeration value's integer value.
     * @return the string table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    protected Object readResolve() throws ObjectStreamException {

    /**
     * During object input, convert this deserialized enumeration instance to
     * the proper enumeration value defined in the enumeration attribute class.
     *
     * @return  The enumeration singleton value stored at index
     *          <I>i</I>-<I>L</I> in the enumeration value table returned by
     *          {@link #getEnumValueTable() getEnumValueTable()},
     *          where <I>i</I> is this enumeration value's integer value and
     *          <I>L</I> is the value returned by {@link #getOffset()
     *          getOffset()}.
     *
     * @throws ObjectStreamException if the stream can't be deserialised
     * @throws  InvalidObjectException
     *     Thrown if the enumeration value table is null, this enumeration
     *     value's integer value does not correspond to an element in the
     *     enumeration value table, or the corresponding element in the
     *     enumeration value table is null. (Note: {@link
     *     java.io.InvalidObjectException InvalidObjectException} is a subclass
     *     of {@link java.io.ObjectStreamException ObjectStreamException}, which
     *     <CODE>readResolve()</CODE> is declared to throw.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    public String toString() {

    /**
     * Returns a string value corresponding to this enumeration value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    public int hashCode() {

    /**
     * Returns a hash code value for this enumeration value. The hash code is
     * just this enumeration value's integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    public Object clone() {

    /**
     * Returns a clone of this enumeration value, which to preserve the
     * semantics of enumeration values is the same object as this enumeration
     * value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    public int getValue() {

    /**
     * Returns this enumeration value's integer value.
     * @return the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    protected EnumSyntax(int value) {

    /**
     * Construct a new enumeration value with the given integer value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
    private int value;

    /**
     * This enumeration value's integer value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/EnumSyntax.java
public abstract class EnumSyntax implements Serializable, Cloneable {

/**
 * Class EnumSyntax is an abstract base class providing the common
 * implementation of all "type safe enumeration" objects. An enumeration class
 * (which extends class EnumSyntax) provides a group of enumeration values
 * (objects) that are singleton instances of the enumeration class; for example:
 * <PRE>
 *     public class Bach extends EnumSyntax {
 *         public static final Bach JOHANN_SEBASTIAN     = new Bach(0);
 *         public static final Bach WILHELM_FRIEDEMANN   = new Bach(1);
 *         public static final Bach CARL_PHILIP_EMMANUEL = new Bach(2);
 *         public static final Bach JOHANN_CHRISTIAN     = new Bach(3);
 *         public static final Bach P_D_Q                = new Bach(4);
 *
 *         private static final String[] stringTable = {
 *             "Johann Sebastian Bach",
 *              "Wilhelm Friedemann Bach",
 *              "Carl Philip Emmanuel Bach",
 *              "Johann Christian Bach",
 *              "P.D.Q. Bach"
 *         };
 *
 *         protected String[] getStringTable() {
 *             return stringTable;
 *         }
 *
 *         private static final Bach[] enumValueTable = {
 *             JOHANN_SEBASTIAN,
 *              WILHELM_FRIEDEMANN,
 *              CARL_PHILIP_EMMANUEL,
 *              JOHANN_CHRISTIAN,
 *              P_D_Q
 *         };
 *
 *         protected EnumSyntax[] getEnumValueTable() {
 *             return enumValueTable;
 *         }
 *     }
 * </PRE>
 * You can then write code that uses the <CODE>==</CODE> and <CODE>!=</CODE>
 * operators to test enumeration values; for example:
 * <PRE>
 *     Bach theComposer;
 *     . . .
 *     if (theComposer == Bach.JOHANN_SEBASTIAN) {
 *         System.out.println ("The greatest composer of all time!");
 *     }
 * </PRE>
 * The <CODE>equals()</CODE> method for an enumeration class just does a test
 * for identical objects (<CODE>==</CODE>).
 * <P>
 * You can convert an enumeration value to a string by calling {@link
 * #toString() toString()}. The string is obtained from a table
 * supplied by the enumeration class.
 * <P>
 * Under the hood, an enumeration value is just an integer, a different integer
 * for each enumeration value within an enumeration class. You can get an
 * enumeration value's integer value by calling {@link #getValue()
 * getValue()}. An enumeration value's integer value is established
 * when it is constructed (see {@link #EnumSyntax(int)
 * EnumSyntax(int)}). Since the constructor is protected, the only
 * possible enumeration values are the singleton objects declared in the
 * enumeration class; additional enumeration values cannot be created at run
 * time.
 * <P>
 * You can define a subclass of an enumeration class that extends it with
 * additional enumeration values. The subclass's enumeration values' integer
 * values need not be distinct from the superclass's enumeration values' integer
 * values; the <CODE>==</CODE>, <CODE>!=</CODE>, <CODE>equals()</CODE>, and
 * <CODE>toString()</CODE> methods will still work properly even if the subclass
 * uses some of the same integer values as the superclass. However, the
 * application in which the enumeration class and subclass are used may need to
 * have distinct integer values in the superclass and subclass.
 * <P>
 *
 * @author  David Mendenhall
 * @author  Alan Kaminsky
 */
