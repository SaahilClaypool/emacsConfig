_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public boolean isXPointerResolved() throws XNIException;

    /**
     * Returns true if the XPointer expression resolves any subresource of the
     * input resource.
     *
     * @return True if the xpointer expression matches a fragment in the resource
     *         else returns false.
     * @throws XNIException Thrown to signal an error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public boolean isFragmentResolved() throws XNIException;

    /**
     * Returns true if the XPointer expression resolves to the current resource fragment
     * or Node which is part of the input resource being streamed else returns false.
     *
     * @return True if the xpointer expression matches a node/fragment in the resource
     *         else returns false.
     * @throws XNIException Thrown to signal an error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public boolean resolveXPointer(QName element, XMLAttributes attributes,
            Augmentations augs, int event) throws XNIException;

    /**
     * Evaluates an XML resource with respect to an XPointer expressions
     * by checking if it's element and attributes parameters match the
     * criteria specified in the xpointer expression.
     *
     * @param element - The name of the element.
     * @param attributes - The element attributes.
     * @param augs - Additional information that may include infoset augmentations
     * @param event - An integer indicating
     *                0 - The start of an element
     *                1 - The end of an element
     *                2 - An empty element call
     * @return true if the element was resolved by the xpointer
     * @throws XNIException Thrown to signal an error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public void parseXPointer(String xpointer) throws XNIException;

    /**
     * Parses an XPointer expression.  It performs scheme specific processing
     * depending on the pointer parts and sets up a Vector of XPointerParts
     * in the order (left-to-right) they appear in the XPointer expression.
     *
     * @param  xpointer A String representing the xpointer expression.
     * @throws XNIException Thrown if the xpointer string does not conform to
     *         the XPointer Framework syntax or the syntax of the pointer part does
     *         not conform to its definition for its scheme.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
public interface XPointerProcessor {

/**
 * <p>
 * The XPointerProcessor is responsible for parsing an XPointer
 * expression and and providing scheme specific resolution of
 * the document fragment pointed to be the pointer.
 * </p>
 *
 * @xerces.internal
 *
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public boolean isXPointerResolved() throws XNIException;

    /**
     * Returns true if the XPointer expression resolves any subresource of the
     * input resource.
     *
     * @return True if the xpointer expression matches a fragment in the resource
     *         else returns false.
     * @throws XNIException Thrown to signal an error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public boolean isFragmentResolved() throws XNIException;

    /**
     * Returns true if the XPointer expression resolves to the current resource fragment
     * or Node which is part of the input resource being streamed else returns false.
     *
     * @return True if the xpointer expression matches a node/fragment in the resource
     *         else returns false.
     * @throws XNIException Thrown to signal an error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public boolean resolveXPointer(QName element, XMLAttributes attributes,
            Augmentations augs, int event) throws XNIException;

    /**
     * Evaluates an XML resource with respect to an XPointer expressions
     * by checking if it's element and attributes parameters match the
     * criteria specified in the xpointer expression.
     *
     * @param element - The name of the element.
     * @param attributes - The element attributes.
     * @param augs - Additional information that may include infoset augmentations
     * @param event - An integer indicating
     *                0 - The start of an element
     *                1 - The end of an element
     *                2 - An empty element call
     * @return true if the element was resolved by the xpointer
     * @throws XNIException Thrown to signal an error
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
    public void parseXPointer(String xpointer) throws XNIException;

    /**
     * Parses an XPointer expression.  It performs scheme specific processing
     * depending on the pointer parts and sets up a Vector of XPointerParts
     * in the order (left-to-right) they appear in the XPointer expression.
     *
     * @param  xpointer A String representing the xpointer expression.
     * @throws XNIException Thrown if the xpointer string does not conform to
     *         the XPointer Framework syntax or the syntax of the pointer part does
     *         not conform to its definition for its scheme.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerProcessor.java
public interface XPointerProcessor {

/**
 * <p>
 * The XPointerProcessor is responsible for parsing an XPointer
 * expression and and providing scheme specific resolution of
 * the document fragment pointed to be the pointer.
 * </p>
 *
 * @xerces.internal
 *
 *
 */