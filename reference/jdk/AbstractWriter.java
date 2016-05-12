_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private int indexOf(char[] chars, char sChar, int startIndex,
                        int endIndex) {

    /**
     * Support method to locate an occurrence of a particular character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void output(char[] content, int start, int length)

    /**
     * The last stop in writing out content. All the write methods eventually
     * make it to this method, which invokes <code>write</code> on the
     * Writer.
     * <p>This method also updates the line length based on
     * <code>length</code>. If this is invoked to output a newline, the
     * current line length will need to be reset as will no longer be
     * valid. If it is up to the caller to do this. Use
     * <code>writeLineSeparator</code> to write out a newline, which will
     * property update the current line length.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void writeAttributes(AttributeSet attr) throws IOException {

    /**
     * Writes out the set of attributes as " &lt;name&gt;=&lt;value&gt;"
     * pairs. It throws an IOException when encountered.
     *
     * @param     attr an AttributeSet.
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void write(char[] chars, int startIndex, int length)

    /**
     * All write methods call into this one. If <code>getCanWrapLines()</code>
     * returns false, this will call <code>output</code> with each sequence
     * of <code>chars</code> that doesn't contain a NEWLINE, followed
     * by a call to <code>writeLineSeparator</code>. On the other hand,
     * if <code>getCanWrapLines()</code> returns true, this will split the
     * string, as necessary, so <code>getLineLength</code> is honored.
     * The only exception is if the current string contains no whitespace,
     * and won't fit in which case the line length will exceed
     * <code>getLineLength</code>.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void writeLineSeparator() throws IOException {

    /**
     * Writes the line separator. This invokes <code>output</code> directly
     * as well as setting the <code>lineLength</code> to 0.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void write(String content) throws IOException {

    /**
     * Writes out a string. This is implemented to invoke the
     * <code>write</code> method that takes a char[].
     *
     * @param     content a String.
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void write(char ch) throws IOException {

    /**
     * Writes out a character. This is implemented to invoke
     * the <code>write</code> method that takes a char[].
     *
     * @param     ch a char.
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void indent() throws IOException {

    /**
     * Does indentation. The number of spaces written
     * out is indent level times the space to map mapping. If the current
     * line is empty, this will not make it so that the current line is
     * still considered empty.
     *
     * @exception IOException on any I/O error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected int getIndentLevel() {

    /**
     * Returns the current indentation level. That is, the number of times
     * <code>incrIndent</code> has been invoked minus the number of times
     * <code>decrIndent</code> has been invoked.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void decrIndent() {

    /**
     * Decrements the indent level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void incrIndent() {

    /**
     * Increments the indent level. If indenting would cause
     * <code>getIndentSpace()</code> *<code>getIndentLevel()</code> to be &gt;
     * than <code>getLineLength()</code> this will not cause an indent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    public String getLineSeparator() {

    /**
     * Returns the string used to represent newlines.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    public void setLineSeparator(String value) {

    /**
     * Sets the String used to represent newlines. This is initialized
     * in the constructor from either the Document, or the System property
     * line.separator.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected int getIndentSpace() {

    /**
     * Returns the amount of space to indent.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void setIndentSpace(int space) {

    /**
     * Enables subclasses to specify how many spaces an indent
     * maps to. When indentation takes place, the indent level
     * is multiplied by this mapping.  The default is 2.
     *
     * @param space an int representing the space to indent mapping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected boolean getCanWrapLines() {

    /**
     * Returns whether or not the lines can be wrapped. If this is false
     * no lineSeparator's will be output.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void setCanWrapLines(boolean newValue) {

    /**
     * Sets whether or not lines can be wrapped. This can be toggled
     * during the writing of lines. For example, outputting HTML might
     * set this to false when outputting a quoted string.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected boolean isLineEmpty() {

    /**
     * Returns true if the current line should be considered empty. This
     * is true when <code>getCurrentLineLength</code> == 0 ||
     * <code>indent</code> has been invoked on an empty line.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected int getCurrentLineLength() {

    /**
     * Returns the current line length.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void setCurrentLineLength(int length) {

    /**
     * Sets the current line length.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected int getLineLength() {

    /**
     * Returns the maximum line length.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void setLineLength(int l) {

    /**
     * Enables subclasses to set the number of characters they
     * want written per line.   The default is 100.
     *
     * @param l the maximum line length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected void text(Element elem) throws BadLocationException,

    /**
     * Writes out text.  If a range is specified when the constructor
     * is invoked, then only the appropriate range of text is written
     * out.
     *
     * @param     elem an Element.
     * @exception IOException on any I/O error
     * @exception BadLocationException if pos represents an invalid
     *            location within the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected String getText(Element elem) throws BadLocationException {

    /**
     * Returns the text associated with the element.
     * The assumption here is that the element is a
     * leaf element.  Throws a BadLocationException
     * when encountered.
     *
     * @param     elem an <code>Element</code>
     * @exception BadLocationException if pos represents an invalid
     *            location within the document
     * @return    the text as a <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    abstract protected void write() throws IOException, BadLocationException;

    /**
     * This abstract method needs to be implemented
     * by subclasses.  Its responsibility is to
     * iterate over the elements and use the write()
     * methods to generate output in the desired format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected boolean inRange(Element next) {

    /**
     * This method determines whether the current element
     * is in the range specified.  When no range is specified,
     * the range is initialized to be the entire document.
     * inRange() returns true if the range specified intersects
     * with the element's range.
     *
     * @param  next an Element.
     * @return boolean that indicates whether the element
     *         is in the range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected Document getDocument() {

    /**
     * Fetches the document.
     *
     * @return the Document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected Writer getWriter() {

    /**
     * Returns the Writer that is used to output the content.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected ElementIterator getElementIterator() {

    /**
     * Fetches the ElementIterator.
     *
     * @return the ElementIterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    public int getEndOffset() {

    /**
     * Returns the last offset to be output.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    public int getStartOffset() {

    /**
     * Returns the first offset to be output.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected AbstractWriter(Writer w, Element root, int pos, int len) {

    /**
     * Creates a new AbstractWriter.
     * Initializes the ElementIterator with the
     * element passed in.
     *
     * @param w a Writer
     * @param root an Element
     * @param pos The location in the document to fetch the
     *   content.
     * @param len The amount to write out.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected AbstractWriter(Writer w, Element root) {

    /**
     * Creates a new AbstractWriter.
     * Initializes the ElementIterator with the
     * element passed in.
     *
     * @param w a Writer
     * @param root an Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected AbstractWriter(Writer w, Document doc, int pos, int len) {

    /**
     * Creates a new AbstractWriter.
     * Initializes the ElementIterator with the
     * element passed in.
     *
     * @param w a Writer
     * @param doc an Element
     * @param pos The location in the document to fetch the
     *   content.
     * @param len The amount to write out.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected AbstractWriter(Writer w, Document doc) {

    /**
     * Creates a new AbstractWriter.
     * Initializes the ElementIterator with the default
     * root of the document.
     *
     * @param w a Writer.
     * @param doc a Document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    protected static final char NEWLINE = '\n';

    /**
     * How the text packages models newlines.
     * @see #getLineSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private Segment segment;

    /**
     * Used for writing text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private char[] newlineChars;

    /**
     * This is used in <code>writeLineSeparator</code> instead of
     * tempChars. If tempChars were used it would mean write couldn't invoke
     * <code>writeLineSeparator</code> as it might have been passed
     * tempChars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private char[] tempChars;

    /**
     * Used when writing out a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private char[] indentChars;

    /**
     * Used when indenting. Will contain the spaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private boolean isLineEmpty;

    /**
     * True while the current line is empty. This will remain true after
     * indenting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private boolean canWrapLines;

    /**
     * True indicates that when writing, the line can be split, false
     * indicates that even if the line is > than max line length it should
     * not be split.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
    private String lineSeparator;

    /**
     * String used for end of line. If the Document has the property
     * EndOfLineStringProperty, it will be used for newlines. Otherwise
     * the System property line.separator will be used. The line separator
     * can also be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractWriter.java
public abstract class AbstractWriter {

/**
 * AbstractWriter is an abstract class that actually
 * does the work of writing out the element tree
 * including the attributes.  In terms of how much is
 * written out per line, the writer defaults to 100.
 * But this value can be set by subclasses.
 *
 * @author Sunita Mani
 */
