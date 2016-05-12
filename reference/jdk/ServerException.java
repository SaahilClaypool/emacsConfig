_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/ServerException.java
    public ServerException(String s, Exception ex) {

    /**
     * Constructs a <code>ServerException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/ServerException.java
    public ServerException(String s) {

    /**
     * Constructs a <code>ServerException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/ServerException.java
public class ServerException extends RemoteException {

/**
 * A <code>ServerException</code> is thrown as a result of a remote method
 * invocation when a <code>RemoteException</code> is thrown while processing
 * the invocation on the server, either while unmarshalling the arguments or
 * executing the remote method itself.
 *
 * A <code>ServerException</code> instance contains the original
 * <code>RemoteException</code> that occurred as its cause.
 *
 * @author  Ann Wollrath
 * @since   JDK1.1
 */
