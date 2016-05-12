_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public static String pduTypeToString(int cmd) {

    /**
     * Returns the <CODE>String</CODE> representation of a PDU type.
     * For instance, if the PDU type is <CODE>SnmpDefinitions.pduGetRequestPdu</CODE>,
     * the method will return "SnmpGet".
     * @param cmd The integer representation of the PDU type.
     * @return The <CODE>String</CODE> representation of the PDU type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int port=0 ;

    /**
     * Source or destination port.
     * <P>For an incoming PDU it's the source.
     * <BR>For an outgoing PDU it's the destination.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public InetAddress address ;

    /**
     * Source or destination address.
     * <P>For an incoming PDU it's the source.
     * <BR>For an outgoing PDU it's the destination.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int requestId=0 ;

    /**
     * Request identifier.
     * Note that this field is not used by <CODE>SnmpPduTrap</CODE>.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public SnmpVarBind[] varBindList ;

    /**
     * List of variables.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int version=0 ;

    /**
     * Protocol version. Versions are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int type=0 ;

    /**
     * PDU type. Types are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
public abstract class SnmpPdu implements SnmpDefinitions, Serializable {

/**
 * Is the fully decoded representation of an SNMP packet.
 * <P>
 * Classes are derived from <CODE>SnmpPdu</CODE> to
 * represent the different forms of SNMP packets
 * ({@link com.sun.jmx.snmp.SnmpPduPacket SnmpPduPacket},
 * {@link com.sun.jmx.snmp.SnmpScopedPduPacket SnmpScopedPduPacket})
 * <BR>The <CODE>SnmpPdu</CODE> class defines the attributes
 * common to every form of SNMP packets.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see SnmpMessage
 * @see SnmpPduFactory
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public static String pduTypeToString(int cmd) {

    /**
     * Returns the <CODE>String</CODE> representation of a PDU type.
     * For instance, if the PDU type is <CODE>SnmpDefinitions.pduGetRequestPdu</CODE>,
     * the method will return "SnmpGet".
     * @param cmd The integer representation of the PDU type.
     * @return The <CODE>String</CODE> representation of the PDU type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int port=0 ;

    /**
     * Source or destination port.
     * <P>For an incoming PDU it's the source.
     * <BR>For an outgoing PDU it's the destination.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public InetAddress address ;

    /**
     * Source or destination address.
     * <P>For an incoming PDU it's the source.
     * <BR>For an outgoing PDU it's the destination.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int requestId=0 ;

    /**
     * Request identifier.
     * Note that this field is not used by <CODE>SnmpPduTrap</CODE>.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public SnmpVarBind[] varBindList ;

    /**
     * List of variables.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int version=0 ;

    /**
     * Protocol version. Versions are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
    public int type=0 ;

    /**
     * PDU type. Types are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPdu.java
public abstract class SnmpPdu implements SnmpDefinitions, Serializable {

/**
 * Is the fully decoded representation of an SNMP packet.
 * <P>
 * Classes are derived from <CODE>SnmpPdu</CODE> to
 * represent the different forms of SNMP packets
 * ({@link com.sun.jmx.snmp.SnmpPduPacket SnmpPduPacket},
 * {@link com.sun.jmx.snmp.SnmpScopedPduPacket SnmpScopedPduPacket})
 * <BR>The <CODE>SnmpPdu</CODE> class defines the attributes
 * common to every form of SNMP packets.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see SnmpMessage
 * @see SnmpPduFactory
 *
 * @since 1.5
 */
