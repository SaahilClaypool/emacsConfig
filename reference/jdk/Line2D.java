_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iteration object that defines the boundary of this
     * flattened <code>Line2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>Line2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>Line2D</code> object do not affect any iterations of that
     * geometry that are already in process.
     * @param at the specified <code>AffineTransform</code>
     * @param flatness the maximum amount that the control points for a
     *          given curve can vary from colinear before a subdivided
     *          curve is replaced by a straight line connecting the
     *          end points.  Since a <code>Line2D</code> object is
     *          always flat, this parameter is ignored.
     * @return a <code>PathIterator</code> that defines the boundary of the
     *                  flattened <code>Line2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of this
     * <code>Line2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>Line2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>Line2D</code> object do not affect any iterations of that
     * geometry that are already in process.
     * @param at the specified {@link AffineTransform}
     * @return a {@link PathIterator} that defines the boundary of this
     *          <code>Line2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * Tests if the interior of this <code>Line2D</code> entirely contains
     * the specified <code>Rectangle2D</code>.
     * This method is required to implement the <code>Shape</code> interface,
     * but in the case of <code>Line2D</code> objects it always returns
     * <code>false</code> since a line contains no area.
     * @param r the specified <code>Rectangle2D</code> to be tested
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * Tests if the interior of this <code>Line2D</code> entirely contains
     * the specified set of rectangular coordinates.
     * This method is required to implement the <code>Shape</code> interface,
     * but in the case of <code>Line2D</code> objects it always returns
     * false since a line contains no area.
     * @param x the X coordinate of the upper-left corner of the
     *          specified rectangular area
     * @param y the Y coordinate of the upper-left corner of the
     *          specified rectangular area
     * @param w the width of the specified rectangular area
     * @param h the height of the specified rectangular area
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(Point2D p) {

    /**
     * Tests if a given <code>Point2D</code> is inside the boundary of
     * this <code>Line2D</code>.
     * This method is required to implement the {@link Shape} interface,
     * but in the case of <code>Line2D</code> objects it always returns
     * <code>false</code> since a line contains no area.
     * @param p the specified <code>Point2D</code> to be tested
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(double x, double y) {

    /**
     * Tests if a specified coordinate is inside the boundary of this
     * <code>Line2D</code>.  This method is required to implement the
     * {@link Shape} interface, but in the case of <code>Line2D</code>
     * objects it always returns <code>false</code> since a line contains
     * no area.
     * @param x the X coordinate of the specified point to be tested
     * @param y the Y coordinate of the specified point to be tested
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDist(Point2D pt) {

    /**
     * Returns the distance from a <code>Point2D</code> to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured
     * @return a double value that is the distance from a specified
     *                  <code>Point2D</code> to the current line.
     * @see #ptSegDist(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDist(double px, double py) {

    /**
     * Returns the distance from a point to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line
     * @param py the Y coordinate of the specified point being
     *           measured against this line
     * @return a double value that is the distance from a specified point
     *                  to the current line.
     * @see #ptSegDist(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDistSq(Point2D pt) {

    /**
     * Returns the square of the distance from a specified
     * <code>Point2D</code> to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured
     *           against this line
     * @return a double value that is the square of the distance from a
     *                  specified <code>Point2D</code> to the current
     *                  line.
     * @see #ptSegDistSq(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDistSq(double px, double py) {

    /**
     * Returns the square of the distance from a point to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line
     * @param py the Y coordinate of the specified point being
     *           measured against this line
     * @return a double value that is the square of the distance from a
     *                  specified point to the current line.
     * @see #ptSegDistSq(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptLineDist(double x1, double y1,
                                    double x2, double y2,
                                    double px, double py)

    /**
     * Returns the distance from a point to a line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by the specified coordinates.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the specified line
     * @param y1 the Y coordinate of the start point of the specified line
     * @param x2 the X coordinate of the end point of the specified line
     * @param y2 the Y coordinate of the end point of the specified line
     * @param px the X coordinate of the specified point being
     *           measured against the specified line
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line
     * @return a double value that is the distance from the specified
     *                   point to the specified line.
     * @see #ptSegDist(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptLineDistSq(double x1, double y1,
                                      double x2, double y2,
                                      double px, double py)

    /**
     * Returns the square of the distance from a point to a line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by the specified coordinates.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the specified line
     * @param y1 the Y coordinate of the start point of the specified line
     * @param x2 the X coordinate of the end point of the specified line
     * @param y2 the Y coordinate of the end point of the specified line
     * @param px the X coordinate of the specified point being
     *           measured against the specified line
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line
     * @return a double value that is the square of the distance from the
     *                  specified point to the specified line.
     * @see #ptSegDistSq(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDist(Point2D pt) {

    /**
     * Returns the distance from a <code>Point2D</code> to this line
     * segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured
     *          against this line segment
     * @return a double value that is the distance from the specified
     *                          <code>Point2D</code> to the current line
     *                          segment.
     * @see #ptLineDist(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDist(double px, double py) {

    /**
     * Returns the distance from a point to this line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line segment
     * @param py the Y coordinate of the specified point being
     *           measured against this line segment
     * @return a double value that is the distance from the specified
     *                  point to the current line segment.
     * @see #ptLineDist(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDistSq(Point2D pt) {

    /**
     * Returns the square of the distance from a <code>Point2D</code> to
     * this line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured against
     *           this line segment.
     * @return a double value that is the square of the distance from the
     *                  specified <code>Point2D</code> to the current
     *                  line segment.
     * @see #ptLineDistSq(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDistSq(double px, double py) {

    /**
     * Returns the square of the distance from a point to this line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line segment
     * @param py the Y coordinate of the specified point being
     *           measured against this line segment
     * @return a double value that is the square of the distance from the
     *                  specified point to the current line segment.
     * @see #ptLineDistSq(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptSegDist(double x1, double y1,
                                   double x2, double y2,
                                   double px, double py)

    /**
     * Returns the distance from a point to a line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the specified end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @param px the X coordinate of the specified point being
     *           measured against the specified line segment
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line segment
     * @return a double value that is the distance from the specified point
     *                          to the specified line segment.
     * @see #ptLineDist(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptSegDistSq(double x1, double y1,
                                     double x2, double y2,
                                     double px, double py)

    /**
     * Returns the square of the distance from a point to a line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the specified end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @param px the X coordinate of the specified point being
     *           measured against the specified line segment
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line segment
     * @return a double value that is the square of the distance from the
     *                  specified point to the specified line segment.
     * @see #ptLineDistSq(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersectsLine(Line2D l) {

    /**
     * Tests if the specified line segment intersects this line segment.
     * @param l the specified <code>Line2D</code>
     * @return <code>true</code> if this line segment and the specified line
     *                  segment intersect each other;
     *                  <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersectsLine(double x1, double y1, double x2, double y2) {

    /**
     * Tests if the line segment from {@code (x1,y1)} to
     * {@code (x2,y2)} intersects this line segment.
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @return {@code <true>} if this line segment and the specified line segment
     *                  intersect each other; <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static boolean linesIntersect(double x1, double y1,
                                         double x2, double y2,
                                         double x3, double y3,
                                         double x4, double y4)

    /**
     * Tests if the line segment from {@code (x1,y1)} to
     * {@code (x2,y2)} intersects the line segment from {@code (x3,y3)}
     * to {@code (x4,y4)}.
     *
     * @param x1 the X coordinate of the start point of the first
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the first
     *           specified line segment
     * @param x2 the X coordinate of the end point of the first
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the first
     *           specified line segment
     * @param x3 the X coordinate of the start point of the second
     *           specified line segment
     * @param y3 the Y coordinate of the start point of the second
     *           specified line segment
     * @param x4 the X coordinate of the end point of the second
     *           specified line segment
     * @param y4 the Y coordinate of the end point of the second
     *           specified line segment
     * @return <code>true</code> if the first specified line segment
     *                  and the second specified line segment intersect
     *                  each other; <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public int relativeCCW(Point2D p) {

    /**
     * Returns an indicator of where the specified <code>Point2D</code>
     * lies with respect to this line segment.
     * See the method comments of
     * {@link #relativeCCW(double, double, double, double, double, double)}
     * to interpret the return value.
     * @param p the specified <code>Point2D</code> to be compared
     *          with this <code>Line2D</code>
     * @return an integer that indicates the position of the specified
     *         <code>Point2D</code> with respect to this <code>Line2D</code>
     * @see #relativeCCW(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public int relativeCCW(double px, double py) {

    /**
     * Returns an indicator of where the specified point
     * {@code (px,py)} lies with respect to this line segment.
     * See the method comments of
     * {@link #relativeCCW(double, double, double, double, double, double)}
     * to interpret the return value.
     * @param px the X coordinate of the specified point
     *           to be compared with this <code>Line2D</code>
     * @param py the Y coordinate of the specified point
     *           to be compared with this <code>Line2D</code>
     * @return an integer that indicates the position of the specified
     *         coordinates with respect to this <code>Line2D</code>
     * @see #relativeCCW(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static int relativeCCW(double x1, double y1,
                                  double x2, double y2,
                                  double px, double py)

    /**
     * Returns an indicator of where the specified point
     * {@code (px,py)} lies with respect to the line segment from
     * {@code (x1,y1)} to {@code (x2,y2)}.
     * The return value can be either 1, -1, or 0 and indicates
     * in which direction the specified line must pivot around its
     * first end point, {@code (x1,y1)}, in order to point at the
     * specified point {@code (px,py)}.
     * <p>A return value of 1 indicates that the line segment must
     * turn in the direction that takes the positive X axis towards
     * the negative Y axis.  In the default coordinate system used by
     * Java 2D, this direction is counterclockwise.
     * <p>A return value of -1 indicates that the line segment must
     * turn in the direction that takes the positive X axis towards
     * the positive Y axis.  In the default coordinate system, this
     * direction is clockwise.
     * <p>A return value of 0 indicates that the point lies
     * exactly on the line segment.  Note that an indicator value
     * of 0 is rare and not useful for determining collinearity
     * because of floating point rounding issues.
     * <p>If the point is colinear with the line segment, but
     * not between the end points, then the value will be -1 if the point
     * lies "beyond {@code (x1,y1)}" or 1 if the point lies
     * "beyond {@code (x2,y2)}".
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @param px the X coordinate of the specified point to be
     *           compared with the specified line segment
     * @param py the Y coordinate of the specified point to be
     *           compared with the specified line segment
     * @return an integer that indicates the position of the third specified
     *                  coordinates with respect to the line segment formed
     *                  by the first two specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public void setLine(Line2D l) {

    /**
     * Sets the location of the end points of this <code>Line2D</code> to
     * the same as those end points of the specified <code>Line2D</code>.
     * @param l the specified <code>Line2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public void setLine(Point2D p1, Point2D p2) {

    /**
     * Sets the location of the end points of this <code>Line2D</code> to
     * the specified <code>Point2D</code> coordinates.
     * @param p1 the start <code>Point2D</code> of the line segment
     * @param p2 the end <code>Point2D</code> of the line segment
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract void setLine(double x1, double y1, double x2, double y2);

    /**
     * Sets the location of the end points of this <code>Line2D</code> to
     * the specified double coordinates.
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract Point2D getP2();

    /**
     * Returns the end <code>Point2D</code> of this <code>Line2D</code>.
     * @return the end <code>Point2D</code> of this <code>Line2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getY2();

    /**
     * Returns the Y coordinate of the end point in double precision.
     * @return the Y coordinate of the end point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getX2();

    /**
     * Returns the X coordinate of the end point in double precision.
     * @return the X coordinate of the end point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract Point2D getP1();

    /**
     * Returns the start <code>Point2D</code> of this <code>Line2D</code>.
     * @return the start <code>Point2D</code> of this <code>Line2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getY1();

    /**
     * Returns the Y coordinate of the start point in double precision.
     * @return the Y coordinate of the start point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getX1();

    /**
     * Returns the X coordinate of the start point in double precision.
     * @return the X coordinate of the start point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    protected Line2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessory
     * methods below.
     *
     * @see java.awt.geom.Line2D.Float
     * @see java.awt.geom.Line2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public void setLine(double x1, double y1, double x2, double y2) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Double(Point2D p1, Point2D p2) {

        /**
         * Constructs and initializes a <code>Line2D</code> from the
         * specified <code>Point2D</code> objects.
         * @param p1 the start <code>Point2D</code> of this line segment
         * @param p2 the end <code>Point2D</code> of this line segment
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Double(double x1, double y1, double x2, double y2) {

        /**
         * Constructs and initializes a <code>Line2D</code> from the
         * specified coordinates.
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Double() {

        /**
         * Constructs and initializes a Line with coordinates (0, 0) &rarr; (0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double y2;

        /**
         * The Y coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double x2;

        /**
         * The X coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double y1;

        /**
         * The Y coordinate of the start point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static class Double extends Line2D implements Serializable {

    /**
     * A line segment specified with double coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public void setLine(float x1, float y1, float x2, float y2) {

        /**
         * Sets the location of the end points of this <code>Line2D</code>
         * to the specified float coordinates.
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public void setLine(double x1, double y1, double x2, double y2) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Float(Point2D p1, Point2D p2) {

        /**
         * Constructs and initializes a <code>Line2D</code> from the
         * specified <code>Point2D</code> objects.
         * @param p1 the start <code>Point2D</code> of this line segment
         * @param p2 the end <code>Point2D</code> of this line segment
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Float(float x1, float y1, float x2, float y2) {

        /**
         * Constructs and initializes a Line from the specified coordinates.
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Float() {

        /**
         * Constructs and initializes a Line with coordinates (0, 0) &rarr; (0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public float y2;

        /**
         * The Y coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public float x2;

        /**
         * The X coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public float y1;

        /**
         * The Y coordinate of the start point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static class Float extends Line2D implements Serializable {

    /**
     * A line segment specified with float coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
public abstract class Line2D implements Shape, Cloneable {

/**
 * This <code>Line2D</code> represents a line segment in {@code (x,y)}
 * coordinate space.  This class, like all of the Java 2D API, uses a
 * default coordinate system called <i>user space</i> in which the y-axis
 * values increase downward and x-axis values increase to the right.  For
 * more information on the user space coordinate system, see the
 * <a href="https://docs.oracle.com/javase/1.3/docs/guide/2d/spec/j2d-intro.fm2.html#61857">
 * Coordinate Systems</a> section of the Java 2D Programmer's Guide.
 * <p>
 * This class is only the abstract superclass for all objects that
 * store a 2D line segment.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public Object clone() {

    /**
     * Creates a new object of the same class as this object.
     *
     * @return     a clone of this instance.
     * @exception  OutOfMemoryError            if there is not enough memory.
     * @see        java.lang.Cloneable
     * @since      1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public PathIterator getPathIterator(AffineTransform at, double flatness) {

    /**
     * Returns an iteration object that defines the boundary of this
     * flattened <code>Line2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>Line2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>Line2D</code> object do not affect any iterations of that
     * geometry that are already in process.
     * @param at the specified <code>AffineTransform</code>
     * @param flatness the maximum amount that the control points for a
     *          given curve can vary from colinear before a subdivided
     *          curve is replaced by a straight line connecting the
     *          end points.  Since a <code>Line2D</code> object is
     *          always flat, this parameter is ignored.
     * @return a <code>PathIterator</code> that defines the boundary of the
     *                  flattened <code>Line2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public PathIterator getPathIterator(AffineTransform at) {

    /**
     * Returns an iteration object that defines the boundary of this
     * <code>Line2D</code>.
     * The iterator for this class is not multi-threaded safe,
     * which means that this <code>Line2D</code> class does not
     * guarantee that modifications to the geometry of this
     * <code>Line2D</code> object do not affect any iterations of that
     * geometry that are already in process.
     * @param at the specified {@link AffineTransform}
     * @return a {@link PathIterator} that defines the boundary of this
     *          <code>Line2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public Rectangle getBounds() {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(Rectangle2D r) {

    /**
     * Tests if the interior of this <code>Line2D</code> entirely contains
     * the specified <code>Rectangle2D</code>.
     * This method is required to implement the <code>Shape</code> interface,
     * but in the case of <code>Line2D</code> objects it always returns
     * <code>false</code> since a line contains no area.
     * @param r the specified <code>Rectangle2D</code> to be tested
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(double x, double y, double w, double h) {

    /**
     * Tests if the interior of this <code>Line2D</code> entirely contains
     * the specified set of rectangular coordinates.
     * This method is required to implement the <code>Shape</code> interface,
     * but in the case of <code>Line2D</code> objects it always returns
     * false since a line contains no area.
     * @param x the X coordinate of the upper-left corner of the
     *          specified rectangular area
     * @param y the Y coordinate of the upper-left corner of the
     *          specified rectangular area
     * @param w the width of the specified rectangular area
     * @param h the height of the specified rectangular area
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersects(Rectangle2D r) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersects(double x, double y, double w, double h) {

    /**
     * {@inheritDoc}
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(Point2D p) {

    /**
     * Tests if a given <code>Point2D</code> is inside the boundary of
     * this <code>Line2D</code>.
     * This method is required to implement the {@link Shape} interface,
     * but in the case of <code>Line2D</code> objects it always returns
     * <code>false</code> since a line contains no area.
     * @param p the specified <code>Point2D</code> to be tested
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean contains(double x, double y) {

    /**
     * Tests if a specified coordinate is inside the boundary of this
     * <code>Line2D</code>.  This method is required to implement the
     * {@link Shape} interface, but in the case of <code>Line2D</code>
     * objects it always returns <code>false</code> since a line contains
     * no area.
     * @param x the X coordinate of the specified point to be tested
     * @param y the Y coordinate of the specified point to be tested
     * @return <code>false</code> because a <code>Line2D</code> contains
     * no area.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDist(Point2D pt) {

    /**
     * Returns the distance from a <code>Point2D</code> to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured
     * @return a double value that is the distance from a specified
     *                  <code>Point2D</code> to the current line.
     * @see #ptSegDist(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDist(double px, double py) {

    /**
     * Returns the distance from a point to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line
     * @param py the Y coordinate of the specified point being
     *           measured against this line
     * @return a double value that is the distance from a specified point
     *                  to the current line.
     * @see #ptSegDist(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDistSq(Point2D pt) {

    /**
     * Returns the square of the distance from a specified
     * <code>Point2D</code> to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured
     *           against this line
     * @return a double value that is the square of the distance from a
     *                  specified <code>Point2D</code> to the current
     *                  line.
     * @see #ptSegDistSq(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptLineDistSq(double px, double py) {

    /**
     * Returns the square of the distance from a point to this line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by this <code>Line2D</code>.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line
     * @param py the Y coordinate of the specified point being
     *           measured against this line
     * @return a double value that is the square of the distance from a
     *                  specified point to the current line.
     * @see #ptSegDistSq(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptLineDist(double x1, double y1,
                                    double x2, double y2,
                                    double px, double py)

    /**
     * Returns the distance from a point to a line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by the specified coordinates.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the specified line
     * @param y1 the Y coordinate of the start point of the specified line
     * @param x2 the X coordinate of the end point of the specified line
     * @param y2 the Y coordinate of the end point of the specified line
     * @param px the X coordinate of the specified point being
     *           measured against the specified line
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line
     * @return a double value that is the distance from the specified
     *                   point to the specified line.
     * @see #ptSegDist(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptLineDistSq(double x1, double y1,
                                      double x2, double y2,
                                      double px, double py)

    /**
     * Returns the square of the distance from a point to a line.
     * The distance measured is the distance between the specified
     * point and the closest point on the infinitely-extended line
     * defined by the specified coordinates.  If the specified point
     * intersects the line, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the specified line
     * @param y1 the Y coordinate of the start point of the specified line
     * @param x2 the X coordinate of the end point of the specified line
     * @param y2 the Y coordinate of the end point of the specified line
     * @param px the X coordinate of the specified point being
     *           measured against the specified line
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line
     * @return a double value that is the square of the distance from the
     *                  specified point to the specified line.
     * @see #ptSegDistSq(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDist(Point2D pt) {

    /**
     * Returns the distance from a <code>Point2D</code> to this line
     * segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured
     *          against this line segment
     * @return a double value that is the distance from the specified
     *                          <code>Point2D</code> to the current line
     *                          segment.
     * @see #ptLineDist(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDist(double px, double py) {

    /**
     * Returns the distance from a point to this line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line segment
     * @param py the Y coordinate of the specified point being
     *           measured against this line segment
     * @return a double value that is the distance from the specified
     *                  point to the current line segment.
     * @see #ptLineDist(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDistSq(Point2D pt) {

    /**
     * Returns the square of the distance from a <code>Point2D</code> to
     * this line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     * @param pt the specified <code>Point2D</code> being measured against
     *           this line segment.
     * @return a double value that is the square of the distance from the
     *                  specified <code>Point2D</code> to the current
     *                  line segment.
     * @see #ptLineDistSq(Point2D)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public double ptSegDistSq(double px, double py) {

    /**
     * Returns the square of the distance from a point to this line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the current line's end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param px the X coordinate of the specified point being
     *           measured against this line segment
     * @param py the Y coordinate of the specified point being
     *           measured against this line segment
     * @return a double value that is the square of the distance from the
     *                  specified point to the current line segment.
     * @see #ptLineDistSq(double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptSegDist(double x1, double y1,
                                   double x2, double y2,
                                   double px, double py)

    /**
     * Returns the distance from a point to a line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the specified end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @param px the X coordinate of the specified point being
     *           measured against the specified line segment
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line segment
     * @return a double value that is the distance from the specified point
     *                          to the specified line segment.
     * @see #ptLineDist(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static double ptSegDistSq(double x1, double y1,
                                     double x2, double y2,
                                     double px, double py)

    /**
     * Returns the square of the distance from a point to a line segment.
     * The distance measured is the distance between the specified
     * point and the closest point between the specified end points.
     * If the specified point intersects the line segment in between the
     * end points, this method returns 0.0.
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @param px the X coordinate of the specified point being
     *           measured against the specified line segment
     * @param py the Y coordinate of the specified point being
     *           measured against the specified line segment
     * @return a double value that is the square of the distance from the
     *                  specified point to the specified line segment.
     * @see #ptLineDistSq(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersectsLine(Line2D l) {

    /**
     * Tests if the specified line segment intersects this line segment.
     * @param l the specified <code>Line2D</code>
     * @return <code>true</code> if this line segment and the specified line
     *                  segment intersect each other;
     *                  <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public boolean intersectsLine(double x1, double y1, double x2, double y2) {

    /**
     * Tests if the line segment from {@code (x1,y1)} to
     * {@code (x2,y2)} intersects this line segment.
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @return {@code <true>} if this line segment and the specified line segment
     *                  intersect each other; <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static boolean linesIntersect(double x1, double y1,
                                         double x2, double y2,
                                         double x3, double y3,
                                         double x4, double y4)

    /**
     * Tests if the line segment from {@code (x1,y1)} to
     * {@code (x2,y2)} intersects the line segment from {@code (x3,y3)}
     * to {@code (x4,y4)}.
     *
     * @param x1 the X coordinate of the start point of the first
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the first
     *           specified line segment
     * @param x2 the X coordinate of the end point of the first
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the first
     *           specified line segment
     * @param x3 the X coordinate of the start point of the second
     *           specified line segment
     * @param y3 the Y coordinate of the start point of the second
     *           specified line segment
     * @param x4 the X coordinate of the end point of the second
     *           specified line segment
     * @param y4 the Y coordinate of the end point of the second
     *           specified line segment
     * @return <code>true</code> if the first specified line segment
     *                  and the second specified line segment intersect
     *                  each other; <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public int relativeCCW(Point2D p) {

    /**
     * Returns an indicator of where the specified <code>Point2D</code>
     * lies with respect to this line segment.
     * See the method comments of
     * {@link #relativeCCW(double, double, double, double, double, double)}
     * to interpret the return value.
     * @param p the specified <code>Point2D</code> to be compared
     *          with this <code>Line2D</code>
     * @return an integer that indicates the position of the specified
     *         <code>Point2D</code> with respect to this <code>Line2D</code>
     * @see #relativeCCW(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public int relativeCCW(double px, double py) {

    /**
     * Returns an indicator of where the specified point
     * {@code (px,py)} lies with respect to this line segment.
     * See the method comments of
     * {@link #relativeCCW(double, double, double, double, double, double)}
     * to interpret the return value.
     * @param px the X coordinate of the specified point
     *           to be compared with this <code>Line2D</code>
     * @param py the Y coordinate of the specified point
     *           to be compared with this <code>Line2D</code>
     * @return an integer that indicates the position of the specified
     *         coordinates with respect to this <code>Line2D</code>
     * @see #relativeCCW(double, double, double, double, double, double)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static int relativeCCW(double x1, double y1,
                                  double x2, double y2,
                                  double px, double py)

    /**
     * Returns an indicator of where the specified point
     * {@code (px,py)} lies with respect to the line segment from
     * {@code (x1,y1)} to {@code (x2,y2)}.
     * The return value can be either 1, -1, or 0 and indicates
     * in which direction the specified line must pivot around its
     * first end point, {@code (x1,y1)}, in order to point at the
     * specified point {@code (px,py)}.
     * <p>A return value of 1 indicates that the line segment must
     * turn in the direction that takes the positive X axis towards
     * the negative Y axis.  In the default coordinate system used by
     * Java 2D, this direction is counterclockwise.
     * <p>A return value of -1 indicates that the line segment must
     * turn in the direction that takes the positive X axis towards
     * the positive Y axis.  In the default coordinate system, this
     * direction is clockwise.
     * <p>A return value of 0 indicates that the point lies
     * exactly on the line segment.  Note that an indicator value
     * of 0 is rare and not useful for determining collinearity
     * because of floating point rounding issues.
     * <p>If the point is colinear with the line segment, but
     * not between the end points, then the value will be -1 if the point
     * lies "beyond {@code (x1,y1)}" or 1 if the point lies
     * "beyond {@code (x2,y2)}".
     *
     * @param x1 the X coordinate of the start point of the
     *           specified line segment
     * @param y1 the Y coordinate of the start point of the
     *           specified line segment
     * @param x2 the X coordinate of the end point of the
     *           specified line segment
     * @param y2 the Y coordinate of the end point of the
     *           specified line segment
     * @param px the X coordinate of the specified point to be
     *           compared with the specified line segment
     * @param py the Y coordinate of the specified point to be
     *           compared with the specified line segment
     * @return an integer that indicates the position of the third specified
     *                  coordinates with respect to the line segment formed
     *                  by the first two specified coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public void setLine(Line2D l) {

    /**
     * Sets the location of the end points of this <code>Line2D</code> to
     * the same as those end points of the specified <code>Line2D</code>.
     * @param l the specified <code>Line2D</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public void setLine(Point2D p1, Point2D p2) {

    /**
     * Sets the location of the end points of this <code>Line2D</code> to
     * the specified <code>Point2D</code> coordinates.
     * @param p1 the start <code>Point2D</code> of the line segment
     * @param p2 the end <code>Point2D</code> of the line segment
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract void setLine(double x1, double y1, double x2, double y2);

    /**
     * Sets the location of the end points of this <code>Line2D</code> to
     * the specified double coordinates.
     * @param x1 the X coordinate of the start point
     * @param y1 the Y coordinate of the start point
     * @param x2 the X coordinate of the end point
     * @param y2 the Y coordinate of the end point
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract Point2D getP2();

    /**
     * Returns the end <code>Point2D</code> of this <code>Line2D</code>.
     * @return the end <code>Point2D</code> of this <code>Line2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getY2();

    /**
     * Returns the Y coordinate of the end point in double precision.
     * @return the Y coordinate of the end point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getX2();

    /**
     * Returns the X coordinate of the end point in double precision.
     * @return the X coordinate of the end point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract Point2D getP1();

    /**
     * Returns the start <code>Point2D</code> of this <code>Line2D</code>.
     * @return the start <code>Point2D</code> of this <code>Line2D</code>.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getY1();

    /**
     * Returns the Y coordinate of the start point in double precision.
     * @return the Y coordinate of the start point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public abstract double getX1();

    /**
     * Returns the X coordinate of the start point in double precision.
     * @return the X coordinate of the start point of this
     *         {@code Line2D} object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    protected Line2D() {

    /**
     * This is an abstract class that cannot be instantiated directly.
     * Type-specific implementation subclasses are available for
     * instantiation and provide a number of formats for storing
     * the information necessary to satisfy the various accessory
     * methods below.
     *
     * @see java.awt.geom.Line2D.Float
     * @see java.awt.geom.Line2D.Double
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public void setLine(double x1, double y1, double x2, double y2) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Double(Point2D p1, Point2D p2) {

        /**
         * Constructs and initializes a <code>Line2D</code> from the
         * specified <code>Point2D</code> objects.
         * @param p1 the start <code>Point2D</code> of this line segment
         * @param p2 the end <code>Point2D</code> of this line segment
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Double(double x1, double y1, double x2, double y2) {

        /**
         * Constructs and initializes a <code>Line2D</code> from the
         * specified coordinates.
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Double() {

        /**
         * Constructs and initializes a Line with coordinates (0, 0) &rarr; (0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double y2;

        /**
         * The Y coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double x2;

        /**
         * The X coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double y1;

        /**
         * The Y coordinate of the start point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static class Double extends Line2D implements Serializable {

    /**
     * A line segment specified with double coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Rectangle2D getBounds2D() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public void setLine(float x1, float y1, float x2, float y2) {

        /**
         * Sets the location of the end points of this <code>Line2D</code>
         * to the specified float coordinates.
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public void setLine(double x1, double y1, double x2, double y2) {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX2() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Point2D getP1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getY1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public double getX1() {

        /**
         * {@inheritDoc}
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Float(Point2D p1, Point2D p2) {

        /**
         * Constructs and initializes a <code>Line2D</code> from the
         * specified <code>Point2D</code> objects.
         * @param p1 the start <code>Point2D</code> of this line segment
         * @param p2 the end <code>Point2D</code> of this line segment
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Float(float x1, float y1, float x2, float y2) {

        /**
         * Constructs and initializes a Line from the specified coordinates.
         * @param x1 the X coordinate of the start point
         * @param y1 the Y coordinate of the start point
         * @param x2 the X coordinate of the end point
         * @param y2 the Y coordinate of the end point
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public Float() {

        /**
         * Constructs and initializes a Line with coordinates (0, 0) &rarr; (0, 0).
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public float y2;

        /**
         * The Y coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public float x2;

        /**
         * The X coordinate of the end point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
        public float y1;

        /**
         * The Y coordinate of the start point of the line segment.
         * @since 1.2
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
    public static class Float extends Line2D implements Serializable {

    /**
     * A line segment specified with float coordinates.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/geom/Line2D.java
public abstract class Line2D implements Shape, Cloneable {

/**
 * This <code>Line2D</code> represents a line segment in {@code (x,y)}
 * coordinate space.  This class, like all of the Java 2D API, uses a
 * default coordinate system called <i>user space</i> in which the y-axis
 * values increase downward and x-axis values increase to the right.  For
 * more information on the user space coordinate system, see the
 * <a href="https://docs.oracle.com/javase/1.3/docs/guide/2d/spec/j2d-intro.fm2.html#61857">
 * Coordinate Systems</a> section of the Java 2D Programmer's Guide.
 * <p>
 * This class is only the abstract superclass for all objects that
 * store a 2D line segment.
 * The actual storage representation of the coordinates is left to
 * the subclass.
 *
 * @author      Jim Graham
 * @since 1.2
 */