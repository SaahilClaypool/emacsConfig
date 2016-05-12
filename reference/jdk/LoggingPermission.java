_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/logging/LoggingPermission.java
    public LoggingPermission(String name, String actions) throws IllegalArgumentException {

    /**
     * Creates a new LoggingPermission object.
     *
     * @param name Permission name.  Must be "control".
     * @param actions Must be either null or the empty string.
     *
     * @throws NullPointerException if <code>name</code> is <code>null</code>.
     * @throws IllegalArgumentException if <code>name</code> is empty or if
     * arguments are invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/logging/LoggingPermission.java
public final class LoggingPermission extends java.security.BasicPermission {

/**
 * The permission which the SecurityManager will check when code
 * that is running with a SecurityManager calls one of the logging
 * control methods (such as Logger.setLevel).
 * <p>
 * Currently there is only one named LoggingPermission.  This is "control"
 * and it grants the ability to control the logging configuration, for
 * example by adding or removing Handlers, by adding or removing Filters,
 * or by changing logging levels.
 * <p>
 * Programmers do not normally create LoggingPermission objects directly.
 * Instead they are created by the security policy code based on reading
 * the security policy file.
 *
 *
 * @since 1.4
 * @see java.security.BasicPermission
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 * @see java.lang.SecurityManager
 *
 */
