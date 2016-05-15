_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DefaultLoaderRepository.java
    public static Class<?> loadClassWithout(ClassLoader loader,String className)

    /**
     * Go through the list of class loaders but exclude the given class loader, then try to load
     * the requested class.
     * The method will stop as soon as the class is found. If the class
     * is not found the method will throw a <CODE>ClassNotFoundException</CODE>
     * exception.
     *
     * @param className The name of the class to be loaded.
     * @param loader The class loader to be excluded.
     *
     * @return the loaded class.
     *
     * @exception ClassNotFoundException The specified class could not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DefaultLoaderRepository.java
    public static Class<?> loadClass(String className)

    /**
     * Go through the list of class loaders and try to load the requested class.
     * The method will stop as soon as the class is found. If the class
     * is not found the method will throw a <CODE>ClassNotFoundException</CODE>
     * exception.
     *
     * @param className The name of the class to be loaded.
     *
     * @return the loaded class.
     *
     * @exception ClassNotFoundException The specified class could not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DefaultLoaderRepository.java
@Deprecated

/**
 * <p>Keeps the list of Class Loaders registered in the MBean Server.
 * It provides the necessary methods to load classes using the registered
 * Class Loaders.</p>
 *
 * <p>This deprecated class is maintained for compatibility.  In
 * previous versions of the JMX API, there was one
 * <code>DefaultLoaderRepository</code> shared by all MBean servers.
 * As of version 1.2 of the JMX API, that functionality is
 * approximated by using {@link MBeanServerFactory#findMBeanServer} to
 * find all known MBean servers, and consulting the {@link
 * ClassLoaderRepository} of each one.  It is strongly recommended
 * that code referencing <code>DefaultLoaderRepository</code> be
 * rewritten.</p>
 *
 * @deprecated Use
 * {@link javax.management.MBeanServer#getClassLoaderRepository()}
 * instead.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/DefaultLoaderRepository.java
    public static Class<?> loadClassWithout(ClassLoader loader,
                                         String className)

    /**
     * Go through the list of class loaders but exclude the given
     * class loader, then try to load
     * the requested class.
     * The method will stop as soon as the class is found. If the class
     * is not found the method will throw a <CODE>ClassNotFoundException</CODE>
     * exception.
     *
     * @param className The name of the class to be loaded.
     * @param loader The class loader to be excluded.
     *
     * @return the loaded class.
     *
     * @exception ClassNotFoundException The specified class could not be
     *    found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/DefaultLoaderRepository.java
    public static Class<?> loadClass(String className)

    /**
     * Go through the list of class loaders and try to load the requested
     * class.
     * The method will stop as soon as the class is found. If the class
     * is not found the method will throw a <CODE>ClassNotFoundException</CODE>
     * exception.
     *
     * @param className The name of the class to be loaded.
     *
     * @return the loaded class.
     *
     * @exception ClassNotFoundException The specified class could not be
     *            found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/DefaultLoaderRepository.java
@Deprecated

/**
 * <p>Keeps the list of Class Loaders registered in the MBean Server.
 * It provides the necessary methods to load classes using the registered
 * Class Loaders.</p>
 *
 * <p>This deprecated class is maintained for compatibility.  In
 * previous versions of JMX, there was one
 * <code>DefaultLoaderRepository</code> shared by all MBean servers.
 * As of JMX 1.2, that functionality is approximated by using {@link
 * MBeanServerFactory#findMBeanServer} to find all known MBean
 * servers, and consulting the {@link ClassLoaderRepository} of each
 * one.  It is strongly recommended that code referencing
 * <code>DefaultLoaderRepository</code> be rewritten.</p>
 *
 * @deprecated Use
 * {@link javax.management.MBeanServer#getClassLoaderRepository()}}
 * instead.
 *
 * @since 1.5
 */