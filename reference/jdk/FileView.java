_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileView.java
    public Boolean isTraversable(File f) {

    /**
     * Whether the directory is traversable or not. This might be
     * useful, for example, if you want a directory to represent
     * a compound document and don't want the user to descend into it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileView.java
    public Icon getIcon(File f) {

    /**
     * The icon that represents this file in the <code>JFileChooser</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileView.java
    public String getTypeDescription(File f) {

    /**
     * A human readable description of the type of the file. For
     * example, a <code>jpg</code> file might have a type description of:
     * "A JPEG Compressed Image File"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileView.java
    public String getDescription(File f) {

    /**
     * A human readable description of the file. For example,
     * a file named <i>jag.jpg</i> might have a description that read:
     * "A JPEG image file of James Gosling's face".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/filechooser/FileView.java
public abstract class FileView {

/**
 * <code>FileView</code> defines an abstract class that can be implemented
 * to provide the filechooser with UI information for a <code>File</code>.
 * Each L&amp;F <code>JFileChooserUI</code> object implements this
 * class to pass back the correct icons and type descriptions specific to
 * that L&amp;F. For example, the Microsoft Windows L&amp;F returns the
 * generic Windows icons for directories and generic files.
 * Additionally, you may want to provide your own <code>FileView</code> to
 * <code>JFileChooser</code> to return different icons or additional
 * information using {@link javax.swing.JFileChooser#setFileView}.
 *
 * <p>
 *
 * <code>JFileChooser</code> first looks to see if there is a user defined
 * <code>FileView</code>, if there is, it gets type information from
 * there first. If <code>FileView</code> returns <code>null</code> for
 * any method, <code>JFileChooser</code> then uses the L&amp;F specific
 * view to get the information.
 * So, for example, if you provide a <code>FileView</code> class that
 * returns an <code>Icon</code> for JPG files, and returns <code>null</code>
 * icons for all other files, the UI's <code>FileView</code> will provide
 * default icons for all other files.
 *
 * <p>
 *
 * For an example implementation of a simple file view, see
 * <code><i>yourJDK</i>/demo/jfc/FileChooserDemo/ExampleFileView.java</code>.
 * For more information and examples see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html">How to Use File Choosers</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * @see javax.swing.JFileChooser
 *
 * @author Jeff Dinkins
 *
 */
