_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    private int resolveAxis( int axis, ComponentOrientation o ) {

    /**
     * Given one of the 4 axis values, resolve it to an absolute axis.
     * The relative axis values, PAGE_AXIS and LINE_AXIS are converted
     * to their absolute couterpart given the target's ComponentOrientation
     * value.  The absolute axes, X_AXIS and Y_AXIS are returned unmodified.
     *
     * @param axis the axis to resolve
     * @param o the ComponentOrientation to resolve against
     * @return the resolved axis
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public void layoutContainer(Container target) {

    /**
     * Called by the AWT <!-- XXX CHECK! --> when the specified container
     * needs to be laid out.
     *
     * @param target  the container to lay out
     *
     * @exception AWTError  if the target isn't the container specified to the
     *                      BoxLayout constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public synchronized float getLayoutAlignmentY(Container target) {

    /**
     * Returns the alignment along the Y axis for the container.
     * If the box is vertical, the default
     * alignment will be returned. Otherwise, the alignment needed
     * to place the children along the Y axis will be returned.
     *
     * @param target  the container
     * @return the alignment &gt;= 0.0f &amp;&amp; &lt;= 1.0f
     * @exception AWTError  if the target isn't the container specified to the
     *                      BoxLayout constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public synchronized float getLayoutAlignmentX(Container target) {

    /**
     * Returns the alignment along the X axis for the container.
     * If the box is horizontal, the default
     * alignment will be returned. Otherwise, the alignment needed
     * to place the children along the X axis will be returned.
     *
     * @param target  the container
     * @return the alignment &gt;= 0.0f &amp;&amp; &lt;= 1.0f
     * @exception AWTError  if the target isn't the container specified to the
     *                      BoxLayout constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public Dimension maximumLayoutSize(Container target) {

    /**
     * Returns the maximum dimensions the target container can use
     * to lay out the components it contains.
     *
     * @param target  the container that needs to be laid out
     * @return the dimensions &gt;= 0 &amp;&amp; &lt;= Integer.MAX_VALUE
     * @exception AWTError  if the target isn't the container specified to the
     *                      BoxLayout constructor
     * @see #preferredLayoutSize
     * @see #minimumLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public Dimension minimumLayoutSize(Container target) {

    /**
     * Returns the minimum dimensions needed to lay out the components
     * contained in the specified target container.
     *
     * @param target  the container that needs to be laid out
     * @return the dimensions &gt;= 0 &amp;&amp; &lt;= Integer.MAX_VALUE
     * @exception AWTError  if the target isn't the container specified to the
     *                      BoxLayout constructor
     * @see #preferredLayoutSize
     * @see #maximumLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public Dimension preferredLayoutSize(Container target) {

    /**
     * Returns the preferred dimensions for this layout, given the components
     * in the specified target container.
     *
     * @param target  the container that needs to be laid out
     * @return the dimensions &gt;= 0 &amp;&amp; &lt;= Integer.MAX_VALUE
     * @exception AWTError  if the target isn't the container specified to the
     *                      BoxLayout constructor
     * @see Container
     * @see #minimumLayoutSize
     * @see #maximumLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public void addLayoutComponent(Component comp, Object constraints) {

    /**
     * Not used by this class.
     *
     * @param comp the component
     * @param constraints constraints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public void removeLayoutComponent(Component comp) {

    /**
     * Not used by this class.
     *
     * @param comp the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public void addLayoutComponent(String name, Component comp) {

    /**
     * Not used by this class.
     *
     * @param name the name of the component
     * @param comp the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public synchronized void invalidateLayout(Container target) {

    /**
     * Indicates that a child has changed its layout related information,
     * and thus any cached calculations should be flushed.
     * <p>
     * This method is called by AWT when the invalidate method is called
     * on the Container.  Since the invalidate method may be called
     * asynchronously to the event thread, this method may be called
     * asynchronously.
     *
     * @param target  the affected container
     *
     * @exception AWTError  if the target isn't the container specified to the
     *                      BoxLayout constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public final int getAxis() {

    /**
     * Returns the axis that was used to lay out components.
     * Returns one of:
     * <code>BoxLayout.X_AXIS</code>,
     * <code>BoxLayout.Y_AXIS</code>,
     * <code>BoxLayout.LINE_AXIS</code> or
     * <code>BoxLayout.PAGE_AXIS</code>
     *
     * @return the axis that was used to lay out components
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public final Container getTarget() {

    /**
     * Returns the container that uses this layout manager.
     *
     * @return the container that uses this layout manager
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    BoxLayout(Container target, int axis, PrintStream dbg) {

    /**
     * Constructs a BoxLayout that
     * produces debugging messages.
     *
     * @param target  the container that needs to be laid out
     * @param axis  the axis to lay out components along. Can be one of:
     *              <code>BoxLayout.X_AXIS</code>,
     *              <code>BoxLayout.Y_AXIS</code>,
     *              <code>BoxLayout.LINE_AXIS</code> or
     *              <code>BoxLayout.PAGE_AXIS</code>
     *
     * @param dbg  the stream to which debugging messages should be sent,
     *   null if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    @ConstructorProperties({"target", "axis"})

    /**
     * Creates a layout manager that will lay out components along the
     * given axis.
     *
     * @param target  the container that needs to be laid out
     * @param axis  the axis to lay out components along. Can be one of:
     *              <code>BoxLayout.X_AXIS</code>,
     *              <code>BoxLayout.Y_AXIS</code>,
     *              <code>BoxLayout.LINE_AXIS</code> or
     *              <code>BoxLayout.PAGE_AXIS</code>
     *
     * @exception AWTError  if the value of <code>axis</code> is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public static final int PAGE_AXIS = 3;

    /**
     * Specifies that components should be laid out in the direction that
     * lines flow across a page as determined by the target container's
     * <code>ComponentOrientation</code> property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public static final int LINE_AXIS = 2;

    /**
     * Specifies that components should be laid out in the direction of
     * a line of text as determined by the target container's
     * <code>ComponentOrientation</code> property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public static final int Y_AXIS = 1;

    /**
     * Specifies that components should be laid out top to bottom.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
    public static final int X_AXIS = 0;

    /**
     * Specifies that components should be laid out left to right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/BoxLayout.java
@SuppressWarnings("serial")

/**
 * A layout manager that allows multiple components to be laid out either
 * vertically or horizontally. The components will not wrap so, for
 * example, a vertical arrangement of components will stay vertically
 * arranged when the frame is resized.
 * <TABLE STYLE="FLOAT:RIGHT" BORDER="0" SUMMARY="layout">
 *    <TR>
 *      <TD ALIGN="CENTER">
 *         <P STYLE="TEXT-ALIGN:CENTER"><IMG SRC="doc-files/BoxLayout-1.gif"
 *          alt="The following text describes this graphic."
 *          WIDTH="191" HEIGHT="201" STYLE="FLOAT:BOTTOM; BORDER:0">
 *      </TD>
 *    </TR>
 * </TABLE>
 * <p>
 * Nesting multiple panels with different combinations of horizontal and
 * vertical gives an effect similar to GridBagLayout, without the
 * complexity. The diagram shows two panels arranged horizontally, each
 * of which contains 3 components arranged vertically.
 *
 * <p> The BoxLayout manager is constructed with an axis parameter that
 * specifies the type of layout that will be done. There are four choices:
 *
 * <blockquote><b><tt>X_AXIS</tt></b> - Components are laid out horizontally
 * from left to right.</blockquote>
 *
 * <blockquote><b><tt>Y_AXIS</tt></b> - Components are laid out vertically
 * from top to bottom.</blockquote>
 *
 * <blockquote><b><tt>LINE_AXIS</tt></b> - Components are laid out the way
 * words are laid out in a line, based on the container's
 * <tt>ComponentOrientation</tt> property. If the container's
 * <tt>ComponentOrientation</tt> is horizontal then components are laid out
 * horizontally, otherwise they are laid out vertically.  For horizontal
 * orientations, if the container's <tt>ComponentOrientation</tt> is left to
 * right then components are laid out left to right, otherwise they are laid
 * out right to left. For vertical orientations components are always laid out
 * from top to bottom.</blockquote>
 *
 * <blockquote><b><tt>PAGE_AXIS</tt></b> - Components are laid out the way
 * text lines are laid out on a page, based on the container's
 * <tt>ComponentOrientation</tt> property. If the container's
 * <tt>ComponentOrientation</tt> is horizontal then components are laid out
 * vertically, otherwise they are laid out horizontally.  For horizontal
 * orientations, if the container's <tt>ComponentOrientation</tt> is left to
 * right then components are laid out left to right, otherwise they are laid
 * out right to left.&nbsp; For vertical orientations components are always
 * laid out from top to bottom.</blockquote>
 * <p>
 * For all directions, components are arranged in the same order as they were
 * added to the container.
 * <p>
 * BoxLayout attempts to arrange components
 * at their preferred widths (for horizontal layout)
 * or heights (for vertical layout).
 * For a horizontal layout,
 * if not all the components are the same height,
 * BoxLayout attempts to make all the components
 * as high as the highest component.
 * If that's not possible for a particular component,
 * then BoxLayout aligns that component vertically,
 * according to the component's Y alignment.
 * By default, a component has a Y alignment of 0.5,
 * which means that the vertical center of the component
 * should have the same Y coordinate as
 * the vertical centers of other components with 0.5 Y alignment.
 * <p>
 * Similarly, for a vertical layout,
 * BoxLayout attempts to make all components in the column
 * as wide as the widest component.
 * If that fails, it aligns them horizontally
 * according to their X alignments.  For <code>PAGE_AXIS</code> layout,
 * horizontal alignment is done based on the leading edge of the component.
 * In other words, an X alignment value of 0.0 means the left edge of a
 * component if the container's <code>ComponentOrientation</code> is left to
 * right and it means the right edge of the component otherwise.
 * <p>
 * Instead of using BoxLayout directly, many programs use the Box class.
 * The Box class is a lightweight container that uses a BoxLayout.
 * It also provides handy methods to help you use BoxLayout well.
 * Adding components to multiple nested boxes is a powerful way to get
 * the arrangement you want.
 * <p>
 * For further information and examples see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html">How to Use BoxLayout</a>,
 * a section in <em>The Java Tutorial.</em>
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
 * @see Box
 * @see java.awt.ComponentOrientation
 * @see JComponent#getAlignmentX
 * @see JComponent#getAlignmentY
 *
 * @author   Timothy Prinzing
 */
