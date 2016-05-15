_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    protected class AccessibleAWTCanvas extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Canvas</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to canvas user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Canvas.
     * For canvases, the AccessibleContext takes the form of an
     * AccessibleAWTCanvas.
     * A new AccessibleAWTCanvas instance is created if necessary.
     *
     * @return an AccessibleAWTCanvas that serves as the
     *         AccessibleContext of this Canvas
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public BufferStrategy getBufferStrategy() {

    /**
     * Returns the <code>BufferStrategy</code> used by this component.  This
     * method will return null if a <code>BufferStrategy</code> has not yet
     * been created or has been disposed.
     *
     * @return the buffer strategy used by this component
     * @see #createBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void createBufferStrategy(int numBuffers,
        BufferCapabilities caps) throws AWTException {

    /**
     * Creates a new strategy for multi-buffering on this component with the
     * required buffer capabilities.  This is useful, for example, if only
     * accelerated memory or page flipping is desired (as specified by the
     * buffer capabilities).
     * <p>
     * Each time this method
     * is called, the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create
     * @param caps the required capabilities for creating the buffer strategy;
     * cannot be <code>null</code>
     * @exception AWTException if the capabilities supplied could not be
     * supported or met; this may happen, for example, if there is not enough
     * accelerated memory currently available, or if page flipping is specified
     * but not possible.
     * @exception IllegalArgumentException if numBuffers is less than 1, or if
     * caps is <code>null</code>
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void createBufferStrategy(int numBuffers) {

    /**
     * Creates a new strategy for multi-buffering on this component.
     * Multi-buffering is useful for rendering performance.  This method
     * attempts to create the best strategy available with the number of
     * buffers supplied.  It will always create a <code>BufferStrategy</code>
     * with that number of buffers.
     * A page-flipping strategy is attempted first, then a blitting strategy
     * using accelerated buffers.  Finally, an unaccelerated blitting
     * strategy is used.
     * <p>
     * Each time this method is called,
     * the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create, including the front buffer
     * @exception IllegalArgumentException if numBuffers is less than 1.
     * @exception IllegalStateException if the component is not displayable
     * @see #isDisplayable
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void update(Graphics g) {

    /**
     * Updates this canvas.
     * <p>
     * This method is called in response to a call to <code>repaint</code>.
     * The canvas is first cleared by filling it with the background
     * color, and then completely redrawn by calling this canvas's
     * <code>paint</code> method.
     * Note: applications that override this method should either call
     * super.update(g) or incorporate the functionality described
     * above into their own code.
     *
     * @param g the specified Graphics context
     * @see   #paint(Graphics)
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void paint(Graphics g) {

    /**
     * Paints this canvas.
     * <p>
     * Most applications that subclass <code>Canvas</code> should
     * override this method in order to perform some useful operation
     * (typically, custom painting of the canvas).
     * The default operation is simply to clear the canvas.
     * Applications that override this method need not call
     * super.paint(g).
     *
     * @param      g   the specified Graphics context
     * @see        #update(Graphics)
     * @see        Component#paint(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void addNotify() {

    /**
     * Creates the peer of the canvas.  This peer allows you to change the
     * user interface of the canvas without changing its functionality.
     * @see     java.awt.Toolkit#createCanvas(java.awt.Canvas)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public Canvas(GraphicsConfiguration config) {

    /**
     * Constructs a new Canvas given a GraphicsConfiguration object.
     *
     * @param config a reference to a GraphicsConfiguration object.
     *
     * @see GraphicsConfiguration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public Canvas() {

    /**
     * Constructs a new Canvas.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
public class Canvas extends Component implements Accessible {

/**
 * A <code>Canvas</code> component represents a blank rectangular
 * area of the screen onto which the application can draw or from
 * which the application can trap input events from the user.
 * <p>
 * An application must subclass the <code>Canvas</code> class in
 * order to get useful functionality such as creating a custom
 * component. The <code>paint</code> method must be overridden
 * in order to perform custom graphics on the canvas.
 *
 * @author      Sami Shaio
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    protected class AccessibleAWTCanvas extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Canvas</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to canvas user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Canvas.
     * For canvases, the AccessibleContext takes the form of an
     * AccessibleAWTCanvas.
     * A new AccessibleAWTCanvas instance is created if necessary.
     *
     * @return an AccessibleAWTCanvas that serves as the
     *         AccessibleContext of this Canvas
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public BufferStrategy getBufferStrategy() {

    /**
     * Returns the <code>BufferStrategy</code> used by this component.  This
     * method will return null if a <code>BufferStrategy</code> has not yet
     * been created or has been disposed.
     *
     * @return the buffer strategy used by this component
     * @see #createBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void createBufferStrategy(int numBuffers,
        BufferCapabilities caps) throws AWTException {

    /**
     * Creates a new strategy for multi-buffering on this component with the
     * required buffer capabilities.  This is useful, for example, if only
     * accelerated memory or page flipping is desired (as specified by the
     * buffer capabilities).
     * <p>
     * Each time this method
     * is called, the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create
     * @param caps the required capabilities for creating the buffer strategy;
     * cannot be <code>null</code>
     * @exception AWTException if the capabilities supplied could not be
     * supported or met; this may happen, for example, if there is not enough
     * accelerated memory currently available, or if page flipping is specified
     * but not possible.
     * @exception IllegalArgumentException if numBuffers is less than 1, or if
     * caps is <code>null</code>
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void createBufferStrategy(int numBuffers) {

    /**
     * Creates a new strategy for multi-buffering on this component.
     * Multi-buffering is useful for rendering performance.  This method
     * attempts to create the best strategy available with the number of
     * buffers supplied.  It will always create a <code>BufferStrategy</code>
     * with that number of buffers.
     * A page-flipping strategy is attempted first, then a blitting strategy
     * using accelerated buffers.  Finally, an unaccelerated blitting
     * strategy is used.
     * <p>
     * Each time this method is called,
     * the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create, including the front buffer
     * @exception IllegalArgumentException if numBuffers is less than 1.
     * @exception IllegalStateException if the component is not displayable
     * @see #isDisplayable
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void update(Graphics g) {

    /**
     * Updates this canvas.
     * <p>
     * This method is called in response to a call to <code>repaint</code>.
     * The canvas is first cleared by filling it with the background
     * color, and then completely redrawn by calling this canvas's
     * <code>paint</code> method.
     * Note: applications that override this method should either call
     * super.update(g) or incorporate the functionality described
     * above into their own code.
     *
     * @param g the specified Graphics context
     * @see   #paint(Graphics)
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void paint(Graphics g) {

    /**
     * Paints this canvas.
     * <p>
     * Most applications that subclass <code>Canvas</code> should
     * override this method in order to perform some useful operation
     * (typically, custom painting of the canvas).
     * The default operation is simply to clear the canvas.
     * Applications that override this method need not call
     * super.paint(g).
     *
     * @param      g   the specified Graphics context
     * @see        #update(Graphics)
     * @see        Component#paint(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public void addNotify() {

    /**
     * Creates the peer of the canvas.  This peer allows you to change the
     * user interface of the canvas without changing its functionality.
     * @see     java.awt.Toolkit#createCanvas(java.awt.Canvas)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public Canvas(GraphicsConfiguration config) {

    /**
     * Constructs a new Canvas given a GraphicsConfiguration object.
     *
     * @param config a reference to a GraphicsConfiguration object.
     *
     * @see GraphicsConfiguration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
    public Canvas() {

    /**
     * Constructs a new Canvas.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Canvas.java
public class Canvas extends Component implements Accessible {

/**
 * A <code>Canvas</code> component represents a blank rectangular
 * area of the screen onto which the application can draw or from
 * which the application can trap input events from the user.
 * <p>
 * An application must subclass the <code>Canvas</code> class in
 * order to get useful functionality such as creating a custom
 * component. The <code>paint</code> method must be overridden
 * in order to perform custom graphics on the canvas.
 *
 * @author      Sami Shaio
 * @since       JDK1.0
 */