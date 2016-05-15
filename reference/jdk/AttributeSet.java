_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Compile a method that outputs the attributes in this set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check the contents of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of this attribute set. Recognised attributes are
     * "name" (required) and "use-attribute-sets" (optional).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public void ignore() {

    /**
     * Call this method to prevent a method for being compiled for this set.
     * This is used in case several <xsl:attribute-set...> elements constitute
     * a single set (with one name). The last element will merge itself with
     * any previous set(s) with the same name and disable the other set(s).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public String getMethodName() {

    /**
     * Returns the method name of this attribute set. This method name is
     * generated by the compiler (XSLTC)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public QName getName() {

    /**
     * Returns the QName of this attribute set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
final class AttributeSet extends TopLevelElement {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Compile a method that outputs the attributes in this set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check the contents of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of this attribute set. Recognised attributes are
     * "name" (required) and "use-attribute-sets" (optional).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public void ignore() {

    /**
     * Call this method to prevent a method for being compiled for this set.
     * This is used in case several <xsl:attribute-set...> elements constitute
     * a single set (with one name). The last element will merge itself with
     * any previous set(s) with the same name and disable the other set(s).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public String getMethodName() {

    /**
     * Returns the method name of this attribute set. This method name is
     * generated by the compiler (XSLTC)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
    public QName getName() {

    /**
     * Returns the QName of this attribute set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/AttributeSet.java
final class AttributeSet extends TopLevelElement {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public int hashCode();

    /**
     * Returns the hash code value for this attribute set. The hash code of an
     * attribute set is defined to be the sum of the hash codes of each entry
     * in the AttributeSet.
     * This ensures that <tt>t1.equals(t2)</tt> implies that
     * <tt>t1.hashCode()==t2.hashCode()</tt> for any two attribute sets
     * <tt>t1</tt> and <tt>t2</tt>, as required by the general contract of
     * {@link java.lang.Object#hashCode() Object.hashCode()}.
     *
     * @return  The hash code value for this attribute set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean equals(Object object);

    /**
     * Compares the specified object with this attribute set for equality.
     * Returns <tt>true</tt> if the given object is also an attribute set and
     * the two attribute sets contain the same attribute category-attribute
     * value mappings. This ensures that the
     * <tt>equals()</tt> method works properly across different
     * implementations of the AttributeSet interface.
     *
     * @param  object to be compared for equality with this attribute set.
     *
     * @return  <tt>true</tt> if the specified object is equal to this
     *       attribute   set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean isEmpty();

    /**
     * Returns true if this attribute set contains no attributes.
     *
     * @return true if this attribute set contains no attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public void clear();

    /**
     * Removes all attributes from this attribute set.
     *
     * @throws  UnmodifiableSetException
     *   (unchecked exception) Thrown if this attribute set does not support
     *     the <CODE>clear()</CODE> operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public Attribute[] toArray();

    /**
     * Returns an array of the attributes contained in this set.
     * @return the Attributes contained in this set as an array, zero length
     * if the AttributeSet is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public int size();

    /**
     * Returns the number of attributes in this attribute set. If this
     * attribute set contains more than <tt>Integer.MAX_VALUE</tt> elements,
     * returns  <tt>Integer.MAX_VALUE</tt>.
     *
     * @return  The number of attributes in this attribute set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean addAll(AttributeSet attributes);

    /**
     * Adds all of the elements in the specified set to this attribute.
     * The outcome is the same as if the =
     * {@link #add(Attribute) add(Attribute)}
     * operation had been applied to this attribute set successively with each
     * element from the specified set.
     * The behavior of the <CODE>addAll(AttributeSet)</CODE>
     * operation is unspecified if the specified set is modified while
     * the operation is in progress.
     * <P>
     * If the <CODE>addAll(AttributeSet)</CODE> operation throws an exception,
     * the effect on this attribute set's state is implementation dependent;
     * elements from the specified set before the point of the exception may
     * or may not have been added to this attribute set.
     *
     * @param  attributes  whose elements are to be added to this attribute
     *            set.
     *
     * @return  <tt>true</tt> if this attribute set changed as a result of the
     *          call.
     *
     * @throws  UnmodifiableSetException
     *     (Unchecked exception) Thrown if this attribute set does not support
     *     the <tt>addAll(AttributeSet)</tt> method.
     * @throws  NullPointerException
     *     (Unchecked exception) Thrown if some element in the specified
     *     set is null.
     *
     * @see #add(Attribute)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean containsValue(Attribute attribute);

    /**
     * Returns <tt>true</tt> if this attribute set contains the given
     * attribute value.
     *
     * @param  attribute  Attribute value whose presence in this
     * attribute set is to be tested.
     *
     * @return  <tt>true</tt> if this attribute set contains the given
     *      attribute  value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean containsKey(Class<?> category);

    /**
     * Returns <tt>true</tt> if this attribute set contains an
     * attribute for the specified category.
     *
     * @param  category whose presence in this attribute set is
     *            to be tested.
     *
     * @return  <tt>true</tt> if this attribute set contains an attribute
     *         value for the specified category.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean remove(Attribute attribute);

    /**
     * Removes the specified attribute from this attribute set if
     * present. If <CODE>attribute</CODE> is null, then
     * <CODE>remove()</CODE> does nothing and returns <tt>false</tt>.
     *
     * @param  attribute Attribute value to be removed from this attribute set.
     *
     * @return  <tt>true</tt> if this attribute set changed as a result of the
     *         call, i.e., the given attribute value had been a member of this
     *          attribute set.
     *
     * @throws  UnmodifiableSetException
     *     (unchecked exception) Thrown if this attribute set does not support
     *     the <CODE>remove()</CODE> operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean remove(Class<?> category);

    /**
     * Removes any attribute for this category from this attribute set if
     * present. If <CODE>category</CODE> is null, then
     * <CODE>remove()</CODE> does nothing and returns <tt>false</tt>.
     *
     * @param  category Attribute category to be removed from this
     *                  attribute set.
     *
     * @return  <tt>true</tt> if this attribute set changed as a result of the
     *         call, i.e., the given attribute value had been a member of this
     *          attribute set.
     *
     * @throws  UnmodifiableSetException
     *     (unchecked exception) Thrown if this attribute set does not support
     *     the <CODE>remove()</CODE> operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public boolean add(Attribute attribute);

    /**
     * Adds the specified attribute to this attribute set if it is not
     * already present, first removing any existing value in the same
     * attribute category as the specified attribute value.
     *
     * @param  attribute  Attribute value to be added to this attribute set.
     *
     * @return  <tt>true</tt> if this attribute set changed as a result of the
     *          call, i.e., the given attribute value was not already a member
     *          of this attribute set.
     *
     * @throws  NullPointerException
     *     (unchecked exception) Thrown if the <CODE>attribute</CODE> is null.
     * @throws  UnmodifiableSetException
     *     (unchecked exception) Thrown if this attribute set does not support
     *     the <CODE>add()</CODE> operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
    public Attribute get(Class<?> category);

    /**
     * Returns the attribute value which this attribute set contains in the
     * given attribute category. Returns <tt>null</tt> if this attribute set
     * does not contain any attribute value in the given attribute category.
     *
     * @param  category  Attribute category whose associated attribute value
     *                   is to be returned. It must be a
     *                   {@link java.lang.Class Class}
     *                   that implements interface {@link Attribute
     *                   Attribute}.
     *
     * @return  The attribute value in the given attribute category contained
     *          in this attribute set, or <tt>null</tt> if this attribute set
     *          does not contain any attribute value in the given attribute
     *          category.
     *
     * @throws  NullPointerException
     *     (unchecked exception) Thrown if the <CODE>category</CODE> is null.
     * @throws  ClassCastException
     *     (unchecked exception) Thrown if the <CODE>category</CODE> is not a
     *     {@link java.lang.Class Class} that implements interface {@link
     *     Attribute Attribute}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/AttributeSet.java
public interface AttributeSet {

/**
 * Interface AttributeSet specifies the interface for a set of printing
 * attributes. A printing attribute is an object whose class implements
 * interface {@link Attribute Attribute}.
 * <P>
 * An attribute set contains a group of <I>attribute values,</I>
 * where duplicate values are not allowed in the set.
 * Furthermore, each value in an attribute set is
 * a member of some <I>category,</I> and at most one value in any particular
 * category is allowed in the set. For an attribute set, the values are {@link
 * Attribute Attribute} objects, and the categories are {@link java.lang.Class
 * Class} objects. An attribute's category is the class (or interface) at the
 * root of the class hierarchy for that kind of attribute. Note that an
 * attribute object's category may be a superclass of the attribute object's
 * class rather than the attribute object's class itself. An attribute
 * object's
 * category is determined by calling the {@link Attribute#getCategory()
 * getCategory()} method defined in interface {@link Attribute
 * Attribute}.
 * <P>
 * The interfaces of an AttributeSet resemble those of the Java Collections
 * API's java.util.Map interface, but is more restrictive in the types
 * it will accept, and combines keys and values into an Attribute.
 * <P>
 * Attribute sets are used in several places in the Print Service API. In
 * each context, only certain kinds of attributes are allowed to appear in the
 * attribute set, as determined by the tagging interfaces which the attribute
 * class implements -- {@link DocAttribute DocAttribute}, {@link
 * PrintRequestAttribute PrintRequestAttribute}, {@link PrintJobAttribute
 * PrintJobAttribute}, and {@link PrintServiceAttribute
 * PrintServiceAttribute}.
 * There are four specializations of an attribute set that are restricted to
 * contain just one of the four kinds of attribute -- {@link DocAttributeSet
 * DocAttributeSet}, {@link PrintRequestAttributeSet
 * PrintRequestAttributeSet},
 * {@link PrintJobAttributeSet PrintJobAttributeSet}, and {@link
 * PrintServiceAttributeSet PrintServiceAttributeSet}, respectively. Note that
 * many attribute classes implement more than one tagging interface and so may
 * appear in more than one context.
 * <UL>
 * <LI>
 * A {@link DocAttributeSet DocAttributeSet}, containing {@link DocAttribute
 * DocAttribute}s, specifies the characteristics of an individual doc and the
 * print job settings to be applied to an individual doc.
 * <P>
 * <LI>
 * A {@link PrintRequestAttributeSet PrintRequestAttributeSet}, containing
 * {@link PrintRequestAttribute PrintRequestAttribute}s, specifies the
 * settings
 * to be applied to a whole print job and to all the docs in the print job.
 * <P>
 * <LI>
 * A {@link PrintJobAttributeSet PrintJobAttributeSet}, containing {@link
 * PrintJobAttribute PrintJobAttribute}s, reports the status of a print job.
 * <P>
 * <LI>
 * A {@link PrintServiceAttributeSet PrintServiceAttributeSet}, containing
 * {@link PrintServiceAttribute PrintServiceAttribute}s, reports the status of
 *  a Print Service instance.
 * </UL>
 * <P>
 * In some contexts, the client is only allowed to examine an attribute set's
 * contents but not change them (the set is read-only). In other places, the
 * client is allowed both to examine and to change an attribute set's contents
 * (the set is read-write). For a read-only attribute set, calling a mutating
 * operation throws an UnmodifiableSetException.
 * <P>
 * The Print Service API provides one implementation of interface
 * AttributeSet, class {@link HashAttributeSet HashAttributeSet}.
 * A client can use class {@link
 * HashAttributeSet HashAttributeSet} or provide its own implementation of
 * interface AttributeSet. The Print Service API also provides
 * implementations of interface AttributeSet's subinterfaces -- classes {@link
 * HashDocAttributeSet HashDocAttributeSet},
 * {@link HashPrintRequestAttributeSet
 * HashPrintRequestAttributeSet}, {@link HashPrintJobAttributeSet
 * HashPrintJobAttributeSet}, and {@link HashPrintServiceAttributeSet
 * HashPrintServiceAttributeSet}.
 * <P>
 *
 * @author  Alan Kaminsky
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public static final Object ResolveAttribute = StyleConstants.ResolveAttribute;

    /**
     * Attribute name used to identify the resolving parent
     * set of attributes, if one is defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public static final Object NameAttribute = StyleConstants.NameAttribute;

    /**
     * Attribute name used to name the collection of
     * attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public AttributeSet getResolveParent();

    /**
     * Gets the resolving parent.
     *
     * @return the parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public boolean containsAttributes(AttributeSet attributes);

    /**
     * Returns {@code true} if this set defines all the attributes from the
     * given set with equal values. If an attribute is not found locally,
     * it is searched through in the resolving parent hierarchy.
     *
     * @param attributes the set of attributes to check against
     * @return {@code true} if this set defines all the attributes with equal
     *              values, either locally or through its resolving parent
     * @throws NullPointerException if {@code attributes} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public boolean containsAttribute(Object name, Object value);

    /**
     * Returns {@code true} if this set defines an attribute with the same
     * name and an equal value. If such an attribute is not found locally,
     * it is searched through in the resolving parent hierarchy.
     *
     * @param name the non-null attribute name
     * @param value the value
     * @return {@code true} if the set defines the attribute with an
     *     equal value, either locally or through its resolving parent
     * @throws NullPointerException if either {@code name} or
     *      {@code value} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public Enumeration<?> getAttributeNames();

    /**
     * Returns an enumeration over the names of the attributes that are
     * defined locally in the set. Names of attributes defined in the
     * resolving parent, if any, are not included. The values of the
     * <code>Enumeration</code> may be anything and are not constrained to
     * a particular <code>Object</code> type.
     * <p>
     * This method never returns {@code null}. For a set with no attributes, it
     * returns an empty {@code Enumeration}.
     *
     * @return the names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public Object getAttribute(Object key);

    /**
     * Fetches the value of the given attribute. If the value is not found
     * locally, the search is continued upward through the resolving
     * parent (if one exists) until the value is either
     * found or there are no more parents.  If the value is not found,
     * null is returned.
     *
     * @param key the non-null key of the attribute binding
     * @return the value of the attribute, or {@code null} if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public AttributeSet copyAttributes();

    /**
     * Returns an attribute set that is guaranteed not
     * to change over time.
     *
     * @return a copy of the attribute set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public boolean isEqual(AttributeSet attr);

    /**
     * Determines if the two attribute sets are equivalent.
     *
     * @param attr an attribute set
     * @return true if the sets are equivalent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public boolean isDefined(Object attrName);

    /**
     * Checks whether the named attribute has a value specified in
     * the set without resolving through another attribute
     * set.
     *
     * @param attrName the attribute name
     * @return true if the attribute has a value specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public int getAttributeCount();

    /**
     * Returns the number of attributes that are defined locally in this set.
     * Attributes that are defined in the parent set are not included.
     *
     * @return the number of attributes &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public interface ParagraphAttribute {

    /**
     * This interface is the type signature that is expected
     * to be present on any attribute key that contributes to
     * the paragraph level presentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public interface CharacterAttribute {

    /**
     * This interface is the type signature that is expected
     * to be present on any attribute key that contributes to
     * character level presentation.  This would be any attribute
     * that applies to a so-called <i>run</i> of
     * style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public interface ColorAttribute {

    /**
     * This interface is the type signature that is expected
     * to be present on any attribute key that contributes to
     * presentation of color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
    public interface FontAttribute {

    /**
     * This interface is the type signature that is expected
     * to be present on any attribute key that contributes to
     * the determination of what font to use to render some
     * text.  This is not considered to be a closed set, the
     * definition can change across version of the platform and can
     * be amended by additional user added entries that
     * correspond to logical settings that are specific to
     * some type of content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AttributeSet.java
public interface AttributeSet {

/**
 * A collection of unique attributes.  This is a read-only,
 * immutable interface.  An attribute is basically a key and
 * a value assigned to the key.  The collection may represent
 * something like a style run, a logical style, etc.  These
 * are generally used to describe features that will contribute
 * to some graphical representation such as a font.  The
 * set of possible keys is unbounded and can be anything.
 * Typically View implementations will respond to attribute
 * definitions and render something to represent the attributes.
 * <p>
 * Attributes can potentially resolve in a hierarchy.  If a
 * key doesn't resolve locally, and a resolving parent
 * exists, the key will be resolved through the parent.
 *
 * @author  Timothy Prinzing
 * @see MutableAttributeSet
 */