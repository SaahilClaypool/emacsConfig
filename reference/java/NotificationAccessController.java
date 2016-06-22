_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/NotificationAccessController.java
    public void fetchNotification(String connectionId,
                                  ObjectName name,
                                  Notification notification,
                                  Subject subject)

    /**
     * This method is called before the
     * {@link javax.management.remote.JMXConnectorServer}
     * forwards the notification to the interested remote
     * listener represented by the authenticated subject.
     *
     * @param connectionId the {@code connectionId} of the remote client
     * receiving the notification.
     * @param name the name of the MBean forwarding the notification.
     * @param notification the notification to be forwarded to the interested
     * remote listener.
     * @param subject the authenticated subject representing the remote client.
     *
     * @throws SecurityException if the remote client with
     * the supplied authenticated subject does not have the
     * rights to receive the notification.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/NotificationAccessController.java
    public void removeNotificationListener(String connectionId,
                                           ObjectName name,
                                           Subject subject)

    /**
     * This method is called when a remote
     * {@link javax.management.remote.JMXConnector} invokes the method
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(ObjectName,NotificationListener)}
     * or the method
     * {@link javax.management.MBeanServerConnection#removeNotificationListener(ObjectName,NotificationListener,NotificationFilter,Object)}.
     *
     * @param connectionId the {@code connectionId} of the remote client
     * removing the listener.
     * @param name the name of the MBean where the listener is to be removed.
     * @param subject the authenticated subject representing the remote client.
     *
     * @throws SecurityException if the remote client with the supplied
     * authenticated subject does not have the rights to remove a listener
     * from the supplied MBean.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/NotificationAccessController.java
    public void addNotificationListener(String connectionId,
                                        ObjectName name,
                                        Subject subject)

    /**
     * This method is called when a remote
     * {@link javax.management.remote.JMXConnector} invokes the method
     * {@link javax.management.MBeanServerConnection#addNotificationListener(ObjectName,NotificationListener,NotificationFilter,Object)}.
     *
     * @param connectionId the {@code connectionId} of the remote client
     * adding the listener.
     * @param name the name of the MBean where the listener is to be added.
     * @param subject the authenticated subject representing the remote client.
     *
     * @throws SecurityException if the remote client with the supplied
     * authenticated subject does not have the rights to add a listener
     * to the supplied MBean.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/NotificationAccessController.java
public interface NotificationAccessController {

/**
 * <p>This interface allows to control remote access to the
 * {@code addNotificationListener} and {@code removeNotificationListener}
 * methods when the notification listener parameter is of type
 * {@code NotificationListener} and also allows to control remote access
 * to the notifications being forwarded to the interested remote listeners.</p>
 *
 * <p>An implementation of this interface can be supplied to a
 * {@code JMXConnectorServer} in the environment map through the
 * {@code com.sun.jmx.remote.notification.access.controller}
 * environment map property.</p>
 *
 * @since 1.6
 */