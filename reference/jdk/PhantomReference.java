_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/PhantomReference.java
    public PhantomReference(T referent, ReferenceQueue<? super T> q) {

    /**
     * Creates a new phantom reference that refers to the given object and
     * is registered with the given queue.
     *
     * <p> It is possible to create a phantom reference with a <tt>null</tt>
     * queue, but such a reference is completely useless: Its <tt>get</tt>
     * method will always return null and, since it does not have a queue, it
     * will never be enqueued.
     *
     * @param referent the object the new phantom reference will refer to
     * @param q the queue with which the reference is to be registered,
     *          or <tt>null</tt> if registration is not required
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/PhantomReference.java
    public T get() {

    /**
     * Returns this reference object's referent.  Because the referent of a
     * phantom reference is always inaccessible, this method always returns
     * <code>null</code>.
     *
     * @return  <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/PhantomReference.java
public class PhantomReference<T> extends Reference<T> {

/**
 * Phantom reference objects, which are enqueued after the collector
 * determines that their referents may otherwise be reclaimed.  Phantom
 * references are most often used for scheduling pre-mortem cleanup actions in
 * a more flexible way than is possible with the Java finalization mechanism.
 *
 * <p> If the garbage collector determines at a certain point in time that the
 * referent of a phantom reference is <a
 * href="package-summary.html#reachability">phantom reachable</a>, then at that
 * time or at some later time it will enqueue the reference.
 *
 * <p> In order to ensure that a reclaimable object remains so, the referent of
 * a phantom reference may not be retrieved: The <code>get</code> method of a
 * phantom reference always returns <code>null</code>.
 *
 * <p> Unlike soft and weak references, phantom references are not
 * automatically cleared by the garbage collector as they are enqueued.  An
 * object that is reachable via phantom references will remain so until all
 * such references are cleared or themselves become unreachable.
 *
 * @author   Mark Reinhold
 * @since    1.2
 */