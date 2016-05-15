_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void dispose() {

    /**
     * Allows any resources held by this object to be released.  The
     * result of calling any other method (other than
     * <code>finalize</code>) subsequent to a call to this method
     * is undefined.
     *
     * <p>It is important for applications to call this method when they
     * know they will no longer be using this <code>ImageWriter</code>.
     * Otherwise, the writer may continue to hold on to resources
     * indefinitely.
     *
     * <p>The default implementation of this method in the superclass does
     * nothing.  Subclass implementations should ensure that all resources,
     * especially native resources, are released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void reset() {

    /**
     * Restores the <code>ImageWriter</code> to its initial state.
     *
     * <p> The default implementation calls
     * <code>setOutput(null)</code>, <code>setLocale(null)</code>,
     * <code>removeAllIIOWriteWarningListeners()</code>,
     * <code>removeAllIIOWriteProgressListeners()</code>, and
     * <code>clearAbortRequest</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
            ClassLoader loader = (ClassLoader)

            /**
             * If an applet supplies an implementation of ImageWriter and
             * resource bundles, then the resource bundle will need to be
             * accessed via the applet class loader. So first try the context
             * class loader to locate the resource bundle.
             * If that throws MissingResourceException, then try the
             * system class loader.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processWarningOccurred(int imageIndex,
                                          String baseName,
                                          String keyword) {

    /**
     * Broadcasts a localized warning message to all registered
     * <code>IIOWriteWarningListener</code>s by calling their
     * <code>warningOccurred</code> method with a string taken
     * from a <code>ResourceBundle</code>.  Subclasses may use this
     * method as a convenience.
     *
     * @param imageIndex the index of the image on which the warning
     * occurred.
     * @param baseName the base name of a set of
     * <code>ResourceBundle</code>s containing localized warning
     * messages.
     * @param keyword the keyword used to index the warning message
     * within the set of <code>ResourceBundle</code>s.
     *
     * @exception IllegalArgumentException if <code>baseName</code>
     * is <code>null</code>.
     * @exception IllegalArgumentException if <code>keyword</code>
     * is <code>null</code>.
     * @exception IllegalArgumentException if no appropriate
     * <code>ResourceBundle</code> may be located.
     * @exception IllegalArgumentException if the named resource is
     * not found in the located <code>ResourceBundle</code>.
     * @exception IllegalArgumentException if the object retrieved
     * from the <code>ResourceBundle</code> is not a
     * <code>String</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processWarningOccurred(int imageIndex,
                                          String warning) {

    /**
     * Broadcasts a warning message to all registered
     * <code>IIOWriteWarningListener</code>s by calling their
     * <code>warningOccurred</code> method.  Subclasses may use this
     * method as a convenience.
     *
     * @param imageIndex the index of the image on which the warning
     * occurred.
     * @param warning the warning message.
     *
     * @exception IllegalArgumentException if <code>warning</code>
     * is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processWriteAborted() {

    /**
     * Broadcasts that the write has been aborted to all registered
     * <code>IIOWriteProgressListener</code>s by calling their
     * <code>writeAborted</code> method.  Subclasses may use this
     * method as a convenience.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processThumbnailComplete() {

    /**
     * Broadcasts the completion of a thumbnail write to all registered
     * <code>IIOWriteProgressListener</code>s by calling their
     * <code>thumbnailComplete</code> method.  Subclasses may use this
     * method as a convenience.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processThumbnailProgress(float percentageDone) {

    /**
     * Broadcasts the current percentage of thumbnail completion to
     * all registered <code>IIOWriteProgressListener</code>s by calling
     * their <code>thumbnailProgress</code> method.  Subclasses may
     * use this method as a convenience.
     *
     * @param percentageDone the current percentage of completion,
     * as a <code>float</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processThumbnailStarted(int imageIndex,
                                           int thumbnailIndex) {

    /**
     * Broadcasts the start of a thumbnail write to all registered
     * <code>IIOWriteProgressListener</code>s by calling their
     * <code>thumbnailStarted</code> method.  Subclasses may use this
     * method as a convenience.
     *
     * @param imageIndex the index of the image associated with the
     * thumbnail.
     * @param thumbnailIndex the index of the thumbnail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processImageComplete() {

    /**
     * Broadcasts the completion of an image write to all registered
     * <code>IIOWriteProgressListener</code>s by calling their
     * <code>imageComplete</code> method.  Subclasses may use this
     * method as a convenience.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processImageProgress(float percentageDone) {

    /**
     * Broadcasts the current percentage of image completion to all
     * registered <code>IIOWriteProgressListener</code>s by calling
     * their <code>imageProgress</code> method.  Subclasses may use
     * this method as a convenience.
     *
     * @param percentageDone the current percentage of completion,
     * as a <code>float</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected void processImageStarted(int imageIndex) {

    /**
     * Broadcasts the start of an image write to all registered
     * <code>IIOWriteProgressListener</code>s by calling their
     * <code>imageStarted</code> method.  Subclasses may use this
     * method as a convenience.
     *
     * @param imageIndex the index of the image about to be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void removeAllIIOWriteProgressListeners() {

    /**
     * Removes all currently registered
     * <code>IIOWriteProgressListener</code> objects.
     *
     * <p> The default implementation sets the
     * <code>progressListeners</code> instance variable to
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void

    /**
     * Removes an <code>IIOWriteProgressListener</code> from the list
     * of registered progress listeners.  If the listener was not
     * previously registered, or if <code>listener</code> is
     * <code>null</code>, no exception will be thrown and no action
     * will be taken.
     *
     * @param listener an <code>IIOWriteProgressListener</code> to be
     * deregistered.
     *
     * @see #addIIOWriteProgressListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void

    /**
     * Adds an <code>IIOWriteProgressListener</code> to the list of
     * registered progress listeners.  If <code>listener</code> is
     * <code>null</code>, no exception will be thrown and no action
     * will be taken.
     *
     * @param listener an <code>IIOWriteProgressListener</code> to be
     * registered.
     *
     * @see #removeIIOWriteProgressListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void removeAllIIOWriteWarningListeners() {

    /**
     * Removes all currently registered
     * <code>IIOWriteWarningListener</code> objects.
     *
     * <p> The default implementation sets the
     * <code>warningListeners</code> and <code>warningLocales</code>
     * instance variables to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public

    /**
     * Removes an <code>IIOWriteWarningListener</code> from the list
     * of registered warning listeners.  If the listener was not
     * previously registered, or if <code>listener</code> is
     * <code>null</code>, no exception will be thrown and no action
     * will be taken.
     *
     * @param listener an <code>IIOWriteWarningListener</code> to be
     * deregistered.
     *
     * @see #addIIOWriteWarningListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void addIIOWriteWarningListener(IIOWriteWarningListener listener) {

    /**
     * Adds an <code>IIOWriteWarningListener</code> to the list of
     * registered warning listeners.  If <code>listener</code> is
     * <code>null</code>, no exception will be thrown and no action
     * will be taken.  Messages sent to the given listener will be
     * localized, if possible, to match the current
     * <code>Locale</code>.  If no <code>Locale</code> has been set,
     * warning messages may be localized as the writer sees fit.
     *
     * @param listener an <code>IIOWriteWarningListener</code> to be
     * registered.
     *
     * @see #removeIIOWriteWarningListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected synchronized void clearAbortRequest() {

    /**
     * Clears any previous abort request.  After this method has been
     * called, <code>abortRequested</code> will return
     * <code>false</code>.
     *
     * @see #abort
     * @see #abortRequested
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected synchronized boolean abortRequested() {

    /**
     * Returns <code>true</code> if a request to abort the current
     * write operation has been made since the writer was instantiated or
     * <code>clearAbortRequest</code> was called.
     *
     * @return <code>true</code> if the current write operation should
     * be aborted.
     *
     * @see #abort
     * @see #clearAbortRequest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public synchronized void abort() {

    /**
     * Requests that any current write operation be aborted.  The
     * contents of the output following the abort will be undefined.
     *
     * <p> Writers should call <code>clearAbortRequest</code> at the
     * beginning of each write operation, and poll the value of
     * <code>abortRequested</code> regularly during the write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void endReplacePixels() throws IOException {

    /**
     * Terminates a sequence of calls to <code>replacePixels</code>.
     *
     * <p> If <code>canReplacePixels</code> returns
     * <code>false</code>, and
     * <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canReplacePixels(imageIndex)</code> returns
     * <code>false</code>.
     * @exception IllegalStateException if there is no previous call
     * to <code>prepareReplacePixels</code> without a matching call to
     * <code>endReplacePixels</code>.
     * @exception IOException if an I/O error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void replacePixels(Raster raster, ImageWriteParam param)

    /**
     * Replaces a portion of an image already present in the output
     * with a portion of the given <code>Raster</code>.  The image
     * data must match, or be convertible to, the image layout of the
     * existing image.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * to control the writing process.  If <code>param</code> is
     * <code>null</code>, a default write param will be used.
     *
     * <p> The destination region is specified in the
     * <code>param</code> argument, and will be clipped to the image
     * boundaries and the region supplied to
     * <code>prepareReplacePixels</code>.  At least one pixel of the
     * source must not be clipped, or an exception is thrown.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> This method may only be called after a call to
     * <code>prepareReplacePixels</code>, or else an
     * <code>IllegalStateException</code> will be thrown.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param raster a <code>Raster</code> containing source
     * pixels.
     * @param param an <code>ImageWriteParam</code>, or
     * <code>null</code> to use a default
     * <code>ImageWriteParam</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canReplacePixels(imageIndex)</code> returns
     * <code>false</code>.
     * @exception IllegalStateException if there is no previous call to
     * <code>prepareReplacePixels</code> without a matching call to
     * <code>endReplacePixels</code>.
     * @exception UnsupportedOperationException if
     * <code>canWriteRasters</code> returns <code>false</code>.
     * @exception IllegalArgumentException if any of the following are true:
     * <ul>
     * <li> <code>raster</code> is <code>null</code>.
     * <li> <code>param</code> is <code>null</code>.
     * <li> the intersected region does not contain at least one pixel.
     * <li> the layout of <code>raster</code> does not match, or this
     * writer cannot convert it to, the existing image layout.
     * </ul>
     * @exception IOException if an I/O error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void replacePixels(RenderedImage image, ImageWriteParam param)

    /**
     * Replaces a portion of an image already present in the output
     * with a portion of the given image.  The image data must match,
     * or be convertible to, the image layout of the existing image.
     *
     * <p> The destination region is specified in the
     * <code>param</code> argument, and will be clipped to the image
     * boundaries and the region supplied to
     * <code>prepareReplacePixels</code>.  At least one pixel of the
     * source must not be clipped, or an exception is thrown.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * to control the writing process.  If <code>param</code> is
     * <code>null</code>, a default write param will be used.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> This method may only be called after a call to
     * <code>prepareReplacePixels</code>, or else an
     * <code>IllegalStateException</code> will be thrown.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param image a <code>RenderedImage</code> containing source
     * pixels.
     * @param param an <code>ImageWriteParam</code>, or
     * <code>null</code> to use a default
     * <code>ImageWriteParam</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canReplacePixels(imageIndex)</code> returns
     * <code>false</code>.
     * @exception IllegalStateException if there is no previous call to
     * <code>prepareReplacePixels</code> without a matching call to
     * <code>endReplacePixels</code>.
     * @exception IllegalArgumentException if any of the following are true:
     * <ul>
     * <li> <code>image</code> is <code>null</code>.
     * <li> <code>param</code> is <code>null</code>.
     * <li> the intersected region does not contain at least one pixel.
     * <li> the layout of <code>image</code> does not match, or this
     * writer cannot convert it to, the existing image layout.
     * </ul>
     * @exception IOException if an I/O error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void prepareReplacePixels(int imageIndex,
                                     Rectangle region)  throws IOException {

    /**
     * Prepares the writer to handle a series of calls to the
     * <code>replacePixels</code> methods.  The affected pixel area
     * will be clipped against the supplied
     *
     * <p> If <code>canReplacePixels</code> returns
     * <code>false</code>, and
     * <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param imageIndex the index of the image whose pixels are to be
     * replaced.
     * @param region a <code>Rectangle</code> that will be used to clip
     * future pixel regions.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canReplacePixels(imageIndex)</code> returns
     * <code>false</code>.
     * @exception IndexOutOfBoundsException if <code>imageIndex</code>
     * is less than 0 or greater than the largest available index.
     * @exception IllegalStateException if there is a previous call to
     * <code>prepareReplacePixels</code> without a matching call to
     * <code>endReplacePixels</code> (<i>i.e.</i>, nesting is not
     * allowed).
     * @exception IllegalArgumentException if <code>region</code> is
     * <code>null</code> or has a width or height less than 1.
     * @exception IOException if an I/O error occurs during the
     * preparation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canReplacePixels(int imageIndex) throws IOException {

    /**
     * Returns <code>true</code> if the writer allows pixels of the
     * given image to be replaced using the <code>replacePixels</code>
     * methods.
     *
     * <p> A writer that does not support any pixel replacement may
     * return <code>false</code> without performing bounds checking on
     * the index.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise returns <code>false</code>
     * without checking the value of <code>imageIndex</code>.
     *
     * @param imageIndex the index of the image whose pixels are to be
     * replaced.
     *
     * @return <code>true</code> if the pixels of the given
     * image can be replaced.
     *
     * @exception IllegalStateException if the output has not been
     * set.
     * @exception IndexOutOfBoundsException if the writer supports
     * pixel replacement in general, but <code>imageIndex</code> is
     * less than 0 or greater than the largest available index.
     * @exception IOException if an I/O error occurs during the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void endInsertEmpty() throws IOException {

    /**
     * Completes the insertion of a new image that was begun with a
     * prior call to <code>prepareInsertEmpty</code>.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canInsertEmpty(imageIndex)</code> returns
     * <code>false</code>.
     * @exception IllegalStateException if a previous call to
     * <code>prepareInsertEmpty</code> without a corresponding call to
     * <code>endInsertEmpty</code> has not been made.
     * @exception IllegalStateException if a previous call to
     * <code>prepareWriteEmpty</code> without a corresponding call to
     * <code>endWriteEmpty</code> has been made.
     * @exception IllegalStateException if a call to
     * <code>prepareReplacePixels</code> has been made without a
     * matching call to <code>endReplacePixels</code>.
     * @exception IOException if an I/O error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void prepareInsertEmpty(int imageIndex,
                                   ImageTypeSpecifier imageType,
                                   int width, int height,
                                   IIOMetadata imageMetadata,
                                   List<? extends BufferedImage> thumbnails,
                                   ImageWriteParam param) throws IOException {

    /**
     * Begins the insertion of a new image with undefined pixel values
     * into an existing image stream.  Existing images with an index
     * greater than <code>imageIndex</code> are preserved, and their
     * indices are each increased by 1.  A value for
     * <code>imageIndex</code> of -1 may be used to signify an index
     * one larger than the previous largest index; that is, it will
     * cause the image to be logically appended to the end of the
     * sequence.  If the output is an <code>ImageOutputStream</code>,
     * the entirety of the stream must be both readable and writeable.
     *
     * <p> The image contents may be
     * supplied later using the <code>replacePixels</code> method.
     * The insertion is not complete until a call to
     * <code>endInsertEmpty</code> occurs.  Calls to
     * <code>prepareReplacePixels</code>, <code>replacePixels</code>,
     * and <code>endReplacePixels</code> may occur between calls to
     * <code>prepareInsertEmpty</code> and
     * <code>endInsertEmpty</code>.  However, calls to
     * <code>prepareInsertEmpty</code> cannot be nested, and calls to
     * <code>prepareWriteEmpty</code> and
     * <code>prepareInsertEmpty</code> may not be interspersed.
     *
     * <p> If <code>canInsertEmpty(imageIndex)</code> returns
     * <code>false</code>, an
     * <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * to control the writing process.  If <code>param</code> is
     * <code>null</code>, a default write param will be used.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param imageIndex the index at which to write the image.
     * @param imageType an <code>ImageTypeSpecifier</code> describing
     * the layout of the image.
     * @param width the width of the image.
     * @param height the height of the image.
     * @param imageMetadata an <code>IIOMetadata</code> object
     * representing image metadata, or <code>null</code>.
     * @param thumbnails a <code>List</code> of
     * <code>BufferedImage</code> thumbnails for this image, or
     * <code>null</code>.
     * @param param an <code>ImageWriteParam</code>, or
     * <code>null</code> to use a default
     * <code>ImageWriteParam</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canInsertEmpty(imageIndex)</code> returns
     * <code>false</code>.
     * @exception IndexOutOfBoundsException if <code>imageIndex</code>
     * is less than -1 or greater than the largest available index.
     * @exception IllegalStateException if a previous call to
     * <code>prepareInsertEmpty</code> has been made without a
     * corresponding call to <code>endInsertEmpty</code>.
     * @exception IllegalStateException if a previous call to
     * <code>prepareWriteEmpty</code> has been made without a
     * corresponding call to <code>endWriteEmpty</code>.
     * @exception IllegalArgumentException if <code>imageType</code>
     * is <code>null</code> or <code>thumbnails</code> contains
     * <code>null</code> references or objects other than
     * <code>BufferedImage</code>s.
     * @exception IllegalArgumentException if width or height are less
     * than 1.
     * @exception IOException if an I/O error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canInsertEmpty(int imageIndex) throws IOException {

    /**
     * Returns <code>true</code> if the writer supports the insertion
     * of a new, empty image at the given index.  The pixel values of
     * the image are undefined, and may be specified in pieces using
     * the <code>replacePixels</code> methods.  Existing images with
     * indices greater than or equal to the insertion index will have
     * their indices increased by 1.  A value for
     * <code>imageIndex</code> of <code>-1</code> may be used to
     * signify an index one larger than the current largest index.
     *
     * <p> A writer that does not support insertion of empty images
     * may return <code>false</code> without performing bounds
     * checking on the index.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise returns <code>false</code>
     * without checking the value of <code>imageIndex</code>.
     *
     * @param imageIndex the index at which the image is to be
     * inserted.
     *
     * @return <code>true</code> if an empty image may be inserted at
     * the given index.
     *
     * @exception IllegalStateException if the output has not been
     * set.
     * @exception IndexOutOfBoundsException if the writer supports
     * empty image insertion in general, but <code>imageIndex</code>
     * is less than -1 or greater than the largest available index.
     * @exception IOException if an I/O error occurs during the
     * query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void endWriteEmpty() throws IOException {

    /**
     * Completes the writing of a new image that was begun with a
     * prior call to <code>prepareWriteEmpty</code>.
     *
     * <p> If <code>canWriteEmpty()</code> returns <code>false</code>,
     * an <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canWriteEmpty(imageIndex)</code> returns
     * <code>false</code>.
     * @exception IllegalStateException if a previous call to
     * <code>prepareWriteEmpty</code> without a corresponding call to
     * <code>endWriteEmpty</code> has not been made.
     * @exception IllegalStateException if a previous call to
     * <code>prepareInsertEmpty</code> without a corresponding call to
     * <code>endInsertEmpty</code> has been made.
     * @exception IllegalStateException if a call to
     * <code>prepareReiplacePixels</code> has been made without a
     * matching call to <code>endReplacePixels</code>.
     * @exception IOException if an I/O error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void prepareWriteEmpty(IIOMetadata streamMetadata,
                                  ImageTypeSpecifier imageType,
                                  int width, int height,
                                  IIOMetadata imageMetadata,
                                  List<? extends BufferedImage> thumbnails,
                                  ImageWriteParam param) throws IOException {

    /**
     * Begins the writing of a complete image stream, consisting of a
     * single image with undefined pixel values and associated
     * metadata and thumbnails, to the output.  The pixel values will
     * be defined by future calls to the <code>replacePixels</code>
     * methods.  If the output is an <code>ImageOutputStream</code>,
     * its existing contents prior to the current seek position are
     * not affected, and need not be readable or writable.
     *
     * <p> The writing is not complete until a call to
     * <code>endWriteEmpty</code> occurs.  Calls to
     * <code>prepareReplacePixels</code>, <code>replacePixels</code>,
     * and <code>endReplacePixels</code> may occur between calls to
     * <code>prepareWriteEmpty</code> and <code>endWriteEmpty</code>.
     * However, calls to <code>prepareWriteEmpty</code> cannot be
     * nested, and calls to <code>prepareWriteEmpty</code> and
     * <code>prepareInsertEmpty</code> may not be interspersed.
     *
     * <p> If <code>canWriteEmpty</code> returns <code>false</code>,
     * an <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * to control the writing process.  If <code>param</code> is
     * <code>null</code>, a default write param will be used.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param streamMetadata an <code>IIOMetadata</code> object representing
     * stream metadata, or <code>null</code> to use default values.
     * @param imageType an <code>ImageTypeSpecifier</code> describing
     * the layout of the image.
     * @param width the width of the image.
     * @param height the height of the image.
     * @param imageMetadata an <code>IIOMetadata</code> object
     * representing image metadata, or <code>null</code>.
     * @param thumbnails a <code>List</code> of
     * <code>BufferedImage</code> thumbnails for this image, or
     * <code>null</code>.
     * @param param an <code>ImageWriteParam</code>, or
     * <code>null</code> to use a default
     * <code>ImageWriteParam</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canWriteEmpty</code> returns <code>false</code>.
     * @exception IllegalStateException if a previous call to
     * <code>prepareWriteEmpty</code> has been made without a
     * corresponding call to <code>endWriteEmpty</code>.
     * @exception IllegalStateException if a previous call to
     * <code>prepareInsertEmpty</code> has been made without a
     * corresponding call to <code>endInsertEmpty</code>.
     * @exception IllegalArgumentException if <code>imageType</code>
     * is <code>null</code> or <code>thumbnails</code> contains
     * <code>null</code> references or objects other than
     * <code>BufferedImage</code>s.
     * @exception IllegalArgumentException if width or height are less
     * than 1.
     * @exception IOException if an I/O error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canWriteEmpty() throws IOException {

    /**
     * Returns <code>true</code> if the writer supports the writing of
     * a complete image stream consisting of a single image with
     * undefined pixel values and associated metadata and thumbnails
     * to the output.  The pixel values may be defined by future
     * calls to the <code>replacePixels</code> methods.  If the output
     * is an <code>ImageOutputStream</code>, its existing contents
     * prior to the current seek position are not affected, and need
     * not be readable or writable.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise returns <code>false</code>.
     *
     * @return <code>true</code> if the writing of complete image
     * stream with contents to be defined later is supported.
     *
     * @exception IllegalStateException if the output has not been
     * set.
     * @exception IOException if an I/O error occurs during the
     * query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void removeImage(int imageIndex) throws IOException {

    /**
     * Removes an image from the stream.
     *
     * <p> If <code>canRemoveImage(imageIndex)</code> returns false,
     * an <code>UnsupportedOperationException</code>will be thrown.
     *
     * <p> The removal may or may not cause a reduction in the actual
     * file size.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param imageIndex the index of the image to be removed.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canRemoveImage(imageIndex)</code> returns <code>false</code>.
     * @exception IndexOutOfBoundsException if <code>imageIndex</code>
     * is less than 0 or greater than the largest available index.
     * @exception IOException if an I/O error occurs during the
     * removal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canRemoveImage(int imageIndex) throws IOException {

    /**
     * Returns <code>true</code> if the writer supports the removal
     * of an existing image at the given index.  Existing images with
     * indices greater than the insertion index will have
     * their indices decreased by 1.
     *
     * <p> A writer that does not support any image removal may
     * return <code>false</code> without performing bounds checking on
     * the index.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise returns <code>false</code>
     * without checking the value of <code>imageIndex</code>.
     *
     * @param imageIndex the index of the image to be removed.
     *
     * @return <code>true</code> if it is possible to remove the given
     * image.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception IndexOutOfBoundsException if the writer supports
     * image removal in general, but <code>imageIndex</code> is less
     * than 0 or greater than the largest available index.
     * @exception IOException if an I/O error occurs during the
     * query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void writeInsert(int imageIndex,
                            IIOImage image,
                            ImageWriteParam param) throws IOException {

    /**
     * Inserts a new image into an existing image stream.  Existing
     * images with an index greater than <code>imageIndex</code> are
     * preserved, and their indices are each increased by 1.  A value
     * for <code>imageIndex</code> of -1 may be used to signify an
     * index one larger than the previous largest index; that is, it
     * will cause the image to be logically appended to the end of the
     * sequence.  If the output is an <code>ImageOutputStream</code>,
     * the entirety of the stream must be both readable and writeable.
     *
     * <p> If <code>canInsertImage(imageIndex)</code> returns
     * <code>false</code>, an
     * <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * to control the writing process.  If <code>param</code> is
     * <code>null</code>, a default write param will be used.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param imageIndex the index at which to write the image.
     * @param image an <code>IIOImage</code> object containing an
     * image, thumbnails, and metadata to be written.
     * @param param an <code>ImageWriteParam</code>, or
     * <code>null</code> to use a default
     * <code>ImageWriteParam</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canInsertImage(imageIndex)</code> returns <code>false</code>.
     * @exception IllegalArgumentException if <code>image</code> is
     * <code>null</code>.
     * @exception IndexOutOfBoundsException if <code>imageIndex</code>
     * is less than -1 or greater than the largest available index.
     * @exception UnsupportedOperationException if <code>image</code>
     * contains a <code>Raster</code> and <code>canWriteRasters</code>
     * returns <code>false</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canInsertImage(int imageIndex) throws IOException {

    /**
     * Returns <code>true</code> if the writer supports the insertion
     * of a new image at the given index.  Existing images with
     * indices greater than or equal to the insertion index will have
     * their indices increased by 1.  A value for
     * <code>imageIndex</code> of <code>-1</code> may be used to
     * signify an index one larger than the current largest index.
     *
     * <p> A writer that does not support any image insertion may
     * return <code>false</code> without performing bounds checking on
     * the index.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise returns <code>false</code>
     * without checking the value of <code>imageIndex</code>.
     *
     * @param imageIndex the index at which the image is to be
     * inserted.
     *
     * @return <code>true</code> if an image may be inserted at the
     * given index.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception IndexOutOfBoundsException if the writer supports
     * image insertion in general, but <code>imageIndex</code> is less
     * than -1 or greater than the largest available index.
     * @exception IOException if an I/O error occurs during the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void replaceImageMetadata(int imageIndex,
                                     IIOMetadata imageMetadata)

    /**
     * Replaces the image metadata associated with an existing image.
     *
     * <p> If <code>canReplaceImageMetadata(imageIndex)</code> returns
     * <code>false</code>, an
     * <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param imageIndex the index of the image whose metadata is to
     * be replaced.
     * @param imageMetadata an <code>IIOMetadata</code> object
     * representing image metadata, or <code>null</code>.
     *
     * @exception IllegalStateException if the output has not been
     * set.
     * @exception UnsupportedOperationException if
     * <code>canReplaceImageMetadata</code> returns
     * <code>false</code>.
     * @exception IndexOutOfBoundsException if <code>imageIndex</code>
     * is less than 0 or greater than the largest available index.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canReplaceImageMetadata(int imageIndex)

    /**
     * Returns <code>true</code> if it is possible to replace the
     * image metadata associated with an existing image with index
     * <code>imageIndex</code>.  If this method returns
     * <code>false</code>, a call to
     * <code>replaceImageMetadata(imageIndex)</code> will throw an
     * <code>UnsupportedOperationException</code>.
     *
     * <p> A writer that does not support any image metadata
     * replacement may return <code>false</code> without performing
     * bounds checking on the index.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise returns <code>false</code>
     * without checking the value of <code>imageIndex</code>.
     *
     * @param imageIndex the index of the image whose metadata is to
     * be replaced.
     *
     * @return <code>true</code> if the image metadata of the given
     * image can be replaced.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception IndexOutOfBoundsException if the writer supports
     * image metadata replacement in general, but
     * <code>imageIndex</code> is less than 0 or greater than the
     * largest available index.
     * @exception IOException if an I/O error occurs during the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void replaceStreamMetadata(IIOMetadata streamMetadata)

    /**
     * Replaces the stream metadata in the output with new
     * information.  If the output is an
     * <code>ImageOutputStream</code>, the prior contents of the
     * stream are examined and possibly edited to make room for the
     * new data.  All of the prior contents of the output must be
     * available for reading and writing.
     *
     * <p> If <code>canReplaceStreamMetadata</code> returns
     * <code>false</code>, an
     * <code>UnsupportedOperationException</code> will be thrown.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param streamMetadata an <code>IIOMetadata</code> object representing
     * stream metadata, or <code>null</code> to use default values.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if the
     * <code>canReplaceStreamMetadata</code> returns
     * <code>false</code>.  modes do not include
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canReplaceStreamMetadata() throws IOException {

    /**
     * Returns <code>true</code> if it is possible to replace the
     * stream metadata already present in the output.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise returns <code>false</code>.
     *
     * @return <code>true</code> if replacement of stream metadata is
     * allowed.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception IOException if an I/O error occurs during the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void endWriteSequence() throws IOException {

    /**
     * Completes the writing of a sequence of images begun with
     * <code>prepareWriteSequence</code>.  Any stream metadata that
     * should come at the end of the sequence of images is written out,
     * and any header information at the beginning of the sequence is
     * patched up if necessary.  If the output is an
     * <code>ImageOutputStream</code>, data through the stream metadata
     * at the end of the sequence are flushed and need not be readable
     * or writable.
     *
     * <p> If <code>canWriteSequence</code> returns <code>false</code>,
     * this method will throw an
     * <code>UnsupportedOperationException</code>.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set, or <code>prepareWriteSequence</code> has not been called.
     * @exception UnsupportedOperationException if
     * <code>canWriteSequence</code> returns <code>false</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void writeToSequence(IIOImage image, ImageWriteParam param)

    /**
     * Appends a single image and possibly associated metadata and
     * thumbnails, to the output.  If the output is an
     * <code>ImageOutputStream</code>, the existing contents of the
     * output prior to the current seek position may be flushed, and
     * need not be readable or writable, unless the plug-in needs to
     * be able to patch up the header information when
     * <code>endWriteSequence</code> is called (<i>e.g.</i> TIFF).
     *
     * <p> If <code>canWriteSequence</code> returns <code>false</code>,
     * this method will throw an
     * <code>UnsupportedOperationException</code>.
     *
     * <p> The output must have been set beforehand using
     * the <code>setOutput</code> method.
     *
     * <p> <code>prepareWriteSequence</code> must have been called
     * beforehand, or an <code>IllegalStateException</code> is thrown.
     *
     * <p> If <code>canWriteRasters</code> returns <code>true</code>,
     * the <code>IIOImage</code> may contain a <code>Raster</code>
     * source.  Otherwise, it must contain a
     * <code>RenderedImage</code> source.
     *
     * <p> The supplied thumbnails will be resized if needed, and any
     * thumbnails in excess of the supported number will be ignored.
     * If the format requires additional thumbnails that are not
     * provided, the writer will generate them internally.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * to control the writing process.  If <code>param</code> is
     * <code>null</code>, a default write param will be used.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param image an <code>IIOImage</code> object containing an
     * image, thumbnails, and metadata to be written.
     * @param param an <code>ImageWriteParam</code>, or
     * <code>null</code> to use a default
     * <code>ImageWriteParam</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set, or <code>prepareWriteSequence</code> has not been called.
     * @exception UnsupportedOperationException if
     * <code>canWriteSequence</code> returns <code>false</code>.
     * @exception IllegalArgumentException if <code>image</code> is
     * <code>null</code>.
     * @exception UnsupportedOperationException if <code>image</code>
     * contains a <code>Raster</code> and <code>canWriteRasters</code>
     * returns <code>false</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void prepareWriteSequence(IIOMetadata streamMetadata)

    /**
     * Prepares a stream to accept a series of subsequent
     * <code>writeToSequence</code> calls, using the provided stream
     * metadata object.  The metadata will be written to the stream if
     * it should precede the image data.  If the argument is <code>null</code>,
     * default stream metadata is used.
     *
     * <p> If the output is an <code>ImageOutputStream</code>, the existing
     * contents of the output prior to the current seek position are
     * flushed, and need not be readable or writable.  If the format
     * requires that <code>endWriteSequence</code> be able to rewind to
     * patch up the header information, such as for a sequence of images
     * in a single TIFF file, then the metadata written by this method
     * must remain in a writable portion of the stream.  Other formats
     * may flush the stream after this method and after each image.
     *
     * <p> If <code>canWriteSequence</code> returns <code>false</code>,
     * this method will throw an
     * <code>UnsupportedOperationException</code>.
     *
     * <p> The output must have been set beforehand using either
     * the <code>setOutput</code> method.
     *
     * <p> The default implementation throws an
     * <code>IllegalStateException</code> if the output is
     * <code>null</code>, and otherwise throws an
     * <code>UnsupportedOperationException</code>.
     *
     * @param streamMetadata A stream metadata object, or <code>null</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if
     * <code>canWriteSequence</code> returns <code>false</code>.
     * @exception IOException if an error occurs writing the stream
     * metadata.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canWriteSequence() {

    /**
     * Returns <code>true</code> if the writer is able to append an
     * image to an image stream that already contains header
     * information and possibly prior images.
     *
     * <p> If <code>canWriteSequence</code> returns <code>false</code>,
     * <code>writeToSequence</code> and <code>endWriteSequence</code>
     * will throw an <code>UnsupportedOperationException</code>.
     *
     * <p> The default implementation returns <code>false</code>.
     *
     * @return <code>true</code> if images may be appended sequentially.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void write(RenderedImage image) throws IOException {

    /**
     * Appends a complete image stream consisting of a single image
     * with default metadata and thumbnails to the output.  This
     * method is a shorthand for <code>write(null, new IIOImage(image,
     * null, null), null)</code>.
     *
     * @param image a <code>RenderedImage</code> to be written.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception IllegalArgumentException if <code>image</code> is
     * <code>null</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void write(IIOImage image) throws IOException {

    /**
     * Appends a complete image stream containing a single image with
     * default metadata and thumbnails to the output.  This method is
     * a shorthand for <code>write(null, image, null)</code>.
     *
     * @param image an <code>IIOImage</code> object containing an
     * image, thumbnails, and metadata to be written.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception IllegalArgumentException if <code>image</code> is
     * <code>null</code>.
     * @exception UnsupportedOperationException if <code>image</code>
     * contains a <code>Raster</code> and <code>canWriteRasters</code>
     * returns <code>false</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public abstract void write(IIOMetadata streamMetadata,
                               IIOImage image,
                               ImageWriteParam param) throws IOException;

    /**
     * Appends a complete image stream containing a single image and
     * associated stream and image metadata and thumbnails to the
     * output.  Any necessary header information is included.  If the
     * output is an <code>ImageOutputStream</code>, its existing
     * contents prior to the current seek position are not affected,
     * and need not be readable or writable.
     *
     * <p> The output must have been set beforehand using the
     * <code>setOutput</code> method.
     *
     * <p> Stream metadata may optionally be supplied; if it is
     * <code>null</code>, default stream metadata will be used.
     *
     * <p> If <code>canWriteRasters</code> returns <code>true</code>,
     * the <code>IIOImage</code> may contain a <code>Raster</code>
     * source.  Otherwise, it must contain a
     * <code>RenderedImage</code> source.
     *
     * <p> The supplied thumbnails will be resized if needed, and any
     * thumbnails in excess of the supported number will be ignored.
     * If the format requires additional thumbnails that are not
     * provided, the writer should generate them internally.
     *
     * <p>  An <code>ImageWriteParam</code> may
     * optionally be supplied to control the writing process.  If
     * <code>param</code> is <code>null</code>, a default write param
     * will be used.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * @param streamMetadata an <code>IIOMetadata</code> object representing
     * stream metadata, or <code>null</code> to use default values.
     * @param image an <code>IIOImage</code> object containing an
     * image, thumbnails, and metadata to be written.
     * @param param an <code>ImageWriteParam</code>, or
     * <code>null</code> to use a default
     * <code>ImageWriteParam</code>.
     *
     * @exception IllegalStateException if the output has not
     * been set.
     * @exception UnsupportedOperationException if <code>image</code>
     * contains a <code>Raster</code> and <code>canWriteRasters</code>
     * returns <code>false</code>.
     * @exception IllegalArgumentException if <code>image</code> is
     * <code>null</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public boolean canWriteRasters() {

    /**
     * Returns <code>true</code> if the methods that take an
     * <code>IIOImage</code> parameter are capable of dealing with a
     * <code>Raster</code> (as opposed to <code>RenderedImage</code>)
     * source image.  If this method returns <code>false</code>, then
     * those methods will throw an
     * <code>UnsupportedOperationException</code> if supplied with an
     * <code>IIOImage</code> containing a <code>Raster</code>.
     *
     * <p> The default implementation returns <code>false</code>.
     *
     * @return <code>true</code> if <code>Raster</code> sources are
     * supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public Dimension[] getPreferredThumbnailSizes(ImageTypeSpecifier imageType,
                                                  ImageWriteParam param,
                                                  IIOMetadata streamMetadata,
                                                  IIOMetadata imageMetadata) {

    /**
     * Returns an array of <code>Dimension</code>s indicating the
     * legal size ranges for thumbnail images as they will be encoded
     * in the output file or stream.  This information is merely
     * advisory; the writer will resize any supplied thumbnails as
     * necessary.
     *
     * <p> The information is returned as a set of pairs; the first
     * element of a pair contains an (inclusive) minimum width and
     * height, and the second element contains an (inclusive) maximum
     * width and height.  Together, each pair defines a valid range of
     * sizes.  To specify a fixed size, the same width and height will
     * appear for both elements.  A return value of <code>null</code>
     * indicates that the size is arbitrary or unknown.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * for cases where it may affect thumbnail handling.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> The default implementation returns <code>null</code>.
     *
     * @param imageType an <code>ImageTypeSpecifier</code> indicating the
     * type of image to be written, or <code>null</code>.
     * @param param the <code>ImageWriteParam</code> that will be used for
     * writing, or <code>null</code>.
     * @param streamMetadata an <code>IIOMetadata</code> object that will
     * be used for writing, or <code>null</code>.
     * @param imageMetadata an <code>IIOMetadata</code> object that will
     * be used for writing, or <code>null</code>.
     *
     * @return an array of <code>Dimension</code>s with an even length
     * of at least two, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public int getNumThumbnailsSupported(ImageTypeSpecifier imageType,
                                         ImageWriteParam param,
                                         IIOMetadata streamMetadata,
                                         IIOMetadata imageMetadata) {

    /**
     * Returns the number of thumbnails supported by the format being
     * written, given the image type and any additional write
     * parameters and metadata objects that will be used during
     * encoding.  A return value of <code>-1</code> indicates that
     * insufficient information is available.
     *
     * <p> An <code>ImageWriteParam</code> may optionally be supplied
     * for cases where it may affect thumbnail handling.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> The default implementation returns 0.
     *
     * @param imageType an <code>ImageTypeSpecifier</code> indicating
     * the type of image to be written, or <code>null</code>.
     * @param param the <code>ImageWriteParam</code> that will be used for
     * writing, or <code>null</code>.
     * @param streamMetadata an <code>IIOMetadata</code> object that will
     * be used for writing, or <code>null</code>.
     * @param imageMetadata an <code>IIOMetadata</code> object that will
     * be used for writing, or <code>null</code>.
     *
     * @return the number of thumbnails that may be written given the
     * supplied parameters, or <code>-1</code> if insufficient
     * information is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public abstract IIOMetadata

    /**
     * Returns an <code>IIOMetadata</code> object containing default
     * values for encoding an image of the given type.  The contents
     * of the object may be manipulated using either the XML tree
     * structure returned by the <code>IIOMetadata.getAsTree</code>
     * method, an <code>IIOMetadataController</code> object, or via
     * plug-in specific interfaces, and the resulting data supplied to
     * one of the <code>write</code> methods that take a stream
     * metadata parameter.
     *
     * <p> An optional <code>ImageWriteParam</code> may be supplied
     * for cases where it may affect the structure of the image
     * metadata.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * @param imageType an <code>ImageTypeSpecifier</code> indicating the
     * format of the image to be written later.
     * @param param an <code>ImageWriteParam</code> that will be used to
     * encode the image, or <code>null</code>.
     *
     * @return an <code>IIOMetadata</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public abstract IIOMetadata

    /**
     * Returns an <code>IIOMetadata</code> object containing default
     * values for encoding a stream of images.  The contents of the
     * object may be manipulated using either the XML tree structure
     * returned by the <code>IIOMetadata.getAsTree</code> method, an
     * <code>IIOMetadataController</code> object, or via plug-in
     * specific interfaces, and the resulting data supplied to one of
     * the <code>write</code> methods that take a stream metadata
     * parameter.
     *
     * <p> An optional <code>ImageWriteParam</code> may be supplied
     * for cases where it may affect the structure of the stream
     * metadata.
     *
     * <p> If the supplied <code>ImageWriteParam</code> contains
     * optional setting values not supported by this writer (<i>e.g.</i>
     * progressive encoding or any format-specific settings), they
     * will be ignored.
     *
     * <p> Writers that do not make use of stream metadata
     * (<i>e.g.</i>, writers for single-image formats) should return
     * <code>null</code>.
     *
     * @param param an <code>ImageWriteParam</code> that will be used to
     * encode the image, or <code>null</code>.
     *
     * @return an <code>IIOMetadata</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public ImageWriteParam getDefaultWriteParam() {

    /**
     * Returns a new <code>ImageWriteParam</code> object of the
     * appropriate type for this file format containing default
     * values, that is, those values that would be used
     * if no <code>ImageWriteParam</code> object were specified.  This
     * is useful as a starting point for tweaking just a few parameters
     * and otherwise leaving the default settings alone.
     *
     * <p> The default implementation constructs and returns a new
     * <code>ImageWriteParam</code> object that does not allow tiling,
     * progressive encoding, or compression, and that will be
     * localized for the current <code>Locale</code> (<i>i.e.</i>,
     * what you would get by calling <code>new
     * ImageWriteParam(getLocale())</code>.
     *
     * <p> Individual plug-ins may return an instance of
     * <code>ImageWriteParam</code> with additional optional features
     * enabled, or they may return an instance of a plug-in specific
     * subclass of <code>ImageWriteParam</code>.
     *
     * @return a new <code>ImageWriteParam</code> object containing
     * default values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public Locale getLocale() {

    /**
     * Returns the currently set <code>Locale</code>, or
     * <code>null</code> if none has been set.
     *
     * <p> The default implementation returns the value of the
     * <code>locale</code> instance variable.
     *
     * @return the current <code>Locale</code>, or <code>null</code>.
     *
     * @see #setLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void setLocale(Locale locale) {

    /**
     * Sets the current <code>Locale</code> of this
     * <code>ImageWriter</code> to the given value.  A value of
     * <code>null</code> removes any previous setting, and indicates
     * that the writer should localize as it sees fit.
     *
     * <p> The default implementation checks <code>locale</code>
     * against the values returned by
     * <code>getAvailableLocales</code>, and sets the
     * <code>locale</code> instance variable if it is found.  If
     * <code>locale</code> is <code>null</code>, the instance variable
     * is set to <code>null</code> without any checking.
     *
     * @param locale the desired <code>Locale</code>, or
     * <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>locale</code> is
     * non-<code>null</code> but is not one of the values returned by
     * <code>getAvailableLocales</code>.
     *
     * @see #getLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public Locale[] getAvailableLocales() {

    /**
     * Returns an array of <code>Locale</code>s that may be used to
     * localize warning listeners and compression settings.  A return
     * value of <code>null</code> indicates that localization is not
     * supported.
     *
     * <p> The default implementation returns a clone of the
     * <code>availableLocales</code> instance variable if it is
     * non-<code>null</code>, or else returns <code>null</code>.
     *
     * @return an array of <code>Locale</code>s that may be used as
     * arguments to <code>setLocale</code>, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public Object getOutput() {

    /**
     * Returns the <code>ImageOutputStream</code> or other
     * <code>Object</code> set by the most recent call to the
     * <code>setOutput</code> method.  If no destination has been
     * set, <code>null</code> is returned.
     *
     * <p> The default implementation returns the value of the
     * <code>output</code> instance variable.
     *
     * @return the <code>Object</code> that was specified using
     * <code>setOutput</code>, or <code>null</code>.
     *
     * @see #setOutput
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public void setOutput(Object output) {

    /**
     * Sets the destination to the given
     * <code>ImageOutputStream</code> or other <code>Object</code>.
     * The destination is assumed to be ready to accept data, and will
     * not be closed at the end of each write. This allows distributed
     * imaging applications to transmit a series of images over a
     * single network connection.  If <code>output</code> is
     * <code>null</code>, any currently set output will be removed.
     *
     * <p> If <code>output</code> is an
     * <code>ImageOutputStream</code>, calls to the
     * <code>write</code>, <code>writeToSequence</code>, and
     * <code>prepareWriteEmpty</code>/<code>endWriteEmpty</code>
     * methods will preserve the existing contents of the stream.
     * Other write methods, such as <code>writeInsert</code>,
     * <code>replaceStreamMetadata</code>,
     * <code>replaceImageMetadata</code>, <code>replacePixels</code>,
     * <code>prepareInsertEmpty</code>/<code>endInsertEmpty</code>,
     * and <code>endWriteSequence</code>, require the full contents
     * of the stream to be readable and writable, and may alter any
     * portion of the stream.
     *
     * <p> Use of a general <code>Object</code> other than an
     * <code>ImageOutputStream</code> is intended for writers that
     * interact directly with an output device or imaging protocol.
     * The set of legal classes is advertised by the writer's service
     * provider's <code>getOutputTypes</code> method; most writers
     * will return a single-element array containing only
     * <code>ImageOutputStream.class</code> to indicate that they
     * accept only an <code>ImageOutputStream</code>.
     *
     * <p> The default implementation sets the <code>output</code>
     * instance variable to the value of <code>output</code> after
     * checking <code>output</code> against the set of classes
     * advertised by the originating provider, if there is one.
     *
     * @param output the <code>ImageOutputStream</code> or other
     * <code>Object</code> to use for future writing.
     *
     * @exception IllegalArgumentException if <code>output</code> is
     * not an instance of one of the classes returned by the
     * originating service provider's <code>getOutputTypes</code>
     * method.
     *
     * @see #getOutput
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    public ImageWriterSpi getOriginatingProvider() {

    /**
     * Returns the <code>ImageWriterSpi</code> object that created
     * this <code>ImageWriter</code>, or <code>null</code> if this
     * object was not created through the <code>IIORegistry</code>.
     *
     * <p> The default implementation returns the value of the
     * <code>originatingProvider</code> instance variable.
     *
     * @return an <code>ImageWriterSpi</code>, or <code>null</code>.
     *
     * @see ImageWriterSpi
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected ImageWriter(ImageWriterSpi originatingProvider) {

    /**
     * Constructs an <code>ImageWriter</code> and sets its
     * <code>originatingProvider</code> instance variable to the
     * supplied value.
     *
     * <p> Subclasses that make use of extensions should provide a
     * constructor with signature <code>(ImageWriterSpi,
     * Object)</code> in order to retrieve the extension object.  If
     * the extension object is unsuitable, an
     * <code>IllegalArgumentException</code> should be thrown.
     *
     * @param originatingProvider the <code>ImageWriterSpi</code> that
     * is constructing this object, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    private boolean abortFlag = false;

    /**
     * If <code>true</code>, the current write operation should be
     * aborted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected List<IIOWriteProgressListener> progressListeners = null;

    /**
     * A <code>List</code> of currently registered
     * <code>IIOWriteProgressListener</code>s, initialized by default
     * <code>null</code>, which is synonymous with an empty
     * <code>List</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected List<Locale> warningLocales = null;

    /**
     * A <code>List</code> of <code>Locale</code>s, one for each
     * element of <code>warningListeners</code>, initialized by default
     * <code>null</code>, which is synonymous with an empty
     * <code>List</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected List<IIOWriteWarningListener> warningListeners = null;

    /**
     * A <code>List</code> of currently registered
     * <code>IIOWriteWarningListener</code>s, initialized by default to
     * <code>null</code>, which is synonymous with an empty
     * <code>List</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected Locale locale = null;

    /**
     * The current <code>Locale</code> to be used for localization, or
     * <code>null</code> if none has been set.  By default it is
     * initialized to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected Locale[] availableLocales = null;

    /**
     * An array of <code>Locale</code>s that may be used to localize
     * warning messages and compression setting values, or
     * <code>null</code> if localization is not supported.  By default
     * it is initialized to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected Object output = null;

    /**
     * The <code>ImageOutputStream</code> or other <code>Object</code>
     * set by <code>setOutput</code> and retrieved by
     * <code>getOutput</code>.  By default it is initialized to
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
    protected ImageWriterSpi originatingProvider = null;

    /**
     * The <code>ImageWriterSpi</code> that instantiated this object,
     * or <code>null</code> if its identity is not known or none
     * exists.  By default it is initialized to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageWriter.java
public abstract class ImageWriter implements ImageTranscoder {

/**
 * An abstract superclass for encoding and writing images.  This class
 * must be subclassed by classes that write out images in the context
 * of the Java Image I/O framework.
 *
 * <p> <code>ImageWriter</code> objects are normally instantiated by
 * the service provider class for the specific format.  Service
 * provider classes are registered with the <code>IIORegistry</code>,
 * which uses them for format recognition and presentation of
 * available format readers and writers.
 *
 * <p>
 *
 * @see ImageReader
 * @see ImageWriteParam
 * @see javax.imageio.spi.IIORegistry
 * @see javax.imageio.spi.ImageWriterSpi
 *
 */