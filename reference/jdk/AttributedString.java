_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    private static <K,V> boolean mapsDiffer(Map<K, V> last, Map<K, V> attrs) {

    /**
     * Returns true if the attributes specified in last and attrs differ.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    private void setAttributes(Map<Attribute, Object> attrs, int offset) {

    /**
     * Sets the attributes for the range from offset to the next run break
     * (typically the end of the text) to the ones specified in attrs.
     * This is only meant to be called from the constructor!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    private final void appendContents(StringBuffer buf,
                                      CharacterIterator iterator) {

    /**
     * Appends the contents of the CharacterIterator iterator into the
     * StringBuffer buf.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedCharacterIterator getIterator(Attribute[] attributes, int beginIndex, int endIndex) {

    /**
     * Creates an AttributedCharacterIterator instance that provides access to
     * selected contents of this string.
     * Information about attributes not listed in attributes that the
     * implementor may have need not be made accessible through the iterator.
     * If the list is null, all available attribute information should be made
     * accessible.
     *
     * @param attributes a list of attributes that the client is interested in
     * @param beginIndex the index of the first character
     * @param endIndex the index of the character following the last character
     * @return an iterator providing access to the text and its attributes
     * @exception IllegalArgumentException if beginIndex is less then 0,
     * endIndex is greater than the length of the string, or beginIndex is
     * greater than endIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedCharacterIterator getIterator(Attribute[] attributes) {

    /**
     * Creates an AttributedCharacterIterator instance that provides access to
     * selected contents of this string.
     * Information about attributes not listed in attributes that the
     * implementor may have need not be made accessible through the iterator.
     * If the list is null, all available attribute information should be made
     * accessible.
     *
     * @param attributes a list of attributes that the client is interested in
     * @return an iterator providing access to the entire text and its selected attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedCharacterIterator getIterator() {

    /**
     * Creates an AttributedCharacterIterator instance that provides access to the entire contents of
     * this string.
     *
     * @return An iterator providing access to the text and its attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    private final int ensureRunBreak(int offset, boolean copyAttrs) {

    /**
     * Ensures there is a run break at offset, returning the index of
     * the run. If this results in splitting a run, two things can happen:
     * <ul>
     * <li>If copyAttrs is true, the attributes from the existing run
     *     will be placed in both of the newly created runs.
     * <li>If copyAttrs is false, the attributes from the existing run
     * will NOT be copied to the run to the right (>= offset) of the break,
     * but will exist on the run to the left (< offset).
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public void addAttributes(Map<? extends Attribute, ?> attributes,
                              int beginIndex, int endIndex)

    /**
     * Adds a set of attributes to a subrange of the string.
     * @param attributes The attributes to be added to the string.
     * @param beginIndex Index of the first character of the range.
     * @param endIndex Index of the character following the last
     * character of the range.
     * @exception NullPointerException if <code>attributes</code> is null.
     * @exception IllegalArgumentException if beginIndex is less then
     * 0, endIndex is greater than the length of the string, or
     * beginIndex and endIndex together don't define a non-empty
     * subrange of the string and the attributes parameter is not an
     * empty Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public void addAttribute(Attribute attribute, Object value,
            int beginIndex, int endIndex) {

    /**
     * Adds an attribute to a subrange of the string.
     * @param attribute the attribute key
     * @param value The value of the attribute. May be null.
     * @param beginIndex Index of the first character of the range.
     * @param endIndex Index of the character following the last character of the range.
     * @exception NullPointerException if <code>attribute</code> is null.
     * @exception IllegalArgumentException if beginIndex is less then 0, endIndex is
     * greater than the length of the string, or beginIndex and endIndex together don't
     * define a non-empty subrange of the string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public void addAttribute(Attribute attribute, Object value) {

    /**
     * Adds an attribute to the entire string.
     * @param attribute the attribute key
     * @param value the value of the attribute; may be null
     * @exception NullPointerException if <code>attribute</code> is null.
     * @exception IllegalArgumentException if the AttributedString has length 0
     * (attributes cannot be applied to a 0-length range).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedString(AttributedCharacterIterator text,
                            int beginIndex,
                            int endIndex,
                            Attribute[] attributes) {

    /**
     * Constructs an AttributedString instance with the subrange of
     * the given attributed text represented by
     * AttributedCharacterIterator.  Only attributes that match the
     * given attributes will be incorporated into the instance. If the
     * given range produces an empty text, all attributes will be
     * discarded. Note that any attributes wrapped by an Annotation
     * object are discarded for a subrange of the original attribute
     * range.
     *
     * @param text The text for this attributed string.
     * @param beginIndex Index of the first character of the range.
     * @param endIndex Index of the character following the last character
     * of the range.
     * @param attributes Specifies attributes to be extracted
     * from the text. If null is specified, all available attributes will
     * be used.
     * @exception NullPointerException if <code>text</code> is null.
     * @exception IllegalArgumentException if the subrange given by
     * beginIndex and endIndex is out of the text range.
     * @see java.text.Annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedString(AttributedCharacterIterator text,
                            int beginIndex,
                            int endIndex) {

    /**
     * Constructs an AttributedString instance with the subrange of
     * the given attributed text represented by
     * AttributedCharacterIterator. If the given range produces an
     * empty text, all attributes will be discarded.  Note that any
     * attributes wrapped by an Annotation object are discarded for a
     * subrange of the original attribute range.
     *
     * @param text The text for this attributed string.
     * @param beginIndex Index of the first character of the range.
     * @param endIndex Index of the character following the last character
     * of the range.
     * @exception NullPointerException if <code>text</code> is null.
     * @exception IllegalArgumentException if the subrange given by
     * beginIndex and endIndex is out of the text range.
     * @see java.text.Annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedString(AttributedCharacterIterator text) {

    /**
     * Constructs an AttributedString instance with the given attributed
     * text represented by AttributedCharacterIterator.
     * @param text The text for this attributed string.
     * @exception NullPointerException if <code>text</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedString(String text,
                            Map<? extends Attribute, ?> attributes)

    /**
     * Constructs an AttributedString instance with the given text and attributes.
     * @param text The text for this attributed string.
     * @param attributes The attributes that apply to the entire string.
     * @exception NullPointerException if <code>text</code> or
     *            <code>attributes</code> is null.
     * @exception IllegalArgumentException if the text has length 0
     * and the attributes parameter is not an empty Map (attributes
     * cannot be applied to a 0-length range).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    public AttributedString(String text) {

    /**
     * Constructs an AttributedString instance with the given text.
     * @param text The text for this attributed string.
     * @exception NullPointerException if <code>text</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
    AttributedString(AttributedCharacterIterator[] iterators) {

    /**
     * Constructs an AttributedString instance with the given
     * AttributedCharacterIterators.
     *
     * @param iterators AttributedCharacterIterators to construct
     * AttributedString from.
     * @throws NullPointerException if iterators is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/AttributedString.java
public class AttributedString {

/**
 * An AttributedString holds text and related attribute information. It
 * may be used as the actual data storage in some cases where a text
 * reader wants to access attributed text through the AttributedCharacterIterator
 * interface.
 *
 * <p>
 * An attribute is a key/value pair, identified by the key.  No two
 * attributes on a given character can have the same key.
 *
 * <p>The values for an attribute are immutable, or must not be mutated
 * by clients or storage.  They are always passed by reference, and not
 * cloned.
 *
 * @see AttributedCharacterIterator
 * @see Annotation
 * @since 1.2
 */
