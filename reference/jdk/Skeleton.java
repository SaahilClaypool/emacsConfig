_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/Skeleton.java
    @Deprecated

    /**
     * Returns the operations supported by the skeleton.
     * @return operations supported by skeleton
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/Skeleton.java
    @Deprecated

    /**
     * Unmarshals arguments, calls the actual remote object implementation,
     * and marshals the return value or any exception.
     *
     * @param obj remote implementation to dispatch call to
     * @param theCall object representing remote call
     * @param opnum operation number
     * @param hash stub/skeleton interface hash
     * @exception java.lang.Exception if a general exception occurs.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/Skeleton.java
@Deprecated

/**
 * The <code>Skeleton</code> interface is used solely by the RMI
 * implementation.
 *
 * <p> Every version 1.1 (and version 1.1 compatible skeletons generated in
 * 1.2 using <code>rmic -vcompat</code>) skeleton class generated by the rmic
 * stub compiler implements this interface. A skeleton for a remote object is
 * a server-side entity that dispatches calls to the actual remote object
 * implementation.
 *
 * @author  Ann Wollrath
 * @since   JDK1.1
 * @deprecated no replacement.  Skeletons are no longer required for remote
 * method calls in the Java 2 platform v1.2 and greater.
 */
