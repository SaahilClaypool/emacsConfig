_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynValue.java
    void set_members(NameValuePair[] value)

    /**
     * Sets the members of the value object this <code>DynValue</code>
     * object represents to the given array of <code>NameValuePair</code>
         * objects.
     *
     * @param value the array of name-value pairs to be set
     * @throws org.omg.CORBA.DynAnyPackage.InvalidSeq
     *         if an inconsistent value is part of the given array
         * @see #get_members
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynValue.java
    org.omg.CORBA.NameValuePair[] get_members();

    /**
     * Returns an array containing all the members of the value object
     * stored in this <code>DynValue</code>.
     *
     * @return an array of name-value pairs.
         * @see #set_members
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynValue.java
    TCKind current_member_kind();

    /**
     * Returns the <code>TCKind</code> object that describes the current member.
     *
     * @return the <code>TCKind</code> object corresponding to the current
     * member
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynValue.java
    String current_member_name();

    /**
     * Returns the name of the current member while traversing a
     * <code>DynAny</code> object that represents a Value object.
     *
     * @return the name of the current member
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/DynValue.java
@Deprecated

/**
 * The representation of a <code>DynAny</code> object that is associated
 *  with an IDL value type.
 * @deprecated Use the new <a href="../DynamicAny/DynValue.html">DynValue</a> instead
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynValue.java
public interface DynValue extends DynValueOperations, org.omg.DynamicAny.DynValueCommon, org.omg.CORBA.portable.IDLEntity 

/**
    * DynValue objects support the manipulation of IDL non-boxed value types.
    * The DynValue interface can represent both null and non-null value types.
    * For a DynValue representing a non-null value type, the DynValue's components comprise
    * the public and private members of the value type, including those inherited from concrete base value types,
    * in the order of definition. A DynValue representing a null value type has no components
    * and a current position of -1.
    * <P>Warning: Indiscriminantly changing the contents of private value type members can cause the value type
    * implementation to break by violating internal constraints. Access to private members is provided to support
    * such activities as ORB bridging and debugging and should not be used to arbitrarily violate
    * the encapsulation of the value type. 
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynValue.java


/**
* org/omg/DynamicAny/DynValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
