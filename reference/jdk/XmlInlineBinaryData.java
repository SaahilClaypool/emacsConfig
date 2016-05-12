_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/XmlInlineBinaryData.java
@Retention(RUNTIME)

/**
 * Disable consideration of XOP encoding for datatypes that are bound to
 * base64-encoded binary data in XML.
 *
 * <p>
 * When XOP encoding is enabled as described in {@link AttachmentMarshaller#isXOPPackage()}, this annotation disables datatypes such as {@link java.awt.Image} or {@link Source} or <tt>byte[]</tt> that are bound to base64-encoded binary from being considered for
 * XOP encoding. If a JAXB property is annotated with this annotation or if
 * the JAXB property's base type is annotated with this annotation,
 * neither
 * {@link AttachmentMarshaller#addMtomAttachment(DataHandler, String, String)}
 * nor
 * {@link AttachmentMarshaller#addMtomAttachment(byte[], int, int, String, String, String)} is
 * ever called for the property. The binary data will always be inlined.
 *
 * @author Joseph Fialli
 * @since JAXB2.0
 */
