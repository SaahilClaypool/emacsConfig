_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public boolean equals(ImageGraphicAttribute rhs) {

    /**
     * Compares this <code>ImageGraphicAttribute</code> to the specified
     * <code>ImageGraphicAttribute</code>.
     * @param rhs the <code>ImageGraphicAttribute</code> to compare for
     * equality
     * @return <code>true</code> if this
     * <code>ImageGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public boolean equals(Object rhs) {

    /**
     * Compares this <code>ImageGraphicAttribute</code> to the specified
     * {@link Object}.
     * @param rhs the <code>Object</code> to compare for equality
     * @return <code>true</code> if this
     * <code>ImageGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public int hashCode() {

    /**
     * Returns a hashcode for this <code>ImageGraphicAttribute</code>.
     * @return  a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public void draw(Graphics2D graphics, float x, float y) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public Rectangle2D getBounds() {

    /**
     * Returns a {@link Rectangle2D} that encloses all of the
     * bits rendered by this <code>ImageGraphicAttribute</code>, relative
     * to the rendering position.  A graphic can be rendered beyond its
     * origin, ascent, descent, or advance;  but if it is, this
     * method's implementation must indicate where the graphic is rendered.
     * @return a <code>Rectangle2D</code> that encloses all of the bits
     * rendered by this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public float getAdvance() {

    /**
     * Returns the advance of this <code>ImageGraphicAttribute</code>.
     * The advance of an <code>ImageGraphicAttribute</code> is the
     * distance from the origin to the right edge of the image.
     * @return the advance of this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public float getDescent() {

    /**
     * Returns the descent of this <code>ImageGraphicAttribute</code>.
     * The descent of an <code>ImageGraphicAttribute</code> is the
     * distance from the origin to the bottom of the image.
     * @return the descent of this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public float getAscent() {

    /**
     * Returns the ascent of this <code>ImageGraphicAttribute</code>.  The
     * ascent of an <code>ImageGraphicAttribute</code> is the distance
     * from the top of the image to the origin.
     * @return the ascent of this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public ImageGraphicAttribute(Image image,
                                 int alignment,
                                 float originX,
                                 float originY) {

    /**
     * Constructs an <code>ImageGraphicAttribute</code> from the specified
     * <code>Image</code>. The point
     * (<code>originX</code>,&nbsp;<code>originY</code>) in the
     * <code>Image</code> appears at the origin of the
     * <code>ImageGraphicAttribute</code> within the text.
     * @param image the <code>Image</code> rendered by this
     * <code>ImageGraphicAttribute</code>.
     * This object keeps a reference to <code>image</code>.
     * @param alignment one of the alignments from this
     * <code>ImageGraphicAttribute</code>
     * @param originX the X coordinate of the point within
     * the <code>Image</code> that appears at the origin of the
     * <code>ImageGraphicAttribute</code> in the text line.
     * @param originY the Y coordinate of the point within
     * the <code>Image</code> that appears at the origin of the
     * <code>ImageGraphicAttribute</code> in the text line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public ImageGraphicAttribute(Image image, int alignment) {

    /**
     * Constucts an <code>ImageGraphicAttribute</code> from the specified
     * {@link Image}.  The origin is at (0,&nbsp;0).
     * @param image the <code>Image</code> rendered by this
     * <code>ImageGraphicAttribute</code>.
     * This object keeps a reference to <code>image</code>.
     * @param alignment one of the alignments from this
     * <code>ImageGraphicAttribute</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
public final class ImageGraphicAttribute extends GraphicAttribute {

/**
 * The <code>ImageGraphicAttribute</code> class is an implementation of
 * {@link GraphicAttribute} which draws images in
 * a {@link TextLayout}.
 * @see GraphicAttribute
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public boolean equals(ImageGraphicAttribute rhs) {

    /**
     * Compares this <code>ImageGraphicAttribute</code> to the specified
     * <code>ImageGraphicAttribute</code>.
     * @param rhs the <code>ImageGraphicAttribute</code> to compare for
     * equality
     * @return <code>true</code> if this
     * <code>ImageGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public boolean equals(Object rhs) {

    /**
     * Compares this <code>ImageGraphicAttribute</code> to the specified
     * {@link Object}.
     * @param rhs the <code>Object</code> to compare for equality
     * @return <code>true</code> if this
     * <code>ImageGraphicAttribute</code> equals <code>rhs</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public int hashCode() {

    /**
     * Returns a hashcode for this <code>ImageGraphicAttribute</code>.
     * @return  a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public void draw(Graphics2D graphics, float x, float y) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public Rectangle2D getBounds() {

    /**
     * Returns a {@link Rectangle2D} that encloses all of the
     * bits rendered by this <code>ImageGraphicAttribute</code>, relative
     * to the rendering position.  A graphic can be rendered beyond its
     * origin, ascent, descent, or advance;  but if it is, this
     * method's implementation must indicate where the graphic is rendered.
     * @return a <code>Rectangle2D</code> that encloses all of the bits
     * rendered by this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public float getAdvance() {

    /**
     * Returns the advance of this <code>ImageGraphicAttribute</code>.
     * The advance of an <code>ImageGraphicAttribute</code> is the
     * distance from the origin to the right edge of the image.
     * @return the advance of this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public float getDescent() {

    /**
     * Returns the descent of this <code>ImageGraphicAttribute</code>.
     * The descent of an <code>ImageGraphicAttribute</code> is the
     * distance from the origin to the bottom of the image.
     * @return the descent of this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public float getAscent() {

    /**
     * Returns the ascent of this <code>ImageGraphicAttribute</code>.  The
     * ascent of an <code>ImageGraphicAttribute</code> is the distance
     * from the top of the image to the origin.
     * @return the ascent of this <code>ImageGraphicAttribute</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public ImageGraphicAttribute(Image image,
                                 int alignment,
                                 float originX,
                                 float originY) {

    /**
     * Constructs an <code>ImageGraphicAttribute</code> from the specified
     * <code>Image</code>. The point
     * (<code>originX</code>,&nbsp;<code>originY</code>) in the
     * <code>Image</code> appears at the origin of the
     * <code>ImageGraphicAttribute</code> within the text.
     * @param image the <code>Image</code> rendered by this
     * <code>ImageGraphicAttribute</code>.
     * This object keeps a reference to <code>image</code>.
     * @param alignment one of the alignments from this
     * <code>ImageGraphicAttribute</code>
     * @param originX the X coordinate of the point within
     * the <code>Image</code> that appears at the origin of the
     * <code>ImageGraphicAttribute</code> in the text line.
     * @param originY the Y coordinate of the point within
     * the <code>Image</code> that appears at the origin of the
     * <code>ImageGraphicAttribute</code> in the text line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
    public ImageGraphicAttribute(Image image, int alignment) {

    /**
     * Constucts an <code>ImageGraphicAttribute</code> from the specified
     * {@link Image}.  The origin is at (0,&nbsp;0).
     * @param image the <code>Image</code> rendered by this
     * <code>ImageGraphicAttribute</code>.
     * This object keeps a reference to <code>image</code>.
     * @param alignment one of the alignments from this
     * <code>ImageGraphicAttribute</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/ImageGraphicAttribute.java
public final class ImageGraphicAttribute extends GraphicAttribute {

/**
 * The <code>ImageGraphicAttribute</code> class is an implementation of
 * {@link GraphicAttribute} which draws images in
 * a {@link TextLayout}.
 * @see GraphicAttribute
 */
