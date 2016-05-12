_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String SSL_CIPHER_SUITE = "jdmk.ssl.cipher.suite.";

    /**
     * References the property that specifies the SSL cipher suites to
     * be enabled by the HTTP/SSL connector.
     * <p>
     * Property Name: <B>jdmk.ssl.cipher.suite.</B>
     * <p>
     * The list of SSL cipher suites is specified in the format:
     * <p>
     * <DD><B>jdmk.ssl.cipher.suite.</B>&lt;n&gt;<B>=</B>&lt;cipher suite name&gt;</DD>
     * <p>
     * For example:
     * <p>
     * <DD>jdmk.ssl.cipher.suite.1=SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA</DD>
     * <DD>jdmk.ssl.cipher.suite.2=SSL_RSA_EXPORT_WITH_RC4_40_MD5</DD>
     * <DD>. . .</DD>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String JMX_IMPL_VERSION = "jmx.implementation.version";

    /**
     * References the property that specifies the version of this product
     * implementing the  JMX specification.
     * <p>
     * Property Name: <B>jmx.implementation.version</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String JMX_IMPL_VENDOR = "jmx.implementation.vendor";

    /**
     * References the property that specifies the name of the vendor of this product
     * implementing the  JMX specification.
     * <p>
     * Property Name: <B>jmx.implementation.vendor</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String JMX_IMPL_NAME = "jmx.implementation.name";

    /**
     * References the property that specifies the full name of this product
     * implementing the  JMX specification.
     * <p>
     * Property Name: <B>jmx.implementation.name</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
     public static final String JMX_SPEC_VENDOR = "jmx.specification.vendor";

    /**
     * References the property that specifies the vendor of the JMX
     * specification implemented by this product.
     * <p>
     * Property Name: <B>jmx.specification.vendor</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
     public static final String JMX_SPEC_VERSION = "jmx.specification.version";

    /**
     * References the property that specifies the version of the JMX
     * specification implemented by this product.
     * <p>
     * Property Name: <B>jmx.specification.version</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
     public static final String JMX_SPEC_NAME = "jmx.specification.name";

    /**
     * References the property that specifies the full name of the JMX
     * specification implemented by this product.
     * <p>
     * Property Name: <B>jmx.specification.name</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String MIB_CORE_FILE = "mibcore.file";

    /**
     * References the property that specifies the default mib_core file
     * used by the mibgen compiler.
     * <p>
     * Property Name: <B>mibcore.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String UACL_FILE = "jdmk.uacl.file";

    /**
     * References the property that specifies the User ACL file
     * used by the SNMP protocol adaptor.
     * <p>
     * Property Name: <B>jdmk.uacl.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String SECURITY_FILE = "jdmk.security.file";

    /**
     * References the property that specifies the Security file
     * used by the SNMP protocol adaptor.
     * <p>
     * Property Name: <B>jdmk.security.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String ACL_FILE = "jdmk.acl.file";

    /**
     * References the property that specifies the ACL file
     * used by the SNMP protocol adaptor.
     * <p>
     * Property Name: <B>jdmk.acl.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String MLET_LIB_DIR = "jmx.mlet.library.dir";

    /**
     * References the property that specifies the directory where
     * the native libraries will be stored before the MLet Service
     * loads them into memory.
     * <p>
     * Property Name: <B>jmx.mlet.library.dir</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static void load(String file) throws IOException {

    /**
     * Reads the Java DMK property list from a file and
     * adds the read properties as system properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
public class SnmpProperties {

/**
 * This class reads a file containing the property list defined for Java DMK
 * and adds all the read properties to the list of system properties.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String SSL_CIPHER_SUITE = "jdmk.ssl.cipher.suite.";

    /**
     * References the property that specifies the SSL cipher suites to
     * be enabled by the HTTP/SSL connector.
     * <p>
     * Property Name: <B>jdmk.ssl.cipher.suite.</B>
     * <p>
     * The list of SSL cipher suites is specified in the format:
     * <p>
     * <DD><B>jdmk.ssl.cipher.suite.</B>&lt;n&gt;<B>=</B>&lt;cipher suite name&gt;</DD>
     * <p>
     * For example:
     * <p>
     * <DD>jdmk.ssl.cipher.suite.1=SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA</DD>
     * <DD>jdmk.ssl.cipher.suite.2=SSL_RSA_EXPORT_WITH_RC4_40_MD5</DD>
     * <DD>. . .</DD>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String JMX_IMPL_VERSION = "jmx.implementation.version";

    /**
     * References the property that specifies the version of this product
     * implementing the  JMX specification.
     * <p>
     * Property Name: <B>jmx.implementation.version</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String JMX_IMPL_VENDOR = "jmx.implementation.vendor";

    /**
     * References the property that specifies the name of the vendor of this product
     * implementing the  JMX specification.
     * <p>
     * Property Name: <B>jmx.implementation.vendor</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String JMX_IMPL_NAME = "jmx.implementation.name";

    /**
     * References the property that specifies the full name of this product
     * implementing the  JMX specification.
     * <p>
     * Property Name: <B>jmx.implementation.name</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
     public static final String JMX_SPEC_VENDOR = "jmx.specification.vendor";

    /**
     * References the property that specifies the vendor of the JMX
     * specification implemented by this product.
     * <p>
     * Property Name: <B>jmx.specification.vendor</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
     public static final String JMX_SPEC_VERSION = "jmx.specification.version";

    /**
     * References the property that specifies the version of the JMX
     * specification implemented by this product.
     * <p>
     * Property Name: <B>jmx.specification.version</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
     public static final String JMX_SPEC_NAME = "jmx.specification.name";

    /**
     * References the property that specifies the full name of the JMX
     * specification implemented by this product.
     * <p>
     * Property Name: <B>jmx.specification.name</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String MIB_CORE_FILE = "mibcore.file";

    /**
     * References the property that specifies the default mib_core file
     * used by the mibgen compiler.
     * <p>
     * Property Name: <B>mibcore.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String UACL_FILE = "jdmk.uacl.file";

    /**
     * References the property that specifies the User ACL file
     * used by the SNMP protocol adaptor.
     * <p>
     * Property Name: <B>jdmk.uacl.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String SECURITY_FILE = "jdmk.security.file";

    /**
     * References the property that specifies the Security file
     * used by the SNMP protocol adaptor.
     * <p>
     * Property Name: <B>jdmk.security.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String ACL_FILE = "jdmk.acl.file";

    /**
     * References the property that specifies the ACL file
     * used by the SNMP protocol adaptor.
     * <p>
     * Property Name: <B>jdmk.acl.file</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static final String MLET_LIB_DIR = "jmx.mlet.library.dir";

    /**
     * References the property that specifies the directory where
     * the native libraries will be stored before the MLet Service
     * loads them into memory.
     * <p>
     * Property Name: <B>jmx.mlet.library.dir</B>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
    public static void load(String file) throws IOException {

    /**
     * Reads the Java DMK property list from a file and
     * adds the read properties as system properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/defaults/SnmpProperties.java
public class SnmpProperties {

/**
 * This class reads a file containing the property list defined for Java DMK
 * and adds all the read properties to the list of system properties.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 *
 * @since 1.5
 */
