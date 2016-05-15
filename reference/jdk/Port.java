_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public final String toString() {

        /**
         * Provides a <code>String</code> representation
         * of the port.
         * @return  a string that describes the port
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public final int hashCode() {

        /**
         * Finalizes the hashCode method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public final boolean equals(Object obj) {

        /**
         * Finalizes the equals method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public boolean matches(Line.Info info) {

        /**
         * Indicates whether this info object specified matches this one.
         * To match, the match requirements of the superclass must be
         * met and the types must be equal.
         * @param info the info object for which the match is queried
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public boolean isSource() {

        /**
         * Indicates whether the port is a source or a target for its mixer.
         * @return <code>true</code> if the port is a source port (such
         * as a microphone), <code>false</code> if the port is a target port
         * (such as a speaker).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public String getName() {

        /**
         * Obtains the name of the port.
         * @return the string that names the port
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public Info(Class<?> lineClass, String name, boolean isSource) {

        /**
         * Constructs a port's info object from the information given.
         * This constructor is typically used by an implementation
         * of Java Sound to describe a supported line.
         *
         * @param lineClass the class of the port described by the info object.
         * @param name the string that names the port
         * @param isSource <code>true</code> if the port is a source port (such
         * as a microphone), <code>false</code> if the port is a target port
         * (such as a speaker).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public static final Info LINE_OUT = new Info(Port.class,"LINE_OUT", false);

        /**
         * A type of port that sends audio to a line-level audio output jack.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public static final Info HEADPHONE = new Info(Port.class,"HEADPHONE", false);

        /**
         * A type of port that sends audio to a headphone jack.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public static final Info SPEAKER = new Info(Port.class,"SPEAKER", false);

        /**
         * A type of port that sends audio to a built-in speaker or a speaker jack.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public static final Info COMPACT_DISC = new Info(Port.class,"COMPACT_DISC", true);

        /**
         * A type of port that gets audio from a CD-ROM drive.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public static final Info LINE_IN = new Info(Port.class,"LINE_IN", true);

        /**
         * A type of port that gets audio from a line-level audio input jack.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
        public static final Info MICROPHONE = new Info(Port.class,"MICROPHONE", true);

        /**
         * A type of port that gets audio from a built-in microphone or a microphone jack.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
    public static class Info extends Line.Info {

    /**
     * The <code>Port.Info</code> class extends <code>{@link Line.Info}</code>
     * with additional information specific to ports, including the port's name
     * and whether it is a source or a target for its mixer.
     * By definition, a port acts as either a source or a target to its mixer,
     * but not both.  (Audio input ports are sources; audio output ports are targets.)
     * <p>
     * To learn what ports are available, you can retrieve port info objects through the
     * <code>{@link Mixer#getSourceLineInfo getSourceLineInfo}</code> and
     * <code>{@link Mixer#getTargetLineInfo getTargetLineInfo}</code>
     * methods of the <code>Mixer</code> interface.  Instances of the
     * <code>Port.Info</code> class may also be constructed and used to obtain
     * lines matching the parameters specified in the <code>Port.Info</code> object.
     *
     * @author Kara Kytle
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Port.java
public interface Port extends Line {

/**
 * Ports are simple lines for input or output of audio to or from audio devices.
 * Common examples of ports that act as source lines (mixer inputs) include the microphone,
 * line input, and CD-ROM drive.  Ports that act as target lines (mixer outputs) include the
 * speaker, headphone, and line output.  You can access port using a <code>{@link Port.Info}</code>
 * object.
 *
 * @author Kara Kytle
 * @since 1.3
 */