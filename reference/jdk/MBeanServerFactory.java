_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    private static synchronized MBeanServerBuilder getNewMBeanServerBuilder() {

    /**
     * Get the current {@link javax.management.MBeanServerBuilder},
     * as specified by the current value of the
     * javax.management.builder.initial property.
     *
     * This method consults the property and instantiates a new builder
     * if needed.
     *
     * @return the new current {@link javax.management.MBeanServerBuilder}.
     *
     * @exception SecurityException if there is a SecurityManager and
     * the caller's permissions do not make it possible to instantiate
     * a new builder.
     * @exception JMRuntimeException if the builder instantiation
     *   fails with a checked exception -
     *   {@link java.lang.ClassNotFoundException} etc...
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    private static synchronized void checkMBeanServerBuilder() {

    /**
     * Instantiate a new builder according to the
     * javax.management.builder.initial System property - if needed.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    private static MBeanServerBuilder newBuilder(Class<?> builderClass) {

    /**
     * Creates the initial builder according to the
     * javax.management.builder.initial System property - if specified.
     * If any checked exception needs to be thrown, it is embedded in
     * a JMRuntimeException.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    private static Class<?> loadBuilderClass(String builderClassName)

    /**
     * Load the builder class through the context class loader.
     * @param builderClassName The name of the builder class.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    public static ClassLoaderRepository getClassLoaderRepository(
            MBeanServer server) {

    /**
     * Return the ClassLoaderRepository used by the given MBeanServer.
     * This method is equivalent to {@link
     * MBeanServer#getClassLoaderRepository() server.getClassLoaderRepository()}.
     * @param server The MBeanServer under examination. Since JMX 1.2,
     * if <code>server</code> is <code>null</code>, the result is a
     * {@link NullPointerException}.  This behavior differs from what
     * was implemented in JMX 1.1 - where the possibility to use
     * <code>null</code> was deprecated.
     * @return The Class Loader Repository used by the given MBeanServer.
     * @exception SecurityException if there is a SecurityManager and
     * the caller's permissions do not include or imply <code>{@link
     * MBeanPermission}("getClassLoaderRepository")</code>.
     *
     * @exception NullPointerException if <code>server</code> is null.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    public synchronized static

    /**
     * <p>Return a list of registered MBeanServer objects.  A
     * registered MBeanServer object is one that was created by one of
     * the <code>createMBeanServer</code> methods and not subsequently
     * released with <code>releaseMBeanServer</code>.</p>
     *
     * @param agentId The agent identifier of the MBeanServer to
     * retrieve.  If this parameter is null, all registered
     * MBeanServers in this JVM are returned.  Otherwise, only
     * MBeanServers whose id is equal to <code>agentId</code> are
     * returned.  The id of an MBeanServer is the
     * <code>MBeanServerId</code> attribute of its delegate MBean.
     *
     * @return A list of MBeanServer objects.
     *
     * @exception SecurityException if there is a SecurityManager and the
     * caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("findMBeanServer")</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    public static MBeanServer newMBeanServer(String domain)  {

    /**
     * <p>Return a new object implementing the MBeanServer interface
     * with the specified default domain name, without keeping an
     * internal reference to this new object.  The given domain name
     * is used as the domain part in the ObjectName of MBeans when the
     * domain is specified by the user is null.</p>
     *
     * <p>No reference is kept. <CODE>findMBeanServer</CODE> will not
     * be able to return a reference to this MBeanServer object, but
     * the garbage collector will be able to remove the MBeanServer
     * object when it is no longer referenced.</p>
     *
     * @param domain the default domain name for the created
     * MBeanServer.  This is the value that will be returned by {@link
     * MBeanServer#getDefaultDomain}.
     *
     * @return the newly created MBeanServer.
     *
     * @exception SecurityException if there is a SecurityManager and the
     * caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("newMBeanServer")</code>.
     *
     * @exception JMRuntimeException if the property
     * <code>javax.management.builder.initial</code> exists but the
     * class it names cannot be instantiated through a public
     * no-argument constructor; or if the instantiated builder returns
     * null from its {@link MBeanServerBuilder#newMBeanServerDelegate
     * newMBeanServerDelegate} or {@link
     * MBeanServerBuilder#newMBeanServer newMBeanServer} methods.
     *
     * @exception ClassCastException if the property
     * <code>javax.management.builder.initial</code> exists and can be
     * instantiated but is not assignment compatible with {@link
     * MBeanServerBuilder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    public static MBeanServer newMBeanServer() {

    /**
     * <p>Return a new object implementing the MBeanServer interface
     * with a standard default domain name, without keeping an
     * internal reference to this new object.  The default domain name
     * is used as the domain part in the ObjectName of MBeans when the
     * domain is specified by the user is null.</p>
     *
     * <p>The standard default domain name is
     * <code>DefaultDomain</code>.</p>
     *
     * <p>No reference is kept. <CODE>findMBeanServer</CODE> will not
     * be able to return a reference to this MBeanServer object, but
     * the garbage collector will be able to remove the MBeanServer
     * object when it is no longer referenced.</p>
     *
     * <p>This method is equivalent to <code>newMBeanServer(null)</code>.</p>
     *
     * @return the newly created MBeanServer.
     *
     * @exception SecurityException if there is a SecurityManager and the
     * caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("newMBeanServer")</code>.
     *
     * @exception JMRuntimeException if the property
     * <code>javax.management.builder.initial</code> exists but the
     * class it names cannot be instantiated through a public
     * no-argument constructor; or if the instantiated builder returns
     * null from its {@link MBeanServerBuilder#newMBeanServerDelegate
     * newMBeanServerDelegate} or {@link
     * MBeanServerBuilder#newMBeanServer newMBeanServer} methods.
     *
     * @exception ClassCastException if the property
     * <code>javax.management.builder.initial</code> exists and can be
     * instantiated but is not assignment compatible with {@link
     * MBeanServerBuilder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    public static MBeanServer createMBeanServer(String domain)  {

    /**
     * <p>Return a new object implementing the {@link MBeanServer}
     * interface with the specified default domain name.  The given
     * domain name is used as the domain part in the ObjectName of
     * MBeans when the domain is specified by the user is null.</p>
     *
     * <p>The MBeanServer reference is internally kept. This will
     * allow <CODE>findMBeanServer</CODE> to return a reference to
     * this MBeanServer object.</p>
     *
     * @param domain the default domain name for the created
     * MBeanServer.  This is the value that will be returned by {@link
     * MBeanServer#getDefaultDomain}.
     *
     * @return the newly created MBeanServer.
     *
     * @exception SecurityException if there is a SecurityManager and
     * the caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("createMBeanServer")</code>.
     *
     * @exception JMRuntimeException if the property
     * <code>javax.management.builder.initial</code> exists but the
     * class it names cannot be instantiated through a public
     * no-argument constructor; or if the instantiated builder returns
     * null from its {@link MBeanServerBuilder#newMBeanServerDelegate
     * newMBeanServerDelegate} or {@link
     * MBeanServerBuilder#newMBeanServer newMBeanServer} methods.
     *
     * @exception ClassCastException if the property
     * <code>javax.management.builder.initial</code> exists and can be
     * instantiated but is not assignment compatible with {@link
     * MBeanServerBuilder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    public static MBeanServer createMBeanServer() {

    /**
     * <p>Return a new object implementing the MBeanServer interface
     * with a standard default domain name.  The default domain name
     * is used as the domain part in the ObjectName of MBeans when the
     * domain is specified by the user is null.</p>
     *
     * <p>The standard default domain name is
     * <code>DefaultDomain</code>.</p>
     *
     * <p>The MBeanServer reference is internally kept. This will
     * allow <CODE>findMBeanServer</CODE> to return a reference to
     * this MBeanServer object.</p>
     *
     * <p>This method is equivalent to <code>createMBeanServer(null)</code>.
     *
     * @return the newly created MBeanServer.
     *
     * @exception SecurityException if there is a SecurityManager and the
     * caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("createMBeanServer")</code>.
     *
     * @exception JMRuntimeException if the property
     * <code>javax.management.builder.initial</code> exists but the
     * class it names cannot be instantiated through a public
     * no-argument constructor; or if the instantiated builder returns
     * null from its {@link MBeanServerBuilder#newMBeanServerDelegate
     * newMBeanServerDelegate} or {@link
     * MBeanServerBuilder#newMBeanServer newMBeanServer} methods.
     *
     * @exception ClassCastException if the property
     * <code>javax.management.builder.initial</code> exists and can be
     * instantiated but is not assignment compatible with {@link
     * MBeanServerBuilder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    public static void releaseMBeanServer(MBeanServer mbeanServer) {

    /**
     * Remove internal MBeanServerFactory references to a created
     * MBeanServer. This allows the garbage collector to remove the
     * MBeanServer object.
     *
     * @param mbeanServer the MBeanServer object to remove.
     *
     * @exception java.lang.IllegalArgumentException if
     * <code>mbeanServer</code> was not generated by one of the
     * <code>createMBeanServer</code> methods, or if
     * <code>releaseMBeanServer</code> was already called on it.
     *
     * @exception SecurityException if there is a SecurityManager and
     * the caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("releaseMBeanServer")</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    // public static synchronized MBeanServerBuilder getMBeanServerBuilder() {

    /**
     * Get the current {@link javax.management.MBeanServerBuilder}.
     *
     * @return the current {@link javax.management.MBeanServerBuilder}.
     *
     * @exception SecurityException if there is a SecurityManager and
     * the caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("getMBeanServerBuilder")</code>.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    // public static synchronized void

    /**
     * Provide a new {@link javax.management.MBeanServerBuilder}.
     * @param builder The new MBeanServerBuilder that will be used to
     *        create {@link javax.management.MBeanServer}s.
     * @exception IllegalArgumentException if the given builder is null.
     *
     * @exception SecurityException if there is a SecurityManager and
     * the caller's permissions do not include or imply <code>{@link
     * MBeanServerPermission}("setMBeanServerBuilder")</code>.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
    private static MBeanServerBuilder builder = null;

    /**
     * The builder that will be used to construct MBeanServers.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerFactory.java
public class MBeanServerFactory {

/**
 * <p>Provides MBean server references.  There are no instances of
 * this class.</p>
 *
 * <p>Since JMX 1.2 this class makes it possible to replace the default
 * MBeanServer implementation. This is done using the
 * {@link javax.management.MBeanServerBuilder} class.
 * The class of the initial MBeanServerBuilder to be
 * instantiated can be specified through the
 * <b>javax.management.builder.initial</b> system property.
 * The specified class must be a public subclass of
 * {@link javax.management.MBeanServerBuilder}, and must have a public
 * empty constructor.
 * <p>By default, if no value for that property is specified, an instance of
 * {@link
 * javax.management.MBeanServerBuilder javax.management.MBeanServerBuilder}
 * is created. Otherwise, the MBeanServerFactory attempts to load the
 * specified class using
 * {@link java.lang.Thread#getContextClassLoader()
 *   Thread.currentThread().getContextClassLoader()}, or if that is null,
 * {@link java.lang.Class#forName(java.lang.String) Class.forName()}. Then
 * it creates an initial instance of that Class using
 * {@link java.lang.Class#newInstance()}. If any checked exception
 * is raised during this process (e.g.
 * {@link java.lang.ClassNotFoundException},
 * {@link java.lang.InstantiationException}) the MBeanServerFactory
 * will propagate this exception from within a RuntimeException.</p>
 *
 * <p>The <b>javax.management.builder.initial</b> system property is
 * consulted every time a new MBeanServer needs to be created, and the
 * class pointed to by that property is loaded. If that class is different
 * from that of the current MBeanServerBuilder, then a new MBeanServerBuilder
 * is created. Otherwise, the MBeanServerFactory may create a new
 * MBeanServerBuilder or reuse the current one.</p>
 *
 * <p>If the class pointed to by the property cannot be
 * loaded, or does not correspond to a valid subclass of MBeanServerBuilder
 * then an exception is propagated, and no MBeanServer can be created until
 * the <b>javax.management.builder.initial</b> system property is reset to
 * valid value.</p>
 *
 * <p>The MBeanServerBuilder makes it possible to wrap the MBeanServers
 * returned by the default MBeanServerBuilder implementation, for the purpose
 * of e.g. adding an additional security layer.</p>
 *
 * @since 1.5
 */
