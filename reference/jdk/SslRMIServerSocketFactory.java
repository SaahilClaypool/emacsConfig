_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public int hashCode() {

    /**
     * <p>Returns a hash code value for this
     * <code>SslRMIServerSocketFactory</code>.</p>
     *
     * @return a hash code value for this
     * <code>SslRMIServerSocketFactory</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public boolean equals(Object obj) {

    /**
     * <p>Indicates whether some other object is "equal to" this one.</p>
     *
     * <p>Two <code>SslRMIServerSocketFactory</code> objects are equal
     * if they have been constructed with the same SSL context and
     * SSL socket configuration parameters.</p>
     *
     * <p>A subclass should override this method (as well as
     * {@link #hashCode()}) if it adds instance state that affects
     * equality.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public ServerSocket createServerSocket(int port) throws IOException {

    /**
     * <p>Creates a server socket that accepts SSL connections
     * configured according to this factory's SSL socket configuration
     * parameters.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public final boolean getNeedClientAuth() {

    /**
     * <p>Returns <code>true</code> if client authentication is
     * required on SSL connections accepted by server sockets created
     * by this factory.</p>
     *
     * @return <code>true</code> if client authentication is required
     *
     * @see SSLSocket#setNeedClientAuth
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public final String[] getEnabledProtocols() {

    /**
     * <p>Returns the names of the protocol versions enabled on SSL
     * connections accepted by server sockets created by this factory,
     * or <code>null</code> if this factory uses the protocol versions
     * that are enabled by default.</p>
     *
     * @return an array of protocol versions enabled, or
     * <code>null</code>
     *
     * @see SSLSocket#setEnabledProtocols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public final String[] getEnabledCipherSuites() {

    /**
     * <p>Returns the names of the cipher suites enabled on SSL
     * connections accepted by server sockets created by this factory,
     * or <code>null</code> if this factory uses the cipher suites
     * that are enabled by default.</p>
     *
     * @return an array of cipher suites enabled, or <code>null</code>
     *
     * @see SSLSocket#setEnabledCipherSuites
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public SslRMIServerSocketFactory(
            SSLContext context,
            String[] enabledCipherSuites,
            String[] enabledProtocols,
            boolean needClientAuth)

    /**
     * <p>Creates a new <code>SslRMIServerSocketFactory</code> with the
     * specified <code>SSLContext</code> and SSL socket configuration.</p>
     *
     * @param context the SSL context to be used for creating SSL sockets.
     * If <code>context</code> is null the default <code>SSLSocketFactory</code>
     * or the default <code>SSLServerSocketFactory</code> will be used to
     * create SSL sockets. Otherwise, the socket factory returned by
     * <code>SSLContext.getSocketFactory()</code> or
     * <code>SSLContext.getServerSocketFactory()</code> will be used instead.
     *
     * @param enabledCipherSuites names of all the cipher suites to
     * enable on SSL connections accepted by server sockets created by
     * this factory, or <code>null</code> to use the cipher suites
     * that are enabled by default
     *
     * @param enabledProtocols names of all the protocol versions to
     * enable on SSL connections accepted by server sockets created by
     * this factory, or <code>null</code> to use the protocol versions
     * that are enabled by default
     *
     * @param needClientAuth <code>true</code> to require client
     * authentication on SSL connections accepted by server sockets
     * created by this factory; <code>false</code> to not require
     * client authentication
     *
     * @exception IllegalArgumentException when one or more of the cipher
     * suites named by the <code>enabledCipherSuites</code> parameter is
     * not supported, when one or more of the protocols named by the
     * <code>enabledProtocols</code> parameter is not supported or when
     * a problem is encountered while trying to check if the supplied
     * cipher suites and protocols to be enabled are supported.
     *
     * @see SSLSocket#setEnabledCipherSuites
     * @see SSLSocket#setEnabledProtocols
     * @see SSLSocket#setNeedClientAuth
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public SslRMIServerSocketFactory(
            String[] enabledCipherSuites,
            String[] enabledProtocols,
            boolean needClientAuth)

    /**
     * <p>Creates a new <code>SslRMIServerSocketFactory</code> with
     * the specified SSL socket configuration.</p>
     *
     * @param enabledCipherSuites names of all the cipher suites to
     * enable on SSL connections accepted by server sockets created by
     * this factory, or <code>null</code> to use the cipher suites
     * that are enabled by default
     *
     * @param enabledProtocols names of all the protocol versions to
     * enable on SSL connections accepted by server sockets created by
     * this factory, or <code>null</code> to use the protocol versions
     * that are enabled by default
     *
     * @param needClientAuth <code>true</code> to require client
     * authentication on SSL connections accepted by server sockets
     * created by this factory; <code>false</code> to not require
     * client authentication
     *
     * @exception IllegalArgumentException when one or more of the cipher
     * suites named by the <code>enabledCipherSuites</code> parameter is
     * not supported, when one or more of the protocols named by the
     * <code>enabledProtocols</code> parameter is not supported or when
     * a problem is encountered while trying to check if the supplied
     * cipher suites and protocols to be enabled are supported.
     *
     * @see SSLSocket#setEnabledCipherSuites
     * @see SSLSocket#setEnabledProtocols
     * @see SSLSocket#setNeedClientAuth
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
    public SslRMIServerSocketFactory() {

    /**
     * <p>Creates a new <code>SslRMIServerSocketFactory</code> with
     * the default SSL socket configuration.</p>
     *
     * <p>SSL connections accepted by server sockets created by this
     * factory have the default cipher suites and protocol versions
     * enabled and do not require client authentication.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/ssl/SslRMIServerSocketFactory.java
public class SslRMIServerSocketFactory implements RMIServerSocketFactory {

/**
 * <p>An <code>SslRMIServerSocketFactory</code> instance is used by the RMI
 * runtime in order to obtain server sockets for RMI calls via SSL.</p>
 *
 * <p>This class implements <code>RMIServerSocketFactory</code> over
 * the Secure Sockets Layer (SSL) or Transport Layer Security (TLS)
 * protocols.</p>
 *
 * <p>This class creates SSL sockets using the default
 * <code>SSLSocketFactory</code> (see {@link
 * SSLSocketFactory#getDefault}) or the default
 * <code>SSLServerSocketFactory</code> (see {@link
 * SSLServerSocketFactory#getDefault}) unless the
 * constructor taking an <code>SSLContext</code> is
 * used in which case the SSL sockets are created using
 * the <code>SSLSocketFactory</code> returned by
 * {@link SSLContext#getSocketFactory} or the
 * <code>SSLServerSocketFactory</code> returned by
 * {@link SSLContext#getServerSocketFactory}.
 *
 * When an <code>SSLContext</code> is not supplied all the instances of this
 * class share the same keystore, and the same truststore (when client
 * authentication is required by the server). This behavior can be modified
 * by supplying an already initialized <code>SSLContext</code> instance.
 *
 * @see javax.net.ssl.SSLSocketFactory
 * @see javax.net.ssl.SSLServerSocketFactory
 * @see javax.rmi.ssl.SslRMIClientSocketFactory
 * @since 1.5
 */
