_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSourceMotionListener.java
    void dragMouseMoved(DragSourceDragEvent dsde);

    /**
     * Called whenever the mouse is moved during a drag operation.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSourceMotionListener.java
public interface DragSourceMotionListener extends EventListener {

/**
 * A listener interface for receiving mouse motion events during a drag
 * operation.
 * <p>
 * The class that is interested in processing mouse motion events during
 * a drag operation either implements this interface or extends the abstract
 * <code>DragSourceAdapter</code> class (overriding only the methods of
 * interest).
 * <p>
 * Create a listener object using that class and then register it with
 * a <code>DragSource</code>. Whenever the mouse moves during a drag
 * operation initiated with this <code>DragSource</code>, that object's
 * <code>dragMouseMoved</code> method is invoked, and the
 * <code>DragSourceDragEvent</code> is passed to it.
 *
 * @see DragSourceDragEvent
 * @see DragSource
 * @see DragSourceListener
 * @see DragSourceAdapter
 *
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSourceMotionListener.java
    void dragMouseMoved(DragSourceDragEvent dsde);

    /**
     * Called whenever the mouse is moved during a drag operation.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSourceMotionListener.java
public interface DragSourceMotionListener extends EventListener {

/**
 * A listener interface for receiving mouse motion events during a drag
 * operation.
 * <p>
 * The class that is interested in processing mouse motion events during
 * a drag operation either implements this interface or extends the abstract
 * <code>DragSourceAdapter</code> class (overriding only the methods of
 * interest).
 * <p>
 * Create a listener object using that class and then register it with
 * a <code>DragSource</code>. Whenever the mouse moves during a drag
 * operation initiated with this <code>DragSource</code>, that object's
 * <code>dragMouseMoved</code> method is invoked, and the
 * <code>DragSourceDragEvent</code> is passed to it.
 *
 * @see DragSourceDragEvent
 * @see DragSource
 * @see DragSourceListener
 * @see DragSourceAdapter
 *
 * @since 1.4
 */