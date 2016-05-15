_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getBaseURI() {

    /**
     * The absolute base URI of this node or <code>null</code> if undefined.
     * This value is computed according to . However, when the
     * <code>Document</code> supports the feature "HTML" , the base URI is
     * computed using first the value of the href attribute of the HTML BASE
     * element if any, and the value of the <code>documentURI</code>
     * attribute from the <code>Document</code> interface otherwise.
     * <br> When the node is an <code>Element</code>, a <code>Document</code>
     * or a a <code>ProcessingInstruction</code>, this attribute represents
     * the properties [base URI] defined in . When the node is a
     * <code>Notation</code>, an <code>Entity</code>, or an
     * <code>EntityReference</code>, this attribute represents the
     * properties [declaration base URI] in the . How will this be affected
     * by resolution of relative namespace URIs issue?It's not.Should this
     * only be on Document, Element, ProcessingInstruction, Entity, and
     * Notation nodes, according to the infoset? If not, what is it equal to
     * on other nodes? Null? An empty string? I think it should be the
     * parent's.No.Should this be read-only and computed or and actual
     * read-write attribute?Read-only and computed (F2F 19 Jun 2000 and
     * teleconference 30 May 2001).If the base HTML element is not yet
     * attached to a document, does the insert change the Document.baseURI?
     * Yes. (F2F 26 Sep 2001)
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public short compareDocumentPosition(Node other) throws DOMException {

    /**
     * Compares a node with this node with regard to their position in the
     * document.
     * @param other The node to compare against this node.
     * @return Returns how the given node is positioned relatively to this
     *   node.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getTextContent() throws DOMException {

    /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public void setTextContent(String textContent)

    /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isSameNode(Node other) {

    /**
     * Returns whether this node is the same node as the given one.
     * <br>This method provides a way to determine whether two
     * <code>Node</code> references returned by the implementation reference
     * the same object. When two <code>Node</code> references are references
     * to the same object, even if through a proxy, the references may be
     * used completely interchangably, such that all attributes have the
     * same values and calling the same DOM method on either reference
     * always has exactly the same effect.
     * @param other The node to test against.
     * @return Returns <code>true</code> if the nodes are the same,
     *   <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String lookupPrefix(String namespaceURI){

    /**
     *
     * DOM Level 3 - Experimental:
     * Look up the prefix associated to the given namespace URI, starting from this node.
     *
     * @param namespaceURI
     * @return the prefix for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isDefaultNamespace(String namespaceURI){

    /**
     *  DOM Level 3: Experimental
     *  This method checks if the specified <code>namespaceURI</code> is the
     *  default namespace or not.
     *  @param namespaceURI The namespace URI to look for.
     *  @return  <code>true</code> if the specified <code>namespaceURI</code>
     *   is the default namespace, <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String lookupNamespaceURI(String specifiedPrefix) {

    /**
     * DOM Level 3 - Experimental:
     * Look up the namespace URI associated to the given prefix, starting from this node.
     * Use lookupNamespaceURI(null) to lookup the default namespace
     *
     * @param namespaceURI
     * @return th URI for the namespace
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isEqualNode(Node arg) {

    /**
     * Tests whether two nodes are equal.
     * <br>This method tests for equality of nodes, not sameness (i.e.,
     * whether the two nodes are references to the same object) which can be
     * tested with <code>Node.isSameNode</code>. All nodes that are the same
     * will also be equal, though the reverse may not be true.
     * <br>Two nodes are equal if and only if the following conditions are
     * satisfied: The two nodes are of the same type.The following string
     * attributes are equal: <code>nodeName</code>, <code>localName</code>,
     * <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code>
     * , <code>baseURI</code>. This is: they are both <code>null</code>, or
     * they have the same length and are character for character identical.
     * The <code>attributes</code> <code>NamedNodeMaps</code> are equal.
     * This is: they are both <code>null</code>, or they have the same
     * length and for each node that exists in one map there is a node that
     * exists in the other map and is equal, although not necessarily at the
     * same index.The <code>childNodes</code> <code>NodeLists</code> are
     * equal. This is: they are both <code>null</code>, or they have the
     * same length and contain equal nodes at the same index. This is true
     * for <code>Attr</code> nodes as for any other type of node. Note that
     * normalization can affect equality; to avoid this, nodes should be
     * normalized before being compared.
     * <br>For two <code>DocumentType</code> nodes to be equal, the following
     * conditions must also be satisfied: The following string attributes
     * are equal: <code>publicId</code>, <code>systemId</code>,
     * <code>internalSubset</code>.The <code>entities</code>
     * <code>NamedNodeMaps</code> are equal.The <code>notations</code>
     * <code>NamedNodeMaps</code> are equal.
     * <br>On the other hand, the following do not affect equality: the
     * <code>ownerDocument</code> attribute, the <code>specified</code>
     * attribute for <code>Attr</code> nodes, the
     * <code>isWhitespaceInElementContent</code> attribute for
     * <code>Text</code> nodes, as well as any user data or event listeners
     * registered on the nodes.
     * @param arg The node to compare equality with.
     * @param deep If <code>true</code>, recursively compare the subtrees; if
     *   <code>false</code>, compare only the nodes themselves (and its
     *   attributes, if it is an <code>Element</code>).
     * @return If the nodes, and possibly subtrees are equal,
     *   <code>true</code> otherwise <code>false</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public Object getFeature(String feature, String version) {

    /**
     *  This method returns a specialized object which implements the
     * specialized APIs of the specified feature and version. The
     * specialized object may also be obtained by using binding-specific
     * casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations.
     * @param feature The name of the feature requested (case-insensitive).
     * @param version  This is the version number of the feature to test. If
     *   the version is <code>null</code> or the empty string, supporting
     *   any version of the feature will cause the method to return an
     *   object that supports at least one version of the feature.
     * @return  Returns an object which implements the specialized APIs of
     *   the specified feature and version, if any, or <code>null</code> if
     *   there is no object which implements interfaces associated with that
     *   feature. If the <code>DOMObject</code> returned by this method
     *   implements the <code>Node</code> interface, it must delegate to the
     *   primary core <code>Node</code> and not return results inconsistent
     *   with the primary core <code>Node</code> such as attributes,
     *   childNodes, etc.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public Object getUserData(String key) {

    /**
     * Retrieves the object associated to a key on a this node. The object
     * must first have been set to this node by calling
     * <code>setUserData</code> with the same key.
     * @param key The key the object is associated to.
     * @return Returns the <code>DOMObject</code> associated to the given key
     *   on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public Object setUserData(String key,
                              Object data,
                              UserDataHandler handler) {

    /**
     * Associate an object to a key on this node. The object can later be
     * retrieved from this node by calling <code>getUserData</code> with the
     * same key.
     * @param key The key to associate the object to.
     * @param data The object to associate to the given key, or
     *   <code>null</code> to remove any existing association to that key.
     * @param handler The handler to associate to that key, or
     *   <code>null</code>.
     * @return Returns the <code>DOMObject</code> previously associated to
     *   the given key on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isDerivedFrom( String ns, String localName, int derivationMethod ) {

    /**
     * @see or.gw3c.dom.TypeInfo#isDerivedFrom(String,String,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getTypeNamespace() { return null;}

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getTypeName() {return null; }

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public int getHandleOfNode()

    /** Non-DOM method, part of the temporary kluge
     * %REVIEW% This would be a pruning problem, but since it will always be
     * added to the root element and we prune on elements, we shouldn't have
     * to worry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
public class DOM2DTMdefaultNamespaceDeclarationNode implements Attr,TypeInfo

/** This is a kluge to let us shove a declaration for xml: into the
 * DOM2DTM model.  Basically, it creates a proxy node in DOM space to
 * carry the additional information. This is _NOT_ a full DOM
 * implementation, and shouldn't be one since it sits alongside the
 * DOM rather than becoming part of the DOM model.
 *
 * (This used to be an internal class within DOM2DTM. Moved out because
 * I need to perform an instanceof operation on it to support a temporary
 * workaround in DTMManagerDefault.)
 *
 * %REVIEW% What if the DOM2DTM was built around a DocumentFragment and
 * there isn't a single root element? I think this fails that case...
 *
 * %REVIEW% An alternative solution would be to create the node _only_
 * in DTM space, but given how DOM2DTM is currently written I think
 * this is simplest.
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getBaseURI() {

    /**
     * The absolute base URI of this node or <code>null</code> if undefined.
     * This value is computed according to . However, when the
     * <code>Document</code> supports the feature "HTML" , the base URI is
     * computed using first the value of the href attribute of the HTML BASE
     * element if any, and the value of the <code>documentURI</code>
     * attribute from the <code>Document</code> interface otherwise.
     * <br> When the node is an <code>Element</code>, a <code>Document</code>
     * or a a <code>ProcessingInstruction</code>, this attribute represents
     * the properties [base URI] defined in . When the node is a
     * <code>Notation</code>, an <code>Entity</code>, or an
     * <code>EntityReference</code>, this attribute represents the
     * properties [declaration base URI] in the . How will this be affected
     * by resolution of relative namespace URIs issue?It's not.Should this
     * only be on Document, Element, ProcessingInstruction, Entity, and
     * Notation nodes, according to the infoset? If not, what is it equal to
     * on other nodes? Null? An empty string? I think it should be the
     * parent's.No.Should this be read-only and computed or and actual
     * read-write attribute?Read-only and computed (F2F 19 Jun 2000 and
     * teleconference 30 May 2001).If the base HTML element is not yet
     * attached to a document, does the insert change the Document.baseURI?
     * Yes. (F2F 26 Sep 2001)
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public short compareDocumentPosition(Node other) throws DOMException {

    /**
     * Compares a node with this node with regard to their position in the
     * document.
     * @param other The node to compare against this node.
     * @return Returns how the given node is positioned relatively to this
     *   node.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getTextContent() throws DOMException {

    /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public void setTextContent(String textContent)

    /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isSameNode(Node other) {

    /**
     * Returns whether this node is the same node as the given one.
     * <br>This method provides a way to determine whether two
     * <code>Node</code> references returned by the implementation reference
     * the same object. When two <code>Node</code> references are references
     * to the same object, even if through a proxy, the references may be
     * used completely interchangably, such that all attributes have the
     * same values and calling the same DOM method on either reference
     * always has exactly the same effect.
     * @param other The node to test against.
     * @return Returns <code>true</code> if the nodes are the same,
     *   <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String lookupPrefix(String namespaceURI){

    /**
     *
     * DOM Level 3 - Experimental:
     * Look up the prefix associated to the given namespace URI, starting from this node.
     *
     * @param namespaceURI
     * @return the prefix for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isDefaultNamespace(String namespaceURI){

    /**
     *  DOM Level 3: Experimental
     *  This method checks if the specified <code>namespaceURI</code> is the
     *  default namespace or not.
     *  @param namespaceURI The namespace URI to look for.
     *  @return  <code>true</code> if the specified <code>namespaceURI</code>
     *   is the default namespace, <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String lookupNamespaceURI(String specifiedPrefix) {

    /**
     * DOM Level 3 - Experimental:
     * Look up the namespace URI associated to the given prefix, starting from this node.
     * Use lookupNamespaceURI(null) to lookup the default namespace
     *
     * @param namespaceURI
     * @return th URI for the namespace
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isEqualNode(Node arg) {

    /**
     * Tests whether two nodes are equal.
     * <br>This method tests for equality of nodes, not sameness (i.e.,
     * whether the two nodes are references to the same object) which can be
     * tested with <code>Node.isSameNode</code>. All nodes that are the same
     * will also be equal, though the reverse may not be true.
     * <br>Two nodes are equal if and only if the following conditions are
     * satisfied: The two nodes are of the same type.The following string
     * attributes are equal: <code>nodeName</code>, <code>localName</code>,
     * <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code>
     * , <code>baseURI</code>. This is: they are both <code>null</code>, or
     * they have the same length and are character for character identical.
     * The <code>attributes</code> <code>NamedNodeMaps</code> are equal.
     * This is: they are both <code>null</code>, or they have the same
     * length and for each node that exists in one map there is a node that
     * exists in the other map and is equal, although not necessarily at the
     * same index.The <code>childNodes</code> <code>NodeLists</code> are
     * equal. This is: they are both <code>null</code>, or they have the
     * same length and contain equal nodes at the same index. This is true
     * for <code>Attr</code> nodes as for any other type of node. Note that
     * normalization can affect equality; to avoid this, nodes should be
     * normalized before being compared.
     * <br>For two <code>DocumentType</code> nodes to be equal, the following
     * conditions must also be satisfied: The following string attributes
     * are equal: <code>publicId</code>, <code>systemId</code>,
     * <code>internalSubset</code>.The <code>entities</code>
     * <code>NamedNodeMaps</code> are equal.The <code>notations</code>
     * <code>NamedNodeMaps</code> are equal.
     * <br>On the other hand, the following do not affect equality: the
     * <code>ownerDocument</code> attribute, the <code>specified</code>
     * attribute for <code>Attr</code> nodes, the
     * <code>isWhitespaceInElementContent</code> attribute for
     * <code>Text</code> nodes, as well as any user data or event listeners
     * registered on the nodes.
     * @param arg The node to compare equality with.
     * @param deep If <code>true</code>, recursively compare the subtrees; if
     *   <code>false</code>, compare only the nodes themselves (and its
     *   attributes, if it is an <code>Element</code>).
     * @return If the nodes, and possibly subtrees are equal,
     *   <code>true</code> otherwise <code>false</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public Object getFeature(String feature, String version) {

    /**
     *  This method returns a specialized object which implements the
     * specialized APIs of the specified feature and version. The
     * specialized object may also be obtained by using binding-specific
     * casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations.
     * @param feature The name of the feature requested (case-insensitive).
     * @param version  This is the version number of the feature to test. If
     *   the version is <code>null</code> or the empty string, supporting
     *   any version of the feature will cause the method to return an
     *   object that supports at least one version of the feature.
     * @return  Returns an object which implements the specialized APIs of
     *   the specified feature and version, if any, or <code>null</code> if
     *   there is no object which implements interfaces associated with that
     *   feature. If the <code>DOMObject</code> returned by this method
     *   implements the <code>Node</code> interface, it must delegate to the
     *   primary core <code>Node</code> and not return results inconsistent
     *   with the primary core <code>Node</code> such as attributes,
     *   childNodes, etc.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public Object getUserData(String key) {

    /**
     * Retrieves the object associated to a key on a this node. The object
     * must first have been set to this node by calling
     * <code>setUserData</code> with the same key.
     * @param key The key the object is associated to.
     * @return Returns the <code>DOMObject</code> associated to the given key
     *   on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public Object setUserData(String key,
                              Object data,
                              UserDataHandler handler) {

    /**
     * Associate an object to a key on this node. The object can later be
     * retrieved from this node by calling <code>getUserData</code> with the
     * same key.
     * @param key The key to associate the object to.
     * @param data The object to associate to the given key, or
     *   <code>null</code> to remove any existing association to that key.
     * @param handler The handler to associate to that key, or
     *   <code>null</code>.
     * @return Returns the <code>DOMObject</code> previously associated to
     *   the given key on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public boolean isDerivedFrom( String ns, String localName, int derivationMethod ) {

    /**
     * @see or.gw3c.dom.TypeInfo#isDerivedFrom(String,String,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getTypeNamespace() { return null;}

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public String getTypeName() {return null; }

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
    public int getHandleOfNode()

    /** Non-DOM method, part of the temporary kluge
     * %REVIEW% This would be a pruning problem, but since it will always be
     * added to the root element and we prune on elements, we shouldn't have
     * to worry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTMdefaultNamespaceDeclarationNode.java
public class DOM2DTMdefaultNamespaceDeclarationNode implements Attr,TypeInfo

/** This is a kluge to let us shove a declaration for xml: into the
 * DOM2DTM model.  Basically, it creates a proxy node in DOM space to
 * carry the additional information. This is _NOT_ a full DOM
 * implementation, and shouldn't be one since it sits alongside the
 * DOM rather than becoming part of the DOM model.
 *
 * (This used to be an internal class within DOM2DTM. Moved out because
 * I need to perform an instanceof operation on it to support a temporary
 * workaround in DTMManagerDefault.)
 *
 * %REVIEW% What if the DOM2DTM was built around a DocumentFragment and
 * there isn't a single root element? I think this fails that case...
 *
 * %REVIEW% An alternative solution would be to create the node _only_
 * in DTM space, but given how DOM2DTM is currently written I think
 * this is simplest.
 * */