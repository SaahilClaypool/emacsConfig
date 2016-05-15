_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/event/IIOReadWarningListener.java
    void warningOccurred(ImageReader source, String warning);

    /**
     * Reports the occurrence of a non-fatal error in decoding.  Decoding
     * will continue following the call to this method.  The application
     * may choose to display a dialog, print the warning to the console,
     * ignore the warning, or take any other action it chooses.
     *
     * @param source the <code>ImageReader</code> object calling this method.
     * @param warning a <code>String</code> containing the warning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/event/IIOReadWarningListener.java
public interface IIOReadWarningListener extends EventListener {

/**
 * An interface used by <code>ImageReader</code> implementations to
 * notify callers of their image and thumbnail reading methods of
 * warnings (non-fatal errors).  Fatal errors cause the relevant
 * read method to throw an <code>IIOException</code>.
 *
 * <p> Localization is handled by associating a <code>Locale</code>
 * with each <code>IIOReadWarningListener</code> as it is registered
 * with an <code>ImageReader</code>.  It is up to the
 * <code>ImageReader</code> to provide localized messages.
 *
 * @see javax.imageio.ImageReader#addIIOReadWarningListener
 * @see javax.imageio.ImageReader#removeIIOReadWarningListener
 *
 */