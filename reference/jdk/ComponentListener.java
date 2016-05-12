_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
    public void componentHidden(ComponentEvent e);

    /**
     * Invoked when the component has been made invisible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
    public void componentShown(ComponentEvent e);

    /**
     * Invoked when the component has been made visible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
    public void componentMoved(ComponentEvent e);

    /**
     * Invoked when the component's position changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
public interface ComponentListener extends EventListener {

/**
 * The listener interface for receiving component events.
 * The class that is interested in processing a component event
 * either implements this interface (and all the methods it
 * contains) or extends the abstract <code>ComponentAdapter</code> class
 * (overriding only the methods of interest).
 * The listener object created from that class is then registered with a
 * component using the component's <code>addComponentListener</code>
 * method. When the component's size, location, or visibility
 * changes, the relevant method in the listener object is invoked,
 * and the <code>ComponentEvent</code> is passed to it.
 * <P>
 * Component events are provided for notification purposes ONLY;
 * The AWT will automatically handle component moves and resizes
 * internally so that GUI layout works properly regardless of
 * whether a program registers a <code>ComponentListener</code> or not.
 *
 * @see ComponentAdapter
 * @see ComponentEvent
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/componentlistener.html">Tutorial: Writing a Component Listener</a>
 *
 * @author Carl Quinn
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
    public void componentHidden(ComponentEvent e);

    /**
     * Invoked when the component has been made invisible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
    public void componentShown(ComponentEvent e);

    /**
     * Invoked when the component has been made visible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
    public void componentMoved(ComponentEvent e);

    /**
     * Invoked when the component's position changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/ComponentListener.java
public interface ComponentListener extends EventListener {

/**
 * The listener interface for receiving component events.
 * The class that is interested in processing a component event
 * either implements this interface (and all the methods it
 * contains) or extends the abstract <code>ComponentAdapter</code> class
 * (overriding only the methods of interest).
 * The listener object created from that class is then registered with a
 * component using the component's <code>addComponentListener</code>
 * method. When the component's size, location, or visibility
 * changes, the relevant method in the listener object is invoked,
 * and the <code>ComponentEvent</code> is passed to it.
 * <P>
 * Component events are provided for notification purposes ONLY;
 * The AWT will automatically handle component moves and resizes
 * internally so that GUI layout works properly regardless of
 * whether a program registers a <code>ComponentListener</code> or not.
 *
 * @see ComponentAdapter
 * @see ComponentEvent
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/componentlistener.html">Tutorial: Writing a Component Listener</a>
 *
 * @author Carl Quinn
 * @since 1.1
 */
