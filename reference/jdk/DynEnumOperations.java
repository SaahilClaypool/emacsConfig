_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynEnumOperations.java
  void set_as_ulong (int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
        * Sets the value of the DynEnum as the enumerated value's ordinal value.
        *
        * @exception InvalidValue If value contains a value that is outside the range of ordinal values
        *            for the corresponding enumerated type
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynEnumOperations.java
  int get_as_ulong ();

  /**
        * Returns the value of the DynEnum as the enumerated value's ordinal value.
        * Enumerators have ordinal values 0 to n-1, as they appear from left to right
        * in the corresponding IDL definition.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynEnumOperations.java
  void set_as_string (String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
        * Sets the value of the DynEnum to the enumerated value whose IDL identifier is passed in the value parameter.
        *
        * @exception InvalidValue If value contains a string that is not a valid IDL identifier
        *            for the corresponding enumerated type
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynEnumOperations.java
  String get_as_string ();

  /**
        * Returns the value of the DynEnum as an IDL identifier.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynEnumOperations.java
public interface DynEnumOperations  extends org.omg.DynamicAny.DynAnyOperations

/**
    * DynEnum objects support the manipulation of IDL enumerated values.
    * The current position of a DynEnum is always -1.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/DynamicAny/DynEnumOperations.java


/**
* org/omg/DynamicAny/DynEnumOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
