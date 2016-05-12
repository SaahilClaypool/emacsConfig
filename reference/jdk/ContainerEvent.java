_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event-logging and for debugging.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public Component getChild() {

    /**
     * Returns the component that was affected by the event.
     *
     * @return the Component object that was added or removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public Container getContainer() {

    /**
     * Returns the originator of the event.
     *
     * @return the <code>Container</code> object that originated
     * the event, or <code>null</code> if the object is not a
     * <code>Container</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public ContainerEvent(Component source, int id, Component child) {

    /**
     * Constructs a <code>ContainerEvent</code> object.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source The <code>Component</code> object (container)
     *               that originated the event
     * @param id     An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link ContainerEvent}
     * @param child  the component that was added or removed
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getContainer()
     * @see #getID()
     * @see #getChild()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    Component child;

    /**
     * The non-null component that is being added or
     * removed from the Container.
     *
     * @serial
     * @see #getChild()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int COMPONENT_REMOVED = 1 + CONTAINER_FIRST;

    /**
     * This event indicates that a component was removed from the container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int COMPONENT_ADDED     = CONTAINER_FIRST;

   /**
     * This event indicates that a component was added to the container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int CONTAINER_LAST              = 301;

    /**
     * The last number in the range of ids used for container events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int CONTAINER_FIRST             = 300;

    /**
     * The first number in the range of ids used for container events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
public class ContainerEvent extends ComponentEvent {

/**
 * A low-level event which indicates that a container's contents
 * changed because a component was added or removed.
 * <P>
 * Container events are provided for notification purposes ONLY;
 * The AWT will automatically handle changes to the containers
 * contents internally so that the program works properly regardless of
 * whether the program is receiving these events or not.
 * <P>
 * This low-level event is generated by a container object (such as a
 * Panel) when a component is added to it or removed from it.
 * The event is passed to every <code>ContainerListener</code>
 * or <code>ContainerAdapter</code> object which registered to receive such
 * events using the component's <code>addContainerListener</code> method.
 * (<code>ContainerAdapter</code> objects implement the
 * <code>ContainerListener</code> interface.) Each such listener object
 * gets this <code>ContainerEvent</code> when the event occurs.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code ContainerEvent} instance is not
 * in the range from {@code CONTAINER_FIRST} to {@code CONTAINER_LAST}.
 *
 * @see ContainerAdapter
 * @see ContainerListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/containerlistener.html">Tutorial: Writing a Container Listener</a>
 *
 * @author Tim Prinzing
 * @author Amy Fowler
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event-logging and for debugging.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public Component getChild() {

    /**
     * Returns the component that was affected by the event.
     *
     * @return the Component object that was added or removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public Container getContainer() {

    /**
     * Returns the originator of the event.
     *
     * @return the <code>Container</code> object that originated
     * the event, or <code>null</code> if the object is not a
     * <code>Container</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public ContainerEvent(Component source, int id, Component child) {

    /**
     * Constructs a <code>ContainerEvent</code> object.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source The <code>Component</code> object (container)
     *               that originated the event
     * @param id     An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link ContainerEvent}
     * @param child  the component that was added or removed
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getContainer()
     * @see #getID()
     * @see #getChild()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    Component child;

    /**
     * The non-null component that is being added or
     * removed from the Container.
     *
     * @serial
     * @see #getChild()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int COMPONENT_REMOVED = 1 + CONTAINER_FIRST;

    /**
     * This event indicates that a component was removed from the container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int COMPONENT_ADDED     = CONTAINER_FIRST;

   /**
     * This event indicates that a component was added to the container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int CONTAINER_LAST              = 301;

    /**
     * The last number in the range of ids used for container events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
    public static final int CONTAINER_FIRST             = 300;

    /**
     * The first number in the range of ids used for container events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ContainerEvent.java
public class ContainerEvent extends ComponentEvent {

/**
 * A low-level event which indicates that a container's contents
 * changed because a component was added or removed.
 * <P>
 * Container events are provided for notification purposes ONLY;
 * The AWT will automatically handle changes to the containers
 * contents internally so that the program works properly regardless of
 * whether the program is receiving these events or not.
 * <P>
 * This low-level event is generated by a container object (such as a
 * Panel) when a component is added to it or removed from it.
 * The event is passed to every <code>ContainerListener</code>
 * or <code>ContainerAdapter</code> object which registered to receive such
 * events using the component's <code>addContainerListener</code> method.
 * (<code>ContainerAdapter</code> objects implement the
 * <code>ContainerListener</code> interface.) Each such listener object
 * gets this <code>ContainerEvent</code> when the event occurs.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code ContainerEvent} instance is not
 * in the range from {@code CONTAINER_FIRST} to {@code CONTAINER_LAST}.
 *
 * @see ContainerAdapter
 * @see ContainerListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/containerlistener.html">Tutorial: Writing a Container Listener</a>
 *
 * @author Tim Prinzing
 * @author Amy Fowler
 * @since 1.1
 */
