_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
        protected Type(String name) {

        /**
         * Constructs a new enumerated control type.
         * @param name  the name of the new enumerated control type
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
        public static final Type REVERB         = new Type("Reverb");

        /**
         * Represents a control over a set of possible reverberation settings.
         * Each reverberation setting is described by an instance of the
         * {@link ReverbType} class.  (To access these settings,
         * invoke <code>{@link EnumControl#getValues}</code> on an
         * enumerated control of type <code>REVERB</code>.)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    public static class Type extends Control.Type {

    /**
     * An instance of the <code>EnumControl.Type</code> inner class identifies one kind of
     * enumerated control.  Static instances are provided for the
     * common types.
     *
     * @see EnumControl
     *
     * @author Kara Kytle
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    public String toString() {

    /**
     * Provides a string representation of the control.
     * @return a string description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    private boolean isValueSupported(Object value) {

    /**
     * Indicates whether the value specified is supported.
     * @param value the value for which support is queried
     * @return <code>true</code> if the value is supported,
     * otherwise <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    public Object[] getValues() {

    /**
     * Returns the set of possible values for this control.
     * @return the set of possible values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    public Object getValue() {

    /**
     * Obtains this control's current value.
     * @return the current value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    public void setValue(Object value) {

    /**
     * Sets the current value for the control.  The default implementation
     * simply sets the value as indicated.  If the value indicated is not
     * supported, an IllegalArgumentException is thrown.
     * Some controls require that their line be open before they can be affected
     * by setting a value.
     * @param value the desired new value
     * @throws IllegalArgumentException if the value indicated does not fall
     * within the allowable range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    protected EnumControl(Type type, Object[] values, Object value) {

    /**
     * Constructs a new enumerated control object with the given parameters.
     *
     * @param type the type of control represented this enumerated control object
     * @param values the set of possible values for the control
     * @param value the initial control value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    private Object value;

    /**
     * The current value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
    private Object[] values;

    /**
     * The set of possible values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/EnumControl.java
public abstract class EnumControl extends Control {

/**
 * A <code>EnumControl</code> provides control over a set of
 * discrete possible values, each represented by an object.  In a
 * graphical user interface, such a control might be represented
 * by a set of buttons, each of which chooses one value or setting.  For
 * example, a reverb control might provide several preset reverberation
 * settings, instead of providing continuously adjustable parameters
 * of the sort that would be represented by <code>{@link FloatControl}</code>
 * objects.
 * <p>
 * Controls that provide a choice between only two settings can often be implemented
 * instead as a <code>{@link BooleanControl}</code>, and controls that provide
 * a set of values along some quantifiable dimension might be implemented
 * instead as a <code>FloatControl</code> with a coarse resolution.
 * However, a key feature of <code>EnumControl</code> is that the returned values
 * are arbitrary objects, rather than numerical or boolean values.  This means that each
 * returned object can provide further information.  As an example, the settings
 * of a <code>{@link EnumControl.Type#REVERB REVERB}</code> control are instances of
 * <code>{@link ReverbType}</code> that can be queried for the parameter values
 * used for each setting.
 *
 * @author Kara Kytle
 * @since 1.3
 */
