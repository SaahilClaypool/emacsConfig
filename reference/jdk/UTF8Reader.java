_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private void invalidSurrogate(int uuuuu) throws MalformedByteSequenceException {

    /** Throws an exception for invalid surrogate bits. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private void invalidByte(int position, int count, int c)

    /** Throws an exception for invalid byte. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private void expectedByte(int position, int count)

    /** Throws an exception for expected byte. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public void close() throws IOException {

    /**
     * Close the stream.  Once a stream has been closed, further read(),
     * ready(), mark(), or reset() invocations will throw an IOException.
     * Closing a previously-closed stream, however, has no effect.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public void reset() throws IOException {

    /**
     * Reset the stream.  If the stream has been marked, then attempt to
     * reposition it at the mark.  If the stream has not been marked, then
     * attempt to reset it in some way appropriate to the particular stream,
     * for example by repositioning it to its starting point.  Not all
     * character-input streams support the reset() operation, and some support
     * reset() without supporting mark().
     *
     * @exception  IOException  If the stream has not been marked,
     *                          or if the mark has been invalidated,
     *                          or if the stream does not support reset(),
     *                          or if some other I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Mark the present position in the stream.  Subsequent calls to reset()
     * will attempt to reposition the stream to this point.  Not all
     * character-input streams support the mark() operation.
     *
     * @param  readAheadLimit  Limit on the number of characters that may be
     *                         read while still preserving the mark.  After
     *                         reading this many characters, attempting to
     *                         reset the stream may fail.
     *
     * @exception  IOException  If the stream does not support mark(),
     *                          or if some other I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public boolean markSupported() {

    /**
     * Tell whether this stream supports the mark() operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public boolean ready() throws IOException {

    /**
     * Tell whether this stream is ready to be read.
     *
     * @return True if the next read() is guaranteed not to block for input,
     * false otherwise.  Note that returning false does not guarantee that the
     * next read will block.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public long skip(long n) throws IOException {

    /**
     * Skip characters.  This method will block until some characters are
     * available, an I/O error occurs, or the end of the stream is reached.
     *
     * @param  n  The number of characters to skip
     *
     * @return    The number of characters actually skipped
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public int read(char ch[], int offset, int length) throws IOException {

    /**
     * Read characters into a portion of an array.  This method will block
     * until some input is available, an I/O error occurs, or the end of the
     * stream is reached.
     *
     * @param      ch     Destination buffer
     * @param      offset Offset at which to start storing characters
     * @param      length Maximum number of characters to read
     *
     * @return     The number of characters read, or -1 if the end of the
     *             stream has been reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public int read() throws IOException {

    /**
     * Read a single character.  This method will block until a character is
     * available, an I/O error occurs, or the end of the stream is reached.
     *
     * <p> Subclasses that intend to support efficient single-character input
     * should override this method.
     *
     * @return     The character read, as an integer in the range 0 to 16383
     *             (<tt>0x00-0xffff</tt>), or -1 if the end of the stream has
     *             been reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public UTF8Reader(InputStream inputStream, int size,
            MessageFormatter messageFormatter, Locale locale) {

    /**
     * Constructs a UTF-8 reader from the specified input stream,
     * buffer size and MessageFormatter.
     *
     * @param inputStream The input stream.
     * @param size        The initial buffer size.
     * @param messageFormatter  the formatter for localizing/formatting errors.
     * @param locale    the Locale to use for messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public UTF8Reader(InputStream inputStream, MessageFormatter messageFormatter,
            Locale locale) {

    /**
     * Constructs a UTF-8 reader from the specified input stream
     * using the default buffer size and the given MessageFormatter.
     *
     * @param inputStream The input stream.
     * @param messageFormatter  given MessageFormatter
     * @param locale    Locale to use for messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public UTF8Reader(InputStream inputStream) {

    /**
     * Constructs a UTF-8 reader from the specified input stream
     * using the default buffer size.  Primarily for testing.
     *
     * @param inputStream The input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private int fSurrogate = -1;

    /** Surrogate character. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    protected int fOffset;

    /** Offset into buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    protected byte[] fBuffer;

    /** Byte buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    protected InputStream fInputStream;

    /** Input stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private static final boolean DEBUG_READ = false;

    /** Debug read. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public static final int DEFAULT_BUFFER_SIZE = 2048;

    /** Default byte buffer size (2048). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
public class UTF8Reader

/**
 * <p>A UTF-8 reader.</p>
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private void invalidSurrogate(int uuuuu) throws MalformedByteSequenceException {

    /** Throws an exception for invalid surrogate bits. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private void invalidByte(int position, int count, int c)

    /** Throws an exception for invalid byte. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private void expectedByte(int position, int count)

    /** Throws an exception for expected byte. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public void close() throws IOException {

    /**
     * Close the stream.  Once a stream has been closed, further read(),
     * ready(), mark(), or reset() invocations will throw an IOException.
     * Closing a previously-closed stream, however, has no effect.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public void reset() throws IOException {

    /**
     * Reset the stream.  If the stream has been marked, then attempt to
     * reposition it at the mark.  If the stream has not been marked, then
     * attempt to reset it in some way appropriate to the particular stream,
     * for example by repositioning it to its starting point.  Not all
     * character-input streams support the reset() operation, and some support
     * reset() without supporting mark().
     *
     * @exception  IOException  If the stream has not been marked,
     *                          or if the mark has been invalidated,
     *                          or if the stream does not support reset(),
     *                          or if some other I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Mark the present position in the stream.  Subsequent calls to reset()
     * will attempt to reposition the stream to this point.  Not all
     * character-input streams support the mark() operation.
     *
     * @param  readAheadLimit  Limit on the number of characters that may be
     *                         read while still preserving the mark.  After
     *                         reading this many characters, attempting to
     *                         reset the stream may fail.
     *
     * @exception  IOException  If the stream does not support mark(),
     *                          or if some other I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public boolean markSupported() {

    /**
     * Tell whether this stream supports the mark() operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public boolean ready() throws IOException {

    /**
     * Tell whether this stream is ready to be read.
     *
     * @return True if the next read() is guaranteed not to block for input,
     * false otherwise.  Note that returning false does not guarantee that the
     * next read will block.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public long skip(long n) throws IOException {

    /**
     * Skip characters.  This method will block until some characters are
     * available, an I/O error occurs, or the end of the stream is reached.
     *
     * @param  n  The number of characters to skip
     *
     * @return    The number of characters actually skipped
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public int read(char ch[], int offset, int length) throws IOException {

    /**
     * Read characters into a portion of an array.  This method will block
     * until some input is available, an I/O error occurs, or the end of the
     * stream is reached.
     *
     * @param      ch     Destination buffer
     * @param      offset Offset at which to start storing characters
     * @param      length Maximum number of characters to read
     *
     * @return     The number of characters read, or -1 if the end of the
     *             stream has been reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public int read() throws IOException {

    /**
     * Read a single character.  This method will block until a character is
     * available, an I/O error occurs, or the end of the stream is reached.
     *
     * <p> Subclasses that intend to support efficient single-character input
     * should override this method.
     *
     * @return     The character read, as an integer in the range 0 to 16383
     *             (<tt>0x00-0xffff</tt>), or -1 if the end of the stream has
     *             been reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public UTF8Reader(InputStream inputStream, int size,
            MessageFormatter messageFormatter, Locale locale) {

    /**
     * Constructs a UTF-8 reader from the specified input stream,
     * buffer size and MessageFormatter.
     *
     * @param inputStream The input stream.
     * @param size        The initial buffer size.
     * @param messageFormatter  the formatter for localizing/formatting errors.
     * @param locale    the Locale to use for messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public UTF8Reader(InputStream inputStream, MessageFormatter messageFormatter,
            Locale locale) {

    /**
     * Constructs a UTF-8 reader from the specified input stream
     * using the default buffer size and the given MessageFormatter.
     *
     * @param inputStream The input stream.
     * @param messageFormatter  given MessageFormatter
     * @param locale    Locale to use for messages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public UTF8Reader(InputStream inputStream) {

    /**
     * Constructs a UTF-8 reader from the specified input stream
     * using the default buffer size.  Primarily for testing.
     *
     * @param inputStream The input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private int fSurrogate = -1;

    /** Surrogate character. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    protected int fOffset;

    /** Offset into buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    protected byte[] fBuffer;

    /** Byte buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    protected InputStream fInputStream;

    /** Input stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    private static final boolean DEBUG_READ = false;

    /** Debug read. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
    public static final int DEFAULT_BUFFER_SIZE = 2048;

    /** Default byte buffer size (2048). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/io/UTF8Reader.java
public class UTF8Reader

/**
 * <p>A UTF-8 reader.</p>
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
