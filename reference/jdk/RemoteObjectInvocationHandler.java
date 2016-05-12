_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    private static class MethodToHash_Maps

    /**
     * A weak hash map, mapping classes to weak hash maps that map
     * method objects to method hashes.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    private static long getMethodHash(Method method) {

    /**
     * Returns the method hash for the specified method.  Subsequent calls
     * to "getMethodHash" passing the same method argument should be faster
     * since this method caches internally the result of the method to
     * method hash mapping.  The method hash is calculated using the
     * "computeMethodHash" method.
     *
     * @param method the remote method
     * @return the method hash for the specified method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    private void readObjectNoData() throws InvalidObjectException {

    /**
     * @throws InvalidObjectException unconditionally
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    private String proxyToString(Object proxy) {

    /**
     * Returns a string representation for a proxy that uses this invocation
     * handler.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    private Object invokeRemoteMethod(Object proxy,
                                      Method method,
                                      Object[] args)

    /**
     * Handles remote methods.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    private Object invokeObjectMethod(Object proxy,
                                      Method method,
                                      Object[] args)

    /**
     * Handles java.lang.Object methods.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    public Object invoke(Object proxy, Method method, Object[] args)

    /**
     * Processes a method invocation made on the encapsulating
     * proxy instance, <code>proxy</code>, and returns the result.
     *
     * <p><code>RemoteObjectInvocationHandler</code> implements this method
     * as follows:
     *
     * <p>If <code>method</code> is one of the following methods, it
     * is processed as described below:
     *
     * <ul>
     *
     * <li>{@link Object#hashCode Object.hashCode}: Returns the hash
     * code value for the proxy.
     *
     * <li>{@link Object#equals Object.equals}: Returns <code>true</code>
     * if the argument (<code>args[0]</code>) is an instance of a dynamic
     * proxy class and this invocation handler is equal to the invocation
     * handler of that argument, and returns <code>false</code> otherwise.
     *
     * <li>{@link Object#toString Object.toString}: Returns a string
     * representation of the proxy.
     * </ul>
     *
     * <p>Otherwise, a remote call is made as follows:
     *
     * <ul>
     * <li>If <code>proxy</code> is not an instance of the interface
     * {@link Remote}, then an {@link IllegalArgumentException} is thrown.
     *
     * <li>Otherwise, the {@link RemoteRef#invoke invoke} method is invoked
     * on this invocation handler's <code>RemoteRef</code>, passing
     * <code>proxy</code>, <code>method</code>, <code>args</code>, and the
     * method hash (defined in section 8.3 of the "Java Remote Method
     * Invocation (RMI) Specification") for <code>method</code>, and the
     * result is returned.
     *
     * <li>If an exception is thrown by <code>RemoteRef.invoke</code> and
     * that exception is a checked exception that is not assignable to any
     * exception in the <code>throws</code> clause of the method
     * implemented by the <code>proxy</code>'s class, then that exception
     * is wrapped in an {@link UnexpectedException} and the wrapped
     * exception is thrown.  Otherwise, the exception thrown by
     * <code>invoke</code> is thrown by this method.
     * </ul>
     *
     * <p>The semantics of this method are unspecified if the
     * arguments could not have been produced by an instance of some
     * valid dynamic proxy class containing this invocation handler.
     *
     * @param proxy the proxy instance that the method was invoked on
     * @param method the <code>Method</code> instance corresponding to the
     * interface method invoked on the proxy instance
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance, or
     * <code>null</code> if the method takes no arguments
     * @return the value to return from the method invocation on the proxy
     * instance
     * @throws  Throwable the exception to throw from the method invocation
     * on the proxy instance
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    public RemoteObjectInvocationHandler(RemoteRef ref) {

    /**
     * Creates a new <code>RemoteObjectInvocationHandler</code> constructed
     * with the specified <code>RemoteRef</code>.
     *
     * @param ref the remote ref
     *
     * @throws NullPointerException if <code>ref</code> is <code>null</code>
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
    private static final MethodToHash_Maps methodToHash_Maps =

    /**
     * A weak hash map, mapping classes to weak hash maps that map
     * method objects to method hashes.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteObjectInvocationHandler.java
public class RemoteObjectInvocationHandler

/**
 * An implementation of the <code>InvocationHandler</code> interface for
 * use with Java Remote Method Invocation (Java RMI).  This invocation
 * handler can be used in conjunction with a dynamic proxy instance as a
 * replacement for a pregenerated stub class.
 *
 * <p>Applications are not expected to use this class directly.  A remote
 * object exported to use a dynamic proxy with {@link UnicastRemoteObject}
 * or {@link Activatable} has an instance of this class as that proxy's
 * invocation handler.
 *
 * @author  Ann Wollrath
 * @since   1.5
 **/
