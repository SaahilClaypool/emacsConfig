_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public Grammar parseGrammar(String type, XMLInputSource
                is) throws XNIException, IOException {

    /**
     * Parse a grammar from a location identified by an
     * XMLInputSource.
     * This method also adds this grammar to the XMLGrammarPool
     *
     * @param type The type of the grammar to be constructed
     * @param is The XMLInputSource containing this grammar's
     * information
     * <strong>If a URI is included in the systemId field, the parser will not expand this URI or make it
     * available to the EntityResolver</strong>
     * @return The newly created <code>Grammar</code>.
     * @exception XNIException thrown on an error in grammar
     * construction
     * @exception IOException thrown if an error is encountered
     * in reading the file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public Grammar parseGrammar(String type, String uri)

    /**
     * Parse a grammar from a location identified by an URI.
     * This method also adds this grammar to the XMLGrammarPool
     *
     * @param type The type of the grammar to be constructed
     * @param uri The location of the grammar to be constructed.
     * <strong>The parser will not expand this URI or make it
     * available to the EntityResolver</strong>
     * @return The newly created <code>Grammar</code>.
     * @exception XNIException thrown on an error in grammar
     * construction
     * @exception IOException thrown if an error is encountered
     * in reading the file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration(SymbolTable symbolTable,
                                       XMLGrammarPool grammarPool,
                                       XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration(SymbolTable symbolTable,
                                       XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
public class XMLGrammarCachingConfiguration

/**
 * <p> This configuration provides a generic way of using
 * Xerces's grammar caching facilities.  It extends the
 * XIncludeAwareParserConfiguration and thus may validate documents
 * according to XML schemas or DTD's.  It also allows the user to
 * preparse a grammar, and to lock the grammar pool
 * implementation such that no more grammars will be added.</p>
 * <p> Using the com.sun.org.apache.xerces.internal.xni.parser property, an
 * application may instantiate a Xerces SAX or DOM parser with
 * this configuration.  When invoked in this manner, the default
 * behaviour will be elicited; to use this configuration's
 * specific facilities, the user will need to reference it
 * directly.</p>
 * <p>
 * In addition to the features and properties recognized by the base
 * parser configuration, this class recognizes these additional
 * features and properties:
 * <ul>
 * </ul>
 *
 * @author Neil Graham, IBM
 *
 * @version $Id: XMLGrammarCachingConfiguration.java,v 1.6 2010-11-01 04:40:10 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public Grammar parseGrammar(String type, XMLInputSource
                is) throws XNIException, IOException {

    /**
     * Parse a grammar from a location identified by an
     * XMLInputSource.
     * This method also adds this grammar to the XMLGrammarPool
     *
     * @param type The type of the grammar to be constructed
     * @param is The XMLInputSource containing this grammar's
     * information
     * <strong>If a URI is included in the systemId field, the parser will not expand this URI or make it
     * available to the EntityResolver</strong>
     * @return The newly created <code>Grammar</code>.
     * @exception XNIException thrown on an error in grammar
     * construction
     * @exception IOException thrown if an error is encountered
     * in reading the file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public Grammar parseGrammar(String type, String uri)

    /**
     * Parse a grammar from a location identified by an URI.
     * This method also adds this grammar to the XMLGrammarPool
     *
     * @param type The type of the grammar to be constructed
     * @param uri The location of the grammar to be constructed.
     * <strong>The parser will not expand this URI or make it
     * available to the EntityResolver</strong>
     * @return The newly created <code>Grammar</code>.
     * @exception XNIException thrown on an error in grammar
     * construction
     * @exception IOException thrown if an error is encountered
     * in reading the file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration(SymbolTable symbolTable,
                                       XMLGrammarPool grammarPool,
                                       XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration(SymbolTable symbolTable,
                                       XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
    public XMLGrammarCachingConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarCachingConfiguration.java
public class XMLGrammarCachingConfiguration

/**
 * <p> This configuration provides a generic way of using
 * Xerces's grammar caching facilities.  It extends the
 * XIncludeAwareParserConfiguration and thus may validate documents
 * according to XML schemas or DTD's.  It also allows the user to
 * preparse a grammar, and to lock the grammar pool
 * implementation such that no more grammars will be added.</p>
 * <p> Using the com.sun.org.apache.xerces.internal.xni.parser property, an
 * application may instantiate a Xerces SAX or DOM parser with
 * this configuration.  When invoked in this manner, the default
 * behaviour will be elicited; to use this configuration's
 * specific facilities, the user will need to reference it
 * directly.</p>
 * <p>
 * In addition to the features and properties recognized by the base
 * parser configuration, this class recognizes these additional
 * features and properties:
 * <ul>
 * </ul>
 *
 * @author Neil Graham, IBM
 *
 * @version $Id: XMLGrammarCachingConfiguration.java,v 1.6 2010-11-01 04:40:10 joehw Exp $
 */