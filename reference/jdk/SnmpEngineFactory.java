_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineFactory.java
    public SnmpEngine createEngine(SnmpEngineParameters p,
                                   InetAddressAcl ipacl);

    /**
     * The engine instantiation method.
     * @param p The parameters used to instantiate a new engine.
     * @param ipacl The Ip ACL to pass to the Access Control Model.
     * @throws IllegalArgumentException Throwed if one of the configuration
     *         file file doesn't exist (Acl files, security file).
     * @return The newly created SnmpEngine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineFactory.java
public interface SnmpEngineFactory {

/**
 * This <CODE>SnmpEngineFactory</CODE> is instantiating an <CODE>SnmpEngine</CODE> containing :
 * <ul>
 * <li> Message Processing Sub System + V1, V2 et V3 Message Processing Models</li>
 * <li> Security Sub System + User based Security Model (Id 3)</li>
 * <li> Access Control Sub System + Ip Acl + User based Access Control Model. See <CODE> IpAcl </CODE> and <CODE> UserAcl </CODE>.</li>
 * </ul>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineFactory.java
    public SnmpEngine createEngine(SnmpEngineParameters p,
                                   InetAddressAcl ipacl);

    /**
     * The engine instantiation method.
     * @param p The parameters used to instantiate a new engine.
     * @param ipacl The Ip ACL to pass to the Access Control Model.
     * @throws IllegalArgumentException Throwed if one of the configuration
     *         file file doesn't exist (Acl files, security file).
     * @return The newly created SnmpEngine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineFactory.java
public interface SnmpEngineFactory {

/**
 * This <CODE>SnmpEngineFactory</CODE> is instantiating an <CODE>SnmpEngine</CODE> containing :
 * <ul>
 * <li> Message Processing Sub System + V1, V2 et V3 Message Processing Models</li>
 * <li> Security Sub System + User based Security Model (Id 3)</li>
 * <li> Access Control Sub System + Ip Acl + User based Access Control Model. See <CODE> IpAcl </CODE> and <CODE> UserAcl </CODE>.</li>
 * </ul>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */