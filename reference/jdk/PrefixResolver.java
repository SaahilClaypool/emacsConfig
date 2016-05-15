_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
  public String getBaseIdentifier();

  /**
   * Return the base identifier.
   *
   * @return The base identifier from where relative URIs should be absolutized, or null
   * if the base ID is unknown.
   * <p>
   * CAVEAT: Note that the base URI in an XML document may vary with where
   * you are in the document, if part of the doc's contents were brought in
   * via an external entity reference or if mechanisms such as xml:base have
   * been used. Unless this PrefixResolver is bound to a specific portion of
   * the document, or has been kept up to date via some other mechanism, it
   * may not accurately reflect that context information.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
  String getNamespaceForPrefix(String prefix, org.w3c.dom.Node context);

  /**
   * Given a namespace, get the corresponding prefix, based on the context node.
   *
   * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace.
   * @param context The node context from which to look up the URI.
   *
   * @return The associated Namespace URI as a string, or null if the prefix
   *         is undeclared in this context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
  String getNamespaceForPrefix(String prefix);

  /**
   * Given a namespace, get the corrisponding prefix.  This assumes that
   * the PrefixResolver holds its own namespace context, or is a namespace
   * context itself.
   *
   * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace.
   *
   * @return The associated Namespace URI, or null if the prefix
   *         is undeclared in this context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
public interface PrefixResolver

/**
 * The class that implements this interface can resolve prefixes to
 * namespaces. Examples would include resolving the meaning of a
 * prefix at a particular point in a document, or mapping the prefixes
 * used in an XPath expression.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
  public String getBaseIdentifier();

  /**
   * Return the base identifier.
   *
   * @return The base identifier from where relative URIs should be absolutized, or null
   * if the base ID is unknown.
   * <p>
   * CAVEAT: Note that the base URI in an XML document may vary with where
   * you are in the document, if part of the doc's contents were brought in
   * via an external entity reference or if mechanisms such as xml:base have
   * been used. Unless this PrefixResolver is bound to a specific portion of
   * the document, or has been kept up to date via some other mechanism, it
   * may not accurately reflect that context information.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
  String getNamespaceForPrefix(String prefix, org.w3c.dom.Node context);

  /**
   * Given a namespace, get the corresponding prefix, based on the context node.
   *
   * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace.
   * @param context The node context from which to look up the URI.
   *
   * @return The associated Namespace URI as a string, or null if the prefix
   *         is undeclared in this context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
  String getNamespaceForPrefix(String prefix);

  /**
   * Given a namespace, get the corrisponding prefix.  This assumes that
   * the PrefixResolver holds its own namespace context, or is a namespace
   * context itself.
   *
   * @param prefix The prefix to look up, which may be an empty string ("") for the default Namespace.
   *
   * @return The associated Namespace URI, or null if the prefix
   *         is undeclared in this context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolver.java
public interface PrefixResolver

/**
 * The class that implements this interface can resolve prefixes to
 * namespaces. Examples would include resolving the meaning of a
 * prefix at a particular point in a document, or mapping the prefixes
 * used in an XPath expression.
 * @xsl.usage advanced
 */