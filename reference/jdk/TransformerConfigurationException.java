_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerConfigurationException.java
    public TransformerConfigurationException(String message,
                                             SourceLocator locator,
                                             Throwable e) {

    /**
     * Wrap an existing exception in a TransformerConfigurationException.
     *
     * @param message The error or warning message, or null to
     *                use the message from the embedded exception.
     * @param locator The locator object for the error or warning.
     * @param e Any exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerConfigurationException.java
    public TransformerConfigurationException(String message,
                                             SourceLocator locator) {

    /**
     * Create a new TransformerConfigurationException from a message and a Locator.
     *
     * <p>This constructor is especially useful when an application is
     * creating its own exception from within a DocumentHandler
     * callback.</p>
     *
     * @param message The error or warning message.
     * @param locator The locator object for the error or warning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerConfigurationException.java
    public TransformerConfigurationException(String msg, Throwable e) {

    /**
     * Create a new <code>TransformerConfigurationException</code> with the
     * given <code>Exception</code> base cause and detail message.
     *
     * @param e The exception to be encapsulated in a
     *      TransformerConfigurationException
     * @param msg The detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerConfigurationException.java
    public TransformerConfigurationException(Throwable e) {

    /**
     * Create a new <code>TransformerConfigurationException</code> with a
     * given <code>Exception</code> base cause of the error.
     *
     * @param e The exception to be encapsulated in a
     * TransformerConfigurationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerConfigurationException.java
    public TransformerConfigurationException(String msg) {

    /**
     * Create a new <code>TransformerConfigurationException</code> with
     * the <code>String </code> specified as an error message.
     *
     * @param msg The error message for the exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerConfigurationException.java
    public TransformerConfigurationException() {

    /**
     * Create a new <code>TransformerConfigurationException</code> with no
     * detail mesage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/TransformerConfigurationException.java
public class TransformerConfigurationException extends TransformerException {

/**
 * Indicates a serious configuration error.
 */
