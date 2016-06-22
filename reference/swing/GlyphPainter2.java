_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
        public int getNextVisualPositionFrom(GlyphView v, int pos,
                                             Position.Bias b, Shape a,
                                             int direction,
                                             Position.Bias[] biasRet)

    /**
         * Provides a way to determine the next visually represented model
         * location that one might place a caret.  Some views may not be
         * visible, they might not be in the same order found in the model, or
         * they just might not allow access to some of the locations in the
         * model.
         *
         * @param v the view to use
         * @param pos the position to convert >= 0
         * @param a the allocated region to render into
         * @param direction the direction from the current position that can
         *  be thought of as the arrow keys typically found on a keyboard.
         *  This may be SwingConstants.WEST, SwingConstants.EAST,
         *  SwingConstants.NORTH, or SwingConstants.SOUTH.
         * @return the location within the model that best represents the next
         *  location visual position.
         * @exception BadLocationException
         * @exception IllegalArgumentException for an invalid direction
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
    public int getBoundedPosition(GlyphView v, int p0, float x, float len) {

    /**
     * Determines the model location that represents the
     * maximum advance that fits within the given span.
     * This could be used to break the given view.  The result
     * should be a location just shy of the given advance.  This
     * differs from viewToModel which returns the closest
     * position which might be proud of the maximum advance.
     *
     * @param v the view to find the model location to break at.
     * @param p0 the location in the model where the
     *  fragment should start it's representation >= 0.
     * @param pos the graphic location along the axis that the
     *  broken view would occupy >= 0.  This may be useful for
     *  things like tab calculations.
     * @param len specifies the distance into the view
     *  where a potential break is desired >= 0.
     * @return the maximum model location possible for a break.
     * @see View#breakView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
    public int viewToModel(GlyphView v, float x, float y, Shape a,
                           Position.Bias[] biasReturn) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param v the view containing the view coordinates
     * @param x the X coordinate
     * @param y the Y coordinate
     * @param a the allocated region to render into
     * @param biasReturn either <code>Position.Bias.Forward</code>
     *  or <code>Position.Bias.Backward</code> is returned as the
     *  zero-th element of this array
     * @return the location within the model that best represents the
     *  given point of view
     * @see View#viewToModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
    public void paint(GlyphView v, Graphics g, Shape a, int p0, int p1) {

    /**
     * Paint the glyphs for the given view.  This is implemented
     * to only render if the Graphics is of type Graphics2D which
     * is required by TextLayout (and this should be the case if
     * running on the JDK).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
    public float getDescent(GlyphView v) {

    /**
     * Fetch the descent below the baseline for the glyphs
     * corresponding to the given range in the model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
    public float getAscent(GlyphView v) {

    /**
     * Fetch the ascent above the baseline for the glyphs
     * corresponding to the given range in the model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
    public float getSpan(GlyphView v, int p0, int p1,
                         TabExpander e, float x) {

    /**
     * Determine the span the glyphs given a start location
     * (for tab expansion).  This implementation assumes it
     * has no tabs (i.e. TextLayout doesn't deal with tab
     * expansion).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
    public GlyphView.GlyphPainter getPainter(GlyphView v, int p0, int p1) {

    /**
     * Create a painter to use for the given GlyphView.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GlyphPainter2.java
class GlyphPainter2 extends GlyphView.GlyphPainter {

/**
 * A class to perform rendering of the glyphs.
 * This can be implemented to be stateless, or
 * to hold some information as a cache to
 * facilitate faster rendering and model/view
 * translation.  At a minimum, the GlyphPainter
 * allows a View implementation to perform its
 * duties independent of a particular version
 * of JVM and selection of capabilities (i.e.
 * shaping for i18n, etc).
 * <p>
 * This implementation is intended for operation
 * under the JDK.  It uses the
 * java.awt.font.TextLayout class to do i18n capable
 * rendering.
 *
 * @author  Timothy Prinzing
 * @see GlyphView
 */