_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private  Object constructParameter(String param, String type) {

     /**
      * Converts the String value of the constructor's parameter to
      * a basic Java object with the type of the parameter.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private Object loadSerializedObject(URL codebase, String filename)

    /**
     * Loads the serialized object specified by the <CODE>OBJECT</CODE>
     * attribute of the <CODE>MLET</CODE> tag.
     *
     * @param codebase The <CODE>codebase</CODE>.
     * @param filename The name of the file containing the serialized object.
     * @return The serialized object.
     * @exception ClassNotFoundException The specified serialized
     * object could not be found.
     * @exception IOException An I/O error occurred while loading
     * serialized object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     protected URL check(String version, URL codebase, String jarfile,
                         MLetContent mlet)

     /**
      * <p>This method is to be overridden when extending this service to
      * support caching and versioning.  It is called from {@link
      * #getMBeansFromURL getMBeansFromURL} when the version,
      * codebase, and jarfile have been extracted from the MLet file,
      * and can be used to verify that it is all right to load the
      * given MBean, or to replace the given URL with a different one.</p>
      *
      * <p>The default implementation of this method returns
      * <code>codebase</code> unchanged.</p>
      *
      * @param version The version number of the <CODE>.jar</CODE>
      * file stored locally.
      * @param codebase The base URL of the remote <CODE>.jar</CODE> file.
      * @param jarfile The name of the <CODE>.jar</CODE> file to be loaded.
      * @param mlet The <CODE>MLetContent</CODE> instance that
      * represents the <CODE>MLET</CODE> tag.
      *
      * @return the codebase to use for the loaded MBean.  The returned
      * value should not be null.
      *
      * @exception Exception if the MBean is not to be loaded for some
      * reason.  The exception will be added to the set returned by
      * {@link #getMBeansFromURL getMBeansFromURL}.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private static String removeSpace(String s) {

   /**
    * Removes any white space from a string. This is used to
    * convert strings such as "Windows NT" to "WindowsNT".
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private synchronized String loadLibraryAsResource(String libname) {

     /**
      * Search the specified native library in any of the JAR files
      * loaded by this classloader.  If the library is found copy it
      * into the library directory and return the absolute path.  If
      * the library is not found then return null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     protected String findLibrary(String libname) {

     /**
      * Returns the absolute path name of a native library. The VM
      * invokes this method to locate the native libraries that belong
      * to classes loaded with this class loader. Libraries are
      * searched in the JAR files using first just the native library
      * name and if not found the native library name together with
      * the architecture-specific path name
      * (<code>OSName/OSArch/OSVersion/lib/nativelibname</code>), i.e.
      * <p>
      * the library stat on Solaris SPARC 5.7 will be searched in the JAR file as:
      * <OL>
      * <LI>libstat.so
      * <LI>SunOS/sparc/5.7/lib/libstat.so
      * </OL>
      * the library stat on Windows NT 4.0 will be searched in the JAR file as:
      * <OL>
      * <LI>stat.dll
      * <LI>WindowsNT/x86/4.0/lib/stat.dll
      * </OL>
      *
      * <p>More specifically, let <em>{@code nativelibname}</em> be the result of
      * {@link System#mapLibraryName(java.lang.String)
      * System.mapLibraryName}{@code (libname)}.  Then the following names are
      * searched in the JAR files, in order:<br>
      * <em>{@code nativelibname}</em><br>
      * {@code <os.name>/<os.arch>/<os.version>/lib/}<em>{@code nativelibname}</em><br>
      * where {@code <X>} means {@code System.getProperty(X)} with any
      * spaces in the result removed, and {@code /} stands for the
      * file separator character ({@link File#separator}).
      * <p>
      * If this method returns <code>null</code>, i.e. the libraries
      * were not found in any of the JAR files loaded with this class
      * loader, the VM searches the library along the path specified
      * as the <code>java.library.path</code> property.
      *
      * @param libname The library name.
      *
      * @return The absolute path of the native library.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     Class<?> findClass(String name, ClassLoaderRepository clr)

     /**
      * Called by {@link MLet#findClass(java.lang.String)}.
      *
      * @param name The name of the class that we want to load/find.
      * @param clr The ClassLoaderRepository that can be used to search
      *            for the given class. This parameter is
      *            <code>null</code> when called from within the
      *            {@link javax.management.MBeanServerFactory#getClassLoaderRepository(javax.management.MBeanServer) Class Loader Repository}.
      * @exception ClassNotFoundException The specified class could not be
      *            found.
      *
      **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     protected Class<?> findClass(String name) throws ClassNotFoundException {

     /**
      * This is the main method for class loaders that is being redefined.
      *
      * @param name The name of the class.
      *
      * @return The resulting Class object.
      *
      * @exception ClassNotFoundException The specified class could not be
      *            found.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public synchronized Class<?> loadClass(String name,
                                            ClassLoaderRepository clr)

     /**
      * <p>Load a class, using the given {@link ClassLoaderRepository} if
      * the class is not found in this MLet's URLs.  The given
      * ClassLoaderRepository can be null, in which case a {@link
      * ClassNotFoundException} occurs immediately if the class is not
      * found in this MLet's URLs.</p>
      *
      * @param name The name of the class we want to load.
      * @param clr  The ClassLoaderRepository that will be used to search
      *             for the given class, if it is not found in this
      *             ClassLoader.  May be null.
      * @return The resulting Class object.
      * @exception ClassNotFoundException The specified class could not be
      *            found in this ClassLoader nor in the given
      *            ClassLoaderRepository.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public void readExternal(ObjectInput in)

     /**
      * <p>Restore this MLet's contents from the given {@link ObjectInput}.
      * Not all implementations support this method.  Those that do not
      * throw {@link UnsupportedOperationException}.  A subclass may
      * override this method to support it or to change the format of
      * the read data.</p>
      *
      * <p>The format of the read data is not specified, but if an
      * implementation supports {@link #readExternal} it must also
      * support {@link #writeExternal} in such a way that what is
      * written by the latter can be read by the former.</p>
      *
      * @param in The object input stream to read from.
      *
      * @exception IOException if a problem occurred while reading.
      * @exception ClassNotFoundException if the class for the object
      * being restored cannot be found.
      * @exception UnsupportedOperationException if this
      * implementation does not support this operation.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public void writeExternal(ObjectOutput out)

     /**
      * <p>Save this MLet's contents to the given {@link ObjectOutput}.
      * Not all implementations support this method.  Those that do not
      * throw {@link UnsupportedOperationException}.  A subclass may
      * override this method to support it or to change the format of
      * the written data.</p>
      *
      * <p>The format of the written data is not specified, but if
      * an implementation supports {@link #writeExternal} it must
      * also support {@link #readExternal} in such a way that what is
      * written by the former can be read by the latter.</p>
      *
      * @param out The object output stream to write to.
      *
      * @exception IOException If a problem occurred while writing.
      * @exception UnsupportedOperationException If this
      * implementation does not support this operation.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public void postDeregister() {

     /**
      * Allows the m-let to perform any operations needed after having been
      * unregistered in the MBean server.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public void preDeregister() throws java.lang.Exception {

     /**
      * Allows the m-let to perform any operations it needs before being unregistered
      * by the MBean server.
      *
      * @exception java.lang.Exception This exception should be caught
      * by the MBean server and re-thrown as an
      * MBeanRegistrationException.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public void postRegister (Boolean registrationDone) {

     /**
      * Allows the m-let to perform any operations needed after having been
      * registered in the MBean server or after the registration has failed.
      *
      * @param registrationDone Indicates whether or not the m-let has
      * been successfully registered in the MBean server. The value
      * false means that either the registration phase has failed.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public ObjectName preRegister(MBeanServer server, ObjectName name)

     /**
      * Allows the m-let to perform any operations it needs before
      * being registered in the MBean server. If the ObjectName is
      * null, the m-let provides a default name for its registration
      * &lt;defaultDomain&gt;:type=MLet
      *
      * @param server The MBean server in which the m-let will be registered.
      * @param name The object name of the m-let.
      *
      * @return  The name of the m-let registered.
      *
      * @exception java.lang.Exception This exception should be caught by the MBean server and re-thrown
      *as an MBeanRegistrationException.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public synchronized void setLibraryDirectory(String libdir) {

     /**
      * Sets the directory used by the library loader for storing
      * native libraries before they are loaded into memory.
      *
      * @param libdir The directory used by the library loader.
      *
      * @see #getLibraryDirectory
      *
      * @throws UnsupportedOperationException if this implementation
      * does not support storing native libraries in this way.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public synchronized String getLibraryDirectory() {

     /**
      * Gets the current directory used by the library loader for
      * storing native libraries before they are loaded into memory.
      *
      * @return The current directory used by the library loader.
      *
      * @see #setLibraryDirectory
      *
      * @throws UnsupportedOperationException if this implementation
      * does not support storing native libraries in this way.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public Set<Object> getMBeansFromURL(String url)

     /**
      * Loads a text file containing MLET tags that define the MBeans to
      * be added to the MBean server. The location of the text file is specified by
      * a URL. The MBeans specified in the MLET file will be instantiated and
      * registered in the MBean server.
      *
      * @param url The URL of the text file to be loaded as String object.
      *
      * @return A set containing one entry per MLET tag in the m-let
      * text file loaded.  Each entry specifies either the
      * ObjectInstance for the created MBean, or a throwable object
      * (that is, an error or an exception) if the MBean could not be
      * created.
      *
      * @exception ServiceNotFoundException One of the following
      * errors has occurred: The m-let text file does not contain an
      * MLET tag, the m-let text file is not found, a mandatory
      * attribute of the MLET tag is not specified, the url is
      * malformed.
      * @exception IllegalStateException MLet MBean is not registered
      * with an MBeanServer.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public Set<Object> getMBeansFromURL(URL url)

     /**
      * Loads a text file containing MLET tags that define the MBeans to
      * be added to the MBean server. The location of the text file is specified by
      * a URL. The MBeans specified in the MLET file will be instantiated and
      * registered in the MBean server.
      *
      * @param url The URL of the text file to be loaded as URL object.
      *
      * @return  A set containing one entry per MLET tag in the m-let text file loaded.
      * Each entry specifies either the ObjectInstance for the created MBean, or a throwable object
      * (that is, an error or an exception) if the MBean could not be created.
      *
      * @exception ServiceNotFoundException One of the following errors has occurred: The m-let text file does
      * not contain an MLET tag, the m-let text file is not found, a mandatory
      * attribute of the MLET tag is not specified, the value of url is
      * null.
      * @exception IllegalStateException MLet MBean is not registered with an MBeanServer.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public URL[] getURLs() {

     /** Returns the search path of URLs for loading classes and resources.
      * This includes the original list of URLs specified to the constructor,
      * along with any URLs subsequently appended by the addURL() method.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public void addURL(String url) throws ServiceNotFoundException {

     /**
      * Appends the specified URL to the list of URLs to search for classes and
      * resources.
      * @exception ServiceNotFoundException The specified URL is malformed.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public void addURL(URL url) {

     /**
      * Appends the specified URL to the list of URLs to search for classes and
      * resources.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public MLet(URL[] urls,
                 ClassLoader parent,
                 URLStreamHandlerFactory factory,
                 boolean delegateToCLR) {

     /**
      * Constructs a new MLet for the specified URLs, parent class
      * loader, and URLStreamHandlerFactory. The parent argument will
      * be used as the parent class loader for delegation. The factory
      * argument will be used as the stream handler factory to obtain
      * protocol handlers when creating new URLs.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public MLet(URL[] urls, ClassLoader parent, boolean delegateToCLR) {

     /**
      * Constructs a new MLet for the given URLs. The URLs will be
      * searched in the order specified for classes and resources
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public MLet(URL[] urls, boolean delegateToCLR) {

     /**
      * Constructs a new MLet for the specified URLs using the default
      * delegation parent ClassLoader.  The URLs will be searched in
      * the order specified for classes and resources after first
      * searching in the parent class loader.
      *
      * @param  urls  The URLs from which to load classes and resources.
      * @param  delegateToCLR  True if, when a class is not found in
      * either the parent ClassLoader or the URLs, the MLet should delegate
      * to its containing MBeanServer's {@link ClassLoaderRepository}.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public MLet(URL[] urls,
                 ClassLoader parent,
                 URLStreamHandlerFactory factory) {

     /**
      * Constructs a new MLet for the specified URLs, parent class
      * loader, and URLStreamHandlerFactory. The parent argument will
      * be used as the parent class loader for delegation. The factory
      * argument will be used as the stream handler factory to obtain
      * protocol handlers when creating new URLs.
      *
      * @param  urls  The URLs from which to load classes and resources.
      * @param  parent The parent class loader for delegation.
      * @param  factory  The URLStreamHandlerFactory to use when creating URLs.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public MLet(URL[] urls, ClassLoader parent) {

     /**
      * Constructs a new MLet for the given URLs. The URLs will be
      * searched in the order specified for classes and resources
      * after first searching in the specified parent class loader.
      * The parent argument will be used as the parent class loader
      * for delegation.
      *
      * @param  urls  The URLs from which to load classes and resources.
      * @param  parent The parent class loader for delegation.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public MLet(URL[] urls) {

     /**
      * Constructs a new MLet for the specified URLs using the default
      * delegation parent ClassLoader.  The URLs will be searched in
      * the order specified for classes and resources after first
      * searching in the parent class loader.
      *
      * @param  urls  The URLs from which to load classes and resources.
      *
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     public MLet() {

     /**
      * Constructs a new MLet using the default delegation parent ClassLoader.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private Map<String,Class<?>> primitiveClasses =

     /**
      * objects maps from primitive classes to primitive object classes.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private transient boolean delegateToCLR;

     /**
      * True if we should consult the {@link ClassLoaderRepository}
      * when we do not find a class ourselves.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private transient ClassLoaderRepository currentClr;

     /**
      * What ClassLoaderRepository, if any, to use if this MLet
      * doesn't find an asked-for class.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private URL[] myUrls = null;

     /**
      * The URLs of the MLet Service.
      * @serial
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private ObjectName mletObjectName = null;

     /**
      * The object name of the MLet Service.
      * @serial
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private String libraryDirectory;

     /**
      * The directory used for storing libraries locally before they are loaded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private List<MLetContent> mletList = new ArrayList<MLetContent>();

     /**
      * The list of instances of the <CODE>MLetContent</CODE>
      * class found at the specified URL.
      * @serial
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
     private MBeanServer server = null;

     /**
      * The reference to the MBean server.
      * @serial
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLet.java
public class MLet extends java.net.URLClassLoader

/**
 * Allows you to instantiate and register one or several MBeans in the MBean server
 * coming from a remote URL. M-let is a shortcut for management applet. The m-let service does this
 * by loading an m-let text file, which specifies information on the MBeans to be obtained.
 * The information on each MBean is specified in a single instance of a tag, called the MLET tag.
 * The location of the m-let text file is specified by a URL.
 * <p>
 * The <CODE>MLET</CODE> tag has the following syntax:
 * <p>
 * &lt;<CODE>MLET</CODE><BR>
 *      <CODE>CODE = </CODE><VAR>class</VAR><CODE> | OBJECT = </CODE><VAR>serfile</VAR><BR>
 *      <CODE>ARCHIVE = &quot;</CODE><VAR>archiveList</VAR><CODE>&quot;</CODE><BR>
 *      <CODE>[CODEBASE = </CODE><VAR>codebaseURL</VAR><CODE>]</CODE><BR>
 *      <CODE>[NAME = </CODE><VAR>mbeanname</VAR><CODE>]</CODE><BR>
 *      <CODE>[VERSION = </CODE><VAR>version</VAR><CODE>]</CODE><BR>
 * &gt;<BR>
 *      <CODE>[</CODE><VAR>arglist</VAR><CODE>]</CODE><BR>
 * &lt;<CODE>/MLET</CODE>&gt;
 * <p>
 * where:
 * <DL>
 * <DT><CODE>CODE = </CODE><VAR>class</VAR></DT>
 * <DD>
 * This attribute specifies the full Java class name, including package name, of the MBean to be obtained.
 * The compiled <CODE>.class</CODE> file of the MBean must be contained in one of the <CODE>.jar</CODE> files specified by the <CODE>ARCHIVE</CODE>
 * attribute. Either <CODE>CODE</CODE> or <CODE>OBJECT</CODE> must be present.
 * </DD>
 * <DT><CODE>OBJECT = </CODE><VAR>serfile</VAR></DT>
 * <DD>
 * This attribute specifies the <CODE>.ser</CODE> file that contains a serialized representation of the MBean to be obtained.
 * This file must be contained in one of the <CODE>.jar</CODE> files specified by the <CODE>ARCHIVE</CODE> attribute. If the <CODE>.jar</CODE> file contains a directory hierarchy, specify the path of the file within this hierarchy. Otherwise  a match will not be found. Either <CODE>CODE</CODE> or <CODE>OBJECT</CODE> must be present.
 * </DD>
 * <DT><CODE>ARCHIVE = &quot;</CODE><VAR>archiveList</VAR><CODE>&quot;</CODE></DT>
 * <DD>
 * This mandatory attribute specifies one or more <CODE>.jar</CODE> files
 * containing MBeans or other resources used by
 * the MBean to be obtained. One of the <CODE>.jar</CODE> files must contain the file specified by the <CODE>CODE</CODE> or <CODE>OBJECT</CODE> attribute.
 * If archivelist contains more than one file:
 * <UL>
 * <LI>Each file must be separated from the one that follows it by a comma (,).
 * <LI><VAR>archivelist</VAR> must be enclosed in double quote marks.
 * </UL>
 * All <CODE>.jar</CODE> files in <VAR>archivelist</VAR> must be stored in the directory specified by the code base URL.
 * </DD>
 * <DT><CODE>CODEBASE = </CODE><VAR>codebaseURL</VAR></DT>
 * <DD>
 * This optional attribute specifies the code base URL of the MBean to be obtained. It identifies the directory that contains
 * the <CODE>.jar</CODE> files specified by the <CODE>ARCHIVE</CODE> attribute. Specify this attribute only if the <CODE>.jar</CODE> files are not in the same
 * directory as the m-let text file. If this attribute is not specified, the base URL of the m-let text file is used.
 * </DD>
 * <DT><CODE>NAME = </CODE><VAR>mbeanname</VAR></DT>
 * <DD>
 * This optional attribute specifies the object name to be assigned to the
 * MBean instance when the m-let service registers it. If
 * <VAR>mbeanname</VAR> starts with the colon character (:), the domain
 * part of the object name is the default domain of the MBean server,
 * as returned by {@link javax.management.MBeanServer#getDefaultDomain()}.
 * </DD>
 * <DT><CODE>VERSION = </CODE><VAR>version</VAR></DT>
 * <DD>
 * This optional attribute specifies the version number of the MBean and
 * associated <CODE>.jar</CODE> files to be obtained. This version number can
 * be used to specify that the <CODE>.jar</CODE> files are loaded from the
 * server to update those stored locally in the cache the next time the m-let
 * text file is loaded. <VAR>version</VAR> must be a series of non-negative
 * decimal integers each separated by a period from the one that precedes it.
 * </DD>
 * <DT><VAR>arglist</VAR></DT>
 * <DD>
 * This optional attribute specifies a list of one or more parameters for the
 * MBean to be instantiated. This list describes the parameters to be passed the MBean's constructor.
 * Use the following syntax to specify each item in
 * <VAR>arglist</VAR>:
 * <DL>
 * <DT>&lt;<CODE>ARG TYPE=</CODE><VAR>argumentType</VAR> <CODE>VALUE=</CODE><VAR>value</VAR>&gt;</DT>
 * <DD>where:
 * <UL>
 * <LI><VAR>argumentType</VAR> is the type of the argument that will be passed as parameter to the MBean's constructor.</UL>
 * </DD>
 * </DL>
 * <P>The arguments' type in the argument list should be a Java primitive type or a Java basic type
 * (<CODE>java.lang.Boolean, java.lang.Byte, java.lang.Short, java.lang.Long, java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String</CODE>).
 * </DD>
 * </DL>
 *
 * When an m-let text file is loaded, an
 * instance of each MBean specified in the file is created and registered.
 * <P>
 * The m-let service extends the <CODE>java.net.URLClassLoader</CODE> and can be used to load remote classes
 * and jar files in the VM of the agent.
 * <p><STRONG>Note - </STRONG> The <CODE>MLet</CODE> class loader uses the {@link javax.management.MBeanServerFactory#getClassLoaderRepository(javax.management.MBeanServer)}
 * to load classes that could not be found in the loaded jar files.
 *
 * @since 1.5
 */
