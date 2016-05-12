_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void startParse(InputSource source) throws SAXException;

  /** Launch an XMLReader's parsing operation, feeding events to this
   * IncrementalSAXSource. In some implementations, this may launch a
   * thread which runs the previously supplied XMLReader's parse() operation.
   * In others, it may do other forms of initialization.
   *
   * @throws SAXException is parse thread is already in progress
   * or parsing can not be started.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public Object deliverMoreNodes (boolean parsemore);

  /** deliverMoreNodes() is a simple API which tells the thread in which the
   * IncrementalSAXSource is running to deliver more events (true),
   * or stop delivering events and close out its input (false).
   *
   * This is intended to be called from one of our partner coroutines,
   * and serves to encapsulate the coroutine communication protocol.
   *
   * @param parsemore If true, tells the incremental SAX stream to deliver
   * another chunk of events. If false, finishes out the stream.
   *
   * @return Boolean.TRUE if the IncrementalSAXSource believes more data
   * may be available for further parsing. Boolean.FALSE if parsing
   * ran to completion, or was ended by deliverMoreNodes(false).
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void setDTDHandler(org.xml.sax.DTDHandler handler);

  /**  Register a SAX-style DTD handler for us to output to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void setLexicalHandler(org.xml.sax.ext.LexicalHandler handler);

  /**  Register a SAX-style lexical handler for us to output to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void setContentHandler(ContentHandler handler);

  /** Register a SAX-style content handler for us to output to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
public interface IncrementalSAXSource

/** <p>IncrementalSAXSource is an API that delivers a small number of
 * SAX events each time a request is made from a "controller"
 * coroutine.  See IncrementalSAXFilter and IncrementalSAXFilter_Xerces
 * for examples.
 *
 * Note that interaction is via the deliverMoreNodes
 * method, and therefore coroutine support is not exposed
 * here.</p>
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void startParse(InputSource source) throws SAXException;

  /** Launch an XMLReader's parsing operation, feeding events to this
   * IncrementalSAXSource. In some implementations, this may launch a
   * thread which runs the previously supplied XMLReader's parse() operation.
   * In others, it may do other forms of initialization.
   *
   * @throws SAXException is parse thread is already in progress
   * or parsing can not be started.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public Object deliverMoreNodes (boolean parsemore);

  /** deliverMoreNodes() is a simple API which tells the thread in which the
   * IncrementalSAXSource is running to deliver more events (true),
   * or stop delivering events and close out its input (false).
   *
   * This is intended to be called from one of our partner coroutines,
   * and serves to encapsulate the coroutine communication protocol.
   *
   * @param parsemore If true, tells the incremental SAX stream to deliver
   * another chunk of events. If false, finishes out the stream.
   *
   * @return Boolean.TRUE if the IncrementalSAXSource believes more data
   * may be available for further parsing. Boolean.FALSE if parsing
   * ran to completion, or was ended by deliverMoreNodes(false).
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void setDTDHandler(org.xml.sax.DTDHandler handler);

  /**  Register a SAX-style DTD handler for us to output to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void setLexicalHandler(org.xml.sax.ext.LexicalHandler handler);

  /**  Register a SAX-style lexical handler for us to output to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
  public void setContentHandler(ContentHandler handler);

  /** Register a SAX-style content handler for us to output to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/IncrementalSAXSource.java
public interface IncrementalSAXSource

/** <p>IncrementalSAXSource is an API that delivers a small number of
 * SAX events each time a request is made from a "controller"
 * coroutine.  See IncrementalSAXFilter and IncrementalSAXFilter_Xerces
 * for examples.
 *
 * Note that interaction is via the deliverMoreNodes
 * method, and therefore coroutine support is not exposed
 * here.</p>
 * */
