_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/ExpandVetoException.java
    public ExpandVetoException(TreeExpansionEvent event, String message) {

    /**
     * Constructs an ExpandVetoException object with the specified message.
     *
     * @param event    a TreeExpansionEvent object
     * @param message  a String containing the message
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/ExpandVetoException.java
    public ExpandVetoException(TreeExpansionEvent event) {

    /**
     * Constructs an ExpandVetoException object with no message.
     *
     * @param event  a TreeExpansionEvent object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/ExpandVetoException.java
    protected TreeExpansionEvent      event;

    /** The event that the exception was created for. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/ExpandVetoException.java
public class ExpandVetoException extends Exception {

/**
 * Exception used to stop and expand/collapse from happening.
 * See <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/events/treewillexpandlistener.html">How to Write a Tree-Will-Expand Listener</a>
 * in <em>The Java Tutorial</em>
 * for further information and examples.
 *
 * @author Scott Violet
 */