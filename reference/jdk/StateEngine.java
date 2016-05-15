_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public FSM makeFSM( State startState ) throws IllegalStateException ;

        /** Create an instance of a FSM that uses this state engine.
        * The initial state of the FSM will be the stateState specified
        * here.  This method can only be called after done().  An attempt
        * to call it before done results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public void done() throws IllegalStateException ;

        /** Called after all transitions have been added to the state engine.
        * This provides an opportunity for the implementation to optimize
        * its representation before the state engine is used.  This method
        * may only be called once.  An attempt to call it more than once
        * results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public void setDefaultAction( Action act ) throws IllegalStateException ;

        /** Set the default action used in this state engine.  This is the
        * action that is called whenever there is no applicable transition.
        * Normally this would simply flag an error.  This method can only
        * be called before done().  An attempt to
        * call it after done() results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine setDefault( State oldState )

        /** Euaivalent to setDefault( oldState, oldState )
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine setDefault( State oldState, State newState )

        /** Equivalent to setDefault( oldState, act, newState ) where act is an
         * action that does nothing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine setDefault( State oldState, Action action, State newState )

        /** Set the default transition and action for a state.
        * This transition will be used if no more specific transition was
        * defined for the actual input.  Repeated calls to this method
        * simply change the default.
        * This method can only be called before done().  An attempt to
        * call it after done() results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine add( State oldState, Input input,
            Action action, State newState ) throws IllegalStateException ;

        /** Add a transition with a guard that always evaluates to true.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine add( State oldState, Input input, Guard guard,
            Action action, State newState ) throws IllegalStateException ;

        /** Add a new transition (old,in,guard,act,new) to the state engine.
        * Multiple calls to add with the same old and in are permitted,
        * in which case only a transition in which the guard evaluates to
        * true will be taken.  If no such transition is enabled, a default
        * will be taken.  If more than one transition is enabled, one will
        * be chosen arbitrarily.
        * This method can only be called before done().  An attempt to
        * call it after done() results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
public interface StateEngine

/**
 * A StateEngine defines the state transition function for a
 * finite state machine (FSM). A FSM always has a current state.
 * In response to an Input, the FSM performs an Action and
 * makes a transition to a new state.  Note that any object can
 * be used as an input if it supports the Input interface.
 * For example, a protocol message may be an input.  The FSM
 * uses only the result of calling getLabel on the Input to
 * drive the transition.
 * <p>
 * The function can be non-deterministic
 * in that the same input may cause transitions to different new
 * states from the current state.  In this case, the action that
 * is executed for the transition must set the correct new state.
 *
 * @author Ken Cavanaugh
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public FSM makeFSM( State startState ) throws IllegalStateException ;

        /** Create an instance of a FSM that uses this state engine.
        * The initial state of the FSM will be the stateState specified
        * here.  This method can only be called after done().  An attempt
        * to call it before done results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public void done() throws IllegalStateException ;

        /** Called after all transitions have been added to the state engine.
        * This provides an opportunity for the implementation to optimize
        * its representation before the state engine is used.  This method
        * may only be called once.  An attempt to call it more than once
        * results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public void setDefaultAction( Action act ) throws IllegalStateException ;

        /** Set the default action used in this state engine.  This is the
        * action that is called whenever there is no applicable transition.
        * Normally this would simply flag an error.  This method can only
        * be called before done().  An attempt to
        * call it after done() results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine setDefault( State oldState )

        /** Euaivalent to setDefault( oldState, oldState )
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine setDefault( State oldState, State newState )

        /** Equivalent to setDefault( oldState, act, newState ) where act is an
         * action that does nothing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine setDefault( State oldState, Action action, State newState )

        /** Set the default transition and action for a state.
        * This transition will be used if no more specific transition was
        * defined for the actual input.  Repeated calls to this method
        * simply change the default.
        * This method can only be called before done().  An attempt to
        * call it after done() results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine add( State oldState, Input input,
            Action action, State newState ) throws IllegalStateException ;

        /** Add a transition with a guard that always evaluates to true.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
        public StateEngine add( State oldState, Input input, Guard guard,
            Action action, State newState ) throws IllegalStateException ;

        /** Add a new transition (old,in,guard,act,new) to the state engine.
        * Multiple calls to add with the same old and in are permitted,
        * in which case only a transition in which the guard evaluates to
        * true will be taken.  If no such transition is enabled, a default
        * will be taken.  If more than one transition is enabled, one will
        * be chosen arbitrarily.
        * This method can only be called before done().  An attempt to
        * call it after done() results in an IllegalStateException.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/StateEngine.java
public interface StateEngine

/**
 * A StateEngine defines the state transition function for a
 * finite state machine (FSM). A FSM always has a current state.
 * In response to an Input, the FSM performs an Action and
 * makes a transition to a new state.  Note that any object can
 * be used as an input if it supports the Input interface.
 * For example, a protocol message may be an input.  The FSM
 * uses only the result of calling getLabel on the Input to
 * drive the transition.
 * <p>
 * The function can be non-deterministic
 * in that the same input may cause transitions to different new
 * states from the current state.  In this case, the action that
 * is executed for the transition must set the correct new state.
 *
 * @author Ken Cavanaugh
 */