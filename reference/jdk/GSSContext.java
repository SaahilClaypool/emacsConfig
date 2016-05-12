_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean isInitiator() throws GSSException;

    /**
     * Determines if this is the context initiator. This
     * can be called on both the context initiator's and context acceptor's
     * side.
     *
     * @return true if this is the context initiator, false if it is the
     * context acceptor.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public GSSCredential getDelegCred() throws GSSException;

    /**
     * Obtains the credentials delegated by the context
     * initiator to the context acceptor. It should be called only on the
     * context acceptor's side, and once the context is fully
     * established. The caller can use the method {@link
     * #getCredDelegState() getCredDelegState} to determine if there are
     * any delegated credentials.
     *
     * @return a GSSCredential containing the initiator's delegated
     * credentials, or <code>null</code> is no credentials
     * were delegated.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public Oid getMech() throws GSSException;

    /**
     * Determines what mechanism is being used for this
     * context. This method may be called before the context is fully
     * established, but the mechanism returned may change on successive
     * calls in the negotiated mechanism case.
     *
     * @return the Oid of the mechanism being used
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public GSSName getTargName() throws GSSException;

    /**
     * Returns the name of the context acceptor. This call is valid only
     * after one of {@link #isProtReady() isProtReady} or {@link
     * #isEstablished() isEstablished} return <code>true</code>.
     *
     * @return a GSSName that is an MN containing the name of the context
     * acceptor.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public GSSName getSrcName() throws GSSException;

    /**
     * Returns the name of the context initiator. This call is valid only
     * after one of {@link #isProtReady() isProtReady} or {@link
     * #isEstablished() isEstablished} return <code>true</code>.
     *
     * @return a GSSName that is an MN containing the name of the context
     * initiator.
     * @see GSSName
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public int getLifetime();

    /**
     * Determines what the remaining lifetime for this
     * context is. It can be called by both the context initiator and the
     * context acceptor, but for a definitive answer it should be called
     * only after {@link #isEstablished() isEstablished} returns
     * true.<p>
     *
     * @return the remaining lifetime in seconds
     * @see #requestLifetime(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean getIntegState();

    /**
     * Determines if data integrity is available
     * over the context. This method can be called by both the context
     * initiator and the context acceptor, but only after one of {@link
     * #isProtReady() isProtReady} or {@link #isEstablished()
     * isEstablished} return <code>true</code>. This method will always
     * return <code>true</code> if {@link #getConfState() getConfState}
     * returns true.<p>
     *
     * @return true if integrity services are available, false otherwise.
     * @see #requestInteg(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean getConfState();

    /**
     * Determines if data confidentiality is available
     * over the context. This method can be called by both the context
     * initiator and the context acceptor, but only after one of {@link
     * #isProtReady() isProtReady} or {@link #isEstablished()
     * isEstablished} return <code>true</code>. If this method returns
     * <code>true</code>, so will {@link #getIntegState()
     * getIntegState}<p>
     *
     * @return true if confidentiality services are available, false
     * otherwise.
     * @see #requestConf(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean isProtReady();

    /**
     * Determines if the context is ready for per message operations to be
     * used over it.  Some mechanisms may allow the usage of the
     * per-message operations before the context is fully established.
     *
     * @return true if methods like <code>wrap</code>, <code>unwrap</code>,
     * <code>getMIC</code>, and <code>verifyMIC</code> can be used with
     * this context at the current stage of context establishment, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean isTransferable() throws GSSException;

    /**
     * Determines if the context is transferable to other processes
     * through the use of the {@link #export() export} method.  This call
     * is only valid on fully established contexts.
     *
     * @return true if this context can be exported, false otherwise.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean getAnonymityState();

    /**
     * Determines if the context initiator is
     * anonymously authenticated to the context acceptor. It can be called by
     * both the context initiator and the context acceptor, and at any
     * time. <strong>On the initiator side, a call to this method determines
     * if the identity of the initiator has been disclosed in any of the
     * context establishment tokens that might have been generated thus far
     * by <code>initSecContext</code>. An initiator that absolutely must be
     * authenticated anonymously should call this method after each call to
     * <code>initSecContext</code> to determine if the generated token
     * should be sent to the peer or the context aborted.</strong> On the
     * acceptor side, a call to this method determines if any of the tokens
     * processed by <code>acceptSecContext</code> thus far have divulged
     * the identity of the initiator.<p>
     *
     * @return true if the context initiator is still anonymous, false
     * otherwise.
     * @see #requestAnonymity(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean getSequenceDetState();

    /**
     * Determines if sequence checking is enabled for the
     * per-message security services from this context. It can be called by
     * both the context initiator and the context acceptor. For a
     * definitive answer this method must be called only after context
     * establishment is complete. An initiator that requests sequence
     * checking can call this method after context completion and
     * dispose the context if its request was not honored.<p>
     *
     * @return true if sequence checking is enabled, false otherwise.
     * @see #requestSequenceDet(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean getReplayDetState();

    /**
     * Determines if replay detection is enabled for the
     * per-message security services from this context. It can be called by
     * both the context initiator and the context acceptor. For a
     * definitive answer this method must be called only after context
     * establishment is complete. An initiator that requests replay
     * detection can call this method after context completion and
     * dispose the context if its request was not honored.<p>
     *
     * @return true if replay detection is enabled, false otherwise.
     * @see #requestReplayDet(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean getMutualAuthState();

    /**
     * Determines if mutual authentication is enabled on
     * this context. It can be called by both the context initiator and the
     * context acceptor. For a definitive answer this method must be
     * called only after context establishment is complete. An initiator
     * that requests mutual authentication can call this method after
     * context completion and dispose the context if its request was not
     * honored.<p>
     *
     * @return true if mutual authentication is enabled, false otherwise.
     * @see #requestMutualAuth(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean getCredDelegState();

    /**
     * Determines if credential delegation is enabled on
     * this context. It can be called by both the context initiator and the
     * context acceptor. For a definitive answer this method must be
     * called only after context establishment is complete. Note that if an
     * initiator requests that delegation not be allowed the {@link
     * #requestCredDeleg(boolean) requestCredDeleg} method will honor that
     * request and this method will return <code>false</code> on the
     * initiator's side from that point onwards. <p>
     *
     * @return true if delegation is enabled, false otherwise.
     * @see #requestCredDeleg(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void setChannelBinding(ChannelBinding cb) throws GSSException;

    /**
     * Sets the channel bindings to be used during context
     * establishment. This method can be called on both
     * the context initiator's and the context acceptor's side, but it must
     * be called before context establishment begins. This means that an
     * initiator must call it before the first call to
     * <code>initSecContext</code> and the acceptor must call it before the
     * first call to <code>acceptSecContext</code>.
     *
     * @param cb the channel bindings to use.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestLifetime(int lifetime) throws GSSException;

    /**
     * Requests a lifetime in seconds for the
     * context. This method can only be called on the context initiator's
     * side  and it has to be done prior to the first call to
     * <code>initSecContext</code>.<p>
     *
     * The actual lifetime of the context will depend on the capabilities of
     * the underlying mechanism and the application should call the {@link
     * #getLifetime() getLifetime} method to determine this.<p>
     *
     * @param lifetime the desired context lifetime in seconds. Use
     * <code>INDEFINITE_LIFETIME</code> to request an indefinite lifetime
     * and <code>DEFAULT_LIFETIME</code> to request a default lifetime.
     * @see #getLifetime()
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestInteg(boolean state) throws GSSException;

    /**
     * Requests that data integrity be enabled
     * for the <code>wrap</code> and <code>getMIC</code>methods. This
     * request can only be made on the context initiator's side and it has
     * to be done prior to the first call to <code>initSecContext</code>.
     *
     * Not all mechanisms support integrity and other mechanisms
     * might enable it even if the application doesn't request
     * it. The application may check to see if the request was honored with
     * the {@link #getIntegState() getIntegState} method.<p>
     *
     * Disabling integrity will also automatically disable
     * confidentiality.<p>
     *
     * @param state a boolean value indicating whether integrity
     * should be enabled or not.
     * @see #getIntegState()
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestConf(boolean state) throws GSSException;

    /**
     * Requests that data confidentiality be enabled
     * for the <code>wrap</code> method. This request can only be made on
     * the context initiator's side and it has to be done prior to the
     * first call to <code>initSecContext</code>.
     *
     * Not all mechanisms support confidentiality and other mechanisms
     * might enable it even if the application doesn't request
     * it. The application may check to see if the request was honored with
     * the {@link #getConfState() getConfState} method. If confidentiality
     * is enabled, only then will the mechanism honor a request for privacy
     * in the {@link MessageProp#MessageProp(int, boolean) MessageProp}
     * object that is passed in to the <code>wrap</code> method.<p>
     *
     * Enabling confidentiality will also automatically enable
     * integrity.<p>
     *
     * @param state a boolean value indicating whether confidentiality
     * should be enabled or not.
     * @see #getConfState()
     * @see #getIntegState()
     * @see #requestInteg(boolean)
     * @see MessageProp
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestAnonymity(boolean state) throws GSSException;

    /**
     * Requests that the initiator's identity not be
     * disclosed to the acceptor. This request can only be made on the
     * context initiator's side and it has to be done prior to the first
     * call to <code>initSecContext</code>.
     *
     * Not all mechanisms support anonymity for the initiator. Therefore, the
     * application should check to see if the request was honored with the
     * {@link #getAnonymityState() getAnonymityState} method.<p>
     *
     * @param state a boolean value indicating if the initiator should
     * be authenticated to the acceptor as an anonymous principal.
     * @see #getAnonymityState
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestCredDeleg(boolean state) throws GSSException;

    /**
     * Requests that the initiator's credentials be
     * delegated to the acceptor during context establishment. This
     * request can only be made on the context initiator's side and it has
     * to be done prior to the first call to
     * <code>initSecContext</code>.
     *
     * Not all mechanisms support credential delegation. Therefore, an
     * application that desires delegation should check to see if the
     * request was honored with the {@link #getCredDelegState()
     * getCredDelegState} method. If the application indicates that
     * delegation must not be used, then the mechanism will honor the
     * request and delegation will not occur. This is an exception
     * to the general rule that a mechanism may enable a service even if it
     * is not requested.<p>
     *
     * @param state a boolean value indicating whether the credentials
     * should be delegated or not.
     * @see #getCredDelegState()
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestSequenceDet(boolean state) throws GSSException;

    /**
     * Requests that sequence checking be enabled for the
     * per-message security services after context establishment. This
     * request can only be made on the context initiator's side and it has
     * to be done prior to the first call to
     * <code>initSecContext</code>. During context establishment sequence
     * checking is not an option and is a function of the underlying
     * mechanism's capabilities.<p>
     *
     * Not all mechanisms support sequence checking and some mechanisms
     * might require sequence checking even if the application
     * doesn't. Therefore, the application should check to see if the
     * request was honored with the {@link #getSequenceDetState()
     * getSequenceDetState} method. If sequence checking is enabled then the
     * {@link MessageProp#isDuplicateToken() MessageProp.isDuplicateToken},
     * {@link MessageProp#isOldToken() MessageProp.isOldToken},
     * {@link MessageProp#isUnseqToken() MessageProp.isUnseqToken}, and
     * {@link MessageProp#isGapToken() MessageProp.isGapToken} methods will return
     * valid results for the <code>MessageProp</code> object that is passed
     * in to the <code>unwrap</code> method or the <code>verifyMIC</code>
     * method.<p>
     *
     * @param state a boolean value indicating whether sequence checking
     * should be enabled over the established context or not.
     * @see #getSequenceDetState()
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestReplayDet(boolean state) throws GSSException;

    /**
     * Requests that replay detection be enabled for the
     * per-message security services after context establishment. This
     * request can only be made on the context initiator's side and it has
     * to be done prior to the first call to
     * <code>initSecContext</code>. During context establishment replay
     * detection is not an option and is a function of the underlying
     * mechanism's capabilities.<p>
     *
     * Not all mechanisms support replay detection and some mechanisms
     * might require replay detection even if the application
     * doesn't. Therefore, the application should check to see if the
     * request was honored with the {@link #getReplayDetState()
     * getReplayDetState} method. If replay detection is enabled then the
     * {@link MessageProp#isDuplicateToken() MessageProp.isDuplicateToken} and {@link
     * MessageProp#isOldToken() MessageProp.isOldToken} methods will return
     * valid results for the <code>MessageProp</code> object that is passed
     * in to the <code>unwrap</code> method or the <code>verifyMIC</code>
     * method.<p>
     *
     * @param state a boolean value indicating whether replay detection
     * should be enabled over the established context or not.
     * @see #getReplayDetState()
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void requestMutualAuth(boolean state) throws GSSException;

    /**
     * Requests that mutual authentication be done during
     * context establishment. This request can only be made on the context
     * initiator's side and it has to be done prior to the first call to
     * <code>initSecContext</code>.<p>
     *
     * Not all mechanisms support mutual authentication and some mechanisms
     * might require mutual authentication even if the application
     * doesn't. Therefore, the application should check to see if the
     * request was honored with the {@link #getMutualAuthState()
     * getMutualAuthState} method.<p>
     *
     * @param state a boolean value indicating whether mutual
     * authentication should be used or not.
     * @see #getMutualAuthState()
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public byte [] export() throws GSSException;

    /**
     * Exports this context so that another process may
     * import it.. Provided to support the sharing of work between
     * multiple processes. This routine will typically be used by the
     * context-acceptor, in an application where a single process receives
     * incoming connection requests and accepts security contexts over
     * them, then passes the established context to one or more other
     * processes for message exchange.<p>
     *
     * This method deactivates the security context and creates an
     * interprocess token which, when passed to {@link
     * GSSManager#createContext(byte[]) GSSManager.createContext} in
     * another process, will re-activate the context in the second process.
     * Only a single instantiation of a given context may be active at any
     * one time; a subsequent attempt by a context exporter to access the
     * exported security context will fail.<p>
     *
     * The implementation may constrain the set of processes by which the
     * interprocess token may be imported, either as a function of local
     * security policy, or as a result of implementation decisions.  For
     * example, some implementations may constrain contexts to be passed
     * only between processes that run under the same account, or which are
     * part of the same process group.<p>
     *
     * The interprocess token may contain security-sensitive information
     * (for example cryptographic keys).  While mechanisms are encouraged
     * to either avoid placing such sensitive information within
     * interprocess tokens, or to encrypt the token before returning it to
     * the application, in a typical GSS-API implementation this may not be
     * possible.  Thus the application must take care to protect the
     * interprocess token, and ensure that any process to which the token
     * is transferred is trustworthy. <p>
     *
     * Implementations are not required to support the inter-process
     * transfer of security contexts.  Calling the {@link #isTransferable()
     * isTransferable} method will indicate if the context object is
     * transferable.<p>
     *
     * Calling this method on a context that
     * is not exportable will result in this exception being thrown with
     * the error code {@link GSSException#UNAVAILABLE
     * GSSException.UNAVAILABLE}.
     *
     * @return a byte[] containing the exported context
     * @see GSSManager#createContext(byte[])
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#UNAVAILABLE GSSException.UNAVAILABLE},
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#NO_CONTEXT GSSException.NO_CONTEXT},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void verifyMIC(InputStream tokStream, InputStream msgStream,
                          MessageProp msgProp) throws GSSException;

    /**
     * Uses streams to verify the cryptographic MIC, contained in the token
     * parameter, over the supplied message.  This method is equivalent to
     * the byte array based {@link #verifyMIC(byte[], int, int, byte[], int,
     * int, MessageProp) verifyMIC} method.
     *
     * The MessageProp object is instantiated by the application and is used
     * by the underlying mechanism to return information to the caller such
     * as the QOP indicating the strength of protection that was applied to
     * the message and other supplementary message state information.<p>
     *
     * Since some application-level protocols may wish to use tokens emitted
     * by getMIC to provide "secure framing", implementations should support
     * the calculation and verification of MICs over zero-length messages.<p>
     *
     * The format of the input token that this method
     * reads is defined in the specification for the underlying mechanism that
     * will be used. This method will attempt to read one of these tokens per
     * invocation. If the mechanism token contains a definitive start and
     * end this method may block on the <code>InputStream</code> if only
     * part of the token is available. If the start and end of the token
     * are not definitive then the method will attempt to treat all
     * available bytes as part of the token.<p>
     *
     * Other than the possible blocking behavior described above, this
     * method is equivalent to the byte array based {@link #verifyMIC(byte[],
     * int, int, byte[], int, int, MessageProp) verifyMIC} method.<p>
     *
     * @param tokStream an InputStream containing the token generated by the
     * peer's getMIC method.
     * @param msgStream an InputStream containing the application message to
     * verify the cryptographic MIC over. All of the data
     * that is available in msgStream is used.
     * @param msgProp upon return from the method, this object will contain
     * the applied QOP and supplementary information stating if the token
     * was a duplicate, old, out of sequence or arriving after a gap.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN}
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC}
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED}
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void verifyMIC(byte[] inToken, int tokOffset, int tokLen,
                          byte[] inMsg, int msgOffset, int msgLen,
                          MessageProp msgProp) throws GSSException;

    /**
     * Verifies the cryptographic MIC, contained in the token parameter,
     * over the supplied message.<p>
     *
     * The MessageProp object is instantiated by the application and is used
     * by the underlying mechanism to return information to the caller such
     * as the QOP indicating the strength of protection that was applied to
     * the message and other supplementary message state information.<p>
     *
     * Since some application-level protocols may wish to use tokens emitted
     * by getMIC to provide "secure framing", implementations should support
     * the calculation and verification of MICs over zero-length messages.
     *
     * @param inToken the token generated by peer's getMIC method.
     * @param tokOffset the offset within the inToken where the token
     * begins.
     * @param tokLen the length of the token.
     * @param inMsg the application message to verify the cryptographic MIC
     * over.
     * @param msgOffset the offset in inMsg where the message begins.
     * @param msgLen the length of the message.
     * @param msgProp upon return from the method, this object will contain
     * the applied QOP and supplementary information stating if the token
     * was a duplicate, old, out of sequence or arriving after a gap.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN}
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC}
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED}
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void getMIC(InputStream inStream, OutputStream outStream,
                       MessageProp msgProp) throws GSSException;

    /**
     * Uses streams to produce a token containing a cryptographic MIC for
     * the supplied message, for transfer to the peer application.
     * Unlike wrap, which encapsulates the user message in the returned
     * token, only the message MIC is produced in the output token. This
     * method is equivalent to the byte array based {@link #getMIC(byte[],
     * int, int, MessageProp) getMIC} method.
     *
     * Note that privacy can only be applied through the wrap call.<p>
     *
     * Since some application-level protocols may wish to use tokens emitted
     * by getMIC to provide "secure framing", implementations should support
     * derivation of MICs from zero-length messages.
     *
     * @param inStream an InputStream containing the message to generate the
     * MIC over. All of the data that is available in
     * inStream is used.
     * @param outStream an OutputStream to write the output token to.
     * @param msgProp an instance of <code>MessageProp</code> that is used
     * by the application to set the desired QOP.  Set the desired QOP to
     * <code>0</code> in <code>msgProp</code> to request the default
     * QOP. Alternatively pass in <code>null</code> for <code>msgProp</code>
     * to request the default QOP.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#BAD_QOP GSSException.BAD_QOP},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public byte[] getMIC(byte []inMsg, int offset, int len,
                         MessageProp msgProp) throws GSSException;

    /**
     * Returns a token containing a cryptographic Message Integrity Code
     * (MIC) for the supplied message,  for transfer to the peer
     * application.  Unlike wrap, which encapsulates the user message in the
     * returned token, only the message MIC is returned in the output
     * token.<p>
     *
     * Note that privacy can only be applied through the wrap call.<p>
     *
     * Since some application-level protocols may wish to use tokens emitted
     * by getMIC to provide "secure framing", implementations should support
     * derivation of MICs from zero-length messages.
     *
     * @param inMsg the message to generate the MIC over.
     * @param offset offset within the inMsg where the message begins.
     * @param len the length of the message
     * @param msgProp an instance of <code>MessageProp</code> that is used
     * by the application to set the desired QOP.  Set the desired QOP to
     * <code>0</code> in <code>msgProp</code> to request the default
     * QOP. Alternatively pass in <code>null</code> for <code>msgProp</code>
     * to request the default QOP.
     * @return a byte[] containing the token to be sent to the peer.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#BAD_QOP GSSException.BAD_QOP},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void unwrap(InputStream inStream, OutputStream outStream,
                       MessageProp msgProp) throws GSSException;

    /**
     * Uses streams to process tokens generated by the <code>wrap</code>
     * method on the other side of the context. The method will return the
     * message supplied by the peer application to its wrap call, while at
     * the same time verifying the embedded MIC for that message.<p>
     *
     * The MessageProp object is instantiated by the application and is
     * used by the underlying mechanism to return information to the caller
     * such as the QOP, whether confidentiality was applied to the message,
     * and other supplementary message state information.<p>
     *
     * Since some application-level protocols may wish to use tokens
     * emitted by wrap to provide "secure framing", implementations should
     * support the wrapping and unwrapping of zero-length messages.<p>
     *
     * The format of the input token that this method
     * reads is defined in the specification for the underlying mechanism that
     * will be used. This method will attempt to read one of these tokens per
     * invocation. If the mechanism token contains a definitive start and
     * end this method may block on the <code>InputStream</code> if only
     * part of the token is available. If the start and end of the token
     * are not definitive then the method will attempt to treat all
     * available bytes as part of the token.<p>
     *
     * Other than the possible blocking behavior described above, this
     * method is equivalent to the byte array based {@link #unwrap(byte[],
     * int, int, MessageProp) unwrap} method.<p>
     *
     * @param inStream an InputStream that contains the wrap token generated
     * by the peer.
     * @param outStream an OutputStream to write the application message
     * to.
     * @param msgProp upon return from the method, this object will contain
     * the applied QOP, the privacy state of the message, and supplementary
     * information stating if the token was a duplicate, old, out of
     * sequence or arriving after a gap.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN},
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC},
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public byte [] unwrap(byte[] inBuf, int offset, int len,
                          MessageProp msgProp) throws GSSException;

    /**
     * Used to process tokens generated by the <code>wrap</code> method on
     * the other side of the context. The method will return the message
     * supplied by the peer application to its wrap call, while at the same
     * time verifying the embedded MIC for that message.<p>
     *
     * The MessageProp object is instantiated by the application and is
     * used by the underlying mechanism to return information to the caller
     * such as the QOP, whether confidentiality was applied to the message,
     * and other supplementary message state information.<p>
     *
     * Since some application-level protocols may wish to use tokens
     * emitted by wrap to provide "secure framing", implementations should
     * support the wrapping and unwrapping of zero-length messages.<p>
     *
     * @param inBuf a byte array containing the wrap token received from
     * peer.
     * @param offset the offset where the token begins.
     * @param len the length of the token
     * @param msgProp upon return from the method, this object will contain
     * the applied QOP, the privacy state of the message, and supplementary
     * information stating if the token was a duplicate, old, out of
     * sequence or arriving after a gap.
     * @return a byte[] containing the message unwrapped from the input
     * token.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN},
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC},
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void wrap(InputStream inStream, OutputStream outStream,
                     MessageProp msgProp) throws GSSException;

    /**
     * Applies per-message security services over the established security
     * context using streams. The method will return a
     * token with the application supplied data and a cryptographic MIC over it.
     * The data may be encrypted if confidentiality
     * (privacy) was requested. This method is equivalent to the byte array
     * based {@link #wrap(byte[], int, int, MessageProp) wrap} method.<p>
     *
     * The application will be responsible for sending the token to the
     * peer.  Typically, the application would
     * ensure this by calling the  {@link java.io.OutputStream#flush() flush}
     * method on an <code>OutputStream</code> that encapsulates the
     * connection between the two peers.<p>
     *
     * The MessageProp object is instantiated by the application and used
     * to specify a QOP value which selects cryptographic algorithms, and a
     * privacy service to optionally encrypt the message.  The underlying
     * mechanism that is used in the call may not be able to provide the
     * privacy service.  It sets the actual privacy service that it does
     * provide in this MessageProp object which the caller should then
     * query upon return.  If the mechanism is not able to provide the
     * requested QOP, it throws a GSSException with the BAD_QOP code.<p>
     *
     * Since some application-level protocols may wish to use tokens
     * emitted by wrap to provide "secure framing", implementations should
     * support the wrapping of zero-length messages.<p>
     *
     * @param inStream an InputStream containing the application data to be
     * protected. All of the data that is available in
     * inStream is used.
     * @param outStream an OutputStream to write the protected message
     * to.
     * @param msgProp instance of MessageProp that is used by the
     * application to set the desired QOP and privacy state. Set the
     * desired QOP to 0 to request the default QOP. Upon return from this
     * method, this object will contain the the actual privacy state that
     * was applied to the message by the underlying mechanism.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#BAD_QOP GSSException.BAD_QOP},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public byte[] wrap(byte inBuf[], int offset, int len,
                       MessageProp msgProp) throws GSSException;

    /**
     * Applies per-message security services over the established security
     * context. The method will return a token with the
     * application supplied data and a cryptographic MIC over it.
     * The data may be encrypted if confidentiality (privacy) was
     * requested.<p>
     *
     * The MessageProp object is instantiated by the application and used
     * to specify a QOP value which selects cryptographic algorithms, and a
     * privacy service to optionally encrypt the message.  The underlying
     * mechanism that is used in the call may not be able to provide the
     * privacy service.  It sets the actual privacy service that it does
     * provide in this MessageProp object which the caller should then
     * query upon return.  If the mechanism is not able to provide the
     * requested QOP, it throws a GSSException with the BAD_QOP code.<p>
     *
     * Since some application-level protocols may wish to use tokens
     * emitted by wrap to provide "secure framing", implementations should
     * support the wrapping of zero-length messages.<p>
     *
     * The application will be responsible for sending the token to the
     * peer.
     *
     * @param inBuf application data to be protected.
     * @param offset the offset within the inBuf where the data begins.
     * @param len the length of the data
     * @param msgProp instance of MessageProp that is used by the
     * application to set the desired QOP and privacy state. Set the
     * desired QOP to 0 to request the default QOP. Upon return from this
     * method, this object will contain the the actual privacy state that
     * was applied to the message by the underlying mechanism.
     * @return a byte[] containing the token to be sent to the peer.
     *
     * @throws GSSException containing the following major error codes:
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#BAD_QOP GSSException.BAD_QOP},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public int getWrapSizeLimit(int qop, boolean confReq,
                                int maxTokenSize) throws GSSException;

    /**
     * Used to determine limits on the size of the message
     * that can be passed to <code>wrap</code>. Returns the maximum
     * message size that, if presented to the <code>wrap</code> method with
     * the same <code>confReq</code> and <code>qop</code> parameters, will
     * result in an output token containing no more
     * than <code>maxTokenSize</code> bytes.<p>
     *
     * This call is intended for use by applications that communicate over
     * protocols that impose a maximum message size.  It enables the
     * application to fragment messages prior to applying protection.<p>
     *
     * GSS-API implementations are recommended but not required to detect
     * invalid QOP values when <code>getWrapSizeLimit</code> is called.
     * This routine guarantees only a maximum message size, not the
     * availability of specific QOP values for message protection.<p>
     *
     * @param qop the level of protection wrap will be asked to provide.
     * @param confReq <code>true</code> if wrap will be asked to provide
     * privacy, <code>false</code>  otherwise.
     * @param maxTokenSize the desired maximum size of the token emitted by
     * wrap.
     * @return the maximum size of the input token for the given output
     * token size
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#CONTEXT_EXPIRED GSSException.CONTEXT_EXPIRED},
     *   {@link GSSException#BAD_QOP GSSException.BAD_QOP},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public void dispose() throws GSSException;

    /**
     * Releases any system resources and cryptographic information stored in
     * the context object and invalidates the context.
     *
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public boolean isEstablished();

    /**
     * Used during context establishment to determine the state of the
     * context.
     *
     * @return <code>true</code> if this is a fully established context on
     * the caller's side and no more tokens are needed from the peer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    /* Missing return value in RFC. int should have been returned.

    /**
     * Called by the context acceptor to process a token from the peer using
     * streams.   It may write an output token to the
     * <code>OutputStream</code>, which the application
     * will need to send to the peer for processing by its
     * <code>initSecContext</code> method.  Typically, the application would
     * ensure this by calling the  {@link java.io.OutputStream#flush() flush}
     * method on an <code>OutputStream</code> that encapsulates the
     * connection between the two peers. The application can call
     * {@link #isEstablished() isEstablished} to determine if the context
     * establishment phase is complete on this side of the context. A
     * return  value of <code>false</code> from <code>isEstablished</code>
     * indicates that more tokens are expected to be supplied to
     * <code>acceptSecContext</code>.
     * Upon completion of the context establishment, the available context
     * options may be queried through the get methods.<p>
     *
     * Note that it is possible that <code>acceptSecContext</code> return a
     * token for the peer, and <code>isEstablished</code> return
     * <code>true</code> also.  This indicates that the token needs to be
     * sent to the peer, but the local end of the context is now fully
     * established.<p>
     *
     * The GSS-API authentication tokens contain a definitive start and
     * end. This method will attempt to read one of these tokens per
     * invocation, and may block on the stream if only part of the token is
     * available. In all other respects this method is equivalent to the byte
     * array based {@link #acceptSecContext(byte[], int, int)
     * acceptSecContext}.<p>
     *
     * Some mechanism providers might require that the caller be granted
     * permission to accept a security context. A failed permission check
     * might cause a {@link java.lang.SecurityException SecurityException}
     * to be thrown from this method.<p>
     *
     * The following example code demonstrates how this method might be
     * used:<p>
     * <pre>
     *     InputStream is ...
     *     OutputStream os ...
     *     GSSContext context ...
     *
     *     // Loop while there is still a token to be processed
     *
     *     while (!context.isEstablished()) {
     *
     *         context.acceptSecContext(is, os);
     *
     *         // send output token if generated
     *         os.flush();
     *     }
     * </pre>
     *
     *
     * @param inStream an InputStream that contains the token generated by
     * the peer.
     * @param outStream an OutputStream where the output token will be
     * written. During the final stage of context establishment, there may be
     * no bytes written.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN},
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC},
     *   {@link GSSException#NO_CRED GSSException.NO_CRED},
     *   {@link GSSException#CREDENTIALS_EXPIRED
     *                           GSSException.CREDENTIALS_EXPIRED},
     *   {@link GSSException#BAD_BINDINGS GSSException.BAD_BINDINGS},
     *   {@link GSSException#OLD_TOKEN GSSException.OLD_TOKEN},
     *   {@link GSSException#DUPLICATE_TOKEN GSSException.DUPLICATE_TOKEN},
     *   {@link GSSException#BAD_MECH GSSException.BAD_MECH},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public byte[] acceptSecContext(byte inToken[], int offset, int len)

    /**
     * Called by the context acceptor upon receiving a token from the
     * peer. This method may return an output token which the application
     * will need to send to the peer for further processing by its
     * <code>initSecContext</code> call.<p>
     *
     * The application can call {@link #isEstablished() isEstablished} to
     * determine if the context establishment phase is complete for this
     * peer.  A return value of <code>false</code> from
     * <code>isEstablished</code> indicates that more tokens are expected to
     * be supplied to this method.    Upon completion of the context
     * establishment, the available context options may be queried through
     * the get methods.<p>
     *
     * Note that it is possible that <code>acceptSecContext</code> return a
     * token for the peer, and <code>isEstablished</code> return
     * <code>true</code> also.  This indicates that the token needs to be
     * sent to the peer, but the local end of the context is now fully
     * established.<p>
     *
     * Some mechanism providers might require that the caller be granted
     * permission to accept a security context. A failed permission check
     * might cause a {@link java.lang.SecurityException SecurityException}
     * to be thrown from this method.<p>
     *
     * The following example code demonstrates how this method might be
     * used:<p>
     * <pre>
     *     byte[] inToken;
     *     byte[] outToken;
     *     GSSContext context ...
     *
     *     // Loop while there is still a token to be processed
     *
     *     while (!context.isEstablished()) {
     *         inToken = readToken();
     *         outToken = context.acceptSecContext(inToken, 0,
     *                                             inToken.length);
     *         // send output token if generated
     *         if (outToken != null)
     *             sendToken(outToken);
     *     }
     * </pre>
     *
     *
     * @return a byte[] containing the token to be sent to the
     * peer. <code>null</code> indicates that no token is generated.
     * @param inToken token generated by the peer.
     * @param offset the offset within the inToken where the token begins.
     * @param len the length of the token.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN},
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC},
     *   {@link GSSException#NO_CRED GSSException.NO_CRED},
     *   {@link GSSException#CREDENTIALS_EXPIRED
     *                               GSSException.CREDENTIALS_EXPIRED},
     *   {@link GSSException#BAD_BINDINGS GSSException.BAD_BINDINGS},
     *   {@link GSSException#OLD_TOKEN GSSException.OLD_TOKEN},
     *   {@link GSSException#DUPLICATE_TOKEN GSSException.DUPLICATE_TOKEN},
     *   {@link GSSException#BAD_MECH GSSException.BAD_MECH},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public int initSecContext(InputStream inStream,
                              OutputStream outStream) throws GSSException;

    /**
     * Called by the context initiator to start the context creation
     * phase and process any tokens generated
     * by the peer's <code>acceptSecContext</code> method using
     * streams. This method may write an output token to the
     * <code>OutpuStream</code>, which the application will
     * need to send to the peer for processing by its
     * <code>acceptSecContext</code> call. Typically, the application would
     * ensure this by calling the  {@link java.io.OutputStream#flush() flush}
     * method on an <code>OutputStream</code> that encapsulates the
     * connection between the two peers. The application can
     * determine if a token is written to the OutputStream from the return
     * value of this method. A return value of <code>0</code> indicates that
     * no token was written. The application can call
     * {@link #isEstablished() isEstablished} to determine if the context
     * establishment phase is complete on this side of the context. A
     * return  value of <code>false</code> from <code>isEstablished</code>
     * indicates that more tokens are expected to be supplied to
     * <code>initSecContext</code>.
     * Upon completion of the context establishment, the available context
     * options may be queried through the get methods.<p>
     *
     * Note that it is possible that the <code>initSecContext</code> method
     * return a token for the peer, and <code>isEstablished</code> return
     * <code>true</code> also. This indicates that the token needs to be sent
     * to the peer, but the local end of the context is now fully
     * established.<p>
     *
     * The GSS-API authentication tokens contain a definitive start and
     * end. This method will attempt to read one of these tokens per
     * invocation, and may block on the stream if only part of the token is
     * available.  In all other respects this method is equivalent to the
     * byte array based {@link #initSecContext(byte[], int, int)
     * initSecContext}.<p>
     *
     * Some mechanism providers might require that the caller be granted
     * permission to initiate a security context. A failed permission check
     * might cause a {@link java.lang.SecurityException SecurityException}
     * to be thrown from this method.<p>
     *
     * The following example code demonstrates how this method might be
     * used:<p>
     * <pre>
     *     InputStream is ...
     *     OutputStream os ...
     *     GSSContext context ...
     *
     *     // Loop while there is still a token to be processed
     *
     *     while (!context.isEstablished()) {
     *
     *         context.initSecContext(is, os);
     *
     *         // send output token if generated
     *         os.flush();
     *     }
     * </pre>
     *
     *
     * @return the number of bytes written to the OutputStream as part of the
     * token to be sent to the peer. A value of 0 indicates that no token
     * needs to be sent.
     * @param inStream an InputStream that contains the token generated by
     * the peer. This parameter is ignored on the first call since no token
     * has been or will be received from the peer at that point.
     * @param outStream an OutputStream where the output token will be
     * written. During the final stage of context establishment, there may be
     * no bytes written.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN},
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC},
     *   {@link GSSException#NO_CRED GSSException.NO_CRED},
     *   {@link GSSException#CREDENTIALS_EXPIRED GSSException.CREDENTIALS_EXPIRED},
     *   {@link GSSException#BAD_BINDINGS GSSException.BAD_BINDINGS},
     *   {@link GSSException#OLD_TOKEN GSSException.OLD_TOKEN},
     *   {@link GSSException#DUPLICATE_TOKEN GSSException.DUPLICATE_TOKEN},
     *   {@link GSSException#BAD_NAMETYPE GSSException.BAD_NAMETYPE},
     *   {@link GSSException#BAD_MECH GSSException.BAD_MECH},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public byte[] initSecContext(byte inputBuf[], int offset, int len)

    /**
     * Called by the context initiator to start the context creation
     * phase and process any tokens generated
     * by the peer's <code>acceptSecContext</code> method.
     * This method may return an output token which the application will need
     * to send to the peer for processing by its <code>acceptSecContext</code>
     * method. The application can call {@link #isEstablished()
     * isEstablished} to determine if the context establishment phase is
     * complete on this side of the context.  A return value of
     * <code>false</code> from <code>isEstablished</code> indicates that
     * more tokens are expected to be supplied to
     * <code>initSecContext</code>.  Upon completion of the context
     * establishment, the available context options may be queried through
     * the get methods.<p>
     *
     * Note that it is possible that the <code>initSecContext</code> method
     * return a token for the peer, and <code>isEstablished</code> return
     * <code>true</code> also. This indicates that the token needs to be sent
     * to the peer, but the local end of the context is now fully
     * established.<p>
     *
     * Some mechanism providers might require that the caller be granted
     * permission to initiate a security context. A failed permission check
     * might cause a {@link java.lang.SecurityException SecurityException}
     * to be thrown from this method.<p>
     *
     * @return a byte[] containing the token to be sent to the
     * peer. <code>null</code> indicates that no token is generated.
     * @param inputBuf token generated by the peer. This parameter is ignored
     * on the first call since no token has been received from the peer.
     * @param offset the offset within the inputBuf where the token begins.
     * @param len the length of the token.
     *
     * @throws GSSException containing the following
     * major error codes:
     *   {@link GSSException#DEFECTIVE_TOKEN GSSException.DEFECTIVE_TOKEN},
     *   {@link GSSException#BAD_MIC GSSException.BAD_MIC},
     *   {@link GSSException#NO_CRED GSSException.NO_CRED},
     *   {@link GSSException#CREDENTIALS_EXPIRED
     *                                  GSSException.CREDENTIALS_EXPIRED},
     *   {@link GSSException#BAD_BINDINGS GSSException.BAD_BINDINGS},
     *   {@link GSSException#OLD_TOKEN GSSException.OLD_TOKEN},
     *   {@link GSSException#DUPLICATE_TOKEN GSSException.DUPLICATE_TOKEN},
     *   {@link GSSException#BAD_NAMETYPE GSSException.BAD_NAMETYPE},
     *   {@link GSSException#BAD_MECH GSSException.BAD_MECH},
     *   {@link GSSException#FAILURE GSSException.FAILURE}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public static final int INDEFINITE_LIFETIME = Integer.MAX_VALUE;

    /**
     * A lifetime constant representing indefinite context lifetime.
     * This value must is set to the maximum integer value in Java -
     * {@link java.lang.Integer#MAX_VALUE Integer.MAX_VALUE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
    public static final int DEFAULT_LIFETIME = 0;

    /**
     * A lifetime constant representing the default context lifetime.  This
     * value is set to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSContext.java
public interface GSSContext {

/**
 * This interface encapsulates the GSS-API security context and provides
 * the security services that are available over the context.  Security
 * contexts are established between peers using locally acquired
 * credentials.  Multiple contexts may exist simultaneously between a pair
 * of peers, using the same or different set of credentials.  GSS-API
 * functions in a manner independent of the underlying transport protocol
 * and depends on its calling application to transport the tokens that are
 * generated by the security context between the peers.<p>
 *
 * If the caller instantiates the context using the default
 * <code>GSSManager</code> instance, then the Kerberos v5 GSS-API mechanism
 * is guaranteed to be available for context establishment. This mechanism
 * is identified by the Oid "1.2.840.113554.1.2.2" and is defined in RFC
 * 1964.<p>
 *
 * Before the context establishment phase is initiated, the context
 * initiator may request specific characteristics desired of the
 * established context. Not all underlying mechanisms support all
 * characteristics that a caller might desire. After the context is
 * established, the caller can check the actual characteristics and services
 * offered by that context by means of various query methods. When using
 * the Kerberos v5 GSS-API mechanism offered by the default
 * <code>GSSManager</code> instance, all optional services will be
 * available locally. They are mutual authentication, credential
 * delegation, confidentiality and integrity protection, and per-message
 * replay detection and sequencing. Note that in the GSS-API, message integrity
 * is a prerequisite for message confidentiality.<p>
 *
 * The context establishment occurs in a loop where the
 * initiator calls {@link #initSecContext(byte[], int, int) initSecContext}
 * and the acceptor calls {@link #acceptSecContext(byte[], int, int)
 * acceptSecContext} until the context is established. While in this loop
 * the <code>initSecContext</code> and <code>acceptSecContext</code>
 * methods produce tokens that the application sends over to the peer. The
 * peer passes any such token as input to its <code>acceptSecContext</code>
 * or <code>initSecContext</code> as the case may be.<p>
 *
 * During the context establishment phase, the {@link
 * #isProtReady() isProtReady} method may be called to determine if the
 * context can be used for the per-message operations of {@link
 * #wrap(byte[], int, int, MessageProp) wrap} and {@link #getMIC(byte[],
 * int, int, MessageProp) getMIC}.  This allows applications to use
 * per-message operations on contexts which aren't yet fully
 * established.<p>
 *
 * After the context has been established or the <code>isProtReady</code>
 * method returns <code>true</code>, the query routines can be invoked to
 * determine the actual characteristics and services of the established
 * context.  The application can also start using the per-message methods
 * of {@link #wrap(byte[], int, int, MessageProp) wrap} and
 * {@link #getMIC(byte[], int, int, MessageProp) getMIC} to obtain
 * cryptographic operations on application supplied data.<p>
 *
 * When the context is no longer needed, the application should call
 * {@link #dispose() dispose} to release any system resources the context
 * may be using.<p>
 *
 * A security context typically maintains sequencing and replay detection
 * information about the tokens it processes. Therefore, the sequence in
 * which any tokens are presented to this context for processing can be
 * important. Also note that none of the methods in this interface are
 * synchronized. Therefore, it is not advisable to share a
 * <code>GSSContext</code> among several threads unless some application
 * level synchronization is in place.<p>
 *
 * Finally, different mechanism providers might place different security
 * restrictions on using GSS-API contexts. These will be documented by the
 * mechanism provider. The application will need to ensure that it has the
 * appropriate permissions if such checks are made in the mechanism layer.<p>
 *
 * The example code presented below demonstrates the usage of the
 * <code>GSSContext</code> interface for the initiating peer.  Different
 * operations on the <code>GSSContext</code> object are presented,
 * including: object instantiation, setting of desired flags, context
 * establishment, query of actual context flags, per-message operations on
 * application data, and finally context deletion.<p>
 *
 * <pre>
 *    // Create a context using default credentials
 *    // and the implementation specific default mechanism
 *    GSSManager manager ...
 *    GSSName targetName ...
 *    GSSContext context = manager.createContext(targetName, null, null,
 *                                           GSSContext.INDEFINITE_LIFETIME);
 *
 *    // set desired context options prior to context establishment
 *    context.requestConf(true);
 *    context.requestMutualAuth(true);
 *    context.requestReplayDet(true);
 *    context.requestSequenceDet(true);
 *
 *    // establish a context between peers
 *
 *    byte []inToken = new byte[0];
 *
 *    // Loop while there still is a token to be processed
 *
 *    while (!context.isEstablished()) {
 *
 *        byte[] outToken
 *            = context.initSecContext(inToken, 0, inToken.length);
 *
 *        // send the output token if generated
 *        if (outToken != null)
 *            sendToken(outToken);
 *
 *        if (!context.isEstablished()) {
 *            inToken = readToken();
 *    }
 *
 *     // display context information
 *     System.out.println("Remaining lifetime in seconds = "
 *                                          + context.getLifetime());
 *     System.out.println("Context mechanism = " + context.getMech());
 *     System.out.println("Initiator = " + context.getSrcName());
 *     System.out.println("Acceptor = " + context.getTargName());
 *
 *     if (context.getConfState())
 *             System.out.println("Confidentiality (i.e., privacy) is available");
 *
 *     if (context.getIntegState())
 *             System.out.println("Integrity is available");
 *
 *     // perform wrap on an application supplied message, appMsg,
 *     // using QOP = 0, and requesting privacy service
 *     byte [] appMsg ...
 *
 *     MessageProp mProp = new MessageProp(0, true);
 *
 *     byte []tok = context.wrap(appMsg, 0, appMsg.length, mProp);
 *
 *     sendToken(tok);
 *
 *     // release the local-end of the context
 *     context.dispose();
 *
 * </pre>
 *
 * @author Mayank Upadhyay
 * @since 1.4
 */
