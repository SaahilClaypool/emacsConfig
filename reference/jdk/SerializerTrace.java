_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, String data);

  /**
   * Fire comment and entity ref events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param data The comment or entity ref data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, String name, String data);

  /**
   * Fire processingInstruction events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param name The name of the processing instruction.
   * @param data The processing instruction data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, char ch[], int start, int length);

  /**
   * Fire characters, cdata events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param ch The char array from the SAX event.
   * @param start The start offset to be used in the char array.
   * @param length The end offset to be used in the chara array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, String name, Attributes atts);

  /**
   * Fire startElement, endElement events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param name The name of the element.
   * @param atts The SAX attribute list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType);

  /**
   * Fire startDocument, endDocument events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public boolean hasTraceListeners();

  /**
   * Tell if trace listeners are present.
   *
   * @return True if there are trace listeners
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_OUTPUT_CHARACTERS = 12;

  /**
   * Event type generated when characters are written to an output stream.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS = 11;

  /**
   * Event type generated when characters might be written to an output stream,
   *  but  these characters never are. They will ultimately be written out via
   * EVENTTYPE_OUTPUT_CHARACTERS. This type is used as attributes are collected.
   * Whenever the attributes change this event type is fired. At the very end
   * however, when the attributes do not change anymore and are going to be
   * ouput to the document the real characters will be written out using the
   * EVENTTYPE_OUTPUT_CHARACTERS.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_CDATA = 10;

  /**
   * Event type generated after CDATA is generated.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_ENTITYREF = 9;

  /**
   * Event type generate after an entity ref is created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_COMMENT = 8;

  /**
   * Event type generated after a comment has been added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_PI = 7;

  /**
   * Event type generated for processing instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_IGNORABLEWHITESPACE = 6;

  /**
   * Event type generated for ignorable whitespace (I'm not sure how much this is actually called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_CHARACTERS = 5;

  /**
   * Event type generated for character data (CDATA and Ignorable Whitespace have their own events).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_ENDELEMENT = 4;

  /**
   * Event type generated when an element ends, after it's children have been added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_STARTELEMENT = 3;

  /**
   * Event type generated when an element begins (after the attributes have been processed but before the children have been added).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_ENDDOCUMENT = 2;

  /**
   * Event type generated when a document ends.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_STARTDOCUMENT = 1;

  /**
   * Event type generated when a document begins.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
public interface SerializerTrace {

/**
 * This interface defines a set of integer constants that identify trace event
 * types.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, String data);

  /**
   * Fire comment and entity ref events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param data The comment or entity ref data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, String name, String data);

  /**
   * Fire processingInstruction events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param name The name of the processing instruction.
   * @param data The processing instruction data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, char ch[], int start, int length);

  /**
   * Fire characters, cdata events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param ch The char array from the SAX event.
   * @param start The start offset to be used in the char array.
   * @param length The end offset to be used in the chara array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType, String name, Attributes atts);

  /**
   * Fire startElement, endElement events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   * @param name The name of the element.
   * @param atts The SAX attribute list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public void fireGenerateEvent(int eventType);

  /**
   * Fire startDocument, endDocument events.
   *
   * @param eventType One of the EVENTTYPE_XXX constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public boolean hasTraceListeners();

  /**
   * Tell if trace listeners are present.
   *
   * @return True if there are trace listeners
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_OUTPUT_CHARACTERS = 12;

  /**
   * Event type generated when characters are written to an output stream.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS = 11;

  /**
   * Event type generated when characters might be written to an output stream,
   *  but  these characters never are. They will ultimately be written out via
   * EVENTTYPE_OUTPUT_CHARACTERS. This type is used as attributes are collected.
   * Whenever the attributes change this event type is fired. At the very end
   * however, when the attributes do not change anymore and are going to be
   * ouput to the document the real characters will be written out using the
   * EVENTTYPE_OUTPUT_CHARACTERS.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_CDATA = 10;

  /**
   * Event type generated after CDATA is generated.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_ENTITYREF = 9;

  /**
   * Event type generate after an entity ref is created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_COMMENT = 8;

  /**
   * Event type generated after a comment has been added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_PI = 7;

  /**
   * Event type generated for processing instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_IGNORABLEWHITESPACE = 6;

  /**
   * Event type generated for ignorable whitespace (I'm not sure how much this is actually called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_CHARACTERS = 5;

  /**
   * Event type generated for character data (CDATA and Ignorable Whitespace have their own events).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_ENDELEMENT = 4;

  /**
   * Event type generated when an element ends, after it's children have been added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_STARTELEMENT = 3;

  /**
   * Event type generated when an element begins (after the attributes have been processed but before the children have been added).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_ENDDOCUMENT = 2;

  /**
   * Event type generated when a document ends.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
  public static final int EVENTTYPE_STARTDOCUMENT = 1;

  /**
   * Event type generated when a document begins.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerTrace.java
public interface SerializerTrace {

/**
 * This interface defines a set of integer constants that identify trace event
 * types.
 *
 * @xsl.usage internal
 */
