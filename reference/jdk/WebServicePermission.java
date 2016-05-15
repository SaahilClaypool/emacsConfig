_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServicePermission.java
    public WebServicePermission(String name, String actions) {

    /**
     * Creates a new permission with the specified name and actions.
     *
     * The <code>actions</code> parameter is currently unused and
     * it should be <code>null</code>.
     *
     * @param name the name of the <code>WebServicePermission</code>
     * @param actions should be <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServicePermission.java
    public WebServicePermission(String name) {

    /**
     * Creates a new permission with the specified name.
     *
     * @param name the name of the <code>WebServicePermission</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServicePermission.java
public final class WebServicePermission extends BasicPermission {

/**
 * This class defines web service permissions.
 * <p>
 * Web service Permissions are identified by name (also referred to as
 * a "target name") alone. There are no actions associated
 * with them.
 * <p>
 * The following permission target name is defined:
 * <p>
 * <dl>
 *   <dt>publishEndpoint
 * </dl>
 * <p>
 * The <code>publishEndpoint</code> permission allows publishing a
 * web service endpoint using the <code>publish</code> methods
 * defined by the <code>javax.xml.ws.Endpoint</code> class.
 * <p>
 * Granting <code>publishEndpoint</code> allows the application to be
 * exposed as a network service. Depending on the security of the runtime and
 * the security of the application, this may introduce a security hole that
 * is remotely exploitable.
 *
 * @see javax.xml.ws.Endpoint
 * @see java.security.BasicPermission
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.lang.SecurityManager
 * @see java.net.SocketPermission
 */