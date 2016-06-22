_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
    public void checkReconstructible() throws InvalidObjectException {}

    /**
     * <p>Throw an appropriate InvalidObjectException if we will not
     * be able to convert back from the open data to the original Java
     * object.  The {@link #fromOpenValue fromOpenValue} throws an
     * exception if a given open data value cannot be converted.  This
     * method throws an exception if <em>no</em> open data values can
     * be converted.  The default implementation of this method never
     * throws an exception.  Subclasses can override it as
     * appropriate.</p>
     * @throws InvalidObjectException if {@code fromOpenValue} will throw
     * an exception no matter what its argument is.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
    public abstract Object toOpenValue(Object javaValue)

    /**
     * <p>Convert an instance of the Java type into the Open Type.
     * @param javaValue the value to be converted.
     * @return the converted value.
     * @throws OpenDataException if the value cannot be converted.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
    public abstract Object fromOpenValue(Object openValue)

    /**
     * <p>Convert an instance of the Open Type into the Java type.
     * @param openValue the value to be converted.
     * @return the converted value.
     * @throws InvalidObjectException if the value cannot be converted.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
    public final Class<?> getOpenClass() {

    /**
     * <p>The Java class that corresponds to instances of the
     * {@linkplain #getOpenType() Open Type} for this mapping.</p>
     * @return the Java class that corresponds to instances of the
     * Open Type for this mapping.
     * @see OpenType#getClassName
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
    public final OpenType<?> getOpenType() {

    /**
     * <p>The Open Type that was supplied to the constructor.</p>
     * @return the Open Type that was supplied to the constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
    public final Type getJavaType() {

    /**
     * <p>The Java type that was supplied to the constructor.</p>
     * @return the Java type that was supplied to the constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
    protected MXBeanMapping(Type javaType, OpenType<?> openType) {

    /**
     * <p>Construct a mapping between the given Java type and the given
     * Open Type.</p>
     *
     * @param javaType the Java type (for example, {@code MyLinkedList}).
     * @param openType the Open Type (for example, {@code
     * ArrayType.getArrayType(SimpleType.STRING)})
     *
     * @throws NullPointerException if either argument is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MXBeanMapping.java
public abstract class MXBeanMapping {

/**
 * <p>A custom mapping between Java types and Open types for use in MXBeans.
 * To define such a mapping, subclass this class and define at least the
 * {@link #fromOpenValue fromOpenValue} and {@link #toOpenValue toOpenValue}
 * methods, and optionally the {@link #checkReconstructible} method.
 * Then either use an {@link MXBeanMappingClass} annotation on your custom
 * Java types, or include this MXBeanMapping in an
 * {@link MXBeanMappingFactory}.</p>
 *
 * <p>For example, suppose we have a class {@code MyLinkedList}, which looks
 * like this:</p>
 *
 * <pre>
 * public class MyLinkedList {
 *     public MyLinkedList(String name, MyLinkedList next) {...}
 *     public String getName() {...}
 *     public MyLinkedList getNext() {...}
 * }
 * </pre>
 *
 * <p>This is not a valid type for MXBeans, because it contains a
 * self-referential property "next" defined by the {@code getNext()}
 * method.  MXBeans do not support recursive types.  So we would like
 * to specify a mapping for {@code MyLinkedList} explicitly. When an
 * MXBean interface contains {@code MyLinkedList}, that will be mapped
 * into a {@code String[]}, which is a valid Open Type.</p>
 *
 * <p>To define this mapping, we first subclass {@code MXBeanMapping}:</p>
 *
 * <pre>
 * public class MyLinkedListMapping extends MXBeanMapping {
 *     public MyLinkedListMapping(Type type) throws OpenDataException {
 *         super(MyLinkedList.class, ArrayType.getArrayType(SimpleType.STRING));
 *         if (type != MyLinkedList.class)
 *             throw new OpenDataException("Mapping only valid for MyLinkedList");
 *     }
 *
 *     {@literal @Override}
 *     public Object fromOpenValue(Object openValue) throws InvalidObjectException {
 *         String[] array = (String[]) openValue;
 *         MyLinkedList list = null;
 *         for (int i = array.length - 1; i &gt;= 0; i--)
 *             list = new MyLinkedList(array[i], list);
 *         return list;
 *     }
 *
 *     {@literal @Override}
 *     public Object toOpenValue(Object javaValue) throws OpenDataException {
 *         ArrayList&lt;String&gt; array = new ArrayList&lt;String&gt;();
 *         for (MyLinkedList list = (MyLinkedList) javaValue; list != null;
 *              list = list.getNext())
 *             array.add(list.getName());
 *         return array.toArray(new String[0]);
 *     }
 * }
 * </pre>
 *
 * <p>The call to the superclass constructor specifies what the
 * original Java type is ({@code MyLinkedList.class}) and what Open
 * Type it is mapped to ({@code
 * ArrayType.getArrayType(SimpleType.STRING)}). The {@code
 * fromOpenValue} method says how we go from the Open Type ({@code
 * String[]}) to the Java type ({@code MyLinkedList}), and the {@code
 * toOpenValue} method says how we go from the Java type to the Open
 * Type.</p>
 *
 * <p>With this mapping defined, we can annotate the {@code MyLinkedList}
 * class appropriately:</p>
 *
 * <pre>
 * {@literal @MXBeanMappingClass}(MyLinkedListMapping.class)
 * public class MyLinkedList {...}
 * </pre>
 *
 * <p>Now we can use {@code MyLinkedList} in an MXBean interface and it
 * will work.</p>
 *
 * <p>If we are unable to modify the {@code MyLinkedList} class,
 * we can define an {@link MXBeanMappingFactory}.  See the documentation
 * of that class for further details.</p>
 *
 * @see <a href="../MXBean.html#custom">MXBean specification, section
 * "Custom MXBean type mappings"</a>
 */