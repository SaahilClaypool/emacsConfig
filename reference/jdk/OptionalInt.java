_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    @Override

    /**
     * {@inheritDoc}
     *
     * Returns a non-empty string representation of this object suitable for
     * debugging. The exact presentation format is unspecified and may vary
     * between implementations and versions.
     *
     * @implSpec If a value is present the result must include its string
     * representation in the result. Empty and present instances must be
     * unambiguously differentiable.
     *
     * @return the string representation of this instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    @Override

    /**
     * Returns the hash code value of the present value, if any, or 0 (zero) if
     * no value is present.
     *
     * @return hash code value of the present value or 0 if no value is present
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    @Override

    /**
     * Indicates whether some other object is "equal to" this OptionalInt. The
     * other object is considered equal if:
     * <ul>
     * <li>it is also an {@code OptionalInt} and;
     * <li>both instances have no value present or;
     * <li>the present values are "equal to" each other via {@code ==}.
     * </ul>
     *
     * @param obj an object to be tested for equality
     * @return {code true} if the other object is "equal to" this object
     * otherwise {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public<X extends Throwable> int orElseThrow(Supplier<X> exceptionSupplier) throws X {

    /**
     * Return the contained value, if present, otherwise throw an exception
     * to be created by the provided supplier.
     *
     * @apiNote A method reference to the exception constructor with an empty
     * argument list can be used as the supplier. For example,
     * {@code IllegalStateException::new}
     *
     * @param <X> Type of the exception to be thrown
     * @param exceptionSupplier The supplier which will return the exception to
     * be thrown
     * @return the present value
     * @throws X if there is no value present
     * @throws NullPointerException if no value is present and
     * {@code exceptionSupplier} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public int orElseGet(IntSupplier other) {

    /**
     * Return the value if present, otherwise invoke {@code other} and return
     * the result of that invocation.
     *
     * @param other a {@code IntSupplier} whose result is returned if no value
     * is present
     * @return the value if present otherwise the result of {@code other.getAsInt()}
     * @throws NullPointerException if value is not present and {@code other} is
     * null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public int orElse(int other) {

    /**
     * Return the value if present, otherwise return {@code other}.
     *
     * @param other the value to be returned if there is no value present
     * @return the value, if present, otherwise {@code other}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public void ifPresent(IntConsumer consumer) {

    /**
     * Have the specified consumer accept the value if a value is present,
     * otherwise do nothing.
     *
     * @param consumer block to be executed if a value is present
     * @throws NullPointerException if value is present and {@code consumer} is
     * null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public boolean isPresent() {

    /**
     * Return {@code true} if there is a value present, otherwise {@code false}.
     *
     * @return {@code true} if there is a value present, otherwise {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public int getAsInt() {

    /**
     * If a value is present in this {@code OptionalInt}, returns the value,
     * otherwise throws {@code NoSuchElementException}.
     *
     * @return the value held by this {@code OptionalInt}
     * @throws NoSuchElementException if there is no value present
     *
     * @see OptionalInt#isPresent()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public static OptionalInt of(int value) {

    /**
     * Return an {@code OptionalInt} with the specified value present.
     *
     * @param value the value to be present
     * @return an {@code OptionalInt} with the value present
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    private OptionalInt(int value) {

    /**
     * Construct an instance with the value present.
     *
     * @param value the int value to be present
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    public static OptionalInt empty() {

    /**
     * Returns an empty {@code OptionalInt} instance.  No value is present for this
     * OptionalInt.
     *
     * @apiNote Though it may be tempting to do so, avoid testing if an object
     * is empty by comparing with {@code ==} against instances returned by
     * {@code Option.empty()}. There is no guarantee that it is a singleton.
     * Instead, use {@link #isPresent()}.
     *
     *  @return an empty {@code OptionalInt}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    private OptionalInt() {

    /**
     * Construct an empty instance.
     *
     * @implNote Generally only one empty instance, {@link OptionalInt#EMPTY},
     * should exist per VM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
    private final boolean isPresent;

    /**
     * If true then the value is present, otherwise indicates no value is present
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/OptionalInt.java
public final class OptionalInt {

/**
 * A container object which may or may not contain a {@code int} value.
 * If a value is present, {@code isPresent()} will return {@code true} and
 * {@code getAsInt()} will return the value.
 *
 * <p>Additional methods that depend on the presence or absence of a contained
 * value are provided, such as {@link #orElse(int) orElse()}
 * (return a default value if value not present) and
 * {@link #ifPresent(java.util.function.IntConsumer) ifPresent()} (execute a block
 * of code if the value is present).
 *
 * <p>This is a <a href="../lang/doc-files/ValueBased.html">value-based</a>
 * class; use of identity-sensitive operations (including reference equality
 * ({@code ==}), identity hash code, or synchronization) on instances of
 * {@code OptionalInt} may have unpredictable results and should be avoided.
 *
 * @since 1.8
 */
