_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
        public int getNextVisualPositionFrom(GlyphView v, int pos, Position.Bias b, Shape a,
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
         * @param pos the position to convert &gt;= 0
         * @param b   either <code>Position.Bias.Forward</code>
         *                or <code>Position.Bias.Backward</code>
         * @param a the allocated region to render into
         * @param direction the direction from the current position that can
         *  be thought of as the arrow keys typically found on a keyboard.
         *  This may be SwingConstants.WEST, SwingConstants.EAST,
         *  SwingConstants.NORTH, or SwingConstants.SOUTH.
         * @param biasRet  either <code>Position.Bias.Forward</code>
         *                 or <code>Position.Bias.Backward</code>
         *                 is returned as the zero-th element of this array
         * @return the location within the model that best represents the next
         *  location visual position.
         * @exception BadLocationException
         * @exception IllegalArgumentException for an invalid direction
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
        public GlyphPainter getPainter(GlyphView v, int p0, int p1) {

        /**
         * Create a painter to use for the given GlyphView.  If
         * the painter carries state it can create another painter
         * to represent a new GlyphView that is being created.  If
         * the painter doesn't hold any significant state, it can
         * return itself.  The default behavior is to return itself.
         * @param v  the <code>GlyphView</code> to provide a painter for
         * @param p0 the starting document offset &gt;= 0
         * @param p1 the ending document offset &gt;= p0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
        public abstract int getBoundedPosition(GlyphView v, int p0, float x, float len);

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
         *  fragment should start it's representation &gt;= 0.
         * @param x  the graphic location along the axis that the
         *  broken view would occupy &gt;= 0.  This may be useful for
         *  things like tab calculations.
         * @param len specifies the distance into the view
         *  where a potential break is desired &gt;= 0.
         * @return the maximum model location possible for a break.
         * @see View#breakView
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
        public abstract int viewToModel(GlyphView v,
                                        float x, float y, Shape a,
                                        Position.Bias[] biasReturn);

        /**
         * Provides a mapping from the view coordinate space to the logical
         * coordinate space of the model.
         *
         * @param v          the <code>GlyphView</code> to provide a mapping for
         * @param x          the X coordinate
         * @param y          the Y coordinate
         * @param a          the allocated region to render into
         * @param biasReturn either <code>Position.Bias.Forward</code>
         *                   or <code>Position.Bias.Backward</code>
         *                   is returned as the zero-th element of this array
         * @return the location within the model that best represents the
         *         given point of view
         * @see View#viewToModel
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
        public abstract Shape modelToView(GlyphView v,
                                          int pos, Position.Bias bias,
                                          Shape a) throws BadLocationException;

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         * This is shared by the broken views.
         *
         * @param v     the <code>GlyphView</code> containing the
         *              destination coordinate space
         * @param pos   the position to convert
         * @param bias  either <code>Position.Bias.Forward</code>
         *                  or <code>Position.Bias.Backward</code>
         * @param a     Bounds of the View
         * @return      the bounding box of the given position
         * @exception BadLocationException  if the given position does not represent a
         *   valid location in the associated document
         * @see View#modelToView
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
        public abstract void paint(GlyphView v, Graphics g, Shape a, int p0, int p1);

        /**
         * Paint the glyphs representing the given range.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
        public abstract float getSpan(GlyphView v, int p0, int p1, TabExpander e, float x);

        /**
         * Determine the span the glyphs given a start location
         * (for tab expansion).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public static abstract class GlyphPainter {

    /**
     * A class to perform rendering of the glyphs.
     * This can be implemented to be stateless, or
     * to hold some information as a cache to
     * facilitate faster rendering and model/view
     * translation.  At a minimum, the GlyphPainter
     * allows a View implementation to perform its
     * duties independant of a particular version
     * of JVM and selection of capabilities (i.e.
     * shaping for i18n, etc).
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    static GlyphPainter defaultPainter;

    /**
     * The prototype painter used by default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    GlyphPainter painter;

    /**
     * Glyph rendering functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    int x;

    /**
     * location for determining tab expansion against.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    private int[] breakSpots = null;

    /** Cached breakpoints within the view  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    private float minimumSpan = -1;

    /** Cached minimum x-span value  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    TabExpander expander;

    /**
     * how to expand tabs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    private byte[] selections = null;

    /**
    * Used by paint() to store highlighted view positions
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    static class JustificationInfo {

    /**
     * Class to hold data needed to justify this GlyphView in a PargraphView.Row
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    @Override

    /** {@inheritDoc} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.
     * This is implemented to call preferenceChanged along both the
     * horizontal and vertical axis.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#changedUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public void removeUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was removed from the document
     * in a location that this view is responsible for.
     * This is implemented to call preferenceChanged along the
     * axis the glyphs are rendered.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#removeUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public void insertUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was inserted into
     * the document in a location that this view is responsible for.
     * This is implemented to call preferenceChanged along the
     * axis the glyphs are rendered.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#insertUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public int getNextVisualPositionFrom(int pos, Position.Bias b, Shape a,
                                         int direction,
                                         Position.Bias[] biasRet)

    /**
     * Provides a way to determine the next visually represented model
     * location that one might place a caret.  Some views may not be
     * visible, they might not be in the same order found in the model, or
     * they just might not allow access to some of the locations in the
     * model.
     * This method enables specifying a position to convert
     * within the range of &gt;=0.  If the value is -1, a position
     * will be calculated automatically.  If the value &lt; -1,
     * the {@code BadLocationException} will be thrown.
     *
     * @param pos the position to convert
     * @param a the allocated region to render into
     * @param direction the direction from the current position that can
     *  be thought of as the arrow keys typically found on a keyboard.
     *  This may be SwingConstants.WEST, SwingConstants.EAST,
     *  SwingConstants.NORTH, or SwingConstants.SOUTH.
     * @return the location within the model that best represents the next
     *  location visual position.
     * @exception BadLocationException the given position is not a valid
     *                                 position within the document
     * @exception IllegalArgumentException for an invalid direction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public View createFragment(int p0, int p1) {

    /**
     * Creates a view that represents a portion of the element.
     * This is potentially useful during formatting operations
     * for taking measurements of fragments of the view.  If
     * the view doesn't support fragmenting (the default), it
     * should return itself.
     * <p>
     * This view does support fragmenting.  It is implemented
     * to return a nested class that shares state in this view
     * representing only a portion of the view.
     *
     * @param p0 the starting offset &gt;= 0.  This should be a value
     *   greater or equal to the element starting offset and
     *   less than the element ending offset.
     * @param p1 the ending offset &gt; p0.  This should be a value
     *   less than or equal to the elements end offset and
     *   greater than the elements starting offset.
     * @return the view fragment, or itself if the view doesn't
     *   support breaking into fragments
     * @see LabelView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    private BreakIterator getBreaker() {

    /**
     * Return break iterator appropriate for the current document.
     *
     * For non-i18n documents a fast whitespace-based break iterator is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    private int getBreakSpot(int p0, int p1) {

    /**
     * Returns a location to break at in the passed in region, or
     * BreakIterator.DONE if there isn't a good location to break at
     * in the specified region.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public View breakView(int axis, int p0, float pos, float len) {

    /**
     * Breaks this view on the given axis at the given length.
     * This is implemented to attempt to break on a whitespace
     * location, and returns a fragment with the whitespace at
     * the end.  If a whitespace location can't be found, the
     * nearest character is used.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @param p0 the location in the model where the
     *  fragment should start it's representation &gt;= 0.
     * @param pos the position along the axis that the
     *  broken view would occupy &gt;= 0.  This may be useful for
     *  things like tab calculations.
     * @param len specifies the distance along the axis
     *  where a potential break is desired &gt;= 0.
     * @return the fragment of the view that represents the
     *  given span, if the view can be broken.  If the view
     *  doesn't support breaking behavior, the view itself is
     *  returned.
     * @see View#breakView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public int getBreakWeight(int axis, float pos, float len) {

    /**
     * Determines how attractive a break opportunity in
     * this view is.  This can be used for determining which
     * view is the most attractive to call <code>breakView</code>
     * on in the process of formatting.  The
     * higher the weight, the more attractive the break.  A
     * value equal to or lower than <code>View.BadBreakWeight</code>
     * should not be considered for a break.  A value greater
     * than or equal to <code>View.ForcedBreakWeight</code> should
     * be broken.
     * <p>
     * This is implemented to forward to the superclass for
     * the Y_AXIS.  Along the X_AXIS the following values
     * may be returned.
     * <dl>
     * <dt><b>View.ExcellentBreakWeight</b>
     * <dd>if there is whitespace proceeding the desired break
     *   location.
     * <dt><b>View.BadBreakWeight</b>
     * <dd>if the desired break location results in a break
     *   location of the starting offset.
     * <dt><b>View.GoodBreakWeight</b>
     * <dd>if the other conditions don't occur.
     * </dl>
     * This will normally result in the behavior of breaking
     * on a whitespace location if one can be found, otherwise
     * breaking between characters.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @param pos the potential location of the start of the
     *   broken view &gt;= 0.  This may be useful for calculating tab
     *   positions.
     * @param len specifies the relative length from <em>pos</em>
     *   where a potential break is desired &gt;= 0.
     * @return the weight, which should be a value between
     *   View.ForcedBreakWeight and View.BadBreakWeight.
     * @see LabelView
     * @see ParagraphView
     * @see View#BadBreakWeight
     * @see View#GoodBreakWeight
     * @see View#ExcellentBreakWeight
     * @see View#ForcedBreakWeight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public int viewToModel(float x, float y, Shape a, Position.Bias[] biasReturn) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param x the X coordinate &gt;= 0
     * @param y the Y coordinate &gt;= 0
     * @param a the allocated region to render into
     * @param biasReturn either <code>Position.Bias.Forward</code>
     *  or <code>Position.Bias.Backward</code> is returned as the
     *  zero-th element of this array
     * @return the location within the model that best represents the
     *  given point of view &gt;= 0
     * @see View#viewToModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.
     *
     * @param pos the position to convert &gt;= 0
     * @param a   the allocated region to render into
     * @param b   either <code>Position.Bias.Forward</code>
     *                or <code>Position.Bias.Backward</code>
     * @return the bounding box of the given position
     * @exception BadLocationException  if the given position does not represent a
     *   valid location in the associated document
     * @see View#modelToView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public float getAlignment(int axis) {

    /**
     * Determines the desired alignment for this view along an
     * axis.  For the label, the alignment is along the font
     * baseline for the y axis, and the superclasses alignment
     * along the x axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return the desired alignment.  This should be a value
     *   between 0.0 and 1.0 inclusive, where 0 indicates alignment at the
     *   origin and 1.0 indicates alignment to the full span
     *   away from the origin.  An alignment of 0.5 would be the
     *   center of the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return   the span the view would like to be rendered into &gt;= 0.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    @Override

    /**
     * Determines the minimum span for this view along an axis.
     *
     * <p>This implementation returns the longest non-breakable area within
     * the view as a minimum span for {@code View.X_AXIS}.</p>
     *
     * @param axis  may be either {@code View.X_AXIS} or {@code View.Y_AXIS}
     * @return      the minimum span the view can be rendered into
     * @throws IllegalArgumentException if the {@code axis} parameter is invalid
     * @see         javax.swing.text.View#getMinimumSpan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    final void paintTextUsingColor(Graphics g, Shape a, Color c, int p0, int p1) {

    /**
     * Paints the specified region of text in the specified color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public void paint(Graphics g, Shape a) {

    /**
     * Renders a portion of a text style run.
     *
     * @param g the rendering surface to use
     * @param a the allocated region to render into
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    private void initSelections(int p0, int p1) {

    /**
     * Lazily initializes the selections field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public int getEndOffset() {

    /**
     * Fetches the portion of the model that this view is responsible for.
     *
     * @return the ending offset into the model
     * @see View#getEndOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public int getStartOffset() {

    /**
     * Fetches the portion of the model that this view is responsible for.
     *
     * @return the starting offset into the model
     * @see View#getStartOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public float getPartialSpan(int p0, int p1) {

    /**
     * Determines the span along the same axis as tab
     * expansion for a portion of the view.  This is
     * intended for use by the TabExpander for cases
     * where the tab expansion involves aligning the
     * portion of text that doesn't have whitespace
     * relative to the tab stop.  There is therefore
     * an assumption that the range given does not
     * contain tabs.
     * <p>
     * This method can be called while servicing the
     * getTabbedSpan or getPreferredSize.  It has to
     * arrange for its own text buffer to make the
     * measurements.
     *
     * @param p0 the starting document offset &gt;= 0
     * @param p1 the ending document offset &gt;= p0
     * @return the span &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public float getTabbedSpan(float x, TabExpander e) {

    /**
     * Determines the desired span when using the given
     * tab expansion implementation.
     *
     * @param x the position the view would be located
     *  at for the purpose of tab expansion &gt;= 0.
     * @param e how to expand the tabs when encountered.
     * @return the desired span &gt;= 0
     * @see TabableView#getTabbedSpan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    protected void checkPainter() {

    /**
     * Check to see that a glyph painter exists.  If a painter
     * doesn't exist, a default glyph painter will be installed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public TabExpander getTabExpander() {

    /**
     * Fetch the TabExpander to use if tabs are present in this view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public boolean isSuperscript() {

    /**
     * Determine if the glyphs should be rendered as subscript.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public boolean isSubscript() {

    /**
     * Determine if the glyphs should be rendered as superscript.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public boolean isStrikeThrough() {

    /**
     * Determine if the glyphs should have a strikethrough
     * line.  If true, a line should be drawn through the center
     * of the glyphs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public boolean isUnderline() {

    /**
     * Determine if the glyphs should be underlined.  If true,
     * an underline should be drawn through the baseline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public Font getFont() {

    /**
     * Fetch the font that the glyphs should be based
     * upon.  This is implemented to call
     * <code>StyledDocument.getFont</code> if the associated
     * document is a StyledDocument.  If the associated document
     * is not a StyledDocument, the associated components font
     * is used.  If there is no associated component, null
     * is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public Color getForeground() {

    /**
     * Fetch the foreground color to use to render the
     * glyphs.  If there is no foreground color, null should
     * be returned.  This is implemented to call
     * <code>StyledDocument.getBackground</code> if the associated
     * document is a StyledDocument.  If the associated document
     * is not a StyledDocument, the associated components foreground
     * color is used.  If there is no associated component, null
     * is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public Color getBackground() {

    /**
     * Fetch the background color to use to render the
     * glyphs.  If there is no background color, null should
     * be returned.  This is implemented to call
     * <code>StyledDocument.getBackground</code> if the associated
     * document is a styled document, otherwise it returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
     public Segment getText(int p0, int p1) {

    /**
     * Fetch a reference to the text that occupies
     * the given range.  This is normally used by
     * the GlyphPainter to determine what characters
     * it should render glyphs for.
     *
     * @param p0  the starting document offset &gt;= 0
     * @param p1  the ending document offset &gt;= p0
     * @return    the <code>Segment</code> containing the text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public void setGlyphPainter(GlyphPainter p) {

    /**
     * Sets the painter to use for rendering glyphs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public GlyphPainter getGlyphPainter() {

    /**
     * Fetch the currently installed glyph painter.
     * If a painter has not yet been installed, and
     * a default was not yet needed, null is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    protected final Object clone() {

    /**
     * Creates a shallow copy.  This is used by the
     * createFragment and breakView methods.
     *
     * @return the copy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
    public GlyphView(Element elem) {

    /**
     * Constructs a new view wrapped on an element.
     *
     * @param elem the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphView.java
public class GlyphView extends View implements TabableView, Cloneable {

/**
 * A GlyphView is a styled chunk of text that represents a view
 * mapped over an element in the text model. This view is generally
 * responsible for displaying text glyphs using character level
 * attributes in some way.
 * An implementation of the GlyphPainter class is used to do the
 * actual rendering and model/view translations.  This separates
 * rendering from layout and management of the association with
 * the model.
 * <p>
 * The view supports breaking for the purpose of formatting.
 * The fragments produced by breaking share the view that has
 * primary responsibility for the element (i.e. they are nested
 * classes and carry only a small amount of state of their own)
 * so they can share its resources.
 * <p>
 * Since this view
 * represents text that may have tabs embedded in it, it implements the
 * <code>TabableView</code> interface.  Tabs will only be
 * expanded if this view is embedded in a container that does
 * tab expansion.  ParagraphView is an example of a container
 * that does tab expansion.
 * <p>
 *
 * @since 1.3
 *
 * @author  Timothy Prinzing
 */
