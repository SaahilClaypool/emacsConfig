_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceException.java
  public WebServiceException(Throwable cause) {

  /** Constructs a new WebServiceException with the specified cause
   *  and a detail message of <tt>(cause==null ? null :
   *  cause.toString())</tt> (which typically contains the
   *  class and detail message of <tt>cause</tt>).
   *
   *  @param cause   The cause which is saved for the later
   *                 retrieval throw by the getCause method.
   *                 (A <tt>null</tt> value is permitted, and
   *                 indicates that the cause is nonexistent or
     *               unknown.)
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceException.java
  public WebServiceException(String message, Throwable cause) {

  /** Constructs a new exception with the specified detail
   *  message and cause.
   *
   *  @param message The detail message which is later retrieved
   *                 using the getMessage method
   *  @param cause   The cause which is saved for the later
   *                 retrieval throw by the getCause method
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceException.java
  public WebServiceException(String message) {

  /** Constructs a new exception with the specified detail
   *  message.  The cause is not initialized.
   *  @param message The detail message which is later
   *                 retrieved using the getMessage method
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceException.java
  public WebServiceException() {

  /** Constructs a new exception with <code>null</code> as its
   *  detail message. The cause is not initialized.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceException.java
public class WebServiceException extends java.lang.RuntimeException {

/** The <code>WebServiceException</code> class is the base
 *  exception class for all JAX-WS API runtime exceptions.
 *
 *  @since JAX-WS 2.0
**/