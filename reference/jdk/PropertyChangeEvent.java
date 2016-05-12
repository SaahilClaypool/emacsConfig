_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public String toString() {

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private Object propagationId;

    /**
     * Propagation ID.  May be null.
     * @serial
     * @see #getPropagationId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private Object oldValue;

    /**
     * Previous value for property.  May be null if not known.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private Object newValue;

    /**
     * New value for property.  May be null if not known.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private String propertyName;

    /**
     * name of the property that changed.  May be null, if not known.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public Object getPropagationId() {

    /**
     * The "propagationId" field is reserved for future use.  In Beans 1.0
     * the sole requirement is that if a listener catches a PropertyChangeEvent
     * and then fires a PropertyChangeEvent of its own, then it should
     * make sure that it propagates the propagationId field from its
     * incoming event to its outgoing event.
     *
     * @return the propagationId object associated with a bound/constrained
     *          property update.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public void setPropagationId(Object propagationId) {

    /**
     * Sets the propagationId object for the event.
     *
     * @param propagationId  The propagationId object for the event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public Object getOldValue() {

    /**
     * Gets the old value for the property, expressed as an Object.
     *
     * @return  The old value for the property, expressed as an Object.
     *          May be null if multiple properties have changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public Object getNewValue() {

    /**
     * Gets the new value for the property, expressed as an Object.
     *
     * @return  The new value for the property, expressed as an Object.
     *          May be null if multiple properties have changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public String getPropertyName() {

    /**
     * Gets the programmatic name of the property that was changed.
     *
     * @return  The programmatic name of the property that was changed.
     *          May be null if multiple properties have changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public PropertyChangeEvent(Object source, String propertyName,
                               Object oldValue, Object newValue) {

    /**
     * Constructs a new {@code PropertyChangeEvent}.
     *
     * @param source        the bean that fired the event
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     *
     * @throws IllegalArgumentException if {@code source} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
public class PropertyChangeEvent extends EventObject {

/**
 * A "PropertyChange" event gets delivered whenever a bean changes a "bound"
 * or "constrained" property.  A PropertyChangeEvent object is sent as an
 * argument to the PropertyChangeListener and VetoableChangeListener methods.
 * <P>
 * Normally PropertyChangeEvents are accompanied by the name and the old
 * and new value of the changed property.  If the new value is a primitive
 * type (such as int or boolean) it must be wrapped as the
 * corresponding java.lang.* Object type (such as Integer or Boolean).
 * <P>
 * Null values may be provided for the old and the new values if their
 * true values are not known.
 * <P>
 * An event source may send a null object as the name to indicate that an
 * arbitrary set of if its properties have changed.  In this case the
 * old and new values should also be null.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public String toString() {

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private Object propagationId;

    /**
     * Propagation ID.  May be null.
     * @serial
     * @see #getPropagationId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private Object oldValue;

    /**
     * Previous value for property.  May be null if not known.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private Object newValue;

    /**
     * New value for property.  May be null if not known.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    private String propertyName;

    /**
     * name of the property that changed.  May be null, if not known.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public Object getPropagationId() {

    /**
     * The "propagationId" field is reserved for future use.  In Beans 1.0
     * the sole requirement is that if a listener catches a PropertyChangeEvent
     * and then fires a PropertyChangeEvent of its own, then it should
     * make sure that it propagates the propagationId field from its
     * incoming event to its outgoing event.
     *
     * @return the propagationId object associated with a bound/constrained
     *          property update.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public void setPropagationId(Object propagationId) {

    /**
     * Sets the propagationId object for the event.
     *
     * @param propagationId  The propagationId object for the event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public Object getOldValue() {

    /**
     * Gets the old value for the property, expressed as an Object.
     *
     * @return  The old value for the property, expressed as an Object.
     *          May be null if multiple properties have changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public Object getNewValue() {

    /**
     * Gets the new value for the property, expressed as an Object.
     *
     * @return  The new value for the property, expressed as an Object.
     *          May be null if multiple properties have changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public String getPropertyName() {

    /**
     * Gets the programmatic name of the property that was changed.
     *
     * @return  The programmatic name of the property that was changed.
     *          May be null if multiple properties have changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
    public PropertyChangeEvent(Object source, String propertyName,
                               Object oldValue, Object newValue) {

    /**
     * Constructs a new {@code PropertyChangeEvent}.
     *
     * @param source        the bean that fired the event
     * @param propertyName  the programmatic name of the property that was changed
     * @param oldValue      the old value of the property
     * @param newValue      the new value of the property
     *
     * @throws IllegalArgumentException if {@code source} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyChangeEvent.java
public class PropertyChangeEvent extends EventObject {

/**
 * A "PropertyChange" event gets delivered whenever a bean changes a "bound"
 * or "constrained" property.  A PropertyChangeEvent object is sent as an
 * argument to the PropertyChangeListener and VetoableChangeListener methods.
 * <P>
 * Normally PropertyChangeEvents are accompanied by the name and the old
 * and new value of the changed property.  If the new value is a primitive
 * type (such as int or boolean) it must be wrapped as the
 * corresponding java.lang.* Object type (such as Integer or Boolean).
 * <P>
 * Null values may be provided for the old and the new values if their
 * true values are not known.
 * <P>
 * An event source may send a null object as the name to indicate that an
 * arbitrary set of if its properties have changed.  In this case the
 * old and new values should also be null.
 */
