_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public static MonitorInfo from(CompositeData cd) {

    /**
     * Returns a <tt>MonitorInfo</tt> object represented by the
     * given <tt>CompositeData</tt>.
     * The given <tt>CompositeData</tt> must contain the following attributes
     * as well as the attributes specified in the
     * <a href="LockInfo.html#MappedType">
     * mapped type</a> for the {@link LockInfo} class:
     * <blockquote>
     * <table border summary="The attributes and their types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>lockedStackFrame</td>
     *   <td><tt>CompositeData as specified in the
     *       <a href="ThreadInfo.html#StackTrace">stackTrace</a>
     *       attribute defined in the {@link ThreadInfo#from
     *       ThreadInfo.from} method.
     *       </tt></td>
     * </tr>
     * <tr>
     *   <td>lockedStackDepth</td>
     *   <td><tt>java.lang.Integer</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MonitorInfo</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MonitorInfo</tt> with the attributes described
     *   above.

     * @return a <tt>MonitorInfo</tt> object represented
     *         by <tt>cd</tt> if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public StackTraceElement getLockedStackFrame() {

    /**
     * Returns the stack frame that locked the object monitor.
     *
     * @return <tt>StackTraceElement</tt> that locked the object monitor,
     *         or <tt>null</tt> if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public int getLockedStackDepth() {

    /**
     * Returns the depth in the stack trace where the object monitor
     * was locked.  The depth is the index to the <tt>StackTraceElement</tt>
     * array returned in the {@link ThreadInfo#getStackTrace} method.
     *
     * @return the depth in the stack trace where the object monitor
     *         was locked, or a negative number if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public MonitorInfo(String className,
                       int identityHashCode,
                       int stackDepth,
                       StackTraceElement stackFrame) {

    /**
     * Construct a <tt>MonitorInfo</tt> object.
     *
     * @param className the fully qualified name of the class of the lock object.
     * @param identityHashCode the {@link System#identityHashCode
     *                         identity hash code} of the lock object.
     * @param stackDepth the depth in the stack trace where the object monitor
     *                   was locked.
     * @param stackFrame the stack frame that locked the object monitor.
     * @throws IllegalArgumentException if
     *    <tt>stackDepth</tt> &ge; 0 but <tt>stackFrame</tt> is <tt>null</tt>,
     *    or <tt>stackDepth</tt> &lt; 0 but <tt>stackFrame</tt> is not
     *       <tt>null</tt>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
public class MonitorInfo extends LockInfo {

/**
 * Information about an object monitor lock.  An object monitor is locked
 * when entering a synchronization block or method on that object.
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MonitorInfo</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in
 * the {@link #from from} method.
 *
 * @author  Mandy Chung
 * @since   1.6
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public static MonitorInfo from(CompositeData cd) {

    /**
     * Returns a <tt>MonitorInfo</tt> object represented by the
     * given <tt>CompositeData</tt>.
     * The given <tt>CompositeData</tt> must contain the following attributes
     * as well as the attributes specified in the
     * <a href="LockInfo.html#MappedType">
     * mapped type</a> for the {@link LockInfo} class:
     * <blockquote>
     * <table border summary="The attributes and their types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>lockedStackFrame</td>
     *   <td><tt>CompositeData as specified in the
     *       <a href="ThreadInfo.html#StackTrace">stackTrace</a>
     *       attribute defined in the {@link ThreadInfo#from
     *       ThreadInfo.from} method.
     *       </tt></td>
     * </tr>
     * <tr>
     *   <td>lockedStackDepth</td>
     *   <td><tt>java.lang.Integer</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MonitorInfo</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MonitorInfo</tt> with the attributes described
     *   above.

     * @return a <tt>MonitorInfo</tt> object represented
     *         by <tt>cd</tt> if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public StackTraceElement getLockedStackFrame() {

    /**
     * Returns the stack frame that locked the object monitor.
     *
     * @return <tt>StackTraceElement</tt> that locked the object monitor,
     *         or <tt>null</tt> if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public int getLockedStackDepth() {

    /**
     * Returns the depth in the stack trace where the object monitor
     * was locked.  The depth is the index to the <tt>StackTraceElement</tt>
     * array returned in the {@link ThreadInfo#getStackTrace} method.
     *
     * @return the depth in the stack trace where the object monitor
     *         was locked, or a negative number if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public MonitorInfo(String className,
                       int identityHashCode,
                       int stackDepth,
                       StackTraceElement stackFrame) {

    /**
     * Construct a <tt>MonitorInfo</tt> object.
     *
     * @param className the fully qualified name of the class of the lock object.
     * @param identityHashCode the {@link System#identityHashCode
     *                         identity hash code} of the lock object.
     * @param stackDepth the depth in the stack trace where the object monitor
     *                   was locked.
     * @param stackFrame the stack frame that locked the object monitor.
     * @throws IllegalArgumentException if
     *    <tt>stackDepth</tt> &ge; 0 but <tt>stackFrame</tt> is <tt>null</tt>,
     *    or <tt>stackDepth</tt> &lt; 0 but <tt>stackFrame</tt> is not
     *       <tt>null</tt>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
public class MonitorInfo extends LockInfo {

/**
 * Information about an object monitor lock.  An object monitor is locked
 * when entering a synchronization block or method on that object.
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MonitorInfo</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in
 * the {@link #from from} method.
 *
 * @author  Mandy Chung
 * @since   1.6
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public static MonitorInfo from(CompositeData cd) {

    /**
     * Returns a <tt>MonitorInfo</tt> object represented by the
     * given <tt>CompositeData</tt>.
     * The given <tt>CompositeData</tt> must contain the following attributes
     * as well as the attributes specified in the
     * <a href="LockInfo.html#MappedType">
     * mapped type</a> for the {@link LockInfo} class:
     * <blockquote>
     * <table border summary="The attributes and their types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>lockedStackFrame</td>
     *   <td><tt>CompositeData as specified in the
     *       <a href="ThreadInfo.html#StackTrace">stackTrace</a>
     *       attribute defined in the {@link ThreadInfo#from
     *       ThreadInfo.from} method.
     *       </tt></td>
     * </tr>
     * <tr>
     *   <td>lockedStackDepth</td>
     *   <td><tt>java.lang.Integer</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MonitorInfo</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MonitorInfo</tt> with the attributes described
     *   above.

     * @return a <tt>MonitorInfo</tt> object represented
     *         by <tt>cd</tt> if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public StackTraceElement getLockedStackFrame() {

    /**
     * Returns the stack frame that locked the object monitor.
     *
     * @return <tt>StackTraceElement</tt> that locked the object monitor,
     *         or <tt>null</tt> if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public int getLockedStackDepth() {

    /**
     * Returns the depth in the stack trace where the object monitor
     * was locked.  The depth is the index to the <tt>StackTraceElement</tt>
     * array returned in the {@link ThreadInfo#getStackTrace} method.
     *
     * @return the depth in the stack trace where the object monitor
     *         was locked, or a negative number if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public MonitorInfo(String className,
                       int identityHashCode,
                       int stackDepth,
                       StackTraceElement stackFrame) {

    /**
     * Construct a <tt>MonitorInfo</tt> object.
     *
     * @param className the fully qualified name of the class of the lock object.
     * @param identityHashCode the {@link System#identityHashCode
     *                         identity hash code} of the lock object.
     * @param stackDepth the depth in the stack trace where the object monitor
     *                   was locked.
     * @param stackFrame the stack frame that locked the object monitor.
     * @throws IllegalArgumentException if
     *    <tt>stackDepth</tt> &ge; 0 but <tt>stackFrame</tt> is <tt>null</tt>,
     *    or <tt>stackDepth</tt> &lt; 0 but <tt>stackFrame</tt> is not
     *       <tt>null</tt>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
public class MonitorInfo extends LockInfo {

/**
 * Information about an object monitor lock.  An object monitor is locked
 * when entering a synchronization block or method on that object.
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MonitorInfo</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in
 * the {@link #from from} method.
 *
 * @author  Mandy Chung
 * @since   1.6
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public static MonitorInfo from(CompositeData cd) {

    /**
     * Returns a <tt>MonitorInfo</tt> object represented by the
     * given <tt>CompositeData</tt>.
     * The given <tt>CompositeData</tt> must contain the following attributes
     * as well as the attributes specified in the
     * <a href="LockInfo.html#MappedType">
     * mapped type</a> for the {@link LockInfo} class:
     * <blockquote>
     * <table border summary="The attributes and their types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>lockedStackFrame</td>
     *   <td><tt>CompositeData as specified in the
     *       <a href="ThreadInfo.html#StackTrace">stackTrace</a>
     *       attribute defined in the {@link ThreadInfo#from
     *       ThreadInfo.from} method.
     *       </tt></td>
     * </tr>
     * <tr>
     *   <td>lockedStackDepth</td>
     *   <td><tt>java.lang.Integer</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MonitorInfo</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MonitorInfo</tt> with the attributes described
     *   above.

     * @return a <tt>MonitorInfo</tt> object represented
     *         by <tt>cd</tt> if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public StackTraceElement getLockedStackFrame() {

    /**
     * Returns the stack frame that locked the object monitor.
     *
     * @return <tt>StackTraceElement</tt> that locked the object monitor,
     *         or <tt>null</tt> if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public int getLockedStackDepth() {

    /**
     * Returns the depth in the stack trace where the object monitor
     * was locked.  The depth is the index to the <tt>StackTraceElement</tt>
     * array returned in the {@link ThreadInfo#getStackTrace} method.
     *
     * @return the depth in the stack trace where the object monitor
     *         was locked, or a negative number if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public MonitorInfo(String className,
                       int identityHashCode,
                       int stackDepth,
                       StackTraceElement stackFrame) {

    /**
     * Construct a <tt>MonitorInfo</tt> object.
     *
     * @param className the fully qualified name of the class of the lock object.
     * @param identityHashCode the {@link System#identityHashCode
     *                         identity hash code} of the lock object.
     * @param stackDepth the depth in the stack trace where the object monitor
     *                   was locked.
     * @param stackFrame the stack frame that locked the object monitor.
     * @throws IllegalArgumentException if
     *    <tt>stackDepth</tt> &ge; 0 but <tt>stackFrame</tt> is <tt>null</tt>,
     *    or <tt>stackDepth</tt> &lt; 0 but <tt>stackFrame</tt> is not
     *       <tt>null</tt>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
public class MonitorInfo extends LockInfo {

/**
 * Information about an object monitor lock.  An object monitor is locked
 * when entering a synchronization block or method on that object.
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MonitorInfo</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in
 * the {@link #from from} method.
 *
 * @author  Mandy Chung
 * @since   1.6
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public static MonitorInfo from(CompositeData cd) {

    /**
     * Returns a <tt>MonitorInfo</tt> object represented by the
     * given <tt>CompositeData</tt>.
     * The given <tt>CompositeData</tt> must contain the following attributes
     * as well as the attributes specified in the
     * <a href="LockInfo.html#MappedType">
     * mapped type</a> for the {@link LockInfo} class:
     * <blockquote>
     * <table border summary="The attributes and their types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>lockedStackFrame</td>
     *   <td><tt>CompositeData as specified in the
     *       <a href="ThreadInfo.html#StackTrace">stackTrace</a>
     *       attribute defined in the {@link ThreadInfo#from
     *       ThreadInfo.from} method.
     *       </tt></td>
     * </tr>
     * <tr>
     *   <td>lockedStackDepth</td>
     *   <td><tt>java.lang.Integer</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MonitorInfo</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MonitorInfo</tt> with the attributes described
     *   above.

     * @return a <tt>MonitorInfo</tt> object represented
     *         by <tt>cd</tt> if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public StackTraceElement getLockedStackFrame() {

    /**
     * Returns the stack frame that locked the object monitor.
     *
     * @return <tt>StackTraceElement</tt> that locked the object monitor,
     *         or <tt>null</tt> if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public int getLockedStackDepth() {

    /**
     * Returns the depth in the stack trace where the object monitor
     * was locked.  The depth is the index to the <tt>StackTraceElement</tt>
     * array returned in the {@link ThreadInfo#getStackTrace} method.
     *
     * @return the depth in the stack trace where the object monitor
     *         was locked, or a negative number if not available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
    public MonitorInfo(String className,
                       int identityHashCode,
                       int stackDepth,
                       StackTraceElement stackFrame) {

    /**
     * Construct a <tt>MonitorInfo</tt> object.
     *
     * @param className the fully qualified name of the class of the lock object.
     * @param identityHashCode the {@link System#identityHashCode
     *                         identity hash code} of the lock object.
     * @param stackDepth the depth in the stack trace where the object monitor
     *                   was locked.
     * @param stackFrame the stack frame that locked the object monitor.
     * @throws IllegalArgumentException if
     *    <tt>stackDepth</tt> &ge; 0 but <tt>stackFrame</tt> is <tt>null</tt>,
     *    or <tt>stackDepth</tt> &lt; 0 but <tt>stackFrame</tt> is not
     *       <tt>null</tt>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MonitorInfo.java
public class MonitorInfo extends LockInfo {

/**
 * Information about an object monitor lock.  An object monitor is locked
 * when entering a synchronization block or method on that object.
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MonitorInfo</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in
 * the {@link #from from} method.
 *
 * @author  Mandy Chung
 * @since   1.6
 */