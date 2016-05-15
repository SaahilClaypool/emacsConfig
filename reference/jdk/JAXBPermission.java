_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBPermission.java
    public JAXBPermission(String name) {

    /**
     * Creates a new JAXBPermission with the specified name.
     *
     * @param name
     * The name of the JAXBPermission. As of 2.2 only "setDatatypeConverter"
     * is defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBPermission.java
/* code was borrowed originally from java.lang.RuntimePermission. */

/**
 * This class is for JAXB permissions. A {@code JAXBPermission}
 * contains a name (also referred to as a "target name") but
 * no actions list; you either have the named permission
 * or you don't.
 *
 * <P>
 * The target name is the name of the JAXB permission (see below).
 *
 * <P>
 * The following table lists all the possible {@code JAXBPermission} target names,
 * and for each provides a description of what the permission allows
 * and a discussion of the risks of granting code the permission.
 * <P>
 *
 * <table border=1 cellpadding=5 summary="Permission target name, what the permission allows, and associated risks">
 * <tr>
 * <th>Permission Target Name</th>
 * <th>What the Permission Allows</th>
 * <th>Risks of Allowing this Permission</th>
 * </tr>
 *
 * <tr>
 *   <td>setDatatypeConverter</td>
 *   <td>
 *     Allows the code to set VM-wide {@link DatatypeConverterInterface}
 *     via {@link DatatypeConverter#setDatatypeConverter(DatatypeConverterInterface) the setDatatypeConverter method}
 *     that all the methods on {@link DatatypeConverter} uses.
 *   </td>
 *   <td>
 *     Malicious code can set {@link DatatypeConverterInterface}, which has
 *     VM-wide singleton semantics,  before a genuine JAXB implementation sets one.
 *     This allows malicious code to gain access to objects that it may otherwise
 *     not have access to, such as {@link java.awt.Frame#getFrames()} that belongs to
 *     another application running in the same JVM.
 *   </td>
 * </tr>
 * </table>
 *
 * @see java.security.BasicPermission
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 * @see java.lang.SecurityManager
 *
 * @author Joe Fialli
 * @since JAXB 2.2
 */