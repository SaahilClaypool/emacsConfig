_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public String toString() {

    /**
     * Returns a string representation of this
     * {@code OpenMBeanAttributeInfoSupport} instance.
     * <p>
     * The string representation consists of the name of this class (i.e.
     * {@code javax.management.openmbean.OpenMBeanAttributeInfoSupport}),
     * the string representation of the name and open type of the
     * described parameter, the string representation of its
     * default, min, max and legal values and the string
     * representation of its descriptor.
     *
     * <p>As {@code OpenMBeanAttributeInfoSupport} instances are
     * immutable, the string representation for this instance is
     * calculated once, on the first call to {@code toString}, and
     * then the same value is returned for subsequent calls.
     *
     * @return a string representation of this
     * {@code OpenMBeanAttributeInfoSupport} instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public int hashCode() {

    /**
     * <p>Returns the hash code value for this {@code
     * OpenMBeanAttributeInfoSupport} instance.</p>
     *
     * <p>The hash code of an {@code OpenMBeanAttributeInfoSupport}
     * instance is the sum of the hash codes of all elements of
     * information used in {@code equals} comparisons (ie: its name,
     * its <i>open type</i>, its default, min, max and legal
     * values, and its Descriptor).
     *
     * <p>This ensures that {@code t1.equals(t2)} implies that {@code
     * t1.hashCode()==t2.hashCode()} for any two {@code
     * OpenMBeanAttributeInfoSupport} instances {@code t1} and {@code
     * t2}, as required by the general contract of the method {@link
     * Object#hashCode() Object.hashCode()}.
     *
     * <p>However, note that another instance of a class implementing
     * the {@code OpenMBeanAttributeInfo} interface may be equal to
     * this {@code OpenMBeanAttributeInfoSupport} instance as defined
     * by {@link #equals(java.lang.Object)}, but may have a different
     * hash code if it is calculated differently.
     *
     * <p>As {@code OpenMBeanAttributeInfoSupport} instances are
     * immutable, the hash code for this instance is calculated once,
     * on the first call to {@code hashCode}, and then the same value
     * is returned for subsequent calls.
     *
     * @return the hash code value for this {@code
     * OpenMBeanAttributeInfoSupport} instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public boolean equals(Object obj) {

    /**
     * Compares the specified {@code obj} parameter with this {@code
     * OpenMBeanAttributeInfoSupport} instance for equality.
     * <p>
     * Returns {@code true} if and only if all of the following statements are true:
     * <ul>
     * <li>{@code obj} is non null,</li>
     * <li>{@code obj} also implements the {@code OpenMBeanAttributeInfo} interface,</li>
     * <li>their names are equal</li>
     * <li>their open types are equal</li>
     * <li>their access properties (isReadable, isWritable and isIs) are equal</li>
     * <li>their default, min, max and legal values are equal.</li>
     * </ul>
     * This ensures that this {@code equals} method works properly for
     * {@code obj} parameters which are different implementations of
     * the {@code OpenMBeanAttributeInfo} interface.
     *
     * <p>If {@code obj} also implements {@link DescriptorRead}, then its
     * {@link DescriptorRead#getDescriptor() getDescriptor()} method must
     * also return the same value as for this object.</p>
     *
     * @param obj the object to be compared for equality with this
     * {@code OpenMBeanAttributeInfoSupport} instance.
     *
     * @return {@code true} if the specified object is equal to this
     * {@code OpenMBeanAttributeInfoSupport} instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public boolean isValue(Object obj) {

    /**
     * Tests whether {@code obj} is a valid value for the attribute
     * described by this {@code OpenMBeanAttributeInfoSupport}
     * instance.
     *
     * @param obj the object to be tested.
     *
     * @return {@code true} if {@code obj} is a valid value for
     * the parameter described by this {@code
     * OpenMBeanAttributeInfoSupport} instance, {@code false}
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public boolean hasMaxValue() {

    /**
     * Returns {@code true} if this {@code
     * OpenMBeanAttributeInfoSupport} instance specifies a non-null
     * maximal value for the described attribute, {@code false}
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public boolean hasMinValue() {

    /**
     * Returns {@code true} if this {@code
     * OpenMBeanAttributeInfoSupport} instance specifies a non-null
     * minimal value for the described attribute, {@code false}
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public boolean hasLegalValues() {

    /**
     * Returns {@code true} if this {@code
     * OpenMBeanAttributeInfoSupport} instance specifies a non-null
     * set of legal values for the described attribute, {@code false}
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public boolean hasDefaultValue() {

    /**
     * Returns {@code true} if this {@code
     * OpenMBeanAttributeInfoSupport} instance specifies a non-null
     * default value for the described attribute, {@code false}
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public Comparable<?> getMaxValue() {

    /**
     * Returns the maximal value for the attribute described by this
     * {@code OpenMBeanAttributeInfoSupport} instance, if specified,
     * or {@code null} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public Comparable<?> getMinValue() {

    /**
     * Returns the minimal value for the attribute described by this
     * {@code OpenMBeanAttributeInfoSupport} instance, if specified,
     * or {@code null} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public Set<?> getLegalValues() {

    /**
     * Returns an unmodifiable Set of legal values for the attribute
     * described by this {@code OpenMBeanAttributeInfoSupport}
     * instance, if specified, or {@code null} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public Object getDefaultValue() {

    /**
     * Returns the default value for the attribute described by this
     * {@code OpenMBeanAttributeInfoSupport} instance, if specified,
     * or {@code null} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public OpenType<?> getOpenType() {

    /**
     * Returns the open type for the values of the attribute described
     * by this {@code OpenMBeanAttributeInfoSupport} instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    private Object readResolve() {

    /**
     * An object serialized in a version of the API before Descriptors were
     * added to this class will have an empty or null Descriptor.
     * For consistency with our
     * behavior in this version, we must replace the object with one
     * where the Descriptors reflect the same values of openType, defaultValue,
     * etc.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public <T> OpenMBeanAttributeInfoSupport(String     name,
                                             String     description,
                                             OpenType<T>   openType,
                                             boolean    isReadable,
                                             boolean    isWritable,
                                             boolean    isIs,
                                             T          defaultValue,
                                             Comparable<T> minValue,
                                             Comparable<T> maxValue)

    /**
     * Constructs an {@code OpenMBeanAttributeInfoSupport} instance,
     * which describes the attribute of an open MBean, with the
     * specified {@code name}, {@code openType}, {@code description},
     * {@code defaultValue}, {@code minValue} and {@code maxValue}.
     *
     * It is possible to specify minimal and maximal values only for
     * an open type whose values are {@code Comparable}.
     *
     * @param name  cannot be a null or empty string.
     *
     * @param description  cannot be a null or empty string.
     *
     * @param openType  cannot be null.
     *
     * @param isReadable {@code true} if the attribute has a getter
     * exposed for management.
     *
     * @param isWritable {@code true} if the attribute has a setter
     * exposed for management.
     *
     * @param isIs {@code true} if the attribute's getter is of the
     * form <tt>is<i>XXX</i></tt>.
     *
     * @param defaultValue must be a valid value for the {@code
     * openType} specified for this attribute; default value not
     * supported for {@code ArrayType} and {@code TabularType}; can be
     * null, in which case it means that no default value is set.
     *
     * @param minValue must be valid for the {@code openType}
     * specified for this attribute; can be null, in which case it
     * means that no minimal value is set.
     *
     * @param maxValue must be valid for the {@code openType}
     * specified for this attribute; can be null, in which case it
     * means that no maximal value is set.
     *
     * @param <T> allows the compiler to check that the {@code
     * defaultValue}, {@code minValue}, and {@code maxValue}, if
     * non-null, have the correct Java type for the given {@code
     * openType}.
     *
     * @throws IllegalArgumentException if {@code name} or {@code
     * description} are null or empty string, or {@code openType} is
     * null.
     *
     * @throws OpenDataException if {@code defaultValue}, {@code
     * minValue} or {@code maxValue} is not a valid value for the
     * specified {@code openType}, or {@code defaultValue} is non null
     * and {@code openType} is an {@code ArrayType} or a {@code
     * TabularType}, or both {@code minValue} and {@code maxValue} are
     * non-null and {@code minValue.compareTo(maxValue) > 0} is {@code
     * true}, or both {@code defaultValue} and {@code minValue} are
     * non-null and {@code minValue.compareTo(defaultValue) > 0} is
     * {@code true}, or both {@code defaultValue} and {@code maxValue}
     * are non-null and {@code defaultValue.compareTo(maxValue) > 0}
     * is {@code true}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public <T> OpenMBeanAttributeInfoSupport(String   name,
                                             String   description,
                                             OpenType<T> openType,
                                             boolean  isReadable,
                                             boolean  isWritable,
                                             boolean  isIs,
                                             T        defaultValue,
                                             T[]      legalValues)

    /**
     * <p>Constructs an {@code OpenMBeanAttributeInfoSupport} instance,
     * which describes the attribute of an open MBean with the
     * specified {@code name}, {@code openType}, {@code description},
     * {@code defaultValue} and {@code legalValues}, and the specified
     * read/write access properties.</p>
     *
     * <p>The contents of {@code legalValues} are copied, so subsequent
     * modifications of the array referenced by {@code legalValues}
     * have no impact on this {@code OpenMBeanAttributeInfoSupport}
     * instance.</p>
     *
     * @param name  cannot be a null or empty string.
     *
     * @param description  cannot be a null or empty string.
     *
     * @param openType  cannot be null.
     *
     * @param isReadable {@code true} if the attribute has a getter
     * exposed for management.
     *
     * @param isWritable {@code true} if the attribute has a setter
     * exposed for management.
     *
     * @param isIs {@code true} if the attribute's getter is of the
     * form <tt>is<i>XXX</i></tt>.
     *
     * @param defaultValue must be a valid value
     * for the {@code
     * openType} specified for this attribute; default value not
     * supported for {@code ArrayType} and {@code TabularType}; can
     * be null, in which case it means that no default value is set.
     *
     * @param legalValues each contained value must be valid for the
     * {@code openType} specified for this attribute; legal values
     * not supported for {@code ArrayType} and {@code TabularType};
     * can be null or empty.
     *
     * @param <T> allows the compiler to check that the {@code
     * defaultValue} and {@code legalValues}, if non-null, have the
     * correct Java type for the given {@code openType}.
     *
     * @throws IllegalArgumentException if {@code name} or {@code
     * description} are null or empty string, or {@code openType} is
     * null.
     *
     * @throws OpenDataException if {@code defaultValue} is not a
     * valid value for the specified {@code openType}, or one value in
     * {@code legalValues} is not valid for the specified {@code
     * openType}, or {@code defaultValue} is non null and {@code
     * openType} is an {@code ArrayType} or a {@code TabularType}, or
     * {@code legalValues} is non null and non empty and {@code
     * openType} is an {@code ArrayType} or a {@code TabularType}, or
     * {@code legalValues} is non null and non empty and {@code
     * defaultValue} is not contained in {@code legalValues}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public <T> OpenMBeanAttributeInfoSupport(String   name,
                                             String   description,
                                             OpenType<T> openType,
                                             boolean  isReadable,
                                             boolean  isWritable,
                                             boolean  isIs,
                                             T        defaultValue)

    /**
     * Constructs an {@code OpenMBeanAttributeInfoSupport} instance,
     * which describes the attribute of an open MBean with the
     * specified {@code name}, {@code openType}, {@code description}
     * and {@code defaultValue}, and the specified read/write access
     * properties.
     *
     * @param name  cannot be a null or empty string.
     *
     * @param description  cannot be a null or empty string.
     *
     * @param openType  cannot be null.
     *
     * @param isReadable {@code true} if the attribute has a getter
     * exposed for management.
     *
     * @param isWritable {@code true} if the attribute has a setter
     * exposed for management.
     *
     * @param isIs {@code true} if the attribute's getter is of the
     * form <tt>is<i>XXX</i></tt>.
     *
     * @param defaultValue must be a valid value for the {@code
     * openType} specified for this attribute; default value not
     * supported for {@code ArrayType} and {@code TabularType}; can
     * be null, in which case it means that no default value is set.
     *
     * @param <T> allows the compiler to check that the {@code defaultValue},
     * if non-null, has the correct Java type for the given {@code openType}.
     *
     * @throws IllegalArgumentException if {@code name} or {@code
     * description} are null or empty string, or {@code openType} is
     * null.
     *
     * @throws OpenDataException if {@code defaultValue} is not a
     * valid value for the specified {@code openType}, or {@code
     * defaultValue} is non null and {@code openType} is an {@code
     * ArrayType} or a {@code TabularType}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public OpenMBeanAttributeInfoSupport(String name,
                                         String description,
                                         OpenType<?> openType,
                                         boolean isReadable,
                                         boolean isWritable,
                                         boolean isIs,
                                         Descriptor descriptor) {

    /**
     * <p>Constructs an {@code OpenMBeanAttributeInfoSupport} instance,
     * which describes the attribute of an open MBean with the
     * specified {@code name}, {@code openType}, {@code
     * description}, read/write access properties, and {@code Descriptor}.</p>
     *
     * <p>The {@code descriptor} can contain entries that will define
     * the values returned by certain methods of this class, as
     * explained in the <a href="package-summary.html#constraints">
     * package description</a>.
     *
     * @param name  cannot be a null or empty string.
     *
     * @param description  cannot be a null or empty string.
     *
     * @param openType  cannot be null.
     *
     * @param isReadable {@code true} if the attribute has a getter
     * exposed for management.
     *
     * @param isWritable {@code true} if the attribute has a setter
     * exposed for management.
     *
     * @param isIs {@code true} if the attribute's getter is of the
     * form <tt>is<i>XXX</i></tt>.
     *
     * @param descriptor The descriptor for the attribute.  This may be null
     * which is equivalent to an empty descriptor.
     *
     * @throws IllegalArgumentException if {@code name} or {@code
     * description} are null or empty string, or {@code openType} is
     * null, or the descriptor entries are invalid as described in the
     * <a href="package-summary.html#constraints">package description</a>.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    public OpenMBeanAttributeInfoSupport(String name,
                                         String description,
                                         OpenType<?> openType,
                                         boolean isReadable,
                                         boolean isWritable,
                                         boolean isIs) {

    /**
     * Constructs an {@code OpenMBeanAttributeInfoSupport} instance,
     * which describes the attribute of an open MBean with the
     * specified {@code name}, {@code openType} and {@code
     * description}, and the specified read/write access properties.
     *
     * @param name  cannot be a null or empty string.
     *
     * @param description  cannot be a null or empty string.
     *
     * @param openType  cannot be null.
     *
     * @param isReadable {@code true} if the attribute has a getter
     * exposed for management.
     *
     * @param isWritable {@code true} if the attribute has a setter
     * exposed for management.
     *
     * @param isIs {@code true} if the attribute's getter is of the
     * form <tt>is<i>XXX</i></tt>.
     *
     * @throws IllegalArgumentException if {@code name} or {@code
     * description} are null or empty string, or {@code openType} is
     * null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    private final Comparable<?> maxValue;

    /**
     * @serial The open mbean attribute's max value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    private final Comparable<?> minValue;

    /**
     * @serial The open mbean attribute's min value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    private final Set<?> legalValues;  // to be constructed unmodifiable

    /**
     * @serial The open mbean attribute's legal values. This {@link
     * Set} is unmodifiable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    private final Object defaultValue;

    /**
     * @serial The open mbean attribute's default value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
    private OpenType<?> openType;

    /**
     * @serial The open mbean attribute's <i>open type</i>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanAttributeInfoSupport.java
public class OpenMBeanAttributeInfoSupport

/**
 * Describes an attribute of an open MBean.
 *
 *
 * @since 1.5
 */