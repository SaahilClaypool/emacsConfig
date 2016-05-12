_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    public int getOrientation() {

    /**
     * Returns the orientation of the toolbar window when the toolbar is
     * floating. The orientation is either one of <code>JToolBar.HORIZONTAL</code>
     * or <code>JToolBar.VERTICAL</code>.
     *
     * @return the orientation of the toolbar window
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    public class DockingListener implements MouseInputListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicToolBarUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected void paintDragWindow(Graphics g) {

    /**
     * Paints the contents of the window used for dragging.
     *
     * @param g Graphics to paint to.
     * @throws NullPointerException is <code>g</code> is null
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    public void setFloatingColor(Color c) {

    /**
     * Sets the color displayed when over a floating area
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    public Color getFloatingColor() {

    /**
     * Gets the color displayed when over a floating area
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
   public void setDockingColor(Color c) {

    /**
     * Sets the color displayed when over a docking area
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    public Color getDockingColor() {

    /**
     * Gets the color displayed when over a docking area
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected void setBorderToNormal(Component c) {

    /**
     * Sets the border of the component to have a normal border.
     * A normal border is the original border that was installed on the child
     * component before it was added to the toolbar.
     *
     * @param c component which will have a normal border re-installed
     * @see #createNonRolloverBorder
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected Border getNonRolloverBorder(AbstractButton b) {

    /**
     * Returns a non-rollover border for the button.
     *
     * @param b the button to calculate the non-rollover border for
     * @return the non-rollover border
     * @see #setBorderToNonRollover
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected void setBorderToNonRollover(Component c) {

    /**
     * Sets the border of the component to have a non-rollover border which
     * was created by the {@link #createNonRolloverBorder} method.
     *
     * @param c component which will have a non-rollover border installed
     * @see #createNonRolloverBorder
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected Border getRolloverBorder(AbstractButton b) {

    /**
     * Returns a rollover border for the button.
     *
     * @param b the button to calculate the rollover border for
     * @return the rollover border
     * @see #setBorderToRollover
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected void setBorderToRollover(Component c) {

    /**
     * Sets the border of the component to have a rollover border which
     * was created by the {@link #createRolloverBorder} method.
     *
     * @param c component which will have a rollover border installed
     * @see #createRolloverBorder
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected void installNormalBorders ( JComponent c )  {

    /**
     * Installs normal borders on all the child components of the JComponent.
     * A normal border is the original border that was installed on the child
     * component before it was added to the toolbar.
     * <p>
     * This is a convenience method to call <code>setBorderNormal</code>
     * for each child component.
     *
     * @param c container which holds the child components (usually a JToolBar)
     * @see #setBorderToNonRollover
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected void installNonRolloverBorders ( JComponent c )  {

    /**
     * Installs non-rollover borders on all the child components of the JComponent.
     * A non-rollover border is the border that is installed on the child component
     * while it is in the toolbar.
     * <p>
     * This is a convenience method to call <code>setBorderToNonRollover</code>
     * for each child component.
     *
     * @param c container which holds the child components (usually a JToolBar)
     * @see #setBorderToNonRollover
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected void installRolloverBorders ( JComponent c )  {

    /**
     * Installs rollover borders on all the child components of the JComponent.
     * <p>
     * This is a convenience method to call <code>setBorderToRollover</code>
     * for each child component.
     *
     * @param c container which holds the child components (usually a JToolBar)
     * @see #setBorderToRollover
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    public void setRolloverBorders( boolean rollover ) {

    /**
     * Sets the flag for enabling rollover borders on the toolbar and it will
     * also install the appropriate border depending on the state of the flag.
     *
     * @param rollover if true, rollover borders are installed.
     *        Otherwise non-rollover borders are installed
     * @see #isRolloverBorders
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    public boolean isRolloverBorders() {

    /**
     * Returns a flag to determine whether rollover button borders
     * are enabled.
     *
     * @return true if rollover borders are enabled; false otherwise
     * @see #setRolloverBorders
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected RootPaneContainer createFloatingWindow(JToolBar toolbar) {

    /**
     * Creates a window which contains the toolbar after it has been
     * dragged out from its container
     * @return a <code>RootPaneContainer</code> object, containing the toolbar.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected JFrame createFloatingFrame(JToolBar toolbar) {

    /**
     * No longer used, use BasicToolBarUI.createFloatingWindow(JToolBar)
     * @see #createFloatingWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    private Border createNonRolloverToggleBorder() {

    /**
     * Creates a non rollover border for Toggle buttons in the toolbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected Border createNonRolloverBorder() {

    /**
     * Creates the non rollover border for toolbar components. This
     * border will be installed as the border for components added
     * to the toolbar if rollover borders are not enabled.
     * <p>
     * Override this method to provide an alternate rollover border.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    protected Border createRolloverBorder() {

    /**
     * Creates a rollover border for toolbar components. The
     * rollover border will be installed if rollover borders are
     * enabled.
     * <p>
     * Override this method to provide an alternate rollover border.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicToolBarUI.java
public class BasicToolBarUI extends ToolBarUI implements SwingConstants

/**
 * A Basic L&amp;F implementation of ToolBarUI.  This implementation
 * is a "combined" view/controller.
 * <p>
 *
 * @author Georges Saab
 * @author Jeff Shapiro
 */
