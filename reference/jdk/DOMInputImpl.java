_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setCertifiedText(boolean certifiedText){

    /**
      *  If set to true, assume that the input is certified (see section 2.13
      * in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when
      * parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>].
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public boolean getCertifiedText(){

    /**
      *  If set to true, assume that the input is certified (see section 2.13
      * in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when
      * parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>].
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setBaseURI(String baseURI){

    /**
     *  The base URI to be used (see section 5.1.4 in ) for resolving relative
     * URIs to absolute URIs. If the baseURI is itself a relative URI, the
     * behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getBaseURI(){

    /**
     *  The base URI to be used (see section 5.1.4 in ) for resolving relative
     * URIs to absolute URIs. If the baseURI is itself a relative URI, the
     * behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setSystemId(String systemId){

    /**
     * The system identifier, a URI reference , for this input source. The
     * system identifier is optional if there is a byte stream or a
     * character stream, but it is still useful to provide one, since the
     * application can use it to resolve relative URIs and can include it in
     * error messages and warnings (the parser will attempt to fetch the
     * ressource identifier by the URI reference only if there is no byte
     * stream or character stream specified).
     * <br>If the application knows the character encoding of the object
     * pointed to by the system identifier, it can register the encoding by
     * setting the encoding attribute.
     * <br>If the system ID is a relative URI reference (see section 5 in ),
     * the behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getSystemId(){

    /**
     * The system identifier, a URI reference , for this input source. The
     * system identifier is optional if there is a byte stream or a
     * character stream, but it is still useful to provide one, since the
     * application can use it to resolve relative URIs and can include it in
     * error messages and warnings (the parser will attempt to fetch the
     * ressource identifier by the URI reference only if there is no byte
     * stream or character stream specified).
     * <br>If the application knows the character encoding of the object
     * pointed to by the system identifier, it can register the encoding by
     * setting the encoding attribute.
     * <br>If the system ID is a relative URI reference (see section 5 in ),
     * the behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setPublicId(String publicId){

    /**
     * The public identifier for this input source. The public identifier is
     * always optional: if the application writer includes one, it will be
     * provided as part of the location information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getPublicId(){

    /**
     * The public identifier for this input source. The public identifier is
     * always optional: if the application writer includes one, it will be
     * provided as part of the location information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setEncoding(String encoding){

    /**
     *  The character encoding, if known. The encoding must be a string
     * acceptable for an XML encoding declaration ( section 4.3.3 "Character
     * Encoding in Entities").
     * <br>This attribute has no effect when the application provides a
     * character stream. For other sources of input, an encoding specified
     * by means of this attribute will override any encoding specified in
     * the XML claration or the Text Declaration, or an encoding obtained
     * from a higher level protocol, such as HTTP .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getEncoding(){

    /**
     *  The character encoding, if known. The encoding must be a string
     * acceptable for an XML encoding declaration ( section 4.3.3 "Character
     * Encoding in Entities").
     * <br>This attribute has no effect when the application provides a
     * character stream. For other sources of input, an encoding specified
     * by means of this attribute will override any encoding specified in
     * the XML claration or the Text Declaration, or an encoding obtained
     * from a higher level protocol, such as HTTP .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public void setStringData(String stringData){

   /**
     * A string attribute that represents a sequence of 16 bit units (utf-16
     * encoded characters).
     * <br>If string data is available in the input source, the parser will
     * ignore the character stream and the byte stream and will not attempt
     * to open a URI connection to the system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getStringData(){

    /**
     * A string attribute that represents a sequence of 16 bit units (utf-16
     * encoded characters).
     * <br>If string data is available in the input source, the parser will
     * ignore the character stream and the byte stream and will not attempt
     * to open a URI connection to the system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public void setCharacterStream(Reader characterStream){

    /**
     *  An attribute of a language-binding dependent type that represents a
     * stream of 16-bit units. Application must encode the stream using
     * UTF-16 (defined in  and Amendment 1 of ).
     * <br>If a character stream is specified, the parser will ignore any byte
     * stream and will not attempt to open a URI connection to the system
     * identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public Reader getCharacterStream(){

    /**
     *  An attribute of a language-binding dependent type that represents a
     * stream of 16-bit units. Application must encode the stream using
     * UTF-16 (defined in  and Amendment 1 of ).
     * <br>If a character stream is specified, the parser will ignore any byte
     * stream and will not attempt to open a URI connection to the system
     * identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public void setByteStream(InputStream byteStream){

    /**
     * An attribute of a language-binding dependent type that represents a
     * stream of bytes.
     * <br>The parser will ignore this if there is also a character stream
     * specified, but it will use a byte stream in preference to opening a
     * URI connection itself.
     * <br>If the application knows the character encoding of the byte stream,
     * it should set the encoding property. Setting the encoding in this way
     * will override any encoding specified in the XML declaration itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public InputStream getByteStream(){

   /**
     * An attribute of a language-binding dependent type that represents a
     * stream of bytes.
     * <br>The parser will ignore this if there is also a character stream
     * specified, but it will use a byte stream in preference to opening a
     * URI connection itself.
     * <br>If the application knows the character encoding of the byte stream,
     * it should set the encoding property. Setting the encoding in this way
     * will override any encoding specified in the XML declaration itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId, String data,
                          String encoding) {

   /**
     * Constructs an input source from a String.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param data                 The String Data.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId, Reader charStream,
                          String encoding) {

   /**
     * Constructs an input source from a character stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param charStream   The character stream.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId, InputStream byteStream,
                          String encoding) {

    /**
     * Constructs an input source from a byte stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param byteStream   The byte stream.
     * @param encoding     The encoding of the byte stream, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId) {

   /**
     * Constructs an input source from just the public and system
     * identifiers, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public DOMInputImpl() {}

   /**
     * Default Constructor, constructs an input source
     *
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
// REVISIT:

/**
 * This Class <code>DOMInputImpl</code> represents a single input source for an XML entity.
 * <p> This Class allows an application to encapsulate information about
 * an input source in a single object, which may include a public
 * identifier, a system identifier, a byte stream (possibly with a specified
 * encoding), and/or a character stream.
 * <p> The exact definitions of a byte stream and a character stream are
 * binding dependent.
 * <p> There are two places that the application will deliver this input
 * source to the parser: as the argument to the <code>parse</code> method,
 * or as the return value of the <code>DOMResourceResolver.resolveEntity</code>
 *  method.
 * <p> The <code>DOMParser</code> will use the <code>LSInput</code>
 * object to determine how to read XML input. If there is a character stream
 * available, the parser will read that stream directly; if not, the parser
 * will use a byte stream, if available; if neither a character stream nor a
 * byte stream is available, the parser will attempt to open a URI
 * connection to the resource identified by the system identifier.
 * <p> An <code>LSInput</code> object belongs to the application: the
 * parser shall never modify it in any way (it may modify a copy if
 * necessary).  Eventhough all attributes in this interface are writable the
 * DOM implementation is expected to never mutate a LSInput.
 * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load
and Save Specification</a>.
 *
 * @xerces.internal
 *
 * @author Gopal Sharma, SUN Microsystems Inc.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setCertifiedText(boolean certifiedText){

    /**
      *  If set to true, assume that the input is certified (see section 2.13
      * in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when
      * parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>].
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public boolean getCertifiedText(){

    /**
      *  If set to true, assume that the input is certified (see section 2.13
      * in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when
      * parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>].
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setBaseURI(String baseURI){

    /**
     *  The base URI to be used (see section 5.1.4 in ) for resolving relative
     * URIs to absolute URIs. If the baseURI is itself a relative URI, the
     * behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getBaseURI(){

    /**
     *  The base URI to be used (see section 5.1.4 in ) for resolving relative
     * URIs to absolute URIs. If the baseURI is itself a relative URI, the
     * behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setSystemId(String systemId){

    /**
     * The system identifier, a URI reference , for this input source. The
     * system identifier is optional if there is a byte stream or a
     * character stream, but it is still useful to provide one, since the
     * application can use it to resolve relative URIs and can include it in
     * error messages and warnings (the parser will attempt to fetch the
     * ressource identifier by the URI reference only if there is no byte
     * stream or character stream specified).
     * <br>If the application knows the character encoding of the object
     * pointed to by the system identifier, it can register the encoding by
     * setting the encoding attribute.
     * <br>If the system ID is a relative URI reference (see section 5 in ),
     * the behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getSystemId(){

    /**
     * The system identifier, a URI reference , for this input source. The
     * system identifier is optional if there is a byte stream or a
     * character stream, but it is still useful to provide one, since the
     * application can use it to resolve relative URIs and can include it in
     * error messages and warnings (the parser will attempt to fetch the
     * ressource identifier by the URI reference only if there is no byte
     * stream or character stream specified).
     * <br>If the application knows the character encoding of the object
     * pointed to by the system identifier, it can register the encoding by
     * setting the encoding attribute.
     * <br>If the system ID is a relative URI reference (see section 5 in ),
     * the behavior is implementation dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setPublicId(String publicId){

    /**
     * The public identifier for this input source. The public identifier is
     * always optional: if the application writer includes one, it will be
     * provided as part of the location information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getPublicId(){

    /**
     * The public identifier for this input source. The public identifier is
     * always optional: if the application writer includes one, it will be
     * provided as part of the location information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public void setEncoding(String encoding){

    /**
     *  The character encoding, if known. The encoding must be a string
     * acceptable for an XML encoding declaration ( section 4.3.3 "Character
     * Encoding in Entities").
     * <br>This attribute has no effect when the application provides a
     * character stream. For other sources of input, an encoding specified
     * by means of this attribute will override any encoding specified in
     * the XML claration or the Text Declaration, or an encoding obtained
     * from a higher level protocol, such as HTTP .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getEncoding(){

    /**
     *  The character encoding, if known. The encoding must be a string
     * acceptable for an XML encoding declaration ( section 4.3.3 "Character
     * Encoding in Entities").
     * <br>This attribute has no effect when the application provides a
     * character stream. For other sources of input, an encoding specified
     * by means of this attribute will override any encoding specified in
     * the XML claration or the Text Declaration, or an encoding obtained
     * from a higher level protocol, such as HTTP .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public void setStringData(String stringData){

   /**
     * A string attribute that represents a sequence of 16 bit units (utf-16
     * encoded characters).
     * <br>If string data is available in the input source, the parser will
     * ignore the character stream and the byte stream and will not attempt
     * to open a URI connection to the system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public String getStringData(){

    /**
     * A string attribute that represents a sequence of 16 bit units (utf-16
     * encoded characters).
     * <br>If string data is available in the input source, the parser will
     * ignore the character stream and the byte stream and will not attempt
     * to open a URI connection to the system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public void setCharacterStream(Reader characterStream){

    /**
     *  An attribute of a language-binding dependent type that represents a
     * stream of 16-bit units. Application must encode the stream using
     * UTF-16 (defined in  and Amendment 1 of ).
     * <br>If a character stream is specified, the parser will ignore any byte
     * stream and will not attempt to open a URI connection to the system
     * identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public Reader getCharacterStream(){

    /**
     *  An attribute of a language-binding dependent type that represents a
     * stream of 16-bit units. Application must encode the stream using
     * UTF-16 (defined in  and Amendment 1 of ).
     * <br>If a character stream is specified, the parser will ignore any byte
     * stream and will not attempt to open a URI connection to the system
     * identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public void setByteStream(InputStream byteStream){

    /**
     * An attribute of a language-binding dependent type that represents a
     * stream of bytes.
     * <br>The parser will ignore this if there is also a character stream
     * specified, but it will use a byte stream in preference to opening a
     * URI connection itself.
     * <br>If the application knows the character encoding of the byte stream,
     * it should set the encoding property. Setting the encoding in this way
     * will override any encoding specified in the XML declaration itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public InputStream getByteStream(){

   /**
     * An attribute of a language-binding dependent type that represents a
     * stream of bytes.
     * <br>The parser will ignore this if there is also a character stream
     * specified, but it will use a byte stream in preference to opening a
     * URI connection itself.
     * <br>If the application knows the character encoding of the byte stream,
     * it should set the encoding property. Setting the encoding in this way
     * will override any encoding specified in the XML declaration itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId, String data,
                          String encoding) {

   /**
     * Constructs an input source from a String.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param data                 The String Data.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId, Reader charStream,
                          String encoding) {

   /**
     * Constructs an input source from a character stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param charStream   The character stream.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId, InputStream byteStream,
                          String encoding) {

    /**
     * Constructs an input source from a byte stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param byteStream   The byte stream.
     * @param encoding     The encoding of the byte stream, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
    public DOMInputImpl(String publicId, String systemId,
                          String baseSystemId) {

   /**
     * Constructs an input source from just the public and system
     * identifiers, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
     public DOMInputImpl() {}

   /**
     * Default Constructor, constructs an input source
     *
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMInputImpl.java
// REVISIT:

/**
 * This Class <code>DOMInputImpl</code> represents a single input source for an XML entity.
 * <p> This Class allows an application to encapsulate information about
 * an input source in a single object, which may include a public
 * identifier, a system identifier, a byte stream (possibly with a specified
 * encoding), and/or a character stream.
 * <p> The exact definitions of a byte stream and a character stream are
 * binding dependent.
 * <p> There are two places that the application will deliver this input
 * source to the parser: as the argument to the <code>parse</code> method,
 * or as the return value of the <code>DOMResourceResolver.resolveEntity</code>
 *  method.
 * <p> The <code>DOMParser</code> will use the <code>LSInput</code>
 * object to determine how to read XML input. If there is a character stream
 * available, the parser will read that stream directly; if not, the parser
 * will use a byte stream, if available; if neither a character stream nor a
 * byte stream is available, the parser will attempt to open a URI
 * connection to the resource identified by the system identifier.
 * <p> An <code>LSInput</code> object belongs to the application: the
 * parser shall never modify it in any way (it may modify a copy if
 * necessary).  Eventhough all attributes in this interface are writable the
 * DOM implementation is expected to never mutate a LSInput.
 * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load
and Save Specification</a>.
 *
 * @xerces.internal
 *
 * @author Gopal Sharma, SUN Microsystems Inc.
 */