_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CacheRequest.java
    public abstract void abort();

    /**
     * Aborts the attempt to cache the response. If an IOException is
     * encountered while reading the response or writing to the cache,
     * the current cache store operation will be abandoned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CacheRequest.java
    public abstract OutputStream getBody() throws IOException;

    /**
     * Returns an OutputStream to which the response body can be
     * written.
     *
     * @return an OutputStream to which the response body can
     *         be written
     * @throws IOException if an I/O error occurs while
     *         writing the response body
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/CacheRequest.java
public abstract class CacheRequest {

/**
 * Represents channels for storing resources in the
 * ResponseCache. Instances of such a class provide an
 * OutputStream object which is called by protocol handlers to
 * store the resource data into the cache, and also an abort() method
 * which allows a cache store operation to be interrupted and
 * abandoned. If an IOException is encountered while reading the
 * response or writing to the cache, the current cache store operation
 * will be aborted.
 *
 * @author Yingxian Wang
 * @since 1.5
 */
