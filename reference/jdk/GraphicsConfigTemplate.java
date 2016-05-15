_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public abstract boolean

    /**
     * Returns a <code>boolean</code> indicating whether or
     * not the specified <code>GraphicsConfiguration</code> can be
     * used to create a drawing surface that supports the indicated
     * features.
     * @param gc the <code>GraphicsConfiguration</code> object to test
     * @return <code>true</code> if this
     * <code>GraphicsConfiguration</code> object can be used to create
     * surfaces that support the indicated features;
     * <code>false</code> if the <code>GraphicsConfiguration</code> can
     * not be used to create a drawing surface usable by this Java(tm)
     * API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public abstract GraphicsConfiguration

    /**
     * Returns the "best" configuration possible that passes the
     * criteria defined in the <code>GraphicsConfigTemplate</code>.
     * @param gc the array of <code>GraphicsConfiguration</code>
     * objects to choose from.
     * @return a <code>GraphicsConfiguration</code> object that is
     * the best configuration possible.
     * @see GraphicsConfiguration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public static final int UNNECESSARY = 3;

    /**
     * Value used for "Enum" (Integer) type.  States that this
     * feature is not necessary for the selection of the
     * <code>GraphicsConfiguration</code> object.  A selection
     * without this feature is preferred over a selection that
     * includes this feature since it is not used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public static final int PREFERRED   = 2;

    /**
     * Value used for "Enum" (Integer) type.  States that this
     * feature is desired for the <code>GraphicsConfiguration</code>
     * object.  A selection with this feature is preferred over a
     * selection that does not include this feature, although both
     * selections can be considered valid matches.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public static final int REQUIRED    = 1;

    /**
     * Value used for "Enum" (Integer) type.  States that this
     * feature is required for the <code>GraphicsConfiguration</code>
     * object.  If this feature is not available, do not select the
     * <code>GraphicsConfiguration</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public GraphicsConfigTemplate() {

    /**
     * This class is an abstract class so only subclasses can be
     * instantiated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
public abstract class GraphicsConfigTemplate implements Serializable {

/**
 * The <code>GraphicsConfigTemplate</code> class is used to obtain a valid
 * {@link GraphicsConfiguration}.  A user instantiates one of these
 * objects and then sets all non-default attributes as desired.  The
 * {@link GraphicsDevice#getBestConfiguration} method found in the
 * {@link GraphicsDevice} class is then called with this
 * <code>GraphicsConfigTemplate</code>.  A valid
 * <code>GraphicsConfiguration</code> is returned that meets or exceeds
 * what was requested in the <code>GraphicsConfigTemplate</code>.
 * @see GraphicsDevice
 * @see GraphicsConfiguration
 *
 * @since       1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public abstract boolean

    /**
     * Returns a <code>boolean</code> indicating whether or
     * not the specified <code>GraphicsConfiguration</code> can be
     * used to create a drawing surface that supports the indicated
     * features.
     * @param gc the <code>GraphicsConfiguration</code> object to test
     * @return <code>true</code> if this
     * <code>GraphicsConfiguration</code> object can be used to create
     * surfaces that support the indicated features;
     * <code>false</code> if the <code>GraphicsConfiguration</code> can
     * not be used to create a drawing surface usable by this Java(tm)
     * API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public abstract GraphicsConfiguration

    /**
     * Returns the "best" configuration possible that passes the
     * criteria defined in the <code>GraphicsConfigTemplate</code>.
     * @param gc the array of <code>GraphicsConfiguration</code>
     * objects to choose from.
     * @return a <code>GraphicsConfiguration</code> object that is
     * the best configuration possible.
     * @see GraphicsConfiguration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public static final int UNNECESSARY = 3;

    /**
     * Value used for "Enum" (Integer) type.  States that this
     * feature is not necessary for the selection of the
     * <code>GraphicsConfiguration</code> object.  A selection
     * without this feature is preferred over a selection that
     * includes this feature since it is not used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public static final int PREFERRED   = 2;

    /**
     * Value used for "Enum" (Integer) type.  States that this
     * feature is desired for the <code>GraphicsConfiguration</code>
     * object.  A selection with this feature is preferred over a
     * selection that does not include this feature, although both
     * selections can be considered valid matches.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public static final int REQUIRED    = 1;

    /**
     * Value used for "Enum" (Integer) type.  States that this
     * feature is required for the <code>GraphicsConfiguration</code>
     * object.  If this feature is not available, do not select the
     * <code>GraphicsConfiguration</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
    public GraphicsConfigTemplate() {

    /**
     * This class is an abstract class so only subclasses can be
     * instantiated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GraphicsConfigTemplate.java
public abstract class GraphicsConfigTemplate implements Serializable {

/**
 * The <code>GraphicsConfigTemplate</code> class is used to obtain a valid
 * {@link GraphicsConfiguration}.  A user instantiates one of these
 * objects and then sets all non-default attributes as desired.  The
 * {@link GraphicsDevice#getBestConfiguration} method found in the
 * {@link GraphicsDevice} class is then called with this
 * <code>GraphicsConfigTemplate</code>.  A valid
 * <code>GraphicsConfiguration</code> is returned that meets or exceeds
 * what was requested in the <code>GraphicsConfigTemplate</code>.
 * @see GraphicsDevice
 * @see GraphicsConfiguration
 *
 * @since       1.2
 */