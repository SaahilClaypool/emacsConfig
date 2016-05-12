_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    void clearMarkers() {

    /**
     * Clears markers queue
     * This method is not intended to be overridden by KFM's.
     * Only DefaultKeyboardFocusManager can implement it.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    static Window markClearGlobalFocusOwner() {

    /**
     * Returns the Window which will be active after processing this request,
     * or null if this is a duplicate request. The active Window is useful
     * because some native platforms do not support setting the native focus
     * owner to null. On these platforms, the obvious choice is to set the
     * focus owner to the focus proxy of the active Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    static int shouldNativelyFocusHeavyweight

    /**
     * Indicates whether the native implementation should proceed with a
     * pending, native focus request. Before changing the focus at the native
     * level, the AWT implementation should always call this function for
     * permission. This function will reject the request if a duplicate request
     * preceded it, or if the specified heavyweight Component already owns the
     * focus and no native focus changes are pending. Otherwise, the request
     * will be approved and the focus request list will be updated so that,
     * if necessary, the proper descendant will be focused when the
     * corresponding FOCUS_GAINED event on the heavyweight is received.
     *
     * An implementation must ensure that calls to this method and native
     * focus changes are atomic. If this is not guaranteed, then the ordering
     * of the focus request list may be incorrect, leading to errors in the
     * type-ahead mechanism. Typically this is accomplished by only calling
     * this function from the native event pumping thread, or by holding a
     * global, native lock during invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    void dumpRequests() {

    /**
     * Dumps the list of focus requests to stderr
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void downFocusCycle() {

    /**
     * Moves the focus down one focus traversal cycle from the current focus
     * owner, if and only if the current focus owner is a Container that is a
     * focus cycle root. Typically, the focus owner is set to the current focus
     * owner's default Component to focus, and the current focus cycle root is
     * set to the current focus owner. If the current focus owner is not a
     * Container that is a focus cycle root, then no focus traversal operation
     * occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void upFocusCycle() {

    /**
     * Moves the focus up one focus traversal cycle from the current focus
     * owner. Typically, the new focus owner is set to the current focus
     * owner's focus cycle root, and the current focus cycle root is set to the
     * new focus owner's focus cycle root. If, however, the current focus
     * owner's focus cycle root is a Window, then typically the focus owner is
     * set to the focus cycle root's default Component to focus, and the
     * current focus cycle root is unchanged.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void focusPreviousComponent() {

    /**
     * Focuses the Component before the current focus owner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void focusNextComponent() {

    /**
     * Focuses the Component after the current focus owner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void downFocusCycle(Container aContainer);

    /**
     * Moves the focus down one focus traversal cycle. Typically, if
     * aContainer is a focus cycle root, then the focus owner is set to
     * aContainer's default Component to focus, and the current focus cycle
     * root is set to aContainer. If aContainer is not a focus cycle root, then
     * no focus traversal operation occurs.
     *
     * @param aContainer the Container that is the basis for the focus
     *        traversal operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void upFocusCycle(Component aComponent);

    /**
     * Moves the focus up one focus traversal cycle. Typically, the focus owner
     * is set to aComponent's focus cycle root, and the current focus cycle
     * root is set to the new focus owner's focus cycle root. If, however,
     * aComponent's focus cycle root is a Window, then typically the focus
     * owner is set to the Window's default Component to focus, and the current
     * focus cycle root is unchanged.
     *
     * @param aComponent the Component that is the basis for the focus
     *        traversal operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void focusPreviousComponent(Component aComponent);

    /**
     * Focuses the Component before aComponent, typically based on a
     * FocusTraversalPolicy.
     *
     * @param aComponent the Component that is the basis for the focus
     *        traversal operation
     * @see FocusTraversalPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void focusNextComponent(Component aComponent);

    /**
     * Focuses the Component after aComponent, typically based on a
     * FocusTraversalPolicy.
     *
     * @param aComponent the Component that is the basis for the focus
     *        traversal operation
     * @see FocusTraversalPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected abstract void discardKeyEvents(Component comp);

    /**
     * Called by the AWT to notify the KeyboardFocusManager that it should
     * cancel delayed dispatching of KeyEvents. All KeyEvents which were
     * enqueued because of one or more calls to <code>enqueueKeyEvents</code>
     * with the same Component should be discarded.
     *
     * @param comp the Component specified in one or more calls to
     *        <code>enqueueKeyEvents</code>
     * @see #enqueueKeyEvents
     * @see #dequeueKeyEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected abstract void dequeueKeyEvents(long after,
                                             Component untilFocused);

    /**
     * Called by the AWT to notify the KeyboardFocusManager that it should
     * cancel delayed dispatching of KeyEvents. All KeyEvents which were
     * enqueued because of a call to <code>enqueueKeyEvents</code> with the
     * same timestamp and Component should be released for normal dispatching
     * to the current focus owner. If the given timestamp is less than zero,
     * the outstanding enqueue request for the given Component with the <b>
     * oldest</b> timestamp (if any) should be cancelled.
     *
     * @param after the timestamp specified in the call to
     *        <code>enqueueKeyEvents</code>, or any value &lt; 0
     * @param untilFocused the Component specified in the call to
     *        <code>enqueueKeyEvents</code>
     * @see #enqueueKeyEvents
     * @see #discardKeyEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected abstract void enqueueKeyEvents(long after,
                                             Component untilFocused);

    /**
     * Called by the AWT to notify the KeyboardFocusManager that it should
     * delay dispatching of KeyEvents until the specified Component becomes
     * the focus owner. If client code requests a focus change, and the AWT
     * determines that this request might be granted by the native windowing
     * system, then the AWT will call this method. It is the responsibility of
     * the KeyboardFocusManager to delay dispatching of KeyEvents with
     * timestamps later than the specified time stamp until the specified
     * Component receives a FOCUS_GAINED event, or the AWT cancels the delay
     * request by invoking <code>dequeueKeyEvents</code> or
     * <code>discardKeyEvents</code>.
     *
     * @param after timestamp of current event, or the current, system time if
     *        the current event has no timestamp, or the AWT cannot determine
     *        which event is currently being handled
     * @param untilFocused Component which should receive a FOCUS_GAINED event
     *        before any pending KeyEvents
     * @see #dequeueKeyEvents
     * @see #discardKeyEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void processKeyEvent(Component focusedComponent,
                                         KeyEvent e);

    /**
     * This method initiates a focus traversal operation if and only if the
     * KeyEvent represents a focus traversal key for the specified
     * focusedComponent. It is expected that focusedComponent is the current
     * focus owner, although this need not be the case. If it is not,
     * focus traversal will nevertheless proceed as if focusedComponent
     * were the current focus owner.
     *
     * @param focusedComponent the Component that will be the basis for a focus
     *        traversal operation if the specified event represents a focus
     *        traversal key for the Component
     * @param e the event that may represent a focus traversal key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract boolean postProcessKeyEvent(KeyEvent e);

    /**
     * This method will be called by <code>dispatchKeyEvent</code>.
     * By default, this method will handle any unconsumed KeyEvents that
     * map to an AWT <code>MenuShortcut</code> by consuming the event
     * and activating the shortcut.
     *
     * @param e the KeyEvent to post-process
     * @return <code>true</code> to indicate that no other
     *         KeyEventPostProcessor will be notified of the KeyEvent.
     * @see #dispatchKeyEvent
     * @see MenuShortcut
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract boolean dispatchKeyEvent(KeyEvent e);

    /**
     * Typically this method will be called by <code>dispatchEvent</code> if no
     * other KeyEventDispatcher in the dispatcher chain dispatched the
     * KeyEvent, or if no other KeyEventDispatchers are registered. If an
     * implementation of this method returns <code>false</code>,
     * <code>dispatchEvent</code> may try to dispatch the KeyEvent itself, or
     * may simply return <code>false</code>. If <code>true</code> is returned,
     * <code>dispatchEvent</code> should return <code>true</code> as well.
     *
     * @param e the KeyEvent which the current KeyboardFocusManager has
     *        requested that this KeyEventDispatcher dispatch
     * @return <code>true</code> if the KeyEvent was dispatched;
     *         <code>false</code> otherwise
     * @see #dispatchEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void redispatchEvent(Component target, AWTEvent e) {

    /**
     * Redispatches an AWTEvent in such a way that the AWT event dispatcher
     * will not recursively request that the KeyboardFocusManager, or any
     * installed KeyEventDispatchers, dispatch the event again. Client
     * implementations of <code>dispatchEvent</code> and client-defined
     * KeyEventDispatchers must call <code>redispatchEvent(target, e)</code>
     * instead of <code>target.dispatchEvent(e)</code> to dispatch an event.
     * <p>
     * This method is intended to be used only by KeyboardFocusManagers and
     * KeyEventDispatchers. It is not for general client use.
     *
     * @param target the Component to which the event should be dispatched
     * @param e the event to dispatch
     * @see #dispatchEvent
     * @see KeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract boolean dispatchEvent(AWTEvent e);

    /**
     * This method is called by the AWT event dispatcher requesting that the
     * current KeyboardFocusManager dispatch the specified event on its behalf.
     * It is expected that all KeyboardFocusManagers will dispatch all
     * FocusEvents, all WindowEvents related to focus, and all KeyEvents.
     * These events should be dispatched based on the KeyboardFocusManager's
     * notion of the focus owner and the focused and active Windows, sometimes
     * overriding the source of the specified AWTEvent. Dispatching must be
     * done using <code>redispatchEvent</code> to prevent the AWT event
     * dispatcher from recursively requesting that the KeyboardFocusManager
     * dispatch the event again. If this method returns <code>false</code>,
     * then the AWT event dispatcher will attempt to dispatch the event itself.
     *
     * @param e the AWTEvent to be dispatched
     * @return <code>true</code> if this method dispatched the event;
     *         <code>false</code> otherwise
     * @see #redispatchEvent
     * @see #dispatchKeyEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected java.util.List<KeyEventPostProcessor>

    /**
     * Returns this KeyboardFocusManager's KeyEventPostProcessor chain as a
     * List. The List will not include this KeyboardFocusManager unless it was
     * explicitly added via a call to <code>addKeyEventPostProcessor</code>. If
     * no KeyEventPostProcessors are registered, implementations are free to
     * return null or a List of length 0. Client code should not assume one
     * behavior over another, nor should it assume that the behavior, once
     * established, will not change.
     *
     * @return a possibly null or empty List of KeyEventPostProcessors
     * @see #addKeyEventPostProcessor
     * @see #removeKeyEventPostProcessor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeKeyEventPostProcessor(KeyEventPostProcessor processor) {

    /**
     * Removes a previously added KeyEventPostProcessor from this
     * KeyboardFocusManager's post-processor chain. This KeyboardFocusManager
     * cannot itself be entirely removed from the chain. Only additional
     * references added via <code>addKeyEventPostProcessor</code> can be
     * removed.
     * <p>
     * If a null post-processor is specified, if the specified post-processor
     * is not in the post-processor chain, or if this KeyboardFocusManager is
     * specified without having been explicitly added, no action is taken and
     * no exception is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventPostProcessor} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param processor the KeyEventPostProcessor to remove from the post-
     *        processor chain
     * @see #addKeyEventPostProcessor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addKeyEventPostProcessor(KeyEventPostProcessor processor) {

    /**
     * Adds a KeyEventPostProcessor to this KeyboardFocusManager's post-
     * processor chain. After a KeyEvent has been dispatched to and handled by
     * its target, KeyboardFocusManager will request that each
     * KeyEventPostProcessor perform any necessary post-processing as part
     * of the KeyEvent's final resolution. KeyEventPostProcessors
     * will be notified in the order in which they were added; the current
     * KeyboardFocusManager will be notified last. Notifications will halt
     * as soon as one KeyEventPostProcessor returns <code>true</code> from its
     * <code>postProcessKeyEvent</code> method. There is no limit to the the
     * total number of KeyEventPostProcessors that can be added, nor to the
     * number of times that a particular KeyEventPostProcessor instance can be
     * added.
     * <p>
     * If a null post-processor is specified, no action is taken and no
     * exception is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventPostProcessor} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param processor the KeyEventPostProcessor to add to the post-processor
     *        chain
     * @see #removeKeyEventPostProcessor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected synchronized java.util.List<KeyEventDispatcher>

    /**
     * Returns this KeyboardFocusManager's KeyEventDispatcher chain as a List.
     * The List will not include this KeyboardFocusManager unless it was
     * explicitly re-registered via a call to
     * <code>addKeyEventDispatcher</code>. If no other KeyEventDispatchers are
     * registered, implementations are free to return null or a List of length
     * 0. Client code should not assume one behavior over another, nor should
     * it assume that the behavior, once established, will not change.
     *
     * @return a possibly null or empty List of KeyEventDispatchers
     * @see #addKeyEventDispatcher
     * @see #removeKeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeKeyEventDispatcher(KeyEventDispatcher dispatcher) {

    /**
     * Removes a KeyEventDispatcher which was previously added to this
     * KeyboardFocusManager's dispatcher chain. This KeyboardFocusManager
     * cannot itself be removed, unless it was explicitly re-registered via a
     * call to <code>addKeyEventDispatcher</code>.
     * <p>
     * If a null dispatcher is specified, if the specified dispatcher is not
     * in the dispatcher chain, or if this KeyboardFocusManager is specified
     * without having been explicitly re-registered, no action is taken and no
     * exception is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventDispatcher} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param dispatcher the KeyEventDispatcher to remove from the dispatcher
     *        chain
     * @see #addKeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addKeyEventDispatcher(KeyEventDispatcher dispatcher) {

    /**
     * Adds a KeyEventDispatcher to this KeyboardFocusManager's dispatcher
     * chain. This KeyboardFocusManager will request that each
     * KeyEventDispatcher dispatch KeyEvents generated by the user before
     * finally dispatching the KeyEvent itself. KeyEventDispatchers will be
     * notified in the order in which they were added. Notifications will halt
     * as soon as one KeyEventDispatcher returns <code>true</code> from its
     * <code>dispatchKeyEvent</code> method. There is no limit to the total
     * number of KeyEventDispatchers which can be added, nor to the number of
     * times which a particular KeyEventDispatcher instance can be added.
     * <p>
     * If a null dispatcher is specified, no action is taken and no exception
     * is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventDispatcher} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param dispatcher the KeyEventDispatcher to add to the dispatcher chain
     * @see #removeKeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void fireVetoableChange(String propertyName, Object oldValue,
                                      Object newValue)

    /**
     * Fires a PropertyChangeEvent in response to a change in a vetoable
     * property. The event will be delivered to all registered
     * VetoableChangeListeners. If a VetoableChangeListener throws a
     * PropertyVetoException, a new event is fired reverting all
     * VetoableChangeListeners to the old value and the exception is then
     * rethrown. No event will be delivered if oldValue and newValue are the
     * same.
     *
     * @param propertyName the name of the property that has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     * @throws java.beans.PropertyVetoException if a
     *         <code>VetoableChangeListener</code> threw
     *         <code>PropertyVetoException</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized VetoableChangeListener[] getVetoableChangeListeners(String propertyName) {

    /**
     * Returns an array of all the <code>VetoableChangeListener</code>s
     * associated with the named property.
     *
     * @return all of the <code>VetoableChangeListener</code>s associated with
     *         the named property or an empty array if no such listeners have
     *         been added.
     *
     * @see #addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     * @see #removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     * @see #getVetoableChangeListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeVetoableChangeListener(String propertyName,
                                             VetoableChangeListener listener) {

    /**
     * Removes a VetoableChangeListener from the listener list for a specific
     * property. This method should be used to remove VetoableChangeListeners
     * that were registered for a specific bound property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName a valid property name
     * @param listener the VetoableChangeListener to be removed
     * @see #addVetoableChangeListener
     * @see #getVetoableChangeListeners
     * @see #removeVetoableChangeListener(java.beans.VetoableChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addVetoableChangeListener(String propertyName,
                                          VetoableChangeListener listener) {

    /**
     * Adds a VetoableChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the VetoableChangeListener to be added
     * @see #addVetoableChangeListener(java.beans.VetoableChangeListener)
     * @see #removeVetoableChangeListener
     * @see #getVetoableChangeListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized VetoableChangeListener[] getVetoableChangeListeners() {

    /**
     * Returns an array of all the vetoable change listeners
     * registered on this keyboard focus manager.
     *
     * @return all of this keyboard focus manager's
     *         <code>VetoableChangeListener</code>s
     *         or an empty array if no vetoable change
     *         listeners are currently registered
     *
     * @see #addVetoableChangeListener
     * @see #removeVetoableChangeListener
     * @see #getVetoableChangeListeners(java.lang.String)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Removes a VetoableChangeListener from the listener list. This method
     * should be used to remove the VetoableChangeListeners that were
     * registered for all vetoable properties of this class.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the VetoableChangeListener to be removed
     * @see #addVetoableChangeListener
     * @see #getVetoableChangeListeners
     * @see #removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Adds a VetoableChangeListener to the listener list. The listener is
     * registered for all vetoable properties of this class, including the
     * following:
     * <ul>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the VetoableChangeListener to be added
     * @see #removeVetoableChangeListener
     * @see #getVetoableChangeListeners
     * @see #addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void firePropertyChange(String propertyName, Object oldValue,
                                      Object newValue)

    /**
     * Fires a PropertyChangeEvent in response to a change in a bound property.
     * The event will be delivered to all registered PropertyChangeListeners.
     * No event will be delivered if oldValue and newValue are the same.
     *
     * @param propertyName the name of the property that has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {

    /**
     * Returns an array of all the <code>PropertyChangeListener</code>s
     * associated with the named property.
     *
     * @return all of the <code>PropertyChangeListener</code>s associated with
     *         the named property or an empty array if no such listeners have
     *         been added.
     *
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removePropertyChangeListener(String propertyName,
                                             PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list for a specific
     * property. This method should be used to remove PropertyChangeListeners
     * that were registered for a specific bound property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName a valid property name
     * @param listener the PropertyChangeListener to be removed
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     * @see #removePropertyChangeListener(java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addPropertyChangeListener(String propertyName,
                                          PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>whether the KeyboardFocusManager is currently managing focus
     *        for this application or applet's browser context
     *        ("managingFocus")</li>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     *    <li>the default focus traversal policy
     *        ("defaultFocusTraversalPolicy")</li>
     *    <li>the Set of default FORWARD_TRAVERSAL_KEYS
     *        ("forwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default BACKWARD_TRAVERSAL_KEYS
     *        ("backwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleDefaultFocusTraversalKeys")</li>
     *    <li>the current focus cycle root ("currentFocusCycleRoot")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the PropertyChangeListener to be added
     * @see #addPropertyChangeListener(java.beans.PropertyChangeListener)
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the property change listeners
     * registered on this keyboard focus manager.
     *
     * @return all of this keyboard focus manager's
     *         <code>PropertyChangeListener</code>s
     *         or an empty array if no property change
     *         listeners are currently registered
     *
     * @see #addPropertyChangeListener
     * @see #removePropertyChangeListener
     * @see #getPropertyChangeListeners(java.lang.String)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list. This method
     * should be used to remove the PropertyChangeListeners that were
     * registered for all bound properties of this class.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the PropertyChangeListener to be removed
     * @see #addPropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>whether the KeyboardFocusManager is currently managing focus
     *        for this application or applet's browser context
     *        ("managingFocus")</li>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     *    <li>the default focus traversal policy
     *        ("defaultFocusTraversalPolicy")</li>
     *    <li>the Set of default FORWARD_TRAVERSAL_KEYS
     *        ("forwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default BACKWARD_TRAVERSAL_KEYS
     *        ("backwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleDefaultFocusTraversalKeys")</li>
     *    <li>the current focus cycle root ("currentFocusCycleRoot")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the PropertyChangeListener to be added
     * @see #removePropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void setGlobalCurrentFocusCycleRoot(Container newFocusCycleRoot)

    /**
     * Sets the current focus cycle root. If the focus owner is itself a focus
     * cycle root, then it may be ambiguous as to which Components represent
     * the next and previous Components to focus during normal focus traversal.
     * In that case, the current focus cycle root is used to differentiate
     * among the possibilities.
     * <p>
     * If a SecurityManager is installed, the calling thread must be granted
     * the "replaceKeyboardFocusManager" AWTPermission. If this permission is
     * not granted, this method will throw a SecurityException, and the current
     * focus cycle root will not be changed.
     * <p>
     * This method is intended to be used only by KeyboardFocusManagers and
     * focus implementations. It is not for general client use.
     *
     * @param newFocusCycleRoot the new focus cycle root
     * @see #getCurrentFocusCycleRoot
     * @see #getGlobalCurrentFocusCycleRoot
     * @throws SecurityException if the calling thread does not have
     *         "replaceKeyboardFocusManager" permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Container getGlobalCurrentFocusCycleRoot()

    /**
     * Returns the current focus cycle root, even if the calling thread is in a
     * different context than the current focus cycle root. If the focus owner
     * is itself a focus cycle root, then it may be ambiguous as to which
     * Components represent the next and previous Components to focus during
     * normal focus traversal. In that case, the current focus cycle root is
     * used to differentiate among the possibilities.
     *
     * @return the current focus cycle root, or null if the current focus cycle
     *         root is not a member of the calling thread's context
     * @see #getCurrentFocusCycleRoot
     * @see #setGlobalCurrentFocusCycleRoot
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Container getCurrentFocusCycleRoot() {

    /**
     * Returns the current focus cycle root, if the current focus cycle root is
     * in the same context as the calling thread. If the focus owner is itself
     * a focus cycle root, then it may be ambiguous as to which Components
     * represent the next and previous Components to focus during normal focus
     * traversal. In that case, the current focus cycle root is used to
     * differentiate among the possibilities.
     * <p>
     * This method is intended to be used only by KeyboardFocusManagers and
     * focus implementations. It is not for general client use.
     *
     * @return the current focus cycle root, or null if the current focus cycle
     *         root is not a member of the calling thread's context
     * @see #getGlobalCurrentFocusCycleRoot
     * @see #setGlobalCurrentFocusCycleRoot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Set<AWTKeyStroke> getDefaultFocusTraversalKeys(int id) {

    /**
     * Returns a Set of default focus traversal keys for a given traversal
     * operation. This traversal key Set will be in effect on all Windows that
     * have no such Set of their own explicitly defined. This Set will also be
     * inherited, recursively, by any child Component of those Windows that has
     * no such Set of its own explicitly defined. (See
     * <code>setDefaultFocusTraversalKeys</code> for a full description of each
     * operation.)
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return the <code>Set</code> of <code>AWTKeyStroke</code>s
     *         for the specified operation; the <code>Set</code>
     *         will be unmodifiable, and may be empty; <code>null</code>
     *         will never be returned
     * @see #setDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void

    /**
     * Sets the default focus traversal keys for a given traversal operation.
     * This traversal key {@code Set} will be in effect on all
     * {@code Window}s that have no such {@code Set} of
     * their own explicitly defined. This {@code Set} will also be
     * inherited, recursively, by any child {@code Component} of
     * those {@code Windows} that has
     * no such {@code Set} of its own explicitly defined.
     * <p>
     * The default values for the default focus traversal keys are
     * implementation-dependent. Sun recommends that all implementations for a
     * particular native platform use the same default values. The
     * recommendations for Windows and Unix are listed below. These
     * recommendations are used in the Sun AWT implementations.
     *
     * <table border=1 summary="Recommended default values for focus traversal keys">
     * <tr>
     *    <th>Identifier</th>
     *    <th>Meaning</th>
     *    <th>Default</th>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS}</td>
     *    <td>Normal forward keyboard traversal</td>
     *    <td>{@code TAB} on {@code KEY_PRESSED},
     *        {@code CTRL-TAB} on {@code KEY_PRESSED}</td>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS}</td>
     *    <td>Normal reverse keyboard traversal</td>
     *    <td>{@code SHIFT-TAB} on {@code KEY_PRESSED},
     *        {@code CTRL-SHIFT-TAB} on {@code KEY_PRESSED}</td>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS}</td>
     *    <td>Go up one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS}</td>
     *    <td>Go down one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * </table>
     *
     * To disable a traversal key, use an empty {@code Set};
     * {@code Collections.EMPTY_SET} is recommended.
     * <p>
     * Using the {@code AWTKeyStroke} API, client code can
     * specify on which of two
     * specific {@code KeyEvent}s, {@code KEY_PRESSED} or
     * {@code KEY_RELEASED}, the focus traversal operation will
     * occur. Regardless of which {@code KeyEvent} is specified,
     * however, all {@code KeyEvent}s related to the focus
     * traversal key, including the associated {@code KEY_TYPED}
     * event, will be consumed, and will not be dispatched
     * to any {@code Component}. It is a runtime error to
     * specify a {@code KEY_TYPED} event as
     * mapping to a focus traversal operation, or to map the same event to
     * multiple default focus traversal operations.
     * <p>
     * This method may throw a {@code ClassCastException} if any {@code Object}
     * in {@code keystrokes} is not an {@code AWTKeyStroke}.
     *
     * @param id one of
     *        {@code KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS},
     *        {@code KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS},
     *        {@code KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS}, or
     *        {@code KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS}
     * @param keystrokes the Set of {@code AWTKeyStroke}s for the
     *        specified operation
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     * @throws IllegalArgumentException if id is not one of
     *         {@code KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS},
     *         {@code KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS},
     *         {@code KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS}, or
     *         {@code KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS},
     *         or if keystrokes is {@code null},
     *         or if keystrokes contains {@code null},
     *         or if any keystroke
     *         represents a {@code KEY_TYPED} event,
     *         or if any keystroke already maps
     *         to another default focus traversal operation
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void setDefaultFocusTraversalPolicy(FocusTraversalPolicy
                                               defaultPolicy) {

    /**
     * Sets the default FocusTraversalPolicy. Top-level components
     * use this value on their creation to initialize their own focus traversal
     * policy by explicit call to Container.setFocusTraversalPolicy.
     * Note: this call doesn't affect already created components as they have
     * their policy initialized. Only new components will use this policy as
     * their default policy.
     *
     * @param defaultPolicy the new, default FocusTraversalPolicy
     * @see #getDefaultFocusTraversalPolicy
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     * @throws IllegalArgumentException if defaultPolicy is null
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized FocusTraversalPolicy getDefaultFocusTraversalPolicy() {

    /**
     * Returns the default FocusTraversalPolicy. Top-level components
     * use this value on their creation to initialize their own focus traversal
     * policy by explicit call to Container.setFocusTraversalPolicy.
     *
     * @return the default FocusTraversalPolicy. null will never be returned.
     * @see #setDefaultFocusTraversalPolicy
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalActiveWindow(Window activeWindow)

    /**
     * Sets the active Window. Only a Frame or a Dialog can be the active
     * Window. The native windowing system may denote the active Window or its
     * children with special decorations, such as a highlighted title bar. The
     * active Window is always either the focused Window, or the first Frame or
     * Dialog that is an owner of the focused Window.
     * <p>
     * This method does not actually change the active Window as far as the
     * native windowing system is concerned. It merely stores the value to be
     * subsequently returned by <code>getActiveWindow()</code>. Use
     * <code>Component.requestFocus()</code> or
     * <code>Component.requestFocusInWindow()</code>to change the active
     * Window, subject to platform limitations.
     *
     * @param activeWindow the active Window
     * @see #getActiveWindow
     * @see #getGlobalActiveWindow
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Window getGlobalActiveWindow() throws SecurityException {

    /**
     * Returns the active Window, even if the calling thread is in a different
     * context than the active Window. Only a Frame or a Dialog can be the
     * active Window. The native windowing system may denote the active Window
     * or its children with special decorations, such as a highlighted title
     * bar. The active Window is always either the focused Window, or the first
     * Frame or Dialog that is an owner of the focused Window.
     *
     * @return the active Window
     * @see #getActiveWindow
     * @see #setGlobalActiveWindow
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Window getActiveWindow() {

    /**
     * Returns the active Window, if the active Window is in the same context
     * as the calling thread. Only a Frame or a Dialog can be the active
     * Window. The native windowing system may denote the active Window or its
     * children with special decorations, such as a highlighted title bar.
     * The active Window is always either the focused Window, or the first
     * Frame or Dialog that is an owner of the focused Window.
     *
     * @return the active Window, or null if the active Window is not a member
     *         of the calling thread's context
     * @see #getGlobalActiveWindow
     * @see #setGlobalActiveWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalFocusedWindow(Window focusedWindow)

    /**
     * Sets the focused Window. The focused Window is the Window that is or
     * contains the focus owner. The operation will be cancelled if the
     * specified Window to focus is not a focusable Window.
     * <p>
     * This method does not actually change the focused Window as far as the
     * native windowing system is concerned. It merely stores the value to be
     * subsequently returned by <code>getFocusedWindow()</code>. Use
     * <code>Component.requestFocus()</code> or
     * <code>Component.requestFocusInWindow()</code> to change the focused
     * Window, subject to platform limitations.
     *
     * @param focusedWindow the focused Window
     * @see #getFocusedWindow
     * @see #getGlobalFocusedWindow
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @see Window#isFocusableWindow
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Window getGlobalFocusedWindow() throws SecurityException {

    /**
     * Returns the focused Window, even if the calling thread is in a different
     * context than the focused Window. The focused Window is the Window that
     * is or contains the focus owner.
     *
     * @return the focused Window
     * @see #getFocusedWindow
     * @see #setGlobalFocusedWindow
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Window getFocusedWindow() {

    /**
     * Returns the focused Window, if the focused Window is in the same context
     * as the calling thread. The focused Window is the Window that is or
     * contains the focus owner.
     *
     * @return the focused Window, or null if the focused Window is not a
     *         member of the calling thread's context
     * @see #getGlobalFocusedWindow
     * @see #setGlobalFocusedWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalPermanentFocusOwner(Component permanentFocusOwner)

    /**
     * Sets the permanent focus owner. The operation will be cancelled if the
     * Component is not focusable. The permanent focus owner is defined as the
     * last Component in an application to receive a permanent FOCUS_GAINED
     * event. The focus owner and permanent focus owner are equivalent unless
     * a temporary focus change is currently in effect. In such a situation,
     * the permanent focus owner will again be the focus owner when the
     * temporary focus change ends.
     * <p>
     * This method does not actually set the focus to the specified Component.
     * It merely stores the value to be subsequently returned by
     * <code>getPermanentFocusOwner()</code>. Use
     * <code>Component.requestFocus()</code> or
     * <code>Component.requestFocusInWindow()</code> to change the focus owner,
     * subject to platform limitations.
     *
     * @param permanentFocusOwner the permanent focus owner
     * @see #getPermanentFocusOwner
     * @see #getGlobalPermanentFocusOwner
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @see Component#isFocusable
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Component getGlobalPermanentFocusOwner()

    /**
     * Returns the permanent focus owner, even if the calling thread is in a
     * different context than the permanent focus owner. The permanent focus
     * owner is defined as the last Component in an application to receive a
     * permanent FOCUS_GAINED event. The focus owner and permanent focus owner
     * are equivalent unless a temporary focus change is currently in effect.
     * In such a situation, the permanent focus owner will again be the focus
     * owner when the temporary focus change ends.
     *
     * @return the permanent focus owner
     * @see #getPermanentFocusOwner
     * @see #setGlobalPermanentFocusOwner
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Component getPermanentFocusOwner() {

    /**
     * Returns the permanent focus owner, if the permanent focus owner is in
     * the same context as the calling thread. The permanent focus owner is
     * defined as the last Component in an application to receive a permanent
     * FOCUS_GAINED event. The focus owner and permanent focus owner are
     * equivalent unless a temporary focus change is currently in effect. In
     * such a situation, the permanent focus owner will again be the focus
     * owner when the temporary focus change ends.
     *
     * @return the permanent focus owner, or null if the permanent focus owner
     *         is not a member of the calling thread's context
     * @see #getGlobalPermanentFocusOwner
     * @see #setGlobalPermanentFocusOwner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void clearGlobalFocusOwner()

    /**
     * Clears the global focus owner at both the Java and native levels. If
     * there exists a focus owner, that Component will receive a permanent
     * FOCUS_LOST event. After this operation completes, the native windowing
     * system will discard all user-generated KeyEvents until the user selects
     * a new Component to receive focus, or a Component is given focus
     * explicitly via a call to <code>requestFocus()</code>. This operation
     * does not change the focused or active Windows.
     * <p>
     * If a SecurityManager is installed, the calling thread must be granted
     * the "replaceKeyboardFocusManager" AWTPermission. If this permission is
     * not granted, this method will throw a SecurityException, and the current
     * focus owner will not be cleared.
     * <p>
     * This method is intended to be used only by KeyboardFocusManager set as
     * current KeyboardFocusManager for the calling thread's context. It is not
     * for general client use.
     *
     * @see KeyboardFocusManager#clearFocusOwner
     * @see Component#requestFocus()
     * @see java.awt.event.FocusEvent#FOCUS_LOST
     * @throws SecurityException if the calling thread does not have
     *         "replaceKeyboardFocusManager" permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void clearFocusOwner() {

    /**
     * Clears the focus owner at both the Java and native levels if the
     * focus owner exists and resides in the same context as the calling thread,
     * otherwise the method returns silently.
     * <p>
     * The focus owner component will receive a permanent FOCUS_LOST event.
     * After this operation completes, the native windowing system will discard
     * all user-generated KeyEvents until the user selects a new Component to
     * receive focus, or a Component is given focus explicitly via a call to
     * {@code requestFocus()}. This operation does not change the focused or
     * active Windows.
     *
     * @see Component#requestFocus()
     * @see java.awt.event.FocusEvent#FOCUS_LOST
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalFocusOwner(Component focusOwner)

    /**
     * Sets the focus owner. The operation will be cancelled if the Component
     * is not focusable. The focus owner is defined as the Component in an
     * application that will typically receive all KeyEvents generated by the
     * user. KeyEvents which map to the focus owner's focus traversal keys will
     * not be delivered if focus traversal keys are enabled for the focus
     * owner. In addition, KeyEventDispatchers may retarget or consume
     * KeyEvents before they reach the focus owner.
     * <p>
     * This method does not actually set the focus to the specified Component.
     * It merely stores the value to be subsequently returned by
     * <code>getFocusOwner()</code>. Use <code>Component.requestFocus()</code>
     * or <code>Component.requestFocusInWindow()</code> to change the focus
     * owner, subject to platform limitations.
     *
     * @param focusOwner the focus owner
     * @see #getFocusOwner
     * @see #getGlobalFocusOwner
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @see Component#isFocusable
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Component getGlobalFocusOwner() throws SecurityException {

    /**
     * Returns the focus owner, even if the calling thread is in a different
     * context than the focus owner. The focus owner is defined as the
     * Component in an application that will typically receive all KeyEvents
     * generated by the user. KeyEvents which map to the focus owner's focus
     * traversal keys will not be delivered if focus traversal keys are enabled
     * for the focus owner. In addition, KeyEventDispatchers may retarget or
     * consume KeyEvents before they reach the focus owner.
     * <p>
     * This method will throw a SecurityException if this KeyboardFocusManager
     * is not the current KeyboardFocusManager for the calling thread's
     * context.
     *
     * @return the focus owner
     * @see #getFocusOwner
     * @see #setGlobalFocusOwner
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Component getFocusOwner() {

    /**
     * Returns the focus owner, if the focus owner is in the same context as
     * the calling thread. The focus owner is defined as the Component in an
     * application that will typically receive all KeyEvents generated by the
     * user. KeyEvents which map to the focus owner's focus traversal keys will
     * not be delivered if focus traversal keys are enabled for the focus
     * owner. In addition, KeyEventDispatchers may retarget or consume
     * KeyEvents before they reach the focus owner.
     *
     * @return the focus owner, or null if the focus owner is not a member of
     *         the calling thread's context
     * @see #getGlobalFocusOwner
     * @see #setGlobalFocusOwner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public KeyboardFocusManager() {

    /**
     * Initializes a KeyboardFocusManager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static AWTPermission replaceKeyboardFocusManagerPermission;

    /**
     * We cache the permission used to verify that the calling thread is
     * permitted to access the global focus state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static java.util.Map<Window, WeakReference<Component>> mostRecentFocusOwners = new WeakHashMap<>();

    /**
     * Maps Windows to those Windows' most recent focus owners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private java.util.LinkedList<KeyEventPostProcessor> keyEventPostProcessors;

    /**
     * This KeyboardFocusManager's KeyEventPostProcessor chain. The List does
     * not include this KeyboardFocusManager unless it was explicitly
     * re-registered via a call to <code>addKeyEventPostProcessor</code>.
     * If no other KeyEventPostProcessors are registered, this field may be
     * null or refer to a List of length 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private java.util.LinkedList<KeyEventDispatcher> keyEventDispatchers;

    /**
     * This KeyboardFocusManager's KeyEventDispatcher chain. The List does not
     * include this KeyboardFocusManager unless it was explicitly re-registered
     * via a call to <code>addKeyEventDispatcher</code>. If no other
     * KeyEventDispatchers are registered, this field may be null or refer to
     * a List of length 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private PropertyChangeSupport changeSupport;

    /**
     * A description of any PropertyChangeListeners which have been registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private VetoableChangeSupport vetoableSupport;

    /**
     * A description of any VetoableChangeListeners which have been registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Container currentFocusCycleRoot;

    /**
     * The current focus cycle root. If the focus owner is itself a focus cycle
     * root, then it may be ambiguous as to which Components represent the next
     * and previous Components to focus during normal focus traversal. In that
     * case, the current focus cycle root is used to differentiate among the
     * possibilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private Set<AWTKeyStroke>[] defaultFocusTraversalKeys = new Set[4];

    /**
     * The default focus traversal keys. Each array of traversal keys will be
     * in effect on all Windows that have no such array of their own explicitly
     * set. Each array will also be inherited, recursively, by any child
     * Component of those Windows that has no such array of its own explicitly
     * set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static final AWTKeyStroke[][] defaultFocusTraversalKeyStrokes = {

    /**
     * The default strokes for initializing the default focus traversal keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static final String[] defaultFocusTraversalKeyPropertyNames = {

    /**
     * The bound property names of each focus traversal key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private FocusTraversalPolicy defaultPolicy =

    /**
     * The default FocusTraversalPolicy for all Windows that have no policy of
     * their own set. If those Windows have focus-cycle-root children that have
     * no keyboard-traversal policy of their own, then those children will also
     * inherit this policy (as will, recursively, their focus-cycle-root
     * children).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Window activeWindow;

    /**
     * Only a Frame or a Dialog can be the active Window. The native windowing
     * system may denote the active Window with a special decoration, such as a
     * highlighted title bar. The active Window is always either the focused
     * Window, or the first Frame or Dialog which is an owner of the focused
     * Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Window focusedWindow;

    /**
     * The Window which is, or contains, the focus owner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Component permanentFocusOwner;

    /**
     * The Component in an application that will regain focus when an
     * outstanding temporary focus transfer has completed, or the focus owner,
     * if no outstanding temporary transfer exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Component focusOwner;

    /**
     * The Component in an application that will typically receive all
     * KeyEvents generated by the user.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static void setCurrentKeyboardFocusManager(
        KeyboardFocusManager newManager) throws SecurityException

    /**
     * Sets the current KeyboardFocusManager instance for the calling thread's
     * context. If null is specified, then the current KeyboardFocusManager
     * is replaced with a new instance of DefaultKeyboardFocusManager.
     * <p>
     * If a SecurityManager is installed, the calling thread must be granted
     * the AWTPermission "replaceKeyboardFocusManager" in order to replace the
     * the current KeyboardFocusManager. If this permission is not granted,
     * this method will throw a SecurityException, and the current
     * KeyboardFocusManager will be unchanged.
     *
     * @param newManager the new KeyboardFocusManager for this thread's context
     * @see #getCurrentKeyboardFocusManager
     * @see DefaultKeyboardFocusManager
     * @throws SecurityException if the calling thread does not have permission
     *         to replace the current KeyboardFocusManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static KeyboardFocusManager getCurrentKeyboardFocusManager() {

    /**
     * Returns the current KeyboardFocusManager instance for the calling
     * thread's context.
     *
     * @return this thread's context's KeyboardFocusManager
     * @see #setCurrentKeyboardFocusManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int DOWN_CYCLE_TRAVERSAL_KEYS = 3;

    /**
     * The identifier for the Down Cycle focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int UP_CYCLE_TRAVERSAL_KEYS = 2;

    /**
     * The identifier for the Up Cycle focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int BACKWARD_TRAVERSAL_KEYS = 1;

    /**
     * The identifier for the Backward focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int FORWARD_TRAVERSAL_KEYS = 0;

    /**
     * The identifier for the Forward focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
public abstract class KeyboardFocusManager

/**
 * The KeyboardFocusManager is responsible for managing the active and focused
 * Windows, and the current focus owner. The focus owner is defined as the
 * Component in an application that will typically receive all KeyEvents
 * generated by the user. The focused Window is the Window that is, or
 * contains, the focus owner. Only a Frame or a Dialog can be the active
 * Window. The native windowing system may denote the active Window or its
 * children with special decorations, such as a highlighted title bar. The
 * active Window is always either the focused Window, or the first Frame or
 * Dialog that is an owner of the focused Window.
 * <p>
 * The KeyboardFocusManager is both a centralized location for client code to
 * query for the focus owner and initiate focus changes, and an event
 * dispatcher for all FocusEvents, WindowEvents related to focus, and
 * KeyEvents.
 * <p>
 * Some browsers partition applets in different code bases into separate
 * contexts, and establish walls between these contexts. In such a scenario,
 * there will be one KeyboardFocusManager per context. Other browsers place all
 * applets into the same context, implying that there will be only a single,
 * global KeyboardFocusManager for all applets. This behavior is
 * implementation-dependent. Consult your browser's documentation for more
 * information. No matter how many contexts there may be, however, there can
 * never be more than one focus owner, focused Window, or active Window, per
 * ClassLoader.
 * <p>
 * Please see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/focus.html">
 * How to Use the Focus Subsystem</a>,
 * a section in <em>The Java Tutorial</em>, and the
 * <a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
 * for more information.
 *
 * @author David Mendenhall
 *
 * @see Window
 * @see Frame
 * @see Dialog
 * @see java.awt.event.FocusEvent
 * @see java.awt.event.WindowEvent
 * @see java.awt.event.KeyEvent
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    void clearMarkers() {

    /**
     * Clears markers queue
     * This method is not intended to be overridden by KFM's.
     * Only DefaultKeyboardFocusManager can implement it.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    static Window markClearGlobalFocusOwner() {

    /**
     * Returns the Window which will be active after processing this request,
     * or null if this is a duplicate request. The active Window is useful
     * because some native platforms do not support setting the native focus
     * owner to null. On these platforms, the obvious choice is to set the
     * focus owner to the focus proxy of the active Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    static int shouldNativelyFocusHeavyweight

    /**
     * Indicates whether the native implementation should proceed with a
     * pending, native focus request. Before changing the focus at the native
     * level, the AWT implementation should always call this function for
     * permission. This function will reject the request if a duplicate request
     * preceded it, or if the specified heavyweight Component already owns the
     * focus and no native focus changes are pending. Otherwise, the request
     * will be approved and the focus request list will be updated so that,
     * if necessary, the proper descendant will be focused when the
     * corresponding FOCUS_GAINED event on the heavyweight is received.
     *
     * An implementation must ensure that calls to this method and native
     * focus changes are atomic. If this is not guaranteed, then the ordering
     * of the focus request list may be incorrect, leading to errors in the
     * type-ahead mechanism. Typically this is accomplished by only calling
     * this function from the native event pumping thread, or by holding a
     * global, native lock during invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    void dumpRequests() {

    /**
     * Dumps the list of focus requests to stderr
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void downFocusCycle() {

    /**
     * Moves the focus down one focus traversal cycle from the current focus
     * owner, if and only if the current focus owner is a Container that is a
     * focus cycle root. Typically, the focus owner is set to the current focus
     * owner's default Component to focus, and the current focus cycle root is
     * set to the current focus owner. If the current focus owner is not a
     * Container that is a focus cycle root, then no focus traversal operation
     * occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void upFocusCycle() {

    /**
     * Moves the focus up one focus traversal cycle from the current focus
     * owner. Typically, the new focus owner is set to the current focus
     * owner's focus cycle root, and the current focus cycle root is set to the
     * new focus owner's focus cycle root. If, however, the current focus
     * owner's focus cycle root is a Window, then typically the focus owner is
     * set to the focus cycle root's default Component to focus, and the
     * current focus cycle root is unchanged.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void focusPreviousComponent() {

    /**
     * Focuses the Component before the current focus owner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void focusNextComponent() {

    /**
     * Focuses the Component after the current focus owner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void downFocusCycle(Container aContainer);

    /**
     * Moves the focus down one focus traversal cycle. Typically, if
     * aContainer is a focus cycle root, then the focus owner is set to
     * aContainer's default Component to focus, and the current focus cycle
     * root is set to aContainer. If aContainer is not a focus cycle root, then
     * no focus traversal operation occurs.
     *
     * @param aContainer the Container that is the basis for the focus
     *        traversal operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void upFocusCycle(Component aComponent);

    /**
     * Moves the focus up one focus traversal cycle. Typically, the focus owner
     * is set to aComponent's focus cycle root, and the current focus cycle
     * root is set to the new focus owner's focus cycle root. If, however,
     * aComponent's focus cycle root is a Window, then typically the focus
     * owner is set to the Window's default Component to focus, and the current
     * focus cycle root is unchanged.
     *
     * @param aComponent the Component that is the basis for the focus
     *        traversal operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void focusPreviousComponent(Component aComponent);

    /**
     * Focuses the Component before aComponent, typically based on a
     * FocusTraversalPolicy.
     *
     * @param aComponent the Component that is the basis for the focus
     *        traversal operation
     * @see FocusTraversalPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void focusNextComponent(Component aComponent);

    /**
     * Focuses the Component after aComponent, typically based on a
     * FocusTraversalPolicy.
     *
     * @param aComponent the Component that is the basis for the focus
     *        traversal operation
     * @see FocusTraversalPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected abstract void discardKeyEvents(Component comp);

    /**
     * Called by the AWT to notify the KeyboardFocusManager that it should
     * cancel delayed dispatching of KeyEvents. All KeyEvents which were
     * enqueued because of one or more calls to <code>enqueueKeyEvents</code>
     * with the same Component should be discarded.
     *
     * @param comp the Component specified in one or more calls to
     *        <code>enqueueKeyEvents</code>
     * @see #enqueueKeyEvents
     * @see #dequeueKeyEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected abstract void dequeueKeyEvents(long after,
                                             Component untilFocused);

    /**
     * Called by the AWT to notify the KeyboardFocusManager that it should
     * cancel delayed dispatching of KeyEvents. All KeyEvents which were
     * enqueued because of a call to <code>enqueueKeyEvents</code> with the
     * same timestamp and Component should be released for normal dispatching
     * to the current focus owner. If the given timestamp is less than zero,
     * the outstanding enqueue request for the given Component with the <b>
     * oldest</b> timestamp (if any) should be cancelled.
     *
     * @param after the timestamp specified in the call to
     *        <code>enqueueKeyEvents</code>, or any value &lt; 0
     * @param untilFocused the Component specified in the call to
     *        <code>enqueueKeyEvents</code>
     * @see #enqueueKeyEvents
     * @see #discardKeyEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected abstract void enqueueKeyEvents(long after,
                                             Component untilFocused);

    /**
     * Called by the AWT to notify the KeyboardFocusManager that it should
     * delay dispatching of KeyEvents until the specified Component becomes
     * the focus owner. If client code requests a focus change, and the AWT
     * determines that this request might be granted by the native windowing
     * system, then the AWT will call this method. It is the responsibility of
     * the KeyboardFocusManager to delay dispatching of KeyEvents with
     * timestamps later than the specified time stamp until the specified
     * Component receives a FOCUS_GAINED event, or the AWT cancels the delay
     * request by invoking <code>dequeueKeyEvents</code> or
     * <code>discardKeyEvents</code>.
     *
     * @param after timestamp of current event, or the current, system time if
     *        the current event has no timestamp, or the AWT cannot determine
     *        which event is currently being handled
     * @param untilFocused Component which should receive a FOCUS_GAINED event
     *        before any pending KeyEvents
     * @see #dequeueKeyEvents
     * @see #discardKeyEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract void processKeyEvent(Component focusedComponent,
                                         KeyEvent e);

    /**
     * This method initiates a focus traversal operation if and only if the
     * KeyEvent represents a focus traversal key for the specified
     * focusedComponent. It is expected that focusedComponent is the current
     * focus owner, although this need not be the case. If it is not,
     * focus traversal will nevertheless proceed as if focusedComponent
     * were the current focus owner.
     *
     * @param focusedComponent the Component that will be the basis for a focus
     *        traversal operation if the specified event represents a focus
     *        traversal key for the Component
     * @param e the event that may represent a focus traversal key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract boolean postProcessKeyEvent(KeyEvent e);

    /**
     * This method will be called by <code>dispatchKeyEvent</code>.
     * By default, this method will handle any unconsumed KeyEvents that
     * map to an AWT <code>MenuShortcut</code> by consuming the event
     * and activating the shortcut.
     *
     * @param e the KeyEvent to post-process
     * @return <code>true</code> to indicate that no other
     *         KeyEventPostProcessor will be notified of the KeyEvent.
     * @see #dispatchKeyEvent
     * @see MenuShortcut
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract boolean dispatchKeyEvent(KeyEvent e);

    /**
     * Typically this method will be called by <code>dispatchEvent</code> if no
     * other KeyEventDispatcher in the dispatcher chain dispatched the
     * KeyEvent, or if no other KeyEventDispatchers are registered. If an
     * implementation of this method returns <code>false</code>,
     * <code>dispatchEvent</code> may try to dispatch the KeyEvent itself, or
     * may simply return <code>false</code>. If <code>true</code> is returned,
     * <code>dispatchEvent</code> should return <code>true</code> as well.
     *
     * @param e the KeyEvent which the current KeyboardFocusManager has
     *        requested that this KeyEventDispatcher dispatch
     * @return <code>true</code> if the KeyEvent was dispatched;
     *         <code>false</code> otherwise
     * @see #dispatchEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public final void redispatchEvent(Component target, AWTEvent e) {

    /**
     * Redispatches an AWTEvent in such a way that the AWT event dispatcher
     * will not recursively request that the KeyboardFocusManager, or any
     * installed KeyEventDispatchers, dispatch the event again. Client
     * implementations of <code>dispatchEvent</code> and client-defined
     * KeyEventDispatchers must call <code>redispatchEvent(target, e)</code>
     * instead of <code>target.dispatchEvent(e)</code> to dispatch an event.
     * <p>
     * This method is intended to be used only by KeyboardFocusManagers and
     * KeyEventDispatchers. It is not for general client use.
     *
     * @param target the Component to which the event should be dispatched
     * @param e the event to dispatch
     * @see #dispatchEvent
     * @see KeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public abstract boolean dispatchEvent(AWTEvent e);

    /**
     * This method is called by the AWT event dispatcher requesting that the
     * current KeyboardFocusManager dispatch the specified event on its behalf.
     * It is expected that all KeyboardFocusManagers will dispatch all
     * FocusEvents, all WindowEvents related to focus, and all KeyEvents.
     * These events should be dispatched based on the KeyboardFocusManager's
     * notion of the focus owner and the focused and active Windows, sometimes
     * overriding the source of the specified AWTEvent. Dispatching must be
     * done using <code>redispatchEvent</code> to prevent the AWT event
     * dispatcher from recursively requesting that the KeyboardFocusManager
     * dispatch the event again. If this method returns <code>false</code>,
     * then the AWT event dispatcher will attempt to dispatch the event itself.
     *
     * @param e the AWTEvent to be dispatched
     * @return <code>true</code> if this method dispatched the event;
     *         <code>false</code> otherwise
     * @see #redispatchEvent
     * @see #dispatchKeyEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected java.util.List<KeyEventPostProcessor>

    /**
     * Returns this KeyboardFocusManager's KeyEventPostProcessor chain as a
     * List. The List will not include this KeyboardFocusManager unless it was
     * explicitly added via a call to <code>addKeyEventPostProcessor</code>. If
     * no KeyEventPostProcessors are registered, implementations are free to
     * return null or a List of length 0. Client code should not assume one
     * behavior over another, nor should it assume that the behavior, once
     * established, will not change.
     *
     * @return a possibly null or empty List of KeyEventPostProcessors
     * @see #addKeyEventPostProcessor
     * @see #removeKeyEventPostProcessor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeKeyEventPostProcessor(KeyEventPostProcessor processor) {

    /**
     * Removes a previously added KeyEventPostProcessor from this
     * KeyboardFocusManager's post-processor chain. This KeyboardFocusManager
     * cannot itself be entirely removed from the chain. Only additional
     * references added via <code>addKeyEventPostProcessor</code> can be
     * removed.
     * <p>
     * If a null post-processor is specified, if the specified post-processor
     * is not in the post-processor chain, or if this KeyboardFocusManager is
     * specified without having been explicitly added, no action is taken and
     * no exception is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventPostProcessor} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param processor the KeyEventPostProcessor to remove from the post-
     *        processor chain
     * @see #addKeyEventPostProcessor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addKeyEventPostProcessor(KeyEventPostProcessor processor) {

    /**
     * Adds a KeyEventPostProcessor to this KeyboardFocusManager's post-
     * processor chain. After a KeyEvent has been dispatched to and handled by
     * its target, KeyboardFocusManager will request that each
     * KeyEventPostProcessor perform any necessary post-processing as part
     * of the KeyEvent's final resolution. KeyEventPostProcessors
     * will be notified in the order in which they were added; the current
     * KeyboardFocusManager will be notified last. Notifications will halt
     * as soon as one KeyEventPostProcessor returns <code>true</code> from its
     * <code>postProcessKeyEvent</code> method. There is no limit to the the
     * total number of KeyEventPostProcessors that can be added, nor to the
     * number of times that a particular KeyEventPostProcessor instance can be
     * added.
     * <p>
     * If a null post-processor is specified, no action is taken and no
     * exception is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventPostProcessor} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param processor the KeyEventPostProcessor to add to the post-processor
     *        chain
     * @see #removeKeyEventPostProcessor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected synchronized java.util.List<KeyEventDispatcher>

    /**
     * Returns this KeyboardFocusManager's KeyEventDispatcher chain as a List.
     * The List will not include this KeyboardFocusManager unless it was
     * explicitly re-registered via a call to
     * <code>addKeyEventDispatcher</code>. If no other KeyEventDispatchers are
     * registered, implementations are free to return null or a List of length
     * 0. Client code should not assume one behavior over another, nor should
     * it assume that the behavior, once established, will not change.
     *
     * @return a possibly null or empty List of KeyEventDispatchers
     * @see #addKeyEventDispatcher
     * @see #removeKeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeKeyEventDispatcher(KeyEventDispatcher dispatcher) {

    /**
     * Removes a KeyEventDispatcher which was previously added to this
     * KeyboardFocusManager's dispatcher chain. This KeyboardFocusManager
     * cannot itself be removed, unless it was explicitly re-registered via a
     * call to <code>addKeyEventDispatcher</code>.
     * <p>
     * If a null dispatcher is specified, if the specified dispatcher is not
     * in the dispatcher chain, or if this KeyboardFocusManager is specified
     * without having been explicitly re-registered, no action is taken and no
     * exception is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventDispatcher} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param dispatcher the KeyEventDispatcher to remove from the dispatcher
     *        chain
     * @see #addKeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addKeyEventDispatcher(KeyEventDispatcher dispatcher) {

    /**
     * Adds a KeyEventDispatcher to this KeyboardFocusManager's dispatcher
     * chain. This KeyboardFocusManager will request that each
     * KeyEventDispatcher dispatch KeyEvents generated by the user before
     * finally dispatching the KeyEvent itself. KeyEventDispatchers will be
     * notified in the order in which they were added. Notifications will halt
     * as soon as one KeyEventDispatcher returns <code>true</code> from its
     * <code>dispatchKeyEvent</code> method. There is no limit to the total
     * number of KeyEventDispatchers which can be added, nor to the number of
     * times which a particular KeyEventDispatcher instance can be added.
     * <p>
     * If a null dispatcher is specified, no action is taken and no exception
     * is thrown.
     * <p>
     * In a multithreaded application, {@link KeyEventDispatcher} behaves
     * the same as other AWT listeners.  See
     * <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for more details.
     *
     * @param dispatcher the KeyEventDispatcher to add to the dispatcher chain
     * @see #removeKeyEventDispatcher
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void fireVetoableChange(String propertyName, Object oldValue,
                                      Object newValue)

    /**
     * Fires a PropertyChangeEvent in response to a change in a vetoable
     * property. The event will be delivered to all registered
     * VetoableChangeListeners. If a VetoableChangeListener throws a
     * PropertyVetoException, a new event is fired reverting all
     * VetoableChangeListeners to the old value and the exception is then
     * rethrown. No event will be delivered if oldValue and newValue are the
     * same.
     *
     * @param propertyName the name of the property that has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     * @throws java.beans.PropertyVetoException if a
     *         <code>VetoableChangeListener</code> threw
     *         <code>PropertyVetoException</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized VetoableChangeListener[] getVetoableChangeListeners(String propertyName) {

    /**
     * Returns an array of all the <code>VetoableChangeListener</code>s
     * associated with the named property.
     *
     * @return all of the <code>VetoableChangeListener</code>s associated with
     *         the named property or an empty array if no such listeners have
     *         been added.
     *
     * @see #addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     * @see #removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     * @see #getVetoableChangeListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeVetoableChangeListener(String propertyName,
                                             VetoableChangeListener listener) {

    /**
     * Removes a VetoableChangeListener from the listener list for a specific
     * property. This method should be used to remove VetoableChangeListeners
     * that were registered for a specific bound property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName a valid property name
     * @param listener the VetoableChangeListener to be removed
     * @see #addVetoableChangeListener
     * @see #getVetoableChangeListeners
     * @see #removeVetoableChangeListener(java.beans.VetoableChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addVetoableChangeListener(String propertyName,
                                          VetoableChangeListener listener) {

    /**
     * Adds a VetoableChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the VetoableChangeListener to be added
     * @see #addVetoableChangeListener(java.beans.VetoableChangeListener)
     * @see #removeVetoableChangeListener
     * @see #getVetoableChangeListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized VetoableChangeListener[] getVetoableChangeListeners() {

    /**
     * Returns an array of all the vetoable change listeners
     * registered on this keyboard focus manager.
     *
     * @return all of this keyboard focus manager's
     *         <code>VetoableChangeListener</code>s
     *         or an empty array if no vetoable change
     *         listeners are currently registered
     *
     * @see #addVetoableChangeListener
     * @see #removeVetoableChangeListener
     * @see #getVetoableChangeListeners(java.lang.String)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removeVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Removes a VetoableChangeListener from the listener list. This method
     * should be used to remove the VetoableChangeListeners that were
     * registered for all vetoable properties of this class.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the VetoableChangeListener to be removed
     * @see #addVetoableChangeListener
     * @see #getVetoableChangeListeners
     * @see #removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addVetoableChangeListener(VetoableChangeListener listener) {

    /**
     * Adds a VetoableChangeListener to the listener list. The listener is
     * registered for all vetoable properties of this class, including the
     * following:
     * <ul>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the VetoableChangeListener to be added
     * @see #removeVetoableChangeListener
     * @see #getVetoableChangeListeners
     * @see #addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void firePropertyChange(String propertyName, Object oldValue,
                                      Object newValue)

    /**
     * Fires a PropertyChangeEvent in response to a change in a bound property.
     * The event will be delivered to all registered PropertyChangeListeners.
     * No event will be delivered if oldValue and newValue are the same.
     *
     * @param propertyName the name of the property that has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {

    /**
     * Returns an array of all the <code>PropertyChangeListener</code>s
     * associated with the named property.
     *
     * @return all of the <code>PropertyChangeListener</code>s associated with
     *         the named property or an empty array if no such listeners have
     *         been added.
     *
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removePropertyChangeListener(String propertyName,
                                             PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list for a specific
     * property. This method should be used to remove PropertyChangeListeners
     * that were registered for a specific bound property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName a valid property name
     * @param listener the PropertyChangeListener to be removed
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     * @see #removePropertyChangeListener(java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addPropertyChangeListener(String propertyName,
                                          PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>whether the KeyboardFocusManager is currently managing focus
     *        for this application or applet's browser context
     *        ("managingFocus")</li>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     *    <li>the default focus traversal policy
     *        ("defaultFocusTraversalPolicy")</li>
     *    <li>the Set of default FORWARD_TRAVERSAL_KEYS
     *        ("forwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default BACKWARD_TRAVERSAL_KEYS
     *        ("backwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleDefaultFocusTraversalKeys")</li>
     *    <li>the current focus cycle root ("currentFocusCycleRoot")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the PropertyChangeListener to be added
     * @see #addPropertyChangeListener(java.beans.PropertyChangeListener)
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the property change listeners
     * registered on this keyboard focus manager.
     *
     * @return all of this keyboard focus manager's
     *         <code>PropertyChangeListener</code>s
     *         or an empty array if no property change
     *         listeners are currently registered
     *
     * @see #addPropertyChangeListener
     * @see #removePropertyChangeListener
     * @see #getPropertyChangeListeners(java.lang.String)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list. This method
     * should be used to remove the PropertyChangeListeners that were
     * registered for all bound properties of this class.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the PropertyChangeListener to be removed
     * @see #addPropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>whether the KeyboardFocusManager is currently managing focus
     *        for this application or applet's browser context
     *        ("managingFocus")</li>
     *    <li>the focus owner ("focusOwner")</li>
     *    <li>the permanent focus owner ("permanentFocusOwner")</li>
     *    <li>the focused Window ("focusedWindow")</li>
     *    <li>the active Window ("activeWindow")</li>
     *    <li>the default focus traversal policy
     *        ("defaultFocusTraversalPolicy")</li>
     *    <li>the Set of default FORWARD_TRAVERSAL_KEYS
     *        ("forwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default BACKWARD_TRAVERSAL_KEYS
     *        ("backwardDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleDefaultFocusTraversalKeys")</li>
     *    <li>the Set of default DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleDefaultFocusTraversalKeys")</li>
     *    <li>the current focus cycle root ("currentFocusCycleRoot")</li>
     * </ul>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the PropertyChangeListener to be added
     * @see #removePropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void setGlobalCurrentFocusCycleRoot(Container newFocusCycleRoot)

    /**
     * Sets the current focus cycle root. If the focus owner is itself a focus
     * cycle root, then it may be ambiguous as to which Components represent
     * the next and previous Components to focus during normal focus traversal.
     * In that case, the current focus cycle root is used to differentiate
     * among the possibilities.
     * <p>
     * If a SecurityManager is installed, the calling thread must be granted
     * the "replaceKeyboardFocusManager" AWTPermission. If this permission is
     * not granted, this method will throw a SecurityException, and the current
     * focus cycle root will not be changed.
     * <p>
     * This method is intended to be used only by KeyboardFocusManagers and
     * focus implementations. It is not for general client use.
     *
     * @param newFocusCycleRoot the new focus cycle root
     * @see #getCurrentFocusCycleRoot
     * @see #getGlobalCurrentFocusCycleRoot
     * @throws SecurityException if the calling thread does not have
     *         "replaceKeyboardFocusManager" permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Container getGlobalCurrentFocusCycleRoot()

    /**
     * Returns the current focus cycle root, even if the calling thread is in a
     * different context than the current focus cycle root. If the focus owner
     * is itself a focus cycle root, then it may be ambiguous as to which
     * Components represent the next and previous Components to focus during
     * normal focus traversal. In that case, the current focus cycle root is
     * used to differentiate among the possibilities.
     *
     * @return the current focus cycle root, or null if the current focus cycle
     *         root is not a member of the calling thread's context
     * @see #getCurrentFocusCycleRoot
     * @see #setGlobalCurrentFocusCycleRoot
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Container getCurrentFocusCycleRoot() {

    /**
     * Returns the current focus cycle root, if the current focus cycle root is
     * in the same context as the calling thread. If the focus owner is itself
     * a focus cycle root, then it may be ambiguous as to which Components
     * represent the next and previous Components to focus during normal focus
     * traversal. In that case, the current focus cycle root is used to
     * differentiate among the possibilities.
     * <p>
     * This method is intended to be used only by KeyboardFocusManagers and
     * focus implementations. It is not for general client use.
     *
     * @return the current focus cycle root, or null if the current focus cycle
     *         root is not a member of the calling thread's context
     * @see #getGlobalCurrentFocusCycleRoot
     * @see #setGlobalCurrentFocusCycleRoot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Set<AWTKeyStroke> getDefaultFocusTraversalKeys(int id) {

    /**
     * Returns a Set of default focus traversal keys for a given traversal
     * operation. This traversal key Set will be in effect on all Windows that
     * have no such Set of their own explicitly defined. This Set will also be
     * inherited, recursively, by any child Component of those Windows that has
     * no such Set of its own explicitly defined. (See
     * <code>setDefaultFocusTraversalKeys</code> for a full description of each
     * operation.)
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return the <code>Set</code> of <code>AWTKeyStroke</code>s
     *         for the specified operation; the <code>Set</code>
     *         will be unmodifiable, and may be empty; <code>null</code>
     *         will never be returned
     * @see #setDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void

    /**
     * Sets the default focus traversal keys for a given traversal operation.
     * This traversal key {@code Set} will be in effect on all
     * {@code Window}s that have no such {@code Set} of
     * their own explicitly defined. This {@code Set} will also be
     * inherited, recursively, by any child {@code Component} of
     * those {@code Windows} that has
     * no such {@code Set} of its own explicitly defined.
     * <p>
     * The default values for the default focus traversal keys are
     * implementation-dependent. Sun recommends that all implementations for a
     * particular native platform use the same default values. The
     * recommendations for Windows and Unix are listed below. These
     * recommendations are used in the Sun AWT implementations.
     *
     * <table border=1 summary="Recommended default values for focus traversal keys">
     * <tr>
     *    <th>Identifier</th>
     *    <th>Meaning</th>
     *    <th>Default</th>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS}</td>
     *    <td>Normal forward keyboard traversal</td>
     *    <td>{@code TAB} on {@code KEY_PRESSED},
     *        {@code CTRL-TAB} on {@code KEY_PRESSED}</td>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS}</td>
     *    <td>Normal reverse keyboard traversal</td>
     *    <td>{@code SHIFT-TAB} on {@code KEY_PRESSED},
     *        {@code CTRL-SHIFT-TAB} on {@code KEY_PRESSED}</td>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS}</td>
     *    <td>Go up one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * <tr>
     *    <td>{@code KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS}</td>
     *    <td>Go down one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * </table>
     *
     * To disable a traversal key, use an empty {@code Set};
     * {@code Collections.EMPTY_SET} is recommended.
     * <p>
     * Using the {@code AWTKeyStroke} API, client code can
     * specify on which of two
     * specific {@code KeyEvent}s, {@code KEY_PRESSED} or
     * {@code KEY_RELEASED}, the focus traversal operation will
     * occur. Regardless of which {@code KeyEvent} is specified,
     * however, all {@code KeyEvent}s related to the focus
     * traversal key, including the associated {@code KEY_TYPED}
     * event, will be consumed, and will not be dispatched
     * to any {@code Component}. It is a runtime error to
     * specify a {@code KEY_TYPED} event as
     * mapping to a focus traversal operation, or to map the same event to
     * multiple default focus traversal operations.
     * <p>
     * This method may throw a {@code ClassCastException} if any {@code Object}
     * in {@code keystrokes} is not an {@code AWTKeyStroke}.
     *
     * @param id one of
     *        {@code KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS},
     *        {@code KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS},
     *        {@code KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS}, or
     *        {@code KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS}
     * @param keystrokes the Set of {@code AWTKeyStroke}s for the
     *        specified operation
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     * @throws IllegalArgumentException if id is not one of
     *         {@code KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS},
     *         {@code KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS},
     *         {@code KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS}, or
     *         {@code KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS},
     *         or if keystrokes is {@code null},
     *         or if keystrokes contains {@code null},
     *         or if any keystroke
     *         represents a {@code KEY_TYPED} event,
     *         or if any keystroke already maps
     *         to another default focus traversal operation
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void setDefaultFocusTraversalPolicy(FocusTraversalPolicy
                                               defaultPolicy) {

    /**
     * Sets the default FocusTraversalPolicy. Top-level components
     * use this value on their creation to initialize their own focus traversal
     * policy by explicit call to Container.setFocusTraversalPolicy.
     * Note: this call doesn't affect already created components as they have
     * their policy initialized. Only new components will use this policy as
     * their default policy.
     *
     * @param defaultPolicy the new, default FocusTraversalPolicy
     * @see #getDefaultFocusTraversalPolicy
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     * @throws IllegalArgumentException if defaultPolicy is null
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public synchronized FocusTraversalPolicy getDefaultFocusTraversalPolicy() {

    /**
     * Returns the default FocusTraversalPolicy. Top-level components
     * use this value on their creation to initialize their own focus traversal
     * policy by explicit call to Container.setFocusTraversalPolicy.
     *
     * @return the default FocusTraversalPolicy. null will never be returned.
     * @see #setDefaultFocusTraversalPolicy
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalActiveWindow(Window activeWindow)

    /**
     * Sets the active Window. Only a Frame or a Dialog can be the active
     * Window. The native windowing system may denote the active Window or its
     * children with special decorations, such as a highlighted title bar. The
     * active Window is always either the focused Window, or the first Frame or
     * Dialog that is an owner of the focused Window.
     * <p>
     * This method does not actually change the active Window as far as the
     * native windowing system is concerned. It merely stores the value to be
     * subsequently returned by <code>getActiveWindow()</code>. Use
     * <code>Component.requestFocus()</code> or
     * <code>Component.requestFocusInWindow()</code>to change the active
     * Window, subject to platform limitations.
     *
     * @param activeWindow the active Window
     * @see #getActiveWindow
     * @see #getGlobalActiveWindow
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Window getGlobalActiveWindow() throws SecurityException {

    /**
     * Returns the active Window, even if the calling thread is in a different
     * context than the active Window. Only a Frame or a Dialog can be the
     * active Window. The native windowing system may denote the active Window
     * or its children with special decorations, such as a highlighted title
     * bar. The active Window is always either the focused Window, or the first
     * Frame or Dialog that is an owner of the focused Window.
     *
     * @return the active Window
     * @see #getActiveWindow
     * @see #setGlobalActiveWindow
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Window getActiveWindow() {

    /**
     * Returns the active Window, if the active Window is in the same context
     * as the calling thread. Only a Frame or a Dialog can be the active
     * Window. The native windowing system may denote the active Window or its
     * children with special decorations, such as a highlighted title bar.
     * The active Window is always either the focused Window, or the first
     * Frame or Dialog that is an owner of the focused Window.
     *
     * @return the active Window, or null if the active Window is not a member
     *         of the calling thread's context
     * @see #getGlobalActiveWindow
     * @see #setGlobalActiveWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalFocusedWindow(Window focusedWindow)

    /**
     * Sets the focused Window. The focused Window is the Window that is or
     * contains the focus owner. The operation will be cancelled if the
     * specified Window to focus is not a focusable Window.
     * <p>
     * This method does not actually change the focused Window as far as the
     * native windowing system is concerned. It merely stores the value to be
     * subsequently returned by <code>getFocusedWindow()</code>. Use
     * <code>Component.requestFocus()</code> or
     * <code>Component.requestFocusInWindow()</code> to change the focused
     * Window, subject to platform limitations.
     *
     * @param focusedWindow the focused Window
     * @see #getFocusedWindow
     * @see #getGlobalFocusedWindow
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @see Window#isFocusableWindow
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Window getGlobalFocusedWindow() throws SecurityException {

    /**
     * Returns the focused Window, even if the calling thread is in a different
     * context than the focused Window. The focused Window is the Window that
     * is or contains the focus owner.
     *
     * @return the focused Window
     * @see #getFocusedWindow
     * @see #setGlobalFocusedWindow
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Window getFocusedWindow() {

    /**
     * Returns the focused Window, if the focused Window is in the same context
     * as the calling thread. The focused Window is the Window that is or
     * contains the focus owner.
     *
     * @return the focused Window, or null if the focused Window is not a
     *         member of the calling thread's context
     * @see #getGlobalFocusedWindow
     * @see #setGlobalFocusedWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalPermanentFocusOwner(Component permanentFocusOwner)

    /**
     * Sets the permanent focus owner. The operation will be cancelled if the
     * Component is not focusable. The permanent focus owner is defined as the
     * last Component in an application to receive a permanent FOCUS_GAINED
     * event. The focus owner and permanent focus owner are equivalent unless
     * a temporary focus change is currently in effect. In such a situation,
     * the permanent focus owner will again be the focus owner when the
     * temporary focus change ends.
     * <p>
     * This method does not actually set the focus to the specified Component.
     * It merely stores the value to be subsequently returned by
     * <code>getPermanentFocusOwner()</code>. Use
     * <code>Component.requestFocus()</code> or
     * <code>Component.requestFocusInWindow()</code> to change the focus owner,
     * subject to platform limitations.
     *
     * @param permanentFocusOwner the permanent focus owner
     * @see #getPermanentFocusOwner
     * @see #getGlobalPermanentFocusOwner
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @see Component#isFocusable
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Component getGlobalPermanentFocusOwner()

    /**
     * Returns the permanent focus owner, even if the calling thread is in a
     * different context than the permanent focus owner. The permanent focus
     * owner is defined as the last Component in an application to receive a
     * permanent FOCUS_GAINED event. The focus owner and permanent focus owner
     * are equivalent unless a temporary focus change is currently in effect.
     * In such a situation, the permanent focus owner will again be the focus
     * owner when the temporary focus change ends.
     *
     * @return the permanent focus owner
     * @see #getPermanentFocusOwner
     * @see #setGlobalPermanentFocusOwner
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Component getPermanentFocusOwner() {

    /**
     * Returns the permanent focus owner, if the permanent focus owner is in
     * the same context as the calling thread. The permanent focus owner is
     * defined as the last Component in an application to receive a permanent
     * FOCUS_GAINED event. The focus owner and permanent focus owner are
     * equivalent unless a temporary focus change is currently in effect. In
     * such a situation, the permanent focus owner will again be the focus
     * owner when the temporary focus change ends.
     *
     * @return the permanent focus owner, or null if the permanent focus owner
     *         is not a member of the calling thread's context
     * @see #getGlobalPermanentFocusOwner
     * @see #setGlobalPermanentFocusOwner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void clearGlobalFocusOwner()

    /**
     * Clears the global focus owner at both the Java and native levels. If
     * there exists a focus owner, that Component will receive a permanent
     * FOCUS_LOST event. After this operation completes, the native windowing
     * system will discard all user-generated KeyEvents until the user selects
     * a new Component to receive focus, or a Component is given focus
     * explicitly via a call to <code>requestFocus()</code>. This operation
     * does not change the focused or active Windows.
     * <p>
     * If a SecurityManager is installed, the calling thread must be granted
     * the "replaceKeyboardFocusManager" AWTPermission. If this permission is
     * not granted, this method will throw a SecurityException, and the current
     * focus owner will not be cleared.
     * <p>
     * This method is intended to be used only by KeyboardFocusManager set as
     * current KeyboardFocusManager for the calling thread's context. It is not
     * for general client use.
     *
     * @see KeyboardFocusManager#clearFocusOwner
     * @see Component#requestFocus()
     * @see java.awt.event.FocusEvent#FOCUS_LOST
     * @throws SecurityException if the calling thread does not have
     *         "replaceKeyboardFocusManager" permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public void clearFocusOwner() {

    /**
     * Clears the focus owner at both the Java and native levels if the
     * focus owner exists and resides in the same context as the calling thread,
     * otherwise the method returns silently.
     * <p>
     * The focus owner component will receive a permanent FOCUS_LOST event.
     * After this operation completes, the native windowing system will discard
     * all user-generated KeyEvents until the user selects a new Component to
     * receive focus, or a Component is given focus explicitly via a call to
     * {@code requestFocus()}. This operation does not change the focused or
     * active Windows.
     *
     * @see Component#requestFocus()
     * @see java.awt.event.FocusEvent#FOCUS_LOST
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected void setGlobalFocusOwner(Component focusOwner)

    /**
     * Sets the focus owner. The operation will be cancelled if the Component
     * is not focusable. The focus owner is defined as the Component in an
     * application that will typically receive all KeyEvents generated by the
     * user. KeyEvents which map to the focus owner's focus traversal keys will
     * not be delivered if focus traversal keys are enabled for the focus
     * owner. In addition, KeyEventDispatchers may retarget or consume
     * KeyEvents before they reach the focus owner.
     * <p>
     * This method does not actually set the focus to the specified Component.
     * It merely stores the value to be subsequently returned by
     * <code>getFocusOwner()</code>. Use <code>Component.requestFocus()</code>
     * or <code>Component.requestFocusInWindow()</code> to change the focus
     * owner, subject to platform limitations.
     *
     * @param focusOwner the focus owner
     * @see #getFocusOwner
     * @see #getGlobalFocusOwner
     * @see Component#requestFocus()
     * @see Component#requestFocusInWindow()
     * @see Component#isFocusable
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    protected Component getGlobalFocusOwner() throws SecurityException {

    /**
     * Returns the focus owner, even if the calling thread is in a different
     * context than the focus owner. The focus owner is defined as the
     * Component in an application that will typically receive all KeyEvents
     * generated by the user. KeyEvents which map to the focus owner's focus
     * traversal keys will not be delivered if focus traversal keys are enabled
     * for the focus owner. In addition, KeyEventDispatchers may retarget or
     * consume KeyEvents before they reach the focus owner.
     * <p>
     * This method will throw a SecurityException if this KeyboardFocusManager
     * is not the current KeyboardFocusManager for the calling thread's
     * context.
     *
     * @return the focus owner
     * @see #getFocusOwner
     * @see #setGlobalFocusOwner
     * @throws SecurityException if this KeyboardFocusManager is not the
     *         current KeyboardFocusManager for the calling thread's context
     *         and if the calling thread does not have "replaceKeyboardFocusManager"
     *         permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public Component getFocusOwner() {

    /**
     * Returns the focus owner, if the focus owner is in the same context as
     * the calling thread. The focus owner is defined as the Component in an
     * application that will typically receive all KeyEvents generated by the
     * user. KeyEvents which map to the focus owner's focus traversal keys will
     * not be delivered if focus traversal keys are enabled for the focus
     * owner. In addition, KeyEventDispatchers may retarget or consume
     * KeyEvents before they reach the focus owner.
     *
     * @return the focus owner, or null if the focus owner is not a member of
     *         the calling thread's context
     * @see #getGlobalFocusOwner
     * @see #setGlobalFocusOwner
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public KeyboardFocusManager() {

    /**
     * Initializes a KeyboardFocusManager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static AWTPermission replaceKeyboardFocusManagerPermission;

    /**
     * We cache the permission used to verify that the calling thread is
     * permitted to access the global focus state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static java.util.Map<Window, WeakReference<Component>> mostRecentFocusOwners = new WeakHashMap<>();

    /**
     * Maps Windows to those Windows' most recent focus owners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private java.util.LinkedList<KeyEventPostProcessor> keyEventPostProcessors;

    /**
     * This KeyboardFocusManager's KeyEventPostProcessor chain. The List does
     * not include this KeyboardFocusManager unless it was explicitly
     * re-registered via a call to <code>addKeyEventPostProcessor</code>.
     * If no other KeyEventPostProcessors are registered, this field may be
     * null or refer to a List of length 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private java.util.LinkedList<KeyEventDispatcher> keyEventDispatchers;

    /**
     * This KeyboardFocusManager's KeyEventDispatcher chain. The List does not
     * include this KeyboardFocusManager unless it was explicitly re-registered
     * via a call to <code>addKeyEventDispatcher</code>. If no other
     * KeyEventDispatchers are registered, this field may be null or refer to
     * a List of length 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private PropertyChangeSupport changeSupport;

    /**
     * A description of any PropertyChangeListeners which have been registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private VetoableChangeSupport vetoableSupport;

    /**
     * A description of any VetoableChangeListeners which have been registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Container currentFocusCycleRoot;

    /**
     * The current focus cycle root. If the focus owner is itself a focus cycle
     * root, then it may be ambiguous as to which Components represent the next
     * and previous Components to focus during normal focus traversal. In that
     * case, the current focus cycle root is used to differentiate among the
     * possibilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private Set<AWTKeyStroke>[] defaultFocusTraversalKeys = new Set[4];

    /**
     * The default focus traversal keys. Each array of traversal keys will be
     * in effect on all Windows that have no such array of their own explicitly
     * set. Each array will also be inherited, recursively, by any child
     * Component of those Windows that has no such array of its own explicitly
     * set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static final AWTKeyStroke[][] defaultFocusTraversalKeyStrokes = {

    /**
     * The default strokes for initializing the default focus traversal keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static final String[] defaultFocusTraversalKeyPropertyNames = {

    /**
     * The bound property names of each focus traversal key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private FocusTraversalPolicy defaultPolicy =

    /**
     * The default FocusTraversalPolicy for all Windows that have no policy of
     * their own set. If those Windows have focus-cycle-root children that have
     * no keyboard-traversal policy of their own, then those children will also
     * inherit this policy (as will, recursively, their focus-cycle-root
     * children).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Window activeWindow;

    /**
     * Only a Frame or a Dialog can be the active Window. The native windowing
     * system may denote the active Window with a special decoration, such as a
     * highlighted title bar. The active Window is always either the focused
     * Window, or the first Frame or Dialog which is an owner of the focused
     * Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Window focusedWindow;

    /**
     * The Window which is, or contains, the focus owner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Component permanentFocusOwner;

    /**
     * The Component in an application that will regain focus when an
     * outstanding temporary focus transfer has completed, or the focus owner,
     * if no outstanding temporary transfer exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static Component focusOwner;

    /**
     * The Component in an application that will typically receive all
     * KeyEvents generated by the user.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static void setCurrentKeyboardFocusManager(
        KeyboardFocusManager newManager) throws SecurityException

    /**
     * Sets the current KeyboardFocusManager instance for the calling thread's
     * context. If null is specified, then the current KeyboardFocusManager
     * is replaced with a new instance of DefaultKeyboardFocusManager.
     * <p>
     * If a SecurityManager is installed, the calling thread must be granted
     * the AWTPermission "replaceKeyboardFocusManager" in order to replace the
     * the current KeyboardFocusManager. If this permission is not granted,
     * this method will throw a SecurityException, and the current
     * KeyboardFocusManager will be unchanged.
     *
     * @param newManager the new KeyboardFocusManager for this thread's context
     * @see #getCurrentKeyboardFocusManager
     * @see DefaultKeyboardFocusManager
     * @throws SecurityException if the calling thread does not have permission
     *         to replace the current KeyboardFocusManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static KeyboardFocusManager getCurrentKeyboardFocusManager() {

    /**
     * Returns the current KeyboardFocusManager instance for the calling
     * thread's context.
     *
     * @return this thread's context's KeyboardFocusManager
     * @see #setCurrentKeyboardFocusManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int DOWN_CYCLE_TRAVERSAL_KEYS = 3;

    /**
     * The identifier for the Down Cycle focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int UP_CYCLE_TRAVERSAL_KEYS = 2;

    /**
     * The identifier for the Up Cycle focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int BACKWARD_TRAVERSAL_KEYS = 1;

    /**
     * The identifier for the Backward focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    public static final int FORWARD_TRAVERSAL_KEYS = 0;

    /**
     * The identifier for the Forward focus traversal keys.
     *
     * @see #setDefaultFocusTraversalKeys
     * @see #getDefaultFocusTraversalKeys
     * @see Component#setFocusTraversalKeys
     * @see Component#getFocusTraversalKeys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/KeyboardFocusManager.java
public abstract class KeyboardFocusManager

/**
 * The KeyboardFocusManager is responsible for managing the active and focused
 * Windows, and the current focus owner. The focus owner is defined as the
 * Component in an application that will typically receive all KeyEvents
 * generated by the user. The focused Window is the Window that is, or
 * contains, the focus owner. Only a Frame or a Dialog can be the active
 * Window. The native windowing system may denote the active Window or its
 * children with special decorations, such as a highlighted title bar. The
 * active Window is always either the focused Window, or the first Frame or
 * Dialog that is an owner of the focused Window.
 * <p>
 * The KeyboardFocusManager is both a centralized location for client code to
 * query for the focus owner and initiate focus changes, and an event
 * dispatcher for all FocusEvents, WindowEvents related to focus, and
 * KeyEvents.
 * <p>
 * Some browsers partition applets in different code bases into separate
 * contexts, and establish walls between these contexts. In such a scenario,
 * there will be one KeyboardFocusManager per context. Other browsers place all
 * applets into the same context, implying that there will be only a single,
 * global KeyboardFocusManager for all applets. This behavior is
 * implementation-dependent. Consult your browser's documentation for more
 * information. No matter how many contexts there may be, however, there can
 * never be more than one focus owner, focused Window, or active Window, per
 * ClassLoader.
 * <p>
 * Please see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/focus.html">
 * How to Use the Focus Subsystem</a>,
 * a section in <em>The Java Tutorial</em>, and the
 * <a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
 * for more information.
 *
 * @author David Mendenhall
 *
 * @see Window
 * @see Frame
 * @see Dialog
 * @see java.awt.event.FocusEvent
 * @see java.awt.event.WindowEvent
 * @see java.awt.event.KeyEvent
 * @since 1.4
 */
