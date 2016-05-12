_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final Collection<? extends CRL> generateCRLs(InputStream inStream)

    /**
     * Returns a (possibly empty) collection view of the CRLs read
     * from the given input stream {@code inStream}.
     *
     * <p>In order to take advantage of the specialized CRL format
     * supported by this certificate factory, each element in
     * the returned collection view can be typecast to the corresponding
     * CRL class. For example, if this certificate
     * factory implements X.509 CRLs, the elements in the returned
     * collection can be typecast to the {@code X509CRL} class.
     *
     * <p>In the case of a certificate factory for X.509 CRLs,
     * {@code inStream} may contain a sequence of DER-encoded CRLs.
     * In addition, {@code inStream} may contain a PKCS#7 CRL
     * set. This is a PKCS#7 <i>SignedData</i> object, with the only
     * significant field being <i>crls</i>. In particular, the
     * signature and the contents are ignored. This format allows multiple
     * CRLs to be downloaded at once. If no CRLs are present,
     * an empty collection is returned.
     *
     * <p>Note that if the given input stream does not support
     * {@link java.io.InputStream#mark(int) mark} and
     * {@link java.io.InputStream#reset() reset}, this method will
     * consume the entire input stream.
     *
     * @param inStream the input stream with the CRLs.
     *
     * @return a (possibly empty) collection view of
     * java.security.cert.CRL objects initialized with the data from the input
     * stream.
     *
     * @exception CRLException on parsing errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final CRL generateCRL(InputStream inStream)

    /**
     * Generates a certificate revocation list (CRL) object and initializes it
     * with the data read from the input stream {@code inStream}.
     *
     * <p>In order to take advantage of the specialized CRL format
     * supported by this certificate factory,
     * the returned CRL object can be typecast to the corresponding
     * CRL class. For example, if this certificate
     * factory implements X.509 CRLs, the returned CRL object
     * can be typecast to the {@code X509CRL} class.
     *
     * <p>Note that if the given input stream does not support
     * {@link java.io.InputStream#mark(int) mark} and
     * {@link java.io.InputStream#reset() reset}, this method will
     * consume the entire input stream. Otherwise, each call to this
     * method consumes one CRL and the read position of the input stream
     * is positioned to the next available byte after the inherent
     * end-of-CRL marker. If the data in the
     * input stream does not contain an inherent end-of-CRL marker (other
     * than EOF) and there is trailing data after the CRL is parsed, a
     * {@code CRLException} is thrown.
     *
     * @param inStream an input stream with the CRL data.
     *
     * @return a CRL object initialized with the data
     * from the input stream.
     *
     * @exception CRLException on parsing errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final Collection<? extends Certificate> generateCertificates

    /**
     * Returns a (possibly empty) collection view of the certificates read
     * from the given input stream {@code inStream}.
     *
     * <p>In order to take advantage of the specialized certificate format
     * supported by this certificate factory, each element in
     * the returned collection view can be typecast to the corresponding
     * certificate class. For example, if this certificate
     * factory implements X.509 certificates, the elements in the returned
     * collection can be typecast to the {@code X509Certificate} class.
     *
     * <p>In the case of a certificate factory for X.509 certificates,
     * {@code inStream} may contain a sequence of DER-encoded certificates
     * in the formats described for
     * {@link #generateCertificate(java.io.InputStream) generateCertificate}.
     * In addition, {@code inStream} may contain a PKCS#7 certificate
     * chain. This is a PKCS#7 <i>SignedData</i> object, with the only
     * significant field being <i>certificates</i>. In particular, the
     * signature and the contents are ignored. This format allows multiple
     * certificates to be downloaded at once. If no certificates are present,
     * an empty collection is returned.
     *
     * <p>Note that if the given input stream does not support
     * {@link java.io.InputStream#mark(int) mark} and
     * {@link java.io.InputStream#reset() reset}, this method will
     * consume the entire input stream.
     *
     * @param inStream the input stream with the certificates.
     *
     * @return a (possibly empty) collection view of
     * java.security.cert.Certificate objects
     * initialized with the data from the input stream.
     *
     * @exception CertificateException on parsing errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final CertPath

    /**
     * Generates a {@code CertPath} object and initializes it with
     * a {@code List} of {@code Certificate}s.
     * <p>
     * The certificates supplied must be of a type supported by the
     * {@code CertificateFactory}. They will be copied out of the supplied
     * {@code List} object.
     *
     * @param certificates a {@code List} of {@code Certificate}s
     * @return a {@code CertPath} initialized with the supplied list of
     *   certificates
     * @exception CertificateException if an exception occurs
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final CertPath generateCertPath(InputStream inStream,
        String encoding) throws CertificateException

    /**
     * Generates a {@code CertPath} object and initializes it with
     * the data read from the {@code InputStream} inStream. The data
     * is assumed to be in the specified encoding. See
     * the CertPath Encodings section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertPathEncodings">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard encoding names and their formats.
     *
     * @param inStream an {@code InputStream} containing the data
     * @param encoding the encoding used for the data
     * @return a {@code CertPath} initialized with the data from the
     *   {@code InputStream}
     * @exception CertificateException if an exception occurs while decoding or
     *   the encoding requested is not supported
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final CertPath generateCertPath(InputStream inStream)

    /**
     * Generates a {@code CertPath} object and initializes it with
     * the data read from the {@code InputStream} inStream. The data
     * is assumed to be in the default encoding. The name of the default
     * encoding is the first element of the {@code Iterator} returned by
     * the {@link #getCertPathEncodings getCertPathEncodings} method.
     *
     * @param inStream an {@code InputStream} containing the data
     * @return a {@code CertPath} initialized with the data from the
     *   {@code InputStream}
     * @exception CertificateException if an exception occurs while decoding
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final Iterator<String> getCertPathEncodings() {

    /**
     * Returns an iteration of the {@code CertPath} encodings supported
     * by this certificate factory, with the default encoding first. See
     * the CertPath Encodings section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertPathEncodings">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard encoding names and their formats.
     * <p>
     * Attempts to modify the returned {@code Iterator} via its
     * {@code remove} method result in an
     * {@code UnsupportedOperationException}.
     *
     * @return an {@code Iterator} over the names of the supported
     *         {@code CertPath} encodings (as {@code String}s)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final Certificate generateCertificate(InputStream inStream)

    /**
     * Generates a certificate object and initializes it with
     * the data read from the input stream {@code inStream}.
     *
     * <p>In order to take advantage of the specialized certificate format
     * supported by this certificate factory,
     * the returned certificate object can be typecast to the corresponding
     * certificate class. For example, if this certificate
     * factory implements X.509 certificates, the returned certificate object
     * can be typecast to the {@code X509Certificate} class.
     *
     * <p>In the case of a certificate factory for X.509 certificates, the
     * certificate provided in {@code inStream} must be DER-encoded and
     * may be supplied in binary or printable (Base64) encoding. If the
     * certificate is provided in Base64 encoding, it must be bounded at
     * the beginning by -----BEGIN CERTIFICATE-----, and must be bounded at
     * the end by -----END CERTIFICATE-----.
     *
     * <p>Note that if the given input stream does not support
     * {@link java.io.InputStream#mark(int) mark} and
     * {@link java.io.InputStream#reset() reset}, this method will
     * consume the entire input stream. Otherwise, each call to this
     * method consumes one certificate and the read position of the
     * input stream is positioned to the next available byte after
     * the inherent end-of-certificate marker. If the data in the input stream
     * does not contain an inherent end-of-certificate marker (other
     * than EOF) and there is trailing data after the certificate is parsed, a
     * {@code CertificateException} is thrown.
     *
     * @param inStream an input stream with the certificate data.
     *
     * @return a certificate object initialized with the data
     * from the input stream.
     *
     * @exception CertificateException on parsing errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final String getType() {

    /**
     * Returns the name of the certificate type associated with this
     * certificate factory.
     *
     * @return the name of the certificate type associated with this
     * certificate factory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public final Provider getProvider() {

    /**
     * Returns the provider of this certificate factory.
     *
     * @return the provider of this certificate factory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public static final CertificateFactory getInstance(String type,
            Provider provider) throws CertificateException {

    /**
     * Returns a certificate factory object for the specified
     * certificate type.
     *
     * <p> A new CertificateFactory object encapsulating the
     * CertificateFactorySpi implementation from the specified Provider
     * object is returned.  Note that the specified Provider object
     * does not have to be registered in the provider list.
     *
     * @param type the certificate type.
     * See the CertificateFactory section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertificateFactory">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard certificate types.
     * @param provider the provider.
     *
     * @return a certificate factory object for the specified type.
     *
     * @exception CertificateException if a CertificateFactorySpi
     *          implementation for the specified algorithm is not available
     *          from the specified Provider object.
     *
     * @exception IllegalArgumentException if the {@code provider} is
     *          null.
     *
     * @see java.security.Provider
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public static final CertificateFactory getInstance(String type,
            String provider) throws CertificateException,

    /**
     * Returns a certificate factory object for the specified
     * certificate type.
     *
     * <p> A new CertificateFactory object encapsulating the
     * CertificateFactorySpi implementation from the specified provider
     * is returned.  The specified provider must be registered
     * in the security provider list.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param type the certificate type.
     * See the CertificateFactory section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertificateFactory">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard certificate types.
     *
     * @param provider the name of the provider.
     *
     * @return a certificate factory object for the specified type.
     *
     * @exception CertificateException if a CertificateFactorySpi
     *          implementation for the specified algorithm is not
     *          available from the specified provider.
     *
     * @exception NoSuchProviderException if the specified provider is not
     *          registered in the security provider list.
     *
     * @exception IllegalArgumentException if the provider name is null
     *          or empty.
     *
     * @see java.security.Provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    public static final CertificateFactory getInstance(String type)

    /**
     * Returns a certificate factory object that implements the
     * specified certificate type.
     *
     * <p> This method traverses the list of registered security Providers,
     * starting with the most preferred Provider.
     * A new CertificateFactory object encapsulating the
     * CertificateFactorySpi implementation from the first
     * Provider that supports the specified type is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param type the name of the requested certificate type.
     * See the CertificateFactory section in the <a href=
     * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertificateFactory">
     * Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     * for information about standard certificate types.
     *
     * @return a certificate factory object for the specified type.
     *
     * @exception CertificateException if no Provider supports a
     *          CertificateFactorySpi implementation for the
     *          specified type.
     *
     * @see java.security.Provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
    protected CertificateFactory(CertificateFactorySpi certFacSpi,
                                 Provider provider, String type)

    /**
     * Creates a CertificateFactory object of the given type, and encapsulates
     * the given provider implementation (SPI object) in it.
     *
     * @param certFacSpi the provider implementation.
     * @param provider the provider.
     * @param type the certificate type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateFactory.java
public class CertificateFactory {

/**
 * This class defines the functionality of a certificate factory, which is
 * used to generate certificate, certification path ({@code CertPath})
 * and certificate revocation list (CRL) objects from their encodings.
 *
 * <p>For encodings consisting of multiple certificates, use
 * {@code generateCertificates} when you want to
 * parse a collection of possibly unrelated certificates. Otherwise,
 * use {@code generateCertPath} when you want to generate
 * a {@code CertPath} (a certificate chain) and subsequently
 * validate it with a {@code CertPathValidator}.
 *
 * <p>A certificate factory for X.509 must return certificates that are an
 * instance of {@code java.security.cert.X509Certificate}, and CRLs
 * that are an instance of {@code java.security.cert.X509CRL}.
 *
 * <p>The following example reads a file with Base64 encoded certificates,
 * which are each bounded at the beginning by -----BEGIN CERTIFICATE-----, and
 * bounded at the end by -----END CERTIFICATE-----. We convert the
 * {@code FileInputStream} (which does not support {@code mark}
 * and {@code reset}) to a {@code BufferedInputStream} (which
 * supports those methods), so that each call to
 * {@code generateCertificate} consumes only one certificate, and the
 * read position of the input stream is positioned to the next certificate in
 * the file:
 *
 * <pre>{@code
 * FileInputStream fis = new FileInputStream(filename);
 * BufferedInputStream bis = new BufferedInputStream(fis);
 *
 * CertificateFactory cf = CertificateFactory.getInstance("X.509");
 *
 * while (bis.available() > 0) {
 *    Certificate cert = cf.generateCertificate(bis);
 *    System.out.println(cert.toString());
 * }
 * }</pre>
 *
 * <p>The following example parses a PKCS#7-formatted certificate reply stored
 * in a file and extracts all the certificates from it:
 *
 * <pre>
 * FileInputStream fis = new FileInputStream(filename);
 * CertificateFactory cf = CertificateFactory.getInstance("X.509");
 * Collection c = cf.generateCertificates(fis);
 * Iterator i = c.iterator();
 * while (i.hasNext()) {
 *    Certificate cert = (Certificate)i.next();
 *    System.out.println(cert);
 * }
 * </pre>
 *
 * <p> Every implementation of the Java platform is required to support the
 * following standard {@code CertificateFactory} type:
 * <ul>
 * <li>{@code X.509}</li>
 * </ul>
 * and the following standard {@code CertPath} encodings:
 * <ul>
 * <li>{@code PKCS7}</li>
 * <li>{@code PkiPath}</li>
 * </ul>
 * The type and encodings are described in the <a href=
 * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertificateFactory">
 * CertificateFactory section</a> and the <a href=
 * "{@docRoot}/../technotes/guides/security/StandardNames.html#CertPathEncodings">
 * CertPath Encodings section</a> of the
 * Java Cryptography Architecture Standard Algorithm Name Documentation.
 * Consult the release documentation for your implementation to see if any
 * other types or encodings are supported.
 *
 * @author Hemma Prafullchandra
 * @author Jan Luehe
 * @author Sean Mullan
 *
 * @see Certificate
 * @see X509Certificate
 * @see CertPath
 * @see CRL
 * @see X509CRL
 *
 * @since 1.2
 */
