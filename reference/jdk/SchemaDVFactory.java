_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType createTypeUnion(String name, String targetNamespace,
                                                 short finalSet, XSSimpleType[] memberTypes,
                                                 XSObjectList annotations);

    /**
     * Create a new simple type which is derived by union from a list of other
     * simple types.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param memberTypes       member types of the union type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType createTypeList(String name, String targetNamespace,
                                                short finalSet, XSSimpleType itemType,
                                                XSObjectList annotations);

    /**
     * Create a new simple type which is derived by list from another simple
     * type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param itemType          item type of the list type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType createTypeRestriction(String name, String targetNamespace,
                                                       short finalSet, XSSimpleType base,
                                                       XSObjectList annotations);

    /**
     * Create a new simple type which is derived by restriction from another
     * simple type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param base              base type of the new type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract SymbolHash getBuiltInTypes();

    /**
     * get all built-in simple types, which are stored in a SymbolHash keyed by
     * the name
     *
     * @return      a SymbolHash which contains all built-in simple types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType getBuiltInType(String name);

    /**
     * Get a built-in simple type of the given name
     * REVISIT: its still not decided within the Schema WG how to define the
     *          ur-types and if all simple types should be derived from a
     *          complex type, so as of now we ignore the fact that anySimpleType
     *          is derived from anyType, and pass 'null' as the base of
     *          anySimpleType. It needs to be changed as per the decision taken.
     *
     * @param name  the name of the datatype
     * @return      the datatype validator of the given name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public static synchronized final SchemaDVFactory getInstance(String factoryClass) throws DVFactoryException {

    /**
     * Get an instance of SchemaDVFactory implementation.
     *
     * @param factoryClass   name of the schema factory implementation to instantiate.
     * @return  an instance of SchemaDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public static synchronized final SchemaDVFactory getInstance() throws DVFactoryException {

    /**
     * Get a default instance of SchemaDVFactory implementation.
     *
     * @return  an instance of SchemaDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
public abstract class SchemaDVFactory {

/**
 * Defines a factory API that enables applications to <p>
 * 1. to get the instance of specified SchemaDVFactory implementation <p>
 * 2. to create/return built-in schema simple types <p>
 * 3. to create user defined simple types. <p>
 *
 * Implementations of this abstract class can be used to get built-in simple
 * types and create user-defined simle types. <p>
 *
 * The implementation should store the built-in datatypes in static data, so
 * that they can be shared by multiple parser instance, and multiple threads.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: SchemaDVFactory.java,v 1.6 2010-11-01 04:39:43 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType createTypeUnion(String name, String targetNamespace,
                                                 short finalSet, XSSimpleType[] memberTypes,
                                                 XSObjectList annotations);

    /**
     * Create a new simple type which is derived by union from a list of other
     * simple types.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param memberTypes       member types of the union type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType createTypeList(String name, String targetNamespace,
                                                short finalSet, XSSimpleType itemType,
                                                XSObjectList annotations);

    /**
     * Create a new simple type which is derived by list from another simple
     * type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param itemType          item type of the list type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType createTypeRestriction(String name, String targetNamespace,
                                                       short finalSet, XSSimpleType base,
                                                       XSObjectList annotations);

    /**
     * Create a new simple type which is derived by restriction from another
     * simple type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param base              base type of the new type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract SymbolHash getBuiltInTypes();

    /**
     * get all built-in simple types, which are stored in a SymbolHash keyed by
     * the name
     *
     * @return      a SymbolHash which contains all built-in simple types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public abstract XSSimpleType getBuiltInType(String name);

    /**
     * Get a built-in simple type of the given name
     * REVISIT: its still not decided within the Schema WG how to define the
     *          ur-types and if all simple types should be derived from a
     *          complex type, so as of now we ignore the fact that anySimpleType
     *          is derived from anyType, and pass 'null' as the base of
     *          anySimpleType. It needs to be changed as per the decision taken.
     *
     * @param name  the name of the datatype
     * @return      the datatype validator of the given name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public static synchronized final SchemaDVFactory getInstance(String factoryClass) throws DVFactoryException {

    /**
     * Get an instance of SchemaDVFactory implementation.
     *
     * @param factoryClass   name of the schema factory implementation to instantiate.
     * @return  an instance of SchemaDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
    public static synchronized final SchemaDVFactory getInstance() throws DVFactoryException {

    /**
     * Get a default instance of SchemaDVFactory implementation.
     *
     * @return  an instance of SchemaDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/SchemaDVFactory.java
public abstract class SchemaDVFactory {

/**
 * Defines a factory API that enables applications to <p>
 * 1. to get the instance of specified SchemaDVFactory implementation <p>
 * 2. to create/return built-in schema simple types <p>
 * 3. to create user defined simple types. <p>
 *
 * Implementations of this abstract class can be used to get built-in simple
 * types and create user-defined simle types. <p>
 *
 * The implementation should store the built-in datatypes in static data, so
 * that they can be shared by multiple parser instance, and multiple threads.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: SchemaDVFactory.java,v 1.6 2010-11-01 04:39:43 joehw Exp $
 */