_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public void setNextWarning(SQLWarning w) {

    /**
     * Adds a <code>SQLWarning</code> object to the end of the chain.
     *
     * @param w the new end of the <code>SQLException</code> chain
     * @see #getNextWarning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning getNextWarning() {

    /**
     * Retrieves the warning chained to this <code>SQLWarning</code> object by
     * <code>setNextWarning</code>.
     *
     * @return the next <code>SQLException</code> in the chain; <code>null</code> if none
     * @see #setNextWarning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning(String reason, String SQLState, int vendorCode, Throwable cause) {

    /**
     * Constructs a<code>SQLWarning</code> object
     * with a given
     * <code>reason</code>, <code>SQLState</code>, <code>vendorCode</code>
     * and  <code>cause</code>.
     * <p>
     * @param reason a description of the warning
     * @param SQLState an XOPEN or SQL:2003 code identifying the warning
     * @param vendorCode a database vendor-specific warning code
     * @param cause the underlying reason for this <code>SQLWarning</code> (which is saved for later retrieval by the <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning(String reason, String SQLState, Throwable cause) {

    /**
     * Constructs a <code>SQLWarning</code> object
     * with a given
     * <code>reason</code>, <code>SQLState</code> and  <code>cause</code>.
     * The vendor code is initialized to 0.
     * <p>
     * @param reason a description of the warning
     * @param SQLState an XOPEN or SQL:2003 code identifying the warning
     * @param cause the underlying reason for this <code>SQLWarning</code> (which is saved for later retrieval by the <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning(String reason, Throwable cause) {

    /**
     * Constructs a <code>SQLWarning</code> object
     * with a given
     * <code>reason</code> and  <code>cause</code>.
     * The <code>SQLState</code> is  initialized to <code>null</code>
     * and the vendor code is initialized to 0.
     * <p>
     * @param reason a description of the warning
     * @param cause  the underlying reason for this <code>SQLWarning</code>
     * (which is saved for later retrieval by the <code>getCause()</code> method);
     * may be null indicating the cause is non-existent or unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning(Throwable cause) {

    /**
     * Constructs a <code>SQLWarning</code> object
     * with a given  <code>cause</code>.
     * The <code>SQLState</code> is initialized
     * to <code>null</code> and the vendor code is initialized to 0.
     * The <code>reason</code>  is initialized to <code>null</code> if
     * <code>cause==null</code> or to <code>cause.toString()</code> if
     * <code>cause!=null</code>.
     * <p>
     * @param cause the underlying reason for this <code>SQLWarning</code> (which is saved for later retrieval by the <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning() {

    /**
     * Constructs a  <code>SQLWarning</code> object.
     * The <code>reason</code>, <code>SQLState</code> are initialized
     * to <code>null</code> and the vendor code is initialized to 0.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning(String reason) {

    /**
     * Constructs a <code>SQLWarning</code> object
     * with a given <code>reason</code>. The <code>SQLState</code>
     * is initialized to <code>null</code> and the vendor code is initialized
     * to 0.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method.
     * <p>
     * @param reason a description of the warning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
    public SQLWarning(String reason, String SQLState) {

    /**
     * Constructs a <code>SQLWarning</code> object
     * with a given <code>reason</code> and <code>SQLState</code>.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method. The vendor code
     * is initialized to 0.
     * <p>
     * @param reason a description of the warning
     * @param SQLState an XOPEN or SQL:2003 code identifying the warning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
     public SQLWarning(String reason, String SQLState, int vendorCode) {

    /**
     * Constructs a  <code>SQLWarning</code> object
     *  with a given <code>reason</code>, <code>SQLState</code>  and
     * <code>vendorCode</code>.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method.
     * <p>
     * @param reason a description of the warning
     * @param SQLState an XOPEN or SQL:2003 code identifying the warning
     * @param vendorCode a database vendor-specific warning code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLWarning.java
public class SQLWarning extends SQLException {

/**
 * <P>An exception that provides information on  database access
 * warnings. Warnings are silently chained to the object whose method
 * caused it to be reported.
 * <P>
 * Warnings may be retrieved from <code>Connection</code>, <code>Statement</code>,
 * and <code>ResultSet</code> objects.  Trying to retrieve a warning on a
 * connection after it has been closed will cause an exception to be thrown.
 * Similarly, trying to retrieve a warning on a statement after it has been
 * closed or on a result set after it has been closed will cause
 * an exception to be thrown. Note that closing a statement also
 * closes a result set that it might have produced.
 *
 * @see Connection#getWarnings
 * @see Statement#getWarnings
 * @see ResultSet#getWarnings
 */