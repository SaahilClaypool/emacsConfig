_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/encoding/InputObject.java
public interface InputObject

/**
 * <p> An <code>InputObject</code> is the interface used by the
 * presentation block to get programming language typed data from data
 *  encoded in a message. </p>
 *
 * <p> The implementation of an <code>InputObject</code> contains the
 * encoded data.  When the presentation block asks for data the
 * implementation of <code>InputObject</code> is responsible for converting
 * the encoded representation of the data to the types expected by the
 * programming language.</p>
 *
 * <p>A particular <em>encoding</em> would subclass
 * <code>InputObject</code>.  The subclass would provide methods to get
 * the data types appropriate to the presentation block (e.g., simple
 * types such as int or boolean, all the way to any type derived from
 * <code>java.io.Serializable</code>.).</p>
 *
 * <p>Note: the protocol block may also use the <code>InputObject</code> to
 * obtain header metadata.</p>
 *
 * @author Harold Carr
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/encoding/InputObject.java
public interface InputObject

/**
 * <p> An <code>InputObject</code> is the interface used by the
 * presentation block to get programming language typed data from data
 *  encoded in a message. </p>
 *
 * <p> The implementation of an <code>InputObject</code> contains the
 * encoded data.  When the presentation block asks for data the
 * implementation of <code>InputObject</code> is responsible for converting
 * the encoded representation of the data to the types expected by the
 * programming language.</p>
 *
 * <p>A particular <em>encoding</em> would subclass
 * <code>InputObject</code>.  The subclass would provide methods to get
 * the data types appropriate to the presentation block (e.g., simple
 * types such as int or boolean, all the way to any type derived from
 * <code>java.io.Serializable</code>.).</p>
 *
 * <p>Note: the protocol block may also use the <code>InputObject</code> to
 * obtain header metadata.</p>
 *
 * @author Harold Carr
*/