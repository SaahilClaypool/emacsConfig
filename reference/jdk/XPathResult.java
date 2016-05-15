_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public Node snapshotItem(int index)

    /**
     * Returns the <code>index</code>th item in the snapshot collection. If
     * <code>index</code> is greater than or equal to the number of nodes in
     * the list, this method returns <code>null</code>. Unlike the iterator
     * result, the snapshot does not become invalid, but may not correspond
     * to the current document if it is mutated.
     * @param index Index into the snapshot collection.
     * @return The node at the <code>index</code>th position in the
     *   <code>NodeList</code>, or <code>null</code> if that is not a valid
     *   index.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_SNAPSHOT_TYPE</code> or
     *   <code>ORDERED_NODE_SNAPSHOT_TYPE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public Node iterateNext()

    /**
     * Iterates and returns the next node from the node set or
     * <code>null</code>if there are no more nodes.
     * @return Returns the next node.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_ITERATOR_TYPE</code> or
     *   <code>ORDERED_NODE_ITERATOR_TYPE</code>.
     * @exception DOMException
     *   INVALID_STATE_ERR: The document has been mutated since the result was
     *   returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public int getSnapshotLength()

    /**
     * The number of nodes in the result snapshot. Valid values for
     * snapshotItem indices are <code>0</code> to
     * <code>snapshotLength-1</code> inclusive.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_SNAPSHOT_TYPE</code> or
     *   <code>ORDERED_NODE_SNAPSHOT_TYPE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public boolean getInvalidIteratorState();

    /**
     * Signifies that the iterator has become invalid. True if
     * <code>resultType</code> is <code>UNORDERED_NODE_ITERATOR_TYPE</code>
     * or <code>ORDERED_NODE_ITERATOR_TYPE</code> and the document has been
     * modified since this result was returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public Node getSingleNodeValue()

    /**
     * The value of this single node result, which may be <code>null</code>.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>ANY_UNORDERED_NODE_TYPE</code> or
     *   <code>FIRST_ORDERED_NODE_TYPE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public boolean getBooleanValue()

    /**
     * The value of this boolean result.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>BOOLEAN_TYPE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public String getStringValue()

    /**
     * The value of this string result.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>STRING_TYPE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public double getNumberValue()

    /**
     * The value of this number result. If the native double type of the DOM
     * binding does not directly support the exact IEEE 754 result of the
     * XPath expression, then it is up to the definition of the binding
     * binding to specify how the XPath number is converted to the native
     * binding number.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>NUMBER_TYPE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public short getResultType();

    /**
     * A code representing the type of this result, as defined by the type
     * constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public static final short ANY_UNORDERED_NODE_TYPE   = 8;

    /**
     * The result is a node set as defined by  and will be accessed as a
     * single node, which may be <code>null</code>if the node set is empty.
     * Document modification does not invalidate the node, but may mean that
     * the result node no longer corresponds to the current document. This
     * is a convenience that permits optimization since the implementation
     * can stop once any node in the in the resulting set has been found.
     * <br>If there are more than one node in the actual result, the single
     * node returned might not be the first in document order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public static final short UNORDERED_NODE_SNAPSHOT_TYPE = 6;

    /**
     * The result is a node set as defined by  that will be accessed as a
     * snapshot list of nodes that may not be in a particular order.
     * Document modification does not invalidate the snapshot but may mean
     * that reevaluation would not yield the same snapshot and nodes in the
     * snapshot may have been altered, moved, or removed from the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public static final short UNORDERED_NODE_ITERATOR_TYPE = 4;

    /**
     * The result is a node set as defined by  that will be accessed
     * iteratively, which may not produce nodes in a particular order.
     * Document modification invalidates the iteration.
     * <br>This is the default type returned if the result is a node set and
     * <code>ANY_TYPE</code> is requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public static final short STRING_TYPE               = 2;

    /**
     * The result is a string as defined by . Document modification does not
     * invalidate the string, but may mean that the string no longer
     * corresponds to the current document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
    public static final short ANY_TYPE                  = 0;

    /**
     * This code does not represent a specific type. An evaluation of an XPath
     * expression will never produce this type. If this type is requested,
     * then the evaluation returns whatever type naturally results from
     * evaluation of the expression.
     * <br>If the natural result is a node set when <code>ANY_TYPE</code> was
     * requested, then <code>UNORDERED_NODE_ITERATOR_TYPE</code> is always
     * the resulting type. Any other representation of a node set must be
     * explicitly requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathResult.java
public interface XPathResult {

/**
 * The <code>XPathResult</code> interface represents the result of the
 * evaluation of an XPath 1.0 expression within the context of a particular
 * node. Since evaluation of an XPath expression can result in various
 * result types, this object makes it possible to discover and manipulate
 * the type and value of the result.
 * <p>See also the <a href='http://www.w3.org/2002/08/WD-DOM-Level-3-XPath-20020820'>Document Object Model (DOM) Level 3 XPath Specification</a>.
 */