_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    protected int[] varList;

    /**
     * Contains the list of variable identifiers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    final static protected int getNextIdentifier(int table[], long value)

    /**
     * This will give the first element greater than <CODE>value</CODE>
     * in a sorted array.
     * If there is no element of the array greater than <CODE>value</CODE>,
     * the method will throw a <CODE>SnmpStatusException</CODE>.
     *
     * @param table A sorted integer array.
     *
     * @param value The greatest value.
     *
     * @exception SnmpStatusException If there is no element greater than
     *     <CODE>value</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    static void QuickSort(int a[], int lo0, int hi0) {

    /**
     * This is a generic version of C.A.R Hoare's Quick Sort
     * algorithm.  This will handle arrays that are already
     * sorted, and arrays with duplicate keys.
     *
     * If you think of a one dimensional array as going from
     * the lowest index on the left to the highest index on the right
     * then the parameters to this function are lowest index or
     * left and highest index or right.  The first time you call
     * this function it will be with the parameters 0, a.length - 1.
     *
     * @param a An integer array.
     * @param lo0 Left boundary of array partition.
     * @param hi0 Right boundary of array partition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public void getRootOid(Vector<Integer> result) {

    /**
     * Computes the root OID of the MIB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    static public void sort(int array[]) {

    /**
     * Sorts the specified integer array.
     *
     * @param array An integer array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public abstract void check(SnmpMibSubRequest req, int depth)

    /**
     * Generic handling of the <CODE>check</CODE> operation.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public abstract void set(SnmpMibSubRequest req, int depth)

    /**
     * Generic handling of the <CODE>set</CODE> operation.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public abstract void get(SnmpMibSubRequest req, int depth)

    /**
     * Generic handling of the <CODE>get</CODE> operation.
     *
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    long[] findNextHandlingNode(SnmpVarBind varbind,
                                 long[] oid, int pos, int depth,
                                 SnmpRequestTree handlers, AcmChecker checker)

    /**
     * Find the node which handles the leaf that immediately follows the
     * given varbind OID, and register the it in the SnmpRequestTree.
     * This method is a pure internal method. You should never try to call
     * it directly.
     *
     * @param varbind  The varbind to be handled
     *
     * @param oid      The OID array extracted from the varbind
     *
     * @param depth    The depth reached in the OID at this step of the
     *                 processing.
     *
     * @param handlers The Hashtable in which the varbind will be registered
     *                 with its handling node. This hashtable contains
     *                 SnmpRequestTree.Handler items.
     *
     * @return The SnmpOid of the next leaf.
     *
     * @exception SnmpStatusException No handling node was found.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    void findHandlingNode(SnmpVarBind varbind,
                          long[] oid, int depth,
                          SnmpRequestTree handlers)

    /**
     * Find the node which handles a varbind, and register it in the
     * SnmpRequestTree. This method is a pure internal method. You should
     * never try to call it directly.
     *
     * @param varbind  The varbind to be handled
     *
     * @param oid      The OID array extracted from the varbind
     *
     * @param depth    The depth reached in the OID at this step of the
     *                 processing.
     *
     * @param handlers The Hashtable in which the varbind will be registered
     *                 with its handling node. This hashtable contains
     *                 <CODE>SnmpRequestTree.Handler</CODE> items.
     *
     * @exception SnmpStatusException No handling node was found.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    protected boolean skipVariable(long id, Object userData, int pduVersion) {

    /**
     * Hook for subclasses.
     * The default implementation of this method is to always return
     * false. Subclasses should redefine this method so that it returns
     * true when:
     * <ul><li>the variable is a leaf that is not instantiated,</li>
     * <li>or the variable is a leaf whose type cannot be returned by that
     *     version of the protocol (e.g. an Counter64 with SNMPv1).</li>
     * </ul>
     *
     * @param id Id we start from looking for the next.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return true if the variable must be skipped by the get-next
     *         algorithm.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public long getNextVarId(long id, Object userData, int pduVersion)

    /**
     * Get the next OID arc corresponding to a readable scalar variable,
     * a branch leading to a subgroub, or a table, possibly skipping over
     * those arcs that must not or cannot be returned.
     *
     * Calls {@link #getNextVarId(long,java.lang.Object)} until
     * {@link #skipVariable(long,java.lang.Object,int)} returns false.
     *
     * @param id Id we start from looking for the next.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return The next id in this group which can be returned using
     *         the given PDU's protocol version.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public long getNextVarId(long id, Object userData)

    /**
     * Get the next OID arc corresponding to a readable scalar variable,
     * a branch leading to a subgroub, or a table.
     *
     * @param id Id we start from looking for the next.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next id in this group.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
public abstract class SnmpMibNode implements Serializable {

/**
 * The <CODE>SnmpMibNode</CODE> class represents a node in an SNMP MIB.
 * <P>
 * This class is used internally and by the class generated by
 * <CODE>mibgen</CODE>.
 * You should not need to use this class directly.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    protected int[] varList;

    /**
     * Contains the list of variable identifiers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    final static protected int getNextIdentifier(int table[], long value)

    /**
     * This will give the first element greater than <CODE>value</CODE>
     * in a sorted array.
     * If there is no element of the array greater than <CODE>value</CODE>,
     * the method will throw a <CODE>SnmpStatusException</CODE>.
     *
     * @param table A sorted integer array.
     *
     * @param value The greatest value.
     *
     * @exception SnmpStatusException If there is no element greater than
     *     <CODE>value</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    static void QuickSort(int a[], int lo0, int hi0) {

    /**
     * This is a generic version of C.A.R Hoare's Quick Sort
     * algorithm.  This will handle arrays that are already
     * sorted, and arrays with duplicate keys.
     *
     * If you think of a one dimensional array as going from
     * the lowest index on the left to the highest index on the right
     * then the parameters to this function are lowest index or
     * left and highest index or right.  The first time you call
     * this function it will be with the parameters 0, a.length - 1.
     *
     * @param a An integer array.
     * @param lo0 Left boundary of array partition.
     * @param hi0 Right boundary of array partition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public void getRootOid(Vector<Integer> result) {

    /**
     * Computes the root OID of the MIB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    static public void sort(int array[]) {

    /**
     * Sorts the specified integer array.
     *
     * @param array An integer array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public abstract void check(SnmpMibSubRequest req, int depth)

    /**
     * Generic handling of the <CODE>check</CODE> operation.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public abstract void set(SnmpMibSubRequest req, int depth)

    /**
     * Generic handling of the <CODE>set</CODE> operation.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public abstract void get(SnmpMibSubRequest req, int depth)

    /**
     * Generic handling of the <CODE>get</CODE> operation.
     *
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    long[] findNextHandlingNode(SnmpVarBind varbind,
                                 long[] oid, int pos, int depth,
                                 SnmpRequestTree handlers, AcmChecker checker)

    /**
     * Find the node which handles the leaf that immediately follows the
     * given varbind OID, and register the it in the SnmpRequestTree.
     * This method is a pure internal method. You should never try to call
     * it directly.
     *
     * @param varbind  The varbind to be handled
     *
     * @param oid      The OID array extracted from the varbind
     *
     * @param depth    The depth reached in the OID at this step of the
     *                 processing.
     *
     * @param handlers The Hashtable in which the varbind will be registered
     *                 with its handling node. This hashtable contains
     *                 SnmpRequestTree.Handler items.
     *
     * @return The SnmpOid of the next leaf.
     *
     * @exception SnmpStatusException No handling node was found.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    void findHandlingNode(SnmpVarBind varbind,
                          long[] oid, int depth,
                          SnmpRequestTree handlers)

    /**
     * Find the node which handles a varbind, and register it in the
     * SnmpRequestTree. This method is a pure internal method. You should
     * never try to call it directly.
     *
     * @param varbind  The varbind to be handled
     *
     * @param oid      The OID array extracted from the varbind
     *
     * @param depth    The depth reached in the OID at this step of the
     *                 processing.
     *
     * @param handlers The Hashtable in which the varbind will be registered
     *                 with its handling node. This hashtable contains
     *                 <CODE>SnmpRequestTree.Handler</CODE> items.
     *
     * @exception SnmpStatusException No handling node was found.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    protected boolean skipVariable(long id, Object userData, int pduVersion) {

    /**
     * Hook for subclasses.
     * The default implementation of this method is to always return
     * false. Subclasses should redefine this method so that it returns
     * true when:
     * <ul><li>the variable is a leaf that is not instantiated,</li>
     * <li>or the variable is a leaf whose type cannot be returned by that
     *     version of the protocol (e.g. an Counter64 with SNMPv1).</li>
     * </ul>
     *
     * @param id Id we start from looking for the next.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return true if the variable must be skipped by the get-next
     *         algorithm.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public long getNextVarId(long id, Object userData, int pduVersion)

    /**
     * Get the next OID arc corresponding to a readable scalar variable,
     * a branch leading to a subgroub, or a table, possibly skipping over
     * those arcs that must not or cannot be returned.
     *
     * Calls {@link #getNextVarId(long,java.lang.Object)} until
     * {@link #skipVariable(long,java.lang.Object,int)} returns false.
     *
     * @param id Id we start from looking for the next.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return The next id in this group which can be returned using
     *         the given PDU's protocol version.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
    public long getNextVarId(long id, Object userData)

    /**
     * Get the next OID arc corresponding to a readable scalar variable,
     * a branch leading to a subgroub, or a table.
     *
     * @param id Id we start from looking for the next.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next id in this group.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibNode.java
public abstract class SnmpMibNode implements Serializable {

/**
 * The <CODE>SnmpMibNode</CODE> class represents a node in an SNMP MIB.
 * <P>
 * This class is used internally and by the class generated by
 * <CODE>mibgen</CODE>.
 * You should not need to use this class directly.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
