_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/EncodedKeySpec.java
    public abstract String getFormat();

    /**
     * Returns the name of the encoding format associated with this
     * key specification.
     *
     * <p>If the opaque representation of a key
     * (see {@link java.security.Key Key}) can be transformed
     * (see {@link java.security.KeyFactory KeyFactory})
     * into this key specification (or a subclass of it),
     * {@code getFormat} called
     * on the opaque key returns the same value as the
     * {@code getFormat} method
     * of this key specification.
     *
     * @return a string representation of the encoding format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/EncodedKeySpec.java
    public byte[] getEncoded() {

    /**
     * Returns the encoded key.
     *
     * @return the encoded key. Returns a new array each time
     * this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/EncodedKeySpec.java
    public EncodedKeySpec(byte[] encodedKey) {

    /**
     * Creates a new EncodedKeySpec with the given encoded key.
     *
     * @param encodedKey the encoded key. The contents of the
     * array are copied to protect against subsequent modification.
     * @exception NullPointerException if {@code encodedKey}
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/EncodedKeySpec.java
public abstract class EncodedKeySpec implements KeySpec {

/**
 * This class represents a public or private key in encoded format.
 *
 * @author Jan Luehe
 *
 *
 * @see java.security.Key
 * @see java.security.KeyFactory
 * @see KeySpec
 * @see X509EncodedKeySpec
 * @see PKCS8EncodedKeySpec
 *
 * @since 1.2
 */