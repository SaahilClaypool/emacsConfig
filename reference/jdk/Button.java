_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum value of this object as a Number.
         *
         * @return An Integer of 0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum value of this object as a Number.
         *
         * @return An Integer of 0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @return True if the value was set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the value of this object as a Number.
         *
         * @return An Integer of 0 if this isn't selected or an Integer of 1 if
         * this is selected.
         * @see javax.swing.AbstractButton#isSelected()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the the action was performed; else false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Return a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of Actions available in this object.  The
         * default behavior of a button is to have one action - toggle
         * the button.
         *
         * @return 1, the number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Get the AccessibleValue associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleValue interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Get the AccessibleAction associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleAction interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public String getAccessibleName() {

        /**
         * Get the accessible name of this object.
         *
         * @return the localized name of the object -- can be null if this
         * object does not have a name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected class AccessibleAWTButton extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Button</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to button user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with
     * this <code>Button</code>. For buttons, the
     * <code>AccessibleContext</code> takes the form of an
     * <code>AccessibleAWTButton</code>.
     * A new <code>AccessibleAWTButton</code> instance is
     * created if necessary.
     *
     * @return an <code>AccessibleAWTButton</code> that serves as the
     *         <code>AccessibleContext</code> of this <code>Button</code>
     * @beaninfo
     *       expert: true
     *  description: The AccessibleContext associated with this Button.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if
     * it isn't <code>null</code> adds a listener to
     * receive action events fired by the button.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @serial
     * @see #removeActionListener(ActionListener)
     * @see #addActionListener(ActionListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ActionListeners</code>
     * as optional data.  The non-serializable
     * <code>ActionListeners</code> are detected and
     * no attempt is made to serialize them.
     *
     * @serialData <code>null</code> terminated sequence of 0 or
     *   more pairs: the pair consists of a <code>String</code>
     *   and an <code>Object</code>; the <code>String</code>
     *   indicates the type of object and is one of the following:
     *   <code>actionListenerK</code> indicating an
     *     <code>ActionListener</code> object
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#actionListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Button</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return     the parameter string of this button
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected void processActionEvent(ActionEvent e) {

    /**
     * Processes action events occurring on this button
     * by dispatching them to any registered
     * <code>ActionListener</code> objects.
     * <p>
     * This method is not called unless action events are
     * enabled for this button. Action events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ActionListener</code> object is registered
     * via <code>addActionListener</code>.
     * <li>Action events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the action event
     * @see         java.awt.event.ActionListener
     * @see         java.awt.Button#addActionListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this button. If an event is
     * an instance of <code>ActionEvent</code>, this method invokes
     * the <code>processActionEvent</code> method. Otherwise,
     * it invokes <code>processEvent</code> on the superclass.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param        e the event
     * @see          java.awt.event.ActionEvent
     * @see          java.awt.Button#processActionEvent
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Button</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Button</code> <code>b</code>
     * for its action listeners with the following code:
     *
     * <pre>ActionListener[] als = (ActionListener[])(b.getListeners(ActionListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this button,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getActionListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public synchronized ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this button.
     *
     * @return all of this button's <code>ActionListener</code>s
     *         or an empty array if no action
     *         listeners are currently registered
     *
     * @see             #addActionListener
     * @see             #removeActionListener
     * @see             java.awt.event.ActionListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public synchronized void removeActionListener(ActionListener l) {

    /**
     * Removes the specified action listener so that it no longer
     * receives action events from this button. Action events occur
     * when a user presses or releases the mouse over this button.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l     the action listener
     * @see             #addActionListener
     * @see             #getActionListeners
     * @see             java.awt.event.ActionListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public synchronized void addActionListener(ActionListener l) {

    /**
     * Adds the specified action listener to receive action events from
     * this button. Action events occur when a user presses or releases
     * the mouse over this button.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the action listener
     * @see           #removeActionListener
     * @see           #getActionListeners
     * @see           java.awt.event.ActionListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public String getActionCommand() {

    /**
     * Returns the command name of the action event fired by this button.
     * If the command name is <code>null</code> (default) then this method
     * returns the label of the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public void setActionCommand(String command) {

    /**
     * Sets the command name for the action event fired
     * by this button. By default this action command is
     * set to match the label of the button.
     *
     * @param     command  a string used to set the button's
     *                  action command.
     *            If the string is <code>null</code> then the action command
     *            is set to match the label of the button.
     * @see       java.awt.event.ActionEvent
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public void setLabel(String label) {

    /**
     * Sets the button's label to be the specified string.
     *
     * @param     label   the new label, or <code>null</code>
     *                if the button has no label.
     * @see       java.awt.Button#getLabel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public String getLabel() {

    /**
     * Gets the label of this button.
     *
     * @return    the button's label, or <code>null</code>
     *                if the button has no label.
     * @see       java.awt.Button#setLabel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public void addNotify() {

    /**
     * Creates the peer of the button.  The button's peer allows the
     * application to change the look of the button without changing
     * its functionality.
     *
     * @see     java.awt.Toolkit#createButton(java.awt.Button)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public Button(String label) throws HeadlessException {

    /**
     * Constructs a button with the specified label.
     *
     * @param label  a string label for the button, or
     *               <code>null</code> for no label
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public Button() throws HeadlessException {

    /**
     * Constructs a button with an empty string for its label.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    String actionCommand;

    /**
     * The action to be performed once a button has been
     * pressed.  This value may be null.
     * @serial
     * @see #getActionCommand()
     * @see #setActionCommand(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    String label;

    /**
     * The button's label.  This value may be null.
     * @serial
     * @see #getLabel()
     * @see #setLabel(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
public class Button extends Component implements Accessible {

/**
 * This class creates a labeled button. The application can cause
 * some action to happen when the button is pushed. This image
 * depicts three views of a "<code>Quit</code>" button as it appears
 * under the Solaris operating system:
 * <p>
 * <img src="doc-files/Button-1.gif" alt="The following context describes the graphic"
 * style="float:center; margin: 7px 10px;">
 * <p>
 * The first view shows the button as it appears normally.
 * The second view shows the button
 * when it has input focus. Its outline is darkened to let the
 * user know that it is an active object. The third view shows the
 * button when the user clicks the mouse over the button, and thus
 * requests that an action be performed.
 * <p>
 * The gesture of clicking on a button with the mouse
 * is associated with one instance of <code>ActionEvent</code>,
 * which is sent out when the mouse is both pressed and released
 * over the button. If an application is interested in knowing
 * when the button has been pressed but not released, as a separate
 * gesture, it can specialize <code>processMouseEvent</code>,
 * or it can register itself as a listener for mouse events by
 * calling <code>addMouseListener</code>. Both of these methods are
 * defined by <code>Component</code>, the abstract superclass of
 * all components.
 * <p>
 * When a button is pressed and released, AWT sends an instance
 * of <code>ActionEvent</code> to the button, by calling
 * <code>processEvent</code> on the button. The button's
 * <code>processEvent</code> method receives all events
 * for the button; it passes an action event along by
 * calling its own <code>processActionEvent</code> method.
 * The latter method passes the action event on to any action
 * listeners that have registered an interest in action
 * events generated by this button.
 * <p>
 * If an application wants to perform some action based on
 * a button being pressed and released, it should implement
 * <code>ActionListener</code> and register the new listener
 * to receive events from this button, by calling the button's
 * <code>addActionListener</code> method. The application can
 * make use of the button's action command as a messaging protocol.
 *
 * @author      Sami Shaio
 * @see         java.awt.event.ActionEvent
 * @see         java.awt.event.ActionListener
 * @see         java.awt.Component#processMouseEvent
 * @see         java.awt.Component#addMouseListener
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum value of this object as a Number.
         *
         * @return An Integer of 0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum value of this object as a Number.
         *
         * @return An Integer of 0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @return True if the value was set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the value of this object as a Number.
         *
         * @return An Integer of 0 if this isn't selected or an Integer of 1 if
         * this is selected.
         * @see javax.swing.AbstractButton#isSelected()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the the action was performed; else false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Return a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of Actions available in this object.  The
         * default behavior of a button is to have one action - toggle
         * the button.
         *
         * @return 1, the number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Get the AccessibleValue associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleValue interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Get the AccessibleAction associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleAction interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
        public String getAccessibleName() {

        /**
         * Get the accessible name of this object.
         *
         * @return the localized name of the object -- can be null if this
         * object does not have a name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected class AccessibleAWTButton extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Button</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to button user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with
     * this <code>Button</code>. For buttons, the
     * <code>AccessibleContext</code> takes the form of an
     * <code>AccessibleAWTButton</code>.
     * A new <code>AccessibleAWTButton</code> instance is
     * created if necessary.
     *
     * @return an <code>AccessibleAWTButton</code> that serves as the
     *         <code>AccessibleContext</code> of this <code>Button</code>
     * @beaninfo
     *       expert: true
     *  description: The AccessibleContext associated with this Button.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if
     * it isn't <code>null</code> adds a listener to
     * receive action events fired by the button.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @serial
     * @see #removeActionListener(ActionListener)
     * @see #addActionListener(ActionListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ActionListeners</code>
     * as optional data.  The non-serializable
     * <code>ActionListeners</code> are detected and
     * no attempt is made to serialize them.
     *
     * @serialData <code>null</code> terminated sequence of 0 or
     *   more pairs: the pair consists of a <code>String</code>
     *   and an <code>Object</code>; the <code>String</code>
     *   indicates the type of object and is one of the following:
     *   <code>actionListenerK</code> indicating an
     *     <code>ActionListener</code> object
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#actionListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Button</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return     the parameter string of this button
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected void processActionEvent(ActionEvent e) {

    /**
     * Processes action events occurring on this button
     * by dispatching them to any registered
     * <code>ActionListener</code> objects.
     * <p>
     * This method is not called unless action events are
     * enabled for this button. Action events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ActionListener</code> object is registered
     * via <code>addActionListener</code>.
     * <li>Action events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the action event
     * @see         java.awt.event.ActionListener
     * @see         java.awt.Button#addActionListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this button. If an event is
     * an instance of <code>ActionEvent</code>, this method invokes
     * the <code>processActionEvent</code> method. Otherwise,
     * it invokes <code>processEvent</code> on the superclass.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param        e the event
     * @see          java.awt.event.ActionEvent
     * @see          java.awt.Button#processActionEvent
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Button</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Button</code> <code>b</code>
     * for its action listeners with the following code:
     *
     * <pre>ActionListener[] als = (ActionListener[])(b.getListeners(ActionListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this button,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getActionListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public synchronized ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this button.
     *
     * @return all of this button's <code>ActionListener</code>s
     *         or an empty array if no action
     *         listeners are currently registered
     *
     * @see             #addActionListener
     * @see             #removeActionListener
     * @see             java.awt.event.ActionListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public synchronized void removeActionListener(ActionListener l) {

    /**
     * Removes the specified action listener so that it no longer
     * receives action events from this button. Action events occur
     * when a user presses or releases the mouse over this button.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l     the action listener
     * @see             #addActionListener
     * @see             #getActionListeners
     * @see             java.awt.event.ActionListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public synchronized void addActionListener(ActionListener l) {

    /**
     * Adds the specified action listener to receive action events from
     * this button. Action events occur when a user presses or releases
     * the mouse over this button.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the action listener
     * @see           #removeActionListener
     * @see           #getActionListeners
     * @see           java.awt.event.ActionListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public String getActionCommand() {

    /**
     * Returns the command name of the action event fired by this button.
     * If the command name is <code>null</code> (default) then this method
     * returns the label of the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public void setActionCommand(String command) {

    /**
     * Sets the command name for the action event fired
     * by this button. By default this action command is
     * set to match the label of the button.
     *
     * @param     command  a string used to set the button's
     *                  action command.
     *            If the string is <code>null</code> then the action command
     *            is set to match the label of the button.
     * @see       java.awt.event.ActionEvent
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public void setLabel(String label) {

    /**
     * Sets the button's label to be the specified string.
     *
     * @param     label   the new label, or <code>null</code>
     *                if the button has no label.
     * @see       java.awt.Button#getLabel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public String getLabel() {

    /**
     * Gets the label of this button.
     *
     * @return    the button's label, or <code>null</code>
     *                if the button has no label.
     * @see       java.awt.Button#setLabel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public void addNotify() {

    /**
     * Creates the peer of the button.  The button's peer allows the
     * application to change the look of the button without changing
     * its functionality.
     *
     * @see     java.awt.Toolkit#createButton(java.awt.Button)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public Button(String label) throws HeadlessException {

    /**
     * Constructs a button with the specified label.
     *
     * @param label  a string label for the button, or
     *               <code>null</code> for no label
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    public Button() throws HeadlessException {

    /**
     * Constructs a button with an empty string for its label.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    String actionCommand;

    /**
     * The action to be performed once a button has been
     * pressed.  This value may be null.
     * @serial
     * @see #getActionCommand()
     * @see #setActionCommand(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
    String label;

    /**
     * The button's label.  This value may be null.
     * @serial
     * @see #getLabel()
     * @see #setLabel(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Button.java
public class Button extends Component implements Accessible {

/**
 * This class creates a labeled button. The application can cause
 * some action to happen when the button is pushed. This image
 * depicts three views of a "<code>Quit</code>" button as it appears
 * under the Solaris operating system:
 * <p>
 * <img src="doc-files/Button-1.gif" alt="The following context describes the graphic"
 * style="float:center; margin: 7px 10px;">
 * <p>
 * The first view shows the button as it appears normally.
 * The second view shows the button
 * when it has input focus. Its outline is darkened to let the
 * user know that it is an active object. The third view shows the
 * button when the user clicks the mouse over the button, and thus
 * requests that an action be performed.
 * <p>
 * The gesture of clicking on a button with the mouse
 * is associated with one instance of <code>ActionEvent</code>,
 * which is sent out when the mouse is both pressed and released
 * over the button. If an application is interested in knowing
 * when the button has been pressed but not released, as a separate
 * gesture, it can specialize <code>processMouseEvent</code>,
 * or it can register itself as a listener for mouse events by
 * calling <code>addMouseListener</code>. Both of these methods are
 * defined by <code>Component</code>, the abstract superclass of
 * all components.
 * <p>
 * When a button is pressed and released, AWT sends an instance
 * of <code>ActionEvent</code> to the button, by calling
 * <code>processEvent</code> on the button. The button's
 * <code>processEvent</code> method receives all events
 * for the button; it passes an action event along by
 * calling its own <code>processActionEvent</code> method.
 * The latter method passes the action event on to any action
 * listeners that have registered an interest in action
 * events generated by this button.
 * <p>
 * If an application wants to perform some action based on
 * a button being pressed and released, it should implement
 * <code>ActionListener</code> and register the new listener
 * to receive events from this button, by calling the button's
 * <code>addActionListener</code> method. The application can
 * make use of the button's action command as a messaging protocol.
 *
 * @author      Sami Shaio
 * @see         java.awt.event.ActionEvent
 * @see         java.awt.event.ActionListener
 * @see         java.awt.Component#processMouseEvent
 * @see         java.awt.Component#addMouseListener
 * @since       JDK1.0
 */
