_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
        private final Enum<?>[] elements;

        /**
         * The elements contained in this enum set.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
        private final Class<E> elementType;

        /**
         * The element type of this enum set.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    private static class SerializationProxy <E extends Enum<E>>

    /**
     * This class is used to serialize all EnumSet instances, regardless of
     * implementation type.  It captures their "logical contents" and they
     * are reconstructed using public static factories.  This is necessary
     * to ensure that the existence of a particular implementation type is
     * an implementation detail.
     *
     * @serial include
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    private static <E extends Enum<E>> E[] getUniverse(Class<E> elementType) {

    /**
     * Returns all of the values comprising E.
     * The result is uncloned, cached, and shared by all callers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    final void typeCheck(E e) {

    /**
     * Throws an exception if e is not of the correct type for this enum set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    abstract void complement();

    /**
     * Complements the contents of this enum set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a copy of this set.
     *
     * @return a copy of this set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    abstract void addRange(E from, E to);

    /**
     * Adds the specified range to this enum set, which is empty prior
     * to the call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> range(E from, E to) {

    /**
     * Creates an enum set initially containing all of the elements in the
     * range defined by the two specified endpoints.  The returned set will
     * contain the endpoints themselves, which may be identical but must not
     * be out of order.
     *
     * @param <E> The class of the parameter elements and of the set
     * @param from the first element in the range
     * @param to the last element in the range
     * @throws NullPointerException if {@code from} or {@code to} are null
     * @throws IllegalArgumentException if {@code from.compareTo(to) > 0}
     * @return an enum set initially containing all of the elements in the
     *         range defined by the two specified endpoints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    @SafeVarargs

    /**
     * Creates an enum set initially containing the specified elements.
     * This factory, whose parameter list uses the varargs feature, may
     * be used to create an enum set initially containing an arbitrary
     * number of elements, but it is likely to run slower than the overloadings
     * that do not use varargs.
     *
     * @param <E> The class of the parameter elements and of the set
     * @param first an element that the set is to contain initially
     * @param rest the remaining elements the set is to contain initially
     * @throws NullPointerException if any of the specified elements are null,
     *     or if <tt>rest</tt> is null
     * @return an enum set initially containing the specified elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4,
                                                    E e5)

    /**
     * Creates an enum set initially containing the specified elements.
     *
     * Overloadings of this method exist to initialize an enum set with
     * one through five elements.  A sixth overloading is provided that
     * uses the varargs feature.  This overloading may be used to create
     * an enum set initially containing an arbitrary number of elements, but
     * is likely to run slower than the overloadings that do not use varargs.
     *
     * @param <E> The class of the parameter elements and of the set
     * @param e1 an element that this set is to contain initially
     * @param e2 another element that this set is to contain initially
     * @param e3 another element that this set is to contain initially
     * @param e4 another element that this set is to contain initially
     * @param e5 another element that this set is to contain initially
     * @throws NullPointerException if any parameters are null
     * @return an enum set initially containing the specified elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4) {

    /**
     * Creates an enum set initially containing the specified elements.
     *
     * Overloadings of this method exist to initialize an enum set with
     * one through five elements.  A sixth overloading is provided that
     * uses the varargs feature.  This overloading may be used to create
     * an enum set initially containing an arbitrary number of elements, but
     * is likely to run slower than the overloadings that do not use varargs.
     *
     * @param <E> The class of the parameter elements and of the set
     * @param e1 an element that this set is to contain initially
     * @param e2 another element that this set is to contain initially
     * @param e3 another element that this set is to contain initially
     * @param e4 another element that this set is to contain initially
     * @throws NullPointerException if any parameters are null
     * @return an enum set initially containing the specified elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3) {

    /**
     * Creates an enum set initially containing the specified elements.
     *
     * Overloadings of this method exist to initialize an enum set with
     * one through five elements.  A sixth overloading is provided that
     * uses the varargs feature.  This overloading may be used to create
     * an enum set initially containing an arbitrary number of elements, but
     * is likely to run slower than the overloadings that do not use varargs.
     *
     * @param <E> The class of the parameter elements and of the set
     * @param e1 an element that this set is to contain initially
     * @param e2 another element that this set is to contain initially
     * @param e3 another element that this set is to contain initially
     * @throws NullPointerException if any parameters are null
     * @return an enum set initially containing the specified elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2) {

    /**
     * Creates an enum set initially containing the specified elements.
     *
     * Overloadings of this method exist to initialize an enum set with
     * one through five elements.  A sixth overloading is provided that
     * uses the varargs feature.  This overloading may be used to create
     * an enum set initially containing an arbitrary number of elements, but
     * is likely to run slower than the overloadings that do not use varargs.
     *
     * @param <E> The class of the parameter elements and of the set
     * @param e1 an element that this set is to contain initially
     * @param e2 another element that this set is to contain initially
     * @throws NullPointerException if any parameters are null
     * @return an enum set initially containing the specified elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> of(E e) {

    /**
     * Creates an enum set initially containing the specified element.
     *
     * Overloadings of this method exist to initialize an enum set with
     * one through five elements.  A sixth overloading is provided that
     * uses the varargs feature.  This overloading may be used to create
     * an enum set initially containing an arbitrary number of elements, but
     * is likely to run slower than the overloadings that do not use varargs.
     *
     * @param <E> The class of the specified element and of the set
     * @param e the element that this set is to contain initially
     * @throws NullPointerException if <tt>e</tt> is null
     * @return an enum set initially containing the specified element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> complementOf(EnumSet<E> s) {

    /**
     * Creates an enum set with the same element type as the specified enum
     * set, initially containing all the elements of this type that are
     * <i>not</i> contained in the specified set.
     *
     * @param <E> The class of the elements in the enum set
     * @param s the enum set from whose complement to initialize this enum set
     * @return The complement of the specified set in this set
     * @throws NullPointerException if <tt>s</tt> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c) {

    /**
     * Creates an enum set initialized from the specified collection.  If
     * the specified collection is an <tt>EnumSet</tt> instance, this static
     * factory method behaves identically to {@link #copyOf(EnumSet)}.
     * Otherwise, the specified collection must contain at least one element
     * (in order to determine the new enum set's element type).
     *
     * @param <E> The class of the elements in the collection
     * @param c the collection from which to initialize this enum set
     * @return An enum set initialized from the given collection.
     * @throws IllegalArgumentException if <tt>c</tt> is not an
     *     <tt>EnumSet</tt> instance and contains no elements
     * @throws NullPointerException if <tt>c</tt> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> copyOf(EnumSet<E> s) {

    /**
     * Creates an enum set with the same element type as the specified enum
     * set, initially containing the same elements (if any).
     *
     * @param <E> The class of the elements in the set
     * @param s the enum set from which to initialize this enum set
     * @return A copy of the specified enum set.
     * @throws NullPointerException if <tt>s</tt> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    abstract void addAll();

    /**
     * Adds all of the elements from the appropriate enum type to this enum
     * set, which is empty prior to the call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType) {

    /**
     * Creates an enum set containing all of the elements in the specified
     * element type.
     *
     * @param <E> The class of the elements in the set
     * @param elementType the class object of the element type for this enum
     *     set
     * @return An enum set containing all the elements in the specified type.
     * @throws NullPointerException if <tt>elementType</tt> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType) {

    /**
     * Creates an empty enum set with the specified element type.
     *
     * @param <E> The class of the elements in the set
     * @param elementType the class object of the element type for this enum
     *     set
     * @return An empty enum set of the specified type.
     * @throws NullPointerException if <tt>elementType</tt> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    final Enum<?>[] universe;

    /**
     * All of the values comprising T.  (Cached for performance.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
    final Class<E> elementType;

    /**
     * The class of all the elements of this set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/EnumSet.java
public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E>

/**
 * A specialized {@link Set} implementation for use with enum types.  All of
 * the elements in an enum set must come from a single enum type that is
 * specified, explicitly or implicitly, when the set is created.  Enum sets
 * are represented internally as bit vectors.  This representation is
 * extremely compact and efficient. The space and time performance of this
 * class should be good enough to allow its use as a high-quality, typesafe
 * alternative to traditional <tt>int</tt>-based "bit flags."  Even bulk
 * operations (such as <tt>containsAll</tt> and <tt>retainAll</tt>) should
 * run very quickly if their argument is also an enum set.
 *
 * <p>The iterator returned by the <tt>iterator</tt> method traverses the
 * elements in their <i>natural order</i> (the order in which the enum
 * constants are declared).  The returned iterator is <i>weakly
 * consistent</i>: it will never throw {@link ConcurrentModificationException}
 * and it may or may not show the effects of any modifications to the set that
 * occur while the iteration is in progress.
 *
 * <p>Null elements are not permitted.  Attempts to insert a null element
 * will throw {@link NullPointerException}.  Attempts to test for the
 * presence of a null element or to remove one will, however, function
 * properly.
 *
 * <P>Like most collection implementations, <tt>EnumSet</tt> is not
 * synchronized.  If multiple threads access an enum set concurrently, and at
 * least one of the threads modifies the set, it should be synchronized
 * externally.  This is typically accomplished by synchronizing on some
 * object that naturally encapsulates the enum set.  If no such object exists,
 * the set should be "wrapped" using the {@link Collections#synchronizedSet}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access:
 *
 * <pre>
 * Set&lt;MyEnum&gt; s = Collections.synchronizedSet(EnumSet.noneOf(MyEnum.class));
 * </pre>
 *
 * <p>Implementation note: All basic operations execute in constant time.
 * They are likely (though not guaranteed) to be much faster than their
 * {@link HashSet} counterparts.  Even bulk operations execute in
 * constant time if their argument is also an enum set.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @author Josh Bloch
 * @since 1.5
 * @see EnumMap
 * @serial exclude
 */
