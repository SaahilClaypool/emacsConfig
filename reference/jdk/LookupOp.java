_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final RenderingHints getRenderingHints() {

    /**
     * Returns the rendering hints for this op.
     * @return the <code>RenderingHints</code> object associated
     *         with this op.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final Point2D getPoint2D (Point2D srcPt, Point2D dstPt) {

    /**
     * Returns the location of the destination point given a
     * point in the source.  If <code>dstPt</code> is not
     * <code>null</code>, it will be used to hold the return value.
     * Since this is not a geometric operation, the <code>srcPt</code>
     * will equal the <code>dstPt</code>.
     * @param srcPt a <code>Point2D</code> that represents a point
     *        in the source image
     * @param dstPt a <code>Point2D</code>that represents the location
     *        in the destination
     * @return the <code>Point2D</code> in the destination that
     *         corresponds to the specified point in the source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public WritableRaster createCompatibleDestRaster (Raster src) {

    /**
     * Creates a zeroed-destination <code>Raster</code> with the
     * correct size and number of bands, given this source.
     * @param src the <code>Raster</code> to be transformed
     * @return the zeroed-destination <code>Raster</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public BufferedImage createCompatibleDestImage (BufferedImage src,
                                                    ColorModel destCM) {

    /**
     * Creates a zeroed destination image with the correct size and number of
     * bands.  If destCM is <code>null</code>, an appropriate
     * <code>ColorModel</code> will be used.
     * @param src       Source image for the filter operation.
     * @param destCM    the destination's <code>ColorModel</code>, which
     *                  can be <code>null</code>.
     * @return a filtered destination <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final Rectangle2D getBounds2D (Raster src) {

    /**
     * Returns the bounding box of the filtered destination Raster.  Since
     * this is not a geometric operation, the bounding box does not
     * change.
     * @param src the <code>Raster</code> to be filtered
     * @return the bounds of the filtered definition <code>Raster</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final Rectangle2D getBounds2D (BufferedImage src) {

    /**
     * Returns the bounding box of the filtered destination image.  Since
     * this is not a geometric operation, the bounding box does not
     * change.
     * @param src the <code>BufferedImage</code> to be filtered
     * @return the bounds of the filtered definition image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final WritableRaster filter (Raster src, WritableRaster dst) {

    /**
     * Performs a lookup operation on a <code>Raster</code>.
     * If the destination <code>Raster</code> is <code>null</code>,
     * a new <code>Raster</code> will be created.
     * The <code>IllegalArgumentException</code> might be thrown
     * if the source <code>Raster</code> and the destination
     * <code>Raster</code> do not have the same
     * number of bands or if the number of arrays in the
     * <code>LookupTable</code> does not meet the
     * restrictions stated in the class comment above.
     * @param src the source <code>Raster</code> to filter
     * @param dst the destination <code>WritableRaster</code> for the
     *            filtered <code>src</code>
     * @return the filtered <code>WritableRaster</code>.
     * @throws IllegalArgumentException if the source and destinations
     *         rasters do not have the same number of bands, or the
     *         number of arrays in the <code>LookupTable</code> does
     *         not meet the restrictions described in the class comments.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final BufferedImage filter(BufferedImage src, BufferedImage dst) {

    /**
     * Performs a lookup operation on a <code>BufferedImage</code>.
     * If the color model in the source image is not the same as that
     * in the destination image, the pixels will be converted
     * in the destination.  If the destination image is <code>null</code>,
     * a <code>BufferedImage</code> will be created with an appropriate
     * <code>ColorModel</code>.  An <code>IllegalArgumentException</code>
     * might be thrown if the number of arrays in the
     * <code>LookupTable</code> does not meet the restrictions
     * stated in the class comment above, or if the source image
     * has an <code>IndexColorModel</code>.
     * @param src the <code>BufferedImage</code> to be filtered
     * @param dst the <code>BufferedImage</code> in which to
     *            store the results of the filter operation
     * @return the filtered <code>BufferedImage</code>.
     * @throws IllegalArgumentException if the number of arrays in the
     *         <code>LookupTable</code> does not meet the restrictions
     *         described in the class comments, or if the source image
     *         has an <code>IndexColorModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final LookupTable getTable() {

    /**
     * Returns the <code>LookupTable</code>.
     * @return the <code>LookupTable</code> of this
     *         <code>LookupOp</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public LookupOp(LookupTable lookup, RenderingHints hints) {

    /**
     * Constructs a <code>LookupOp</code> object given the lookup
     * table and a <code>RenderingHints</code> object, which might
     * be <code>null</code>.
     * @param lookup the specified <code>LookupTable</code>
     * @param hints the specified <code>RenderingHints</code>,
     *        or <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
public class LookupOp implements BufferedImageOp, RasterOp {

/**
 * This class implements a lookup operation from the source
 * to the destination.  The LookupTable object may contain a single array
 * or multiple arrays, subject to the restrictions below.
 * <p>
 * For Rasters, the lookup operates on bands.  The number of
 * lookup arrays may be one, in which case the same array is
 * applied to all bands, or it must equal the number of Source
 * Raster bands.
 * <p>
 * For BufferedImages, the lookup operates on color and alpha components.
 * The number of lookup arrays may be one, in which case the
 * same array is applied to all color (but not alpha) components.
 * Otherwise, the number of lookup arrays may
 * equal the number of Source color components, in which case no
 * lookup of the alpha component (if present) is performed.
 * If neither of these cases apply, the number of lookup arrays
 * must equal the number of Source color components plus alpha components,
 * in which case lookup is performed for all color and alpha components.
 * This allows non-uniform rescaling of multi-band BufferedImages.
 * <p>
 * BufferedImage sources with premultiplied alpha data are treated in the same
 * manner as non-premultiplied images for purposes of the lookup.  That is,
 * the lookup is done per band on the raw data of the BufferedImage source
 * without regard to whether the data is premultiplied.  If a color conversion
 * is required to the destination ColorModel, the premultiplied state of
 * both source and destination will be taken into account for this step.
 * <p>
 * Images with an IndexColorModel cannot be used.
 * <p>
 * If a RenderingHints object is specified in the constructor, the
 * color rendering hint and the dithering hint may be used when color
 * conversion is required.
 * <p>
 * This class allows the Source to be the same as the Destination.
 *
 * @see LookupTable
 * @see java.awt.RenderingHints#KEY_COLOR_RENDERING
 * @see java.awt.RenderingHints#KEY_DITHERING
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final RenderingHints getRenderingHints() {

    /**
     * Returns the rendering hints for this op.
     * @return the <code>RenderingHints</code> object associated
     *         with this op.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final Point2D getPoint2D (Point2D srcPt, Point2D dstPt) {

    /**
     * Returns the location of the destination point given a
     * point in the source.  If <code>dstPt</code> is not
     * <code>null</code>, it will be used to hold the return value.
     * Since this is not a geometric operation, the <code>srcPt</code>
     * will equal the <code>dstPt</code>.
     * @param srcPt a <code>Point2D</code> that represents a point
     *        in the source image
     * @param dstPt a <code>Point2D</code>that represents the location
     *        in the destination
     * @return the <code>Point2D</code> in the destination that
     *         corresponds to the specified point in the source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public WritableRaster createCompatibleDestRaster (Raster src) {

    /**
     * Creates a zeroed-destination <code>Raster</code> with the
     * correct size and number of bands, given this source.
     * @param src the <code>Raster</code> to be transformed
     * @return the zeroed-destination <code>Raster</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public BufferedImage createCompatibleDestImage (BufferedImage src,
                                                    ColorModel destCM) {

    /**
     * Creates a zeroed destination image with the correct size and number of
     * bands.  If destCM is <code>null</code>, an appropriate
     * <code>ColorModel</code> will be used.
     * @param src       Source image for the filter operation.
     * @param destCM    the destination's <code>ColorModel</code>, which
     *                  can be <code>null</code>.
     * @return a filtered destination <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final Rectangle2D getBounds2D (Raster src) {

    /**
     * Returns the bounding box of the filtered destination Raster.  Since
     * this is not a geometric operation, the bounding box does not
     * change.
     * @param src the <code>Raster</code> to be filtered
     * @return the bounds of the filtered definition <code>Raster</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final Rectangle2D getBounds2D (BufferedImage src) {

    /**
     * Returns the bounding box of the filtered destination image.  Since
     * this is not a geometric operation, the bounding box does not
     * change.
     * @param src the <code>BufferedImage</code> to be filtered
     * @return the bounds of the filtered definition image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final WritableRaster filter (Raster src, WritableRaster dst) {

    /**
     * Performs a lookup operation on a <code>Raster</code>.
     * If the destination <code>Raster</code> is <code>null</code>,
     * a new <code>Raster</code> will be created.
     * The <code>IllegalArgumentException</code> might be thrown
     * if the source <code>Raster</code> and the destination
     * <code>Raster</code> do not have the same
     * number of bands or if the number of arrays in the
     * <code>LookupTable</code> does not meet the
     * restrictions stated in the class comment above.
     * @param src the source <code>Raster</code> to filter
     * @param dst the destination <code>WritableRaster</code> for the
     *            filtered <code>src</code>
     * @return the filtered <code>WritableRaster</code>.
     * @throws IllegalArgumentException if the source and destinations
     *         rasters do not have the same number of bands, or the
     *         number of arrays in the <code>LookupTable</code> does
     *         not meet the restrictions described in the class comments.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final BufferedImage filter(BufferedImage src, BufferedImage dst) {

    /**
     * Performs a lookup operation on a <code>BufferedImage</code>.
     * If the color model in the source image is not the same as that
     * in the destination image, the pixels will be converted
     * in the destination.  If the destination image is <code>null</code>,
     * a <code>BufferedImage</code> will be created with an appropriate
     * <code>ColorModel</code>.  An <code>IllegalArgumentException</code>
     * might be thrown if the number of arrays in the
     * <code>LookupTable</code> does not meet the restrictions
     * stated in the class comment above, or if the source image
     * has an <code>IndexColorModel</code>.
     * @param src the <code>BufferedImage</code> to be filtered
     * @param dst the <code>BufferedImage</code> in which to
     *            store the results of the filter operation
     * @return the filtered <code>BufferedImage</code>.
     * @throws IllegalArgumentException if the number of arrays in the
     *         <code>LookupTable</code> does not meet the restrictions
     *         described in the class comments, or if the source image
     *         has an <code>IndexColorModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public final LookupTable getTable() {

    /**
     * Returns the <code>LookupTable</code>.
     * @return the <code>LookupTable</code> of this
     *         <code>LookupOp</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
    public LookupOp(LookupTable lookup, RenderingHints hints) {

    /**
     * Constructs a <code>LookupOp</code> object given the lookup
     * table and a <code>RenderingHints</code> object, which might
     * be <code>null</code>.
     * @param lookup the specified <code>LookupTable</code>
     * @param hints the specified <code>RenderingHints</code>,
     *        or <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/LookupOp.java
public class LookupOp implements BufferedImageOp, RasterOp {

/**
 * This class implements a lookup operation from the source
 * to the destination.  The LookupTable object may contain a single array
 * or multiple arrays, subject to the restrictions below.
 * <p>
 * For Rasters, the lookup operates on bands.  The number of
 * lookup arrays may be one, in which case the same array is
 * applied to all bands, or it must equal the number of Source
 * Raster bands.
 * <p>
 * For BufferedImages, the lookup operates on color and alpha components.
 * The number of lookup arrays may be one, in which case the
 * same array is applied to all color (but not alpha) components.
 * Otherwise, the number of lookup arrays may
 * equal the number of Source color components, in which case no
 * lookup of the alpha component (if present) is performed.
 * If neither of these cases apply, the number of lookup arrays
 * must equal the number of Source color components plus alpha components,
 * in which case lookup is performed for all color and alpha components.
 * This allows non-uniform rescaling of multi-band BufferedImages.
 * <p>
 * BufferedImage sources with premultiplied alpha data are treated in the same
 * manner as non-premultiplied images for purposes of the lookup.  That is,
 * the lookup is done per band on the raw data of the BufferedImage source
 * without regard to whether the data is premultiplied.  If a color conversion
 * is required to the destination ColorModel, the premultiplied state of
 * both source and destination will be taken into account for this step.
 * <p>
 * Images with an IndexColorModel cannot be used.
 * <p>
 * If a RenderingHints object is specified in the constructor, the
 * color rendering hint and the dithering hint may be used when color
 * conversion is required.
 * <p>
 * This class allows the Source to be the same as the Destination.
 *
 * @see LookupTable
 * @see java.awt.RenderingHints#KEY_COLOR_RENDERING
 * @see java.awt.RenderingHints#KEY_DITHERING
 */
