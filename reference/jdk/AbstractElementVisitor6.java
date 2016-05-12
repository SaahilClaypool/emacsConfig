_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/AbstractElementVisitor6.java
    public R visitUnknown(Element e, P p) {

    /**
     * {@inheritDoc}
     *
     * <p> The default implementation of this method in
     * {@code AbstractElementVisitor6} will always throw
     * {@code UnknownElementException}.
     * This behavior is not required of a subclass.
     *
     * @param e  the element to visit
     * @param p  a visitor-specified parameter
     * @return a visitor-specified result
     * @throws UnknownElementException
     *          a visitor implementation may optionally throw this exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/AbstractElementVisitor6.java
    public final R visit(Element e) {

    /**
     * Visits any program element as if by passing itself to that
     * element's {@link Element#accept accept} method and passing
     * {@code null} for the additional parameter.  The invocation
     * {@code v.visit(elem)} is equivalent to {@code elem.accept(v,
     * null)}.
     *
     * @param e  the element to visit
     * @return a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/AbstractElementVisitor6.java
    public final R visit(Element e, P p) {

    /**
     * Visits any program element as if by passing itself to that
     * element's {@link Element#accept accept} method.  The invocation
     * {@code v.visit(elem)} is equivalent to {@code elem.accept(v,
     * p)}.
     *
     * @param e  the element to visit
     * @param p  a visitor-specified parameter
     * @return a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/AbstractElementVisitor6.java
    protected AbstractElementVisitor6(){}

    /**
     * Constructor for concrete subclasses to call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/util/AbstractElementVisitor6.java
@SupportedSourceVersion(RELEASE_6)

/**
 * A skeletal visitor of program elements with default behavior
 * appropriate for the {@link SourceVersion#RELEASE_6 RELEASE_6}
 * source version.
 *
 * <p> <b>WARNING:</b> The {@code ElementVisitor} interface
 * implemented by this class may have methods added to it in the
 * future to accommodate new, currently unknown, language structures
 * added to future versions of the Java&trade; programming language.
 * Therefore, methods whose names begin with {@code "visit"} may be
 * added to this class in the future; to avoid incompatibilities,
 * classes which extend this class should not declare any instance
 * methods with names beginning with {@code "visit"}.
 *
 * <p>When such a new visit method is added, the default
 * implementation in this class will be to call the {@link
 * #visitUnknown visitUnknown} method.  A new abstract element visitor
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
 * @see AbstractElementVisitor7
 * @see AbstractElementVisitor8
 * @since 1.6
 */
