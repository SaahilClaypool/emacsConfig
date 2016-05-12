_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public boolean getRelay();

    /**
     * Returns the boolean value of the <i>relay</i> attribute for this
     * <code>SOAPHeaderElement</code>
     *
     * @return <code>true</code> if the relay attribute is turned on;
     * <code>false</code> otherwise
     *
     * @exception UnsupportedOperationException if this message does not
     *      support the SOAP 1.2 concept of Relay attribute.
     *
     * @see #getMustUnderstand
     * @see #setRelay
     *
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public void setRelay(boolean relay) throws SOAPException;

    /**
     * Sets the <i>relay</i> attribute for this <code>SOAPHeaderElement</code> to be
     * either true or false.
     * <P>
     * The SOAP relay attribute is set to true to indicate that the SOAP header
     * block must be relayed by any node that is targeted by the header block
     * but not actually process it. This attribute is ignored on header blocks
     * whose mustUnderstand attribute is set to true or that are targeted at
     * the ultimate reciever (which is the default). The default value of this
     * attribute is <code>false</code>.
     *
     * @param relay the new value of the <i>relay</i> attribute
     *
     * @exception SOAPException if there is a problem in setting the
     * relay attribute.
     * @exception UnsupportedOperationException if this message does not
     *      support the SOAP 1.2 concept of Relay attribute.
     *
     * @see #setMustUnderstand
     * @see #getRelay
     *
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public boolean getMustUnderstand();

    /**
     * Returns the boolean value of the mustUnderstand attribute for this
     * <code>SOAPHeaderElement</code>.
     *
     * @return <code>true</code> if the mustUnderstand attribute of this
     *        <code>SOAPHeaderElement</code> object is turned on; <code>false</code>
     *         otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public void setMustUnderstand(boolean mustUnderstand);

    /**
     * Sets the mustUnderstand attribute for this <code>SOAPHeaderElement</code>
     * object to be either true or false.
     * <P>
     * If the mustUnderstand attribute is on, the actor who receives the
     * <code>SOAPHeaderElement</code> must process it correctly. This
     * ensures, for example, that if the <code>SOAPHeaderElement</code>
     * object modifies the message, that the message is being modified correctly.
     *
     * @param mustUnderstand <code>true</code> to set the mustUnderstand
     *        attribute to true; <code>false</code> to set it to false
     *
     * @exception IllegalArgumentException if there is a problem in
     * setting the mustUnderstand attribute
     * @see #getMustUnderstand
     * @see #setRelay
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public String getRole();

    /**
     * Returns the value of the <i>Role</i> attribute of this
     * <code>SOAPHeaderElement</code>.
     *
     * @return a <code>String</code> giving the URI of the <code>Role</code>
     *
     * @exception UnsupportedOperationException if this message does not
     *      support the SOAP 1.2 concept of Fault Role.
     *
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public String getActor();

    /**
     * Returns the uri of the <i>actor</i> attribute of this
     * <code>SOAPHeaderElement</code>.
     *<P>
     * If this <code>SOAPHeaderElement</code> supports SOAP 1.2 then this call is
     * equivalent to {@link #getRole()}
     * @return  a <code>String</code> giving the URI of the actor
     * @see #setActor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public void setRole(String uri) throws SOAPException;

    /**
     * Sets the <code>Role</code> associated with this <code>SOAPHeaderElement</code>
     * object to the specified <code>Role</code>.
     *
     * @param uri - the URI of the <code>Role</code>
     *
     * @throws SOAPException if there is an error in setting the role
     *
     * @exception UnsupportedOperationException if this message does not
     *      support the SOAP 1.2 concept of Fault Role.
     *
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
    public void setActor(String actorURI);

    /**
     * Sets the actor associated with this <code>SOAPHeaderElement</code>
     * object to the specified actor. The default value of an actor is:
     *          <code>SOAPConstants.URI_SOAP_ACTOR_NEXT</code>
     * <P>
     * If this <code>SOAPHeaderElement</code> supports SOAP 1.2 then this call is
     * equivalent to {@link #setRole(String)}
     *
     * @param  actorURI a <code>String</code> giving the URI of the actor
     *           to set
     *
     * @exception IllegalArgumentException if there is a problem in
     * setting the actor.
     *
     * @see #getActor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPHeaderElement.java
public interface SOAPHeaderElement extends SOAPElement {

/**
 * An object representing the contents in the SOAP header part of the
 * SOAP envelope.
 * The immediate children of a <code>SOAPHeader</code> object can
 * be represented only as <code>SOAPHeaderElement</code> objects.
 * <P>
 * A <code>SOAPHeaderElement</code> object can have other
 * <code>SOAPElement</code> objects as its children.
 */
