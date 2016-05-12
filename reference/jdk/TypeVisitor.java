_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitIntersection(IntersectionType t, P p);

    /**
     * Visits an intersection type.
     *
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitUnion(UnionType t, P p);

    /**
     * Visits a union type.
     *
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitUnknown(TypeMirror t, P p);

    /**
     * Visits an unknown kind of type.
     * This can occur if the language evolves and new kinds
     * of types are added to the {@code TypeMirror} hierarchy.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     * @throws UnknownTypeException
     *  a visitor implementation may optionally throw this exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitNoType(NoType t, P p);

    /**
     * Visits a {@link NoType} instance.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitExecutable(ExecutableType t, P p);

    /**
     * Visits an executable type.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitWildcard(WildcardType t, P p);

    /**
     * Visits a wildcard type.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitTypeVariable(TypeVariable t, P p);

    /**
     * Visits a type variable.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitError(ErrorType t, P p);

    /**
     * Visits an error type.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitDeclared(DeclaredType t, P p);

    /**
     * Visits a declared type.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitArray(ArrayType t, P p);

    /**
     * Visits an array type.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitNull(NullType t, P p);

    /**
     * Visits the null type.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visitPrimitive(PrimitiveType t, P p);

    /**
     * Visits a primitive type.
     * @param t the type to visit
     * @param p a visitor-specified parameter
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
    R visit(TypeMirror t);

    /**
     * A convenience method equivalent to {@code v.visit(t, null)}.
     * @param t the element to visit
     * @return  a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeVisitor.java
public interface TypeVisitor<R, P> {

/**
 * A visitor of types, in the style of the
 * visitor design pattern.  Classes implementing this
 * interface are used to operate on a type when the kind of
 * type is unknown at compile time.  When a visitor is passed to a
 * type's {@link TypeMirror#accept accept} method, the <tt>visit<i>XYZ</i></tt>
 * method most applicable to that type is invoked.
 *
 * <p> Classes implementing this interface may or may not throw a
 * {@code NullPointerException} if the additional parameter {@code p}
 * is {@code null}; see documentation of the implementing class for
 * details.
 *
 * <p> <b>WARNING:</b> It is possible that methods will be added to
 * this interface to accommodate new, currently unknown, language
 * structures added to future versions of the Java&trade; programming
 * language.  Therefore, visitor classes directly implementing this
 * interface may be source incompatible with future versions of the
 * platform.  To avoid this source incompatibility, visitor
 * implementations are encouraged to instead extend the appropriate
 * abstract visitor class that implements this interface.  However, an
 * API should generally use this visitor interface as the type for
 * parameters, return type, etc. rather than one of the abstract
 * classes.
 *
 * <p>Note that methods to accommodate new language constructs could
 * be added in a source <em>compatible</em> way if they were added as
 * <em>default methods</em>.  However, default methods are only
 * available on Java SE 8 and higher releases and the {@code
 * javax.lang.model.*} packages bundled in Java SE 8 are required to
 * also be runnable on Java SE 7.  Therefore, default methods
 * <em>cannot</em> be used when extending {@code javax.lang.model.*}
 * to cover Java SE 8 language features.  However, default methods may
 * be used in subsequent revisions of the {@code javax.lang.model.*}
 * packages that are only required to run on Java SE 8 and higher
 * platform versions.
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
 * @since 1.6
 */
