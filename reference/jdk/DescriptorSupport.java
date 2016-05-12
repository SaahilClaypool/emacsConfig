_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    /* If you set jmx.serial.form to "1.2.0" or "1.2.1", then we are

    /**
     * Serializes a {@link DescriptorSupport} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link DescriptorSupport} from an {@link
     * ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    @Override

    /**
     * Returns a human readable string representing the
     * descriptor.  The string will be in the format of
     * "fieldName=fieldValue,fieldName2=fieldValue2,..."<br>
     *
     * If there are no fields in the descriptor, then an empty String
     * is returned.<br>
     *
     * If a fieldValue is an object then the toString() method is
     * called on it and its returned value is used as the value for
     * the field enclosed in parenthesis.
     *
     * @exception RuntimeOperationsException for illegal value for
     * field Names or field Values.  If the descriptor string fails
     * for any reason, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    private static String makeFieldValue(Object value) {

    /**
     * Make the string that will go inside "..." for a value that is not
     * a plain String.
     * @throws RuntimeOperationsException if the value cannot be encoded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    public synchronized String toXMLString() {

    /**
     * <p>Returns an XML String representing the descriptor.</p>
     *
     * <p>The format is not defined, but an implementation must
     * ensure that the string returned by this method can be
     * used to build an equivalent descriptor when instantiated
     * using the constructor {@link #DescriptorSupport(String)
     * DescriptorSupport(String inStr)}.</p>
     *
     * <p>Fields which are not String objects will have toString()
     * called on them to create the value. The value will be
     * enclosed in parentheses.  It is not guaranteed that you can
     * reconstruct these objects unless they have been
     * specifically set up to support toString() in a meaningful
     * format and have a matching constructor that accepts a
     * String in the same format.</p>
     *
     * <p>If the descriptor is empty the following String is
     * returned: &lt;Descriptor&gt;&lt;/Descriptor&gt;</p>
     *
     * @return the XML string.
     *
     * @exception RuntimeOperationsException for illegal value for
     * field Names or field Values.  If the XML formatted string
     * construction fails for any reason, this exception will be
     * thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    public synchronized boolean isValid() throws RuntimeOperationsException {

    /**
     * Returns true if all of the fields have legal values given their
     * names.
     * <P>
     * This implementation does not support  interoperating with a directory
     * or lookup service. Thus, conforming to the specification, no checking is
     * done on the <i>"export"</i> field.
     * <P>
     * Otherwise this implementation returns false if:
     * <UL>
     * <LI> name and descriptorType fieldNames are not defined, or
     * null, or empty, or not String
     * <LI> class, role, getMethod, setMethod fieldNames, if defined,
     * are null or not String
     * <LI> persistPeriod, currencyTimeLimit, lastUpdatedTimeStamp,
     * lastReturnedTimeStamp if defined, are null, or not a Numeric
     * String or not a Numeric Value {@literal >= -1}
     * <LI> log fieldName, if defined, is null, or not a Boolean or
     * not a String with value "t", "f", "true", "false". These String
     * values must not be case sensitive.
     * <LI> visibility fieldName, if defined, is null, or not a
     * Numeric String or a not Numeric Value {@literal >= 1 and <= 4}
     * <LI> severity fieldName, if defined, is null, or not a Numeric
     * String or not a Numeric Value {@literal >= 0 and <= 6}<br>
     * <LI> persistPolicy fieldName, if defined, is null, or not one of
     * the following strings:<br>
     *   "OnUpdate", "OnTimer", "NoMoreOftenThan", "OnUnregister", "Always",
     *   "Never". These String values must not be case sensitive.<br>
     * </UL>
     *
     * @exception RuntimeOperationsException If the validity checking
     * fails for any reason, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    // Note: this Javadoc is copied from javax.management.Descriptor

    /**
     * <p>Returns the hash code value for this descriptor.  The hash
     * code is computed as the sum of the hash codes for each field in
     * the descriptor.  The hash code of a field with name {@code n}
     * and value {@code v} is {@code n.toLowerCase().hashCode() ^ h}.
     * Here {@code h} is the hash code of {@code v}, computed as
     * follows:</p>
     *
     * <ul>
     * <li>If {@code v} is null then {@code h} is 0.</li>
     * <li>If {@code v} is a primitive array then {@code h} is computed using
     * the appropriate overloading of {@code java.util.Arrays.hashCode}.</li>
     * <li>If {@code v} is an object array then {@code h} is computed using
     * {@link java.util.Arrays#deepHashCode(Object[]) Arrays.deepHashCode}.</li>
     * <li>Otherwise {@code h} is {@code v.hashCode()}.</li>
     * </ul>
     *
     * @return A hash code value for this object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    // Note: this Javadoc is copied from javax.management.Descriptor

    /**
     * Compares this descriptor to the given object.  The objects are equal if
     * the given object is also a Descriptor, and if the two Descriptors have
     * the same field names (possibly differing in case) and the same
     * associated values.  The respective values for a field in the two
     * Descriptors are equal if the following conditions hold:
     *
     * <ul>
     * <li>If one value is null then the other must be too.</li>
     * <li>If one value is a primitive array then the other must be a primitive
     * array of the same type with the same elements.</li>
     * <li>If one value is an object array then the other must be too and
     * {@link java.util.Arrays#deepEquals(Object[],Object[]) Arrays.deepEquals}
     * must return true.</li>
     * <li>Otherwise {@link Object#equals(Object)} must return true.</li>
     * </ul>
     *
     * @param o the object to compare with.
     *
     * @return {@code true} if the objects are the same; {@code false}
     * otherwise.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    @Override

    /**
     * Returns a new Descriptor which is a duplicate of the Descriptor.
     *
     * @exception RuntimeOperationsException for illegal value for
     * field Names or field Values.  If the descriptor construction
     * fails for any reason, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    public DescriptorSupport(String... fields)

    /**
     * Constructor taking fields in the <i>fieldName=fieldValue</i>
     * format.
     *
     * @param fields String array with each element containing a
     * field name and value.  If this array is null or empty, then the
     * default constructor will be executed. Null strings or empty
     * strings will be ignored.
     *
     * <p>All field values should be Strings.  If the field values are
     * not Strings, the programmer will have to reset or convert these
     * fields correctly.
     *
     * <p>Note: Each string should be of the form
     * <i>fieldName=fieldValue</i>.  The field name
     * ends at the first {@code =} character; for example if the String
     * is {@code a=b=c} then the field name is {@code a} and its value
     * is {@code b=c}.
     *
     * @exception RuntimeOperationsException for illegal value for
     * field Names or field Values.  The field must contain an
     * "=". "=fieldValue", "fieldName", and "fieldValue" are illegal.
     * FieldName cannot be null.  "fieldName=" will cause the value to
     * be null.  If the descriptor construction fails for any reason,
     * this exception will be thrown.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    public DescriptorSupport(String[] fieldNames, Object[] fieldValues)

    /**
     * Constructor taking field names and field values.  Neither array
     * can be null.
     *
     * @param fieldNames String array of field names.  No elements of
     * this array can be null.
     * @param fieldValues Object array of the corresponding field
     * values.  Elements of the array can be null. The
     * <code>fieldValue</code> must be valid for the
     * <code>fieldName</code> (as defined in method {@link #isValid
     * isValid})
     *
     * <p>Note: array sizes of parameters should match. If both arrays
     * are empty, then an empty descriptor is created.</p>
     *
     * @exception RuntimeOperationsException for illegal value for
     * field Names or field Values.  The array lengths must be equal.
     * If the descriptor construction fails for any reason, this
     * exception will be thrown.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    /* At some stage we should rewrite this code to be cleverer.  Using

    /**
     * <p>Descriptor constructor taking an XML String.</p>
     *
     * <p>The format of the XML string is not defined, but an
     * implementation must ensure that the string returned by
     * {@link #toXMLString() toXMLString()} on an existing
     * descriptor can be used to instantiate an equivalent
     * descriptor using this constructor.</p>
     *
     * <p>In this implementation, all field values will be created
     * as Strings.  If the field values are not Strings, the
     * programmer will have to reset or convert these fields
     * correctly.</p>
     *
     * @param inStr An XML-formatted string used to populate this
     * Descriptor.  The format is not defined, but any
     * implementation must ensure that the string returned by
     * method {@link #toXMLString toXMLString} on an existing
     * descriptor can be used to instantiate an equivalent
     * descriptor when instantiated using this constructor.
     *
     * @exception RuntimeOperationsException If the String inStr
     * passed in parameter is null
     * @exception XMLParseException XML parsing problem while parsing
     * the input String
     * @exception MBeanException Wraps a distributed communication Exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    public DescriptorSupport(DescriptorSupport inDescr) {

    /**
     * Descriptor constructor taking a Descriptor as parameter.
     * Creates a new descriptor initialized to the values of the
     * descriptor passed in parameter.
     *
     * @param inDescr the descriptor to be used to initialize the
     * constructed descriptor. If it is null or contains no descriptor
     * fields, an empty Descriptor will be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    public DescriptorSupport(int initNumFields)

    /**
     * Descriptor constructor.  Takes as parameter the initial
     * capacity of the Map that stores the descriptor fields.
     * Capacity will grow as needed.<br> Note that the created empty
     * descriptor is not a valid descriptor (the method {@link
     * #isValid isValid} returns <CODE>false</CODE>).
     *
     * @param initNumFields The initial capacity of the Map that
     * stores the descriptor fields.
     *
     * @exception RuntimeOperationsException for illegal value for
     * initNumFields (&lt;= 0)
     * @exception MBeanException Wraps a distributed communication Exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    public DescriptorSupport() {

    /**
     * Descriptor default constructor.
     * Default initial descriptor size is 20.  It will grow as needed.<br>
     * Note that the created empty descriptor is not a valid descriptor
     * (the method {@link #isValid isValid} returns <CODE>false</CODE>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField descriptor HashMap The collection of fields representing this descriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/DescriptorSupport.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * This class represents the metadata set for a ModelMBean element.  A
 * descriptor is part of the ModelMBeanInfo,
 * ModelMBeanNotificationInfo, ModelMBeanAttributeInfo,
 * ModelMBeanConstructorInfo, and ModelMBeanParameterInfo.
 * <P>
 * A descriptor consists of a collection of fields.  Each field is in
 * fieldname=fieldvalue format.  Field names are not case sensitive,
 * case will be preserved on field values.
 * <P>
 * All field names and values are not predefined. New fields can be
 * defined and added by any program.  Some fields have been predefined
 * for consistency of implementation and support by the
 * ModelMBeanInfo, ModelMBeanAttributeInfo, ModelMBeanConstructorInfo,
 * ModelMBeanNotificationInfo, ModelMBeanOperationInfo and ModelMBean
 * classes.
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-6292969195866300415L</code>.
 *
 * @since 1.5
 */
