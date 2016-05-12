_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public String getString(SynthContext context, Object key,
                              String defaultValue) {

    /**
     * Convenience method to get a specific style property whose value is
     * a String.
     *
     * @param context SynthContext identifying requester
     * @param key Property being requested.
     * @param defaultValue Value to return if the property has not been
     *        specified, or is not a String
     * @return Value of the named property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public Icon getIcon(SynthContext context, Object key) {

    /**
     * Convenience method to get a specific style property whose value is
     * an Icon.
     *
     * @param context SynthContext identifying requester
     * @param key Property being requested.
     * @return Value of the named property, or null if not specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public boolean getBoolean(SynthContext context, Object key,
                              boolean defaultValue) {

    /**
     * Convenience method to get a specific style property whose value is
     * an Boolean.
     *
     * @param context SynthContext identifying requester
     * @param key Property being requested.
     * @param defaultValue Value to return if the property has not been
     *        specified, or is not a Boolean
     * @return Value of the named property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public int getInt(SynthContext context, Object key, int defaultValue) {

    /**
     * Convenience method to get a specific style property whose value is
     * a <code>Number</code>. If the value is a <code>Number</code>,
     * <code>intValue</code> is returned, otherwise <code>defaultValue</code>
     * is returned.
     *
     * @param context SynthContext identifying requester
     * @param key Property being requested.
     * @param defaultValue Value to return if the property has not been
     *        specified, or is not a Number
     * @return Value of the named property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public void uninstallDefaults(SynthContext context) {

    /**
     * Uninstalls any state that this style installed on
     * the <code>JComponent</code> from <code>context</code>.
     * <p>
     * Styles should NOT depend upon this being called, in certain cases
     * it may never be called.
     *
     * @param context SynthContext identifying component to install properties
     *        to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public void installDefaults(SynthContext context) {

    /**
     * Installs the necessary state from this Style on the
     * <code>JComponent</code> from <code>context</code>.
     *
     * @param context SynthContext identifying component to install properties
     *        to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public Object get(SynthContext context, Object key) {

    /**
     * Getter for a region specific style property.
     *
     * @param context SynthContext identifying requester
     * @param key Property being requested.
     * @return Value of the named property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public boolean isOpaque(SynthContext context) {

    /**
     * Returns true if the region is opaque.
     *
     * @param context SynthContext identifying requester
     * @return true if region is opaque.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public SynthPainter getPainter(SynthContext context) {

    /**
     * Returns the <code>SynthPainter</code> that will be used for painting.
     * This may return null.
     *
     * @param context SynthContext identifying requester
     * @return SynthPainter to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public Insets getInsets(SynthContext context, Insets insets) {

    /**
     * Returns the Insets that are used to calculate sizing information.
     *
     * @param context SynthContext identifying requester
     * @param insets Insets to place return value in.
     * @return Sizing Insets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    protected abstract Font getFontForState(SynthContext context);

    /**
     * Returns the font for the specified state. This should NOT call any
     * method on the <code>JComponent</code>.
     *
     * @param context SynthContext identifying requester
     * @return Font to render with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public Font getFont(SynthContext context) {

    /**
     * Returns the Font for the specified state. This redirects to the
     * <code>JComponent</code> from the <code>context</code> as necessary.
     * If this does not redirect
     * to the JComponent {@link #getFontForState} is invoked.
     *
     * @param context SynthContext identifying requester
     * @return Font to render with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    protected abstract Color getColorForState(SynthContext context,
                                              ColorType type);

    /**
     * Returns the color for the specified state. This should NOT call any
     * methods on the <code>JComponent</code>.
     *
     * @param context SynthContext identifying requester
     * @param type Type of color being requested.
     * @return Color to render with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public Color getColor(SynthContext context, ColorType type) {

    /**
     * Returns the color for the specified state. This gives precedence to
     * foreground and background of the <code>JComponent</code>. If the
     * <code>Color</code> from the <code>JComponent</code> is not appropriate,
     * or not used, this will invoke <code>getColorForState</code>. Subclasses
     * should generally not have to override this, instead override
     * {@link #getColorForState}.
     *
     * @param context SynthContext identifying requester
     * @param type Type of color being requested.
     * @return Color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public SynthGraphicsUtils getGraphicsUtils(SynthContext context) {

    /**
     * Returns the <code>SynthGraphicUtils</code> for the specified context.
     *
     * @param context SynthContext identifying requester
     * @return SynthGraphicsUtils
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    public SynthStyle() {

    /**
     * Constructs a SynthStyle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    private static Object getDefaultValue(Object key) {

    /**
     * Returns the default value for the specified property, or null if there
     * is no default for the specified value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    private static void populateDefaultValues() {

    /**
     * Adds the default values that we know about to DEFAULT_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
    private static final SynthGraphicsUtils SYNTH_GRAPHICS =

    /**
     * Shared SynthGraphics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthStyle.java
public abstract class SynthStyle {

/**
 * <code>SynthStyle</code> is a set of style properties.
 * Each <code>SynthUI</code> references at least one
 * <code>SynthStyle</code> that is obtained using a
 * <code>SynthStyleFactory</code>. You typically don't need to interact with
 * this class directly, rather you will load a
 * <a href="doc-files/synthFileFormat.html">Synth File Format file</a> into
 * <code>SynthLookAndFeel</code> that will create a set of SynthStyles.
 *
 * @see SynthLookAndFeel
 * @see SynthStyleFactory
 *
 * @since 1.5
 * @author Scott Violet
 */
