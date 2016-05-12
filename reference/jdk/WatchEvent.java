_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/WatchEvent.java
    T context();

    /**
     * Returns the context for the event.
     *
     * <p> In the case of {@link StandardWatchEventKinds#ENTRY_CREATE ENTRY_CREATE},
     * {@link StandardWatchEventKinds#ENTRY_DELETE ENTRY_DELETE}, and {@link
     * StandardWatchEventKinds#ENTRY_MODIFY ENTRY_MODIFY} events the context is
     * a {@code Path} that is the {@link Path#relativize relative} path between
     * the directory registered with the watch service, and the entry that is
     * created, deleted, or modified.
     *
     * @return  the event context; may be {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/WatchEvent.java
    int count();

    /**
     * Returns the event count. If the event count is greater than {@code 1}
     * then this is a repeated event.
     *
     * @return  the event count
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/WatchEvent.java
    Kind<T> kind();

    /**
     * Returns the event kind.
     *
     * @return  the event kind
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/WatchEvent.java
    public static interface Modifier {

    /**
     * An event modifier that qualifies how a {@link Watchable} is registered
     * with a {@link WatchService}.
     *
     * <p> This release does not define any <em>standard</em> modifiers.
     *
     * @since 1.7
     * @see Watchable#register
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/WatchEvent.java
        Class<T> type();

        /**
         * Returns the type of the {@link WatchEvent#context context} value.
         *
         *
         * @return the type of the context value
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/WatchEvent.java
    public static interface Kind<T> {

    /**
     * An event kind, for the purposes of identification.
     *
     * @since 1.7
     * @see StandardWatchEventKinds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/WatchEvent.java
public interface WatchEvent<T> {

/**
 * An event or a repeated event for an object that is registered with a {@link
 * WatchService}.
 *
 * <p> An event is classified by its {@link #kind() kind} and has a {@link
 * #count() count} to indicate the number of times that the event has been
 * observed. This allows for efficient representation of repeated events. The
 * {@link #context() context} method returns any context associated with
 * the event. In the case of a repeated event then the context is the same for
 * all events.
 *
 * <p> Watch events are immutable and safe for use by multiple concurrent
 * threads.
 *
 * @param   <T>     The type of the context object associated with the event
 *
 * @since 1.7
 */
