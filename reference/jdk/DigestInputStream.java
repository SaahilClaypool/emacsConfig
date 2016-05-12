_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
     public String toString() {

    /**
     * Prints a string representation of this digest input stream and
     * its associated message digest object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
    public void on(boolean on) {

    /**
     * Turns the digest function on or off. The default is on.  When
     * it is on, a call to one of the {@code read} methods results in an
     * update on the message digest.  But when it is off, the message
     * digest is not updated.
     *
     * @param on true to turn the digest function on, false to turn
     * it off.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
    public int read(byte[] b, int off, int len) throws IOException {

    /**
     * Reads into a byte array, and updates the message digest (if the
     * digest function is on).  That is, this method reads up to
     * {@code len} bytes from the input stream into the array
     * {@code b}, starting at offset {@code off}. This method
     * blocks until the data is actually
     * read. If the digest function is on (see
     * {@link #on(boolean) on}), this method will then call {@code update}
     * on the message digest associated with this stream, passing it
     * the data.
     *
     * @param b the array into which the data is read.
     *
     * @param off the starting offset into {@code b} of where the
     * data should be placed.
     *
     * @param len the maximum number of bytes to be read from the input
     * stream into b, starting at offset {@code off}.
     *
     * @return  the actual number of bytes read. This is less than
     * {@code len} if the end of the stream is reached prior to
     * reading {@code len} bytes. -1 is returned if no bytes were
     * read because the end of the stream had already been reached when
     * the call was made.
     *
     * @exception IOException if an I/O error occurs.
     *
     * @see MessageDigest#update(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
    public int read() throws IOException {

    /**
     * Reads a byte, and updates the message digest (if the digest
     * function is on).  That is, this method reads a byte from the
     * input stream, blocking until the byte is actually read. If the
     * digest function is on (see {@link #on(boolean) on}), this method
     * will then call {@code update} on the message digest associated
     * with this stream, passing it the byte read.
     *
     * @return the byte read.
     *
     * @exception IOException if an I/O error occurs.
     *
     * @see MessageDigest#update(byte)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
    public void setMessageDigest(MessageDigest digest) {

    /**
     * Associates the specified message digest with this stream.
     *
     * @param digest the message digest to be associated with this stream.
     * @see #getMessageDigest()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
    public MessageDigest getMessageDigest() {

    /**
     * Returns the message digest associated with this stream.
     *
     * @return the message digest associated with this stream.
     * @see #setMessageDigest(java.security.MessageDigest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
    public DigestInputStream(InputStream stream, MessageDigest digest) {

    /**
     * Creates a digest input stream, using the specified input stream
     * and message digest.
     *
     * @param stream the input stream.
     *
     * @param digest the message digest to associate with this stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
    protected MessageDigest digest;

    /**
     * The message digest associated with this stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestInputStream.java
public class DigestInputStream extends FilterInputStream {

/**
 * A transparent stream that updates the associated message digest using
 * the bits going through the stream.
 *
 * <p>To complete the message digest computation, call one of the
 * {@code digest} methods on the associated message
 * digest after your calls to one of this digest input stream's
 * {@link #read() read} methods.
 *
 * <p>It is possible to turn this stream on or off (see
 * {@link #on(boolean) on}). When it is on, a call to one of the
 * {@code read} methods
 * results in an update on the message digest.  But when it is off,
 * the message digest is not updated. The default is for the stream
 * to be on.
 *
 * <p>Note that digest objects can compute only one digest (see
 * {@link MessageDigest}),
 * so that in order to compute intermediate digests, a caller should
 * retain a handle onto the digest object, and clone it for each
 * digest to be computed, leaving the orginal digest untouched.
 *
 * @see MessageDigest
 *
 * @see DigestOutputStream
 *
 * @author Benjamin Renaud
 */
