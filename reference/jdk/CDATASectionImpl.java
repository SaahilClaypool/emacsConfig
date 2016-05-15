_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    public String getNodeName() {

    /** Returns the node name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    public CDATASectionImpl(CoreDocumentImpl ownerDoc, String data) {

    /** Factory constructor for creating a CDATA section. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    static final long serialVersionUID = 2372071297878177780L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
public class CDATASectionImpl

/**
 * XML provides the CDATA markup to allow a region of text in which
 * most of the XML delimiter recognition does not take place. This is
 * intended to ease the task of quoting XML fragments and other
 * programmatic information in a document's text without needing to
 * escape these special characters. It's primarily a convenience feature
 * for those who are hand-editing XML.
 * <P>
 * CDATASection is an Extended DOM feature, and is not used in HTML
 * contexts.
 * <P>
 * Within the DOM, CDATASections are treated essentially as Text
 * blocks. Their distinct type is retained in order to allow us to
 * properly recreate the XML syntax when we write them out.
 * <P>
 * Reminder: CDATA IS NOT A COMPLETELY GENERAL SOLUTION; it can't
 * quote its own end-of-block marking. If you need to write out a
 * CDATA that contains the ]]> sequence, it's your responsibility to
 * split that string over two successive CDATAs at that time.
 * <P>
 * CDATA does not participate in Element.normalize() processing.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    public String getNodeName() {

    /** Returns the node name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    public CDATASectionImpl(CoreDocumentImpl ownerDoc, String data) {

    /** Factory constructor for creating a CDATA section. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
    static final long serialVersionUID = 2372071297878177780L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CDATASectionImpl.java
public class CDATASectionImpl

/**
 * XML provides the CDATA markup to allow a region of text in which
 * most of the XML delimiter recognition does not take place. This is
 * intended to ease the task of quoting XML fragments and other
 * programmatic information in a document's text without needing to
 * escape these special characters. It's primarily a convenience feature
 * for those who are hand-editing XML.
 * <P>
 * CDATASection is an Extended DOM feature, and is not used in HTML
 * contexts.
 * <P>
 * Within the DOM, CDATASections are treated essentially as Text
 * blocks. Their distinct type is retained in order to allow us to
 * properly recreate the XML syntax when we write them out.
 * <P>
 * Reminder: CDATA IS NOT A COMPLETELY GENERAL SOLUTION; it can't
 * quote its own end-of-block marking. If you need to write out a
 * CDATA that contains the ]]> sequence, it's your responsibility to
 * split that string over two successive CDATAs at that time.
 * <P>
 * CDATA does not participate in Element.normalize() processing.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */