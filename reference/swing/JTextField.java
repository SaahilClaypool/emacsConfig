_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state set of this object.
         *
         * @return an instance of AccessibleStateSet describing the states
         * of the object
         * @see AccessibleState
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected class AccessibleJTextField extends AccessibleJTextComponent {

    /**
     * This class implements accessibility support for the
     * <code>JTextField</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to text field user-interface
     * elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JTextField</code>.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JTextField</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    private static final String uiClassID = "TextFieldUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public static final String notifyAction = "notify-field-accept";

    /**
     * Name of the action to send notification that the
     * contents of the field have been accepted.  Typically
     * this is bound to a carriage-return.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    boolean hasActionListener() {

    /**
     * Returns true if the receiver has an <code>ActionListener</code>
     * installed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void scrollRectToVisible(Rectangle r) {

    /**
     * Scrolls the field left or right.
     *
     * @param r the region to scroll
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void setScrollOffset(int scrollOffset) {

    /**
     * Sets the scroll offset, in pixels.
     *
     * @param scrollOffset the offset &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public int getScrollOffset() {

    /**
     * Gets the scroll offset, in pixels.
     *
     * @return the offset &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public BoundedRangeModel getHorizontalVisibility() {

    /**
     * Gets the visibility of the text field.  This can
     * be adjusted to change the location of the visible
     * area if the size of the field is greater than
     * the area that was allocated to the field.
     *
     * <p>
     * The fields look-and-feel implementation manages
     * the values of the minimum, maximum, and extent
     * properties on the <code>BoundedRangeModel</code>.
     *
     * @return the visibility
     * @see BoundedRangeModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void postActionEvent() {

    /**
     * Processes action events occurring on this textfield by
     * dispatching them to any registered <code>ActionListener</code> objects.
     * This is normally called by the controller registered with
     * textfield.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public Action[] getActions() {

    /**
     * Fetches the command list for the editor.  This is
     * the list of commands supported by the plugged-in UI
     * augmented by the collection of commands that the
     * editor itself supports.  These are useful for binding
     * to events, such as in a keymap.
     *
     * @return the command list
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected PropertyChangeListener createActionPropertyChangeListener(Action a) {

    /**
     * Creates and returns a <code>PropertyChangeListener</code> that is
     * responsible for listening for changes from the specified
     * <code>Action</code> and updating the appropriate properties.
     * <p>
     * <b>Warning:</b> If you subclass this do not create an anonymous
     * inner class.  If you do the lifetime of the textfield will be tied to
     * that of the <code>Action</code>.
     *
     * @param a the textfield's action
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected void actionPropertyChanged(Action action, String propertyName) {

    /**
     * Updates the textfield's state in response to property changes in
     * associated action. This method is invoked from the
     * {@code PropertyChangeListener} returned from
     * {@code createActionPropertyChangeListener}. Subclasses do not normally
     * need to invoke this. Subclasses that support additional {@code Action}
     * properties should override this and
     * {@code configurePropertiesFromAction}.
     * <p>
     * Refer to the table at <a href="Action.html#buttonActions">
     * Swing Components Supporting <code>Action</code></a> for a list of
     * the properties this method sets.
     *
     * @param action the <code>Action</code> associated with this textfield
     * @param propertyName the name of the property that changed
     * @since 1.6
     * @see Action
     * @see #configurePropertiesFromAction
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected void configurePropertiesFromAction(Action a) {

    /**
     * Sets the properties on this textfield to match those in the specified
     * <code>Action</code>.  Refer to <a href="Action.html#buttonActions">
     * Swing Components Supporting <code>Action</code></a> for more
     * details as to which properties this sets.
     *
     * @param a the <code>Action</code> from which to get the properties,
     *          or <code>null</code>
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public Action getAction() {

    /**
     * Returns the currently set <code>Action</code> for this
     * <code>ActionEvent</code> source, or <code>null</code>
     * if no <code>Action</code> is set.
     *
     * @return the <code>Action</code> for this <code>ActionEvent</code> source,
     *          or <code>null</code>
     * @since 1.3
     * @see Action
     * @see #setAction
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void setAction(Action a) {

    /**
     * Sets the <code>Action</code> for the <code>ActionEvent</code> source.
     * The new <code>Action</code> replaces
     * any previously set <code>Action</code> but does not affect
     * <code>ActionListeners</code> independently
     * added with <code>addActionListener</code>.
     * If the <code>Action</code> is already a registered
     * <code>ActionListener</code>
     * for the <code>ActionEvent</code> source, it is not re-registered.
     * <p>
     * Setting the <code>Action</code> results in immediately changing
     * all the properties described in <a href="Action.html#buttonActions">
     * Swing Components Supporting <code>Action</code></a>.
     * Subsequently, the textfield's properties are automatically updated
     * as the <code>Action</code>'s properties change.
     * <p>
     * This method uses three other methods to set
     * and help track the <code>Action</code>'s property values.
     * It uses the <code>configurePropertiesFromAction</code> method
     * to immediately change the textfield's properties.
     * To track changes in the <code>Action</code>'s property values,
     * this method registers the <code>PropertyChangeListener</code>
     * returned by <code>createActionPropertyChangeListener</code>. The
     * default {@code PropertyChangeListener} invokes the
     * {@code actionPropertyChanged} method when a property in the
     * {@code Action} changes.
     *
     * @param a the <code>Action</code> for the <code>JTextField</code>,
     *          or <code>null</code>
     * @since 1.3
     * @see Action
     * @see #getAction
     * @see #configurePropertiesFromAction
     * @see #createActionPropertyChangeListener
     * @see #actionPropertyChanged
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: the Action instance connected with this ActionEvent source
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void setActionCommand(String command) {

    /**
     * Sets the command string used for action events.
     *
     * @param command the command string
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected void fireActionPerformed() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created.
     * The listener list is processed in last to
     * first order.
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public synchronized ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the <code>ActionListener</code>s added
     * to this JTextField with addActionListener().
     *
     * @return all of the <code>ActionListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public synchronized void removeActionListener(ActionListener l) {

    /**
     * Removes the specified action listener so that it no longer
     * receives action events from this textfield.
     *
     * @param l the action listener to be removed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public synchronized void addActionListener(ActionListener l) {

    /**
     * Adds the specified action listener to receive
     * action events from this textfield.
     *
     * @param l the action listener to be added
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void setFont(Font f) {

    /**
     * Sets the current font.  This removes cached row height and column
     * width so the new font will be reflected.
     * <code>revalidate</code> is called after setting the font.
     *
     * @param f the new font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public Dimension getPreferredSize() {

    /**
     * Returns the preferred size <code>Dimensions</code> needed for this
     * <code>TextField</code>.  If a non-zero number of columns has been
     * set, the width is set to the columns multiplied by
     * the column width.
     *
     * @return the dimension of this textfield
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected int getColumnWidth() {

    /**
     * Returns the column width.
     * The meaning of what a column is can be considered a fairly weak
     * notion for some fonts.  This method is used to define the width
     * of a column.  By default this is defined to be the width of the
     * character <em>m</em> for the font used.  This method can be
     * redefined to be some alternative amount
     *
     * @return the column width &gt;= 1
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void setColumns(int columns) {

    /**
     * Sets the number of columns in this <code>TextField</code>,
     * and then invalidate the layout.
     *
     * @param columns the number of columns &gt;= 0
     * @exception IllegalArgumentException if <code>columns</code>
     *          is less than 0
     * @beaninfo
     * description: the number of columns preferred for display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public int getColumns() {

    /**
     * Returns the number of columns in this <code>TextField</code>.
     *
     * @return the number of columns &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    protected Document createDefaultModel() {

    /**
     * Creates the default implementation of the model
     * to be used at construction if one isn't explicitly
     * given.  An instance of <code>PlainDocument</code> is returned.
     *
     * @return the default model implementation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
     public void setHorizontalAlignment(int alignment) {

    /**
     * Sets the horizontal alignment of the text.
     * Valid keys are:
     * <ul>
     * <li><code>JTextField.LEFT</code>
     * <li><code>JTextField.CENTER</code>
     * <li><code>JTextField.RIGHT</code>
     * <li><code>JTextField.LEADING</code>
     * <li><code>JTextField.TRAILING</code>
     * </ul>
     * <code>invalidate</code> and <code>repaint</code> are called when the
     * alignment is set,
     * and a <code>PropertyChange</code> event ("horizontalAlignment") is fired.
     *
     * @param alignment the alignment
     * @exception IllegalArgumentException if <code>alignment</code>
     *  is not a valid key
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Set the field alignment to LEFT, CENTER, RIGHT,
     *              LEADING (the default) or TRAILING
     *        enum: LEFT JTextField.LEFT CENTER JTextField.CENTER RIGHT JTextField.RIGHT
     *              LEADING JTextField.LEADING TRAILING JTextField.TRAILING
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public int getHorizontalAlignment() {

    /**
     * Returns the horizontal alignment of the text.
     * Valid keys are:
     * <ul>
     * <li><code>JTextField.LEFT</code>
     * <li><code>JTextField.CENTER</code>
     * <li><code>JTextField.RIGHT</code>
     * <li><code>JTextField.LEADING</code>
     * <li><code>JTextField.TRAILING</code>
     * </ul>
     *
     * @return the horizontal alignment
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    @Override

    /**
     * Calls to <code>revalidate</code> that come from within the
     * textfield itself will
     * be handled by validating the textfield, unless the textfield
     * is contained within a <code>JViewport</code>,
     * in which case this returns false.
     *
     * @return if the parent of this textfield is a <code>JViewPort</code>
     *          return false, otherwise return true
     *
     * @see JComponent#revalidate
     * @see JComponent#isValidateRoot
     * @see java.awt.Container#isValidateRoot
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public void setDocument(Document doc) {

    /**
     * Associates the editor with a text document.
     * The currently registered factory is used to build a view for
     * the document, which gets displayed by the editor after revalidation.
     * A PropertyChange event ("document") is propagated to each listener.
     *
     * @param doc  the document to display/edit
     * @see #getDocument
     * @beaninfo
     *  description: the text document model
     *        bound: true
     *       expert: true
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public String getUIClassID() {

    /**
     * Gets the class ID for a UI.
     *
     * @return the string "TextFieldUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public JTextField(Document doc, String text, int columns) {

    /**
     * Constructs a new <code>JTextField</code> that uses the given text
     * storage model and the given number of columns.
     * This is the constructor through which the other constructors feed.
     * If the document is <code>null</code>, a default model is created.
     *
     * @param doc  the text storage to use; if this is <code>null</code>,
     *          a default will be provided by calling the
     *          <code>createDefaultModel</code> method
     * @param text  the initial string to display, or <code>null</code>
     * @param columns  the number of columns to use to calculate
     *   the preferred width &gt;= 0; if <code>columns</code>
     *   is set to zero, the preferred width will be whatever
     *   naturally results from the component implementation
     * @exception IllegalArgumentException if <code>columns</code> &lt; 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public JTextField(String text, int columns) {

    /**
     * Constructs a new <code>TextField</code> initialized with the
     * specified text and columns.  A default model is created.
     *
     * @param text the text to be displayed, or <code>null</code>
     * @param columns  the number of columns to use to calculate
     *   the preferred width; if columns is set to zero, the
     *   preferred width will be whatever naturally results from
     *   the component implementation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public JTextField(int columns) {

    /**
     * Constructs a new empty <code>TextField</code> with the specified
     * number of columns.
     * A default model is created and the initial string is set to
     * <code>null</code>.
     *
     * @param columns  the number of columns to use to calculate
     *   the preferred width; if columns is set to zero, the
     *   preferred width will be whatever naturally results from
     *   the component implementation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public JTextField(String text) {

    /**
     * Constructs a new <code>TextField</code> initialized with the
     * specified text. A default model is created and the number of
     * columns is 0.
     *
     * @param text the text to be displayed, or <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
    public JTextField() {

    /**
     * Constructs a new <code>TextField</code>.  A default model is created,
     * the initial string is <code>null</code>,
     * and the number of columns is set to 0.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTextField.java
public class JTextField extends JTextComponent implements SwingConstants {

/**
 * <code>JTextField</code> is a lightweight component that allows the editing
 * of a single line of text.
 * For information on and examples of using text fields,
 * see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html">How to Use Text Fields</a>
 * in <em>The Java Tutorial.</em>
 *
 * <p>
 * <code>JTextField</code> is intended to be source-compatible
 * with <code>java.awt.TextField</code> where it is reasonable to do so.  This
 * component has capabilities not found in the <code>java.awt.TextField</code>
 * class.  The superclass should be consulted for additional capabilities.
 * <p>
 * <code>JTextField</code> has a method to establish the string used as the
 * command string for the action event that gets fired.  The
 * <code>java.awt.TextField</code> used the text of the field as the command
 * string for the <code>ActionEvent</code>.
 * <code>JTextField</code> will use the command
 * string set with the <code>setActionCommand</code> method if not <code>null</code>,
 * otherwise it will use the text of the field as a compatibility with
 * <code>java.awt.TextField</code>.
 * <p>
 * The method <code>setEchoChar</code> and <code>getEchoChar</code>
 * are not provided directly to avoid a new implementation of a
 * pluggable look-and-feel inadvertently exposing password characters.
 * To provide password-like services a separate class <code>JPasswordField</code>
 * extends <code>JTextField</code> to provide this service with an independently
 * pluggable look-and-feel.
 * <p>
 * The <code>java.awt.TextField</code> could be monitored for changes by adding
 * a <code>TextListener</code> for <code>TextEvent</code>'s.
 * In the <code>JTextComponent</code> based
 * components, changes are broadcasted from the model via a
 * <code>DocumentEvent</code> to <code>DocumentListeners</code>.
 * The <code>DocumentEvent</code> gives
 * the location of the change and the kind of change if desired.
 * The code fragment might look something like:
 * <pre><code>
 * &nbsp;   DocumentListener myListener = ??;
 * &nbsp;   JTextField myArea = ??;
 * &nbsp;   myArea.getDocument().addDocumentListener(myListener);
 * </code></pre>
 * <p>
 * The horizontal alignment of <code>JTextField</code> can be set to be left
 * justified, leading justified, centered, right justified or trailing justified.
 * Right/trailing justification is useful if the required size
 * of the field text is smaller than the size allocated to it.
 * This is determined by the <code>setHorizontalAlignment</code>
 * and <code>getHorizontalAlignment</code> methods.  The default
 * is to be leading justified.
 * <p>
 * How the text field consumes VK_ENTER events depends
 * on whether the text field has any action listeners.
 * If so, then VK_ENTER results in the listeners
 * getting an ActionEvent,
 * and the VK_ENTER event is consumed.
 * This is compatible with how AWT text fields handle VK_ENTER events.
 * If the text field has no action listeners, then as of v 1.3 the VK_ENTER
 * event is not consumed.  Instead, the bindings of ancestor components
 * are processed, which enables the default button feature of
 * JFC/Swing to work.
 * <p>
 * Customized fields can easily be created by extending the model and
 * changing the default model provided.  For example, the following piece
 * of code will create a field that holds only upper case characters.  It
 * will work even if text is pasted into from the clipboard or it is altered via
 * programmatic changes.
 * <pre><code>

&nbsp;public class UpperCaseField extends JTextField {
&nbsp;
&nbsp;    public UpperCaseField(int cols) {
&nbsp;        super(cols);
&nbsp;    }
&nbsp;
&nbsp;    protected Document createDefaultModel() {
&nbsp;        return new UpperCaseDocument();
&nbsp;    }
&nbsp;
&nbsp;    static class UpperCaseDocument extends PlainDocument {
&nbsp;
&nbsp;        public void insertString(int offs, String str, AttributeSet a)
&nbsp;            throws BadLocationException {
&nbsp;
&nbsp;            if (str == null) {
&nbsp;                return;
&nbsp;            }
&nbsp;            char[] upper = str.toCharArray();
&nbsp;            for (int i = 0; i &lt; upper.length; i++) {
&nbsp;                upper[i] = Character.toUpperCase(upper[i]);
&nbsp;            }
&nbsp;            super.insertString(offs, new String(upper), a);
&nbsp;        }
&nbsp;    }
&nbsp;}

 * </code></pre>
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @beaninfo
 *   attribute: isContainer false
 * description: A component which allows for the editing of a single line of text.
 *
 * @author  Timothy Prinzing
 * @see #setActionCommand
 * @see JPasswordField
 * @see #addActionListener
 */