_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
    @Deprecated

    /**
     * Allow cleanup after the remote call has completed.
     *
     * @exception java.io.IOException if an I/O error occurs.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
    @Deprecated

    /**
     * Do whatever it takes to execute the call.
     *
     * @exception java.lang.Exception if a general exception occurs.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
    @Deprecated

    /**
     * Returns an output stream (may put out header information
     * relating to the success of the call). Should only succeed
     * once per remote call.
     *
     * @param success If true, indicates normal return, else indicates
     * exceptional return.
     * @return output stream for writing call result
     * @exception java.io.IOException              if an I/O error occurs.
     * @exception java.io.StreamCorruptedException If already been called.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
    @Deprecated

    /**
     * Release the input stream. This would allow some transports to release
     * the channel early.
     *
     * @exception java.io.IOException if an I/O error occurs.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
    @Deprecated

    /**
     * Get the InputStream that the stub/skeleton should get
     * results/arguments from.
     *
     * @return input stream for reading arguments/results
     * @exception java.io.IOException if an I/O error occurs.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
    @Deprecated

    /**
     * Release the output stream; in some transports this would release
     * the stream.
     *
     * @exception java.io.IOException if an I/O error occurs.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
    @Deprecated

    /**
     * Return the output stream the stub/skeleton should put arguments/results
     * into.
     *
     * @return output stream for arguments/results
     * @exception java.io.IOException if an I/O error occurs.
     * @since JDK1.1
     * @deprecated no replacement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/RemoteCall.java
@Deprecated

/**
 * <code>RemoteCall</code> is an abstraction used solely by the RMI runtime
 * (in conjunction with stubs and skeletons of remote objects) to carry out a
 * call to a remote object.  The <code>RemoteCall</code> interface is
 * deprecated because it is only used by deprecated methods of
 * <code>java.rmi.server.RemoteRef</code>.
 *
 * @since   JDK1.1
 * @author  Ann Wollrath
 * @author  Roger Riggs
 * @see     java.rmi.server.RemoteRef
 * @deprecated no replacement.
 */
