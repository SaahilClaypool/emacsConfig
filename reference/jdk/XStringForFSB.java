_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public double toDouble()

  /**
   * Convert a string to a double -- Allowed input is in fixed
   * notation ddd.fff.
   *
   * %OPT% CHECK PERFORMANCE against generating a Java String and
   * converting it to double. The advantage of running in native
   * machine code -- perhaps even microcode, on some systems -- may
   * more than make up for the cost of allocating and discarding the
   * additional object. We need to benchmark this.
   *
   * %OPT% More importantly, we need to decide whether we _care_ about
   * the performance of this operation. Does XString.toDouble constitute
   * any measurable percentage of our typical runtime? I suspect not!
   *
   * @return A double value representation of the string, or return Double.NaN
   * if the string can not be converted.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString fixWhiteSpace(boolean trimHead, boolean trimTail,
                                 boolean doublePunctuationSpaces)

  /**
   * Conditionally trim all leading and trailing whitespace in the specified String.
   * All strings of white space are
   * replaced by a single space character (#x20), except spaces after punctuation which
   * receive double spaces if doublePunctuationSpaces is true.
   * This function may be useful to a formatter, but to get first class
   * results, the formatter should probably do it's own white space handling
   * based on the semantics of the formatting object.
   *
   * @param   trimHead    Trim leading whitespace?
   * @param   trimTail    Trim trailing whitespace?
   * @param   doublePunctuationSpaces    Use double spaces for punctuation?
   * @return              The trimmed string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  private static boolean isSpace(char ch)

  /**
   * Returns whether the specified <var>ch</var> conforms to the XML 1.0 definition
   * of whitespace.  Refer to <A href="http://www.w3.org/TR/1998/REC-xml-19980210#NT-S">
   * the definition of <CODE>S</CODE></A> for details.
   * @param   ch      Character to check as XML whitespace.
   * @return          =true if <var>ch</var> is XML whitespace; otherwise =false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString trim()

  /**
   * Removes white space from both ends of this string.
   *
   * @return  this string, with white space removed from the front and end.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString concat(String str)

  /**
   * Concatenates the specified string to the end of this string.
   *
   * @param   str   the <code>String</code> that is concatenated to the end
   *                of this <code>String</code>.
   * @return  a string that represents the concatenation of this object's
   *          characters followed by the string argument's characters.
   * @exception java.lang.NullPointerException if <code>str</code> is
   *          <code>null</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString substring(int beginIndex, int endIndex)

  /**
   * Returns a new string that is a substring of this string. The
   * substring begins at the specified <code>beginIndex</code> and
   * extends to the character at index <code>endIndex - 1</code>.
   * Thus the length of the substring is <code>endIndex-beginIndex</code>.
   *
   * @param      beginIndex   the beginning index, inclusive.
   * @param      endIndex     the ending index, exclusive.
   * @return     the specified substring.
   * @exception  IndexOutOfBoundsException  if the
   *             <code>beginIndex</code> is negative, or
   *             <code>endIndex</code> is larger than the length of
   *             this <code>String</code> object, or
   *             <code>beginIndex</code> is larger than
   *             <code>endIndex</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString substring(int beginIndex)

  /**
   * Returns a new string that is a substring of this string. The
   * substring begins with the character at the specified index and
   * extends to the end of this string. <p>
   * Examples:
   * <blockquote><pre>
   * "unhappy".substring(2) returns "happy"
   * "Harbison".substring(3) returns "bison"
   * "emptiness".substring(9) returns "" (an empty string)
   * </pre></blockquote>
   *
   * @param      beginIndex   the beginning index, inclusive.
   * @return     the specified substring.
   * @exception  IndexOutOfBoundsException  if
   *             <code>beginIndex</code> is negative or larger than the
   *             length of this <code>String</code> object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int indexOf(int ch, int fromIndex)

  /**
   * Returns the index within this string of the first occurrence of the
   * specified character, starting the search at the specified index.
   * <p>
   * If a character with value <code>ch</code> occurs in the character
   * sequence represented by this <code>String</code> object at an index
   * no smaller than <code>fromIndex</code>, then the index of the first
   * such occurrence is returned--that is, the smallest value <i>k</i>
   * such that:
   * <blockquote><pre>
   * (this.charAt(<i>k</i>) == ch) && (<i>k</i> >= fromIndex)
   * </pre></blockquote>
   * is true. If no such character occurs in this string at or after
   * position <code>fromIndex</code>, then <code>-1</code> is returned.
   * <p>
   * There is no restriction on the value of <code>fromIndex</code>. If it
   * is negative, it has the same effect as if it were zero: this entire
   * string may be searched. If it is greater than the length of this
   * string, it has the same effect as if it were equal to the length of
   * this string: <code>-1</code> is returned.
   *
   * @param   ch          a character.
   * @param   fromIndex   the index to start the search from.
   * @return  the index of the first occurrence of the character in the
   *          character sequence represented by this object that is greater
   *          than or equal to <code>fromIndex</code>, or <code>-1</code>
   *          if the character does not occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int indexOf(int ch)

  /**
   * Returns the index within this string of the first occurrence of the
   * specified character. If a character with value <code>ch</code> occurs
   * in the character sequence represented by this <code>String</code>
   * object, then the index of the first such occurrence is returned --
   * that is, the smallest value <i>k</i> such that:
   * <blockquote><pre>
   * this.charAt(<i>k</i>) == ch
   * </pre></blockquote>
   * is <code>true</code>. If no such character occurs in this string,
   * then <code>-1</code> is returned.
   *
   * @param   ch   a character.
   * @return  the index of the first occurrence of the character in the
   *          character sequence represented by this object, or
   *          <code>-1</code> if the character does not occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean startsWith(XMLString prefix)

  /**
   * Tests if this string starts with the specified prefix.
   *
   * @param   prefix   the prefix.
   * @return  <code>true</code> if the character sequence represented by the
   *          argument is a prefix of the character sequence represented by
   *          this string; <code>false</code> otherwise.
   *          Note also that <code>true</code> will be returned if the
   *          argument is an empty string or is equal to this
   *          <code>String</code> object as determined by the
   *          {@link #equals(Object)} method.
   * @exception java.lang.NullPointerException if <code>prefix</code> is
   *          <code>null</code>.
   * @since   JDK1. 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean startsWith(XMLString prefix, int toffset)

  /**
   * Tests if this string starts with the specified prefix beginning
   * a specified index.
   *
   * @param   prefix    the prefix.
   * @param   toffset   where to begin looking in the string.
   * @return  <code>true</code> if the character sequence represented by the
   *          argument is a prefix of the substring of this object starting
   *          at index <code>toffset</code>; <code>false</code> otherwise.
   *          The result is <code>false</code> if <code>toffset</code> is
   *          negative or greater than the length of this
   *          <code>String</code> object; otherwise the result is the same
   *          as the result of the expression
   *          <pre>
   *          this.subString(toffset).startsWith(prefix)
   *          </pre>
   * @exception java.lang.NullPointerException if <code>prefix</code> is
   *          <code>null</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int hashCode()

  /**
   * Returns a hashcode for this string. The hashcode for a
   * <code>String</code> object is computed as
   * <blockquote><pre>
   * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
   * </pre></blockquote>
   * using <code>int</code> arithmetic, where <code>s[i]</code> is the
   * <i>i</i>th character of the string, <code>n</code> is the length of
   * the string, and <code>^</code> indicates exponentiation.
   * (The hash value of the empty string is zero.)
   *
   * @return  a hash code value for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int compareToIgnoreCase(XMLString xstr)

  /**
   * Compares two strings lexicographically, ignoring case considerations.
   * This method returns an integer whose sign is that of
   * <code>this.toUpperCase().toLowerCase().compareTo(
   * str.toUpperCase().toLowerCase())</code>.
   * <p>
   * Note that this method does <em>not</em> take locale into account,
   * and will result in an unsatisfactory ordering for certain locales.
   * The java.text package provides <em>collators</em> to allow
   * locale-sensitive ordering.
   *
   * @param   xstr   the <code>String</code> to be compared.
   *
   * @return  a negative integer, zero, or a positive integer as the
   *          the specified String is greater than, equal to, or less
   *          than this String, ignoring case considerations.
   * @see     java.text.Collator#compare(String, String)
   * @since   1.2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int compareTo(XMLString xstr)

  /**
   * Compares two strings lexicographically.
   *
   * @param   xstr   the <code>String</code> to be compared.
   *
   * @return  the value <code>0</code> if the argument string is equal to
   *          this string; a value less than <code>0</code> if this string
   *          is lexicographically less than the string argument; and a
   *          value greater than <code>0</code> if this string is
   *          lexicographically greater than the string argument.
   * @exception java.lang.NullPointerException if <code>anotherString</code>
   *          is <code>null</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equalsIgnoreCase(String anotherString)

  /**
   * Compares this <code>String</code> to another <code>String</code>,
   * ignoring case considerations.  Two strings are considered equal
   * ignoring case if they are of the same length, and corresponding
   * characters in the two strings are equal ignoring case.
   *
   * @param   anotherString   the <code>String</code> to compare this
   *                          <code>String</code> against.
   * @return  <code>true</code> if the argument is not <code>null</code>
   *          and the <code>String</code>s are equal,
   *          ignoring case; <code>false</code> otherwise.
   * @see     #equals(Object)
   * @see     java.lang.Character#toLowerCase(char)
   * @see java.lang.Character#toUpperCase(char)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(Object obj2)

  /**
   * Compares this string to the specified object.
   * The result is <code>true</code> if and only if the argument is not
   * <code>null</code> and is a <code>String</code> object that represents
   * the same sequence of characters as this object.
   *
   * @param   obj2       the object to compare this <code>String</code>
   *                     against.
   *
   * @return  <code>true</code> if the <code>String </code>are equal;
   *          <code>false</code> otherwise.
   * @see     java.lang.String#compareTo(java.lang.String)
   * @see     java.lang.String#equalsIgnoreCase(java.lang.String)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(String anotherString)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param anotherString Object to compare this to
   *
   * @return true if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return true if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(XMLString obj2)

  /**
   * Compares this string to the specified object.
   * The result is <code>true</code> if and only if the argument is not
   * <code>null</code> and is a <code>String</code> object that represents
   * the same sequence of characters as this object.
   *
   * @param   obj2       the object to compare this <code>String</code>
   *                     against.
   *
   * @return  <code>true</code> if the <code>String </code>are equal;
   *          <code>false</code> otherwise.
   * @see     java.lang.String#compareTo(java.lang.String)
   * @see     java.lang.String#equalsIgnoreCase(java.lang.String)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)

  /**
   * Copies characters from this string into the destination character
   * array.
   *
   * @param      srcBegin   index of the first character in the string
   *                        to copy.
   * @param      srcEnd     index after the last character in the string
   *                        to copy.
   * @param      dst        the destination array.
   * @param      dstBegin   the start offset in the destination array.
   * @exception IndexOutOfBoundsException If any of the following
   *            is true:
   *            <ul><li><code>srcBegin</code> is negative.
   *            <li><code>srcBegin</code> is greater than <code>srcEnd</code>
   *            <li><code>srcEnd</code> is greater than the length of this
   *                string
   *            <li><code>dstBegin</code> is negative
   *            <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than
   *                <code>dst.length</code></ul>
   * @exception NullPointerException if <code>dst</code> is <code>null</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public char charAt(int index)

  /**
   * Returns the character at the specified index. An index ranges
   * from <code>0</code> to <code>length() - 1</code>. The first character
   * of the sequence is at index <code>0</code>, the next at index
   * <code>1</code>, and so on, as for array indexing.
   *
   * @param      index   the index of the character.
   * @return     the character at the specified index of this string.
   *             The first character is at index <code>0</code>.
   * @exception  IndexOutOfBoundsException  if the <code>index</code>
   *             argument is negative or not less than the length of this
   *             string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int length()

  /**
   * Returns the length of this string.
   *
   * @return  the length of the sequence of characters represented by this
   *          object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void dispatchAsComment(org.xml.sax.ext.LexicalHandler lh)

  /**
   * Directly call the
   * comment method on the passed LexicalHandler for the
   * string-value.
   *
   * @param lh A non-null reference to a LexicalHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void dispatchCharactersEvents(org.xml.sax.ContentHandler ch)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value. Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public Object object()

  /**
   * Since this object is incomplete without the length and the offset, we
   * have to convert to a string when this function is called.
   *
   * @return The java String representation of this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
//  static java.util.Hashtable xtable = new java.util.Hashtable();

//  /** NEEDSDOC Field xtable */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
//  public static int strCount = 0;

//  /** NEEDSDOC Field strCount */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean hasString()

  /**
   * Tell if this object contains a java String object.
   *
   * @return true if this XMLString can return a string without creating one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public FastStringBuffer fsb()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  private XStringForFSB(String val)

  /**
   * Construct a XNodeSet object.
   *
   * @param val String object this will wrap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XStringForFSB(FastStringBuffer val, int start, int length)

  /**
   * Construct a XNodeSet object.
   *
   * @param val FastStringBuffer object this will wrap, must be non-null.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  protected int m_hash = 0;

  /** cached hash code */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  protected String m_strCache = null;

  /** If the str() function is called, the string will be cached here. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  int m_length;

  /** The length of the string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  int m_start;

  /** The start position in the fsb. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
public class XStringForFSB extends XString

/**
 * This class will wrap a FastStringBuffer and allow for
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public double toDouble()

  /**
   * Convert a string to a double -- Allowed input is in fixed
   * notation ddd.fff.
   *
   * %OPT% CHECK PERFORMANCE against generating a Java String and
   * converting it to double. The advantage of running in native
   * machine code -- perhaps even microcode, on some systems -- may
   * more than make up for the cost of allocating and discarding the
   * additional object. We need to benchmark this.
   *
   * %OPT% More importantly, we need to decide whether we _care_ about
   * the performance of this operation. Does XString.toDouble constitute
   * any measurable percentage of our typical runtime? I suspect not!
   *
   * @return A double value representation of the string, or return Double.NaN
   * if the string can not be converted.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString fixWhiteSpace(boolean trimHead, boolean trimTail,
                                 boolean doublePunctuationSpaces)

  /**
   * Conditionally trim all leading and trailing whitespace in the specified String.
   * All strings of white space are
   * replaced by a single space character (#x20), except spaces after punctuation which
   * receive double spaces if doublePunctuationSpaces is true.
   * This function may be useful to a formatter, but to get first class
   * results, the formatter should probably do it's own white space handling
   * based on the semantics of the formatting object.
   *
   * @param   trimHead    Trim leading whitespace?
   * @param   trimTail    Trim trailing whitespace?
   * @param   doublePunctuationSpaces    Use double spaces for punctuation?
   * @return              The trimmed string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  private static boolean isSpace(char ch)

  /**
   * Returns whether the specified <var>ch</var> conforms to the XML 1.0 definition
   * of whitespace.  Refer to <A href="http://www.w3.org/TR/1998/REC-xml-19980210#NT-S">
   * the definition of <CODE>S</CODE></A> for details.
   * @param   ch      Character to check as XML whitespace.
   * @return          =true if <var>ch</var> is XML whitespace; otherwise =false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString trim()

  /**
   * Removes white space from both ends of this string.
   *
   * @return  this string, with white space removed from the front and end.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString concat(String str)

  /**
   * Concatenates the specified string to the end of this string.
   *
   * @param   str   the <code>String</code> that is concatenated to the end
   *                of this <code>String</code>.
   * @return  a string that represents the concatenation of this object's
   *          characters followed by the string argument's characters.
   * @exception java.lang.NullPointerException if <code>str</code> is
   *          <code>null</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString substring(int beginIndex, int endIndex)

  /**
   * Returns a new string that is a substring of this string. The
   * substring begins at the specified <code>beginIndex</code> and
   * extends to the character at index <code>endIndex - 1</code>.
   * Thus the length of the substring is <code>endIndex-beginIndex</code>.
   *
   * @param      beginIndex   the beginning index, inclusive.
   * @param      endIndex     the ending index, exclusive.
   * @return     the specified substring.
   * @exception  IndexOutOfBoundsException  if the
   *             <code>beginIndex</code> is negative, or
   *             <code>endIndex</code> is larger than the length of
   *             this <code>String</code> object, or
   *             <code>beginIndex</code> is larger than
   *             <code>endIndex</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XMLString substring(int beginIndex)

  /**
   * Returns a new string that is a substring of this string. The
   * substring begins with the character at the specified index and
   * extends to the end of this string. <p>
   * Examples:
   * <blockquote><pre>
   * "unhappy".substring(2) returns "happy"
   * "Harbison".substring(3) returns "bison"
   * "emptiness".substring(9) returns "" (an empty string)
   * </pre></blockquote>
   *
   * @param      beginIndex   the beginning index, inclusive.
   * @return     the specified substring.
   * @exception  IndexOutOfBoundsException  if
   *             <code>beginIndex</code> is negative or larger than the
   *             length of this <code>String</code> object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int indexOf(int ch, int fromIndex)

  /**
   * Returns the index within this string of the first occurrence of the
   * specified character, starting the search at the specified index.
   * <p>
   * If a character with value <code>ch</code> occurs in the character
   * sequence represented by this <code>String</code> object at an index
   * no smaller than <code>fromIndex</code>, then the index of the first
   * such occurrence is returned--that is, the smallest value <i>k</i>
   * such that:
   * <blockquote><pre>
   * (this.charAt(<i>k</i>) == ch) && (<i>k</i> >= fromIndex)
   * </pre></blockquote>
   * is true. If no such character occurs in this string at or after
   * position <code>fromIndex</code>, then <code>-1</code> is returned.
   * <p>
   * There is no restriction on the value of <code>fromIndex</code>. If it
   * is negative, it has the same effect as if it were zero: this entire
   * string may be searched. If it is greater than the length of this
   * string, it has the same effect as if it were equal to the length of
   * this string: <code>-1</code> is returned.
   *
   * @param   ch          a character.
   * @param   fromIndex   the index to start the search from.
   * @return  the index of the first occurrence of the character in the
   *          character sequence represented by this object that is greater
   *          than or equal to <code>fromIndex</code>, or <code>-1</code>
   *          if the character does not occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int indexOf(int ch)

  /**
   * Returns the index within this string of the first occurrence of the
   * specified character. If a character with value <code>ch</code> occurs
   * in the character sequence represented by this <code>String</code>
   * object, then the index of the first such occurrence is returned --
   * that is, the smallest value <i>k</i> such that:
   * <blockquote><pre>
   * this.charAt(<i>k</i>) == ch
   * </pre></blockquote>
   * is <code>true</code>. If no such character occurs in this string,
   * then <code>-1</code> is returned.
   *
   * @param   ch   a character.
   * @return  the index of the first occurrence of the character in the
   *          character sequence represented by this object, or
   *          <code>-1</code> if the character does not occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean startsWith(XMLString prefix)

  /**
   * Tests if this string starts with the specified prefix.
   *
   * @param   prefix   the prefix.
   * @return  <code>true</code> if the character sequence represented by the
   *          argument is a prefix of the character sequence represented by
   *          this string; <code>false</code> otherwise.
   *          Note also that <code>true</code> will be returned if the
   *          argument is an empty string or is equal to this
   *          <code>String</code> object as determined by the
   *          {@link #equals(Object)} method.
   * @exception java.lang.NullPointerException if <code>prefix</code> is
   *          <code>null</code>.
   * @since   JDK1. 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean startsWith(XMLString prefix, int toffset)

  /**
   * Tests if this string starts with the specified prefix beginning
   * a specified index.
   *
   * @param   prefix    the prefix.
   * @param   toffset   where to begin looking in the string.
   * @return  <code>true</code> if the character sequence represented by the
   *          argument is a prefix of the substring of this object starting
   *          at index <code>toffset</code>; <code>false</code> otherwise.
   *          The result is <code>false</code> if <code>toffset</code> is
   *          negative or greater than the length of this
   *          <code>String</code> object; otherwise the result is the same
   *          as the result of the expression
   *          <pre>
   *          this.subString(toffset).startsWith(prefix)
   *          </pre>
   * @exception java.lang.NullPointerException if <code>prefix</code> is
   *          <code>null</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int hashCode()

  /**
   * Returns a hashcode for this string. The hashcode for a
   * <code>String</code> object is computed as
   * <blockquote><pre>
   * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
   * </pre></blockquote>
   * using <code>int</code> arithmetic, where <code>s[i]</code> is the
   * <i>i</i>th character of the string, <code>n</code> is the length of
   * the string, and <code>^</code> indicates exponentiation.
   * (The hash value of the empty string is zero.)
   *
   * @return  a hash code value for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int compareToIgnoreCase(XMLString xstr)

  /**
   * Compares two strings lexicographically, ignoring case considerations.
   * This method returns an integer whose sign is that of
   * <code>this.toUpperCase().toLowerCase().compareTo(
   * str.toUpperCase().toLowerCase())</code>.
   * <p>
   * Note that this method does <em>not</em> take locale into account,
   * and will result in an unsatisfactory ordering for certain locales.
   * The java.text package provides <em>collators</em> to allow
   * locale-sensitive ordering.
   *
   * @param   xstr   the <code>String</code> to be compared.
   *
   * @return  a negative integer, zero, or a positive integer as the
   *          the specified String is greater than, equal to, or less
   *          than this String, ignoring case considerations.
   * @see     java.text.Collator#compare(String, String)
   * @since   1.2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int compareTo(XMLString xstr)

  /**
   * Compares two strings lexicographically.
   *
   * @param   xstr   the <code>String</code> to be compared.
   *
   * @return  the value <code>0</code> if the argument string is equal to
   *          this string; a value less than <code>0</code> if this string
   *          is lexicographically less than the string argument; and a
   *          value greater than <code>0</code> if this string is
   *          lexicographically greater than the string argument.
   * @exception java.lang.NullPointerException if <code>anotherString</code>
   *          is <code>null</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equalsIgnoreCase(String anotherString)

  /**
   * Compares this <code>String</code> to another <code>String</code>,
   * ignoring case considerations.  Two strings are considered equal
   * ignoring case if they are of the same length, and corresponding
   * characters in the two strings are equal ignoring case.
   *
   * @param   anotherString   the <code>String</code> to compare this
   *                          <code>String</code> against.
   * @return  <code>true</code> if the argument is not <code>null</code>
   *          and the <code>String</code>s are equal,
   *          ignoring case; <code>false</code> otherwise.
   * @see     #equals(Object)
   * @see     java.lang.Character#toLowerCase(char)
   * @see java.lang.Character#toUpperCase(char)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(Object obj2)

  /**
   * Compares this string to the specified object.
   * The result is <code>true</code> if and only if the argument is not
   * <code>null</code> and is a <code>String</code> object that represents
   * the same sequence of characters as this object.
   *
   * @param   obj2       the object to compare this <code>String</code>
   *                     against.
   *
   * @return  <code>true</code> if the <code>String </code>are equal;
   *          <code>false</code> otherwise.
   * @see     java.lang.String#compareTo(java.lang.String)
   * @see     java.lang.String#equalsIgnoreCase(java.lang.String)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(String anotherString)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param anotherString Object to compare this to
   *
   * @return true if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return true if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean equals(XMLString obj2)

  /**
   * Compares this string to the specified object.
   * The result is <code>true</code> if and only if the argument is not
   * <code>null</code> and is a <code>String</code> object that represents
   * the same sequence of characters as this object.
   *
   * @param   obj2       the object to compare this <code>String</code>
   *                     against.
   *
   * @return  <code>true</code> if the <code>String </code>are equal;
   *          <code>false</code> otherwise.
   * @see     java.lang.String#compareTo(java.lang.String)
   * @see     java.lang.String#equalsIgnoreCase(java.lang.String)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)

  /**
   * Copies characters from this string into the destination character
   * array.
   *
   * @param      srcBegin   index of the first character in the string
   *                        to copy.
   * @param      srcEnd     index after the last character in the string
   *                        to copy.
   * @param      dst        the destination array.
   * @param      dstBegin   the start offset in the destination array.
   * @exception IndexOutOfBoundsException If any of the following
   *            is true:
   *            <ul><li><code>srcBegin</code> is negative.
   *            <li><code>srcBegin</code> is greater than <code>srcEnd</code>
   *            <li><code>srcEnd</code> is greater than the length of this
   *                string
   *            <li><code>dstBegin</code> is negative
   *            <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than
   *                <code>dst.length</code></ul>
   * @exception NullPointerException if <code>dst</code> is <code>null</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public char charAt(int index)

  /**
   * Returns the character at the specified index. An index ranges
   * from <code>0</code> to <code>length() - 1</code>. The first character
   * of the sequence is at index <code>0</code>, the next at index
   * <code>1</code>, and so on, as for array indexing.
   *
   * @param      index   the index of the character.
   * @return     the character at the specified index of this string.
   *             The first character is at index <code>0</code>.
   * @exception  IndexOutOfBoundsException  if the <code>index</code>
   *             argument is negative or not less than the length of this
   *             string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public int length()

  /**
   * Returns the length of this string.
   *
   * @return  the length of the sequence of characters represented by this
   *          object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void dispatchAsComment(org.xml.sax.ext.LexicalHandler lh)

  /**
   * Directly call the
   * comment method on the passed LexicalHandler for the
   * string-value.
   *
   * @param lh A non-null reference to a LexicalHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void dispatchCharactersEvents(org.xml.sax.ContentHandler ch)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value. Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public Object object()

  /**
   * Since this object is incomplete without the length and the offset, we
   * have to convert to a string when this function is called.
   *
   * @return The java String representation of this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
//  static java.util.Hashtable xtable = new java.util.Hashtable();

//  /** NEEDSDOC Field xtable */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
//  public static int strCount = 0;

//  /** NEEDSDOC Field strCount */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public boolean hasString()

  /**
   * Tell if this object contains a java String object.
   *
   * @return true if this XMLString can return a string without creating one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public FastStringBuffer fsb()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  private XStringForFSB(String val)

  /**
   * Construct a XNodeSet object.
   *
   * @param val String object this will wrap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  public XStringForFSB(FastStringBuffer val, int start, int length)

  /**
   * Construct a XNodeSet object.
   *
   * @param val FastStringBuffer object this will wrap, must be non-null.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  protected int m_hash = 0;

  /** cached hash code */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  protected String m_strCache = null;

  /** If the str() function is called, the string will be cached here. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  int m_length;

  /** The length of the string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
  int m_start;

  /** The start position in the fsb. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForFSB.java
public class XStringForFSB extends XString

/**
 * This class will wrap a FastStringBuffer and allow for
 */