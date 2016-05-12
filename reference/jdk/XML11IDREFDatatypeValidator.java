_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/dtd/XML11IDREFDatatypeValidator.java
    public void validate(String content, ValidationContext context) throws InvalidDatatypeValueException {

    /**
     * Checks that "content" string is valid IDREF value.
     * If invalid a Datatype validation exception is thrown.
     *
     * @param content       the string value that needs to be validated
     * @param context       the validation context
     * @throws InvalidDatatypeException if the content is
     *         invalid according to the rules for the validators
     * @see InvalidDatatypeValueException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/dtd/XML11IDREFDatatypeValidator.java
public class XML11IDREFDatatypeValidator extends IDREFDatatypeValidator {

/**
 * <P>IDREFDatatypeValidator - represents the IDREFS
 * attribute type from XML 1.1 recommendation. The
 * Value Space of IDREF is the set of all strings
 * that match the NCName production and have been
 * used in an XML Document as the value of an element
 * or attribute of Type ID. The Lexical space of
 * IDREF is the set of strings that match the NCName
 * production.</P>
 * <P>The Value space of IDREF is scoped to a specific
 * instance document</P>
 *
 * @xerces.internal
 *
 * @author Jeffrey Rodriguez, IBM
 * @author Sandy Gao, IBM
 * @author Neil Graham, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/dtd/XML11IDREFDatatypeValidator.java
    public void validate(String content, ValidationContext context) throws InvalidDatatypeValueException {

    /**
     * Checks that "content" string is valid IDREF value.
     * If invalid a Datatype validation exception is thrown.
     *
     * @param content       the string value that needs to be validated
     * @param context       the validation context
     * @throws InvalidDatatypeException if the content is
     *         invalid according to the rules for the validators
     * @see InvalidDatatypeValueException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/dtd/XML11IDREFDatatypeValidator.java
public class XML11IDREFDatatypeValidator extends IDREFDatatypeValidator {

/**
 * <P>IDREFDatatypeValidator - represents the IDREFS
 * attribute type from XML 1.1 recommendation. The
 * Value Space of IDREF is the set of all strings
 * that match the NCName production and have been
 * used in an XML Document as the value of an element
 * or attribute of Type ID. The Lexical space of
 * IDREF is the set of strings that match the NCName
 * production.</P>
 * <P>The Value space of IDREF is scoped to a specific
 * instance document</P>
 *
 * @xerces.internal
 *
 * @author Jeffrey Rodriguez, IBM
 * @author Sandy Gao, IBM
 * @author Neil Graham, IBM
 *
 */
