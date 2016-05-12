_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    /*

    /**
     * @serialData "permissions" field (a Vector containing the FilePermissions).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Vector
     *     A list of FilePermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the FilePermission objects in the
     * container.
     *
     * @return an enumeration of all the FilePermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public boolean implies(Permission permission) {

    /**
     * Check and see if this set of permissions implies the permissions
     * expressed in "permission".
     *
     * @param permission the Permission object to compare
     *
     * @return true if "permission" is a proper subset of a permission in
     * the set, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the FilePermissionCollection. The key for the hash is
     * permission.path.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       FilePermission
     *
     * @exception SecurityException - if this FilePermissionCollection object
     *                                has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public FilePermissionCollection() {

    /**
     * Create an empty FilePermissionCollection object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
final class FilePermissionCollection extends PermissionCollection

/**
 * A FilePermissionCollection stores a set of FilePermission permissions.
 * FilePermission objects
 * must be stored in a manner that allows them to be inserted in any
 * order, but enable the implies function to evaluate the implies
 * method.
 * For example, if you have two FilePermissions:
 * <OL>
 * <LI> "/tmp/-", "read"
 * <LI> "/tmp/scratch/foo", "write"
 * </OL>
 * And you are calling the implies function with the FilePermission:
 * "/tmp/scratch/foo", "read,write", then the implies function must
 * take into account both the /tmp/- and /tmp/scratch/foo
 * permissions, so the effective permission is "read,write".
 *
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 *
 *
 * @author Marianne Mueller
 * @author Roland Schemers
 *
 * @serial include
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private void readObject(ObjectInputStream s)

    /**
     * readObject is called to restore the state of the FilePermission from
     * a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private void writeObject(ObjectOutputStream s)

    /**
     * WriteObject is called to save the state of the FilePermission
     * to a stream. The actions are serialized, and the superclass
     * takes care of the name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a new PermissionCollection object for storing FilePermission
     * objects.
     * <p>
     * FilePermission objects must be stored in a manner that allows them
     * to be inserted into the collection in any order, but that also enables the
     * PermissionCollection <code>implies</code>
     * method to be implemented in an efficient (and consistent) manner.
     *
     * <p>For example, if you have two FilePermissions:
     * <OL>
     * <LI>  <code>"/tmp/-", "read"</code>
     * <LI>  <code>"/tmp/scratch/foo", "write"</code>
     * </OL>
     *
     * <p>and you are calling the <code>implies</code> method with the FilePermission:
     *
     * <pre>
     *   "/tmp/scratch/foo", "read,write",
     * </pre>
     *
     * then the <code>implies</code> function must
     * take into account both the "/tmp/-" and "/tmp/scratch/foo"
     * permissions, so the effective permission is "read,write",
     * and <code>implies</code> returns true. The "implies" semantics for
     * FilePermissions are handled properly by the PermissionCollection object
     * returned by this <code>newPermissionCollection</code> method.
     *
     * @return a new PermissionCollection object suitable for storing
     * FilePermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public String getActions() {

    /**
     * Returns the "canonical string representation" of the actions.
     * That is, this method always returns present actions in the following order:
     * read, write, execute, delete, readlink. For example, if this FilePermission
     * object allows both write and read actions, a call to <code>getActions</code>
     * will return the string "read,write".
     *
     * @return the canonical string representation of the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private static String getActions(int mask) {

    /**
     * Return the canonical string representation of the actions.
     * Always returns present actions in the following order:
     * read, write, execute, delete, readlink.
     *
     * @return the canonical string representation of the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    int getMask() {

    /**
     * Return the current action mask. Used by the FilePermissionCollection.
     *
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private static int getMask(String actions) {

    /**
     * Converts an actions String to an actions mask.
     *
     * @param actions the action string.
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two FilePermission objects for equality. Checks that <i>obj</i> is
     * a FilePermission, and has the same pathname and actions as this object.
     *
     * @param obj the object we are testing for equality with this object.
     * @return <code>true</code> if obj is a FilePermission, and has the same
     *          pathname and actions as this FilePermission object,
     *          <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    boolean impliesIgnoreMask(FilePermission that) {

    /**
     * Checks if the Permission's actions are a proper subset of the
     * this object's actions. Returns the effective mask iff the
     * this FilePermission's path also implies that FilePermission's path.
     *
     * @param that the FilePermission to check against.
     * @return the effective mask
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if this FilePermission object "implies" the specified permission.
     * <P>
     * More specifically, this method returns true if:
     * <ul>
     * <li> <i>p</i> is an instanceof FilePermission,
     * <li> <i>p</i>'s actions are a proper subset of this
     * object's actions, and
     * <li> <i>p</i>'s pathname is implied by this object's
     *      pathname. For example, "/tmp/*" implies "/tmp/foo", since
     *      "/tmp/*" encompasses all files in the "/tmp" directory,
     *      including the one named "foo".
     * </ul>
     *
     * @param p the permission to check against.
     *
     * @return <code>true</code> if the specified permission is not
     *                  <code>null</code> and is implied by this object,
     *                  <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    // package private for use by the FilePermissionCollection add method

    /**
     * Creates a new FilePermission object using an action mask.
     * More efficient than the FilePermission(String, String) constructor.
     * Can be used from within
     * code that needs to create a FilePermission object to pass into the
     * <code>implies</code> method.
     *
     * @param path the pathname of the file/directory.
     * @param mask the action mask to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public FilePermission(String path, String actions) {

    /**
     * Creates a new FilePermission object with the specified actions.
     * <i>path</i> is the pathname of a file or directory, and <i>actions</i>
     * contains a comma-separated list of the desired actions granted on the
     * file or directory. Possible actions are
     * "read", "write", "execute", "delete", and "readlink".
     *
     * <p>A pathname that ends in "/*" (where "/" is
     * the file separator character, <code>File.separatorChar</code>)
     * indicates all the files and directories contained in that directory.
     * A pathname that ends with "/-" indicates (recursively) all files and
     * subdirectories contained in that directory. The special pathname
     * "&lt;&lt;ALL FILES&gt;&gt;" matches any file.
     *
     * <p>A pathname consisting of a single "*" indicates all the files
     * in the current directory, while a pathname consisting of a single "-"
     * indicates all the files in the current directory and
     * (recursively) all files and subdirectories contained in the current
     * directory.
     *
     * <p>A pathname containing an empty string represents an empty path.
     *
     * @param path the pathname of the file/directory.
     * @param actions the action string.
     *
     * @throws IllegalArgumentException
     *          If actions is <code>null</code>, empty or contains an action
     *          other than the specified possible actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private void init(int mask) {

    /**
     * initialize a FilePermission object. Common to all constructors.
     * Also called during de-serialization.
     *
     * @param mask the actions mask to use.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private String actions; // Left null as long as possible, then

    /**
     * the actions string.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int ALL     = READ|WRITE|EXECUTE|DELETE|READLINK;

    /**
     * All actions (read,write,execute,delete,readlink)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int READLINK    = 0x10;

    /**
     * Read link action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int READ    = 0x4;

    /**
     * Read action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int EXECUTE = 0x1;

    /**
     * Execute action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
public final class FilePermission extends Permission implements Serializable {

/**
 * This class represents access to a file or directory.  A FilePermission consists
 * of a pathname and a set of actions valid for that pathname.
 * <P>
 * Pathname is the pathname of the file or directory granted the specified
 * actions. A pathname that ends in "/*" (where "/" is
 * the file separator character, <code>File.separatorChar</code>) indicates
 * all the files and directories contained in that directory. A pathname
 * that ends with "/-" indicates (recursively) all files
 * and subdirectories contained in that directory. A pathname consisting of
 * the special token "&lt;&lt;ALL FILES&gt;&gt;" matches <b>any</b> file.
 * <P>
 * Note: A pathname consisting of a single "*" indicates all the files
 * in the current directory, while a pathname consisting of a single "-"
 * indicates all the files in the current directory and
 * (recursively) all files and subdirectories contained in the current
 * directory.
 * <P>
 * The actions to be granted are passed to the constructor in a string containing
 * a list of one or more comma-separated keywords. The possible keywords are
 * "read", "write", "execute", "delete", and "readlink". Their meaning is
 * defined as follows:
 *
 * <DL>
 *    <DT> read <DD> read permission
 *    <DT> write <DD> write permission
 *    <DT> execute
 *    <DD> execute permission. Allows <code>Runtime.exec</code> to
 *         be called. Corresponds to <code>SecurityManager.checkExec</code>.
 *    <DT> delete
 *    <DD> delete permission. Allows <code>File.delete</code> to
 *         be called. Corresponds to <code>SecurityManager.checkDelete</code>.
 *    <DT> readlink
 *    <DD> read link permission. Allows the target of a
 *         <a href="../nio/file/package-summary.html#links">symbolic link</a>
 *         to be read by invoking the {@link java.nio.file.Files#readSymbolicLink
 *         readSymbolicLink } method.
 * </DL>
 * <P>
 * The actions string is converted to lowercase before processing.
 * <P>
 * Be careful when granting FilePermissions. Think about the implications
 * of granting read and especially write access to various files and
 * directories. The "&lt;&lt;ALL FILES&gt;&gt;" permission with write action is
 * especially dangerous. This grants permission to write to the entire
 * file system. One thing this effectively allows is replacement of the
 * system binary, including the JVM runtime environment.
 *
 * <p>Please note: Code can always read a file from the same
 * directory it's in (or a subdirectory of that directory); it does not
 * need explicit permission to do so.
 *
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 *
 *
 * @author Marianne Mueller
 * @author Roland Schemers
 * @since 1.2
 *
 * @serial exclude
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    /*

    /**
     * @serialData "permissions" field (a Vector containing the FilePermissions).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Vector
     *     A list of FilePermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the FilePermission objects in the
     * container.
     *
     * @return an enumeration of all the FilePermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public boolean implies(Permission permission) {

    /**
     * Check and see if this set of permissions implies the permissions
     * expressed in "permission".
     *
     * @param permission the Permission object to compare
     *
     * @return true if "permission" is a proper subset of a permission in
     * the set, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the FilePermissionCollection. The key for the hash is
     * permission.path.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       FilePermission
     *
     * @exception SecurityException - if this FilePermissionCollection object
     *                                has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public FilePermissionCollection() {

    /**
     * Create an empty FilePermissionCollection object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
final class FilePermissionCollection extends PermissionCollection

/**
 * A FilePermissionCollection stores a set of FilePermission permissions.
 * FilePermission objects
 * must be stored in a manner that allows them to be inserted in any
 * order, but enable the implies function to evaluate the implies
 * method.
 * For example, if you have two FilePermissions:
 * <OL>
 * <LI> "/tmp/-", "read"
 * <LI> "/tmp/scratch/foo", "write"
 * </OL>
 * And you are calling the implies function with the FilePermission:
 * "/tmp/scratch/foo", "read,write", then the implies function must
 * take into account both the /tmp/- and /tmp/scratch/foo
 * permissions, so the effective permission is "read,write".
 *
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 *
 *
 * @author Marianne Mueller
 * @author Roland Schemers
 *
 * @serial include
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private void readObject(ObjectInputStream s)

    /**
     * readObject is called to restore the state of the FilePermission from
     * a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private void writeObject(ObjectOutputStream s)

    /**
     * WriteObject is called to save the state of the FilePermission
     * to a stream. The actions are serialized, and the superclass
     * takes care of the name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a new PermissionCollection object for storing FilePermission
     * objects.
     * <p>
     * FilePermission objects must be stored in a manner that allows them
     * to be inserted into the collection in any order, but that also enables the
     * PermissionCollection <code>implies</code>
     * method to be implemented in an efficient (and consistent) manner.
     *
     * <p>For example, if you have two FilePermissions:
     * <OL>
     * <LI>  <code>"/tmp/-", "read"</code>
     * <LI>  <code>"/tmp/scratch/foo", "write"</code>
     * </OL>
     *
     * <p>and you are calling the <code>implies</code> method with the FilePermission:
     *
     * <pre>
     *   "/tmp/scratch/foo", "read,write",
     * </pre>
     *
     * then the <code>implies</code> function must
     * take into account both the "/tmp/-" and "/tmp/scratch/foo"
     * permissions, so the effective permission is "read,write",
     * and <code>implies</code> returns true. The "implies" semantics for
     * FilePermissions are handled properly by the PermissionCollection object
     * returned by this <code>newPermissionCollection</code> method.
     *
     * @return a new PermissionCollection object suitable for storing
     * FilePermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public String getActions() {

    /**
     * Returns the "canonical string representation" of the actions.
     * That is, this method always returns present actions in the following order:
     * read, write, execute, delete, readlink. For example, if this FilePermission
     * object allows both write and read actions, a call to <code>getActions</code>
     * will return the string "read,write".
     *
     * @return the canonical string representation of the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private static String getActions(int mask) {

    /**
     * Return the canonical string representation of the actions.
     * Always returns present actions in the following order:
     * read, write, execute, delete, readlink.
     *
     * @return the canonical string representation of the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    int getMask() {

    /**
     * Return the current action mask. Used by the FilePermissionCollection.
     *
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private static int getMask(String actions) {

    /**
     * Converts an actions String to an actions mask.
     *
     * @param actions the action string.
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two FilePermission objects for equality. Checks that <i>obj</i> is
     * a FilePermission, and has the same pathname and actions as this object.
     *
     * @param obj the object we are testing for equality with this object.
     * @return <code>true</code> if obj is a FilePermission, and has the same
     *          pathname and actions as this FilePermission object,
     *          <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    boolean impliesIgnoreMask(FilePermission that) {

    /**
     * Checks if the Permission's actions are a proper subset of the
     * this object's actions. Returns the effective mask iff the
     * this FilePermission's path also implies that FilePermission's path.
     *
     * @param that the FilePermission to check against.
     * @return the effective mask
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if this FilePermission object "implies" the specified permission.
     * <P>
     * More specifically, this method returns true if:
     * <ul>
     * <li> <i>p</i> is an instanceof FilePermission,
     * <li> <i>p</i>'s actions are a proper subset of this
     * object's actions, and
     * <li> <i>p</i>'s pathname is implied by this object's
     *      pathname. For example, "/tmp/*" implies "/tmp/foo", since
     *      "/tmp/*" encompasses all files in the "/tmp" directory,
     *      including the one named "foo".
     * </ul>
     *
     * @param p the permission to check against.
     *
     * @return <code>true</code> if the specified permission is not
     *                  <code>null</code> and is implied by this object,
     *                  <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    // package private for use by the FilePermissionCollection add method

    /**
     * Creates a new FilePermission object using an action mask.
     * More efficient than the FilePermission(String, String) constructor.
     * Can be used from within
     * code that needs to create a FilePermission object to pass into the
     * <code>implies</code> method.
     *
     * @param path the pathname of the file/directory.
     * @param mask the action mask to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    public FilePermission(String path, String actions) {

    /**
     * Creates a new FilePermission object with the specified actions.
     * <i>path</i> is the pathname of a file or directory, and <i>actions</i>
     * contains a comma-separated list of the desired actions granted on the
     * file or directory. Possible actions are
     * "read", "write", "execute", "delete", and "readlink".
     *
     * <p>A pathname that ends in "/*" (where "/" is
     * the file separator character, <code>File.separatorChar</code>)
     * indicates all the files and directories contained in that directory.
     * A pathname that ends with "/-" indicates (recursively) all files and
     * subdirectories contained in that directory. The special pathname
     * "&lt;&lt;ALL FILES&gt;&gt;" matches any file.
     *
     * <p>A pathname consisting of a single "*" indicates all the files
     * in the current directory, while a pathname consisting of a single "-"
     * indicates all the files in the current directory and
     * (recursively) all files and subdirectories contained in the current
     * directory.
     *
     * <p>A pathname containing an empty string represents an empty path.
     *
     * @param path the pathname of the file/directory.
     * @param actions the action string.
     *
     * @throws IllegalArgumentException
     *          If actions is <code>null</code>, empty or contains an action
     *          other than the specified possible actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private void init(int mask) {

    /**
     * initialize a FilePermission object. Common to all constructors.
     * Also called during de-serialization.
     *
     * @param mask the actions mask to use.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private String actions; // Left null as long as possible, then

    /**
     * the actions string.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int ALL     = READ|WRITE|EXECUTE|DELETE|READLINK;

    /**
     * All actions (read,write,execute,delete,readlink)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int READLINK    = 0x10;

    /**
     * Read link action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int READ    = 0x4;

    /**
     * Read action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
    private final static int EXECUTE = 0x1;

    /**
     * Execute action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilePermission.java
public final class FilePermission extends Permission implements Serializable {

/**
 * This class represents access to a file or directory.  A FilePermission consists
 * of a pathname and a set of actions valid for that pathname.
 * <P>
 * Pathname is the pathname of the file or directory granted the specified
 * actions. A pathname that ends in "/*" (where "/" is
 * the file separator character, <code>File.separatorChar</code>) indicates
 * all the files and directories contained in that directory. A pathname
 * that ends with "/-" indicates (recursively) all files
 * and subdirectories contained in that directory. A pathname consisting of
 * the special token "&lt;&lt;ALL FILES&gt;&gt;" matches <b>any</b> file.
 * <P>
 * Note: A pathname consisting of a single "*" indicates all the files
 * in the current directory, while a pathname consisting of a single "-"
 * indicates all the files in the current directory and
 * (recursively) all files and subdirectories contained in the current
 * directory.
 * <P>
 * The actions to be granted are passed to the constructor in a string containing
 * a list of one or more comma-separated keywords. The possible keywords are
 * "read", "write", "execute", "delete", and "readlink". Their meaning is
 * defined as follows:
 *
 * <DL>
 *    <DT> read <DD> read permission
 *    <DT> write <DD> write permission
 *    <DT> execute
 *    <DD> execute permission. Allows <code>Runtime.exec</code> to
 *         be called. Corresponds to <code>SecurityManager.checkExec</code>.
 *    <DT> delete
 *    <DD> delete permission. Allows <code>File.delete</code> to
 *         be called. Corresponds to <code>SecurityManager.checkDelete</code>.
 *    <DT> readlink
 *    <DD> read link permission. Allows the target of a
 *         <a href="../nio/file/package-summary.html#links">symbolic link</a>
 *         to be read by invoking the {@link java.nio.file.Files#readSymbolicLink
 *         readSymbolicLink } method.
 * </DL>
 * <P>
 * The actions string is converted to lowercase before processing.
 * <P>
 * Be careful when granting FilePermissions. Think about the implications
 * of granting read and especially write access to various files and
 * directories. The "&lt;&lt;ALL FILES&gt;&gt;" permission with write action is
 * especially dangerous. This grants permission to write to the entire
 * file system. One thing this effectively allows is replacement of the
 * system binary, including the JVM runtime environment.
 *
 * <p>Please note: Code can always read a file from the same
 * directory it's in (or a subdirectory of that directory); it does not
 * need explicit permission to do so.
 *
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 *
 *
 * @author Marianne Mueller
 * @author Roland Schemers
 * @since 1.2
 *
 * @serial exclude
 */
