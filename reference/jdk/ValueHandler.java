_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/ValueHandler.java
    java.io.Serializable writeReplace(java.io.Serializable value);

    /**
     * If the value contains a <code>writeReplace</code> method then the result
     * is returned.  Otherwise, the value itself is returned.
     * @param value the value to be marshaled.
     * @return the true value to marshal on the wire.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/ValueHandler.java
    org.omg.SendingContext.RunTime getRunTimeCodeBase();

    /**
     * Returns the CodeBase for this ValueHandler.  This is used by
     * the ORB runtime.  The server sends the service context containing
     * the IOR for this CodeBase on the first GIOP reply.  The client
     * does the same on the first GIOP request.
     * @return the SendingContext.CodeBase of this ValueHandler.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/ValueHandler.java
    boolean isCustomMarshaled(java.lang.Class clz);

    /**
     * Indicates whether the given class performs custom or
     * default marshaling.
     * @param clz the class to test for custom marshaling.
     * @return <code>true</code> if the class performs custom marshaling, <code>false</code>
     * if it does not.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/ValueHandler.java
    java.lang.String getRMIRepositoryID(java.lang.Class clz);

    /**
     * Returns the CORBA RepositoryId for the given Java class.
     * @param clz a Java class.
     * @return the CORBA RepositoryId for the class.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/ValueHandler.java
    java.io.Serializable readValue(org.omg.CORBA.portable.InputStream in,
                                   int offset,
                                   java.lang.Class clz,
                                   String repositoryID,
                                   org.omg.SendingContext.RunTime sender);

    /**
     * Reads a value from the stream using Java semantics.
     * @param in the stream to read the value from.
     * @param offset the current position in the input stream.
     * @param clz the type of the value to be read in.
     * @param repositoryID the RepositoryId of the value to be read in.
     * @param sender the sending context runtime codebase.
     * @return the value read from the stream.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/ValueHandler.java
    void writeValue(org.omg.CORBA.portable.OutputStream out,
                    java.io.Serializable value);

    /**
     * Writes a value to the stream using Java semantics.
     * @param out the stream to write the value to.
     * @param value the value to be written to the stream.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/ValueHandler.java
public interface ValueHandler {

/**
 * Defines methods which allow serialization of Java objects
 * to and from GIOP streams.
 **/
