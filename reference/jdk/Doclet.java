_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static LanguageVersion languageVersion() {

    /**
     * Return the version of the Java Programming Language supported
     * by this doclet.
     * <p>
     * This method is required by any doclet supporting a language version
     * newer than 1.1.
     *
     * @return  the language version supported by this doclet.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static boolean validOptions(String options[][],
                                       DocErrorReporter reporter) {

    /**
     * Check that options have the correct arguments.
     * <P>
     * This method is not required, but is recommended,
     * as every option will be considered valid if this method
     * is not present.  It will default gracefully (to true)
     * if absent.
     * <P>
     * Printing option related error messages (using the provided
     * DocErrorReporter) is the responsibility of this method.
     *
     * @return true if the options are valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static int optionLength(String option) {

    /**
     * Check for doclet-added options.  Returns the number of
     * arguments you must specify on the command line for the
     * given option.  For example, "-d docs" would return 2.
     * <P>
     * This method is required if the doclet contains any options.
     * If this method is missing, Javadoc will print an invalid flag
     * error for every option.
     *
     * @return number of arguments on the command line for an option
     *         including the option name itself.  Zero return means
     *         option not known.  Negative value means error occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static boolean start(RootDoc root) {

    /**
     * Generate documentation here.
     * This method is required for all doclets.
     *
     * @return true on success.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
public abstract class Doclet {

/**
 * This is an example of a starting class for a doclet,
 * showing the entry-point methods.  A starting class must
 * import com.sun.javadoc.* and implement the
 * <code>start(RootDoc)</code> method, as described in the
 * <a href="package-summary.html#package_description">package
 * description</a>.  If the doclet takes command line options,
 * it must also implement <code>optionLength</code> and
 * <code>validOptions</code>.
 *
 * <p> A doclet supporting the language features added since 1.1
 * (such as generics and annotations) should indicate this
 * by implementing <code>languageVersion</code>.  In the absence of
 * this the doclet should not invoke any of the Doclet API methods
 * added since 1.5, and
 * the results of several other methods are modified so as
 * to conceal the new constructs (such as type parameters) from
 * the doclet.
 *
 * <p> To start the doclet, pass
 * <code>-doclet</code> followed by the fully-qualified
 * name of the starting class on the javadoc tool command line.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static LanguageVersion languageVersion() {

    /**
     * Return the version of the Java Programming Language supported
     * by this doclet.
     * <p>
     * This method is required by any doclet supporting a language version
     * newer than 1.1.
     *
     * @return  the language version supported by this doclet.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static boolean validOptions(String options[][],
                                       DocErrorReporter reporter) {

    /**
     * Check that options have the correct arguments.
     * <P>
     * This method is not required, but is recommended,
     * as every option will be considered valid if this method
     * is not present.  It will default gracefully (to true)
     * if absent.
     * <P>
     * Printing option related error messages (using the provided
     * DocErrorReporter) is the responsibility of this method.
     *
     * @return true if the options are valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static int optionLength(String option) {

    /**
     * Check for doclet-added options.  Returns the number of
     * arguments you must specify on the command line for the
     * given option.  For example, "-d docs" would return 2.
     * <P>
     * This method is required if the doclet contains any options.
     * If this method is missing, Javadoc will print an invalid flag
     * error for every option.
     *
     * @return number of arguments on the command line for an option
     *         including the option name itself.  Zero return means
     *         option not known.  Negative value means error occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
    public static boolean start(RootDoc root) {

    /**
     * Generate documentation here.
     * This method is required for all doclets.
     *
     * @return true on success.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Doclet.java
public abstract class Doclet {

/**
 * This is an example of a starting class for a doclet,
 * showing the entry-point methods.  A starting class must
 * import com.sun.javadoc.* and implement the
 * <code>start(RootDoc)</code> method, as described in the
 * <a href="package-summary.html#package_description">package
 * description</a>.  If the doclet takes command line options,
 * it must also implement <code>optionLength</code> and
 * <code>validOptions</code>.
 *
 * <p> A doclet supporting the language features added since 1.1
 * (such as generics and annotations) should indicate this
 * by implementing <code>languageVersion</code>.  In the absence of
 * this the doclet should not invoke any of the Doclet API methods
 * added since 1.5, and
 * the results of several other methods are modified so as
 * to conceal the new constructs (such as type parameters) from
 * the doclet.
 *
 * <p> To start the doclet, pass
 * <code>-doclet</code> followed by the fully-qualified
 * name of the starting class on the javadoc tool command line.
 */
