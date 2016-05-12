_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public TypeInfo getSchemaTypeInfo(){

         /**
         * Method getSchemaTypeInfo.
         * @return TypeInfo
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttributeNS(String namespaceURI, String localName,
                                    boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttributeNode(Attr at, boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttribute(String name, boolean makeId) {

     /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttribute(boolean id){

     /**
     * NON-DOM: set the type of this attribute to be ID type.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public boolean isWhitespaceInElementContent(){

      /**
    * DOM Level 3 WD - Experimental.
     * Returns whether this text node contains whitespace in element content,
     * often abusively called "ignorable whitespace".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public String getWholeText(){

     /**
     * DOM Level 3 WD - Experimental.
     * Returns all text of <code>Text</code> nodes logically-adjacent text
     * nodes to this node, concatenated in document order.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public Text replaceWholeText(String content)

     /**
    * DOM Level 3 WD - Experimental.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setActualEncoding(String value) {

    /**
     * DOM Level 3 WD - Experimental.
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public String getActualEncoding() {

     /**
     * DOM Level 3 WD - Experimental.
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    protected String actualEncoding;

        /**Experimental DOM Level 3 feature: Document actualEncoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public String getDocumentURI(){

        /**
     * DOM Level 3 WD - Experimental.
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setDocumentURI(String documentURI){

    /**
     * DOM Level 3 WD - Experimental.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    protected String fDocumentURI;

    /**Experimental DOM Level 3 feature: documentURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public DOMConfiguration getDomConfig(){

    /**
     *  The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void normalizeDocument(){

    /**
     *  DOM Level 3 WD - Experimental
     *  Normalize document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public Node renameNode(Node n,
                           String namespaceURI,
                           String name)

        /**
     * DOM Level 3 WD - Experimental.
     * Renaming node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
     *
     * @param arg The node to compare equality with.
     * @return If the nodes, and possibly subtrees are equal,
     *   <code>true</code> otherwise <code>false</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setVersion(String version)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getVersion()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setStrictErrorChecking(boolean strictErrorChecking)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC @param strictErrorChecking
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean getStrictErrorChecking()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setStandalone(boolean standalone)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC @param standalone
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean getStandalone()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setInputEncoding(String encoding)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param encoding
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getInputEncoding()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node adoptNode(Node source) throws DOMException

  /**
   * NEEDSDOC Method adoptNode
   *
   *
   * NEEDSDOC @param source
   *
   * NEEDSDOC (adoptNode) @return
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Text splitText(int offset) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Offset into text to split
   *
   * @return null, unimplemented
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void replaceData(int offset, int count, String arg)

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to replace.
   * @param count The length of the substring to replace.
   * @param arg substring to replace with
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void deleteData(int offset, int count) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to delete.
   * @param count The length of the substring to delete.
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void insertData(int offset, String arg) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to insert.
   * @param arg The (sub)string to insert.
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void appendData(String arg) throws DOMException

  /**
   * Unimplemented.
   *
   * @param arg String data to append
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String substringData(int offset, int count) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to extract.
   * @param count The length of the substring to extract.
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setData(String data) throws DOMException

  /**
   * Set Node data
   *
   *
   * @param data data to set for this node
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element getElementById(String elementId)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param elementId ID of the element to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr createAttributeNS(String namespaceURI, String qualifiedName)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param namespaceURI Namespace URI of the attribute
   * @param qualifiedName Qualified name of the attribute
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element createElementNS(String namespaceURI, String qualifiedName)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param namespaceURI Namespace URI for the element
   * @param qualifiedName Qualified name of the element
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node importNode(Node importedNode, boolean deep) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param importedNode The node to import.
   * @param deep If <code>true</code>, recursively import the subtree under
   *   the specified node; if <code>false</code>, import only the node
   *   itself, as explained above. This has no effect on <code>Attr</code>
   *   , <code>EntityReference</code>, and <code>Notation</code> nodes.
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public EntityReference createEntityReference(String name)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param name Entity Reference name
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr createAttribute(String name) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param name Attribute name
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public ProcessingInstruction createProcessingInstruction(
          String target, String data) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param target Target for Processing instruction
   * @param data Data for Processing instruction
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public CDATASection createCDATASection(String data) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param data Data for CDATA section
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Comment createComment(String data)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param data Data for comment
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Text createTextNode(String data)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param data Data for text node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public DocumentFragment createDocumentFragment()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element createElement(String tagName) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param tagName Element tag name
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element getDocumentElement()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public DOMImplementation getImplementation()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public DocumentType getDoctype()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getLocalName()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setPrefix(String prefix) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param prefix Prefix to set for this node
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getPrefix()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getNamespaceURI()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean isSupported(String feature, String version)

  /**
   * Tests whether the DOM implementation implements a specific feature and
   * that feature is supported by this node.
   * @param feature The name of the feature to test. This is the same name
   *   which can be passed to the method <code>hasFeature</code> on
   *   <code>DOMImplementation</code>.
   * @param version This is the version number of the feature to test. In
   *   Level 2, version 1, this is the string "2.0". If the version is not
   *   specified, supporting any version of the feature will cause the
   *   method to return <code>true</code>.
   *
   * @return Returns <code>false</code>
   * @since DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node removeChild(Node oldChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param oldChild Child to be removed
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node replaceChild(Node newChild, Node oldChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param newChild Replace existing child with this one
   * @param oldChild Existing child to be replaced
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node insertBefore(Node newChild, Node refChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param newChild New child node to insert
   * @param refChild Insert in front of this child
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NamedNodeMap getAttributes()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean getSpecified()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return False
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element getOwnerElement()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  // public String getName()

  /**
   *  Returns the name of this attribute.
   *
   * @return the name of this attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setValue(String value) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param value Value to set this node to
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  // public String getValue ()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   *
   * NEEDSDOC @param value
   * @return value Node value
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setNodeValue(String nodeValue) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param nodeValue Value to set this node to
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getNodeValue() throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node cloneNode(boolean deep)

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param deep Flag indicating whether to clone deep (clone member variables)
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getPreviousSibling()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getAttributeNS(String namespaceURI, String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to get
   * @param localName Local part of qualified name of attribute node to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setAttributeNS(
          String namespaceURI, String qualifiedName, String value)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to set
   * @param qualifiedName qualified name of attribute
   * @param value value of attribute
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void removeAttributeNS(String namespaceURI, String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to remove
   * @param localName Local part of qualified name of attribute node to remove
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr getAttributeNodeNS(String namespaceURI, String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to get
   * @param localName Local part of qualified name of attribute node to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr setAttributeNodeNS(Attr newAttr) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param newAttr Attribute to set
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NodeList getElementsByTagNameNS(String namespaceURI,
                                         String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of the element
   * @param localName Local part of qualified name of the element
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasAttributes()

  /**
   * Unimplemented. Introduced in DOM Level 2.
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getAttribute(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Name of attribute to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setAttribute(String name, String value) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Name of attribute to set
   * @param value Value of attribute
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void removeAttribute(String name) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Attribute node name to remove from list of attributes
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr getAttributeNode(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   *
   * @param name Attribute node name
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasAttributeNS(String name, String x)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   *
   * @param name
   * @param x
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasAttribute(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   *
   * @param name Name of an attribute
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr setAttributeNode(Attr newAttr) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param newAttr Attribute node to be added to this node's list of attributes
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr removeAttributeNode(Attr oldAttr) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param oldAttr Attribute to be removed from this node's list of attributes
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NodeList getElementsByTagName(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Name of the element
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void normalize()

  /** Unimplemented. See org.w3c.dom.Node */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getNodeName()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getTagName()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Document getOwnerDocument()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node item(int index)

  /**
   * Unimplemented. See org.w3c.dom.NodeList
   *
   * @param index index of a child of this node in its list of children
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public int getLength()

  /**
   * Unimplemented. See org.w3c.dom.NodeList
   *
   * @return 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getNextSibling()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getLastChild()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getFirstChild()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NodeList getChildNodes()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getParentNode()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public short getNodeType()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasChildNodes()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node appendChild(Node newChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param newChild New node to append to the list of this node's children
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void error(String msg, Object[] args)

  /**
   * Throw an error.
   *
   * @param msg Message Key for the error
   * @param args Array of arguments to be used in the error message
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void error(String msg)

  /**
   * Throw an error.
   *
   * @param msg Message Key for the error
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public UnImplNode(){}

  /**
   * Constructor UnImplNode
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
public class UnImplNode implements Node, Element, NodeList, Document

/**
 * <meta name="usage" content="internal"/>
 * To be subclassed by classes that wish to fake being nodes.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public TypeInfo getSchemaTypeInfo(){

         /**
         * Method getSchemaTypeInfo.
         * @return TypeInfo
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttributeNS(String namespaceURI, String localName,
                                    boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttributeNode(Attr at, boolean makeId) {

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttribute(String name, boolean makeId) {

     /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setIdAttribute(boolean id){

     /**
     * NON-DOM: set the type of this attribute to be ID type.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public boolean isWhitespaceInElementContent(){

      /**
    * DOM Level 3 WD - Experimental.
     * Returns whether this text node contains whitespace in element content,
     * often abusively called "ignorable whitespace".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public String getWholeText(){

     /**
     * DOM Level 3 WD - Experimental.
     * Returns all text of <code>Text</code> nodes logically-adjacent text
     * nodes to this node, concatenated in document order.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public Text replaceWholeText(String content)

     /**
    * DOM Level 3 WD - Experimental.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setActualEncoding(String value) {

    /**
     * DOM Level 3 WD - Experimental.
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public String getActualEncoding() {

     /**
     * DOM Level 3 WD - Experimental.
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    protected String actualEncoding;

        /**Experimental DOM Level 3 feature: Document actualEncoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public String getDocumentURI(){

        /**
     * DOM Level 3 WD - Experimental.
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void setDocumentURI(String documentURI){

    /**
     * DOM Level 3 WD - Experimental.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    protected String fDocumentURI;

    /**Experimental DOM Level 3 feature: documentURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public DOMConfiguration getDomConfig(){

    /**
     *  The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public void normalizeDocument(){

    /**
     *  DOM Level 3 WD - Experimental
     *  Normalize document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
    public Node renameNode(Node n,
                           String namespaceURI,
                           String name)

        /**
     * DOM Level 3 WD - Experimental.
     * Renaming node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
     *
     * @param arg The node to compare equality with.
     * @return If the nodes, and possibly subtrees are equal,
     *   <code>true</code> otherwise <code>false</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setVersion(String version)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getVersion()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setStrictErrorChecking(boolean strictErrorChecking)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC @param strictErrorChecking
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean getStrictErrorChecking()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setStandalone(boolean standalone)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC @param standalone
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean getStandalone()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setInputEncoding(String encoding)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param encoding
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getInputEncoding()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node adoptNode(Node source) throws DOMException

  /**
   * NEEDSDOC Method adoptNode
   *
   *
   * NEEDSDOC @param source
   *
   * NEEDSDOC (adoptNode) @return
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Text splitText(int offset) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Offset into text to split
   *
   * @return null, unimplemented
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void replaceData(int offset, int count, String arg)

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to replace.
   * @param count The length of the substring to replace.
   * @param arg substring to replace with
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void deleteData(int offset, int count) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to delete.
   * @param count The length of the substring to delete.
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void insertData(int offset, String arg) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to insert.
   * @param arg The (sub)string to insert.
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void appendData(String arg) throws DOMException

  /**
   * Unimplemented.
   *
   * @param arg String data to append
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String substringData(int offset, int count) throws DOMException

  /**
   * Unimplemented.
   *
   * @param offset Start offset of substring to extract.
   * @param count The length of the substring to extract.
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setData(String data) throws DOMException

  /**
   * Set Node data
   *
   *
   * @param data data to set for this node
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element getElementById(String elementId)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param elementId ID of the element to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr createAttributeNS(String namespaceURI, String qualifiedName)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param namespaceURI Namespace URI of the attribute
   * @param qualifiedName Qualified name of the attribute
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element createElementNS(String namespaceURI, String qualifiedName)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param namespaceURI Namespace URI for the element
   * @param qualifiedName Qualified name of the element
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node importNode(Node importedNode, boolean deep) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param importedNode The node to import.
   * @param deep If <code>true</code>, recursively import the subtree under
   *   the specified node; if <code>false</code>, import only the node
   *   itself, as explained above. This has no effect on <code>Attr</code>
   *   , <code>EntityReference</code>, and <code>Notation</code> nodes.
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public EntityReference createEntityReference(String name)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param name Entity Reference name
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr createAttribute(String name) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param name Attribute name
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public ProcessingInstruction createProcessingInstruction(
          String target, String data) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param target Target for Processing instruction
   * @param data Data for Processing instruction
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public CDATASection createCDATASection(String data) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param data Data for CDATA section
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Comment createComment(String data)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param data Data for comment
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Text createTextNode(String data)

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param data Data for text node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public DocumentFragment createDocumentFragment()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element createElement(String tagName) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @param tagName Element tag name
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element getDocumentElement()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public DOMImplementation getImplementation()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public DocumentType getDoctype()

  /**
   * Unimplemented. See org.w3c.dom.Document
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getLocalName()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setPrefix(String prefix) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param prefix Prefix to set for this node
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getPrefix()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getNamespaceURI()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean isSupported(String feature, String version)

  /**
   * Tests whether the DOM implementation implements a specific feature and
   * that feature is supported by this node.
   * @param feature The name of the feature to test. This is the same name
   *   which can be passed to the method <code>hasFeature</code> on
   *   <code>DOMImplementation</code>.
   * @param version This is the version number of the feature to test. In
   *   Level 2, version 1, this is the string "2.0". If the version is not
   *   specified, supporting any version of the feature will cause the
   *   method to return <code>true</code>.
   *
   * @return Returns <code>false</code>
   * @since DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node removeChild(Node oldChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param oldChild Child to be removed
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node replaceChild(Node newChild, Node oldChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param newChild Replace existing child with this one
   * @param oldChild Existing child to be replaced
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node insertBefore(Node newChild, Node refChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param newChild New child node to insert
   * @param refChild Insert in front of this child
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NamedNodeMap getAttributes()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean getSpecified()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return False
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Element getOwnerElement()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  // public String getName()

  /**
   *  Returns the name of this attribute.
   *
   * @return the name of this attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setValue(String value) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param value Value to set this node to
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  // public String getValue ()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   *
   * NEEDSDOC @param value
   * @return value Node value
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setNodeValue(String nodeValue) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param nodeValue Value to set this node to
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getNodeValue() throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node cloneNode(boolean deep)

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param deep Flag indicating whether to clone deep (clone member variables)
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getPreviousSibling()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getAttributeNS(String namespaceURI, String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to get
   * @param localName Local part of qualified name of attribute node to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setAttributeNS(
          String namespaceURI, String qualifiedName, String value)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to set
   * @param qualifiedName qualified name of attribute
   * @param value value of attribute
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void removeAttributeNS(String namespaceURI, String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to remove
   * @param localName Local part of qualified name of attribute node to remove
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr getAttributeNodeNS(String namespaceURI, String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of attribute node to get
   * @param localName Local part of qualified name of attribute node to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr setAttributeNodeNS(Attr newAttr) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param newAttr Attribute to set
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NodeList getElementsByTagNameNS(String namespaceURI,
                                         String localName)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param namespaceURI Namespace URI of the element
   * @param localName Local part of qualified name of the element
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasAttributes()

  /**
   * Unimplemented. Introduced in DOM Level 2.
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getAttribute(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Name of attribute to get
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void setAttribute(String name, String value) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Name of attribute to set
   * @param value Value of attribute
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void removeAttribute(String name) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Attribute node name to remove from list of attributes
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr getAttributeNode(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   *
   * @param name Attribute node name
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasAttributeNS(String name, String x)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   *
   * @param name
   * @param x
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasAttribute(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   *
   * @param name Name of an attribute
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr setAttributeNode(Attr newAttr) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param newAttr Attribute node to be added to this node's list of attributes
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Attr removeAttributeNode(Attr oldAttr) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param oldAttr Attribute to be removed from this node's list of attributes
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NodeList getElementsByTagName(String name)

  /**
   * Unimplemented. See org.w3c.dom.Element
   *
   * @param name Name of the element
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void normalize()

  /** Unimplemented. See org.w3c.dom.Node */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getNodeName()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public String getTagName()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Document getOwnerDocument()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node item(int index)

  /**
   * Unimplemented. See org.w3c.dom.NodeList
   *
   * @param index index of a child of this node in its list of children
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public int getLength()

  /**
   * Unimplemented. See org.w3c.dom.NodeList
   *
   * @return 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getNextSibling()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getLastChild()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getFirstChild()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public NodeList getChildNodes()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node getParentNode()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public short getNodeType()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public boolean hasChildNodes()

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public Node appendChild(Node newChild) throws DOMException

  /**
   * Unimplemented. See org.w3c.dom.Node
   *
   * @param newChild New node to append to the list of this node's children
   *
   * @return null
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void error(String msg, Object[] args)

  /**
   * Throw an error.
   *
   * @param msg Message Key for the error
   * @param args Array of arguments to be used in the error message
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public void error(String msg)

  /**
   * Throw an error.
   *
   * @param msg Message Key for the error
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
  public UnImplNode(){}

  /**
   * Constructor UnImplNode
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/UnImplNode.java
public class UnImplNode implements Node, Element, NodeList, Document

/**
 * <meta name="usage" content="internal"/>
 * To be subclassed by classes that wish to fake being nodes.
 */
