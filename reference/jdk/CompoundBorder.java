_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
    public Border getInsideBorder() {

    /**
     * Returns the inside border object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
    public Border getOutsideBorder() {

    /**
     * Returns the outside border object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
    public Insets getBorderInsets(Component c, Insets insets) {

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

    /**
     * Paints the compound border by painting the outside border
     * with the specified position and size and then painting the
     * inside border at the specified position and size offset by
     * the insets of the outside border.
     * @param c the component for which this border is being painted
     * @param g the paint graphics
     * @param x the x position of the painted border
     * @param y the y position of the painted border
     * @param width the width of the painted border
     * @param height the height of the painted border
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
    @Override

    /**
     * Returns whether or not the compound border is opaque.
     *
     * @return {@code true} if the inside and outside borders
     *         are each either {@code null} or opaque;
     *         or {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
    @ConstructorProperties({"outsideBorder", "insideBorder"})

    /**
     * Creates a compound border with the specified outside and
     * inside borders.  Either border may be null.
     * @param outsideBorder the outside border
     * @param insideBorder the inside border to be nested
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
    public CompoundBorder() {

    /**
     * Creates a compound border with null outside and inside borders.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/CompoundBorder.java
@SuppressWarnings("serial")

/**
 * A composite Border class used to compose two Border objects
 * into a single border by nesting an inside Border object within
 * the insets of an outside Border object.
 *
 * For example, this class may be used to add blank margin space
 * to a component with an existing decorative border:
 *
 * <pre>
 *    Border border = comp.getBorder();
 *    Border margin = new EmptyBorder(10,10,10,10);
 *    comp.setBorder(new CompoundBorder(border, margin));
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
 * @author David Kloba
 */
