_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/RGBColor.java
    public CSSPrimitiveValue getBlue();

    /**
     *  This attribute is used for the blue value of the RGB color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/RGBColor.java
    public CSSPrimitiveValue getGreen();

    /**
     *  This attribute is used for the green value of the RGB color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/RGBColor.java
public interface RGBColor {

/**
 *  The <code>RGBColor</code> interface is used to represent any RGB color
 * value. This interface reflects the values in the underlying style
 * property. Hence, modifications made to the <code>CSSPrimitiveValue</code>
 * objects modify the style property.
 * <p> A specified RGB color is not clipped (even if the number is outside the
 * range 0-255 or 0%-100%). A computed RGB color is clipped depending on the
 * device.
 * <p> Even if a style sheet can only contain an integer for a color value,
 * the internal storage of this integer is a float, and this can be used as
 * a float in the specified or the computed style.
 * <p> A color percentage value can always be converted to a number and vice
 * versa.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
