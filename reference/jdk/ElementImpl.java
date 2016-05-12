_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected NamedNodeMapImpl getDefaultAttributes() {

    /** Get the default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected void reconcileDefaultAttributes() {

    /** Reconcile default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected void setupDefaultAttributes() {

    /** Setup the default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: Subclassed to flip the attributes' readonly switch as well.
     * @see NodeImpl#setReadOnly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public TypeInfo getSchemaTypeInfo(){

        /**
         * Method getSchemaTypeInfo.
         * @return TypeInfo
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean isDerivedFrom(String typeNamespaceArg,
                                 String typeNameArg,
                                 int derivationMethod) {

    /**
     * Introduced in DOM Level 3. <p>
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *        The namspace of the ancestor type declaration
     * @param ancestorName
     *        The name of the ancestor type declaration
     * @param type
     *        The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getTypeNamespace() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
     public String getTypeName() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setIdAttributeNS(String namespaceURI, String localName,
                                    boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setIdAttribute(String name, boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setIdAttributeNode(Attr at, boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean isEqualNode(Node arg) {

    /**
     * DOM Level 3 WD- Experimental.
     * Override inherited behavior from NodeImpl and ParentNode to check on
     * attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public NodeList getElementsByTagNameNS(String namespaceURI,
                                           String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Returns a NodeList of all the Elements with a given local name and
     * namespace URI in the order in which they would be encountered in a
     * preorder traversal of the Document tree, starting from this node.
     *
     * @param namespaceURI The namespace URI of the elements to match
     *                     on. The special value "*" matches all
     *                     namespaces. When it is null or an empty
     *                     string, this method behaves like
     *                     getElementsByTagName.
     * @param localName    The local name of the elements to match on.
     *                     The special value "*" matches all local names.
     * @return NodeList    A new NodeList object containing all the matched
     *                     Elements.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean hasAttributeNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean hasAttribute(String name) {

    /**
     * Introduced in DOM Level 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean hasAttributes() {

    /**
     * Introduced in DOM Level 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected int getXercesAttribute(String namespaceURI, String localName){

    /**
      * NON-DOM: get inded of an attribute
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected int setXercesAttributeNode (Attr attr){

    /**
      * NON-DOM: sets attribute node for this element
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr setAttributeNodeNS(Attr newAttr)

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Adds a new attribute. If an attribute with that local name and
     * namespace URI is already present in the element, it is replaced
     * by the new one.
     *
     * @param Attr      The Attr node to add to the attribute list. When
     *                  the Node has no namespaceURI, this method behaves
     *                  like setAttributeNode.
     * @return Attr     If the newAttr attribute replaces an existing attribute
     *                  with the same local name and namespace URI, the *
     *                  previously existing Attr node is returned, otherwise
     *                  null is returned.
     * @throws          WRONG_DOCUMENT_ERR: Raised if newAttr
     *                  was created from a different document than the one that
     *                  created the element.
     *
     * @throws          NO_MODIFICATION_ALLOWED_ERR: Raised if
     *                  this node is readonly.
     *
     * @throws          INUSE_ATTRIBUTE_ERR: Raised if newAttr is
     *                  already an attribute of another Element object. The
     *                  DOM user must explicitly clone Attr nodes to re-use
     *                  them in other elements.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr getAttributeNodeNS(String namespaceURI, String localName){

    /**
     * Retrieves an Attr node by local name and namespace URI.
     *
     * @param namespaceURI  The namespace URI of the attribute to
     *                      retrieve.
     * @param localName     The local name of the attribute to retrieve.
     * @return Attr         The Attr node with the specified attribute
     *                      local name and namespace
     *                      URI or null if there is no such attribute.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void removeAttributeNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Removes an attribute by local name and namespace URI. If the removed
     * attribute has a default value it is immediately replaced.
     * The replacing attribute has the same namespace URI and local name,
     * as well as the original prefix.<p>
     *
     * @param namespaceURI  The namespace URI of the attribute to remove.
     *
     * @param localName     The local name of the attribute to remove.
     * @throws                  NO_MODIFICATION_ALLOWED_ERR: Raised if this
     *                          node is readonly.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
     public void setAttributeNS(String namespaceURI,String qualifiedName,
                                          String value) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     *  Adds a new attribute.
     *  If the given namespaceURI is null or an empty string and the
     *  qualifiedName has a prefix that is "xml", the new attribute is bound to
     *  the predefined namespace "http://www.w3.org/XML/1998/namespace"
     *  [Namespaces].  If an attribute with the same local name and namespace
     *  URI is already present on the element, its prefix is changed to be the
     *  prefix part of the qualifiedName, and its value is changed to be the
     *  value parameter. This value is a simple string, it is not parsed as it
     *  is being set. So any markup (such as syntax to be recognized as an
     *  entity reference) is treated as literal text, and needs to be
     *  appropriately escaped by the implementation when it is written out. In
     *  order to assign an attribute value that contains entity references, the
     *  user must create an Attr node plus any Text and EntityReference nodes,
     *  build the appropriate subtree, and use setAttributeNodeNS or
     *  setAttributeNode to assign it as the value of an attribute.
     *
     * @param namespaceURI      The namespace URI of the attribute to create
     *                          or alter.
     * @param qualifiedName     The qualified name of the attribute to create or
     *                          alter.
     * @param value             The value to set in string form.
     * @throws                  INVALID_CHARACTER_ERR: Raised if the specified
     *                          name contains an invalid character.
     *
     * @throws                  NO_MODIFICATION_ALLOWED_ERR: Raised if this
     *                          node is readonly.
     *
     * @throws                  NAMESPACE_ERR: Raised if the qualifiedName
     *                          has a prefix that is "xml" and the namespaceURI
     *                          is neither null nor an empty string nor
     *                          "http://www.w3.org/XML/1998/namespace", or if
     *                          the qualifiedName has a prefix that is "xmlns"
     *                          but the namespaceURI is neither null nor an
     *                          empty string, or if if the qualifiedName has a
     *                          prefix different from "xml" and "xmlns" and the
     *                          namespaceURI is null or an empty string.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getAttributeNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Retrieves an attribute value by local name and namespace URI.
     *
     * @param namespaceURI
     *                      The namespace URI of the attribute to
     *                      retrieve.
     * @param localName     The local name of the attribute to retrieve.
     * @return String       The Attr value as a string, or empty string
     *                      if that attribute
     *                      does not have a specified or default value.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr setAttributeNode(Attr newAttr)

    /**
     * Add a new attribute/value pair, or replace the value of the
     * existing attribute with that name.
     * <P>
     * This method allows you to add an Attribute that has already been
     * constructed, and hence avoids the limitations of the simple
     * setAttribute() call. It can handle attribute values that have
     * arbitrarily complex tree structure -- in particular, those which
     * had entity references mixed into their text.
     *
     * @throws DOMException(INUSE_ATTRIBUTE_ERR) if the Attribute object
     * has already been assigned to another Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
        public void setAttribute(String name, String value) {

    /**
     * Add a new name/value pair, or replace the value of the existing
     * attribute having that name.
     *
     * Note: this method supports only the simplest kind of Attribute,
     * one whose value is a string contained in a single Text node.
     * If you want to assert a more complex value (which XML permits,
     * though HTML doesn't), see setAttributeNode().
     *
     * The attribute is created with specified=true, meaning it's an
     * explicit value rather than inherited from the DTD as a default.
     * Again, setAttributeNode can be used to achieve other results.
     *
     * @throws DOMException(INVALID_NAME_ERR) if the name is not acceptable.
     * (Attribute factory will do that test for us.)
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr removeAttributeNode(Attr oldAttr)

    /**
     * Remove the specified attribute/value pair. If the removed
     * Attribute has a default value, it is immediately replaced.
     * <p>
     * NOTE: Specifically removes THIS NODE -- not the node with this
     * name, nor the node with these contents. If the specific Attribute
     * object passed in is not stored in this Element, we throw a
     * DOMException.  If you really want to remove an attribute by name,
     * use removeAttribute().
     *
     * @return the Attribute object that was removed.
     * @throws DOMException(NOT_FOUND_ERR) if oldattr is not an attribute of
     * this Element.
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void removeAttribute(String name) {

    /**
     * Remove the named attribute from this Element. If the removed
     * Attribute has a default value, it is immediately replaced thereby.
     * <P>
     * The default logic is actually implemented in NamedNodeMapImpl.
     * PR-DOM-Level-1-19980818 doesn't fully address the DTD, so some
     * of this behavior is likely to change in future versions. ?????
     * <P>
     * Note that this call "succeeds" even if no attribute by this name
     * existed -- unlike removeAttributeNode, which will throw a not-found
     * exception in that case.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void normalize() {

    /**
     * In "normal form" (as read from a source file), there will never be two
     * Text children in succession. But DOM users may create successive Text
     * nodes in the course of manipulating the document. Normalize walks the
     * sub-tree and merges adjacent Texts, as if the DOM had been written out
     * and read back in again. This simplifies implementation of higher-level
     * functions that may want to assume that the document is in standard form.
     * <p>
     * To normalize a Document, normalize its top-level Element child.
     * <p>
     * As of PR-DOM-Level-1-19980818, CDATA -- despite being a subclass of
     * Text -- is considered "markup" and will _not_ be merged either with
     * normal Text or with other CDATASections.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getTagName() {

    /**
     * Returns the name of the Element. Note that Element.nodeName() is
     * defined to also return the tag name.
     * <p>
     * This is case-preserving in XML. HTML should uppercasify it on the
     * way in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public NodeList getElementsByTagName(String tagname) {

    /**
     * Returns a NodeList of all descendent nodes (children,
     * grandchildren, and so on) which are Elements and which have the
     * specified tag name.
     * <p>
     * Note: NodeList is a "live" view of the DOM. Its contents will
     * change as the DOM changes, and alterations made to the NodeList
     * will be reflected in the DOM.
     *
     * @param tagname The type of element to gather. To obtain a list of
     * all elements no matter what their names, use the wild-card tag
     * name "*".
     *
     * @see DeepNodeListImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr getAttributeNode(String name) {

    /**
     * Look up a single Attribute by name. Returns the Attribute Node,
     * so its complete child tree is available. This could be important in
     * XML, where the string rendering may not be sufficient information.
     * <p>
     * If no matching attribute is available, returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getAttribute(String name) {

    /**
     * Look up a single Attribute by name. Returns the Attribute's
     * string value, or an empty string (NOT null!) to indicate that the
     * name did not map to a currently defined attribute.
     * <p>
     * Note: Attributes may contain complex node trees. This method
     * returns the "flattened" string obtained from Attribute.getValue().
     * If you need the structure information, see getAttributeNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node, its children, and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getBaseURI() {

   /**
     * DOM Level 3 WD - Experimental.
     * Retrieve baseURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Return a duplicate copy of this Element. Note that its children
     * will not be copied unless the "deep" flag is true, but Attributes
     * are <i>always</i> replicated.
     *
     * @see org.w3c.dom.Node#cloneNode(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public NamedNodeMap getAttributes() {

    /**
     * Retrieve all the Attributes as a set. Note that this API is inherited
     * from Node rather than specified on Element; in fact only Elements will
     * ever have Attributes, but they want to allow folks to "blindly" operate
     * on the tree as a set of Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getNodeName() {

    /**
     * Returns the element name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public ElementImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected AttributeMap attributes;

    /** Attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected String name;

    /** Element name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    static final long serialVersionUID = 3717253516652722278L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
public class ElementImpl

/**
 * Elements represent most of the "markup" and structure of the
 * document.  They contain both the data for the element itself
 * (element name and attributes), and any contained nodes, including
 * document text (as children).
 * <P>
 * Elements may have Attributes associated with them; the API for this is
 * defined in Node, but the function is implemented here. In general, XML
 * applications should retrive Attributes as Nodes, since they may contain
 * entity references and hence be a fairly complex sub-tree. HTML users will
 * be dealing with simple string values, and convenience methods are provided
 * to work in terms of Strings.
 * <P>
 * ElementImpl does not support Namespaces. ElementNSImpl, which inherits from
 * it, does.
 * @see ElementNSImpl
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    private static boolean nsEquals(String nsURI_1, String nsURI_2) {

    /**
     * Compares two namespace URIs with an extra case for null entries
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    public int getCharacterOffset() {

    /** Returns the character offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    public int getColumnNumber() {

    /** Returns the column number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    public int getLineNumber() {

    /** Returns the line number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
public class ElementImpl extends DefaultElement {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: ElementImpl.java,v 1.7 2010-11-01 04:40:01 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected NamedNodeMapImpl getDefaultAttributes() {

    /** Get the default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected void reconcileDefaultAttributes() {

    /** Reconcile default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected void setupDefaultAttributes() {

    /** Setup the default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: Subclassed to flip the attributes' readonly switch as well.
     * @see NodeImpl#setReadOnly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public TypeInfo getSchemaTypeInfo(){

        /**
         * Method getSchemaTypeInfo.
         * @return TypeInfo
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean isDerivedFrom(String typeNamespaceArg,
                                 String typeNameArg,
                                 int derivationMethod) {

    /**
     * Introduced in DOM Level 3. <p>
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *        The namspace of the ancestor type declaration
     * @param ancestorName
     *        The name of the ancestor type declaration
     * @param type
     *        The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getTypeNamespace() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
     public String getTypeName() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setIdAttributeNS(String namespaceURI, String localName,
                                    boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setIdAttribute(String name, boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void setIdAttributeNode(Attr at, boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean isEqualNode(Node arg) {

    /**
     * DOM Level 3 WD- Experimental.
     * Override inherited behavior from NodeImpl and ParentNode to check on
     * attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public NodeList getElementsByTagNameNS(String namespaceURI,
                                           String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Returns a NodeList of all the Elements with a given local name and
     * namespace URI in the order in which they would be encountered in a
     * preorder traversal of the Document tree, starting from this node.
     *
     * @param namespaceURI The namespace URI of the elements to match
     *                     on. The special value "*" matches all
     *                     namespaces. When it is null or an empty
     *                     string, this method behaves like
     *                     getElementsByTagName.
     * @param localName    The local name of the elements to match on.
     *                     The special value "*" matches all local names.
     * @return NodeList    A new NodeList object containing all the matched
     *                     Elements.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean hasAttributeNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean hasAttribute(String name) {

    /**
     * Introduced in DOM Level 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public boolean hasAttributes() {

    /**
     * Introduced in DOM Level 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected int getXercesAttribute(String namespaceURI, String localName){

    /**
      * NON-DOM: get inded of an attribute
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected int setXercesAttributeNode (Attr attr){

    /**
      * NON-DOM: sets attribute node for this element
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr setAttributeNodeNS(Attr newAttr)

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Adds a new attribute. If an attribute with that local name and
     * namespace URI is already present in the element, it is replaced
     * by the new one.
     *
     * @param Attr      The Attr node to add to the attribute list. When
     *                  the Node has no namespaceURI, this method behaves
     *                  like setAttributeNode.
     * @return Attr     If the newAttr attribute replaces an existing attribute
     *                  with the same local name and namespace URI, the *
     *                  previously existing Attr node is returned, otherwise
     *                  null is returned.
     * @throws          WRONG_DOCUMENT_ERR: Raised if newAttr
     *                  was created from a different document than the one that
     *                  created the element.
     *
     * @throws          NO_MODIFICATION_ALLOWED_ERR: Raised if
     *                  this node is readonly.
     *
     * @throws          INUSE_ATTRIBUTE_ERR: Raised if newAttr is
     *                  already an attribute of another Element object. The
     *                  DOM user must explicitly clone Attr nodes to re-use
     *                  them in other elements.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr getAttributeNodeNS(String namespaceURI, String localName){

    /**
     * Retrieves an Attr node by local name and namespace URI.
     *
     * @param namespaceURI  The namespace URI of the attribute to
     *                      retrieve.
     * @param localName     The local name of the attribute to retrieve.
     * @return Attr         The Attr node with the specified attribute
     *                      local name and namespace
     *                      URI or null if there is no such attribute.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void removeAttributeNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Removes an attribute by local name and namespace URI. If the removed
     * attribute has a default value it is immediately replaced.
     * The replacing attribute has the same namespace URI and local name,
     * as well as the original prefix.<p>
     *
     * @param namespaceURI  The namespace URI of the attribute to remove.
     *
     * @param localName     The local name of the attribute to remove.
     * @throws                  NO_MODIFICATION_ALLOWED_ERR: Raised if this
     *                          node is readonly.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
     public void setAttributeNS(String namespaceURI,String qualifiedName,
                                          String value) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     *  Adds a new attribute.
     *  If the given namespaceURI is null or an empty string and the
     *  qualifiedName has a prefix that is "xml", the new attribute is bound to
     *  the predefined namespace "http://www.w3.org/XML/1998/namespace"
     *  [Namespaces].  If an attribute with the same local name and namespace
     *  URI is already present on the element, its prefix is changed to be the
     *  prefix part of the qualifiedName, and its value is changed to be the
     *  value parameter. This value is a simple string, it is not parsed as it
     *  is being set. So any markup (such as syntax to be recognized as an
     *  entity reference) is treated as literal text, and needs to be
     *  appropriately escaped by the implementation when it is written out. In
     *  order to assign an attribute value that contains entity references, the
     *  user must create an Attr node plus any Text and EntityReference nodes,
     *  build the appropriate subtree, and use setAttributeNodeNS or
     *  setAttributeNode to assign it as the value of an attribute.
     *
     * @param namespaceURI      The namespace URI of the attribute to create
     *                          or alter.
     * @param qualifiedName     The qualified name of the attribute to create or
     *                          alter.
     * @param value             The value to set in string form.
     * @throws                  INVALID_CHARACTER_ERR: Raised if the specified
     *                          name contains an invalid character.
     *
     * @throws                  NO_MODIFICATION_ALLOWED_ERR: Raised if this
     *                          node is readonly.
     *
     * @throws                  NAMESPACE_ERR: Raised if the qualifiedName
     *                          has a prefix that is "xml" and the namespaceURI
     *                          is neither null nor an empty string nor
     *                          "http://www.w3.org/XML/1998/namespace", or if
     *                          the qualifiedName has a prefix that is "xmlns"
     *                          but the namespaceURI is neither null nor an
     *                          empty string, or if if the qualifiedName has a
     *                          prefix different from "xml" and "xmlns" and the
     *                          namespaceURI is null or an empty string.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getAttributeNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Retrieves an attribute value by local name and namespace URI.
     *
     * @param namespaceURI
     *                      The namespace URI of the attribute to
     *                      retrieve.
     * @param localName     The local name of the attribute to retrieve.
     * @return String       The Attr value as a string, or empty string
     *                      if that attribute
     *                      does not have a specified or default value.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr setAttributeNode(Attr newAttr)

    /**
     * Add a new attribute/value pair, or replace the value of the
     * existing attribute with that name.
     * <P>
     * This method allows you to add an Attribute that has already been
     * constructed, and hence avoids the limitations of the simple
     * setAttribute() call. It can handle attribute values that have
     * arbitrarily complex tree structure -- in particular, those which
     * had entity references mixed into their text.
     *
     * @throws DOMException(INUSE_ATTRIBUTE_ERR) if the Attribute object
     * has already been assigned to another Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
        public void setAttribute(String name, String value) {

    /**
     * Add a new name/value pair, or replace the value of the existing
     * attribute having that name.
     *
     * Note: this method supports only the simplest kind of Attribute,
     * one whose value is a string contained in a single Text node.
     * If you want to assert a more complex value (which XML permits,
     * though HTML doesn't), see setAttributeNode().
     *
     * The attribute is created with specified=true, meaning it's an
     * explicit value rather than inherited from the DTD as a default.
     * Again, setAttributeNode can be used to achieve other results.
     *
     * @throws DOMException(INVALID_NAME_ERR) if the name is not acceptable.
     * (Attribute factory will do that test for us.)
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr removeAttributeNode(Attr oldAttr)

    /**
     * Remove the specified attribute/value pair. If the removed
     * Attribute has a default value, it is immediately replaced.
     * <p>
     * NOTE: Specifically removes THIS NODE -- not the node with this
     * name, nor the node with these contents. If the specific Attribute
     * object passed in is not stored in this Element, we throw a
     * DOMException.  If you really want to remove an attribute by name,
     * use removeAttribute().
     *
     * @return the Attribute object that was removed.
     * @throws DOMException(NOT_FOUND_ERR) if oldattr is not an attribute of
     * this Element.
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void removeAttribute(String name) {

    /**
     * Remove the named attribute from this Element. If the removed
     * Attribute has a default value, it is immediately replaced thereby.
     * <P>
     * The default logic is actually implemented in NamedNodeMapImpl.
     * PR-DOM-Level-1-19980818 doesn't fully address the DTD, so some
     * of this behavior is likely to change in future versions. ?????
     * <P>
     * Note that this call "succeeds" even if no attribute by this name
     * existed -- unlike removeAttributeNode, which will throw a not-found
     * exception in that case.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if the node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public void normalize() {

    /**
     * In "normal form" (as read from a source file), there will never be two
     * Text children in succession. But DOM users may create successive Text
     * nodes in the course of manipulating the document. Normalize walks the
     * sub-tree and merges adjacent Texts, as if the DOM had been written out
     * and read back in again. This simplifies implementation of higher-level
     * functions that may want to assume that the document is in standard form.
     * <p>
     * To normalize a Document, normalize its top-level Element child.
     * <p>
     * As of PR-DOM-Level-1-19980818, CDATA -- despite being a subclass of
     * Text -- is considered "markup" and will _not_ be merged either with
     * normal Text or with other CDATASections.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getTagName() {

    /**
     * Returns the name of the Element. Note that Element.nodeName() is
     * defined to also return the tag name.
     * <p>
     * This is case-preserving in XML. HTML should uppercasify it on the
     * way in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public NodeList getElementsByTagName(String tagname) {

    /**
     * Returns a NodeList of all descendent nodes (children,
     * grandchildren, and so on) which are Elements and which have the
     * specified tag name.
     * <p>
     * Note: NodeList is a "live" view of the DOM. Its contents will
     * change as the DOM changes, and alterations made to the NodeList
     * will be reflected in the DOM.
     *
     * @param tagname The type of element to gather. To obtain a list of
     * all elements no matter what their names, use the wild-card tag
     * name "*".
     *
     * @see DeepNodeListImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Attr getAttributeNode(String name) {

    /**
     * Look up a single Attribute by name. Returns the Attribute Node,
     * so its complete child tree is available. This could be important in
     * XML, where the string rendering may not be sufficient information.
     * <p>
     * If no matching attribute is available, returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getAttribute(String name) {

    /**
     * Look up a single Attribute by name. Returns the Attribute's
     * string value, or an empty string (NOT null!) to indicate that the
     * name did not map to a currently defined attribute.
     * <p>
     * Note: Attributes may contain complex node trees. This method
     * returns the "flattened" string obtained from Attribute.getValue().
     * If you need the structure information, see getAttributeNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node, its children, and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getBaseURI() {

   /**
     * DOM Level 3 WD - Experimental.
     * Retrieve baseURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Return a duplicate copy of this Element. Note that its children
     * will not be copied unless the "deep" flag is true, but Attributes
     * are <i>always</i> replicated.
     *
     * @see org.w3c.dom.Node#cloneNode(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public NamedNodeMap getAttributes() {

    /**
     * Retrieve all the Attributes as a set. Note that this API is inherited
     * from Node rather than specified on Element; in fact only Elements will
     * ever have Attributes, but they want to allow folks to "blindly" operate
     * on the tree as a set of Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public String getNodeName() {

    /**
     * Returns the element name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    public ElementImpl(CoreDocumentImpl ownerDoc, String name) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected AttributeMap attributes;

    /** Attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    protected String name;

    /** Element name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
    static final long serialVersionUID = 3717253516652722278L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ElementImpl.java
public class ElementImpl

/**
 * Elements represent most of the "markup" and structure of the
 * document.  They contain both the data for the element itself
 * (element name and attributes), and any contained nodes, including
 * document text (as children).
 * <P>
 * Elements may have Attributes associated with them; the API for this is
 * defined in Node, but the function is implemented here. In general, XML
 * applications should retrive Attributes as Nodes, since they may contain
 * entity references and hence be a fairly complex sub-tree. HTML users will
 * be dealing with simple string values, and convenience methods are provided
 * to work in terms of Strings.
 * <P>
 * ElementImpl does not support Namespaces. ElementNSImpl, which inherits from
 * it, does.
 * @see ElementNSImpl
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    private static boolean nsEquals(String nsURI_1, String nsURI_2) {

    /**
     * Compares two namespace URIs with an extra case for null entries
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    public int getCharacterOffset() {

    /** Returns the character offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    public int getColumnNumber() {

    /** Returns the column number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
    public int getLineNumber() {

    /** Returns the line number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/ElementImpl.java
public class ElementImpl extends DefaultElement {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: ElementImpl.java,v 1.7 2010-11-01 04:40:01 joehw Exp $
 */
