_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    @Override

    /**
     * Returns a string representation of this {@code PKCS12Attribute}.
     *
     * @return a name/value pair separated by an 'equals' symbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    @Override

    /**
     * Returns the hashcode for this {@code PKCS12Attribute}.
     * The hash code is computed from its DER encoding.
     *
     * @return the hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    @Override

    /**
     * Compares this {@code PKCS12Attribute} and a specified object for
     * equality.
     *
     * @param obj the comparison object
     *
     * @return true if {@code obj} is a {@code PKCS12Attribute} and
     * their DER encodings are equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    public byte[] getEncoded() {

    /**
     * Returns the attribute's ASN.1 DER encoding.
     *
     * @return a clone of the attribute's DER encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    @Override

    /**
     * Returns the attribute's ASN.1 DER-encoded value as a string.
     * An ASN.1 DER-encoded value is returned in one of the following
     * {@code String} formats:
     * <ul>
     * <li> the DER encoding of a basic ASN.1 type that has a natural
     *      string representation is returned as the string itself.
     *      Such types are currently limited to BOOLEAN, INTEGER,
     *      OBJECT IDENTIFIER, UTCTime, GeneralizedTime and the
     *      following six ASN.1 string types: UTF8String,
     *      PrintableString, T61String, IA5String, BMPString and
     *      GeneralString.
     * <li> the DER encoding of any other ASN.1 type is not decoded but
     *      returned as a binary string of colon-separated pairs of
     *      hexadecimal digits.
     * </ul>
     * Multi-valued attributes are represented as a comma-separated
     * list of values, enclosed in square brackets. See
     * {@link Arrays#toString(java.lang.Object[])}.
     *
     * @return the attribute value's string encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    @Override

    /**
     * Returns the attribute's ASN.1 Object Identifier represented as a
     * list of dot-separated integers.
     *
     * @return the attribute's identifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    public PKCS12Attribute(byte[] encoded) {

    /**
     * Constructs a PKCS12 attribute from its ASN.1 DER encoding.
     * The DER encoding is specified by the following ASN.1 definition:
     * <pre>
     *
     * Attribute ::= SEQUENCE {
     *     type   AttributeType,
     *     values SET OF AttributeValue
     * }
     * AttributeType ::= OBJECT IDENTIFIER
     * AttributeValue ::= ANY defined by type
     *
     * </pre>
     *
     * @param encoded the attribute's ASN.1 DER encoding. It is cloned
     *     to prevent subsequent modificaion.
     *
     * @exception NullPointerException if {@code encoded} is
     *     {@code null}
     * @exception IllegalArgumentException if {@code encoded} is
     *     incorrectly formatted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
    public PKCS12Attribute(String name, String value) {

    /**
     * Constructs a PKCS12 attribute from its name and value.
     * The name is an ASN.1 Object Identifier represented as a list of
     * dot-separated integers.
     * A string value is represented as the string itself.
     * A binary value is represented as a string of colon-separated
     * pairs of hexadecimal digits.
     * Multi-valued attributes are represented as a comma-separated
     * list of values, enclosed in square brackets. See
     * {@link Arrays#toString(java.lang.Object[])}.
     * <p>
     * A string value will be DER-encoded as an ASN.1 UTF8String and a
     * binary value will be DER-encoded as an ASN.1 Octet String.
     *
     * @param name the attribute's identifier
     * @param value the attribute's value
     *
     * @exception NullPointerException if {@code name} or {@code value}
     *     is {@code null}
     * @exception IllegalArgumentException if {@code name} or
     *     {@code value} is incorrectly formatted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PKCS12Attribute.java
public final class PKCS12Attribute implements KeyStore.Entry.Attribute {

/**
 * An attribute associated with a PKCS12 keystore entry.
 * The attribute name is an ASN.1 Object Identifier and the attribute
 * value is a set of ASN.1 types.
 *
 * @since 1.8
 */
