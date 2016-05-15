_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    private String type;

    /**
     * The MIB variable type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    private String name;

    /**
     * The MIB variable name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public String getType() {

    /**
     * Gets the type of the MIB variable.
     * @return The MIB variable type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public String getOid() {

    /**
     * Gets the OID of the MIB variable.
     * @return The MIB variable OID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public String getName() {

    /**
     * Gets the logical name of the MIB variable.
     * @return The MIB variable name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public SnmpOidRecord(String name, String oid, String type) {

    /**
     * Creates an <CODE>SnmpOidRecord</CODE> with the specified MIB variable
     * name, OID and type.
     * @param name The logical name of the MIB variable.
     * @param oid The OID of the MIB variable.
     * @param type The type of the MIB variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
public class SnmpOidRecord {

/**
 * Represents an entry of an {@link com.sun.jmx.snmp.SnmpOidTable SnmpOidTable}. It contains the name of the MIB variable,
 * the corresponding OID and its type.
 * The type is represented using one of the following:
 * <UL>
 *<LI>"C"       for <CODE>Counter32</CODE>
 *<LI>"C64"     for <CODE>Counter64</CODE>
 *<LI>"EN"      for <CODE>Table Entry</CODE>
 *<LI>"G"       for <CODE>Gauge32</CODE>
 *<LI>"I"       for <CODE>Integer32</CODE>
 *<LI>"ID"      for <CODE>OBJECT-IDENTITY</CODE>
 *<LI>"IP"      for <CODE>IpAddress</CODE>
 *<LI>"NT"      for <CODE>NOTIFICATION-TYPE</CODE>
 *<LI>"NU"      for <CODE>Null</CODE>
 *<LI>"O"       for <CODE>Opaque</CODE>
 *<LI>"OI"      for <CODE>Object Identifier</CODE>
 *<LI>"S"       for <CODE>String</CODE>
 *<LI>"T"       for <CODE>TimeTicks</CODE>
 *<LI>"TA"      for <CODE>Table</CODE>
 *<LI>"U"       for <CODE>Unsigned32</CODE>
 *</UL>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.SnmpOidTable
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    private String type;

    /**
     * The MIB variable type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    private String name;

    /**
     * The MIB variable name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public String getType() {

    /**
     * Gets the type of the MIB variable.
     * @return The MIB variable type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public String getOid() {

    /**
     * Gets the OID of the MIB variable.
     * @return The MIB variable OID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public String getName() {

    /**
     * Gets the logical name of the MIB variable.
     * @return The MIB variable name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
    public SnmpOidRecord(String name, String oid, String type) {

    /**
     * Creates an <CODE>SnmpOidRecord</CODE> with the specified MIB variable
     * name, OID and type.
     * @param name The logical name of the MIB variable.
     * @param oid The OID of the MIB variable.
     * @param type The type of the MIB variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidRecord.java
public class SnmpOidRecord {

/**
 * Represents an entry of an {@link com.sun.jmx.snmp.SnmpOidTable SnmpOidTable}. It contains the name of the MIB variable,
 * the corresponding OID and its type.
 * The type is represented using one of the following:
 * <UL>
 *<LI>"C"       for <CODE>Counter32</CODE>
 *<LI>"C64"     for <CODE>Counter64</CODE>
 *<LI>"EN"      for <CODE>Table Entry</CODE>
 *<LI>"G"       for <CODE>Gauge32</CODE>
 *<LI>"I"       for <CODE>Integer32</CODE>
 *<LI>"ID"      for <CODE>OBJECT-IDENTITY</CODE>
 *<LI>"IP"      for <CODE>IpAddress</CODE>
 *<LI>"NT"      for <CODE>NOTIFICATION-TYPE</CODE>
 *<LI>"NU"      for <CODE>Null</CODE>
 *<LI>"O"       for <CODE>Opaque</CODE>
 *<LI>"OI"      for <CODE>Object Identifier</CODE>
 *<LI>"S"       for <CODE>String</CODE>
 *<LI>"T"       for <CODE>TimeTicks</CODE>
 *<LI>"TA"      for <CODE>Table</CODE>
 *<LI>"U"       for <CODE>Unsigned32</CODE>
 *</UL>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.SnmpOidTable
 */