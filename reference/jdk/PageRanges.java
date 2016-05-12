_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
    public final String getName() {

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <P>
     * For class PageRanges, the category name is <CODE>"page-ranges"</CODE>.
     *
     * @return  Attribute category name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
    public final Class<? extends Attribute> getCategory() {

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <P>
     * For class PageRanges, the category is class PageRanges itself.
     *
     * @return  Printing attribute class (category), an instance of class
     *          {@link java.lang.Class java.lang.Class}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
    public boolean equals(Object object) {

    /**
     * Returns whether this page ranges attribute is equivalent to the passed
     * in object. To be equivalent, all of the following conditions must be
     * true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>object</CODE> is not null.
     * <LI>
     * <CODE>object</CODE> is an instance of class PageRanges.
     * <LI>
     * This page ranges attribute's members and <CODE>object</CODE>'s members
     * are the same.
     * </OL>
     *
     * @param  object  Object to compare to.
     *
     * @return  True if <CODE>object</CODE> is equivalent to this page ranges
     *          attribute, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
    public PageRanges(int lowerBound, int upperBound) {

    /**
     * Construct a new page ranges attribute containing a single range of
     * integers. That is, only those pages in the one range are to be printed.
     *
     * @param  lowerBound  Lower bound of the range.
     * @param  upperBound  Upper bound of the range.
     *
     * @exception  IllegalArgumentException
     *     (Unchecked exception) Thrown if a null range is specified or if a
     *     non-null range is specified with <CODE>lowerBound</CODE> less than
     *     1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
    public PageRanges(int member) {

    /**
     * Construct a new page ranges attribute containing a single integer. That
     * is, only the one page is to be printed.
     *
     * @param  member  Set member.
     *
     * @exception  IllegalArgumentException
     *     (Unchecked exception) Thrown if <CODE>member</CODE> is less than
     *     1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
    public PageRanges(String members) {

    /**
     * Construct a new  page ranges attribute with the given members in
     * string form.
     * See class {@link javax.print.attribute.SetOfIntegerSyntax
     * SetOfIntegerSyntax}
     * for explanation of the syntax.
     *
     * @param  members  Set members in string form.
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>members</CODE> is null or
     *     any element of <CODE>members</CODE> is null.
     * @exception  IllegalArgumentException
     *     (Unchecked exception) Thrown if <CODE>members</CODE> does not
     *    obey  the proper syntax.  Also
     *     thrown if the constructed set-of-integer is a
     *     zero-length array or if any
     *     member of the set is less than 1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
    public PageRanges(int[][] members) {

    /**
     * Construct a new page ranges attribute with the given members. The
     * members are specified in "array form;" see class {@link
     * javax.print.attribute.SetOfIntegerSyntax SetOfIntegerSyntax} for an
     * explanation of array form.
     *
     * @param  members  Set members in array form.
     *
     * @exception  NullPointerException
     *     (unchecked exception) Thrown if <CODE>members</CODE> is null or
     *     any element of <CODE>members</CODE> is null.
     * @exception  IllegalArgumentException
     *     (unchecked exception) Thrown if any element of
     *   <CODE>members</CODE> is not a length-one or length-two array. Also
     *     thrown if <CODE>members</CODE> is a zero-length array or if any
     *     member of the set is less than 1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/PageRanges.java
public final class PageRanges   extends SetOfIntegerSyntax

/**
 * Class PageRanges is a printing attribute class, a set of integers, that
 * identifies the range(s) of print-stream pages that the Printer object uses
 * for each copy of each document which are to be printed. Nothing is printed
 * for any pages identified that do not exist in the document(s). The attribute
 * is associated with <I>print-stream</I> pages, not application-numbered pages
 * (for example, the page numbers found in the headers and or footers for
 * certain word processing applications).
 * <P>
 * In most cases, the exact pages to be printed will be generated by a device
 * driver and this attribute would not be required. However, when printing an
 * archived document which has already been formatted, the end user may elect to
 * print just a subset of the pages contained in the document. In this case, if
 * a page range of <CODE>"<I>n</I>-<I>m</I>"</CODE> is specified, the first page
 * to be printed will be page <I>n.</I> All subsequent pages of the document
 * will be printed through and including page <I>m.</I>
 * <P>
 * If a PageRanges attribute is not specified for a print job, all pages of
 * the document will be printed. In other words, the default value for the
 * PageRanges attribute is always <CODE>{{1, Integer.MAX_VALUE}}</CODE>.
 * <P>
 * The effect of a PageRanges attribute on a multidoc print job (a job with
 * multiple documents) depends on whether all the docs have the same page ranges
 * specified or whether different docs have different page ranges specified, and
 * on the (perhaps defaulted) value of the {@link MultipleDocumentHandling
 * MultipleDocumentHandling} attribute.
 * <UL>
 * <LI>
 * If all the docs have the same page ranges specified, then any value of {@link
 * MultipleDocumentHandling MultipleDocumentHandling} makes sense, and the
 * printer's processing depends on the {@link MultipleDocumentHandling
 * MultipleDocumentHandling} value:
 * <UL>
 * <LI>
 * SINGLE_DOCUMENT -- All the input docs will be combined together into one
 * output document. The specified page ranges of that output document will be
 * printed.
 * <P>
 * <LI>
 * SINGLE_DOCUMENT_NEW_SHEET -- All the input docs will be combined together
 * into one output document, and the first impression of each input doc will
 * always start on a new media sheet. The specified page ranges of that output
 * document will be printed.
 * <P>
 * <LI>
 * SEPARATE_DOCUMENTS_UNCOLLATED_COPIES -- For each separate input doc, the
 * specified page ranges will be printed.
 * <P>
 * <LI>
 * SEPARATE_DOCUMENTS_COLLATED_COPIES -- For each separate input doc, the
 * specified page ranges will be printed.
 * </UL>
 * <UL>
 * <LI>
 * SEPARATE_DOCUMENTS_UNCOLLATED_COPIES -- For each separate input doc, its own
 * specified page ranges will be printed..
 * <P>
 * <LI>
 * SEPARATE_DOCUMENTS_COLLATED_COPIES -- For each separate input doc, its own
 * specified page ranges will be printed..
 * </UL>
 * </UL>
 * <P>
 * <B>IPP Compatibility:</B> The PageRanges attribute's canonical array form
 * gives the lower and upper bound for each range of pages to be included in
 * and IPP "page-ranges" attribute. See class {@link
 * javax.print.attribute.SetOfIntegerSyntax SetOfIntegerSyntax} for an
 * explanation of canonical array form. The category name returned by
 * <CODE>getName()</CODE> gives the IPP attribute name.
 * <P>
 *
 * @author  David Mendenhall
 * @author  Alan Kaminsky
 */
