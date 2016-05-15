_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowDeactivated(WindowEvent e);

    /**
     * Invoked when a Window is no longer the active Window. Only a Frame or a
     * Dialog can be the active Window. The native windowing system may denote
     * the active Window or its children with special decorations, such as a
     * highlighted title bar. The active Window is always either the focused
     * Window, or the first Frame or Dialog that is an owner of the focused
     * Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowActivated(WindowEvent e);

    /**
     * Invoked when the Window is set to be the active Window. Only a Frame or
     * a Dialog can be the active Window. The native windowing system may
     * denote the active Window or its children with special decorations, such
     * as a highlighted title bar. The active Window is always either the
     * focused Window, or the first Frame or Dialog that is an owner of the
     * focused Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowDeiconified(WindowEvent e);

    /**
     * Invoked when a window is changed from a minimized
     * to a normal state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowIconified(WindowEvent e);

    /**
     * Invoked when a window is changed from a normal to a
     * minimized state. For many platforms, a minimized window
     * is displayed as the icon specified in the window's
     * iconImage property.
     * @see java.awt.Frame#setIconImage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowClosed(WindowEvent e);

    /**
     * Invoked when a window has been closed as the result
     * of calling dispose on the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowClosing(WindowEvent e);

    /**
     * Invoked when the user attempts to close the window
     * from the window's system menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
public interface WindowListener extends EventListener {

/**
 * The listener interface for receiving window events.
 * The class that is interested in processing a window event
 * either implements this interface (and all the methods it
 * contains) or extends the abstract <code>WindowAdapter</code> class
 * (overriding only the methods of interest).
 * The listener object created from that class is then registered with a
 * Window using the window's <code>addWindowListener</code>
 * method. When the window's status changes by virtue of being opened,
 * closed, activated or deactivated, iconified or deiconified,
 * the relevant method in the listener object is invoked, and the
 * <code>WindowEvent</code> is passed to it.
 *
 * @author Carl Quinn
 *
 * @see WindowAdapter
 * @see WindowEvent
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/windowlistener.html">Tutorial: How to Write Window Listeners</a>
 *
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowDeactivated(WindowEvent e);

    /**
     * Invoked when a Window is no longer the active Window. Only a Frame or a
     * Dialog can be the active Window. The native windowing system may denote
     * the active Window or its children with special decorations, such as a
     * highlighted title bar. The active Window is always either the focused
     * Window, or the first Frame or Dialog that is an owner of the focused
     * Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowActivated(WindowEvent e);

    /**
     * Invoked when the Window is set to be the active Window. Only a Frame or
     * a Dialog can be the active Window. The native windowing system may
     * denote the active Window or its children with special decorations, such
     * as a highlighted title bar. The active Window is always either the
     * focused Window, or the first Frame or Dialog that is an owner of the
     * focused Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowDeiconified(WindowEvent e);

    /**
     * Invoked when a window is changed from a minimized
     * to a normal state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowIconified(WindowEvent e);

    /**
     * Invoked when a window is changed from a normal to a
     * minimized state. For many platforms, a minimized window
     * is displayed as the icon specified in the window's
     * iconImage property.
     * @see java.awt.Frame#setIconImage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowClosed(WindowEvent e);

    /**
     * Invoked when a window has been closed as the result
     * of calling dispose on the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
    public void windowClosing(WindowEvent e);

    /**
     * Invoked when the user attempts to close the window
     * from the window's system menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowListener.java
public interface WindowListener extends EventListener {

/**
 * The listener interface for receiving window events.
 * The class that is interested in processing a window event
 * either implements this interface (and all the methods it
 * contains) or extends the abstract <code>WindowAdapter</code> class
 * (overriding only the methods of interest).
 * The listener object created from that class is then registered with a
 * Window using the window's <code>addWindowListener</code>
 * method. When the window's status changes by virtue of being opened,
 * closed, activated or deactivated, iconified or deiconified,
 * the relevant method in the listener object is invoked, and the
 * <code>WindowEvent</code> is passed to it.
 *
 * @author Carl Quinn
 *
 * @see WindowAdapter
 * @see WindowEvent
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/windowlistener.html">Tutorial: How to Write Window Listeners</a>
 *
 * @since 1.1
 */