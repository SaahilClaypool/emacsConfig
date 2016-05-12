_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
        public String getAccessibleName() {

        /**
         * Get the accessible name of this object.
         *
         * @return the localized name of the object -- can be null if this
         * object does not have a name
         * @see AccessibleContext#setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    protected class AccessibleAWTLabel extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Label</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to label user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Label.
     * For labels, the AccessibleContext takes the form of an
     * AccessibleAWTLabel.
     * A new AccessibleAWTLabel instance is created if necessary.
     *
     * @return an AccessibleAWTLabel that serves as the
     *         AccessibleContext of this Label
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Label</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return     the parameter string of this label
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public void setText(String text) {

    /**
     * Sets the text for this label to the specified text.
     * @param      text the text that this label displays. If
     *             <code>text</code> is <code>null</code>, it is
     *             treated for display purposes like an empty
     *             string <code>""</code>.
     * @see        java.awt.Label#getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public String getText() {

    /**
     * Gets the text of this label.
     * @return     the text of this label, or <code>null</code> if
     *             the text has been set to <code>null</code>.
     * @see        java.awt.Label#setText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public synchronized void setAlignment(int alignment) {

    /**
     * Sets the alignment for this label to the specified alignment.
     * Possible values are <code>Label.LEFT</code>,
     * <code>Label.RIGHT</code>, and <code>Label.CENTER</code>.
     * @param      alignment    the alignment to be set.
     * @exception  IllegalArgumentException if an improper value for
     *                          <code>alignment</code> is given.
     * @see        java.awt.Label#getAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public int getAlignment() {

    /**
     * Gets the current alignment of this label. Possible values are
     * <code>Label.LEFT</code>, <code>Label.RIGHT</code>, and
     * <code>Label.CENTER</code>.
     * @see        java.awt.Label#setAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public void addNotify() {

    /**
     * Creates the peer for this label.  The peer allows us to
     * modify the appearance of the label without changing its
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    private void readObject(ObjectInputStream s)

    /**
     * Read a label from an object input stream.
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @serial
     * @since 1.4
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public Label(String text, int alignment) throws HeadlessException {

    /**
     * Constructs a new label that presents the specified string of
     * text with the specified alignment.
     * Possible values for <code>alignment</code> are <code>Label.LEFT</code>,
     * <code>Label.RIGHT</code>, and <code>Label.CENTER</code>.
     * @param text the string that the label presents.
     *        A <code>null</code> value
     *        will be accepted without causing a NullPointerException
     *        to be thrown.
     * @param     alignment   the alignment value.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public Label(String text) throws HeadlessException {

    /**
     * Constructs a new label with the specified string of text,
     * left justified.
     * @param text the string that the label presents.
     *        A <code>null</code> value
     *        will be accepted without causing a NullPointerException
     *        to be thrown.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public Label() throws HeadlessException {

    /**
     * Constructs an empty label.
     * The text of the label is the empty string <code>""</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    int    alignment = LEFT;

    /**
     * The label's alignment.  The default alignment is set
     * to be left justified.
     *
     * @serial
     * @see #getAlignment()
     * @see #setAlignment(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    String text;

    /**
     * The text of this label.
     * This text can be modified by the program
     * but never by the user.
     *
     * @serial
     * @see #getText()
     * @see #setText(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public static final int RIGHT       = 2;

    /**
     * Indicates that the label should be right justified.
     * @since   JDK1.0t.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public static final int CENTER      = 1;

    /**
     * Indicates that the label should be centered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public static final int LEFT        = 0;

    /**
     * Indicates that the label should be left justified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
public class Label extends Component implements Accessible {

/**
 * A <code>Label</code> object is a component for placing text in a
 * container. A label displays a single line of read-only text.
 * The text can be changed by the application, but a user cannot edit it
 * directly.
 * <p>
 * For example, the code&nbsp;.&nbsp;.&nbsp;.
 *
 * <hr><blockquote><pre>
 * setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
 * add(new Label("Hi There!"));
 * add(new Label("Another Label"));
 * </pre></blockquote><hr>
 * <p>
 * produces the following labels:
 * <p>
 * <img src="doc-files/Label-1.gif" alt="Two labels: 'Hi There!' and 'Another label'"
 * style="float:center; margin: 7px 10px;">
 *
 * @author      Sami Shaio
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
        public String getAccessibleName() {

        /**
         * Get the accessible name of this object.
         *
         * @return the localized name of the object -- can be null if this
         * object does not have a name
         * @see AccessibleContext#setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    protected class AccessibleAWTLabel extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Label</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to label user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Label.
     * For labels, the AccessibleContext takes the form of an
     * AccessibleAWTLabel.
     * A new AccessibleAWTLabel instance is created if necessary.
     *
     * @return an AccessibleAWTLabel that serves as the
     *         AccessibleContext of this Label
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Label</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return     the parameter string of this label
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public void setText(String text) {

    /**
     * Sets the text for this label to the specified text.
     * @param      text the text that this label displays. If
     *             <code>text</code> is <code>null</code>, it is
     *             treated for display purposes like an empty
     *             string <code>""</code>.
     * @see        java.awt.Label#getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public String getText() {

    /**
     * Gets the text of this label.
     * @return     the text of this label, or <code>null</code> if
     *             the text has been set to <code>null</code>.
     * @see        java.awt.Label#setText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public synchronized void setAlignment(int alignment) {

    /**
     * Sets the alignment for this label to the specified alignment.
     * Possible values are <code>Label.LEFT</code>,
     * <code>Label.RIGHT</code>, and <code>Label.CENTER</code>.
     * @param      alignment    the alignment to be set.
     * @exception  IllegalArgumentException if an improper value for
     *                          <code>alignment</code> is given.
     * @see        java.awt.Label#getAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public int getAlignment() {

    /**
     * Gets the current alignment of this label. Possible values are
     * <code>Label.LEFT</code>, <code>Label.RIGHT</code>, and
     * <code>Label.CENTER</code>.
     * @see        java.awt.Label#setAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public void addNotify() {

    /**
     * Creates the peer for this label.  The peer allows us to
     * modify the appearance of the label without changing its
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    private void readObject(ObjectInputStream s)

    /**
     * Read a label from an object input stream.
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @serial
     * @since 1.4
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public Label(String text, int alignment) throws HeadlessException {

    /**
     * Constructs a new label that presents the specified string of
     * text with the specified alignment.
     * Possible values for <code>alignment</code> are <code>Label.LEFT</code>,
     * <code>Label.RIGHT</code>, and <code>Label.CENTER</code>.
     * @param text the string that the label presents.
     *        A <code>null</code> value
     *        will be accepted without causing a NullPointerException
     *        to be thrown.
     * @param     alignment   the alignment value.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public Label(String text) throws HeadlessException {

    /**
     * Constructs a new label with the specified string of text,
     * left justified.
     * @param text the string that the label presents.
     *        A <code>null</code> value
     *        will be accepted without causing a NullPointerException
     *        to be thrown.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public Label() throws HeadlessException {

    /**
     * Constructs an empty label.
     * The text of the label is the empty string <code>""</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    int    alignment = LEFT;

    /**
     * The label's alignment.  The default alignment is set
     * to be left justified.
     *
     * @serial
     * @see #getAlignment()
     * @see #setAlignment(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    String text;

    /**
     * The text of this label.
     * This text can be modified by the program
     * but never by the user.
     *
     * @serial
     * @see #getText()
     * @see #setText(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public static final int RIGHT       = 2;

    /**
     * Indicates that the label should be right justified.
     * @since   JDK1.0t.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public static final int CENTER      = 1;

    /**
     * Indicates that the label should be centered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
    public static final int LEFT        = 0;

    /**
     * Indicates that the label should be left justified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Label.java
public class Label extends Component implements Accessible {

/**
 * A <code>Label</code> object is a component for placing text in a
 * container. A label displays a single line of read-only text.
 * The text can be changed by the application, but a user cannot edit it
 * directly.
 * <p>
 * For example, the code&nbsp;.&nbsp;.&nbsp;.
 *
 * <hr><blockquote><pre>
 * setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
 * add(new Label("Hi There!"));
 * add(new Label("Another Label"));
 * </pre></blockquote><hr>
 * <p>
 * produces the following labels:
 * <p>
 * <img src="doc-files/Label-1.gif" alt="Two labels: 'Hi There!' and 'Another label'"
 * style="float:center; margin: 7px 10px;">
 *
 * @author      Sami Shaio
 * @since       JDK1.0
 */
