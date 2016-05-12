_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/PrivateMLet.java
    public PrivateMLet(URL[] urls,
                       ClassLoader parent,
                       URLStreamHandlerFactory factory,
                       boolean delegateToCLR) {

    /**
      * Constructs a new PrivateMLet for the specified URLs, parent
      * class loader, and URLStreamHandlerFactory. The parent argument
      * will be used as the parent class loader for delegation. The
      * factory argument will be used as the stream handler factory to
      * obtain protocol handlers when creating new URLs.
      *
      * @param  urls  The URLs from which to load classes and resources.
      * @param  parent The parent class loader for delegation.
      * @param  factory  The URLStreamHandlerFactory to use when creating URLs.
      * @param  delegateToCLR  True if, when a class is not found in
      * either the parent ClassLoader or the URLs, the MLet should delegate
      * to its containing MBeanServer's {@link ClassLoaderRepository}.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/PrivateMLet.java
    public PrivateMLet(URL[] urls, ClassLoader parent, boolean delegateToCLR) {

    /**
      * Constructs a new PrivateMLet for the given URLs. The URLs will
      * be searched in the order specified for classes and resources
      * after first searching in the specified parent class loader.
      * The parent argument will be used as the parent class loader
      * for delegation.
      *
      * @param  urls  The URLs from which to load classes and resources.
      * @param  parent The parent class loader for delegation.
      * @param  delegateToCLR  True if, when a class is not found in
      * either the parent ClassLoader or the URLs, the MLet should delegate
      * to its containing MBeanServer's {@link ClassLoaderRepository}.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/PrivateMLet.java
    public PrivateMLet(URL[] urls, boolean delegateToCLR) {

    /**
      * Constructs a new PrivateMLet for the specified URLs using the
      * default delegation parent ClassLoader.  The URLs will be
      * searched in the order specified for classes and resources
      * after first searching in the parent class loader.
      *
      * @param  urls  The URLs from which to load classes and resources.
      * @param  delegateToCLR  True if, when a class is not found in
      * either the parent ClassLoader or the URLs, the MLet should delegate
      * to its containing MBeanServer's {@link ClassLoaderRepository}.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/PrivateMLet.java
public class PrivateMLet extends MLet implements PrivateClassLoader {

/**
 * An MLet that is not added to the {@link ClassLoaderRepository}.
 * This class acts exactly like its parent class, {@link MLet}, with
 * one exception.  When a PrivateMLet is registered in an MBean
 * server, it is not added to that MBean server's {@link
 * ClassLoaderRepository}.  This is true because this class implements
 * the interface {@link PrivateClassLoader}.
 *
 * @since 1.5
 */
