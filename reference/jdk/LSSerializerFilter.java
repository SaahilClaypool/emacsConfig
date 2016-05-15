_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSSerializerFilter.java
public interface LSSerializerFilter extends NodeFilter {

/**
 *  <code>LSSerializerFilter</code>s provide applications the ability to
 * examine nodes as they are being serialized and decide what nodes should
 * be serialized or not. The <code>LSSerializerFilter</code> interface is
 * based on the <code>NodeFilter</code> interface defined in [<a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113'>DOM Level 2 Traversal and      Range</a>]
 * .
 * <p> <code>Document</code>, <code>DocumentType</code>,
 * <code>DocumentFragment</code>, <code>Notation</code>, <code>Entity</code>
 * , and children of <code>Attr</code> nodes are not passed to the filter.
 * The child nodes of an <code>EntityReference</code> node are only passed
 * to the filter if the <code>EntityReference</code> node is skipped by the
 * method <code>LSParserFilter.acceptNode()</code>.
 * <p> When serializing an <code>Element</code>, the element is passed to the
 * filter before any of its attributes are passed to the filter. Namespace
 * declaration attributes, and default attributes (except in the case when "
 * discard-default-content" is set to <code>false</code>), are never passed
 * to the filter.
 * <p> The result of any attempt to modify a node passed to a
 * <code>LSSerializerFilter</code> is implementation dependent.
 * <p> DOM applications must not raise exceptions in a filter. The effect of
 * throwing exceptions from a filter is DOM implementation dependent.
 * <p> For efficiency, a node passed to the filter may not be the same as the
 * one that is actually in the tree. And the actual node (node object
 * identity) may be reused during the process of filtering and serializing a
 * document.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407'>Document Object Model (DOM) Level 3 Load
and Save Specification</a>.
 */