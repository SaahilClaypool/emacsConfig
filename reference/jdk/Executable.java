_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public AnnotatedType[] getAnnotatedExceptionTypes() {

    /**
     * Returns an array of {@code AnnotatedType} objects that represent the use
     * of types to specify the declared exceptions of the method/constructor
     * represented by this Executable. The order of the objects in the array
     * corresponds to the order of the exception types in the declaration of
     * the method/constructor.
     *
     * Returns an array of length 0 if the method/constructor declares no
     * exceptions.
     *
     * @return an array of objects representing the declared
     * exceptions of the method or constructor represented by this {@code
     * Executable}
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public AnnotatedType[] getAnnotatedParameterTypes() {

    /**
     * Returns an array of {@code AnnotatedType} objects that represent the use
     * of types to specify formal parameter types of the method/constructor
     * represented by this Executable. The order of the objects in the array
     * corresponds to the order of the formal parameter types in the
     * declaration of the method/constructor.
     *
     * Returns an array of length 0 if the method/constructor declares no
     * parameters.
     *
     * @return an array of objects representing the types of the
     * formal parameters of the method or constructor represented by this
     * {@code Executable}
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public AnnotatedType getAnnotatedReceiverType() {

    /**
     * Returns an {@code AnnotatedType} object that represents the use of a
     * type to specify the receiver type of the method/constructor represented
     * by this Executable object. The receiver type of a method/constructor is
     * available only if the method/constructor has a <em>receiver
     * parameter</em> (JLS 8.4.1).
     *
     * If this {@code Executable} object represents a constructor or instance
     * method that does not have a receiver parameter, or has a receiver
     * parameter with no annotations on its type, then the return value is an
     * {@code AnnotatedType} object representing an element with no
     * annotations.
     *
     * If this {@code Executable} object represents a static method, then the
     * return value is null.
     *
     * @return an object representing the receiver type of the method or
     * constructor represented by this {@code Executable}
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract AnnotatedType getAnnotatedReturnType();

    /**
     * Returns an {@code AnnotatedType} object that represents the use of a type to
     * specify the return type of the method/constructor represented by this
     * Executable.
     *
     * If this {@code Executable} object represents a constructor, the {@code
     * AnnotatedType} object represents the type of the constructed object.
     *
     * If this {@code Executable} object represents a method, the {@code
     * AnnotatedType} object represents the use of a type to specify the return
     * type of the method.
     *
     * @return an object representing the return type of the method
     * or constructor represented by this {@code Executable}
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public Annotation[] getDeclaredAnnotations()  {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    @Override

    /**
     * {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {

    /**
     * {@inheritDoc}
     * @throws NullPointerException  {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract Annotation[][] getParameterAnnotations();

    /**
     * Returns an array of arrays of {@code Annotation}s that
     * represent the annotations on the formal parameters, in
     * declaration order, of the {@code Executable} represented by
     * this object.  Synthetic and mandated parameters (see
     * explanation below), such as the outer "this" parameter to an
     * inner class constructor will be represented in the returned
     * array.  If the executable has no parameters (meaning no formal,
     * no synthetic, and no mandated parameters), a zero-length array
     * will be returned.  If the {@code Executable} has one or more
     * parameters, a nested array of length zero is returned for each
     * parameter with no annotations. The annotation objects contained
     * in the returned arrays are serializable.  The caller of this
     * method is free to modify the returned arrays; it will have no
     * effect on the arrays returned to other callers.
     *
     * A compiler may add extra parameters that are implicitly
     * declared in source ("mandated"), as well as parameters that
     * are neither implicitly nor explicitly declared in source
     * ("synthetic") to the parameter list for a method.  See {@link
     * java.lang.reflect.Parameter} for more information.
     *
     * @see java.lang.reflect.Parameter
     * @see java.lang.reflect.Parameter#getAnnotations
     * @return an array of arrays that represent the annotations on
     *    the formal and implicit parameters, in declaration order, of
     *    the executable represented by this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public boolean isSynthetic() {

    /**
     * Returns {@code true} if this executable is a synthetic
     * construct; returns {@code false} otherwise.
     *
     * @return true if and only if this executable is a synthetic
     * construct as defined by
     * <cite>The Java&trade; Language Specification</cite>.
     * @jls 13.1 The Form of a Binary
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public boolean isVarArgs()  {

    /**
     * Returns {@code true} if this executable was declared to take a
     * variable number of arguments; returns {@code false} otherwise.
     *
     * @return {@code true} if an only if this executable was declared
     * to take a variable number of arguments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract String toGenericString();

    /**
     * Returns a string describing this {@code Executable}, including
     * any type parameters.
     * @return a string describing this {@code Executable}, including
     * any type parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public Type[] getGenericExceptionTypes() {

    /**
     * Returns an array of {@code Type} objects that represent the
     * exceptions declared to be thrown by this executable object.
     * Returns an array of length 0 if the underlying executable declares
     * no exceptions in its {@code throws} clause.
     *
     * <p>If an exception type is a type variable or a parameterized
     * type, it is created. Otherwise, it is resolved.
     *
     * @return an array of Types that represent the exception types
     *     thrown by the underlying executable
     * @throws GenericSignatureFormatError
     *     if the generic method signature does not conform to the format
     *     specified in
     *     <cite>The Java&trade; Virtual Machine Specification</cite>
     * @throws TypeNotPresentException if the underlying executable's
     *     {@code throws} clause refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if
     *     the underlying executable's {@code throws} clause refers to a
     *     parameterized type that cannot be instantiated for any reason
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract Class<?>[] getExceptionTypes();

    /**
     * Returns an array of {@code Class} objects that represent the
     * types of exceptions declared to be thrown by the underlying
     * executable represented by this object.  Returns an array of
     * length 0 if the executable declares no exceptions in its {@code
     * throws} clause.
     *
     * @return the exception types declared as being thrown by the
     * executable this object represents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public Parameter[] getParameters() {

    /**
     * Returns an array of {@code Parameter} objects that represent
     * all the parameters to the underlying executable represented by
     * this object.  Returns an array of length 0 if the executable
     * has no parameters.
     *
     * <p>The parameters of the underlying executable do not necessarily
     * have unique names, or names that are legal identifiers in the
     * Java programming language (JLS 3.8).
     *
     * @since 1.8
     * @throws MalformedParametersException if the class file contains
     * a MethodParameters attribute that is improperly formatted.
     * @return an array of {@code Parameter} objects representing all
     * the parameters to the executable this object represents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    Type[] getAllGenericParameterTypes() {

    /**
     * Behaves like {@code getGenericParameterTypes}, but returns type
     * information for all parameters, including synthetic parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public Type[] getGenericParameterTypes() {

    /**
     * Returns an array of {@code Type} objects that represent the formal
     * parameter types, in declaration order, of the executable represented by
     * this object. Returns an array of length 0 if the
     * underlying executable takes no parameters.
     *
     * <p>If a formal parameter type is a parameterized type,
     * the {@code Type} object returned for it must accurately reflect
     * the actual type parameters used in the source code.
     *
     * <p>If a formal parameter type is a type variable or a parameterized
     * type, it is created. Otherwise, it is resolved.
     *
     * @return an array of {@code Type}s that represent the formal
     *     parameter types of the underlying executable, in declaration order
     * @throws GenericSignatureFormatError
     *     if the generic method signature does not conform to the format
     *     specified in
     *     <cite>The Java&trade; Virtual Machine Specification</cite>
     * @throws TypeNotPresentException if any of the parameter
     *     types of the underlying executable refers to a non-existent type
     *     declaration
     * @throws MalformedParameterizedTypeException if any of
     *     the underlying executable's parameter types refer to a parameterized
     *     type that cannot be instantiated for any reason
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public int getParameterCount() {

    /**
     * Returns the number of formal parameters (whether explicitly
     * declared or implicitly declared or neither) for the executable
     * represented by this object.
     *
     * @since 1.8
     * @return The number of formal parameters for the executable this
     * object represents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract Class<?>[] getParameterTypes();

    /**
     * Returns an array of {@code Class} objects that represent the formal
     * parameter types, in declaration order, of the executable
     * represented by this object.  Returns an array of length
     * 0 if the underlying executable takes no parameters.
     *
     * @return the parameter types for the executable this object
     * represents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract TypeVariable<?>[] getTypeParameters();

    /**
     * Returns an array of {@code TypeVariable} objects that represent the
     * type variables declared by the generic declaration represented by this
     * {@code GenericDeclaration} object, in declaration order.  Returns an
     * array of length 0 if the underlying generic declaration declares no type
     * variables.
     *
     * @return an array of {@code TypeVariable} objects that represent
     *     the type variables declared by this generic declaration
     * @throws GenericSignatureFormatError if the generic
     *     signature of this generic declaration does not conform to
     *     the format specified in
     *     <cite>The Java&trade; Virtual Machine Specification</cite>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract int getModifiers();

    /**
     * Returns the Java language {@linkplain Modifier modifiers} for
     * the executable represented by this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract String getName();

    /**
     * Returns the name of the executable represented by this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    public abstract Class<?> getDeclaringClass();

    /**
     * Returns the {@code Class} object representing the class or interface
     * that declares the executable represented by this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    abstract void specificToGenericStringHeader(StringBuilder sb);

    /**
     * Generate toGenericString header information specific to a
     * method or constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    abstract void specificToStringHeader(StringBuilder sb);

    /**
     * Generate toString header information specific to a method or
     * constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    abstract boolean hasGenericInformation();

    /**
     * Does the Executable have generic information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    abstract Executable getRoot();

    /**
     * Accessor method to allow code sharing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
    abstract byte[] getAnnotationBytes();

    /**
     * Accessor method to allow code sharing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Executable.java
public abstract class Executable extends AccessibleObject

/**
 * A shared superclass for the common functionality of {@link Method}
 * and {@link Constructor}.
 *
 * @since 1.8
 */