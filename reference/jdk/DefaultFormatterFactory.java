_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public JFormattedTextField.AbstractFormatter getFormatter(
                     JFormattedTextField source) {

    /**
     * Returns either the default formatter, display formatter, editor
     * formatter or null formatter based on the state of the
     * JFormattedTextField.
     *
     * @param source JFormattedTextField requesting
     *               JFormattedTextField.AbstractFormatter
     * @return JFormattedTextField.AbstractFormatter to handle
     *         formatting duties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public JFormattedTextField.AbstractFormatter getNullFormatter() {

    /**
     * Returns the formatter to use if the value is null.
     *
     * @return JFormattedTextField.AbstractFormatter to use when the value is
     *         null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public void setNullFormatter(JFormattedTextField.AbstractFormatter atf) {

    /**
     * Sets the formatter to use if the value of the JFormattedTextField is
     * null.
     *
     * @param atf JFormattedTextField.AbstractFormatter to use when
     * the value of the JFormattedTextField is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public JFormattedTextField.AbstractFormatter getEditFormatter() {

    /**
     * Returns the <code>JFormattedTextField.AbstractFormatter</code> to use
     * if the <code>JFormattedTextField</code> is being edited and either
     * the value is not-null, or the value is null and a null formatter has
     * has not been specified.
     *
     * @return JFormattedTextField.AbstractFormatter to use when the
     *         component has focus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public void setEditFormatter(JFormattedTextField.AbstractFormatter atf) {

    /**
     * Sets the <code>JFormattedTextField.AbstractFormatter</code> to use if
     * the <code>JFormattedTextField</code> is being edited and either
     * the value is not-null, or the value is null and a null formatter has
     * has not been specified.
     *
     * @param atf JFormattedTextField.AbstractFormatter to use when the
     *            component has focus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public JFormattedTextField.AbstractFormatter getDisplayFormatter() {

    /**
     * Returns the <code>JFormattedTextField.AbstractFormatter</code> to use
     * if the <code>JFormattedTextField</code> is not being edited and either
     * the value is not-null, or the value is null and a null formatter has
     * has not been specified.
     *
     * @return JFormattedTextField.AbstractFormatter to use when the
     *         JFormattedTextField does not have focus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public void setDisplayFormatter(JFormattedTextField.AbstractFormatter atf){

    /**
     * Sets the <code>JFormattedTextField.AbstractFormatter</code> to use if
     * the <code>JFormattedTextField</code> is not being edited and either
     * the value is not-null, or the value is null and a null formatter has
     * has not been specified.
     *
     * @param atf JFormattedTextField.AbstractFormatter to use when the
     *            JFormattedTextField does not have focus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public JFormattedTextField.AbstractFormatter getDefaultFormatter() {

    /**
     * Returns the <code>JFormattedTextField.AbstractFormatter</code> to use
     * as a last resort, eg in case a display, edit or null
     * <code>JFormattedTextField.AbstractFormatter</code>
     * has not been specified.
     *
     * @return JFormattedTextField.AbstractFormatter used if a more specific
     *         one is not specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public void setDefaultFormatter(JFormattedTextField.AbstractFormatter atf){

    /**
     * Sets the <code>JFormattedTextField.AbstractFormatter</code> to use as
     * a last resort, eg in case a display, edit or null
     * <code>JFormattedTextField.AbstractFormatter</code> has not been
     * specified.
     *
     * @param atf JFormattedTextField.AbstractFormatter used if a more
     *            specific is not specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public DefaultFormatterFactory(
                  JFormattedTextField.AbstractFormatter defaultFormat,
                  JFormattedTextField.AbstractFormatter displayFormat,
                  JFormattedTextField.AbstractFormatter editFormat,
                  JFormattedTextField.AbstractFormatter nullFormat) {

    /**
     * Creates a DefaultFormatterFactory with the specified
     * JFormattedTextField.AbstractFormatters.
     *
     * @param defaultFormat JFormattedTextField.AbstractFormatter to be used
     *                      if a more specific
     *                      JFormattedTextField.AbstractFormatter can not be
     *                      found.
     * @param displayFormat JFormattedTextField.AbstractFormatter to be used
     *                      when the JFormattedTextField does not have focus.
     * @param editFormat    JFormattedTextField.AbstractFormatter to be used
     *                      when the JFormattedTextField has focus.
     * @param nullFormat    JFormattedTextField.AbstractFormatter to be used
     *                      when the JFormattedTextField has a null value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public DefaultFormatterFactory(
                   JFormattedTextField.AbstractFormatter defaultFormat,
                   JFormattedTextField.AbstractFormatter displayFormat,
                   JFormattedTextField.AbstractFormatter editFormat) {

    /**
     * Creates a DefaultFormatterFactory with the specified
     * JFormattedTextField.AbstractFormatters.
     *
     * @param defaultFormat JFormattedTextField.AbstractFormatter to be used
     *                      if a more specific
     *                      JFormattedTextField.AbstractFormatter can not be
     *                      found.
     * @param displayFormat JFormattedTextField.AbstractFormatter to be used
     *                      when the JFormattedTextField does not have focus.
     * @param editFormat    JFormattedTextField.AbstractFormatter to be used
     *                      when the JFormattedTextField has focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public DefaultFormatterFactory(
                     JFormattedTextField.AbstractFormatter defaultFormat,
                     JFormattedTextField.AbstractFormatter displayFormat) {

    /**
     * Creates a <code>DefaultFormatterFactory</code> with the specified
     * <code>JFormattedTextField.AbstractFormatter</code>s.
     *
     * @param defaultFormat JFormattedTextField.AbstractFormatter to be used
     *                      if a more specific
     *                      JFormattedTextField.AbstractFormatter can not be
     *                      found.
     * @param displayFormat JFormattedTextField.AbstractFormatter to be used
     *                      when the JFormattedTextField does not have focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    public DefaultFormatterFactory(JFormattedTextField.
                                       AbstractFormatter defaultFormat) {

    /**
     * Creates a <code>DefaultFormatterFactory</code> with the specified
     * <code>JFormattedTextField.AbstractFormatter</code>.
     *
     * @param defaultFormat JFormattedTextField.AbstractFormatter to be used
     *                      if a more specific
     *                      JFormattedTextField.AbstractFormatter can not be
     *                      found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    private JFormattedTextField.AbstractFormatter nullFormat;

    /**
     * <code>JFormattedTextField.AbstractFormatter</code> to use if the value
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    private JFormattedTextField.AbstractFormatter editFormat;

    /**
     * <code>JFormattedTextField.AbstractFormatter</code> to use for editing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
    private JFormattedTextField.AbstractFormatter displayFormat;

    /**
     * <code>JFormattedTextField.AbstractFormatter</code> to use for display.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultFormatterFactory.java
public class DefaultFormatterFactory extends JFormattedTextField.AbstractFormatterFactory implements Serializable {

/**
 * An implementation of
 * <code>JFormattedTextField.AbstractFormatterFactory</code>.
 * <code>DefaultFormatterFactory</code> allows specifying a number of
 * different <code>JFormattedTextField.AbstractFormatter</code>s that are to
 * be used.
 * The most important one is the default one
 * (<code>setDefaultFormatter</code>). The default formatter will be used
 * if a more specific formatter could not be found. The following process
 * is used to determine the appropriate formatter to use.
 * <ol>
 *   <li>Is the passed in value null? Use the null formatter.
 *   <li>Does the <code>JFormattedTextField</code> have focus? Use the edit
 *       formatter.
 *   <li>Otherwise, use the display formatter.
 *   <li>If a non-null <code>AbstractFormatter</code> has not been found, use
 *       the default formatter.
 * </ol>
 * <p>
 * The following code shows how to configure a
 * <code>JFormattedTextField</code> with two
 * <code>JFormattedTextField.AbstractFormatter</code>s, one for display and
 * one for editing.
 * <pre>
 * JFormattedTextField.AbstractFormatter editFormatter = ...;
 * JFormattedTextField.AbstractFormatter displayFormatter = ...;
 * DefaultFormatterFactory factory = new DefaultFormatterFactory(
 *                 displayFormatter, displayFormatter, editFormatter);
 * JFormattedTextField tf = new JFormattedTextField(factory);
 * </pre>
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
 * @see javax.swing.JFormattedTextField
 *
 * @since 1.4
 */
