_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes an {@link MBeanFeatureInfo} from an {@link ObjectInputStream}.
     * @serialData
     * For compatibility reasons, an object of this class is deserialized as follows.
     * <p>
     * The method {@link ObjectInputStream#defaultReadObject defaultReadObject()}
     * is called first to deserialize the object except the field
     * {@code descriptor}, which is not serialized in the default way. Then the method
     * {@link ObjectInputStream#read read()} is called to read a byte, the field
     * {@code descriptor} is deserialized according to the value of the byte value:
     *    <ul>
     *    <li>1. The method {@link ObjectInputStream#readObject readObject()}
     *       is called twice to obtain the field names (a {@code String[]}) and
     *       the field values (a {@code Object[]}) of the {@code descriptor}.
     *       The two obtained values then are used to construct
     *       an {@link ImmutableDescriptor} instance for the field
     *       {@code descriptor};</li>
     *    <li>0. The value for the field {@code descriptor} is obtained directly
     *       by calling the method {@link ObjectInputStream#readObject readObject()}.
     *       If the obtained value is null, the field {@code descriptor} is set to
     *       {@link ImmutableDescriptor#EMPTY_DESCRIPTOR EMPTY_DESCRIPTOR};</li>
     *    <li>-1. This means that there is no byte to read and that the object is from
     *       an earlier version of the JMX API. The field {@code descriptor} is set
     *       to {@link ImmutableDescriptor#EMPTY_DESCRIPTOR EMPTY_DESCRIPTOR}</li>
     *    <li>Any other value. A {@link StreamCorruptedException} is thrown.</li>
     *    </ul>
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * Serializes an {@link MBeanFeatureInfo} to an {@link ObjectOutputStream}.
     * @serialData
     * For compatibility reasons, an object of this class is serialized as follows.
     * <p>
     * The method {@link ObjectOutputStream#defaultWriteObject defaultWriteObject()}
     * is called first to serialize the object except the field {@code descriptor}
     * which is declared as transient. The field {@code descriptor} is serialized
     * as follows:
     *     <ul>
     *     <li>If {@code descriptor} is an instance of the class
     *        {@link ImmutableDescriptor}, the method {@link ObjectOutputStream#write
     *        write(int val)} is called to write a byte with the value {@code 1},
     *        then the method {@link ObjectOutputStream#writeObject writeObject(Object obj)}
     *        is called twice to serialize the field names and the field values of the
     *        {@code descriptor}, respectively as a {@code String[]} and an
     *        {@code Object[]};</li>
     *     <li>Otherwise, the method {@link ObjectOutputStream#write write(int val)}
     * is called to write a byte with the value {@code 0}, then the method
     * {@link ObjectOutputStream#writeObject writeObject(Object obj)} is called
     * to serialize directly the field {@code descriptor}.
     *     </ul>
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    public boolean equals(Object o) {

    /**
     * Compare this MBeanFeatureInfo to another.
     *
     * @param o the object to compare to.
     *
     * @return true if and only if <code>o</code> is an MBeanFeatureInfo such
     * that its {@link #getName()}, {@link #getDescription()}, and
     * {@link #getDescriptor()}
     * values are equal (not necessarily identical) to those of this
     * MBeanFeatureInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    public Descriptor getDescriptor() {

    /**
     * Returns the descriptor for the feature.  Changing the returned value
     * will have no affect on the original descriptor.
     *
     * @return a descriptor that is either immutable or a copy of the original.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    public String getDescription() {

    /**
     * Returns the human-readable description of the feature.
     *
     * @return the human-readable description of the feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    public String getName() {

    /**
     * Returns the name of the feature.
     *
     * @return the name of the feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    public MBeanFeatureInfo(String name, String description,
                            Descriptor descriptor) {

    /**
     * Constructs an <CODE>MBeanFeatureInfo</CODE> object.
     *
     * @param name The name of the feature.
     * @param description A human readable description of the feature.
     * @param descriptor The descriptor for the feature.  This may be null
     * which is equivalent to an empty descriptor.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    public MBeanFeatureInfo(String name, String description) {

    /**
     * Constructs an <CODE>MBeanFeatureInfo</CODE> object.  This
     * constructor is equivalent to {@code MBeanFeatureInfo(name,
     * description, (Descriptor) null}.
     *
     * @param name The name of the feature.
     * @param description A human readable description of the feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    private transient Descriptor descriptor;

    /**
     * @serial The Descriptor for this MBeanFeatureInfo.  This field
     * can be null, which is equivalent to an empty Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    protected String description;

    /**
     * The human-readable description of the feature.  It is
     * recommended that subclasses call {@link #getDescription} rather
     * than reading this field, and that they not change it.
     *
     * @serial The human-readable description of the feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
    protected String name;

    /**
     * The name of the feature.  It is recommended that subclasses call
     * {@link #getName} rather than reading this field, and that they
     * not change it.
     *
     * @serial The name of the feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanFeatureInfo.java
public class MBeanFeatureInfo implements Serializable, DescriptorRead {

/**
 * <p>Provides general information for an MBean descriptor object.
 * The feature described can be an attribute, an operation, a
 * parameter, or a notification.  Instances of this class are
 * immutable.  Subclasses may be mutable but this is not
 * recommended.</p>
 *
 * @since 1.5
 */
