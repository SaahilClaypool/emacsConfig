_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public boolean isXIncludeAware() {

    /**
     * <p>Get the XInclude processing mode for this parser.</p>
     *
     * @return
     *      the return value of
     *      the {@link DocumentBuilderFactory#isXIncludeAware()}
     *      when this parser was created from factory.
     *
     * @throws UnsupportedOperationException When implementation does not
     *   override this method
     *
     * @since 1.5
     *
     * @see DocumentBuilderFactory#setXIncludeAware(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public Schema getSchema() {

    /** <p>Get a reference to the the {@link Schema} being used by
     * the XML processor.</p>
     *
     * <p>If no schema is being used, <code>null</code> is returned.</p>
     *
     * @return {@link Schema} being used or <code>null</code>
     *  if none in use
     *
     * @throws UnsupportedOperationException When implementation does not
     *   override this method
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    /*

    /** <p>Get current state of canonicalization.</p>
     *
     * @return current state canonicalization control
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public abstract DOMImplementation getDOMImplementation();

    /**
     * Obtain an instance of a {@link DOMImplementation} object.
     *
     * @return A new instance of a <code>DOMImplementation</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public abstract Document newDocument();

    /**
     * Obtain a new instance of a DOM {@link Document} object
     * to build a DOM tree with.
     *
     * @return A new instance of a DOM Document object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public abstract void setErrorHandler(ErrorHandler eh);

    /**
     * Specify the {@link ErrorHandler} to be used by the parser.
     * Setting this to <code>null</code> will result in the underlying
     * implementation using it's own default implementation and
     * behavior.
     *
     * @param eh The <code>ErrorHandler</code> to be used by the parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public abstract void setEntityResolver(EntityResolver er);

    /**
     * Specify the {@link EntityResolver} to be used to resolve
     * entities present in the XML document to be parsed. Setting
     * this to <code>null</code> will result in the underlying
     * implementation using it's own default implementation and
     * behavior.
     *
     * @param er The <code>EntityResolver</code> to be used to resolve entities
     *           present in the XML document to be parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public abstract boolean isValidating();

    /**
     * Indicates whether or not this parser is configured to
     * validate XML documents.
     *
     * @return true if this parser is configured to validate
     *         XML documents; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public abstract boolean isNamespaceAware();

    /**
     * Indicates whether or not this parser is configured to
     * understand namespaces.
     *
     * @return true if this parser is configured to understand
     *         namespaces; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public abstract Document parse(InputSource is)

    /**
     * Parse the content of the given input source as an XML document
     * and return a new DOM {@link Document} object.
     * An <code>IllegalArgumentException</code> is thrown if the
     * <code>InputSource</code> is <code>null</code> null.
     *
     * @param is InputSource containing the content to be parsed.
     *
     * @return A new DOM Document object.
     *
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any parse errors occur.
     * @throws IllegalArgumentException When <code>is</code> is <code>null</code>
     *
     * @see org.xml.sax.DocumentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public Document parse(File f) throws SAXException, IOException {

    /**
     * Parse the content of the given file as an XML document
     * and return a new DOM {@link Document} object.
     * An <code>IllegalArgumentException</code> is thrown if the
     * <code>File</code> is <code>null</code> null.
     *
     * @param f The file containing the XML to parse.
     *
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any parse errors occur.
     * @throws IllegalArgumentException When <code>f</code> is <code>null</code>
     *
     * @see org.xml.sax.DocumentHandler
     * @return A new DOM Document object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public Document parse(String uri)

    /**
     * Parse the content of the given URI as an XML document
     * and return a new DOM {@link Document} object.
     * An <code>IllegalArgumentException</code> is thrown if the
     * URI is <code>null</code> null.
     *
     * @param uri The location of the content to be parsed.
     *
     * @return A new DOM Document object.
     *
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any parse errors occur.
     * @throws IllegalArgumentException When <code>uri</code> is <code>null</code>
     *
     * @see org.xml.sax.DocumentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public Document parse(InputStream is, String systemId)

    /**
     * Parse the content of the given <code>InputStream</code> as an
     * XML document and return a new DOM {@link Document} object.
     * An <code>IllegalArgumentException</code> is thrown if the
     * <code>InputStream</code> is null.
     *
     * @param is InputStream containing the content to be parsed.
     * @param systemId Provide a base for resolving relative URIs.
     *
     * @return A new DOM Document object.
     *
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any parse errors occur.
     * @throws IllegalArgumentException When <code>is</code> is <code>null</code>
     *
     * @see org.xml.sax.DocumentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public Document parse(InputStream is)

    /**
     * Parse the content of the given <code>InputStream</code> as an XML
     * document and return a new DOM {@link Document} object.
     * An <code>IllegalArgumentException</code> is thrown if the
     * <code>InputStream</code> is null.
     *
     * @param is InputStream containing the content to be parsed.
     *
     * @return <code>Document</code> result of parsing the
     *  <code>InputStream</code>
     *
     * @throws IOException If any IO errors occur.
     * @throws SAXException If any parse errors occur.
     * @throws IllegalArgumentException When <code>is</code> is <code>null</code>
     *
     * @see org.xml.sax.DocumentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    public void reset() {

    /**
     * <p>Reset this <code>DocumentBuilder</code> to its original configuration.</p>
     *
     * <p><code>DocumentBuilder</code> is reset to the same state as when it was created with
     * {@link DocumentBuilderFactory#newDocumentBuilder()}.
     * <code>reset()</code> is designed to allow the reuse of existing <code>DocumentBuilder</code>s
     * thus saving resources associated with the creation of new <code>DocumentBuilder</code>s.</p>
     *
     * <p>The reset <code>DocumentBuilder</code> is not guaranteed to have the same {@link EntityResolver} or {@link ErrorHandler}
     * <code>Object</code>s, e.g. {@link Object#equals(Object obj)}.  It is guaranteed to have a functionally equal
     * <code>EntityResolver</code> and <code>ErrorHandler</code>.</p>
     *
     * @throws UnsupportedOperationException When implementation does not
     *   override this method.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
    protected DocumentBuilder () {

    /** Protected constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/DocumentBuilder.java
public abstract class DocumentBuilder {

/**
 * Defines the API to obtain DOM Document instances from an XML
 * document. Using this class, an application programmer can obtain a
 * {@link Document} from XML.<p>
 *
 * An instance of this class can be obtained from the
 * {@link DocumentBuilderFactory#newDocumentBuilder()} method. Once
 * an instance of this class is obtained, XML can be parsed from a
 * variety of input sources. These input sources are InputStreams,
 * Files, URLs, and SAX InputSources.<p>
 *
 * Note that this class reuses several classes from the SAX API. This
 * does not require that the implementor of the underlying DOM
 * implementation use a SAX parser to parse XML document into a
 * <code>Document</code>. It merely requires that the implementation
 * communicate with the application using these existing APIs.
 *
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 */
