_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitNoType(NoType t, P p){

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitExecutable(ExecutableType t, P p) {

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitWildcard(WildcardType t, P p){

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitTypeVariable(TypeVariable t, P p){

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitError(ErrorType t, P p){

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitDeclared(DeclaredType t, P p){

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitArray(ArrayType t, P p){

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitNull(NullType t, P p){

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    public R visitPrimitive(PrimitiveType t, P p) {

    /**
     * {@inheritDoc} This implementation calls {@code defaultAction}.
     *
     * @param t {@inheritDoc}
     * @param p {@inheritDoc}
     * @return  the result of {@code defaultAction}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    protected R defaultAction(TypeMirror e, P p) {

    /**
     * The default action for visit methods.  The implementation in
     * this class just returns {@link #DEFAULT_VALUE}; subclasses will
     * commonly override this method.
     *
     * @param e the type to process
     * @param p a visitor-specified parameter
     * @return {@code DEFAULT_VALUE} unless overridden
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    protected SimpleTypeVisitor6(R defaultValue){

    /**
     * Constructor for concrete subclasses; uses the argument for the
     * default value.
     *
     * @param defaultValue the value to assign to {@link #DEFAULT_VALUE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    protected SimpleTypeVisitor6(){

    /**
     * Constructor for concrete subclasses; uses {@code null} for the
     * default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
    protected final R DEFAULT_VALUE;

    /**
     * Default value to be returned; {@link #defaultAction
     * defaultAction} returns this value unless the method is
     * overridden.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/SimpleTypeVisitor6.java
@SupportedSourceVersion(RELEASE_6)

/**
 * A simple visitor of types with default behavior appropriate for the
 * {@link SourceVersion#RELEASE_6 RELEASE_6} source version.
 *
 * Visit methods corresponding to {@code RELEASE_6} language
 * constructs call {@link #defaultAction defaultAction}, passing their
 * arguments to {@code defaultAction}'s corresponding parameters.
 *
 * For constructs introduced in {@code RELEASE_7} and later, {@code
 * visitUnknown} is called instead.
 *
 * <p> Methods in this class may be overridden subject to their
 * general contract.  Note that annotating methods in concrete
 * subclasses with {@link java.lang.Override @Override} will help
 * ensure that methods are overridden as intended.
 *
 * <p> <b>WARNING:</b> The {@code TypeVisitor} interface implemented
 * by this class may have methods added to it in the future to
 * accommodate new, currently unknown, language structures added to
 * future versions of the Java&trade; programming language.
 * Therefore, methods whose names begin with {@code "visit"} may be
 * added to this class in the future; to avoid incompatibilities,
 * classes which extend this class should not declare any instance
 * methods with names beginning with {@code "visit"}.
 *
 * <p>When such a new visit method is added, the default
 * implementation in this class will be to call the {@link
 * #visitUnknown visitUnknown} method.  A new simple type visitor
 * class will also be introduced to correspond to the new language
 * level; this visitor will have different default behavior for the
 * visit method in question.  When the new visitor is introduced, all
 * or portions of this visitor may be deprecated.
 *
 * <p>Note that adding a default implementation of a new visit method
 * in a visitor class will occur instead of adding a <em>default
 * method</em> directly in the visitor interface since a Java SE 8
 * language feature cannot be used to this version of the API since
 * this version is required to be runnable on Java SE 7
 * implementations.  Future versions of the API that are only required
 * to run on Java SE 8 and later may take advantage of default methods
 * in this situation.
 *
 * @param <R> the return type of this visitor's methods.  Use {@link
 *            Void} for visitors that do not need to return results.
 * @param <P> the type of the additional parameter to this visitor's
 *            methods.  Use {@code Void} for visitors that do not need an
 *            additional parameter.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 *
 * @see SimpleTypeVisitor7
 * @see SimpleTypeVisitor8
 * @since 1.6
 */
