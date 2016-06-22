_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/transport/IIOPPrimaryToContactInfo.java
    public ContactInfo next(ContactInfo primary,
                            ContactInfo previous,
                            List contactInfos);

    /**
     * @param primary - the key.
     * @param previous - if null then map primary to failover.  If failover is
     * empty then map primary to primary and return primary.  If failover is
     * non-empty then return failover.  If previous is non-null that
     * indicates that the previous failed.  Therefore, find previous in
     * contactInfos.  Map the <code>ContactInfo</code> following
     * previous to primary and return that <code>ContactInfo</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/transport/IIOPPrimaryToContactInfo.java
    public boolean hasNext(ContactInfo primary,
                           ContactInfo previous,
                           List contactInfos);

    /**
     * @param primary - the key.
     * @param previous - if null return true.  Otherwise, find previous in
     * <code>contactInfos</code> and if another <code>ContactInfo</code>
     * follows it in the list then return true.  Otherwise false.
     * @param contactInfos - the list of replicas associated with the
     * primary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/transport/IIOPPrimaryToContactInfo.java
    public void reset(ContactInfo primary);

    /**
     * @param primary - clear any state relating to primary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/transport/IIOPPrimaryToContactInfo.java
public interface IIOPPrimaryToContactInfo

/**
 * This interface is the "sticky manager" for IIOP failover.  The default
 * ORB does NOT contain a sticky manager.  One is registered by supplying
 * a class via the com.sun.CORBA.transport.ORBIIOPPrimaryToContactInfoClass.
 *
 * It uses the IIOP primary host/port (with a SocketInfo.IIOP_CLEAR_TEXT type)
 * as a key to map to the last ContactInfo that resulted in successful'
 * communication.
 *
 * It mainly prevents "fallback" - if a previously failed replica comes
 * back up we do NOT want to switch back to using it - particularly in the
 * case of statefull session beans.
 *
 * Note: This assumes static lists of replicas (e.g., AS 8.1 EE).
 * This does NOT work well with LOCATION_FORWARD.
 *
 * @author Harold Carr
 */