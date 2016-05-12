_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    protected AccessibleState(String key) {

    /**
     * Creates a new AccessibleState using the given locale independent key.
     * This should not be a public method.  Instead, it is used to create
     * the constants in this file to make it a strongly typed enumeration.
     * Subclasses of this class should enforce similar policy.
     * <p>
     * The key String should be a locale independent key for the state.
     * It is not intended to be used as the actual String to display
     * to the user.  To get the localized string, use toDisplayString.
     *
     * @param key the locale independent name of the state.
     * @see AccessibleBundle#toDisplayString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    static public final AccessibleState TRUNCATED

    /**
     * A state indicating that text is truncated by a bounding rectangle
     * and that some of the text is not displayed on the screen.  An example
     * is text in a spreadsheet cell that is truncated by the bounds of
     * the cell.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState INDETERMINATE

    /**
     * Indicates that the object state is indeterminate.  An example
     * is selected text that is partially bold and partially not
     * bold. In this case the attributes associated with the selected
     * text are indeterminate.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState MANAGES_DESCENDANTS

    /**
     * Indicates this object is responsible for managing its
     * subcomponents.  This is typically used for trees and tables
     * that have a large number of subcomponents and where the
     * objects are created only when needed and otherwise remain virtual.
     * The application should not manage the subcomponents directly.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState TRANSIENT

    /**
     * Indicates this object is transient.  An assistive technology should
     * not add a PropertyChange listener to an object with transient state,
     * as that object will never generate any events.  Transient objects
     * are typically created to answer Java Accessibility method queries,
     * but otherwise do not remain linked to the underlying object (for
     * example, those objects underneath lists, tables, and trees in Swing,
     * where only one actual UI Component does shared rendering duty for
     * all of the data objects underneath the actual list/table/tree elements).
     *
     * @since 1.5
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState MULTI_LINE

    /**
     * Indicates this (text) object can contain multiple lines of text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState SINGLE_LINE

    /**
     * Indicates this (text) object can contain only a single line of text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState HORIZONTAL

    /**
     * Indicates the orientation of this object is horizontal.  This is
     * usually associated with objects such as scrollbars, sliders, and
     * progress bars.
     * @see #HORIZONTAL
     * @see AccessibleRole#SCROLL_BAR
     * @see AccessibleRole#SLIDER
     * @see AccessibleRole#PROGRESS_BAR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState VERTICAL

    /**
     * Indicates the orientation of this object is vertical.  This is
     * usually associated with objects such as scrollbars, sliders, and
     * progress bars.
     * @see #VERTICAL
     * @see AccessibleRole#SCROLL_BAR
     * @see AccessibleRole#SLIDER
     * @see AccessibleRole#PROGRESS_BAR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState VISIBLE

    /**
     * Indicates this object is visible.  Note: this means that the
     * object intends to be visible; however, it may not in fact be
     * showing on the screen because one of the objects that this object
     * is contained by is not visible.
     * @see #SHOWING
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState SHOWING

    /**
     * Indicates this object, the object's parent, the object's parent's
     * parent, and so on, are all visible.  Note that this does not
     * necessarily mean the object is painted on the screen.  It might
     * be occluded by some other showing object.
     * @see #VISIBLE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState SELECTED

    /**
     * Indicates this object is the child of an object that allows its
     * children to be selected, and that this child is one of those
     * children that has been selected.
     * @see #SELECTABLE
     * @see Accessible#getAccessibleContext
     * @see AccessibleContext#getAccessibleSelection
     * @see AccessibleSelection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState SELECTABLE

    /**
     * Indicates this object is the child of an object that allows its
     * children to be selected, and that this child is one of those
     * children that can be selected.
     * @see #SELECTED
     * @see Accessible#getAccessibleContext
     * @see AccessibleContext#getAccessibleSelection
     * @see AccessibleSelection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState MULTISELECTABLE

    /**
     * Indicates this object allows more than one of its children to
     * be selected at the same time.
     * @see Accessible#getAccessibleContext
     * @see AccessibleContext#getAccessibleSelection
     * @see AccessibleSelection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState RESIZABLE

    /**
     * Indicates the size of this object is not fixed.
     * @see Accessible#getAccessibleContext
     * @see AccessibleContext#getAccessibleComponent
     * @see AccessibleComponent#getSize
     * @see AccessibleComponent#setSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState OPAQUE

    /**
     * Indicates this object paints every pixel within its
     * rectangular region. A non-opaque component paints only some of
     * its pixels, allowing the pixels underneath it to "show through".
     * A component that does not fully paint its pixels therefore
     * provides a degree of transparency.
     * @see Accessible#getAccessibleContext
     * @see AccessibleContext#getAccessibleComponent
     * @see AccessibleComponent#getBounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState MODAL

    /**
     * Indicates something must be done with this object before the
     * user can interact with an object in a different window.  This
     * is usually associated only with dialogs.
     * @see AccessibleRole#DIALOG
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState ICONIFIED

    /**
     * Indicates this object is minimized and is represented only by an
     * icon.  This is usually only associated with frames and internal
     * frames.
     * @see AccessibleRole#FRAME
     * @see AccessibleRole#INTERNAL_FRAME
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState FOCUSED

    /**
     * Indicates this object currently has the keyboard focus.
     * @see #FOCUSABLE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState FOCUSABLE

    /**
     * Indicates this object can accept keyboard focus, which means all
     * events resulting from typing on the keyboard will normally be
     * passed to it when it has focus.
     * @see #FOCUSED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState ENABLED

    /**
     * Indicates this object is enabled.  The absence of this state from an
     * object's state set indicates this object is not enabled.  An object
     * that is not enabled cannot be manipulated by the user.  In a graphical
     * display, it is usually grayed out.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState EXPANDED

    /**
     * Indicates this object is expanded.  This is usually paired with the
     * EXPANDABLE state and is used on objects that provide progressive
     * disclosure such as trees.
     * @see #EXPANDABLE
     * @see #COLLAPSED
     * @see AccessibleRole#TREE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState COLLAPSED

    /**
     * Indicates this object is collapsed.  This is usually paired with the
     * EXPANDABLE state and is used on objects that provide progressive
     * disclosure such as trees.
     * @see #EXPANDABLE
     * @see #EXPANDED
     * @see AccessibleRole#TREE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState EXPANDABLE

    /**
     * Indicates this object allows progressive disclosure of its children.
     * This is usually used with hierarchical objects such as trees and
     * is often paired with the EXPANDED or COLLAPSED states.
     * @see #EXPANDED
     * @see #COLLAPSED
     * @see AccessibleRole#TREE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState EDITABLE

    /**
     * Indicates the user can change the contents of this object.  This
     * is usually used primarily for objects that allow the user to
     * enter text.  Other objects, such as scroll bars and sliders,
     * are automatically editable if they are enabled.
     * @see #ENABLED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState CHECKED

    /**
     * Indicates this object is currently checked.  This is usually used on
     * objects such as toggle buttons, radio buttons, and check boxes.
     * @see AccessibleRole#TOGGLE_BUTTON
     * @see AccessibleRole#RADIO_BUTTON
     * @see AccessibleRole#CHECK_BOX
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState BUSY

    /**
     * Indicates the current object is busy.  This is usually used on objects
     * such as progress bars, sliders, or scroll bars to indicate they are
     * in a state of transition.
     * @see AccessibleRole#PROGRESS_BAR
     * @see AccessibleRole#SCROLL_BAR
     * @see AccessibleRole#SLIDER
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState ARMED

    /**
     * Indicates that the object is armed.  This is usually used on buttons
     * that have been pressed but not yet released, and the mouse pointer
     * is still over the button.
     * @see AccessibleRole#PUSH_BUTTON
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState PRESSED

    /**
     * Indicates this object is currently pressed.  This is usually
     * associated with buttons and indicates the user has pressed a
     * mouse button while the pointer was over the button and has
     * not yet released the mouse button.
     * @see AccessibleRole#PUSH_BUTTON
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
    public static final AccessibleState ACTIVE

    /**
     * Indicates a window is currently the active window.  This includes
     * windows, dialogs, frames, etc.  In addition, this state is used
     * to indicate the currently active child of a component such as a
     * list, table, or tree.  For example, the active child of a list
     * is the child that is drawn with a rectangle around it.
     * @see AccessibleRole#WINDOW
     * @see AccessibleRole#FRAME
     * @see AccessibleRole#DIALOG
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleState.java
public class AccessibleState extends AccessibleBundle {

/**
 * <P>Class AccessibleState describes a component's particular state.  The actual
 * state of the component is defined as an AccessibleStateSet, which is a
 * composed set of AccessibleStates.
 * <p>The toDisplayString method allows you to obtain the localized string
 * for a locale independent key from a predefined ResourceBundle for the
 * keys defined in this class.
 * <p>The constants in this class present a strongly typed enumeration
 * of common object roles.  A public constructor for this class has been
 * purposely omitted and applications should use one of the constants
 * from this class.  If the constants in this class are not sufficient
 * to describe the role of an object, a subclass should be generated
 * from this class and it should provide constants in a similar manner.
 *
 * @author      Willie Walker
 * @author      Peter Korn
 */
