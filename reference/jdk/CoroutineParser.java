_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void init( CoroutineManager co, int appCoroutineID, XMLReader parser );

  /**
   * Initialize the coroutine parser. Same parameters could be passed
   * in a non-default constructor, or by using using context ClassLoader
   * and newInstance and then calling init()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void doTerminate(int appCoroutine);

  /** doTerminate() is a simple API which tells the coroutine
   * parser to terminate itself.  This is intended to be called from
   * one of our partner coroutines, and serves both to encapsulate the
   * communication protocol and to avoid having to explicitly use the
   * CoroutineParser's coroutine ID number.
   *
   * Returns only after the CoroutineParser has acknowledged the request.
   *
   * @param appCoroutine The coroutine ID number of the coroutine invoking
   * this method, so it can be resumed after the parser has responded to the
   * request.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public Object doMore (boolean parsemore, int appCoroutine);

  /** doMore() is a simple API which tells the coroutine parser
   * that we need more nodes.  This is intended to be called from one
   * of our partner coroutines, and serves both to encapsulate the
   * communication protocol and to avoid having to explicitly use the
   * CoroutineParser's coroutine ID number.
   *
   * @param parsemore If true, tells the incremental parser to generate
   * another chunk of output. If false, tells the parser that we're
   * satisfied and it can terminate parsing of this document.
   * @param appCoroutine The coroutine ID number of the coroutine invoking
   * this method, so it can be resumed after the parser has responded to the
   * request.
   * @return Boolean.TRUE if the CoroutineParser believes more data may be available
   * for further parsing. Boolean.FALSE if parsing ran to completion.
   * Exception if the parser objected for some reason.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public Object doParse(InputSource source, int appCoroutine);

  /** doParse() is a simple API which tells the coroutine parser
   * to begin reading from a file.  This is intended to be called from one
   * of our partner coroutines, and serves both to encapsulate the
   * communication protocol and to avoid having to explicitly use the
   * CoroutineParser's coroutine ID number.
   *
   * %REVIEW% Can/should this unify with doMore? (if URI hasn't changed,
   * parse more from same file, else end and restart parsing...?
   *
   * @param source The InputSource to parse from.
   * @param appCoroutine The coroutine ID number of the coroutine invoking
   * this method, so it can be resumed after the parser has responded to the
   * request.
   * @return Boolean.TRUE if the CoroutineParser believes more data may be available
   * for further parsing. Boolean.FALSE if parsing ran to completion.
   * Exception if the parser objected for some reason.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void setLexHandler(org.xml.sax.ext.LexicalHandler handler);

  /**  Register a SAX-style lexical handler for us to output to
   *  Not all parsers support this...
   *
   * %REVIEW% Not called setLexicalHandler because Xalan uses that name
   * internally, which causes subclassing nuisances.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void setContentHandler(ContentHandler handler);

  /** Register a SAX-style content handler for us to output to */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
    public CoroutineManager getCoroutineManager();

    /** @return the CoroutineManager for this CoroutineParser object.
     * If you're using the do...() methods, applications should only
     * need to talk to the CoroutineManager once, to obtain the
     * application's Coroutine ID.
     * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
    public int getParserCoroutineID();

    /** @return the coroutine ID number for this CoroutineParser object.
     * Note that this isn't useful unless you know which CoroutineManager
     * you're talking to. Also note that the do...() methods encapsulate
     * the common transactions with the CoroutineParser, so you shouldn't
     * need this in most cases.
     * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
public interface CoroutineParser {

/** <p>CoroutineParser is an API for parser threads that operate as
 * coroutines. See CoroutineSAXParser and CoroutineSAXParser_Xerces
 * for examples.</p>
 *
 * <p>&lt;grumble&gt; I'd like the interface to require a specific form
 * for either the base constructor or a static factory method. Java
 * doesn't allow us to specify either, so I'll just document them
 * here:
 *
 * <ul>
 * <li>public CoroutineParser(CoroutineManager co, int appCoroutine);</li>
 * <li>public CoroutineParser createCoroutineParser(CoroutineManager co, int appCoroutine);</li>
 * </ul>
 *
 * &lt;/grumble&gt;</p>
 *
 * @deprecated Since the ability to start a parse via the
 * coroutine protocol was not being used and was complicating design.
 * See {@link IncrementalSAXSource}.
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void init( CoroutineManager co, int appCoroutineID, XMLReader parser );

  /**
   * Initialize the coroutine parser. Same parameters could be passed
   * in a non-default constructor, or by using using context ClassLoader
   * and newInstance and then calling init()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void doTerminate(int appCoroutine);

  /** doTerminate() is a simple API which tells the coroutine
   * parser to terminate itself.  This is intended to be called from
   * one of our partner coroutines, and serves both to encapsulate the
   * communication protocol and to avoid having to explicitly use the
   * CoroutineParser's coroutine ID number.
   *
   * Returns only after the CoroutineParser has acknowledged the request.
   *
   * @param appCoroutine The coroutine ID number of the coroutine invoking
   * this method, so it can be resumed after the parser has responded to the
   * request.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public Object doMore (boolean parsemore, int appCoroutine);

  /** doMore() is a simple API which tells the coroutine parser
   * that we need more nodes.  This is intended to be called from one
   * of our partner coroutines, and serves both to encapsulate the
   * communication protocol and to avoid having to explicitly use the
   * CoroutineParser's coroutine ID number.
   *
   * @param parsemore If true, tells the incremental parser to generate
   * another chunk of output. If false, tells the parser that we're
   * satisfied and it can terminate parsing of this document.
   * @param appCoroutine The coroutine ID number of the coroutine invoking
   * this method, so it can be resumed after the parser has responded to the
   * request.
   * @return Boolean.TRUE if the CoroutineParser believes more data may be available
   * for further parsing. Boolean.FALSE if parsing ran to completion.
   * Exception if the parser objected for some reason.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public Object doParse(InputSource source, int appCoroutine);

  /** doParse() is a simple API which tells the coroutine parser
   * to begin reading from a file.  This is intended to be called from one
   * of our partner coroutines, and serves both to encapsulate the
   * communication protocol and to avoid having to explicitly use the
   * CoroutineParser's coroutine ID number.
   *
   * %REVIEW% Can/should this unify with doMore? (if URI hasn't changed,
   * parse more from same file, else end and restart parsing...?
   *
   * @param source The InputSource to parse from.
   * @param appCoroutine The coroutine ID number of the coroutine invoking
   * this method, so it can be resumed after the parser has responded to the
   * request.
   * @return Boolean.TRUE if the CoroutineParser believes more data may be available
   * for further parsing. Boolean.FALSE if parsing ran to completion.
   * Exception if the parser objected for some reason.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void setLexHandler(org.xml.sax.ext.LexicalHandler handler);

  /**  Register a SAX-style lexical handler for us to output to
   *  Not all parsers support this...
   *
   * %REVIEW% Not called setLexicalHandler because Xalan uses that name
   * internally, which causes subclassing nuisances.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
  public void setContentHandler(ContentHandler handler);

  /** Register a SAX-style content handler for us to output to */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
    public CoroutineManager getCoroutineManager();

    /** @return the CoroutineManager for this CoroutineParser object.
     * If you're using the do...() methods, applications should only
     * need to talk to the CoroutineManager once, to obtain the
     * application's Coroutine ID.
     * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
    public int getParserCoroutineID();

    /** @return the coroutine ID number for this CoroutineParser object.
     * Note that this isn't useful unless you know which CoroutineManager
     * you're talking to. Also note that the do...() methods encapsulate
     * the common transactions with the CoroutineParser, so you shouldn't
     * need this in most cases.
     * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CoroutineParser.java
public interface CoroutineParser {

/** <p>CoroutineParser is an API for parser threads that operate as
 * coroutines. See CoroutineSAXParser and CoroutineSAXParser_Xerces
 * for examples.</p>
 *
 * <p>&lt;grumble&gt; I'd like the interface to require a specific form
 * for either the base constructor or a static factory method. Java
 * doesn't allow us to specify either, so I'll just document them
 * here:
 *
 * <ul>
 * <li>public CoroutineParser(CoroutineManager co, int appCoroutine);</li>
 * <li>public CoroutineParser createCoroutineParser(CoroutineManager co, int appCoroutine);</li>
 * </ul>
 *
 * &lt;/grumble&gt;</p>
 *
 * @deprecated Since the ability to start a parse via the
 * coroutine protocol was not being used and was complicating design.
 * See {@link IncrementalSAXSource}.
 * */
