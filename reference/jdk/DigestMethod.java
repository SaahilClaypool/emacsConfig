_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/DigestMethod.java
    AlgorithmParameterSpec getParameterSpec();

    /**
     * Returns the algorithm-specific input parameters associated with this
     * <code>DigestMethod</code>.
     *
     * <p>The returned parameters can be typecast to a {@link
     * DigestMethodParameterSpec} object.
     *
     * @return the algorithm-specific parameters (may be <code>null</code> if
     *    not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/DigestMethod.java
    static final String RIPEMD160 = "http://www.w3.org/2001/04/xmlenc#ripemd160";

    /**
     * The <a href="http://www.w3.org/2001/04/xmlenc#ripemd160">
     * RIPEMD-160</a> digest method algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/DigestMethod.java
    static final String SHA512 = "http://www.w3.org/2001/04/xmlenc#sha512";

    /**
     * The <a href="http://www.w3.org/2001/04/xmlenc#sha512">
     * SHA512</a> digest method algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/DigestMethod.java
    static final String SHA256 = "http://www.w3.org/2001/04/xmlenc#sha256";

    /**
     * The <a href="http://www.w3.org/2001/04/xmlenc#sha256">
     * SHA256</a> digest method algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/DigestMethod.java
    static final String SHA1 = "http://www.w3.org/2000/09/xmldsig#sha1";

    /**
     * The <a href="http://www.w3.org/2000/09/xmldsig#sha1">
     * SHA1</a> digest method algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/DigestMethod.java
public interface DigestMethod extends XMLStructure, AlgorithmMethod {

/**
 * A representation of the XML <code>DigestMethod</code> element as
 * defined in the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * The XML Schema Definition is defined as:
 * <p>
 * <pre>
 *   &lt;element name="DigestMethod" type="ds:DigestMethodType"/&gt;
 *     &lt;complexType name="DigestMethodType" mixed="true"&gt;
 *       &lt;sequence&gt;
 *         &lt;any namespace="##any" minOccurs="0" maxOccurs="unbounded"/&gt;
 *           &lt;!-- (0,unbounded) elements from (1,1) namespace --&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Algorithm" type="anyURI" use="required"/&gt;
 *     &lt;/complexType&gt;
 * </pre>
 *
 * A <code>DigestMethod</code> instance may be created by invoking the
 * {@link XMLSignatureFactory#newDigestMethod newDigestMethod} method
 * of the {@link XMLSignatureFactory} class.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#newDigestMethod(String, DigestMethodParameterSpec)
 */