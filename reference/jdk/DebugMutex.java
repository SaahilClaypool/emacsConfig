_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/concurrent/DebugMutex.java
  protected boolean inuse_ = false;

  /** The lock status **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/concurrent/DebugMutex.java
import org.omg.CORBA.INTERNAL ;

/**
 * A simple non-reentrant mutual exclusion lock.
 * The lock is free upon construction. Each acquire gets the
 * lock, and each release frees it. Releasing a lock that
 * is already free has no effect.
 * <p>
 * This implementation makes no attempt to provide any fairness
 * or ordering guarantees. If you need them, consider using one of
 * the Semaphore implementations as a locking mechanism.
 * <p>
 * <b>Sample usage</b><br>
 * <p>
 * Mutex can be useful in constructions that cannot be
 * expressed using java synchronized blocks because the
 * acquire/release pairs do not occur in the same method or
 * code block. For example, you can use them for hand-over-hand
 * locking across the nodes of a linked list. This allows
 * extremely fine-grained locking,  and so increases
 * potential concurrency, at the cost of additional complexity and
 * overhead that would normally make this worthwhile only in cases of
 * extreme contention.
 * <pre>
 * class Node {
 *   Object item;
 *   Node next;
 *   Mutex lock = new Mutex(); // each node keeps its own lock
 *
 *   Node(Object x, Node n) { item = x; next = n; }
 * }
 *
 * class List {
 *    protected Node head; // pointer to first node of list
 *
 *    // Use plain java synchronization to protect head field.
 *    //  (We could instead use a Mutex here too but there is no
 *    //  reason to do so.)
 *    protected synchronized Node getHead() { return head; }
 *
 *    boolean search(Object x) throws InterruptedException {
 *      Node p = getHead();
 *      if (p == null) return false;
 *
 *      //  (This could be made more compact, but for clarity of illustration,
 *      //  all of the cases that can arise are handled separately.)
 *
 *      p.lock.acquire();              // Prime loop by acquiring first lock.
 *                                     //    (If the acquire fails due to
 *                                     //    interrupt, the method will throw
 *                                     //    InterruptedException now,
 *                                     //    so there is no need for any
 *                                     //    further cleanup.)
 *      for (;;) {
 *        if (x.equals(p.item)) {
 *          p.lock.release();          // release current before return
 *          return true;
 *        }
 *        else {
 *          Node nextp = p.next;
 *          if (nextp == null) {
 *            p.lock.release();       // release final lock that was held
 *            return false;
 *          }
 *          else {
 *            try {
 *              nextp.lock.acquire(); // get next lock before releasing current
 *            }
 *            catch (InterruptedException ex) {
 *              p.lock.release();    // also release current if acquire fails
 *              throw ex;
 *            }
 *            p.lock.release();      // release old lock now that new one held
 *            p = nextp;
 *          }
 *        }
 *      }
 *    }
 *
 *    synchronized void add(Object x) { // simple prepend
 *      // The use of `synchronized'  here protects only head field.
 *      // The method does not need to wait out other traversers
 *      // who have already made it past head.
 *
 *      head = new Node(x, head);
 *    }
 *
 *    // ...  other similar traversal and update methods ...
 * }
 * </pre>
 * <p>
 * <p>This version adds some debugging capability: it will detect an attempt by a thread
 * that holds the lock to acquire it for a second time, and also an attempt by a thread that
 * does not hold the mutex to release it.
 * @see Semaphore
 * <p>[<a href="http://gee.cs.oswego.edu/dl/classes/EDU/oswego/cs/dl/util/concurrent/intro.html"> Introduction to this package. </a>]
**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/concurrent/DebugMutex.java
  protected boolean inuse_ = false;

  /** The lock status **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/concurrent/DebugMutex.java
import org.omg.CORBA.INTERNAL ;

/**
 * A simple non-reentrant mutual exclusion lock.
 * The lock is free upon construction. Each acquire gets the
 * lock, and each release frees it. Releasing a lock that
 * is already free has no effect.
 * <p>
 * This implementation makes no attempt to provide any fairness
 * or ordering guarantees. If you need them, consider using one of
 * the Semaphore implementations as a locking mechanism.
 * <p>
 * <b>Sample usage</b><br>
 * <p>
 * Mutex can be useful in constructions that cannot be
 * expressed using java synchronized blocks because the
 * acquire/release pairs do not occur in the same method or
 * code block. For example, you can use them for hand-over-hand
 * locking across the nodes of a linked list. This allows
 * extremely fine-grained locking,  and so increases
 * potential concurrency, at the cost of additional complexity and
 * overhead that would normally make this worthwhile only in cases of
 * extreme contention.
 * <pre>
 * class Node {
 *   Object item;
 *   Node next;
 *   Mutex lock = new Mutex(); // each node keeps its own lock
 *
 *   Node(Object x, Node n) { item = x; next = n; }
 * }
 *
 * class List {
 *    protected Node head; // pointer to first node of list
 *
 *    // Use plain java synchronization to protect head field.
 *    //  (We could instead use a Mutex here too but there is no
 *    //  reason to do so.)
 *    protected synchronized Node getHead() { return head; }
 *
 *    boolean search(Object x) throws InterruptedException {
 *      Node p = getHead();
 *      if (p == null) return false;
 *
 *      //  (This could be made more compact, but for clarity of illustration,
 *      //  all of the cases that can arise are handled separately.)
 *
 *      p.lock.acquire();              // Prime loop by acquiring first lock.
 *                                     //    (If the acquire fails due to
 *                                     //    interrupt, the method will throw
 *                                     //    InterruptedException now,
 *                                     //    so there is no need for any
 *                                     //    further cleanup.)
 *      for (;;) {
 *        if (x.equals(p.item)) {
 *          p.lock.release();          // release current before return
 *          return true;
 *        }
 *        else {
 *          Node nextp = p.next;
 *          if (nextp == null) {
 *            p.lock.release();       // release final lock that was held
 *            return false;
 *          }
 *          else {
 *            try {
 *              nextp.lock.acquire(); // get next lock before releasing current
 *            }
 *            catch (InterruptedException ex) {
 *              p.lock.release();    // also release current if acquire fails
 *              throw ex;
 *            }
 *            p.lock.release();      // release old lock now that new one held
 *            p = nextp;
 *          }
 *        }
 *      }
 *    }
 *
 *    synchronized void add(Object x) { // simple prepend
 *      // The use of `synchronized'  here protects only head field.
 *      // The method does not need to wait out other traversers
 *      // who have already made it past head.
 *
 *      head = new Node(x, head);
 *    }
 *
 *    // ...  other similar traversal and update methods ...
 * }
 * </pre>
 * <p>
 * <p>This version adds some debugging capability: it will detect an attempt by a thread
 * that holds the lock to acquire it for a second time, and also an attempt by a thread that
 * does not hold the mutex to release it.
 * @see Semaphore
 * <p>[<a href="http://gee.cs.oswego.edu/dl/classes/EDU/oswego/cs/dl/util/concurrent/intro.html"> Introduction to this package. </a>]
**/