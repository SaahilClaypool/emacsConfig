_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int status() {

    /**
     * Returns the status of the pixels.  The ImageObserver flags
     * representing the available pixel information are returned.
     * This method and {@link #getStatus() getStatus} have the
     * same implementation, but <code>getStatus</code> is the
     * preferred method because it conforms to the convention of
     * naming information-retrieval methods with the form
     * "getXXX".
     * @return the bitwise OR of all relevant ImageObserver flags
     * @see ImageObserver
     * @see #getStatus()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized void imageComplete(int status) {

    /**
     * The imageComplete method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param status the status of image loading
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setPixels(int srcX, int srcY, int srcW, int srcH,
                          ColorModel model,
                          int pixels[], int srcOff, int srcScan) {

    /**
     * The setPixels method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param srcX the X coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcY the Y coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcW the width of the area of pixels
     * @param srcH the height of the area of pixels
     * @param model the specified <code>ColorModel</code>
     * @param pixels the array of pixels
     * @param srcOff the offset into the pixels array
     * @param srcScan the distance from one row of pixels to the next
     *        in the pixels array
     * @see #getPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setPixels(int srcX, int srcY, int srcW, int srcH,
                          ColorModel model,
                          byte pixels[], int srcOff, int srcScan) {

    /**
     * The setPixels method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param srcX the X coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcY the Y coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcW the width of the area of pixels
     * @param srcH the height of the area of pixels
     * @param model the specified <code>ColorModel</code>
     * @param pixels the array of pixels
     * @param srcOff the offset into the pixels array
     * @param srcScan the distance from one row of pixels to the next
     *        in the pixels array
     * @see #getPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setColorModel(ColorModel model) {

    /**
     * The setColorModel method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param model the specified <code>ColorModel</code>
     * @see #getColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * The setProperties method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param props the list of properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setHints(int hints) {

    /**
     * The setHints method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param hints a set of hints used to process the pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setDimensions(int width, int height) {

    /**
     * The setDimensions method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param width the width of the dimension
     * @param height the height of the dimension
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized ColorModel getColorModel() {

    /**
     * Get the ColorModel for the pixels stored in the array.  If the
     * PixelGrabber was constructed with an explicit pixel buffer then
     * this method will always return the default RGB ColorModel,
     * otherwise it may return null until the ColorModel used by the
     * ImageProducer is known.
     * Since the PixelGrabber may fall back on accumulating the data
     * in the default RGB ColorModel at any time if the source image
     * uses more than one ColorModel to deliver the data, the ColorModel
     * object returned by this method may change over time until the
     * image grab is complete and may not reflect any of the ColorModel
     * objects that was used by the ImageProducer to deliver the pixels.
     * @return the ColorModel object used for storing the pixels
     * @see #getStatus
     * @see ColorModel#getRGBdefault
     * @see #setColorModel(ColorModel)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized Object getPixels() {

    /**
     * Get the pixel buffer.  If the PixelGrabber was not constructed
     * with an explicit pixel buffer to hold the pixels then this method
     * will return null until the size and format of the image data is
     * known.
     * Since the PixelGrabber may fall back on accumulating the data
     * in the default RGB ColorModel at any time if the source image
     * uses more than one ColorModel to deliver the data, the array
     * object returned by this method may change over time until the
     * image grab is complete.
     * @return either a byte array or an int array
     * @see #getStatus
     * @see #setPixels(int, int, int, int, ColorModel, byte[], int, int)
     * @see #setPixels(int, int, int, int, ColorModel, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int getHeight() {

    /**
     * Get the height of the pixel buffer (after adjusting for image height).
     * If no width was specified for the rectangle of pixels to grab then
     * then this information will only be available after the image has
     * delivered the dimensions.
     * @return the final height used for the pixel buffer or -1 if the height
     * is not yet known
     * @see #getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int getWidth() {

    /**
     * Get the width of the pixel buffer (after adjusting for image width).
     * If no width was specified for the rectangle of pixels to grab then
     * then this information will only be available after the image has
     * delivered the dimensions.
     * @return the final width used for the pixel buffer or -1 if the width
     * is not yet known
     * @see #getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int getStatus() {

    /**
     * Return the status of the pixels.  The ImageObserver flags
     * representing the available pixel information are returned.
     * @return the bitwise OR of all relevant ImageObserver flags
     * @see ImageObserver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized boolean grabPixels(long ms)

    /**
     * Request the Image or ImageProducer to start delivering pixels and
     * wait for all of the pixels in the rectangle of interest to be
     * delivered or until the specified timeout has elapsed.  This method
     * behaves in the following ways, depending on the value of
     * <code>ms</code>:
     * <ul>
     * <li> If {@code ms == 0}, waits until all pixels are delivered
     * <li> If {@code ms > 0}, waits until all pixels are delivered
     * as timeout expires.
     * <li> If {@code ms < 0}, returns <code>true</code> if all pixels
     * are grabbed, <code>false</code> otherwise and does not wait.
     * </ul>
     * @param ms the number of milliseconds to wait for the image pixels
     * to arrive before timing out
     * @return true if the pixels were successfully grabbed, false on
     * abort, error or timeout
     * @exception InterruptedException
     *            Another thread has interrupted this thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public boolean grabPixels() throws InterruptedException {

    /**
     * Request the Image or ImageProducer to start delivering pixels and
     * wait for all of the pixels in the rectangle of interest to be
     * delivered.
     * @return true if the pixels were successfully grabbed, false on
     * abort, error or timeout
     * @exception InterruptedException
     *            Another thread has interrupted this thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized void abortGrabbing() {

    /**
     * Request the PixelGrabber to abort the image fetch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized void startGrabbing() {

    /**
     * Request the PixelGrabber to start fetching the pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public PixelGrabber(Image img, int x, int y, int w, int h,
                        boolean forceRGB)

    /**
     * Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     * section of pixels from the specified image.  The pixels are
     * accumulated in the original ColorModel if the same ColorModel
     * is used for every call to setPixels, otherwise the pixels are
     * accumulated in the default RGB ColorModel.  If the forceRGB
     * parameter is true, then the pixels will be accumulated in the
     * default RGB ColorModel anyway.  A buffer is allocated by the
     * PixelGrabber to hold the pixels in either case.  If {@code (w < 0)} or
     * {@code (h < 0)}, then they will default to the remaining width and
     * height of the source data when that information is delivered.
     * @param img the image to retrieve the image data from
     * @param x the x coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image, relative to the default
     * (unscaled) size of the image
     * @param y the y coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image
     * @param w the width of the rectangle of pixels to retrieve
     * @param h the height of the rectangle of pixels to retrieve
     * @param forceRGB true if the pixels should always be converted to
     * the default RGB ColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public PixelGrabber(ImageProducer ip, int x, int y, int w, int h,
                        int[] pix, int off, int scansize) {

    /**
     * Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     * section of pixels from the image produced by the specified
     * ImageProducer into the given array.
     * The pixels are stored into the array in the default RGB ColorModel.
     * The RGB data for pixel (i, j) where (i, j) is inside the rectangle
     * (x, y, w, h) is stored in the array at
     * <tt>pix[(j - y) * scansize + (i - x) + off]</tt>.
     * @param ip the <code>ImageProducer</code> that produces the
     * image from which to retrieve pixels
     * @param x the x coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image, relative to the default
     * (unscaled) size of the image
     * @param y the y coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image
     * @param w the width of the rectangle of pixels to retrieve
     * @param h the height of the rectangle of pixels to retrieve
     * @param pix the array of integers which are to be used to hold the
     * RGB pixels retrieved from the image
     * @param off the offset into the array of where to store the first pixel
     * @param scansize the distance from one row of pixels to the next in
     * the array
     * @see ColorModel#getRGBdefault
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public PixelGrabber(Image img, int x, int y, int w, int h,
                        int[] pix, int off, int scansize) {

    /**
     * Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     * section of pixels from the specified image into the given array.
     * The pixels are stored into the array in the default RGB ColorModel.
     * The RGB data for pixel (i, j) where (i, j) is inside the rectangle
     * (x, y, w, h) is stored in the array at
     * <tt>pix[(j - y) * scansize + (i - x) + off]</tt>.
     * @see ColorModel#getRGBdefault
     * @param img the image to retrieve pixels from
     * @param x the x coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image, relative to the default
     * (unscaled) size of the image
     * @param y the y coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image
     * @param w the width of the rectangle of pixels to retrieve
     * @param h the height of the rectangle of pixels to retrieve
     * @param pix the array of integers which are to be used to hold the
     * RGB pixels retrieved from the image
     * @param off the offset into the array of where to store the first pixel
     * @param scansize the distance from one row of pixels to the next in
     * the array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
public class PixelGrabber implements ImageConsumer {

/**
 * The PixelGrabber class implements an ImageConsumer which can be attached
 * to an Image or ImageProducer object to retrieve a subset of the pixels
 * in that image.  Here is an example:
 * <pre>{@code
 *
 * public void handlesinglepixel(int x, int y, int pixel) {
 *      int alpha = (pixel >> 24) & 0xff;
 *      int red   = (pixel >> 16) & 0xff;
 *      int green = (pixel >>  8) & 0xff;
 *      int blue  = (pixel      ) & 0xff;
 *      // Deal with the pixel as necessary...
 * }
 *
 * public void handlepixels(Image img, int x, int y, int w, int h) {
 *      int[] pixels = new int[w * h];
 *      PixelGrabber pg = new PixelGrabber(img, x, y, w, h, pixels, 0, w);
 *      try {
 *          pg.grabPixels();
 *      } catch (InterruptedException e) {
 *          System.err.println("interrupted waiting for pixels!");
 *          return;
 *      }
 *      if ((pg.getStatus() & ImageObserver.ABORT) != 0) {
 *          System.err.println("image fetch aborted or errored");
 *          return;
 *      }
 *      for (int j = 0; j < h; j++) {
 *          for (int i = 0; i < w; i++) {
 *              handlesinglepixel(x+i, y+j, pixels[j * w + i]);
 *          }
 *      }
 * }
 *
 * }</pre>
 *
 * @see ColorModel#getRGBdefault
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int status() {

    /**
     * Returns the status of the pixels.  The ImageObserver flags
     * representing the available pixel information are returned.
     * This method and {@link #getStatus() getStatus} have the
     * same implementation, but <code>getStatus</code> is the
     * preferred method because it conforms to the convention of
     * naming information-retrieval methods with the form
     * "getXXX".
     * @return the bitwise OR of all relevant ImageObserver flags
     * @see ImageObserver
     * @see #getStatus()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized void imageComplete(int status) {

    /**
     * The imageComplete method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param status the status of image loading
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setPixels(int srcX, int srcY, int srcW, int srcH,
                          ColorModel model,
                          int pixels[], int srcOff, int srcScan) {

    /**
     * The setPixels method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param srcX the X coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcY the Y coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcW the width of the area of pixels
     * @param srcH the height of the area of pixels
     * @param model the specified <code>ColorModel</code>
     * @param pixels the array of pixels
     * @param srcOff the offset into the pixels array
     * @param srcScan the distance from one row of pixels to the next
     *        in the pixels array
     * @see #getPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setPixels(int srcX, int srcY, int srcW, int srcH,
                          ColorModel model,
                          byte pixels[], int srcOff, int srcScan) {

    /**
     * The setPixels method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param srcX the X coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcY the Y coordinate of the upper-left corner
     *        of the area of pixels to be set
     * @param srcW the width of the area of pixels
     * @param srcH the height of the area of pixels
     * @param model the specified <code>ColorModel</code>
     * @param pixels the array of pixels
     * @param srcOff the offset into the pixels array
     * @param srcScan the distance from one row of pixels to the next
     *        in the pixels array
     * @see #getPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setColorModel(ColorModel model) {

    /**
     * The setColorModel method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param model the specified <code>ColorModel</code>
     * @see #getColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * The setProperties method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param props the list of properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setHints(int hints) {

    /**
     * The setHints method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param hints a set of hints used to process the pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public void setDimensions(int width, int height) {

    /**
     * The setDimensions method is part of the ImageConsumer API which
     * this class must implement to retrieve the pixels.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being grabbed.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param width the width of the dimension
     * @param height the height of the dimension
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized ColorModel getColorModel() {

    /**
     * Get the ColorModel for the pixels stored in the array.  If the
     * PixelGrabber was constructed with an explicit pixel buffer then
     * this method will always return the default RGB ColorModel,
     * otherwise it may return null until the ColorModel used by the
     * ImageProducer is known.
     * Since the PixelGrabber may fall back on accumulating the data
     * in the default RGB ColorModel at any time if the source image
     * uses more than one ColorModel to deliver the data, the ColorModel
     * object returned by this method may change over time until the
     * image grab is complete and may not reflect any of the ColorModel
     * objects that was used by the ImageProducer to deliver the pixels.
     * @return the ColorModel object used for storing the pixels
     * @see #getStatus
     * @see ColorModel#getRGBdefault
     * @see #setColorModel(ColorModel)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized Object getPixels() {

    /**
     * Get the pixel buffer.  If the PixelGrabber was not constructed
     * with an explicit pixel buffer to hold the pixels then this method
     * will return null until the size and format of the image data is
     * known.
     * Since the PixelGrabber may fall back on accumulating the data
     * in the default RGB ColorModel at any time if the source image
     * uses more than one ColorModel to deliver the data, the array
     * object returned by this method may change over time until the
     * image grab is complete.
     * @return either a byte array or an int array
     * @see #getStatus
     * @see #setPixels(int, int, int, int, ColorModel, byte[], int, int)
     * @see #setPixels(int, int, int, int, ColorModel, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int getHeight() {

    /**
     * Get the height of the pixel buffer (after adjusting for image height).
     * If no width was specified for the rectangle of pixels to grab then
     * then this information will only be available after the image has
     * delivered the dimensions.
     * @return the final height used for the pixel buffer or -1 if the height
     * is not yet known
     * @see #getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int getWidth() {

    /**
     * Get the width of the pixel buffer (after adjusting for image width).
     * If no width was specified for the rectangle of pixels to grab then
     * then this information will only be available after the image has
     * delivered the dimensions.
     * @return the final width used for the pixel buffer or -1 if the width
     * is not yet known
     * @see #getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized int getStatus() {

    /**
     * Return the status of the pixels.  The ImageObserver flags
     * representing the available pixel information are returned.
     * @return the bitwise OR of all relevant ImageObserver flags
     * @see ImageObserver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized boolean grabPixels(long ms)

    /**
     * Request the Image or ImageProducer to start delivering pixels and
     * wait for all of the pixels in the rectangle of interest to be
     * delivered or until the specified timeout has elapsed.  This method
     * behaves in the following ways, depending on the value of
     * <code>ms</code>:
     * <ul>
     * <li> If {@code ms == 0}, waits until all pixels are delivered
     * <li> If {@code ms > 0}, waits until all pixels are delivered
     * as timeout expires.
     * <li> If {@code ms < 0}, returns <code>true</code> if all pixels
     * are grabbed, <code>false</code> otherwise and does not wait.
     * </ul>
     * @param ms the number of milliseconds to wait for the image pixels
     * to arrive before timing out
     * @return true if the pixels were successfully grabbed, false on
     * abort, error or timeout
     * @exception InterruptedException
     *            Another thread has interrupted this thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public boolean grabPixels() throws InterruptedException {

    /**
     * Request the Image or ImageProducer to start delivering pixels and
     * wait for all of the pixels in the rectangle of interest to be
     * delivered.
     * @return true if the pixels were successfully grabbed, false on
     * abort, error or timeout
     * @exception InterruptedException
     *            Another thread has interrupted this thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized void abortGrabbing() {

    /**
     * Request the PixelGrabber to abort the image fetch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public synchronized void startGrabbing() {

    /**
     * Request the PixelGrabber to start fetching the pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public PixelGrabber(Image img, int x, int y, int w, int h,
                        boolean forceRGB)

    /**
     * Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     * section of pixels from the specified image.  The pixels are
     * accumulated in the original ColorModel if the same ColorModel
     * is used for every call to setPixels, otherwise the pixels are
     * accumulated in the default RGB ColorModel.  If the forceRGB
     * parameter is true, then the pixels will be accumulated in the
     * default RGB ColorModel anyway.  A buffer is allocated by the
     * PixelGrabber to hold the pixels in either case.  If {@code (w < 0)} or
     * {@code (h < 0)}, then they will default to the remaining width and
     * height of the source data when that information is delivered.
     * @param img the image to retrieve the image data from
     * @param x the x coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image, relative to the default
     * (unscaled) size of the image
     * @param y the y coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image
     * @param w the width of the rectangle of pixels to retrieve
     * @param h the height of the rectangle of pixels to retrieve
     * @param forceRGB true if the pixels should always be converted to
     * the default RGB ColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public PixelGrabber(ImageProducer ip, int x, int y, int w, int h,
                        int[] pix, int off, int scansize) {

    /**
     * Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     * section of pixels from the image produced by the specified
     * ImageProducer into the given array.
     * The pixels are stored into the array in the default RGB ColorModel.
     * The RGB data for pixel (i, j) where (i, j) is inside the rectangle
     * (x, y, w, h) is stored in the array at
     * <tt>pix[(j - y) * scansize + (i - x) + off]</tt>.
     * @param ip the <code>ImageProducer</code> that produces the
     * image from which to retrieve pixels
     * @param x the x coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image, relative to the default
     * (unscaled) size of the image
     * @param y the y coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image
     * @param w the width of the rectangle of pixels to retrieve
     * @param h the height of the rectangle of pixels to retrieve
     * @param pix the array of integers which are to be used to hold the
     * RGB pixels retrieved from the image
     * @param off the offset into the array of where to store the first pixel
     * @param scansize the distance from one row of pixels to the next in
     * the array
     * @see ColorModel#getRGBdefault
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
    public PixelGrabber(Image img, int x, int y, int w, int h,
                        int[] pix, int off, int scansize) {

    /**
     * Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     * section of pixels from the specified image into the given array.
     * The pixels are stored into the array in the default RGB ColorModel.
     * The RGB data for pixel (i, j) where (i, j) is inside the rectangle
     * (x, y, w, h) is stored in the array at
     * <tt>pix[(j - y) * scansize + (i - x) + off]</tt>.
     * @see ColorModel#getRGBdefault
     * @param img the image to retrieve pixels from
     * @param x the x coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image, relative to the default
     * (unscaled) size of the image
     * @param y the y coordinate of the upper left corner of the rectangle
     * of pixels to retrieve from the image
     * @param w the width of the rectangle of pixels to retrieve
     * @param h the height of the rectangle of pixels to retrieve
     * @param pix the array of integers which are to be used to hold the
     * RGB pixels retrieved from the image
     * @param off the offset into the array of where to store the first pixel
     * @param scansize the distance from one row of pixels to the next in
     * the array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/PixelGrabber.java
public class PixelGrabber implements ImageConsumer {

/**
 * The PixelGrabber class implements an ImageConsumer which can be attached
 * to an Image or ImageProducer object to retrieve a subset of the pixels
 * in that image.  Here is an example:
 * <pre>{@code
 *
 * public void handlesinglepixel(int x, int y, int pixel) {
 *      int alpha = (pixel >> 24) & 0xff;
 *      int red   = (pixel >> 16) & 0xff;
 *      int green = (pixel >>  8) & 0xff;
 *      int blue  = (pixel      ) & 0xff;
 *      // Deal with the pixel as necessary...
 * }
 *
 * public void handlepixels(Image img, int x, int y, int w, int h) {
 *      int[] pixels = new int[w * h];
 *      PixelGrabber pg = new PixelGrabber(img, x, y, w, h, pixels, 0, w);
 *      try {
 *          pg.grabPixels();
 *      } catch (InterruptedException e) {
 *          System.err.println("interrupted waiting for pixels!");
 *          return;
 *      }
 *      if ((pg.getStatus() & ImageObserver.ABORT) != 0) {
 *          System.err.println("image fetch aborted or errored");
 *          return;
 *      }
 *      for (int j = 0; j < h; j++) {
 *          for (int i = 0; i < w; i++) {
 *              handlesinglepixel(x+i, y+j, pixels[j * w + i]);
 *          }
 *      }
 * }
 *
 * }</pre>
 *
 * @see ColorModel#getRGBdefault
 *
 * @author      Jim Graham
 */
