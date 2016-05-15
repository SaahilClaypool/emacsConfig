_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public XMLAttributes getAttributes();

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns all attribute of such element (or enclosing element).
     *
     * @return  all attributes of the tiggering/enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public QName getEnclosingElementName();

    /**
     * If a call is triggered by an attribute or xsi:type, then this method
     * returns the enclosing element of such element.
     *
     * @return  the name of the enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public QName getTriggeringComponent();

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns the name of such triggering component: the name of
     * the element/attribute, or the value of the xsi:type.
     *
     * @return  the name of the triggering component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public String[] getLocationHints();

    /**
     * For import and references from the instance document, it's possible to
     * have multiple hints for one namespace. So this method returns an array,
     * which contains all location hints.
     *
     * @return  an array of all location hints associated to the expected
     *          target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public String getTargetNamespace();

    /**
     * If the context is "include" or "redefine", then return the target
     * namespace of the enclosing schema document; otherwise, the expected
     * target namespace of this document.
     *
     * @return  the expected/enclosing target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public short getContextType();

    /**
     * Get the context. The returned value is one of the pre-defined
     * CONTEXT_xxx constants.
     *
     * @return  the value indicating the context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_ATTRIBUTE = 6;

    /**
     * Indicate that the parse of the current schema document is triggered by
     * the occurrence of an attribute whose namespace is the target namespace
     * of this schema document. This value is only used if we do defer the
     * loading of schema documents until a component from that namespace is
     * referenced from the instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_INSTANCE  = 4;

    /**
     * Indicate that the parse of the current schema document is triggered
     * by xsi:schemaLocation/noNamespaceSchemaLocation attribute(s) in the
     * instance document. This value is only used if we don't defer the loading
     * of schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_IMPORT    = 2;

    /**
     * Indicate that the current schema document is &lt;import&gt;ed by another
     * schema document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_INCLUDE   = 0;

    /**
     * Indicate that the current schema document is &lt;include&gt;d by another
     * schema document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
public interface XMLSchemaDescription extends XMLGrammarDescription {

/**
 * All information specific to XML Schema grammars.
 *
 * @author Sandy Gao, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public XMLAttributes getAttributes();

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns all attribute of such element (or enclosing element).
     *
     * @return  all attributes of the tiggering/enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public QName getEnclosingElementName();

    /**
     * If a call is triggered by an attribute or xsi:type, then this method
     * returns the enclosing element of such element.
     *
     * @return  the name of the enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public QName getTriggeringComponent();

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns the name of such triggering component: the name of
     * the element/attribute, or the value of the xsi:type.
     *
     * @return  the name of the triggering component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public String[] getLocationHints();

    /**
     * For import and references from the instance document, it's possible to
     * have multiple hints for one namespace. So this method returns an array,
     * which contains all location hints.
     *
     * @return  an array of all location hints associated to the expected
     *          target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public String getTargetNamespace();

    /**
     * If the context is "include" or "redefine", then return the target
     * namespace of the enclosing schema document; otherwise, the expected
     * target namespace of this document.
     *
     * @return  the expected/enclosing target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public short getContextType();

    /**
     * Get the context. The returned value is one of the pre-defined
     * CONTEXT_xxx constants.
     *
     * @return  the value indicating the context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_ATTRIBUTE = 6;

    /**
     * Indicate that the parse of the current schema document is triggered by
     * the occurrence of an attribute whose namespace is the target namespace
     * of this schema document. This value is only used if we do defer the
     * loading of schema documents until a component from that namespace is
     * referenced from the instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_INSTANCE  = 4;

    /**
     * Indicate that the parse of the current schema document is triggered
     * by xsi:schemaLocation/noNamespaceSchemaLocation attribute(s) in the
     * instance document. This value is only used if we don't defer the loading
     * of schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_IMPORT    = 2;

    /**
     * Indicate that the current schema document is &lt;import&gt;ed by another
     * schema document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
    public final static short CONTEXT_INCLUDE   = 0;

    /**
     * Indicate that the current schema document is &lt;include&gt;d by another
     * schema document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLSchemaDescription.java
public interface XMLSchemaDescription extends XMLGrammarDescription {

/**
 * All information specific to XML Schema grammars.
 *
 * @author Sandy Gao, IBM
 *
 */