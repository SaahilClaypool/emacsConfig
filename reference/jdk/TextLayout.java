_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public void hitToPoint(TextHitInfo hit, Point2D point) {

   /**
     * Convert a hit to a point in standard coordinates.  The point is
     * on the baseline of the character at the leading or trailing
     * edge of the character, as appropriate.  If the path is
     * broken at the side of the character represented by the hit, the
     * point will be adjacent to the character.
     * @param hit the hit to check.  This must be a valid hit on
     * the TextLayout.
     * @param point the returned point. The point is in standard
     *     coordinates.
     * @throws IllegalArgumentException if the hit is not valid for the
     * TextLayout.
     * @throws NullPointerException if hit or point is null.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public LayoutPath getLayoutPath() {

    /**
     * Return the LayoutPath, or null if the layout path is the
     * default path (x maps to advance, y maps to offset).
     * @return the layout path
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getOutline(AffineTransform tx) {

    /**
     * Returns a <code>Shape</code> representing the outline of this
     * <code>TextLayout</code>.
     * @param tx an optional {@link AffineTransform} to apply to the
     *     outline of this <code>TextLayout</code>.
     * @return a <code>Shape</code> that is the outline of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private static int sameBaselineUpTo(Font font, char[] text,
                                        int start, int limit) {

    /**
     *
     * Return the index of the first character with a different baseline from the
     * character at start, or limit if all characters between start and limit have
     * the same baseline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    TextLine getTextLineForTesting() {

    /**
     * Package-only method for testing ONLY.  Please don't abuse.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public void draw(Graphics2D g2, float x, float y) {

    /**
     * Renders this <code>TextLayout</code> at the specified location in
     * the specified {@link java.awt.Graphics2D Graphics2D} context.
     * The origin of the layout is placed at x,&nbsp;y.  Rendering may touch
     * any point within <code>getBounds()</code> of this position.  This
     * leaves the <code>g2</code> unchanged.  Text is rendered along the
     * baseline path.
     * @param g2 the <code>Graphics2D</code> context into which to render
     *         the layout
     * @param x the X coordinate of the origin of this <code>TextLayout</code>
     * @param y the Y coordinate of the origin of this <code>TextLayout</code>
     * @see #getBounds()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public String toString() {

    /**
     * Returns debugging information for this <code>TextLayout</code>.
     * @return the <code>textLine</code> of this <code>TextLayout</code>
     *        as a <code>String</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean equals(TextLayout rhs) {

    /**
     * Returns <code>true</code> if the two layouts are equal.
     * Two layouts are equal if they contain equal glyphvectors in the same order.
     * @param rhs the <code>TextLayout</code> to compare to this
     *       <code>TextLayout</code>
     * @return <code>true</code> if the specified <code>TextLayout</code>
     *      equals this <code>TextLayout</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean equals(Object obj) {

    /**
     * Returns <code>true</code> if the specified <code>Object</code> is a
     * <code>TextLayout</code> object and if the specified <code>Object</code>
     * equals this <code>TextLayout</code>.
     * @param obj an <code>Object</code> to test for equality
     * @return <code>true</code> if the specified <code>Object</code>
     *      equals this <code>TextLayout</code>; <code>false</code>
     *      otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public int hashCode() {

    /**
     * Returns the hash code of this <code>TextLayout</code>.
     * @return the hash code of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo hitTestChar(float x, float y) {

    /**
     * Returns a <code>TextHitInfo</code> corresponding to the
     * specified point.  This method is a convenience overload of
     * <code>hitTestChar</code> that uses the natural bounds of this
     * <code>TextLayout</code>.
     * @param x the x offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @param y the y offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @return a hit describing the character and edge (leading or trailing)
     * under the specified point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo hitTestChar(float x, float y, Rectangle2D bounds) {

    /**
     * Returns a <code>TextHitInfo</code> corresponding to the
     * specified point.
     * Coordinates outside the bounds of the <code>TextLayout</code>
     * map to hits on the leading edge of the first logical character,
     * or the trailing edge of the last logical character, as appropriate,
     * regardless of the position of that character in the line.  Only the
     * direction along the baseline is used to make this evaluation.
     * @param x the x offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @param y the y offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @param bounds the bounds of the <code>TextLayout</code>.  This
     *     is in baseline-relative coordinates.
     * @return a hit describing the character and edge (leading or trailing)
     *     under the specified point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private float caretToPointDistance(float[] caretInfo, float x, float y) {

    /**
     * Returns the distance from the point (x,&nbsp;y) to the caret along
     * the line direction defined in <code>caretInfo</code>.  Distance is
     * negative if the point is to the left of the caret on a horizontal
     * line, or above the caret on a vertical line.
     * Utility for use by hitTestChar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getBlackBoxBounds(int firstEndpoint, int secondEndpoint) {

    /**
     * Returns the black box bounds of the characters in the specified range.
     * The black box bounds is an area consisting of the union of the bounding
     * boxes of all the glyphs corresponding to the characters between start
     * and limit.  This area can be disjoint.
     * @param firstEndpoint one end of the character range
     * @param secondEndpoint the other end of the character range.  Can be
     * less than <code>firstEndpoint</code>.
     * @return a <code>Shape</code> enclosing the black box bounds.  This is
     *     in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getLogicalHighlightShape(int firstEndpoint, int secondEndpoint) {

    /**
     * Returns a <code>Shape</code> enclosing the logical selection in the
     * specified range, extended to the natural bounds of this
     * <code>TextLayout</code>.  This method is a convenience overload of
     * <code>getLogicalHighlightShape</code> that uses the natural bounds of
     * this <code>TextLayout</code>.
     * @param firstEndpoint an endpoint in the range of characters to select
     * @param secondEndpoint the other endpoint of the range of characters
     * to select. Can be less than <code>firstEndpoint</code>.  The range
     * includes the character at min(firstEndpoint, secondEndpoint), but
     * excludes max(firstEndpoint, secondEndpoint).
     * @return a <code>Shape</code> enclosing the selection.  This is in
     *     standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getLogicalHighlightShape(int firstEndpoint,
                                         int secondEndpoint,
                                         Rectangle2D bounds) {

    /**
     * Returns a <code>Shape</code> enclosing the logical selection in the
     * specified range, extended to the specified <code>bounds</code>.
     * <p>
     * If the selection range includes the first logical character, the
     * selection is extended to the portion of <code>bounds</code> before
     * the start of this <code>TextLayout</code>.  If the range includes
     * the last logical character, the selection is extended to the portion
     * of <code>bounds</code> after the end of this <code>TextLayout</code>.
     * The height (width on vertical lines) of the selection is always
     * extended to <code>bounds</code>.
     * <p>
     * The selection can be discontiguous on lines with mixed-direction text.
     * Only those characters in the logical range between start and limit
     * appear selected.  For example, consider the text 'ABCdef' where capital
     * letters indicate right-to-left text, rendered on a right-to-left line,
     * with a logical selection from 0 to 4 ('ABCd').  The text appears as
     * follows, with bold standing in for the selection, and underlining for
     * the extension:
     * <br><pre>
     *    <u><b>d</b></u>ef<u><b>CBA  </b></u>
     * </pre>
     * The selection is discontiguous because the selected characters are
     * visually discontiguous. Also note that since the range includes the
     * first logical character (A), the selection is extended to the portion
     * of the <code>bounds</code> before the start of the layout, which in
     * this case (a right-to-left line) is the right portion of the
     * <code>bounds</code>.
     * @param firstEndpoint an endpoint in the range of characters to select
     * @param secondEndpoint the other endpoint of the range of characters
     * to select. Can be less than <code>firstEndpoint</code>.  The range
     * includes the character at min(firstEndpoint, secondEndpoint), but
     * excludes max(firstEndpoint, secondEndpoint).
     * @param bounds the bounding rectangle to which to extend the selection.
     *     This is in baseline-relative coordinates.
     * @return an area enclosing the selection.  This is in standard
     *     coordinates.
     * @see #getVisualHighlightShape(TextHitInfo, TextHitInfo, Rectangle2D)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getVisualHighlightShape(TextHitInfo firstEndpoint,
                                             TextHitInfo secondEndpoint) {

    /**
     * Returns a <code>Shape</code> enclosing the visual selection in the
     * specified range, extended to the bounds.  This method is a
     * convenience overload of <code>getVisualHighlightShape</code> that
     * uses the natural bounds of this <code>TextLayout</code>.
     * @param firstEndpoint one end of the visual selection
     * @param secondEndpoint the other end of the visual selection
     * @return a <code>Shape</code> enclosing the selection.  This is
     *     in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getVisualHighlightShape(TextHitInfo firstEndpoint,
                                        TextHitInfo secondEndpoint,
                                        Rectangle2D bounds)

    /**
     * Returns a path enclosing the visual selection in the specified range,
     * extended to <code>bounds</code>.
     * <p>
     * If the selection includes the leftmost (topmost) position, the selection
     * is extended to the left (top) of <code>bounds</code>.  If the
     * selection includes the rightmost (bottommost) position, the selection
     * is extended to the right (bottom) of the bounds.  The height
     * (width on vertical lines) of the selection is always extended to
     * <code>bounds</code>.
     * <p>
     * Although the selection is always contiguous, the logically selected
     * text can be discontiguous on lines with mixed-direction text.  The
     * logical ranges of text selected can be retrieved using
     * <code>getLogicalRangesForVisualSelection</code>.  For example,
     * consider the text 'ABCdef' where capital letters indicate
     * right-to-left text, rendered on a right-to-left line, with a visual
     * selection from 0L (the leading edge of 'A') to 3T (the trailing edge
     * of 'd').  The text appears as follows, with bold underlined areas
     * representing the selection:
     * <br><pre>
     *    d<u><b>efCBA  </b></u>
     * </pre>
     * The logical selection ranges are 0-3, 4-6 (ABC, ef) because the
     * visually contiguous text is logically discontiguous.  Also note that
     * since the rightmost position on the layout (to the right of 'A') is
     * selected, the selection is extended to the right of the bounds.
     * @param firstEndpoint one end of the visual selection
     * @param secondEndpoint the other end of the visual selection
     * @param bounds the bounding rectangle to which to extend the selection.
     *     This is in baseline-relative coordinates.
     * @return a <code>Shape</code> enclosing the selection.  This is in
     *     standard coordinates.
     * @see #getLogicalRangesForVisualSelection(TextHitInfo, TextHitInfo)
     * @see #getLogicalHighlightShape(int, int, Rectangle2D)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public int[] getLogicalRangesForVisualSelection(TextHitInfo firstEndpoint,
                                                    TextHitInfo secondEndpoint) {

    /**
     * Returns the logical ranges of text corresponding to a visual selection.
     * @param firstEndpoint an endpoint of the visual range
     * @param secondEndpoint the other endpoint of the visual range.
     * This endpoint can be less than <code>firstEndpoint</code>.
     * @return an array of integers representing start/limit pairs for the
     * selected ranges.
     * @see #getVisualHighlightShape(TextHitInfo, TextHitInfo, Rectangle2D)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape[] getCaretShapes(int offset) {

    /**
     * Returns two paths corresponding to the strong and weak caret.
     * This method is a convenience overload of <code>getCaretShapes</code>
     * that uses the default caret policy and this <code>TextLayout</code>
     * object's natural bounds.
     * @param offset an offset in this <code>TextLayout</code>
     * @return two paths corresponding to the strong and weak caret as
     *    defined by the <code>DEFAULT_CARET_POLICY</code>.  These are
     *    in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape[] getCaretShapes(int offset, Rectangle2D bounds) {

    /**
     * Returns two paths corresponding to the strong and weak caret.
     * This method is a convenience overload of <code>getCaretShapes</code>
     * that uses the default caret policy.
     * @param offset an offset in this <code>TextLayout</code>
     * @param bounds the bounds to which to extend the carets.  This is
     *     in baseline-relative coordinates.
     * @return two paths corresponding to the strong and weak caret as
     *    defined by the <code>DEFAULT_CARET_POLICY</code>.  These are
     *    in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape[] getCaretShapes(int offset, Rectangle2D bounds, CaretPolicy policy) {

    /**
     * Returns two paths corresponding to the strong and weak caret.
     * @param offset an offset in this <code>TextLayout</code>
     * @param bounds the bounds to which to extend the carets.  The
     * bounds is in baseline-relative coordinates.
     * @param policy the specified <code>CaretPolicy</code>
     * @return an array of two paths.  Element zero is the strong
     * caret.  If there are two carets, element one is the weak caret,
     * otherwise it is <code>null</code>. The returned shapes
     * are in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public byte getCharacterLevel(int index) {

    /**
     * Returns the level of the character at <code>index</code>.
     * Indices -1 and <code>characterCount</code> are assigned the base
     * level of this <code>TextLayout</code>.
     * @param index the index of the character from which to get the level
     * @return the level of the character at the specified index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private final TextHitInfo getStrongHit(TextHitInfo hit1, TextHitInfo hit2) {

    /**
     * Return the "stronger" of the TextHitInfos.  The TextHitInfos
     * should be logical or visual counterparts.  They are not
     * checked for validity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getCaretShape(TextHitInfo hit) {

    /**
     * Returns a <code>Shape</code> representing the caret at the specified
     * hit inside the natural bounds of this <code>TextLayout</code>.
     * @param hit the hit at which to generate the caret
     * @return a <code>Shape</code> representing the caret.  The returned
     *     shape is in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getCaretShape(TextHitInfo hit, Rectangle2D bounds) {

    /**
     * Returns a {@link Shape} representing the caret at the specified
     * hit inside the specified bounds.
     * @param hit the hit at which to generate the caret
     * @param bounds the bounds of the <code>TextLayout</code> to use
     *    in generating the caret.  The bounds is in baseline-relative
     *    coordinates.
     * @return a <code>Shape</code> representing the caret.  The returned
     *    shape is in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private double[] getCaretPath(int caret, Rectangle2D bounds,
                                  boolean clipToBounds) {

    /**
     * Return an array of four floats corresponding the endpoints of the caret
     * x0, y0, x1, y1.
     *
     * This creates a line along the slope of the caret intersecting the
     * baseline at the caret
     * position, and extending from ascent above the baseline to descent below
     * it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getVisualOtherHit(TextHitInfo hit) {

    /**
     * Returns the hit on the opposite side of the specified hit's caret.
     * @param hit the specified hit
     * @return a hit that is on the opposite side of the specified hit's
     *    caret.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextLeftHit(int offset) {

    /**
     * Returns the hit for the next caret to the left (top); if no
     * such hit, returns <code>null</code>.  The hit is to the left of
     * the strong caret at the specified offset, as determined by the
     * default policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the default policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than this <code>TextLayout</code>
     * object's character count.
     * @return a hit whose caret appears at the next position to the
     * left (top) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextLeftHit(int offset, CaretPolicy policy) {

    /**
     * Returns the hit for the next caret to the left (top); if no
     * such hit, returns <code>null</code>.  The hit is to the left of
     * the strong caret at the specified offset, as determined by the
     * specified policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the specified policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than this <code>TextLayout</code>
     * object's character count.
     * @param policy the policy used to select the strong caret
     * @return a hit whose caret appears at the next position to the
     * left (top) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextLeftHit(TextHitInfo hit) {

    /**
     * Returns the hit for the next caret to the left (top); if no such
     * hit, returns <code>null</code>.
     * If the hit character index is out of bounds, an
     * <code>IllegalArgumentException</code> is thrown.
     * @param hit a hit on a character in this <code>TextLayout</code>.
     * @return a hit whose caret appears at the next position to the
     * left (top) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextRightHit(int offset) {

    /**
     * Returns the hit for the next caret to the right (bottom); if no
     * such hit, returns <code>null</code>.  The hit is to the right of
     * the strong caret at the specified offset, as determined by the
     * default policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the default policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than the <code>TextLayout</code>
     * object's character count.
     * @return a hit whose caret appears at the next position to the
     * right (bottom) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextRightHit(int offset, CaretPolicy policy) {

    /**
     * Returns the hit for the next caret to the right (bottom); if no
     * such hit, returns <code>null</code>.  The hit is to the right of
     * the strong caret at the specified offset, as determined by the
     * specified policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the specified policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than this <code>TextLayout</code>
     * object's character count.
     * @param policy the policy used to select the strong caret
     * @return a hit whose caret appears at the next position to the
     * right (bottom) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextRightHit(TextHitInfo hit) {

    /**
     * Returns the hit for the next caret to the right (bottom); if there
     * is no such hit, returns <code>null</code>.
     * If the hit character index is out of bounds, an
     * {@link IllegalArgumentException} is thrown.
     * @param hit a hit on a character in this layout
     * @return a hit whose caret appears at the next position to the
     * right (bottom) of the caret of the provided hit or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private TextHitInfo caretToHit(int caret) {

    /**
     * Given a caret index, return a hit whose caret is at the index.
     * The hit is NOT guaranteed to be strong!!!
     *
     * @param caret a caret index.
     * @return a hit on this layout whose strong caret is at the requested
     * index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private int hitToCaret(TextHitInfo hit) {

    /**
     * Returns a caret index corresponding to <code>hit</code>.
     * Carets are numbered from left to right (top to bottom) starting from
     * zero. This always places carets next to the character hit, on the
     * indicated side of the character.
     * @param hit a hit on a character in this <code>TextLayout</code>
     * @return a caret index corresponding to the specified hit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float[] getCaretInfo(TextHitInfo hit) {

    /**
     * Returns information about the caret corresponding to <code>hit</code>.
     * This method is a convenience overload of <code>getCaretInfo</code> and
     * uses the natural bounds of this <code>TextLayout</code>.
     * @param hit a hit on a character in this <code>TextLayout</code>
     * @return the information about a caret corresponding to a hit.  The
     *     returned caret info is in baseline-relative coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float[] getCaretInfo(TextHitInfo hit, Rectangle2D bounds) {

    /**
     * Returns information about the caret corresponding to <code>hit</code>.
     * The first element of the array is the intersection of the caret with
     * the baseline, as a distance along the baseline. The second element
     * of the array is the inverse slope (run/rise) of the caret, measured
     * with respect to the baseline at that point.
     * <p>
     * This method is meant for informational use.  To display carets, it
     * is better to use <code>getCaretShapes</code>.
     * @param hit a hit on a character in this <code>TextLayout</code>
     * @param bounds the bounds to which the caret info is constructed.
     *     The bounds is in baseline-relative coordinates.
     * @return a two-element array containing the position and slope of
     * the caret.  The returned caret info is in baseline-relative coordinates.
     * @see #getCaretShapes(int, Rectangle2D, TextLayout.CaretPolicy)
     * @see Font#getItalicAngle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public int getCharacterCount() {

    /**
     * Returns the number of characters represented by this
     * <code>TextLayout</code>.
     * @return the number of characters in this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean isVertical() {

    /**
     * Returns <code>true</code> if this <code>TextLayout</code> is vertical.
     * @return <code>true</code> if this <code>TextLayout</code> is vertical;
     *      <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean isLeftToRight() {

    /**
     * Returns <code>true</code> if this <code>TextLayout</code> has
     * a left-to-right base direction or <code>false</code> if it has
     * a right-to-left base direction.  The <code>TextLayout</code>
     * has a base direction of either left-to-right (LTR) or
     * right-to-left (RTL).  The base direction is independent of the
     * actual direction of text on the line, which may be either LTR,
     * RTL, or mixed. Left-to-right layouts by default should position
     * flush left.  If the layout is on a tabbed line, the
     * tabs run left to right, so that logically successive layouts position
     * left to right.  The opposite is true for RTL layouts. By default they
     * should position flush left, and tabs run right-to-left.
     * @return <code>true</code> if the base direction of this
     *         <code>TextLayout</code> is left-to-right; <code>false</code>
     *         otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Rectangle getPixelBounds(FontRenderContext frc, float x, float y) {

    /**
     * Returns the pixel bounds of this <code>TextLayout</code> when
     * rendered in a graphics with the given
     * <code>FontRenderContext</code> at the given location.  The
     * graphics render context need not be the same as the
     * <code>FontRenderContext</code> used to create this
     * <code>TextLayout</code>, and can be null.  If it is null, the
     * <code>FontRenderContext</code> of this <code>TextLayout</code>
     * is used.
     * @param frc the <code>FontRenderContext</code> of the <code>Graphics</code>.
     * @param x the x-coordinate at which to render this <code>TextLayout</code>.
     * @param y the y-coordinate at which to render this <code>TextLayout</code>.
     * @return a <code>Rectangle</code> bounding the pixels that would be affected.
     * @see GlyphVector#getPixelBounds
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Rectangle2D getBounds() {

    /**
     * Returns the bounds of this <code>TextLayout</code>.
     * The bounds are in standard coordinates.
     * <p>Due to rasterization effects, this bounds might not enclose all of the
     * pixels rendered by the TextLayout.</p>
     * It might not coincide exactly with the ascent, descent,
     * origin or advance of the <code>TextLayout</code>.
     * @return a {@link Rectangle2D} that is the bounds of this
     *        <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getLeading() {

    /**
     * Returns the leading of the <code>TextLayout</code>.
     * The leading is the suggested interline spacing for this
     * <code>TextLayout</code>.  This is in baseline-relative
     * coordinates.
     * <p>
     * The leading is computed from the leading, descent, and baseline
     * of all glyphvectors in the <code>TextLayout</code>.  The algorithm
     * is roughly as follows:
     * <blockquote><pre>
     * maxD = 0;
     * maxDL = 0;
     * for (GlyphVector g in all glyphvectors) {
     *    maxD = max(maxD, g.getDescent() + offsets[g.getBaseline()]);
     *    maxDL = max(maxDL, g.getDescent() + g.getLeading() +
     *                       offsets[g.getBaseline()]);
     * }
     * return maxDL - maxD;
     * </pre></blockquote>
     * @return the leading of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getDescent() {

    /**
     * Returns the descent of this <code>TextLayout</code>.
     * The descent is the distance from the baseline to the bottom (left) of
     * the <code>TextLayout</code>.  It is always either positive or zero.
     * The descent is sufficient to accommodate subscripted text and is the
     * maximum of the sum of the descent, offset, and baseline of each glyph.
     * This is the maximum descent from the baseline of all the text in
     * the TextLayout.  It is in baseline-relative coordinates.
     * @return the descent of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getAscent() {

    /**
     * Returns the ascent of this <code>TextLayout</code>.
     * The ascent is the distance from the top (right) of the
     * <code>TextLayout</code> to the baseline.  It is always either
     * positive or zero.  The ascent is sufficient to
     * accommodate superscripted text and is the maximum of the sum of the
     * ascent, offset, and baseline of each glyph.  The ascent is
     * the maximum ascent from the baseline of all the text in the
     * TextLayout.  It is in baseline-relative coordinates.
     * @return the ascent of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getVisibleAdvance() {

    /**
     * Returns the advance of this <code>TextLayout</code>, minus trailing
     * whitespace.  This is in baseline-relative coordinates.
     * @return the advance of this <code>TextLayout</code> without the
     *      trailing whitespace.
     * @see #getAdvance()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getAdvance() {

    /**
     * Returns the advance of this <code>TextLayout</code>.
     * The advance is the distance from the origin to the advance of the
     * rightmost (bottommost) character.  This is in baseline-relative
     * coordinates.
     * @return the advance of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float[] getBaselineOffsets() {

    /**
     * Returns the offsets array for the baselines used for this
     * <code>TextLayout</code>.
     * <p>
     * The array is indexed by one of the values defined in
     * <code>Font</code>, which are roman, centered and hanging.  The
     * values are relative to this <code>TextLayout</code> object's
     * baseline, so that <code>getBaselineOffsets[getBaseline()] == 0</code>.
     * Offsets are added to the position of the <code>TextLayout</code>
     * object's baseline to get the position for the new baseline.
     * @return the offsets array containing the baselines used for this
     *    <code>TextLayout</code>.
     * @see #getBaseline()
     * @see Font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public byte getBaseline() {

    /**
     * Returns the baseline for this <code>TextLayout</code>.
     * The baseline is one of the values defined in <code>Font</code>,
     * which are roman, centered and hanging.  Ascent and descent are
     * relative to this baseline.  The <code>baselineOffsets</code>
     * are also relative to this baseline.
     * @return the baseline of this <code>TextLayout</code>.
     * @see #getBaselineOffsets()
     * @see Font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    protected void handleJustify(float justificationWidth) {

    /**
     * Justify this layout.  Overridden by subclassers to control justification
     * (if there were subclassers, that is...)
     *
     * The layout will only justify if the paragraph attributes (from the
     * source text, possibly defaulted by the layout attributes) indicate a
     * non-zero justification ratio.  The text will be justified to the
     * indicated width.  The current implementation also adjusts hanging
     * punctuation and trailing whitespace to overhang the justification width.
     * Once justified, the layout may not be rejustified.
     * <p>
     * Some code may rely on immutablity of layouts.  Subclassers should not
     * call this directly, but instead should call getJustifiedLayout, which
     * will call this method on a clone of this layout, preserving
     * the original.
     *
     * @param justificationWidth the width to use when justifying the line.
     * For best results, it should not be too different from the current
     * advance of the line.
     * @see #getJustifiedLayout(float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout getJustifiedLayout(float justificationWidth) {

    /**
     * Creates a copy of this <code>TextLayout</code> justified to the
     * specified width.
     * <p>
     * If this <code>TextLayout</code> has already been justified, an
     * exception is thrown.  If this <code>TextLayout</code> object's
     * justification ratio is zero, a <code>TextLayout</code> identical
     * to this <code>TextLayout</code> is returned.
     * @param justificationWidth the width to use when justifying the line.
     * For best results, it should not be too different from the current
     * advance of the line.
     * @return a <code>TextLayout</code> justified to the specified width.
     * @exception Error if this layout has already been justified, an Error is
     * thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    protected Object clone() {

    /**
     * Creates a copy of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private Rectangle2D getNaturalBounds() {

    /**
     * The 'natural bounds' encloses all the carets the layout can draw.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private void paragraphInit(byte aBaseline, CoreMetrics lm,
                               Map<? extends Attribute, ?> paragraphAttrs,
                               char[] text) {

    /**
     * Initialize the paragraph-specific data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    TextLayout(TextLine textLine,
               byte baseline,
               float[] baselineOffsets,
               float justifyRatio) {

    /**
     * Creates a <code>TextLayout</code> from a {@link TextLine} and
     * some paragraph data.  This method is used by {@link TextMeasurer}.
     * @param textLine the line measurement attributes to apply to the
     *       the resulting <code>TextLayout</code>
     * @param baseline the baseline of the text
     * @param baselineOffsets the baseline offsets for this
     * <code>TextLayout</code>.  This should already be normalized to
     * <code>baseline</code>
     * @param justifyRatio <code>0</code> if the <code>TextLayout</code>
     *     cannot be justified; <code>1</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout(AttributedCharacterIterator text, FontRenderContext frc) {

    /**
     * Constructs a <code>TextLayout</code> from an iterator over styled text.
     * <p>
     * The iterator must specify a single paragraph of text because an
     * entire paragraph is required for the bidirectional
     * algorithm.
     * @param text the styled text to display
     * @param frc contains information about a graphics device which is needed
     *       to measure the text correctly.
     *       Text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing.  This
     *       parameter does not specify a translation between the
     *       <code>TextLayout</code> and user space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout(String string, Map<? extends Attribute,?> attributes,
                      FontRenderContext frc)

    /**
     * Constructs a <code>TextLayout</code> from a <code>String</code>
     * and an attribute set.
     * <p>
     * All the text is styled using the provided attributes.
     * <p>
     * <code>string</code> must specify a single paragraph of text because an
     * entire paragraph is required for the bidirectional algorithm.
     * @param string the text to display
     * @param attributes the attributes used to style the text
     * @param frc contains information about a graphics device which is needed
     *       to measure the text correctly.
     *       Text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing.  This
     *       parameter does not specify a translation between the
     *       <code>TextLayout</code> and user space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout(String string, Font font, FontRenderContext frc) {

    /**
     * Constructs a <code>TextLayout</code> from a <code>String</code>
     * and a {@link Font}.  All the text is styled using the specified
     * <code>Font</code>.
     * <p>
     * The <code>String</code> must specify a single paragraph of text,
     * because an entire paragraph is required for the bidirectional
     * algorithm.
     * @param string the text to display
     * @param font a <code>Font</code> used to style the text
     * @param frc contains information about a graphics device which is needed
     *       to measure the text correctly.
     *       Text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing.  This
     *       parameter does not specify a translation between the
     *       <code>TextLayout</code> and user space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public static final CaretPolicy DEFAULT_CARET_POLICY = new CaretPolicy();

    /**
     * This <code>CaretPolicy</code> is used when a policy is not specified
     * by the client.  With this policy, a hit on a character whose direction
     * is the same as the line direction is stronger than a hit on a
     * counterdirectional character.  If the characters' directions are
     * the same, a hit on the leading edge of a character is stronger
     * than a hit on the trailing edge of a character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
        public TextHitInfo getStrongCaret(TextHitInfo hit1,
                                          TextHitInfo hit2,
                                          TextLayout layout) {

        /**
         * Chooses one of the specified <code>TextHitInfo</code> instances as
         * a strong caret in the specified <code>TextLayout</code>.
         * @param hit1 a valid hit in <code>layout</code>
         * @param hit2 a valid hit in <code>layout</code>
         * @param layout the <code>TextLayout</code> in which
         *        <code>hit1</code> and <code>hit2</code> are used
         * @return <code>hit1</code> or <code>hit2</code>
         *        (or an equivalent <code>TextHitInfo</code>), indicating the
         *        strong caret.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
         public CaretPolicy() {

        /**
         * Constructs a <code>CaretPolicy</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public static class CaretPolicy {

    /**
     * Defines a policy for determining the strong caret location.
     * This class contains one method, <code>getStrongCaret</code>, which
     * is used to specify the policy that determines the strong caret in
     * dual-caret text.  The strong caret is used to move the caret to the
     * left or right. Instances of this class can be passed to
     * <code>getCaretShapes</code>, <code>getNextLeftHit</code> and
     * <code>getNextRightHit</code> to customize strong caret
     * selection.
     * <p>
     * To specify alternate caret policies, subclass <code>CaretPolicy</code>
     * and override <code>getStrongCaret</code>.  <code>getStrongCaret</code>
     * should inspect the two <code>TextHitInfo</code> arguments and choose
     * one of them as the strong caret.
     * <p>
     * Most clients do not need to use this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
public final class TextLayout implements Cloneable {

/**
 *
 * <code>TextLayout</code> is an immutable graphical representation of styled
 * character data.
 * <p>
 * It provides the following capabilities:
 * <ul>
 * <li>implicit bidirectional analysis and reordering,
 * <li>cursor positioning and movement, including split cursors for
 * mixed directional text,
 * <li>highlighting, including both logical and visual highlighting
 * for mixed directional text,
 * <li>multiple baselines (roman, hanging, and centered),
 * <li>hit testing,
 * <li>justification,
 * <li>default font substitution,
 * <li>metric information such as ascent, descent, and advance, and
 * <li>rendering
 * </ul>
 * <p>
 * A <code>TextLayout</code> object can be rendered using
 * its <code>draw</code> method.
 * <p>
 * <code>TextLayout</code> can be constructed either directly or through
 * the use of a {@link LineBreakMeasurer}.  When constructed directly, the
 * source text represents a single paragraph.  <code>LineBreakMeasurer</code>
 * allows styled text to be broken into lines that fit within a particular
 * width.  See the <code>LineBreakMeasurer</code> documentation for more
 * information.
 * <p>
 * <code>TextLayout</code> construction logically proceeds as follows:
 * <ul>
 * <li>paragraph attributes are extracted and examined,
 * <li>text is analyzed for bidirectional reordering, and reordering
 * information is computed if needed,
 * <li>text is segmented into style runs
 * <li>fonts are chosen for style runs, first by using a font if the
 * attribute {@link TextAttribute#FONT} is present, otherwise by computing
 * a default font using the attributes that have been defined
 * <li>if text is on multiple baselines, the runs or subruns are further
 * broken into subruns sharing a common baseline,
 * <li>glyphvectors are generated for each run using the chosen font,
 * <li>final bidirectional reordering is performed on the glyphvectors
 * </ul>
 * <p>
 * All graphical information returned from a <code>TextLayout</code>
 * object's methods is relative to the origin of the
 * <code>TextLayout</code>, which is the intersection of the
 * <code>TextLayout</code> object's baseline with its left edge.  Also,
 * coordinates passed into a <code>TextLayout</code> object's methods
 * are assumed to be relative to the <code>TextLayout</code> object's
 * origin.  Clients usually need to translate between a
 * <code>TextLayout</code> object's coordinate system and the coordinate
 * system in another object (such as a
 * {@link java.awt.Graphics Graphics} object).
 * <p>
 * <code>TextLayout</code> objects are constructed from styled text,
 * but they do not retain a reference to their source text.  Thus,
 * changes in the text previously used to generate a <code>TextLayout</code>
 * do not affect the <code>TextLayout</code>.
 * <p>
 * Three methods on a <code>TextLayout</code> object
 * (<code>getNextRightHit</code>, <code>getNextLeftHit</code>, and
 * <code>hitTestChar</code>) return instances of {@link TextHitInfo}.
 * The offsets contained in these <code>TextHitInfo</code> objects
 * are relative to the start of the <code>TextLayout</code>, <b>not</b>
 * to the text used to create the <code>TextLayout</code>.  Similarly,
 * <code>TextLayout</code> methods that accept <code>TextHitInfo</code>
 * instances as parameters expect the <code>TextHitInfo</code> object's
 * offsets to be relative to the <code>TextLayout</code>, not to any
 * underlying text storage model.
 * <p>
 * <strong>Examples</strong>:<p>
 * Constructing and drawing a <code>TextLayout</code> and its bounding
 * rectangle:
 * <blockquote><pre>
 *   Graphics2D g = ...;
 *   Point2D loc = ...;
 *   Font font = Font.getFont("Helvetica-bold-italic");
 *   FontRenderContext frc = g.getFontRenderContext();
 *   TextLayout layout = new TextLayout("This is a string", font, frc);
 *   layout.draw(g, (float)loc.getX(), (float)loc.getY());
 *
 *   Rectangle2D bounds = layout.getBounds();
 *   bounds.setRect(bounds.getX()+loc.getX(),
 *                  bounds.getY()+loc.getY(),
 *                  bounds.getWidth(),
 *                  bounds.getHeight());
 *   g.draw(bounds);
 * </pre>
 * </blockquote>
 * <p>
 * Hit-testing a <code>TextLayout</code> (determining which character is at
 * a particular graphical location):
 * <blockquote><pre>
 *   Point2D click = ...;
 *   TextHitInfo hit = layout.hitTestChar(
 *                         (float) (click.getX() - loc.getX()),
 *                         (float) (click.getY() - loc.getY()));
 * </pre>
 * </blockquote>
 * <p>
 * Responding to a right-arrow key press:
 * <blockquote><pre>
 *   int insertionIndex = ...;
 *   TextHitInfo next = layout.getNextRightHit(insertionIndex);
 *   if (next != null) {
 *       // translate graphics to origin of layout on screen
 *       g.translate(loc.getX(), loc.getY());
 *       Shape[] carets = layout.getCaretShapes(next.getInsertionIndex());
 *       g.draw(carets[0]);
 *       if (carets[1] != null) {
 *           g.draw(carets[1]);
 *       }
 *   }
 * </pre></blockquote>
 * <p>
 * Drawing a selection range corresponding to a substring in the source text.
 * The selected area may not be visually contiguous:
 * <blockquote><pre>
 *   // selStart, selLimit should be relative to the layout,
 *   // not to the source text
 *
 *   int selStart = ..., selLimit = ...;
 *   Color selectionColor = ...;
 *   Shape selection = layout.getLogicalHighlightShape(selStart, selLimit);
 *   // selection may consist of disjoint areas
 *   // graphics is assumed to be tranlated to origin of layout
 *   g.setColor(selectionColor);
 *   g.fill(selection);
 * </pre></blockquote>
 * <p>
 * Drawing a visually contiguous selection range.  The selection range may
 * correspond to more than one substring in the source text.  The ranges of
 * the corresponding source text substrings can be obtained with
 * <code>getLogicalRangesForVisualSelection()</code>:
 * <blockquote><pre>
 *   TextHitInfo selStart = ..., selLimit = ...;
 *   Shape selection = layout.getVisualHighlightShape(selStart, selLimit);
 *   g.setColor(selectionColor);
 *   g.fill(selection);
 *   int[] ranges = getLogicalRangesForVisualSelection(selStart, selLimit);
 *   // ranges[0], ranges[1] is the first selection range,
 *   // ranges[2], ranges[3] is the second selection range, etc.
 * </pre></blockquote>
 * <p>
 * Note: Font rotations can cause text baselines to be rotated, and
 * multiple runs with different rotations can cause the baseline to
 * bend or zig-zag.  In order to account for this (rare) possibility,
 * some APIs are specified to return metrics and take parameters 'in
 * baseline-relative coordinates' (e.g. ascent, advance), and others
 * are in 'in standard coordinates' (e.g. getBounds).  Values in
 * baseline-relative coordinates map the 'x' coordinate to the
 * distance along the baseline, (positive x is forward along the
 * baseline), and the 'y' coordinate to a distance along the
 * perpendicular to the baseline at 'x' (positive y is 90 degrees
 * clockwise from the baseline vector).  Values in standard
 * coordinates are measured along the x and y axes, with 0,0 at the
 * origin of the TextLayout.  Documentation for each relevant API
 * indicates what values are in what coordinate system.  In general,
 * measurement-related APIs are in baseline-relative coordinates,
 * while display-related APIs are in standard coordinates.
 *
 * @see LineBreakMeasurer
 * @see TextAttribute
 * @see TextHitInfo
 * @see LayoutPath
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public void hitToPoint(TextHitInfo hit, Point2D point) {

   /**
     * Convert a hit to a point in standard coordinates.  The point is
     * on the baseline of the character at the leading or trailing
     * edge of the character, as appropriate.  If the path is
     * broken at the side of the character represented by the hit, the
     * point will be adjacent to the character.
     * @param hit the hit to check.  This must be a valid hit on
     * the TextLayout.
     * @param point the returned point. The point is in standard
     *     coordinates.
     * @throws IllegalArgumentException if the hit is not valid for the
     * TextLayout.
     * @throws NullPointerException if hit or point is null.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public LayoutPath getLayoutPath() {

    /**
     * Return the LayoutPath, or null if the layout path is the
     * default path (x maps to advance, y maps to offset).
     * @return the layout path
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getOutline(AffineTransform tx) {

    /**
     * Returns a <code>Shape</code> representing the outline of this
     * <code>TextLayout</code>.
     * @param tx an optional {@link AffineTransform} to apply to the
     *     outline of this <code>TextLayout</code>.
     * @return a <code>Shape</code> that is the outline of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private static int sameBaselineUpTo(Font font, char[] text,
                                        int start, int limit) {

    /**
     *
     * Return the index of the first character with a different baseline from the
     * character at start, or limit if all characters between start and limit have
     * the same baseline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    TextLine getTextLineForTesting() {

    /**
     * Package-only method for testing ONLY.  Please don't abuse.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public void draw(Graphics2D g2, float x, float y) {

    /**
     * Renders this <code>TextLayout</code> at the specified location in
     * the specified {@link java.awt.Graphics2D Graphics2D} context.
     * The origin of the layout is placed at x,&nbsp;y.  Rendering may touch
     * any point within <code>getBounds()</code> of this position.  This
     * leaves the <code>g2</code> unchanged.  Text is rendered along the
     * baseline path.
     * @param g2 the <code>Graphics2D</code> context into which to render
     *         the layout
     * @param x the X coordinate of the origin of this <code>TextLayout</code>
     * @param y the Y coordinate of the origin of this <code>TextLayout</code>
     * @see #getBounds()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public String toString() {

    /**
     * Returns debugging information for this <code>TextLayout</code>.
     * @return the <code>textLine</code> of this <code>TextLayout</code>
     *        as a <code>String</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean equals(TextLayout rhs) {

    /**
     * Returns <code>true</code> if the two layouts are equal.
     * Two layouts are equal if they contain equal glyphvectors in the same order.
     * @param rhs the <code>TextLayout</code> to compare to this
     *       <code>TextLayout</code>
     * @return <code>true</code> if the specified <code>TextLayout</code>
     *      equals this <code>TextLayout</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean equals(Object obj) {

    /**
     * Returns <code>true</code> if the specified <code>Object</code> is a
     * <code>TextLayout</code> object and if the specified <code>Object</code>
     * equals this <code>TextLayout</code>.
     * @param obj an <code>Object</code> to test for equality
     * @return <code>true</code> if the specified <code>Object</code>
     *      equals this <code>TextLayout</code>; <code>false</code>
     *      otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public int hashCode() {

    /**
     * Returns the hash code of this <code>TextLayout</code>.
     * @return the hash code of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo hitTestChar(float x, float y) {

    /**
     * Returns a <code>TextHitInfo</code> corresponding to the
     * specified point.  This method is a convenience overload of
     * <code>hitTestChar</code> that uses the natural bounds of this
     * <code>TextLayout</code>.
     * @param x the x offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @param y the y offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @return a hit describing the character and edge (leading or trailing)
     * under the specified point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo hitTestChar(float x, float y, Rectangle2D bounds) {

    /**
     * Returns a <code>TextHitInfo</code> corresponding to the
     * specified point.
     * Coordinates outside the bounds of the <code>TextLayout</code>
     * map to hits on the leading edge of the first logical character,
     * or the trailing edge of the last logical character, as appropriate,
     * regardless of the position of that character in the line.  Only the
     * direction along the baseline is used to make this evaluation.
     * @param x the x offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @param y the y offset from the origin of this
     *     <code>TextLayout</code>.  This is in standard coordinates.
     * @param bounds the bounds of the <code>TextLayout</code>.  This
     *     is in baseline-relative coordinates.
     * @return a hit describing the character and edge (leading or trailing)
     *     under the specified point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private float caretToPointDistance(float[] caretInfo, float x, float y) {

    /**
     * Returns the distance from the point (x,&nbsp;y) to the caret along
     * the line direction defined in <code>caretInfo</code>.  Distance is
     * negative if the point is to the left of the caret on a horizontal
     * line, or above the caret on a vertical line.
     * Utility for use by hitTestChar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getBlackBoxBounds(int firstEndpoint, int secondEndpoint) {

    /**
     * Returns the black box bounds of the characters in the specified range.
     * The black box bounds is an area consisting of the union of the bounding
     * boxes of all the glyphs corresponding to the characters between start
     * and limit.  This area can be disjoint.
     * @param firstEndpoint one end of the character range
     * @param secondEndpoint the other end of the character range.  Can be
     * less than <code>firstEndpoint</code>.
     * @return a <code>Shape</code> enclosing the black box bounds.  This is
     *     in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getLogicalHighlightShape(int firstEndpoint, int secondEndpoint) {

    /**
     * Returns a <code>Shape</code> enclosing the logical selection in the
     * specified range, extended to the natural bounds of this
     * <code>TextLayout</code>.  This method is a convenience overload of
     * <code>getLogicalHighlightShape</code> that uses the natural bounds of
     * this <code>TextLayout</code>.
     * @param firstEndpoint an endpoint in the range of characters to select
     * @param secondEndpoint the other endpoint of the range of characters
     * to select. Can be less than <code>firstEndpoint</code>.  The range
     * includes the character at min(firstEndpoint, secondEndpoint), but
     * excludes max(firstEndpoint, secondEndpoint).
     * @return a <code>Shape</code> enclosing the selection.  This is in
     *     standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getLogicalHighlightShape(int firstEndpoint,
                                         int secondEndpoint,
                                         Rectangle2D bounds) {

    /**
     * Returns a <code>Shape</code> enclosing the logical selection in the
     * specified range, extended to the specified <code>bounds</code>.
     * <p>
     * If the selection range includes the first logical character, the
     * selection is extended to the portion of <code>bounds</code> before
     * the start of this <code>TextLayout</code>.  If the range includes
     * the last logical character, the selection is extended to the portion
     * of <code>bounds</code> after the end of this <code>TextLayout</code>.
     * The height (width on vertical lines) of the selection is always
     * extended to <code>bounds</code>.
     * <p>
     * The selection can be discontiguous on lines with mixed-direction text.
     * Only those characters in the logical range between start and limit
     * appear selected.  For example, consider the text 'ABCdef' where capital
     * letters indicate right-to-left text, rendered on a right-to-left line,
     * with a logical selection from 0 to 4 ('ABCd').  The text appears as
     * follows, with bold standing in for the selection, and underlining for
     * the extension:
     * <br><pre>
     *    <u><b>d</b></u>ef<u><b>CBA  </b></u>
     * </pre>
     * The selection is discontiguous because the selected characters are
     * visually discontiguous. Also note that since the range includes the
     * first logical character (A), the selection is extended to the portion
     * of the <code>bounds</code> before the start of the layout, which in
     * this case (a right-to-left line) is the right portion of the
     * <code>bounds</code>.
     * @param firstEndpoint an endpoint in the range of characters to select
     * @param secondEndpoint the other endpoint of the range of characters
     * to select. Can be less than <code>firstEndpoint</code>.  The range
     * includes the character at min(firstEndpoint, secondEndpoint), but
     * excludes max(firstEndpoint, secondEndpoint).
     * @param bounds the bounding rectangle to which to extend the selection.
     *     This is in baseline-relative coordinates.
     * @return an area enclosing the selection.  This is in standard
     *     coordinates.
     * @see #getVisualHighlightShape(TextHitInfo, TextHitInfo, Rectangle2D)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getVisualHighlightShape(TextHitInfo firstEndpoint,
                                             TextHitInfo secondEndpoint) {

    /**
     * Returns a <code>Shape</code> enclosing the visual selection in the
     * specified range, extended to the bounds.  This method is a
     * convenience overload of <code>getVisualHighlightShape</code> that
     * uses the natural bounds of this <code>TextLayout</code>.
     * @param firstEndpoint one end of the visual selection
     * @param secondEndpoint the other end of the visual selection
     * @return a <code>Shape</code> enclosing the selection.  This is
     *     in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getVisualHighlightShape(TextHitInfo firstEndpoint,
                                        TextHitInfo secondEndpoint,
                                        Rectangle2D bounds)

    /**
     * Returns a path enclosing the visual selection in the specified range,
     * extended to <code>bounds</code>.
     * <p>
     * If the selection includes the leftmost (topmost) position, the selection
     * is extended to the left (top) of <code>bounds</code>.  If the
     * selection includes the rightmost (bottommost) position, the selection
     * is extended to the right (bottom) of the bounds.  The height
     * (width on vertical lines) of the selection is always extended to
     * <code>bounds</code>.
     * <p>
     * Although the selection is always contiguous, the logically selected
     * text can be discontiguous on lines with mixed-direction text.  The
     * logical ranges of text selected can be retrieved using
     * <code>getLogicalRangesForVisualSelection</code>.  For example,
     * consider the text 'ABCdef' where capital letters indicate
     * right-to-left text, rendered on a right-to-left line, with a visual
     * selection from 0L (the leading edge of 'A') to 3T (the trailing edge
     * of 'd').  The text appears as follows, with bold underlined areas
     * representing the selection:
     * <br><pre>
     *    d<u><b>efCBA  </b></u>
     * </pre>
     * The logical selection ranges are 0-3, 4-6 (ABC, ef) because the
     * visually contiguous text is logically discontiguous.  Also note that
     * since the rightmost position on the layout (to the right of 'A') is
     * selected, the selection is extended to the right of the bounds.
     * @param firstEndpoint one end of the visual selection
     * @param secondEndpoint the other end of the visual selection
     * @param bounds the bounding rectangle to which to extend the selection.
     *     This is in baseline-relative coordinates.
     * @return a <code>Shape</code> enclosing the selection.  This is in
     *     standard coordinates.
     * @see #getLogicalRangesForVisualSelection(TextHitInfo, TextHitInfo)
     * @see #getLogicalHighlightShape(int, int, Rectangle2D)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public int[] getLogicalRangesForVisualSelection(TextHitInfo firstEndpoint,
                                                    TextHitInfo secondEndpoint) {

    /**
     * Returns the logical ranges of text corresponding to a visual selection.
     * @param firstEndpoint an endpoint of the visual range
     * @param secondEndpoint the other endpoint of the visual range.
     * This endpoint can be less than <code>firstEndpoint</code>.
     * @return an array of integers representing start/limit pairs for the
     * selected ranges.
     * @see #getVisualHighlightShape(TextHitInfo, TextHitInfo, Rectangle2D)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape[] getCaretShapes(int offset) {

    /**
     * Returns two paths corresponding to the strong and weak caret.
     * This method is a convenience overload of <code>getCaretShapes</code>
     * that uses the default caret policy and this <code>TextLayout</code>
     * object's natural bounds.
     * @param offset an offset in this <code>TextLayout</code>
     * @return two paths corresponding to the strong and weak caret as
     *    defined by the <code>DEFAULT_CARET_POLICY</code>.  These are
     *    in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape[] getCaretShapes(int offset, Rectangle2D bounds) {

    /**
     * Returns two paths corresponding to the strong and weak caret.
     * This method is a convenience overload of <code>getCaretShapes</code>
     * that uses the default caret policy.
     * @param offset an offset in this <code>TextLayout</code>
     * @param bounds the bounds to which to extend the carets.  This is
     *     in baseline-relative coordinates.
     * @return two paths corresponding to the strong and weak caret as
     *    defined by the <code>DEFAULT_CARET_POLICY</code>.  These are
     *    in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape[] getCaretShapes(int offset, Rectangle2D bounds, CaretPolicy policy) {

    /**
     * Returns two paths corresponding to the strong and weak caret.
     * @param offset an offset in this <code>TextLayout</code>
     * @param bounds the bounds to which to extend the carets.  The
     * bounds is in baseline-relative coordinates.
     * @param policy the specified <code>CaretPolicy</code>
     * @return an array of two paths.  Element zero is the strong
     * caret.  If there are two carets, element one is the weak caret,
     * otherwise it is <code>null</code>. The returned shapes
     * are in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public byte getCharacterLevel(int index) {

    /**
     * Returns the level of the character at <code>index</code>.
     * Indices -1 and <code>characterCount</code> are assigned the base
     * level of this <code>TextLayout</code>.
     * @param index the index of the character from which to get the level
     * @return the level of the character at the specified index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private final TextHitInfo getStrongHit(TextHitInfo hit1, TextHitInfo hit2) {

    /**
     * Return the "stronger" of the TextHitInfos.  The TextHitInfos
     * should be logical or visual counterparts.  They are not
     * checked for validity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getCaretShape(TextHitInfo hit) {

    /**
     * Returns a <code>Shape</code> representing the caret at the specified
     * hit inside the natural bounds of this <code>TextLayout</code>.
     * @param hit the hit at which to generate the caret
     * @return a <code>Shape</code> representing the caret.  The returned
     *     shape is in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Shape getCaretShape(TextHitInfo hit, Rectangle2D bounds) {

    /**
     * Returns a {@link Shape} representing the caret at the specified
     * hit inside the specified bounds.
     * @param hit the hit at which to generate the caret
     * @param bounds the bounds of the <code>TextLayout</code> to use
     *    in generating the caret.  The bounds is in baseline-relative
     *    coordinates.
     * @return a <code>Shape</code> representing the caret.  The returned
     *    shape is in standard coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private double[] getCaretPath(int caret, Rectangle2D bounds,
                                  boolean clipToBounds) {

    /**
     * Return an array of four floats corresponding the endpoints of the caret
     * x0, y0, x1, y1.
     *
     * This creates a line along the slope of the caret intersecting the
     * baseline at the caret
     * position, and extending from ascent above the baseline to descent below
     * it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getVisualOtherHit(TextHitInfo hit) {

    /**
     * Returns the hit on the opposite side of the specified hit's caret.
     * @param hit the specified hit
     * @return a hit that is on the opposite side of the specified hit's
     *    caret.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextLeftHit(int offset) {

    /**
     * Returns the hit for the next caret to the left (top); if no
     * such hit, returns <code>null</code>.  The hit is to the left of
     * the strong caret at the specified offset, as determined by the
     * default policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the default policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than this <code>TextLayout</code>
     * object's character count.
     * @return a hit whose caret appears at the next position to the
     * left (top) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextLeftHit(int offset, CaretPolicy policy) {

    /**
     * Returns the hit for the next caret to the left (top); if no
     * such hit, returns <code>null</code>.  The hit is to the left of
     * the strong caret at the specified offset, as determined by the
     * specified policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the specified policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than this <code>TextLayout</code>
     * object's character count.
     * @param policy the policy used to select the strong caret
     * @return a hit whose caret appears at the next position to the
     * left (top) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextLeftHit(TextHitInfo hit) {

    /**
     * Returns the hit for the next caret to the left (top); if no such
     * hit, returns <code>null</code>.
     * If the hit character index is out of bounds, an
     * <code>IllegalArgumentException</code> is thrown.
     * @param hit a hit on a character in this <code>TextLayout</code>.
     * @return a hit whose caret appears at the next position to the
     * left (top) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextRightHit(int offset) {

    /**
     * Returns the hit for the next caret to the right (bottom); if no
     * such hit, returns <code>null</code>.  The hit is to the right of
     * the strong caret at the specified offset, as determined by the
     * default policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the default policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than the <code>TextLayout</code>
     * object's character count.
     * @return a hit whose caret appears at the next position to the
     * right (bottom) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextRightHit(int offset, CaretPolicy policy) {

    /**
     * Returns the hit for the next caret to the right (bottom); if no
     * such hit, returns <code>null</code>.  The hit is to the right of
     * the strong caret at the specified offset, as determined by the
     * specified policy.
     * The returned hit is the stronger of the two possible
     * hits, as determined by the specified policy.
     * @param offset an insertion offset in this <code>TextLayout</code>.
     * Cannot be less than 0 or greater than this <code>TextLayout</code>
     * object's character count.
     * @param policy the policy used to select the strong caret
     * @return a hit whose caret appears at the next position to the
     * right (bottom) of the caret of the provided hit, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextHitInfo getNextRightHit(TextHitInfo hit) {

    /**
     * Returns the hit for the next caret to the right (bottom); if there
     * is no such hit, returns <code>null</code>.
     * If the hit character index is out of bounds, an
     * {@link IllegalArgumentException} is thrown.
     * @param hit a hit on a character in this layout
     * @return a hit whose caret appears at the next position to the
     * right (bottom) of the caret of the provided hit or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private TextHitInfo caretToHit(int caret) {

    /**
     * Given a caret index, return a hit whose caret is at the index.
     * The hit is NOT guaranteed to be strong!!!
     *
     * @param caret a caret index.
     * @return a hit on this layout whose strong caret is at the requested
     * index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private int hitToCaret(TextHitInfo hit) {

    /**
     * Returns a caret index corresponding to <code>hit</code>.
     * Carets are numbered from left to right (top to bottom) starting from
     * zero. This always places carets next to the character hit, on the
     * indicated side of the character.
     * @param hit a hit on a character in this <code>TextLayout</code>
     * @return a caret index corresponding to the specified hit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float[] getCaretInfo(TextHitInfo hit) {

    /**
     * Returns information about the caret corresponding to <code>hit</code>.
     * This method is a convenience overload of <code>getCaretInfo</code> and
     * uses the natural bounds of this <code>TextLayout</code>.
     * @param hit a hit on a character in this <code>TextLayout</code>
     * @return the information about a caret corresponding to a hit.  The
     *     returned caret info is in baseline-relative coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float[] getCaretInfo(TextHitInfo hit, Rectangle2D bounds) {

    /**
     * Returns information about the caret corresponding to <code>hit</code>.
     * The first element of the array is the intersection of the caret with
     * the baseline, as a distance along the baseline. The second element
     * of the array is the inverse slope (run/rise) of the caret, measured
     * with respect to the baseline at that point.
     * <p>
     * This method is meant for informational use.  To display carets, it
     * is better to use <code>getCaretShapes</code>.
     * @param hit a hit on a character in this <code>TextLayout</code>
     * @param bounds the bounds to which the caret info is constructed.
     *     The bounds is in baseline-relative coordinates.
     * @return a two-element array containing the position and slope of
     * the caret.  The returned caret info is in baseline-relative coordinates.
     * @see #getCaretShapes(int, Rectangle2D, TextLayout.CaretPolicy)
     * @see Font#getItalicAngle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public int getCharacterCount() {

    /**
     * Returns the number of characters represented by this
     * <code>TextLayout</code>.
     * @return the number of characters in this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean isVertical() {

    /**
     * Returns <code>true</code> if this <code>TextLayout</code> is vertical.
     * @return <code>true</code> if this <code>TextLayout</code> is vertical;
     *      <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public boolean isLeftToRight() {

    /**
     * Returns <code>true</code> if this <code>TextLayout</code> has
     * a left-to-right base direction or <code>false</code> if it has
     * a right-to-left base direction.  The <code>TextLayout</code>
     * has a base direction of either left-to-right (LTR) or
     * right-to-left (RTL).  The base direction is independent of the
     * actual direction of text on the line, which may be either LTR,
     * RTL, or mixed. Left-to-right layouts by default should position
     * flush left.  If the layout is on a tabbed line, the
     * tabs run left to right, so that logically successive layouts position
     * left to right.  The opposite is true for RTL layouts. By default they
     * should position flush left, and tabs run right-to-left.
     * @return <code>true</code> if the base direction of this
     *         <code>TextLayout</code> is left-to-right; <code>false</code>
     *         otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Rectangle getPixelBounds(FontRenderContext frc, float x, float y) {

    /**
     * Returns the pixel bounds of this <code>TextLayout</code> when
     * rendered in a graphics with the given
     * <code>FontRenderContext</code> at the given location.  The
     * graphics render context need not be the same as the
     * <code>FontRenderContext</code> used to create this
     * <code>TextLayout</code>, and can be null.  If it is null, the
     * <code>FontRenderContext</code> of this <code>TextLayout</code>
     * is used.
     * @param frc the <code>FontRenderContext</code> of the <code>Graphics</code>.
     * @param x the x-coordinate at which to render this <code>TextLayout</code>.
     * @param y the y-coordinate at which to render this <code>TextLayout</code>.
     * @return a <code>Rectangle</code> bounding the pixels that would be affected.
     * @see GlyphVector#getPixelBounds
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public Rectangle2D getBounds() {

    /**
     * Returns the bounds of this <code>TextLayout</code>.
     * The bounds are in standard coordinates.
     * <p>Due to rasterization effects, this bounds might not enclose all of the
     * pixels rendered by the TextLayout.</p>
     * It might not coincide exactly with the ascent, descent,
     * origin or advance of the <code>TextLayout</code>.
     * @return a {@link Rectangle2D} that is the bounds of this
     *        <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getLeading() {

    /**
     * Returns the leading of the <code>TextLayout</code>.
     * The leading is the suggested interline spacing for this
     * <code>TextLayout</code>.  This is in baseline-relative
     * coordinates.
     * <p>
     * The leading is computed from the leading, descent, and baseline
     * of all glyphvectors in the <code>TextLayout</code>.  The algorithm
     * is roughly as follows:
     * <blockquote><pre>
     * maxD = 0;
     * maxDL = 0;
     * for (GlyphVector g in all glyphvectors) {
     *    maxD = max(maxD, g.getDescent() + offsets[g.getBaseline()]);
     *    maxDL = max(maxDL, g.getDescent() + g.getLeading() +
     *                       offsets[g.getBaseline()]);
     * }
     * return maxDL - maxD;
     * </pre></blockquote>
     * @return the leading of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getDescent() {

    /**
     * Returns the descent of this <code>TextLayout</code>.
     * The descent is the distance from the baseline to the bottom (left) of
     * the <code>TextLayout</code>.  It is always either positive or zero.
     * The descent is sufficient to accommodate subscripted text and is the
     * maximum of the sum of the descent, offset, and baseline of each glyph.
     * This is the maximum descent from the baseline of all the text in
     * the TextLayout.  It is in baseline-relative coordinates.
     * @return the descent of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getAscent() {

    /**
     * Returns the ascent of this <code>TextLayout</code>.
     * The ascent is the distance from the top (right) of the
     * <code>TextLayout</code> to the baseline.  It is always either
     * positive or zero.  The ascent is sufficient to
     * accommodate superscripted text and is the maximum of the sum of the
     * ascent, offset, and baseline of each glyph.  The ascent is
     * the maximum ascent from the baseline of all the text in the
     * TextLayout.  It is in baseline-relative coordinates.
     * @return the ascent of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getVisibleAdvance() {

    /**
     * Returns the advance of this <code>TextLayout</code>, minus trailing
     * whitespace.  This is in baseline-relative coordinates.
     * @return the advance of this <code>TextLayout</code> without the
     *      trailing whitespace.
     * @see #getAdvance()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float getAdvance() {

    /**
     * Returns the advance of this <code>TextLayout</code>.
     * The advance is the distance from the origin to the advance of the
     * rightmost (bottommost) character.  This is in baseline-relative
     * coordinates.
     * @return the advance of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public float[] getBaselineOffsets() {

    /**
     * Returns the offsets array for the baselines used for this
     * <code>TextLayout</code>.
     * <p>
     * The array is indexed by one of the values defined in
     * <code>Font</code>, which are roman, centered and hanging.  The
     * values are relative to this <code>TextLayout</code> object's
     * baseline, so that <code>getBaselineOffsets[getBaseline()] == 0</code>.
     * Offsets are added to the position of the <code>TextLayout</code>
     * object's baseline to get the position for the new baseline.
     * @return the offsets array containing the baselines used for this
     *    <code>TextLayout</code>.
     * @see #getBaseline()
     * @see Font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public byte getBaseline() {

    /**
     * Returns the baseline for this <code>TextLayout</code>.
     * The baseline is one of the values defined in <code>Font</code>,
     * which are roman, centered and hanging.  Ascent and descent are
     * relative to this baseline.  The <code>baselineOffsets</code>
     * are also relative to this baseline.
     * @return the baseline of this <code>TextLayout</code>.
     * @see #getBaselineOffsets()
     * @see Font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    protected void handleJustify(float justificationWidth) {

    /**
     * Justify this layout.  Overridden by subclassers to control justification
     * (if there were subclassers, that is...)
     *
     * The layout will only justify if the paragraph attributes (from the
     * source text, possibly defaulted by the layout attributes) indicate a
     * non-zero justification ratio.  The text will be justified to the
     * indicated width.  The current implementation also adjusts hanging
     * punctuation and trailing whitespace to overhang the justification width.
     * Once justified, the layout may not be rejustified.
     * <p>
     * Some code may rely on immutablity of layouts.  Subclassers should not
     * call this directly, but instead should call getJustifiedLayout, which
     * will call this method on a clone of this layout, preserving
     * the original.
     *
     * @param justificationWidth the width to use when justifying the line.
     * For best results, it should not be too different from the current
     * advance of the line.
     * @see #getJustifiedLayout(float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout getJustifiedLayout(float justificationWidth) {

    /**
     * Creates a copy of this <code>TextLayout</code> justified to the
     * specified width.
     * <p>
     * If this <code>TextLayout</code> has already been justified, an
     * exception is thrown.  If this <code>TextLayout</code> object's
     * justification ratio is zero, a <code>TextLayout</code> identical
     * to this <code>TextLayout</code> is returned.
     * @param justificationWidth the width to use when justifying the line.
     * For best results, it should not be too different from the current
     * advance of the line.
     * @return a <code>TextLayout</code> justified to the specified width.
     * @exception Error if this layout has already been justified, an Error is
     * thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    protected Object clone() {

    /**
     * Creates a copy of this <code>TextLayout</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private Rectangle2D getNaturalBounds() {

    /**
     * The 'natural bounds' encloses all the carets the layout can draw.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    private void paragraphInit(byte aBaseline, CoreMetrics lm,
                               Map<? extends Attribute, ?> paragraphAttrs,
                               char[] text) {

    /**
     * Initialize the paragraph-specific data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    TextLayout(TextLine textLine,
               byte baseline,
               float[] baselineOffsets,
               float justifyRatio) {

    /**
     * Creates a <code>TextLayout</code> from a {@link TextLine} and
     * some paragraph data.  This method is used by {@link TextMeasurer}.
     * @param textLine the line measurement attributes to apply to the
     *       the resulting <code>TextLayout</code>
     * @param baseline the baseline of the text
     * @param baselineOffsets the baseline offsets for this
     * <code>TextLayout</code>.  This should already be normalized to
     * <code>baseline</code>
     * @param justifyRatio <code>0</code> if the <code>TextLayout</code>
     *     cannot be justified; <code>1</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout(AttributedCharacterIterator text, FontRenderContext frc) {

    /**
     * Constructs a <code>TextLayout</code> from an iterator over styled text.
     * <p>
     * The iterator must specify a single paragraph of text because an
     * entire paragraph is required for the bidirectional
     * algorithm.
     * @param text the styled text to display
     * @param frc contains information about a graphics device which is needed
     *       to measure the text correctly.
     *       Text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing.  This
     *       parameter does not specify a translation between the
     *       <code>TextLayout</code> and user space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout(String string, Map<? extends Attribute,?> attributes,
                      FontRenderContext frc)

    /**
     * Constructs a <code>TextLayout</code> from a <code>String</code>
     * and an attribute set.
     * <p>
     * All the text is styled using the provided attributes.
     * <p>
     * <code>string</code> must specify a single paragraph of text because an
     * entire paragraph is required for the bidirectional algorithm.
     * @param string the text to display
     * @param attributes the attributes used to style the text
     * @param frc contains information about a graphics device which is needed
     *       to measure the text correctly.
     *       Text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing.  This
     *       parameter does not specify a translation between the
     *       <code>TextLayout</code> and user space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public TextLayout(String string, Font font, FontRenderContext frc) {

    /**
     * Constructs a <code>TextLayout</code> from a <code>String</code>
     * and a {@link Font}.  All the text is styled using the specified
     * <code>Font</code>.
     * <p>
     * The <code>String</code> must specify a single paragraph of text,
     * because an entire paragraph is required for the bidirectional
     * algorithm.
     * @param string the text to display
     * @param font a <code>Font</code> used to style the text
     * @param frc contains information about a graphics device which is needed
     *       to measure the text correctly.
     *       Text measurements can vary slightly depending on the
     *       device resolution, and attributes such as antialiasing.  This
     *       parameter does not specify a translation between the
     *       <code>TextLayout</code> and user space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public static final CaretPolicy DEFAULT_CARET_POLICY = new CaretPolicy();

    /**
     * This <code>CaretPolicy</code> is used when a policy is not specified
     * by the client.  With this policy, a hit on a character whose direction
     * is the same as the line direction is stronger than a hit on a
     * counterdirectional character.  If the characters' directions are
     * the same, a hit on the leading edge of a character is stronger
     * than a hit on the trailing edge of a character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
        public TextHitInfo getStrongCaret(TextHitInfo hit1,
                                          TextHitInfo hit2,
                                          TextLayout layout) {

        /**
         * Chooses one of the specified <code>TextHitInfo</code> instances as
         * a strong caret in the specified <code>TextLayout</code>.
         * @param hit1 a valid hit in <code>layout</code>
         * @param hit2 a valid hit in <code>layout</code>
         * @param layout the <code>TextLayout</code> in which
         *        <code>hit1</code> and <code>hit2</code> are used
         * @return <code>hit1</code> or <code>hit2</code>
         *        (or an equivalent <code>TextHitInfo</code>), indicating the
         *        strong caret.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
         public CaretPolicy() {

        /**
         * Constructs a <code>CaretPolicy</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
    public static class CaretPolicy {

    /**
     * Defines a policy for determining the strong caret location.
     * This class contains one method, <code>getStrongCaret</code>, which
     * is used to specify the policy that determines the strong caret in
     * dual-caret text.  The strong caret is used to move the caret to the
     * left or right. Instances of this class can be passed to
     * <code>getCaretShapes</code>, <code>getNextLeftHit</code> and
     * <code>getNextRightHit</code> to customize strong caret
     * selection.
     * <p>
     * To specify alternate caret policies, subclass <code>CaretPolicy</code>
     * and override <code>getStrongCaret</code>.  <code>getStrongCaret</code>
     * should inspect the two <code>TextHitInfo</code> arguments and choose
     * one of them as the strong caret.
     * <p>
     * Most clients do not need to use this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/TextLayout.java
public final class TextLayout implements Cloneable {

/**
 *
 * <code>TextLayout</code> is an immutable graphical representation of styled
 * character data.
 * <p>
 * It provides the following capabilities:
 * <ul>
 * <li>implicit bidirectional analysis and reordering,
 * <li>cursor positioning and movement, including split cursors for
 * mixed directional text,
 * <li>highlighting, including both logical and visual highlighting
 * for mixed directional text,
 * <li>multiple baselines (roman, hanging, and centered),
 * <li>hit testing,
 * <li>justification,
 * <li>default font substitution,
 * <li>metric information such as ascent, descent, and advance, and
 * <li>rendering
 * </ul>
 * <p>
 * A <code>TextLayout</code> object can be rendered using
 * its <code>draw</code> method.
 * <p>
 * <code>TextLayout</code> can be constructed either directly or through
 * the use of a {@link LineBreakMeasurer}.  When constructed directly, the
 * source text represents a single paragraph.  <code>LineBreakMeasurer</code>
 * allows styled text to be broken into lines that fit within a particular
 * width.  See the <code>LineBreakMeasurer</code> documentation for more
 * information.
 * <p>
 * <code>TextLayout</code> construction logically proceeds as follows:
 * <ul>
 * <li>paragraph attributes are extracted and examined,
 * <li>text is analyzed for bidirectional reordering, and reordering
 * information is computed if needed,
 * <li>text is segmented into style runs
 * <li>fonts are chosen for style runs, first by using a font if the
 * attribute {@link TextAttribute#FONT} is present, otherwise by computing
 * a default font using the attributes that have been defined
 * <li>if text is on multiple baselines, the runs or subruns are further
 * broken into subruns sharing a common baseline,
 * <li>glyphvectors are generated for each run using the chosen font,
 * <li>final bidirectional reordering is performed on the glyphvectors
 * </ul>
 * <p>
 * All graphical information returned from a <code>TextLayout</code>
 * object's methods is relative to the origin of the
 * <code>TextLayout</code>, which is the intersection of the
 * <code>TextLayout</code> object's baseline with its left edge.  Also,
 * coordinates passed into a <code>TextLayout</code> object's methods
 * are assumed to be relative to the <code>TextLayout</code> object's
 * origin.  Clients usually need to translate between a
 * <code>TextLayout</code> object's coordinate system and the coordinate
 * system in another object (such as a
 * {@link java.awt.Graphics Graphics} object).
 * <p>
 * <code>TextLayout</code> objects are constructed from styled text,
 * but they do not retain a reference to their source text.  Thus,
 * changes in the text previously used to generate a <code>TextLayout</code>
 * do not affect the <code>TextLayout</code>.
 * <p>
 * Three methods on a <code>TextLayout</code> object
 * (<code>getNextRightHit</code>, <code>getNextLeftHit</code>, and
 * <code>hitTestChar</code>) return instances of {@link TextHitInfo}.
 * The offsets contained in these <code>TextHitInfo</code> objects
 * are relative to the start of the <code>TextLayout</code>, <b>not</b>
 * to the text used to create the <code>TextLayout</code>.  Similarly,
 * <code>TextLayout</code> methods that accept <code>TextHitInfo</code>
 * instances as parameters expect the <code>TextHitInfo</code> object's
 * offsets to be relative to the <code>TextLayout</code>, not to any
 * underlying text storage model.
 * <p>
 * <strong>Examples</strong>:<p>
 * Constructing and drawing a <code>TextLayout</code> and its bounding
 * rectangle:
 * <blockquote><pre>
 *   Graphics2D g = ...;
 *   Point2D loc = ...;
 *   Font font = Font.getFont("Helvetica-bold-italic");
 *   FontRenderContext frc = g.getFontRenderContext();
 *   TextLayout layout = new TextLayout("This is a string", font, frc);
 *   layout.draw(g, (float)loc.getX(), (float)loc.getY());
 *
 *   Rectangle2D bounds = layout.getBounds();
 *   bounds.setRect(bounds.getX()+loc.getX(),
 *                  bounds.getY()+loc.getY(),
 *                  bounds.getWidth(),
 *                  bounds.getHeight());
 *   g.draw(bounds);
 * </pre>
 * </blockquote>
 * <p>
 * Hit-testing a <code>TextLayout</code> (determining which character is at
 * a particular graphical location):
 * <blockquote><pre>
 *   Point2D click = ...;
 *   TextHitInfo hit = layout.hitTestChar(
 *                         (float) (click.getX() - loc.getX()),
 *                         (float) (click.getY() - loc.getY()));
 * </pre>
 * </blockquote>
 * <p>
 * Responding to a right-arrow key press:
 * <blockquote><pre>
 *   int insertionIndex = ...;
 *   TextHitInfo next = layout.getNextRightHit(insertionIndex);
 *   if (next != null) {
 *       // translate graphics to origin of layout on screen
 *       g.translate(loc.getX(), loc.getY());
 *       Shape[] carets = layout.getCaretShapes(next.getInsertionIndex());
 *       g.draw(carets[0]);
 *       if (carets[1] != null) {
 *           g.draw(carets[1]);
 *       }
 *   }
 * </pre></blockquote>
 * <p>
 * Drawing a selection range corresponding to a substring in the source text.
 * The selected area may not be visually contiguous:
 * <blockquote><pre>
 *   // selStart, selLimit should be relative to the layout,
 *   // not to the source text
 *
 *   int selStart = ..., selLimit = ...;
 *   Color selectionColor = ...;
 *   Shape selection = layout.getLogicalHighlightShape(selStart, selLimit);
 *   // selection may consist of disjoint areas
 *   // graphics is assumed to be tranlated to origin of layout
 *   g.setColor(selectionColor);
 *   g.fill(selection);
 * </pre></blockquote>
 * <p>
 * Drawing a visually contiguous selection range.  The selection range may
 * correspond to more than one substring in the source text.  The ranges of
 * the corresponding source text substrings can be obtained with
 * <code>getLogicalRangesForVisualSelection()</code>:
 * <blockquote><pre>
 *   TextHitInfo selStart = ..., selLimit = ...;
 *   Shape selection = layout.getVisualHighlightShape(selStart, selLimit);
 *   g.setColor(selectionColor);
 *   g.fill(selection);
 *   int[] ranges = getLogicalRangesForVisualSelection(selStart, selLimit);
 *   // ranges[0], ranges[1] is the first selection range,
 *   // ranges[2], ranges[3] is the second selection range, etc.
 * </pre></blockquote>
 * <p>
 * Note: Font rotations can cause text baselines to be rotated, and
 * multiple runs with different rotations can cause the baseline to
 * bend or zig-zag.  In order to account for this (rare) possibility,
 * some APIs are specified to return metrics and take parameters 'in
 * baseline-relative coordinates' (e.g. ascent, advance), and others
 * are in 'in standard coordinates' (e.g. getBounds).  Values in
 * baseline-relative coordinates map the 'x' coordinate to the
 * distance along the baseline, (positive x is forward along the
 * baseline), and the 'y' coordinate to a distance along the
 * perpendicular to the baseline at 'x' (positive y is 90 degrees
 * clockwise from the baseline vector).  Values in standard
 * coordinates are measured along the x and y axes, with 0,0 at the
 * origin of the TextLayout.  Documentation for each relevant API
 * indicates what values are in what coordinate system.  In general,
 * measurement-related APIs are in baseline-relative coordinates,
 * while display-related APIs are in standard coordinates.
 *
 * @see LineBreakMeasurer
 * @see TextAttribute
 * @see TextHitInfo
 * @see LayoutPath
 */
