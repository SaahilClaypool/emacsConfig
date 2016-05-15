_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/LongUnaryOperator.java
    static LongUnaryOperator identity() {

    /**
     * Returns a unary operator that always returns its input argument.
     *
     * @return a unary operator that always returns its input argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/LongUnaryOperator.java
    default LongUnaryOperator andThen(LongUnaryOperator after) {

    /**
     * Returns a composed operator that first applies this operator to
     * its input, and then applies the {@code after} operator to the result.
     * If evaluation of either operator throws an exception, it is relayed to
     * the caller of the composed operator.
     *
     * @param after the operator to apply after this operator is applied
     * @return a composed operator that first applies this operator and then
     * applies the {@code after} operator
     * @throws NullPointerException if after is null
     *
     * @see #compose(LongUnaryOperator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/LongUnaryOperator.java
    default LongUnaryOperator compose(LongUnaryOperator before) {

    /**
     * Returns a composed operator that first applies the {@code before}
     * operator to its input, and then applies this operator to the result.
     * If evaluation of either operator throws an exception, it is relayed to
     * the caller of the composed operator.
     *
     * @param before the operator to apply before this operator is applied
     * @return a composed operator that first applies the {@code before}
     * operator and then applies this operator
     * @throws NullPointerException if before is null
     *
     * @see #andThen(LongUnaryOperator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/LongUnaryOperator.java
    long applyAsLong(long operand);

    /**
     * Applies this operator to the given operand.
     *
     * @param operand the operand
     * @return the operator result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/LongUnaryOperator.java
@FunctionalInterface

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code long}-valued result.  This is the primitive type specialization of
 * {@link UnaryOperator} for {@code long}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #applyAsLong(long)}.
 *
 * @see UnaryOperator
 * @since 1.8
 */