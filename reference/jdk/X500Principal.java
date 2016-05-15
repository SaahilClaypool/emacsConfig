_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    private void readObject(java.io.ObjectInputStream s) throws

    /**
     * Reads this object from a stream (i.e., deserializes it)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>X500Principal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>X500Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>X500Principal</code>
     * for equality.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>X500Principal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>X500Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public String toString() {

    /**
     * Return a string representation of this <code>X500Principal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>X500Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public String getName() {

    /**
     * Return the Unix username for this <code>X500Principal</code>.
     *
     * <p>
     *
     * @return the Unix username for this <code>X500Principal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public X500Principal(String name) {

    /**
     * Create a X500Principal with an X.500 Name,
     * such as "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US"
     * (RFC 1779 style).
     *
     * <p>
     *
     * @param name the X.500 name
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>. <p>
     *
     * @exception IllegalArgumentException if the <code>name</code>
     *                  is improperly specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
@jdk.Exported(false)

/**
 * <p> This class represents an X.500 <code>Principal</code>.
 * X500Principals have names such as,
 * "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US"
 * (RFC 1779 style).
 *
 * <p> Principals such as this <code>X500Principal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 * @deprecated A new X500Principal class is available in the Java platform.
 *             This X500Principal classs is entirely deprecated and
 *             is here to allow for a smooth transition to the new
 *             class.
 * @see javax.security.auth.x500.X500Principal
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    private void readObject(java.io.ObjectInputStream s) throws

    /**
     * Reads this object from a stream (i.e., deserializes it)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>X500Principal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>X500Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>X500Principal</code>
     * for equality.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>X500Principal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>X500Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public String toString() {

    /**
     * Return a string representation of this <code>X500Principal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>X500Principal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public String getName() {

    /**
     * Return the Unix username for this <code>X500Principal</code>.
     *
     * <p>
     *
     * @return the Unix username for this <code>X500Principal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    public X500Principal(String name) {

    /**
     * Create a X500Principal with an X.500 Name,
     * such as "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US"
     * (RFC 1779 style).
     *
     * <p>
     *
     * @param name the X.500 name
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>. <p>
     *
     * @exception IllegalArgumentException if the <code>name</code>
     *                  is improperly specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/X500Principal.java
@jdk.Exported(false)

/**
 * <p> This class represents an X.500 <code>Principal</code>.
 * X500Principals have names such as,
 * "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US"
 * (RFC 1779 style).
 *
 * <p> Principals such as this <code>X500Principal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 * @deprecated A new X500Principal class is available in the Java platform.
 *             This X500Principal classs is entirely deprecated and
 *             is here to allow for a smooth transition to the new
 *             class.
 * @see javax.security.auth.x500.X500Principal
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reads this object from a stream (i.e., deserializes it).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Save the X500Principal object to a stream.
     *
     * @serialData this {@code X500Principal} is serialized
     *          by writing out its DER-encoded form
     *          (the value of {@code getEncoded} is serialized).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public int hashCode() {

    /**
     * Return a hash code for this {@code X500Principal}.
     *
     * <p> The hash code is calculated via:
     * {@code getName(X500Principal.CANONICAL).hashCode()}
     *
     * @return a hash code for this {@code X500Principal}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified {@code Object} with this
     * {@code X500Principal} for equality.
     *
     * <p> Specifically, this method returns {@code true} if
     * the {@code Object} <i>o</i> is an {@code X500Principal}
     * and if the respective canonical string representations
     * (obtained via the {@code getName(X500Principal.CANONICAL)} method)
     * of this object and <i>o</i> are equal.
     *
     * <p> This implementation is compliant with the requirements of RFC 3280.
     *
     * @param o Object to be compared for equality with this
     *          {@code X500Principal}
     *
     * @return {@code true} if the specified {@code Object} is equal
     *          to this {@code X500Principal}, {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public String toString() {

    /**
     * Return a user-friendly string representation of this
     * {@code X500Principal}.
     *
     * @return a string representation of this {@code X500Principal}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public byte[] getEncoded() {

    /**
     * Returns the distinguished name in ASN.1 DER encoded form. The ASN.1
     * notation for this structure is supplied in the documentation for
     * {@link #X500Principal(byte[] name) X500Principal(byte[] name)}.
     *
     * <p>Note that the byte array returned is cloned to protect against
     * subsequent modifications.
     *
     * @return a byte array containing the distinguished name in ASN.1 DER
     * encoded form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public String getName(String format, Map<String, String> oidMap) {

    /**
     * Returns a string representation of the X.500 distinguished name
     * using the specified format. Valid values for the format are
     * "RFC1779" and "RFC2253" (case insensitive). "CANONICAL" is not
     * permitted and an {@code IllegalArgumentException} will be thrown.
     *
     * <p>This method returns Strings in the format as specified in
     * {@link #getName(String)} and also emits additional attribute type
     * keywords for OIDs that have entries in the {@code oidMap}
     * parameter. OID entries in the oidMap take precedence over the default
     * OIDs recognized by {@code getName(String)}.
     * Improperly specified OIDs are ignored; however if an OID
     * in the name maps to an improperly specified keyword, an
     * {@code IllegalArgumentException} is thrown.
     *
     * <p> Additional standard formats may be introduced in the future.
     *
     * <p> Warning: additional attribute type keywords may not be recognized
     * by other implementations; therefore do not use this method if
     * you are unsure if these keywords will be recognized by other
     * implementations.
     *
     * @param format the format to use
     * @param oidMap an OID map, where each key is an object identifier in
     *  String form (a sequence of nonnegative integers separated by periods)
     *  that maps to a corresponding attribute type keyword String.
     *  The map may be empty but never {@code null}.
     * @return a string representation of this {@code X500Principal}
     *          using the specified format
     * @throws IllegalArgumentException if the specified format is invalid,
     *  null, or an OID in the name maps to an improperly specified keyword
     * @throws NullPointerException if {@code oidMap} is {@code null}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public String getName(String format) {

    /**
     * Returns a string representation of the X.500 distinguished name
     * using the specified format. Valid values for the format are
     * "RFC1779", "RFC2253", and "CANONICAL" (case insensitive).
     *
     * <p> If "RFC1779" is specified as the format,
     * this method emits the attribute type keywords defined in
     * RFC 1779 (CN, L, ST, O, OU, C, STREET).
     * Any other attribute type is emitted as an OID.
     *
     * <p> If "RFC2253" is specified as the format,
     * this method emits the attribute type keywords defined in
     * RFC 2253 (CN, L, ST, O, OU, C, STREET, DC, UID).
     * Any other attribute type is emitted as an OID.
     * Under a strict reading, RFC 2253 only specifies a UTF-8 string
     * representation. The String returned by this method is the
     * Unicode string achieved by decoding this UTF-8 representation.
     *
     * <p> If "CANONICAL" is specified as the format,
     * this method returns an RFC 2253 conformant string representation
     * with the following additional canonicalizations:
     *
     * <ol>
     * <li> Leading zeros are removed from attribute types
     *          that are encoded as dotted decimal OIDs
     * <li> DirectoryString attribute values of type
     *          PrintableString and UTF8String are not
     *          output in hexadecimal format
     * <li> DirectoryString attribute values of types
     *          other than PrintableString and UTF8String
     *          are output in hexadecimal format
     * <li> Leading and trailing white space characters
     *          are removed from non-hexadecimal attribute values
     *          (unless the value consists entirely of white space characters)
     * <li> Internal substrings of one or more white space characters are
     *          converted to a single space in non-hexadecimal
     *          attribute values
     * <li> Relative Distinguished Names containing more than one
     *          Attribute Value Assertion (AVA) are output in the
     *          following order: an alphabetical ordering of AVAs
     *          containing standard keywords, followed by a numeric
     *          ordering of AVAs containing OID keywords.
     * <li> The only characters in attribute values that are escaped are
     *          those which section 2.4 of RFC 2253 states must be escaped
     *          (they are escaped using a preceding backslash character)
     * <li> The entire name is converted to upper case
     *          using {@code String.toUpperCase(Locale.US)}
     * <li> The entire name is converted to lower case
     *          using {@code String.toLowerCase(Locale.US)}
     * <li> The name is finally normalized using normalization form KD,
     *          as described in the Unicode Standard and UAX #15
     * </ol>
     *
     * <p> Additional standard formats may be introduced in the future.
     *
     * @param format the format to use
     *
     * @return a string representation of this {@code X500Principal}
     *          using the specified format
     * @throws IllegalArgumentException if the specified format is invalid
     *          or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public String getName() {

    /**
     * Returns a string representation of the X.500 distinguished name using
     * the format defined in RFC 2253.
     *
     * <p>This method is equivalent to calling
     * {@code getName(X500Principal.RFC2253)}.
     *
     * @return the distinguished name of this {@code X500Principal}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public X500Principal(InputStream is) {

    /**
     * Creates an {@code X500Principal} from an {@code InputStream}
     * containing the distinguished name in ASN.1 DER encoded form.
     * The ASN.1 notation for this structure is supplied in the
     * documentation for
     * {@link #X500Principal(byte[] name) X500Principal(byte[] name)}.
     *
     * <p> The read position of the input stream is positioned
     * to the next available byte after the encoded distinguished name.
     *
     * @param is an {@code InputStream} containing the distinguished
     *          name in ASN.1 DER encoded form
     *
     * @exception NullPointerException if the {@code InputStream}
     *          is {@code null}
     * @exception IllegalArgumentException if an encoding error occurs
     *          (incorrect form for DN)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public X500Principal(byte[] name) {

    /**
     * Creates an {@code X500Principal} from a distinguished name in
     * ASN.1 DER encoded form. The ASN.1 notation for this structure is as
     * follows.
     * <pre>{@code
     * Name ::= CHOICE {
     *   RDNSequence }
     *
     * RDNSequence ::= SEQUENCE OF RelativeDistinguishedName
     *
     * RelativeDistinguishedName ::=
     *   SET SIZE (1 .. MAX) OF AttributeTypeAndValue
     *
     * AttributeTypeAndValue ::= SEQUENCE {
     *   type     AttributeType,
     *   value    AttributeValue }
     *
     * AttributeType ::= OBJECT IDENTIFIER
     *
     * AttributeValue ::= ANY DEFINED BY AttributeType
     * ....
     * DirectoryString ::= CHOICE {
     *       teletexString           TeletexString (SIZE (1..MAX)),
     *       printableString         PrintableString (SIZE (1..MAX)),
     *       universalString         UniversalString (SIZE (1..MAX)),
     *       utf8String              UTF8String (SIZE (1.. MAX)),
     *       bmpString               BMPString (SIZE (1..MAX)) }
     * }</pre>
     *
     * @param name a byte array containing the distinguished name in ASN.1
     * DER encoded form
     * @throws IllegalArgumentException if an encoding error occurs
     *          (incorrect form for DN)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public X500Principal(String name, Map<String, String> keywordMap) {

    /**
     * Creates an {@code X500Principal} from a string representation of
     * an X.500 distinguished name (ex:
     * "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US").
     * The distinguished name must be specified using the grammar defined in
     * RFC 1779 or RFC 2253 (either format is acceptable).
     *
     * <p> This constructor recognizes the attribute type keywords specified
     * in {@link #X500Principal(String)} and also recognizes additional
     * keywords that have entries in the {@code keywordMap} parameter.
     * Keyword entries in the keywordMap take precedence over the default
     * keywords recognized by {@code X500Principal(String)}. Keywords
     * MUST be specified in all upper-case, otherwise they will be ignored.
     * Improperly specified keywords are ignored; however if a keyword in the
     * name maps to an improperly specified Object Identifier (OID), an
     * {@code IllegalArgumentException} is thrown. It is permissible to
     * have 2 different keywords that map to the same OID.
     *
     * <p>This implementation enforces a more restrictive OID syntax than
     * defined in RFC 1779 and 2253. It uses the more correct syntax defined in
     * <a href="http://www.ietf.org/rfc/rfc4512.txt">RFC 4512</a>, which
     * specifies that OIDs contain at least 2 digits:
     *
     * <p>{@code numericoid = number 1*( DOT number ) }
     *
     * @param name an X.500 distinguished name in RFC 1779 or RFC 2253 format
     * @param keywordMap an attribute type keyword map, where each key is a
     *   keyword String that maps to a corresponding object identifier in String
     *   form (a sequence of nonnegative integers separated by periods). The map
     *   may be empty but never {@code null}.
     * @exception NullPointerException if {@code name} or
     *   {@code keywordMap} is {@code null}
     * @exception IllegalArgumentException if the {@code name} is
     *   improperly specified or a keyword in the {@code name} maps to an
     *   OID that is not in the correct form
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public X500Principal(String name) {

    /**
     * Creates an {@code X500Principal} from a string representation of
     * an X.500 distinguished name (ex:
     * "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US").
     * The distinguished name must be specified using the grammar defined in
     * RFC 1779 or RFC 2253 (either format is acceptable).
     *
     * <p>This constructor recognizes the attribute type keywords
     * defined in RFC 1779 and RFC 2253
     * (and listed in {@link #getName(String format) getName(String format)}),
     * as well as the T, DNQ or DNQUALIFIER, SURNAME, GIVENNAME, INITIALS,
     * GENERATION, EMAILADDRESS, and SERIALNUMBER keywords whose Object
     * Identifiers (OIDs) are defined in RFC 3280 and its successor.
     * Any other attribute type must be specified as an OID.
     *
     * <p>This implementation enforces a more restrictive OID syntax than
     * defined in RFC 1779 and 2253. It uses the more correct syntax defined in
     * <a href="http://www.ietf.org/rfc/rfc4512.txt">RFC 4512</a>, which
     * specifies that OIDs contain at least 2 digits:
     *
     * <p>{@code numericoid = number 1*( DOT number ) }
     *
     * @param name an X.500 distinguished name in RFC 1779 or RFC 2253 format
     * @exception NullPointerException if the {@code name}
     *                  is {@code null}
     * @exception IllegalArgumentException if the {@code name}
     *                  is improperly specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    X500Principal(X500Name x500Name) {

    /**
     * Creates an X500Principal by wrapping an X500Name.
     *
     * NOTE: The constructor is package private. It is intended to be accessed
     * using privileged reflection from classes in sun.security.*.
     * Currently referenced from sun.security.x509.X500Name.asX500Principal().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    private transient X500Name thisX500Name;

    /**
     * The X500Name representing this principal.
     *
     * NOTE: this field is reflectively accessed from within X500Name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public static final String CANONICAL = "CANONICAL";

    /**
     * Canonical String format of Distinguished Names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
    public static final String RFC1779 = "RFC1779";

    /**
     * RFC 1779 String format of Distinguished Names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500Principal.java
public final class X500Principal implements Principal, java.io.Serializable {

/**
 * <p> This class represents an X.500 {@code Principal}.
 * {@code X500Principal}s are represented by distinguished names such as
 * "CN=Duke, OU=JavaSoft, O=Sun Microsystems, C=US".
 *
 * <p> This class can be instantiated by using a string representation
 * of the distinguished name, or by using the ASN.1 DER encoded byte
 * representation of the distinguished name.  The current specification
 * for the string representation of a distinguished name is defined in
 * <a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253: Lightweight
 * Directory Access Protocol (v3): UTF-8 String Representation of
 * Distinguished Names</a>. This class, however, accepts string formats from
 * both RFC 2253 and <a href="http://www.ietf.org/rfc/rfc1779.txt">RFC 1779:
 * A String Representation of Distinguished Names</a>, and also recognizes
 * attribute type keywords whose OIDs (Object Identifiers) are defined in
 * <a href="http://www.ietf.org/rfc/rfc3280.txt">RFC 3280: Internet X.509
 * Public Key Infrastructure Certificate and CRL Profile</a>.
 *
 * <p> The string representation for this {@code X500Principal}
 * can be obtained by calling the {@code getName} methods.
 *
 * <p> Note that the {@code getSubjectX500Principal} and
 * {@code getIssuerX500Principal} methods of
 * {@code X509Certificate} return X500Principals representing the
 * issuer and subject fields of the certificate.
 *
 * @see java.security.cert.X509Certificate
 * @since 1.4
 */