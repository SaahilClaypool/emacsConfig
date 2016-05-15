_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuElement.java
    public Component getComponent();

    /**
     * This method should return the java.awt.Component used to paint the receiving element.
     * The returned component will be used to convert events and detect if an event is inside
     * a MenuElement's component.
     *
     * @return the Component value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuElement.java
    public MenuElement[] getSubElements();

    /**
     * This method should return an array containing the sub-elements for the receiving menu element
     *
     * @return an array of MenuElements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuElement.java
    public void menuSelectionChanged(boolean isIncluded);

    /**
     * Call by the <code>MenuSelectionManager</code> when the
     * <code>MenuElement</code> is added or remove from
     * the menu selection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuElement.java
    public void processKeyEvent(KeyEvent event,MenuElement path[],MenuSelectionManager manager);

    /**
     *  Process a key event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuElement.java
    public void processMouseEvent(MouseEvent event,MenuElement path[],MenuSelectionManager manager);

    /**
     * Processes a mouse event. <code>event</code> is a <code>MouseEvent</code>
     * with source being the receiving element's component.
     * <code>path</code> is the path of the receiving element in the menu
     * hierarchy including the receiving element itself.
     * <code>manager</code> is the <code>MenuSelectionManager</code>
     * for the menu hierarchy.
     * This method should process the <code>MouseEvent</code> and change
     * the menu selection if necessary
     * by using <code>MenuSelectionManager</code>'s API
     * Note: you do not have to forward the event to sub-components.
     * This is done automatically by the <code>MenuSelectionManager</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuElement.java
public interface MenuElement {

/**
 * Any component that can be placed into a menu should implement this interface.
 * This interface is used by <code>MenuSelectionManager</code>
 * to handle selection and navigation in menu hierarchies.
 *
 * @author Arnaud Weber
 */