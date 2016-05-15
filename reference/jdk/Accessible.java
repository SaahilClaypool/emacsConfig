_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/Accessible.java
    public AccessibleContext getAccessibleContext();

    /**
     * Returns the AccessibleContext associated with this object.  In most
     * cases, the return value should not be null if the object implements
     * interface Accessible.  If a component developer creates a subclass
     * of an object that implements Accessible, and that subclass
     * is not Accessible, the developer should override the
     * getAccessibleContext method to return null.
     * @return the AccessibleContext associated with this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/Accessible.java
public interface Accessible {

/**
 * Interface Accessible is the main interface for the accessibility package.
 * All components that support
 * the accessibility package must implement this interface.
 * It contains a single method, {@link #getAccessibleContext}, which
 * returns an instance of the class {@link AccessibleContext}.
 *
 * @author      Peter Korn
 * @author      Hans Muller
 * @author      Willie Walker
 */