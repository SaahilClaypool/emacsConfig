_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public int getNumberOfGroups() {

    /**
     * Return the number of regular expression groups.
     * This method returns 1 when the regular expression has no capturing-parenthesis.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public int hashCode() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean equals(Object obj) {

    /**
     *  Return true if patterns are the same and the options are equivalent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public String getOptions() {

    /**
     * Returns a option string.
     * The order of letters in it may be different from a string specified
     * in a constructor or <code>setPattern()</code>.
     *
     * @see #RegularExpression(java.lang.String,java.lang.String)
     * @see #setPattern(java.lang.String,java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public String toString() {

    /**
     * Represents this instence in String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public String getPattern() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public void setPattern(String newPattern, String options) throws ParseException {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public void setPattern(String newPattern) throws ParseException {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public RegularExpression(String regex, String options, Locale locale) throws ParseException {

    /**
     * Creates a new RegularExpression instance with options.
     *
     * @param regex A regular expression
     * @param options A String consisted of "i" "m" "s" "u" "w" "," "X"
     * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public RegularExpression(String regex, String options) throws ParseException {

    /**
     * Creates a new RegularExpression instance with options.
     *
     * @param regex A regular expression
     * @param options A String consisted of "i" "m" "s" "u" "w" "," "X"
     * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public RegularExpression(String regex) throws ParseException {

    /**
     * Creates a new RegularExpression instance.
     *
     * @param regex A regular expression
     * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int XMLSCHEMA_MODE = 1<<9;

    /**
     * "X". XML Schema mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int PROHIBIT_HEAD_CHARACTER_OPTIMIZATION = 1<<7;

    /**
     * "H"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int UNICODE_WORD_BOUNDARY = 1<<6; // "w"

    /**
     * An option.
     * This enables to process locale-independent word boundary for <span class="REGEX"><kbd>\b \B \&lt; \></kbd></span>.
     * <p>By default, the engine considers a position between a word character
     * (<span class="REGEX"><Kbd>\w</kbd></span>) and a non word character
     * is a word boundary.
     * <p>By this option, the engine checks word boundaries with the method of
     * 'Unicode Regular Expression Guidelines' Revision 4.
     *
     * @see #RegularExpression(java.lang.String,int)
     * @see #setPattern(java.lang.String,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int USE_UNICODE_CATEGORY = 1<<5; // "u"

    /**
     * This option redefines <span class="REGEX"><kbd>\d \D \w \W \s \S</kbd></span>.
     *
     * @see #RegularExpression(java.lang.String,int)
     * @see #setPattern(java.lang.String,int)
     * @see #UNICODE_WORD_BOUNDARY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int EXTENDED_COMMENT = 1<<4;

    /**
     * "x"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int MULTIPLE_LINES = 1<<3;

    /**
     * "m"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int SINGLE_LINE = 1<<2;

    /**
     * "s"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    /**

    /**
     * An option.
     * If you specify this option, <span class="REGEX"><kbd>(</kbd><var>X</var><kbd>)</kbd></span>
     * captures matched text, and <span class="REGEX"><kbd>(:?</kbd><var>X</var><kbd>)</kbd></span>
     * does not capture.
     *
     * @see #RegularExpression(java.lang.String,int)
     * @see #setPattern(java.lang.String,int)
    static final int MARK_PARENS = 1<<0;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    void prepare() {

    /**
     * Prepares for matching.  This method is called just before starting matching.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    int nofparen;

    /**
     * The number of parenthesis in the regular expression.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    String regex;

    /**
     * A regular expression.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(CharacterIterator  target, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(CharacterIterator target) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    private int match(Context con, Op op, int offset, int dx, int opts) {

    /**
     * @return -1 when not match; offset of the end of matched string when match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target, int start, int end, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target, int start, int end) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[] target, int start, int end, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[]  target, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[]  target, int start, int end) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[]  target) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    private Op compile(Token tok, Op next, boolean reverse) {

    /**
     * Converts a token to an operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    private synchronized void compile(Token tok) {

    /**
     * Compiles a token tree into an operation flow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
public class RegularExpression implements java.io.Serializable {

/**
 * A regular expression matching engine using Non-deterministic Finite Automaton (NFA).
 * This engine does not conform to the POSIX regular expression.
 *
 * <hr width="50%">
 * <h3>How to use</h3>
 *
 * <dl>
 *   <dt>A. Standard way
 *   <dd>
 * <pre>
 * RegularExpression re = new RegularExpression(<var>regex</var>);
 * if (re.matches(text)) { ... }
 * </pre>
 *
 *   <dt>B. Capturing groups
 *   <dd>
 * <pre>
 * RegularExpression re = new RegularExpression(<var>regex</var>);
 * Match match = new Match();
 * if (re.matches(text, match)) {
 *     ... // You can refer captured texts with methods of the <code>Match</code> class.
 * }
 * </pre>
 *
 * </dl>
 *
 * <h4>Case-insensitive matching</h4>
 * <pre>
 * RegularExpression re = new RegularExpression(<var>regex</var>, "i");
 * if (re.matches(text) >= 0) { ...}
 * </pre>
 *
 * <h4>Options</h4>
 * <p>You can specify options to <a href="#RegularExpression(java.lang.String, java.lang.String)"><code>RegularExpression(</code><var>regex</var><code>, </code><var>options</var><code>)</code></a>
 *    or <a href="#setPattern(java.lang.String, java.lang.String)"><code>setPattern(</code><var>regex</var><code>, </code><var>options</var><code>)</code></a>.
 *    This <var>options</var> parameter consists of the following characters.
 * </p>
 * <dl>
 *   <dt><a name="I_OPTION"><code>"i"</code></a>
 *   <dd>This option indicates case-insensitive matching.
 *   <dt><a name="M_OPTION"><code>"m"</code></a>
 *   <dd class="REGEX"><kbd>^</kbd> and <kbd>$</kbd> consider the EOL characters within the text.
 *   <dt><a name="S_OPTION"><code>"s"</code></a>
 *   <dd class="REGEX"><kbd>.</kbd> matches any one character.
 *   <dt><a name="U_OPTION"><code>"u"</code></a>
 *   <dd class="REGEX">Redefines <Kbd>\d \D \w \W \s \S \b \B \&lt; \></kbd> as becoming to Unicode.
 *   <dt><a name="W_OPTION"><code>"w"</code></a>
 *   <dd class="REGEX">By this option, <kbd>\b \B \&lt; \></kbd> are processed with the method of
 *      'Unicode Regular Expression Guidelines' Revision 4.
 *      When "w" and "u" are specified at the same time,
 *      <kbd>\b \B \&lt; \></kbd> are processed for the "w" option.
 *   <dt><a name="COMMA_OPTION"><code>","</code></a>
 *   <dd>The parser treats a comma in a character class as a range separator.
 *      <kbd class="REGEX">[a,b]</kbd> matches <kbd>a</kbd> or <kbd>,</kbd> or <kbd>b</kbd> without this option.
 *      <kbd class="REGEX">[a,b]</kbd> matches <kbd>a</kbd> or <kbd>b</kbd> with this option.
 *
 *   <dt><a name="X_OPTION"><code>"X"</code></a>
 *   <dd class="REGEX">
 *       By this option, the engine confoms to <a href="http://www.w3.org/TR/2000/WD-xmlschema-2-20000407/#regexs">XML Schema: Regular Expression</a>.
 *       The <code>match()</code> method does not do subsring matching
 *       but entire string matching.
 *
 * </dl>
 *
 * <hr width="50%">
 * <h3>Syntax</h3>
 * <table border="1" bgcolor="#ddeeff">
 *   <tr>
 *    <td>
 *     <h4>Differences from the Perl 5 regular expression</h4>
 *     <ul>
 *      <li>There is 6-digit hexadecimal character representation  (<kbd>\u005cv</kbd><var>HHHHHH</var>.)
 *      <li>Supports subtraction, union, and intersection operations for character classes.
 *      <li>Not supported: <kbd>\</kbd><var>ooo</var> (Octal character representations),
 *          <Kbd>\G</kbd>, <kbd>\C</kbd>, <kbd>\l</kbd><var>c</var>,
 *          <kbd>\u005c u</kbd><var>c</var>, <kbd>\L</kbd>, <kbd>\U</kbd>,
 *          <kbd>\E</kbd>, <kbd>\Q</kbd>, <kbd>\N{</kbd><var>name</var><kbd>}</kbd>,
 *          <Kbd>(?{<kbd><var>code</var><kbd>})</kbd>, <Kbd>(??{<kbd><var>code</var><kbd>})</kbd>
 *     </ul>
 *    </td>
 *   </tr>
 * </table>
 *
 * <P>Meta characters are `<KBD>. * + ? { [ ( ) | \ ^ $</KBD>'.</P>
 * <ul>
 *   <li>Character
 *     <dl>
 *       <dt class="REGEX"><kbd>.</kbd> (A period)
 *       <dd>Matches any one character except the following characters.
 *       <dd>LINE FEED (U+000A), CARRIAGE RETURN (U+000D),
 *           PARAGRAPH SEPARATOR (U+2029), LINE SEPARATOR (U+2028)
 *       <dd>This expression matches one code point in Unicode. It can match a pair of surrogates.
 *       <dd>When <a href="#S_OPTION">the "s" option</a> is specified,
 *           it matches any character including the above four characters.
 *
 *       <dt class="REGEX"><Kbd>\e \f \n \r \t</kbd>
 *       <dd>Matches ESCAPE (U+001B), FORM FEED (U+000C), LINE FEED (U+000A),
 *           CARRIAGE RETURN (U+000D), HORIZONTAL TABULATION (U+0009)
 *
 *       <dt class="REGEX"><kbd>\c</kbd><var>C</var>
 *       <dd>Matches a control character.
 *           The <var>C</var> must be one of '<kbd>@</kbd>', '<kbd>A</kbd>'-'<kbd>Z</kbd>',
 *           '<kbd>[</kbd>', '<kbd>\u005c</kbd>', '<kbd>]</kbd>', '<kbd>^</kbd>', '<kbd>_</kbd>'.
 *           It matches a control character of which the character code is less than
 *           the character code of the <var>C</var> by 0x0040.
 *       <dd class="REGEX">For example, a <kbd>\cJ</kbd> matches a LINE FEED (U+000A),
 *           and a <kbd>\c[</kbd> matches an ESCAPE (U+001B).
 *
 *       <dt class="REGEX">a non-meta character
 *       <dd>Matches the character.
 *
 *       <dt class="REGEX"><KBD>\</KBD> + a meta character
 *       <dd>Matches the meta character.
 *
 *       <dt class="REGEX"><kbd>\u005cx</kbd><var>HH</var> <kbd>\u005cx{</kbd><var>HHHH</var><kbd>}</kbd>
 *       <dd>Matches a character of which code point is <var>HH</var> (Hexadecimal) in Unicode.
 *           You can write just 2 digits for <kbd>\u005cx</kbd><var>HH</var>, and
 *           variable length digits for <kbd>\u005cx{</kbd><var>HHHH</var><kbd>}</kbd>.
 *
 *       <!--
 *       <dt class="REGEX"><kbd>\u005c u</kbd><var>HHHH</var>
 *       <dd>Matches a character of which code point is <var>HHHH</var> (Hexadecimal) in Unicode.
 *       -->
 *
 *       <dt class="REGEX"><kbd>\u005cv</kbd><var>HHHHHH</var>
 *       <dd>Matches a character of which code point is <var>HHHHHH</var> (Hexadecimal) in Unicode.
 *
 *       <dt class="REGEX"><kbd>\g</kbd>
 *       <dd>Matches a grapheme.
 *       <dd class="REGEX">It is equivalent to <kbd>(?[\p{ASSIGNED}]-[\p{M}\p{C}])?(?:\p{M}|[\x{094D}\x{09CD}\x{0A4D}\x{0ACD}\x{0B3D}\x{0BCD}\x{0C4D}\x{0CCD}\x{0D4D}\x{0E3A}\x{0F84}]\p{L}|[\x{1160}-\x{11A7}]|[\x{11A8}-\x{11FF}]|[\x{FF9E}\x{FF9F}])*</kbd>
 *
 *       <dt class="REGEX"><kbd>\X</kbd>
 *       <dd class="REGEX">Matches a combining character sequence.
 *       It is equivalent to <kbd>(?:\PM\pM*)</kbd>
 *     </dl>
 *   </li>
 *
 *   <li>Character class
 *     <dl>
+ *       <dt class="REGEX"><kbd>[</kbd><var>R<sub>1</sub></var><var>R<sub>2</sub></var><var>...</var><var>R<sub>n</sub></var><kbd>]</kbd> (without <a href="#COMMA_OPTION">"," option</a>)
+ *       <dt class="REGEX"><kbd>[</kbd><var>R<sub>1</sub></var><kbd>,</kbd><var>R<sub>2</sub></var><kbd>,</kbd><var>...</var><kbd>,</kbd><var>R<sub>n</sub></var><kbd>]</kbd> (with <a href="#COMMA_OPTION">"," option</a>)
 *       <dd>Positive character class.  It matches a character in ranges.
 *       <dd><var>R<sub>n</sub></var>:
 *       <ul>
 *         <li class="REGEX">A character (including <Kbd>\e \f \n \r \t</kbd> <kbd>\u005cx</kbd><var>HH</var> <kbd>\u005cx{</kbd><var>HHHH</var><kbd>}</kbd> <!--kbd>\u005c u</kbd><var>HHHH</var--> <kbd>\u005cv</kbd><var>HHHHHH</var>)
 *             <p>This range matches the character.
 *         <li class="REGEX"><var>C<sub>1</sub></var><kbd>-</kbd><var>C<sub>2</sub></var>
 *             <p>This range matches a character which has a code point that is >= <var>C<sub>1</sub></var>'s code point and &lt;= <var>C<sub>2</sub></var>'s code point.
+ *         <li class="REGEX">A POSIX character class: <Kbd>[:alpha:] [:alnum:] [:ascii:] [:cntrl:] [:digit:] [:graph:] [:lower:] [:print:] [:punct:] [:space:] [:upper:] [:xdigit:]</kbd>,
+ *             and negative POSIX character classes in Perl like <kbd>[:^alpha:]</kbd>
 *             <p>...
 *         <li class="REGEX"><kbd>\d \D \s \S \w \W \p{</kbd><var>name</var><kbd>} \P{</kbd><var>name</var><kbd>}</kbd>
 *             <p>These expressions specifies the same ranges as the following expressions.
 *       </ul>
 *       <p class="REGEX">Enumerated ranges are merged (union operation).
 *          <kbd>[a-ec-z]</kbd> is equivalent to <kbd>[a-z]</kbd>
 *
 *       <dt class="REGEX"><kbd>[^</kbd><var>R<sub>1</sub></var><var>R<sub>2</sub></var><var>...</var><var>R<sub>n</sub></var><kbd>]</kbd> (without a <a href="#COMMA_OPTION">"," option</a>)
 *       <dt class="REGEX"><kbd>[^</kbd><var>R<sub>1</sub></var><kbd>,</kbd><var>R<sub>2</sub></var><kbd>,</kbd><var>...</var><kbd>,</kbd><var>R<sub>n</sub></var><kbd>]</kbd> (with a <a href="#COMMA_OPTION">"," option</a>)
 *       <dd>Negative character class.  It matches a character not in ranges.
 *
 *       <dt class="REGEX"><kbd>(?[</kbd><var>ranges</var><kbd>]</kbd><var>op</var><kbd>[</kbd><var>ranges</var><kbd>]</kbd><var>op</var><kbd>[</kbd><var>ranges</var><kbd>]</kbd> ... <Kbd>)</kbd>
 *       (<var>op</var> is <kbd>-</kbd> or <kbd>+</kbd> or <kbd>&</kbd>.)
 *       <dd>Subtraction or union or intersection for character classes.
 *       <dd class="REGEX">For exmaple, <kbd>(?[A-Z]-[CF])</kbd> is equivalent to <kbd>[A-BD-EG-Z]</kbd>, and <kbd>(?[0x00-0x7f]-[K]&[\p{Lu}])</kbd> is equivalent to <kbd>[A-JL-Z]</kbd>.
 *       <dd>The result of this operations is a <u>positive character class</u>
 *           even if an expression includes any negative character classes.
 *           You have to take care on this in case-insensitive matching.
 *           For instance, <kbd>(?[^b])</kbd> is equivalent to <kbd>[\x00-ac-\x{10ffff}]</kbd>,
 *           which is equivalent to <kbd>[^b]</kbd> in case-sensitive matching.
 *           But, in case-insensitive matching, <kbd>(?[^b])</kbd> matches any character because
 *           it includes '<kbd>B</kbd>' and '<kbd>B</kbd>' matches '<kbd>b</kbd>'
 *           though <kbd>[^b]</kbd> is processed as <kbd>[^Bb]</kbd>.
 *
 *       <dt class="REGEX"><kbd>[</kbd><var>R<sub>1</sub>R<sub>2</sub>...</var><kbd>-[</kbd><var>R<sub>n</sub>R<sub>n+1</sub>...</var><kbd>]]</kbd> (with an <a href="#X_OPTION">"X" option</a>)</dt>
 *       <dd>Character class subtraction for the XML Schema.
 *           You can use this syntax when you specify an <a href="#X_OPTION">"X" option</a>.
 *
 *       <dt class="REGEX"><kbd>\d</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[0-9]</kbd>.
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>\p{Nd}</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\D</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[^0-9]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>\P{Nd}</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\s</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[ \f\n\r\t]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[ \f\n\r\t\p{Z}]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\S</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[^ \f\n\r\t]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[^ \f\n\r\t\p{Z}]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\w</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[a-zA-Z0-9_]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[\p{Lu}\p{Ll}\p{Lo}\p{Nd}_]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\W</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[^a-zA-Z0-9_]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[^\p{Lu}\p{Ll}\p{Lo}\p{Nd}_]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\p{</kbd><var>name</var><kbd>}</kbd>
 *       <dd>Matches one character in the specified General Category (the second field in <a href="ftp://ftp.unicode.org/Public/UNIDATA/UnicodeData.txt"><kbd>UnicodeData.txt</kbd></a>) or the specified <a href="ftp://ftp.unicode.org/Public/UNIDATA/Blocks.txt">Block</a>.
 *       The following names are available:
 *       <dl>
 *         <dt>Unicode General Categories:
 *         <dd><kbd>
 *       L, M, N, Z, C, P, S, Lu, Ll, Lt, Lm, Lo, Mn, Me, Mc, Nd, Nl, No, Zs, Zl, Zp,
 *       Cc, Cf, Cn, Co, Cs, Pd, Ps, Pe, Pc, Po, Sm, Sc, Sk, So,
 *         </kbd>
 *         <dd>(Currently the Cn category includes U+10000-U+10FFFF characters)
 *         <dt>Unicode Blocks:
 *         <dd><kbd>
 *       Basic Latin, Latin-1 Supplement, Latin Extended-A, Latin Extended-B,
 *       IPA Extensions, Spacing Modifier Letters, Combining Diacritical Marks, Greek,
 *       Cyrillic, Armenian, Hebrew, Arabic, Devanagari, Bengali, Gurmukhi, Gujarati,
 *       Oriya, Tamil, Telugu, Kannada, Malayalam, Thai, Lao, Tibetan, Georgian,
 *       Hangul Jamo, Latin Extended Additional, Greek Extended, General Punctuation,
 *       Superscripts and Subscripts, Currency Symbols, Combining Marks for Symbols,
 *       Letterlike Symbols, Number Forms, Arrows, Mathematical Operators,
 *       Miscellaneous Technical, Control Pictures, Optical Character Recognition,
 *       Enclosed Alphanumerics, Box Drawing, Block Elements, Geometric Shapes,
 *       Miscellaneous Symbols, Dingbats, CJK Symbols and Punctuation, Hiragana,
 *       Katakana, Bopomofo, Hangul Compatibility Jamo, Kanbun,
 *       Enclosed CJK Letters and Months, CJK Compatibility, CJK Unified Ideographs,
 *       Hangul Syllables, High Surrogates, High Private Use Surrogates, Low Surrogates,
 *       Private Use, CJK Compatibility Ideographs, Alphabetic Presentation Forms,
 *       Arabic Presentation Forms-A, Combining Half Marks, CJK Compatibility Forms,
 *       Small Form Variants, Arabic Presentation Forms-B, Specials,
 *       Halfwidth and Fullwidth Forms
 *         </kbd>
 *         <dt>Others:
 *         <dd><kbd>ALL</kbd> (Equivalent to <kbd>[\u005cu0000-\u005cv10FFFF]</kbd>)
 *         <dd><kbd>ASSGINED</kbd> (<kbd>\p{ASSIGNED}</kbd> is equivalent to <kbd>\P{Cn}</kbd>)
 *         <dd><kbd>UNASSGINED</kbd>
 *             (<kbd>\p{UNASSIGNED}</kbd> is equivalent to <kbd>\p{Cn}</kbd>)
 *       </dl>
 *
 *       <dt class="REGEX"><kbd>\P{</kbd><var>name</var><kbd>}</kbd>
 *       <dd>Matches one character not in the specified General Category or the specified Block.
 *     </dl>
 *   </li>
 *
 *   <li>Selection and Quantifier
 *     <dl>
 *       <dt class="REGEX"><VAR>X</VAR><kbd>|</kbd><VAR>Y</VAR>
 *       <dd>...
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>*</KBD>
 *       <dd>Matches 0 or more <var>X</var>.
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>+</KBD>
 *       <dd>Matches 1 or more <var>X</var>.
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>?</KBD>
 *       <dd>Matches 0 or 1 <var>X</var>.
 *
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>number</var><kbd>}</kbd>
 *       <dd>Matches <var>number</var> times.
 *
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,}</kbd>
 *       <dd>...
 *
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,</kbd><var>max</var><kbd>}</kbd>
 *       <dd>...
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>*?</kbd>
 *       <dt class="REGEX"><VAR>X</VAR><kbd>+?</kbd>
 *       <dt class="REGEX"><VAR>X</VAR><kbd>??</kbd>
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,}?</kbd>
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,</kbd><var>max</var><kbd>}?</kbd>
 *       <dd>Non-greedy matching.
 *     </dl>
 *   </li>
 *
 *   <li>Grouping, Capturing, and Back-reference
 *     <dl>
 *       <dt class="REGEX"><KBD>(?:</kbd><VAR>X</VAR><kbd>)</KBD>
 *       <dd>Grouping. "<KBD>foo+</KBD>" matches "<KBD>foo</KBD>" or "<KBD>foooo</KBD>".
 *       If you want it matches "<KBD>foofoo</KBD>" or "<KBD>foofoofoo</KBD>",
 *       you have to write "<KBD>(?:foo)+</KBD>".
 *
 *       <dt class="REGEX"><KBD>(</kbd><VAR>X</VAR><kbd>)</KBD>
 *       <dd>Grouping with capturing.
 * It make a group and applications can know
 * where in target text a group matched with methods of a <code>Match</code> instance
 * after <code><a href="#matches(java.lang.String, com.sun.org.apache.xerces.internal.utils.regex.Match)">matches(String,Match)</a></code>.
 * The 0th group means whole of this regular expression.
 * The <VAR>N</VAR>th gorup is the inside of the <VAR>N</VAR>th left parenthesis.
 *
 *   <p>For instance, a regular expression is
 *   "<FONT color=blue><KBD> *([^&lt;:]*) +&lt;([^&gt;]*)&gt; *</KBD></FONT>"
 *   and target text is
 *   "<FONT color=red><KBD>From: TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;</KBD></FONT>":
 *   <ul>
 *     <li><code>Match.getCapturedText(0)</code>:
 *     "<FONT color=red><KBD> TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;</KBD></FONT>"
 *     <li><code>Match.getCapturedText(1)</code>: "<FONT color=red><KBD>TAMURA Kent</KBD></FONT>"
 *     <li><code>Match.getCapturedText(2)</code>: "<FONT color=red><KBD>kent@trl.ibm.co.jp</KBD></FONT>"
 *   </ul>
 *
 *       <dt class="REGEX"><kbd>\1 \2 \3 \4 \5 \6 \7 \8 \9</kbd>
 *       <dd>
 *
 *       <dt class="REGEX"><kbd>(?></kbd><var>X</var><kbd>)</kbd>
 *       <dd>Independent expression group. ................
 *
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>:</kbd><var>X</var><kbd>)</kbd>
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>-</kbd><var>options2</var><kbd>:</kbd><var>X</var><kbd>)</kbd>
 *       <dd>............................
 *       <dd>The <var>options</var> or the <var>options2</var> consists of 'i' 'm' 's' 'w'.
 *           Note that it can not contain 'u'.
 *
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>)</kbd>
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>-</kbd><var>options2</var><kbd>)</kbd>
 *       <dd>......
 *       <dd>These expressions must be at the beginning of a group.
 *     </dl>
 *   </li>
 *
 *   <li>Anchor
 *     <dl>
 *       <dt class="REGEX"><kbd>\A</kbd>
 *       <dd>Matches the beginnig of the text.
 *
 *       <dt class="REGEX"><kbd>\Z</kbd>
 *       <dd>Matches the end of the text, or before an EOL character at the end of the text,
 *           or CARRIAGE RETURN + LINE FEED at the end of the text.
 *
 *       <dt class="REGEX"><kbd>\z</kbd>
 *       <dd>Matches the end of the text.
 *
 *       <dt class="REGEX"><kbd>^</kbd>
 *       <dd>Matches the beginning of the text.  It is equivalent to <span class="REGEX"><Kbd>\A</kbd></span>.
 *       <dd>When <a href="#M_OPTION">a "m" option</a> is set,
 *           it matches the beginning of the text, or after one of EOL characters (
 *           LINE FEED (U+000A), CARRIAGE RETURN (U+000D), LINE SEPARATOR (U+2028),
 *           PARAGRAPH SEPARATOR (U+2029).)
 *
 *       <dt class="REGEX"><kbd>$</kbd>
 *       <dd>Matches the end of the text, or before an EOL character at the end of the text,
 *           or CARRIAGE RETURN + LINE FEED at the end of the text.
 *       <dd>When <a href="#M_OPTION">a "m" option</a> is set,
 *           it matches the end of the text, or before an EOL character.
 *
 *       <dt class="REGEX"><kbd>\b</kbd>
 *       <dd>Matches word boundary.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *
 *       <dt class="REGEX"><kbd>\B</kbd>
 *       <dd>Matches non word boundary.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *
 *       <dt class="REGEX"><kbd>\&lt;</kbd>
 *       <dd>Matches the beginning of a word.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *
 *       <dt class="REGEX"><kbd>\&gt;</kbd>
 *       <dd>Matches the end of a word.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *     </dl>
 *   </li>
 *   <li>Lookahead and lookbehind
 *     <dl>
 *       <dt class="REGEX"><kbd>(?=</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Lookahead.
 *
 *       <dt class="REGEX"><kbd>(?!</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Negative lookahead.
 *
 *       <dt class="REGEX"><kbd>(?&lt;=</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Lookbehind.
 *       <dd>(Note for text capturing......)
 *
 *       <dt class="REGEX"><kbd>(?&lt;!</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Negative lookbehind.
 *     </dl>
 *   </li>
 *
 *   <li>Misc.
 *     <dl>
 *       <dt class="REGEX"><kbd>(?(</Kbd><var>condition</var><Kbd>)</kbd><var>yes-pattern</var><kbd>|</kbd><var>no-pattern</var><kbd>)</kbd>,
 *       <dt class="REGEX"><kbd>(?(</kbd><var>condition</var><kbd>)</kbd><var>yes-pattern</var><kbd>)</kbd>
 *       <dd>......
 *       <dt class="REGEX"><kbd>(?#</kbd><var>comment</var><kbd>)</kbd>
 *       <dd>Comment.  A comment string consists of characters except '<kbd>)</kbd>'.
 *           You can not write comments in character classes and before quantifiers.
 *     </dl>
 *   </li>
 * </ul>
 *
 *
 * <hr width="50%">
 * <h3>BNF for the regular expression</h3>
 * <pre>
 * regex ::= ('(?' options ')')? term ('|' term)*
 * term ::= factor+
 * factor ::= anchors | atom (('*' | '+' | '?' | minmax ) '?'? )?
 *            | '(?#' [^)]* ')'
 * minmax ::= '{' ([0-9]+ | [0-9]+ ',' | ',' [0-9]+ | [0-9]+ ',' [0-9]+) '}'
 * atom ::= char | '.' | char-class | '(' regex ')' | '(?:' regex ')' | '\' [0-9]
 *          | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block | '\X'
 *          | '(?>' regex ')' | '(?' options ':' regex ')'
 *          | '(?' ('(' [0-9] ')' | '(' anchors ')' | looks) term ('|' term)? ')'
 * options ::= [imsw]* ('-' [imsw]+)?
 * anchors ::= '^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\&lt;' | '\>'
 * looks ::= '(?=' regex ')'  | '(?!' regex ')'
 *           | '(?&lt;=' regex ')' | '(?&lt;!' regex ')'
 * char ::= '\\' | '\' [efnrtv] | '\c' [@-_] | code-point | character-1
 * category-block ::= '\' [pP] category-symbol-1
 *                    | ('\p{' | '\P{') (category-symbol | block-name
 *                                       | other-properties) '}'
 * category-symbol-1 ::= 'L' | 'M' | 'N' | 'Z' | 'C' | 'P' | 'S'
 * category-symbol ::= category-symbol-1 | 'Lu' | 'Ll' | 'Lt' | 'Lm' | Lo'
 *                     | 'Mn' | 'Me' | 'Mc' | 'Nd' | 'Nl' | 'No'
 *                     | 'Zs' | 'Zl' | 'Zp' | 'Cc' | 'Cf' | 'Cn' | 'Co' | 'Cs'
 *                     | 'Pd' | 'Ps' | 'Pe' | 'Pc' | 'Po'
 *                     | 'Sm' | 'Sc' | 'Sk' | 'So'
 * block-name ::= (See above)
 * other-properties ::= 'ALL' | 'ASSIGNED' | 'UNASSIGNED'
 * character-1 ::= (any character except meta-characters)
 *
 * char-class ::= '[' ranges ']'
 *                | '(?[' ranges ']' ([-+&] '[' ranges ']')? ')'
 * ranges ::= '^'? (range <a href="#COMMA_OPTION">','?</a>)+
 * range ::= '\d' | '\w' | '\s' | '\D' | '\W' | '\S' | category-block
 *           | range-char | range-char '-' range-char
 * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | code-point | character-2
 * code-point ::= '\x' hex-char hex-char
 *                | '\x{' hex-char+ '}'
 * <!--               | '\u005c u' hex-char hex-char hex-char hex-char
 * -->               | '\v' hex-char hex-char hex-char hex-char hex-char hex-char
 * hex-char ::= [0-9a-fA-F]
 * character-2 ::= (any character except \[]-,)
 * </pre>
 *
 * <hr width="50%">
 * <h3>TODO</h3>
 * <ul>
 *   <li><a href="http://www.unicode.org/unicode/reports/tr18/">Unicode Regular Expression Guidelines</a>
 *     <ul>
 *       <li>2.4 Canonical Equivalents
 *       <li>Level 3
 *     </ul>
 *   <li>Parsing performance
 * </ul>
 *
 * <hr width="50%">
 *
 * @xerces.internal
 *
 * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;
 * @version $Id: RegularExpression.java,v 1.9 2010/07/27 05:02:34 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public int getNumberOfGroups() {

    /**
     * Return the number of regular expression groups.
     * This method returns 1 when the regular expression has no capturing-parenthesis.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public int hashCode() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean equals(Object obj) {

    /**
     *  Return true if patterns are the same and the options are equivalent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public String getOptions() {

    /**
     * Returns a option string.
     * The order of letters in it may be different from a string specified
     * in a constructor or <code>setPattern()</code>.
     *
     * @see #RegularExpression(java.lang.String,java.lang.String)
     * @see #setPattern(java.lang.String,java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public String toString() {

    /**
     * Represents this instence in String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public String getPattern() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public void setPattern(String newPattern, String options) throws ParseException {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public void setPattern(String newPattern) throws ParseException {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public RegularExpression(String regex, String options, Locale locale) throws ParseException {

    /**
     * Creates a new RegularExpression instance with options.
     *
     * @param regex A regular expression
     * @param options A String consisted of "i" "m" "s" "u" "w" "," "X"
     * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public RegularExpression(String regex, String options) throws ParseException {

    /**
     * Creates a new RegularExpression instance with options.
     *
     * @param regex A regular expression
     * @param options A String consisted of "i" "m" "s" "u" "w" "," "X"
     * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public RegularExpression(String regex) throws ParseException {

    /**
     * Creates a new RegularExpression instance.
     *
     * @param regex A regular expression
     * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int XMLSCHEMA_MODE = 1<<9;

    /**
     * "X". XML Schema mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int PROHIBIT_HEAD_CHARACTER_OPTIMIZATION = 1<<7;

    /**
     * "H"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int UNICODE_WORD_BOUNDARY = 1<<6; // "w"

    /**
     * An option.
     * This enables to process locale-independent word boundary for <span class="REGEX"><kbd>\b \B \&lt; \></kbd></span>.
     * <p>By default, the engine considers a position between a word character
     * (<span class="REGEX"><Kbd>\w</kbd></span>) and a non word character
     * is a word boundary.
     * <p>By this option, the engine checks word boundaries with the method of
     * 'Unicode Regular Expression Guidelines' Revision 4.
     *
     * @see #RegularExpression(java.lang.String,int)
     * @see #setPattern(java.lang.String,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int USE_UNICODE_CATEGORY = 1<<5; // "u"

    /**
     * This option redefines <span class="REGEX"><kbd>\d \D \w \W \s \S</kbd></span>.
     *
     * @see #RegularExpression(java.lang.String,int)
     * @see #setPattern(java.lang.String,int)
     * @see #UNICODE_WORD_BOUNDARY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int EXTENDED_COMMENT = 1<<4;

    /**
     * "x"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int MULTIPLE_LINES = 1<<3;

    /**
     * "m"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    static final int SINGLE_LINE = 1<<2;

    /**
     * "s"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    /**

    /**
     * An option.
     * If you specify this option, <span class="REGEX"><kbd>(</kbd><var>X</var><kbd>)</kbd></span>
     * captures matched text, and <span class="REGEX"><kbd>(:?</kbd><var>X</var><kbd>)</kbd></span>
     * does not capture.
     *
     * @see #RegularExpression(java.lang.String,int)
     * @see #setPattern(java.lang.String,int)
    static final int MARK_PARENS = 1<<0;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    void prepare() {

    /**
     * Prepares for matching.  This method is called just before starting matching.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    int nofparen;

    /**
     * The number of parenthesis in the regular expression.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    String regex;

    /**
     * A regular expression.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(CharacterIterator  target, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(CharacterIterator target) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    private int match(Context con, Op op, int offset, int dx, int opts) {

    /**
     * @return -1 when not match; offset of the end of matched string when match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target, int start, int end, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target, int start, int end) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(String  target) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[] target, int start, int end, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[]  target, Match match) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @param match A Match instance for storing matching result.
     * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[]  target, int start, int end) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern
     * in specified range or not.
     *
     * @param start Start offset of the range.
     * @param end  End offset +1 of the range.
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    public boolean matches(char[]  target) {

    /**
     * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not.
     *
     * @return true if the target is matched to this regular expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    private Op compile(Token tok, Op next, boolean reverse) {

    /**
     * Converts a token to an operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
    private synchronized void compile(Token tok) {

    /**
     * Compiles a token tree into an operation flow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegularExpression.java
public class RegularExpression implements java.io.Serializable {

/**
 * A regular expression matching engine using Non-deterministic Finite Automaton (NFA).
 * This engine does not conform to the POSIX regular expression.
 *
 * <hr width="50%">
 * <h3>How to use</h3>
 *
 * <dl>
 *   <dt>A. Standard way
 *   <dd>
 * <pre>
 * RegularExpression re = new RegularExpression(<var>regex</var>);
 * if (re.matches(text)) { ... }
 * </pre>
 *
 *   <dt>B. Capturing groups
 *   <dd>
 * <pre>
 * RegularExpression re = new RegularExpression(<var>regex</var>);
 * Match match = new Match();
 * if (re.matches(text, match)) {
 *     ... // You can refer captured texts with methods of the <code>Match</code> class.
 * }
 * </pre>
 *
 * </dl>
 *
 * <h4>Case-insensitive matching</h4>
 * <pre>
 * RegularExpression re = new RegularExpression(<var>regex</var>, "i");
 * if (re.matches(text) >= 0) { ...}
 * </pre>
 *
 * <h4>Options</h4>
 * <p>You can specify options to <a href="#RegularExpression(java.lang.String, java.lang.String)"><code>RegularExpression(</code><var>regex</var><code>, </code><var>options</var><code>)</code></a>
 *    or <a href="#setPattern(java.lang.String, java.lang.String)"><code>setPattern(</code><var>regex</var><code>, </code><var>options</var><code>)</code></a>.
 *    This <var>options</var> parameter consists of the following characters.
 * </p>
 * <dl>
 *   <dt><a name="I_OPTION"><code>"i"</code></a>
 *   <dd>This option indicates case-insensitive matching.
 *   <dt><a name="M_OPTION"><code>"m"</code></a>
 *   <dd class="REGEX"><kbd>^</kbd> and <kbd>$</kbd> consider the EOL characters within the text.
 *   <dt><a name="S_OPTION"><code>"s"</code></a>
 *   <dd class="REGEX"><kbd>.</kbd> matches any one character.
 *   <dt><a name="U_OPTION"><code>"u"</code></a>
 *   <dd class="REGEX">Redefines <Kbd>\d \D \w \W \s \S \b \B \&lt; \></kbd> as becoming to Unicode.
 *   <dt><a name="W_OPTION"><code>"w"</code></a>
 *   <dd class="REGEX">By this option, <kbd>\b \B \&lt; \></kbd> are processed with the method of
 *      'Unicode Regular Expression Guidelines' Revision 4.
 *      When "w" and "u" are specified at the same time,
 *      <kbd>\b \B \&lt; \></kbd> are processed for the "w" option.
 *   <dt><a name="COMMA_OPTION"><code>","</code></a>
 *   <dd>The parser treats a comma in a character class as a range separator.
 *      <kbd class="REGEX">[a,b]</kbd> matches <kbd>a</kbd> or <kbd>,</kbd> or <kbd>b</kbd> without this option.
 *      <kbd class="REGEX">[a,b]</kbd> matches <kbd>a</kbd> or <kbd>b</kbd> with this option.
 *
 *   <dt><a name="X_OPTION"><code>"X"</code></a>
 *   <dd class="REGEX">
 *       By this option, the engine confoms to <a href="http://www.w3.org/TR/2000/WD-xmlschema-2-20000407/#regexs">XML Schema: Regular Expression</a>.
 *       The <code>match()</code> method does not do subsring matching
 *       but entire string matching.
 *
 * </dl>
 *
 * <hr width="50%">
 * <h3>Syntax</h3>
 * <table border="1" bgcolor="#ddeeff">
 *   <tr>
 *    <td>
 *     <h4>Differences from the Perl 5 regular expression</h4>
 *     <ul>
 *      <li>There is 6-digit hexadecimal character representation  (<kbd>\u005cv</kbd><var>HHHHHH</var>.)
 *      <li>Supports subtraction, union, and intersection operations for character classes.
 *      <li>Not supported: <kbd>\</kbd><var>ooo</var> (Octal character representations),
 *          <Kbd>\G</kbd>, <kbd>\C</kbd>, <kbd>\l</kbd><var>c</var>,
 *          <kbd>\u005c u</kbd><var>c</var>, <kbd>\L</kbd>, <kbd>\U</kbd>,
 *          <kbd>\E</kbd>, <kbd>\Q</kbd>, <kbd>\N{</kbd><var>name</var><kbd>}</kbd>,
 *          <Kbd>(?{<kbd><var>code</var><kbd>})</kbd>, <Kbd>(??{<kbd><var>code</var><kbd>})</kbd>
 *     </ul>
 *    </td>
 *   </tr>
 * </table>
 *
 * <P>Meta characters are `<KBD>. * + ? { [ ( ) | \ ^ $</KBD>'.</P>
 * <ul>
 *   <li>Character
 *     <dl>
 *       <dt class="REGEX"><kbd>.</kbd> (A period)
 *       <dd>Matches any one character except the following characters.
 *       <dd>LINE FEED (U+000A), CARRIAGE RETURN (U+000D),
 *           PARAGRAPH SEPARATOR (U+2029), LINE SEPARATOR (U+2028)
 *       <dd>This expression matches one code point in Unicode. It can match a pair of surrogates.
 *       <dd>When <a href="#S_OPTION">the "s" option</a> is specified,
 *           it matches any character including the above four characters.
 *
 *       <dt class="REGEX"><Kbd>\e \f \n \r \t</kbd>
 *       <dd>Matches ESCAPE (U+001B), FORM FEED (U+000C), LINE FEED (U+000A),
 *           CARRIAGE RETURN (U+000D), HORIZONTAL TABULATION (U+0009)
 *
 *       <dt class="REGEX"><kbd>\c</kbd><var>C</var>
 *       <dd>Matches a control character.
 *           The <var>C</var> must be one of '<kbd>@</kbd>', '<kbd>A</kbd>'-'<kbd>Z</kbd>',
 *           '<kbd>[</kbd>', '<kbd>\u005c</kbd>', '<kbd>]</kbd>', '<kbd>^</kbd>', '<kbd>_</kbd>'.
 *           It matches a control character of which the character code is less than
 *           the character code of the <var>C</var> by 0x0040.
 *       <dd class="REGEX">For example, a <kbd>\cJ</kbd> matches a LINE FEED (U+000A),
 *           and a <kbd>\c[</kbd> matches an ESCAPE (U+001B).
 *
 *       <dt class="REGEX">a non-meta character
 *       <dd>Matches the character.
 *
 *       <dt class="REGEX"><KBD>\</KBD> + a meta character
 *       <dd>Matches the meta character.
 *
 *       <dt class="REGEX"><kbd>\u005cx</kbd><var>HH</var> <kbd>\u005cx{</kbd><var>HHHH</var><kbd>}</kbd>
 *       <dd>Matches a character of which code point is <var>HH</var> (Hexadecimal) in Unicode.
 *           You can write just 2 digits for <kbd>\u005cx</kbd><var>HH</var>, and
 *           variable length digits for <kbd>\u005cx{</kbd><var>HHHH</var><kbd>}</kbd>.
 *
 *       <!--
 *       <dt class="REGEX"><kbd>\u005c u</kbd><var>HHHH</var>
 *       <dd>Matches a character of which code point is <var>HHHH</var> (Hexadecimal) in Unicode.
 *       -->
 *
 *       <dt class="REGEX"><kbd>\u005cv</kbd><var>HHHHHH</var>
 *       <dd>Matches a character of which code point is <var>HHHHHH</var> (Hexadecimal) in Unicode.
 *
 *       <dt class="REGEX"><kbd>\g</kbd>
 *       <dd>Matches a grapheme.
 *       <dd class="REGEX">It is equivalent to <kbd>(?[\p{ASSIGNED}]-[\p{M}\p{C}])?(?:\p{M}|[\x{094D}\x{09CD}\x{0A4D}\x{0ACD}\x{0B3D}\x{0BCD}\x{0C4D}\x{0CCD}\x{0D4D}\x{0E3A}\x{0F84}]\p{L}|[\x{1160}-\x{11A7}]|[\x{11A8}-\x{11FF}]|[\x{FF9E}\x{FF9F}])*</kbd>
 *
 *       <dt class="REGEX"><kbd>\X</kbd>
 *       <dd class="REGEX">Matches a combining character sequence.
 *       It is equivalent to <kbd>(?:\PM\pM*)</kbd>
 *     </dl>
 *   </li>
 *
 *   <li>Character class
 *     <dl>
+ *       <dt class="REGEX"><kbd>[</kbd><var>R<sub>1</sub></var><var>R<sub>2</sub></var><var>...</var><var>R<sub>n</sub></var><kbd>]</kbd> (without <a href="#COMMA_OPTION">"," option</a>)
+ *       <dt class="REGEX"><kbd>[</kbd><var>R<sub>1</sub></var><kbd>,</kbd><var>R<sub>2</sub></var><kbd>,</kbd><var>...</var><kbd>,</kbd><var>R<sub>n</sub></var><kbd>]</kbd> (with <a href="#COMMA_OPTION">"," option</a>)
 *       <dd>Positive character class.  It matches a character in ranges.
 *       <dd><var>R<sub>n</sub></var>:
 *       <ul>
 *         <li class="REGEX">A character (including <Kbd>\e \f \n \r \t</kbd> <kbd>\u005cx</kbd><var>HH</var> <kbd>\u005cx{</kbd><var>HHHH</var><kbd>}</kbd> <!--kbd>\u005c u</kbd><var>HHHH</var--> <kbd>\u005cv</kbd><var>HHHHHH</var>)
 *             <p>This range matches the character.
 *         <li class="REGEX"><var>C<sub>1</sub></var><kbd>-</kbd><var>C<sub>2</sub></var>
 *             <p>This range matches a character which has a code point that is >= <var>C<sub>1</sub></var>'s code point and &lt;= <var>C<sub>2</sub></var>'s code point.
+ *         <li class="REGEX">A POSIX character class: <Kbd>[:alpha:] [:alnum:] [:ascii:] [:cntrl:] [:digit:] [:graph:] [:lower:] [:print:] [:punct:] [:space:] [:upper:] [:xdigit:]</kbd>,
+ *             and negative POSIX character classes in Perl like <kbd>[:^alpha:]</kbd>
 *             <p>...
 *         <li class="REGEX"><kbd>\d \D \s \S \w \W \p{</kbd><var>name</var><kbd>} \P{</kbd><var>name</var><kbd>}</kbd>
 *             <p>These expressions specifies the same ranges as the following expressions.
 *       </ul>
 *       <p class="REGEX">Enumerated ranges are merged (union operation).
 *          <kbd>[a-ec-z]</kbd> is equivalent to <kbd>[a-z]</kbd>
 *
 *       <dt class="REGEX"><kbd>[^</kbd><var>R<sub>1</sub></var><var>R<sub>2</sub></var><var>...</var><var>R<sub>n</sub></var><kbd>]</kbd> (without a <a href="#COMMA_OPTION">"," option</a>)
 *       <dt class="REGEX"><kbd>[^</kbd><var>R<sub>1</sub></var><kbd>,</kbd><var>R<sub>2</sub></var><kbd>,</kbd><var>...</var><kbd>,</kbd><var>R<sub>n</sub></var><kbd>]</kbd> (with a <a href="#COMMA_OPTION">"," option</a>)
 *       <dd>Negative character class.  It matches a character not in ranges.
 *
 *       <dt class="REGEX"><kbd>(?[</kbd><var>ranges</var><kbd>]</kbd><var>op</var><kbd>[</kbd><var>ranges</var><kbd>]</kbd><var>op</var><kbd>[</kbd><var>ranges</var><kbd>]</kbd> ... <Kbd>)</kbd>
 *       (<var>op</var> is <kbd>-</kbd> or <kbd>+</kbd> or <kbd>&</kbd>.)
 *       <dd>Subtraction or union or intersection for character classes.
 *       <dd class="REGEX">For exmaple, <kbd>(?[A-Z]-[CF])</kbd> is equivalent to <kbd>[A-BD-EG-Z]</kbd>, and <kbd>(?[0x00-0x7f]-[K]&[\p{Lu}])</kbd> is equivalent to <kbd>[A-JL-Z]</kbd>.
 *       <dd>The result of this operations is a <u>positive character class</u>
 *           even if an expression includes any negative character classes.
 *           You have to take care on this in case-insensitive matching.
 *           For instance, <kbd>(?[^b])</kbd> is equivalent to <kbd>[\x00-ac-\x{10ffff}]</kbd>,
 *           which is equivalent to <kbd>[^b]</kbd> in case-sensitive matching.
 *           But, in case-insensitive matching, <kbd>(?[^b])</kbd> matches any character because
 *           it includes '<kbd>B</kbd>' and '<kbd>B</kbd>' matches '<kbd>b</kbd>'
 *           though <kbd>[^b]</kbd> is processed as <kbd>[^Bb]</kbd>.
 *
 *       <dt class="REGEX"><kbd>[</kbd><var>R<sub>1</sub>R<sub>2</sub>...</var><kbd>-[</kbd><var>R<sub>n</sub>R<sub>n+1</sub>...</var><kbd>]]</kbd> (with an <a href="#X_OPTION">"X" option</a>)</dt>
 *       <dd>Character class subtraction for the XML Schema.
 *           You can use this syntax when you specify an <a href="#X_OPTION">"X" option</a>.
 *
 *       <dt class="REGEX"><kbd>\d</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[0-9]</kbd>.
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>\p{Nd}</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\D</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[^0-9]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>\P{Nd}</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\s</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[ \f\n\r\t]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[ \f\n\r\t\p{Z}]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\S</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[^ \f\n\r\t]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[^ \f\n\r\t\p{Z}]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\w</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[a-zA-Z0-9_]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[\p{Lu}\p{Ll}\p{Lo}\p{Nd}_]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\W</kbd>
 *       <dd class="REGEX">Equivalent to <kbd>[^a-zA-Z0-9_]</kbd>
 *       <dd>When <a href="#U_OPTION">a "u" option</a> is set, it is equivalent to
 *           <span class="REGEX"><kbd>[^\p{Lu}\p{Ll}\p{Lo}\p{Nd}_]</kbd></span>.
 *
 *       <dt class="REGEX"><kbd>\p{</kbd><var>name</var><kbd>}</kbd>
 *       <dd>Matches one character in the specified General Category (the second field in <a href="ftp://ftp.unicode.org/Public/UNIDATA/UnicodeData.txt"><kbd>UnicodeData.txt</kbd></a>) or the specified <a href="ftp://ftp.unicode.org/Public/UNIDATA/Blocks.txt">Block</a>.
 *       The following names are available:
 *       <dl>
 *         <dt>Unicode General Categories:
 *         <dd><kbd>
 *       L, M, N, Z, C, P, S, Lu, Ll, Lt, Lm, Lo, Mn, Me, Mc, Nd, Nl, No, Zs, Zl, Zp,
 *       Cc, Cf, Cn, Co, Cs, Pd, Ps, Pe, Pc, Po, Sm, Sc, Sk, So,
 *         </kbd>
 *         <dd>(Currently the Cn category includes U+10000-U+10FFFF characters)
 *         <dt>Unicode Blocks:
 *         <dd><kbd>
 *       Basic Latin, Latin-1 Supplement, Latin Extended-A, Latin Extended-B,
 *       IPA Extensions, Spacing Modifier Letters, Combining Diacritical Marks, Greek,
 *       Cyrillic, Armenian, Hebrew, Arabic, Devanagari, Bengali, Gurmukhi, Gujarati,
 *       Oriya, Tamil, Telugu, Kannada, Malayalam, Thai, Lao, Tibetan, Georgian,
 *       Hangul Jamo, Latin Extended Additional, Greek Extended, General Punctuation,
 *       Superscripts and Subscripts, Currency Symbols, Combining Marks for Symbols,
 *       Letterlike Symbols, Number Forms, Arrows, Mathematical Operators,
 *       Miscellaneous Technical, Control Pictures, Optical Character Recognition,
 *       Enclosed Alphanumerics, Box Drawing, Block Elements, Geometric Shapes,
 *       Miscellaneous Symbols, Dingbats, CJK Symbols and Punctuation, Hiragana,
 *       Katakana, Bopomofo, Hangul Compatibility Jamo, Kanbun,
 *       Enclosed CJK Letters and Months, CJK Compatibility, CJK Unified Ideographs,
 *       Hangul Syllables, High Surrogates, High Private Use Surrogates, Low Surrogates,
 *       Private Use, CJK Compatibility Ideographs, Alphabetic Presentation Forms,
 *       Arabic Presentation Forms-A, Combining Half Marks, CJK Compatibility Forms,
 *       Small Form Variants, Arabic Presentation Forms-B, Specials,
 *       Halfwidth and Fullwidth Forms
 *         </kbd>
 *         <dt>Others:
 *         <dd><kbd>ALL</kbd> (Equivalent to <kbd>[\u005cu0000-\u005cv10FFFF]</kbd>)
 *         <dd><kbd>ASSGINED</kbd> (<kbd>\p{ASSIGNED}</kbd> is equivalent to <kbd>\P{Cn}</kbd>)
 *         <dd><kbd>UNASSGINED</kbd>
 *             (<kbd>\p{UNASSIGNED}</kbd> is equivalent to <kbd>\p{Cn}</kbd>)
 *       </dl>
 *
 *       <dt class="REGEX"><kbd>\P{</kbd><var>name</var><kbd>}</kbd>
 *       <dd>Matches one character not in the specified General Category or the specified Block.
 *     </dl>
 *   </li>
 *
 *   <li>Selection and Quantifier
 *     <dl>
 *       <dt class="REGEX"><VAR>X</VAR><kbd>|</kbd><VAR>Y</VAR>
 *       <dd>...
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>*</KBD>
 *       <dd>Matches 0 or more <var>X</var>.
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>+</KBD>
 *       <dd>Matches 1 or more <var>X</var>.
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>?</KBD>
 *       <dd>Matches 0 or 1 <var>X</var>.
 *
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>number</var><kbd>}</kbd>
 *       <dd>Matches <var>number</var> times.
 *
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,}</kbd>
 *       <dd>...
 *
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,</kbd><var>max</var><kbd>}</kbd>
 *       <dd>...
 *
 *       <dt class="REGEX"><VAR>X</VAR><kbd>*?</kbd>
 *       <dt class="REGEX"><VAR>X</VAR><kbd>+?</kbd>
 *       <dt class="REGEX"><VAR>X</VAR><kbd>??</kbd>
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,}?</kbd>
 *       <dt class="REGEX"><var>X</var><kbd>{</kbd><var>min</var><kbd>,</kbd><var>max</var><kbd>}?</kbd>
 *       <dd>Non-greedy matching.
 *     </dl>
 *   </li>
 *
 *   <li>Grouping, Capturing, and Back-reference
 *     <dl>
 *       <dt class="REGEX"><KBD>(?:</kbd><VAR>X</VAR><kbd>)</KBD>
 *       <dd>Grouping. "<KBD>foo+</KBD>" matches "<KBD>foo</KBD>" or "<KBD>foooo</KBD>".
 *       If you want it matches "<KBD>foofoo</KBD>" or "<KBD>foofoofoo</KBD>",
 *       you have to write "<KBD>(?:foo)+</KBD>".
 *
 *       <dt class="REGEX"><KBD>(</kbd><VAR>X</VAR><kbd>)</KBD>
 *       <dd>Grouping with capturing.
 * It make a group and applications can know
 * where in target text a group matched with methods of a <code>Match</code> instance
 * after <code><a href="#matches(java.lang.String, com.sun.org.apache.xerces.internal.utils.regex.Match)">matches(String,Match)</a></code>.
 * The 0th group means whole of this regular expression.
 * The <VAR>N</VAR>th gorup is the inside of the <VAR>N</VAR>th left parenthesis.
 *
 *   <p>For instance, a regular expression is
 *   "<FONT color=blue><KBD> *([^&lt;:]*) +&lt;([^&gt;]*)&gt; *</KBD></FONT>"
 *   and target text is
 *   "<FONT color=red><KBD>From: TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;</KBD></FONT>":
 *   <ul>
 *     <li><code>Match.getCapturedText(0)</code>:
 *     "<FONT color=red><KBD> TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;</KBD></FONT>"
 *     <li><code>Match.getCapturedText(1)</code>: "<FONT color=red><KBD>TAMURA Kent</KBD></FONT>"
 *     <li><code>Match.getCapturedText(2)</code>: "<FONT color=red><KBD>kent@trl.ibm.co.jp</KBD></FONT>"
 *   </ul>
 *
 *       <dt class="REGEX"><kbd>\1 \2 \3 \4 \5 \6 \7 \8 \9</kbd>
 *       <dd>
 *
 *       <dt class="REGEX"><kbd>(?></kbd><var>X</var><kbd>)</kbd>
 *       <dd>Independent expression group. ................
 *
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>:</kbd><var>X</var><kbd>)</kbd>
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>-</kbd><var>options2</var><kbd>:</kbd><var>X</var><kbd>)</kbd>
 *       <dd>............................
 *       <dd>The <var>options</var> or the <var>options2</var> consists of 'i' 'm' 's' 'w'.
 *           Note that it can not contain 'u'.
 *
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>)</kbd>
 *       <dt class="REGEX"><kbd>(?</kbd><var>options</var><kbd>-</kbd><var>options2</var><kbd>)</kbd>
 *       <dd>......
 *       <dd>These expressions must be at the beginning of a group.
 *     </dl>
 *   </li>
 *
 *   <li>Anchor
 *     <dl>
 *       <dt class="REGEX"><kbd>\A</kbd>
 *       <dd>Matches the beginnig of the text.
 *
 *       <dt class="REGEX"><kbd>\Z</kbd>
 *       <dd>Matches the end of the text, or before an EOL character at the end of the text,
 *           or CARRIAGE RETURN + LINE FEED at the end of the text.
 *
 *       <dt class="REGEX"><kbd>\z</kbd>
 *       <dd>Matches the end of the text.
 *
 *       <dt class="REGEX"><kbd>^</kbd>
 *       <dd>Matches the beginning of the text.  It is equivalent to <span class="REGEX"><Kbd>\A</kbd></span>.
 *       <dd>When <a href="#M_OPTION">a "m" option</a> is set,
 *           it matches the beginning of the text, or after one of EOL characters (
 *           LINE FEED (U+000A), CARRIAGE RETURN (U+000D), LINE SEPARATOR (U+2028),
 *           PARAGRAPH SEPARATOR (U+2029).)
 *
 *       <dt class="REGEX"><kbd>$</kbd>
 *       <dd>Matches the end of the text, or before an EOL character at the end of the text,
 *           or CARRIAGE RETURN + LINE FEED at the end of the text.
 *       <dd>When <a href="#M_OPTION">a "m" option</a> is set,
 *           it matches the end of the text, or before an EOL character.
 *
 *       <dt class="REGEX"><kbd>\b</kbd>
 *       <dd>Matches word boundary.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *
 *       <dt class="REGEX"><kbd>\B</kbd>
 *       <dd>Matches non word boundary.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *
 *       <dt class="REGEX"><kbd>\&lt;</kbd>
 *       <dd>Matches the beginning of a word.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *
 *       <dt class="REGEX"><kbd>\&gt;</kbd>
 *       <dd>Matches the end of a word.
 *           (See <a href="#W_OPTION">a "w" option</a>)
 *     </dl>
 *   </li>
 *   <li>Lookahead and lookbehind
 *     <dl>
 *       <dt class="REGEX"><kbd>(?=</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Lookahead.
 *
 *       <dt class="REGEX"><kbd>(?!</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Negative lookahead.
 *
 *       <dt class="REGEX"><kbd>(?&lt;=</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Lookbehind.
 *       <dd>(Note for text capturing......)
 *
 *       <dt class="REGEX"><kbd>(?&lt;!</kbd><var>X</var><kbd>)</kbd>
 *       <dd>Negative lookbehind.
 *     </dl>
 *   </li>
 *
 *   <li>Misc.
 *     <dl>
 *       <dt class="REGEX"><kbd>(?(</Kbd><var>condition</var><Kbd>)</kbd><var>yes-pattern</var><kbd>|</kbd><var>no-pattern</var><kbd>)</kbd>,
 *       <dt class="REGEX"><kbd>(?(</kbd><var>condition</var><kbd>)</kbd><var>yes-pattern</var><kbd>)</kbd>
 *       <dd>......
 *       <dt class="REGEX"><kbd>(?#</kbd><var>comment</var><kbd>)</kbd>
 *       <dd>Comment.  A comment string consists of characters except '<kbd>)</kbd>'.
 *           You can not write comments in character classes and before quantifiers.
 *     </dl>
 *   </li>
 * </ul>
 *
 *
 * <hr width="50%">
 * <h3>BNF for the regular expression</h3>
 * <pre>
 * regex ::= ('(?' options ')')? term ('|' term)*
 * term ::= factor+
 * factor ::= anchors | atom (('*' | '+' | '?' | minmax ) '?'? )?
 *            | '(?#' [^)]* ')'
 * minmax ::= '{' ([0-9]+ | [0-9]+ ',' | ',' [0-9]+ | [0-9]+ ',' [0-9]+) '}'
 * atom ::= char | '.' | char-class | '(' regex ')' | '(?:' regex ')' | '\' [0-9]
 *          | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block | '\X'
 *          | '(?>' regex ')' | '(?' options ':' regex ')'
 *          | '(?' ('(' [0-9] ')' | '(' anchors ')' | looks) term ('|' term)? ')'
 * options ::= [imsw]* ('-' [imsw]+)?
 * anchors ::= '^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\&lt;' | '\>'
 * looks ::= '(?=' regex ')'  | '(?!' regex ')'
 *           | '(?&lt;=' regex ')' | '(?&lt;!' regex ')'
 * char ::= '\\' | '\' [efnrtv] | '\c' [@-_] | code-point | character-1
 * category-block ::= '\' [pP] category-symbol-1
 *                    | ('\p{' | '\P{') (category-symbol | block-name
 *                                       | other-properties) '}'
 * category-symbol-1 ::= 'L' | 'M' | 'N' | 'Z' | 'C' | 'P' | 'S'
 * category-symbol ::= category-symbol-1 | 'Lu' | 'Ll' | 'Lt' | 'Lm' | Lo'
 *                     | 'Mn' | 'Me' | 'Mc' | 'Nd' | 'Nl' | 'No'
 *                     | 'Zs' | 'Zl' | 'Zp' | 'Cc' | 'Cf' | 'Cn' | 'Co' | 'Cs'
 *                     | 'Pd' | 'Ps' | 'Pe' | 'Pc' | 'Po'
 *                     | 'Sm' | 'Sc' | 'Sk' | 'So'
 * block-name ::= (See above)
 * other-properties ::= 'ALL' | 'ASSIGNED' | 'UNASSIGNED'
 * character-1 ::= (any character except meta-characters)
 *
 * char-class ::= '[' ranges ']'
 *                | '(?[' ranges ']' ([-+&] '[' ranges ']')? ')'
 * ranges ::= '^'? (range <a href="#COMMA_OPTION">','?</a>)+
 * range ::= '\d' | '\w' | '\s' | '\D' | '\W' | '\S' | category-block
 *           | range-char | range-char '-' range-char
 * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | code-point | character-2
 * code-point ::= '\x' hex-char hex-char
 *                | '\x{' hex-char+ '}'
 * <!--               | '\u005c u' hex-char hex-char hex-char hex-char
 * -->               | '\v' hex-char hex-char hex-char hex-char hex-char hex-char
 * hex-char ::= [0-9a-fA-F]
 * character-2 ::= (any character except \[]-,)
 * </pre>
 *
 * <hr width="50%">
 * <h3>TODO</h3>
 * <ul>
 *   <li><a href="http://www.unicode.org/unicode/reports/tr18/">Unicode Regular Expression Guidelines</a>
 *     <ul>
 *       <li>2.4 Canonical Equivalents
 *       <li>Level 3
 *     </ul>
 *   <li>Parsing performance
 * </ul>
 *
 * <hr width="50%">
 *
 * @xerces.internal
 *
 * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;
 * @version $Id: RegularExpression.java,v 1.9 2010/07/27 05:02:34 joehw Exp $
 */