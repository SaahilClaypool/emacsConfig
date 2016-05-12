_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum accessible value of this object.
         *
         * @return The maximum value of this object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum accessible value of this object.
         *
         * @return The minimum value of this object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @return True if the value was set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the accessible value of this object.
         *
         * @return The current value of this object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Get the AccessibleValue associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleValue interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state set of this object.
         *
         * @return an instance of AccessibleState containing the current state
         * of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected class AccessibleJSlider extends AccessibleJComponent

    /**
     * This class implements accessibility support for the
     * <code>JSlider</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to slider user-interface elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JSlider.
     * For sliders, the AccessibleContext takes the form of an
     * AccessibleJSlider.
     * A new AccessibleJSlider instance is created if necessary.
     *
     * @return an AccessibleJSlider that serves as the
     *         AccessibleContext of this JSlider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected String paramString() {

    /**
     * Returns a string representation of this JSlider. This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this JSlider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See readObject() and writeObject() in JComponent for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setPaintLabels(boolean b) {

    /**
     * Determines whether labels are painted on the slider.
     * <p>
     * This method will also set up a label table for you.
     * If there is not already a label table, and the major tick spacing is
     * {@code > 0},
     * a standard label table will be generated (by calling
     * {@code createStandardLabels}) with labels at the major tick marks.
     * The label table is then set on the slider by calling
     * {@code setLabelTable}.
     * <p>
     * By default, this property is {@code false}.
     *
     * @param  b  whether or not to paint labels
     * @see #getPaintLabels
     * @see #getLabelTable
     * @see #createStandardLabels(int)
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: If true labels are painted on the slider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public boolean getPaintLabels() {

    /**
     * Tells if labels are to be painted.
     * @return true if labels are painted, else false
     * @see #setPaintLabels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setPaintTrack(boolean b) {

    /**
     * Determines whether the track is painted on the slider.
     * By default, this property is {@code true}.
     *
     * @param  b  whether or not to paint the slider track
     * @see #getPaintTrack
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: If true, the track is painted on the slider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public boolean getPaintTrack() {

    /**
     * Tells if the track (area the slider slides in) is to be painted.
     * @return true if track is painted, else false
     * @see #setPaintTrack
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setPaintTicks(boolean b) {

    /**
     * Determines whether tick marks are painted on the slider.
     * By default, this property is {@code false}.
     *
     * @param  b  whether or not tick marks should be painted
     * @see #getPaintTicks
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: If true tick marks are painted on the slider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public boolean getPaintTicks() {

    /**
     * Tells if tick marks are to be painted.
     * @return true if tick marks are painted, else false
     * @see #setPaintTicks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    void setSnapToValue(boolean b) {

    /**
     * Specifying true makes the knob (and the data value it represents)
     * resolve to the closest slider value next to where the user
     * positioned the knob. If the {@code snapToTicks} property has also been
     * set to {@code true}, the snap-to-ticks behavior will prevail.
     * By default, the snapToValue property is {@code true}.
     *
     * @param b  true to snap the knob to the nearest slider value
     * @see #getSnapToValue
     * @see #setSnapToTicks
     * @beaninfo
     *       bound: true
     * description: If true snap the knob to the nearest slider value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setSnapToTicks(boolean b) {

    /**
     * Specifying true makes the knob (and the data value it represents)
     * resolve to the closest tick mark next to where the user
     * positioned the knob.
     * By default, this property is {@code false}.
     *
     * @param b  true to snap the knob to the nearest tick mark
     * @see #getSnapToTicks
     * @beaninfo
     *       bound: true
     * description: If true snap the knob to the nearest tick mark.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    boolean getSnapToValue() {

    /**
     * Returns true if the knob (and the data value it represents)
     * resolve to the closest slider value next to where the user
     * positioned the knob.
     *
     * @return true if the value snaps to the nearest slider value, else false
     * @see #setSnapToValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public boolean getSnapToTicks() {

    /**
     * Returns true if the knob (and the data value it represents)
     * resolve to the closest tick mark next to where the user
     * positioned the knob.
     *
     * @return true if the value snaps to the nearest tick mark, else false
     * @see #setSnapToTicks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setMinorTickSpacing(int n) {

    /**
     * This method sets the minor tick spacing.  The number that is passed in
     * represents the distance, measured in values, between each minor tick mark.
     * If you have a slider with a range from 0 to 50 and the minor tick spacing
     * is set to 10, you will get minor ticks next to the following values:
     * 0, 10, 20, 30, 40, 50.
     * <p>
     * In order for minor ticks to be painted, {@code setPaintTicks} must be
     * set to {@code true}.
     *
     * @param  n  new value for the {@code minorTickSpacing} property
     * @see #getMinorTickSpacing
     * @see #setPaintTicks
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Sets the number of values between minor tick marks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public int getMinorTickSpacing() {

    /**
     * This method returns the minor tick spacing.  The number that is returned
     * represents the distance, measured in values, between each minor tick mark.
     * If you have a slider with a range from 0 to 50 and the minor tick spacing
     * is set to 10, you will get minor ticks next to the following values:
     * 0, 10, 20, 30, 40, 50.
     *
     * @return the number of values between minor ticks
     * @see #getMinorTickSpacing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setMajorTickSpacing(int n) {

    /**
     * This method sets the major tick spacing.  The number that is passed in
     * represents the distance, measured in values, between each major tick mark.
     * If you have a slider with a range from 0 to 50 and the major tick spacing
     * is set to 10, you will get major ticks next to the following values:
     * 0, 10, 20, 30, 40, 50.
     * <p>
     * In order for major ticks to be painted, {@code setPaintTicks} must be
     * set to {@code true}.
     * <p>
     * This method will also set up a label table for you.
     * If there is not already a label table, and the major tick spacing is
     * {@code > 0}, and {@code getPaintLabels} returns
     * {@code true}, a standard label table will be generated (by calling
     * {@code createStandardLabels}) with labels at the major tick marks.
     * For the example above, you would get text labels: "0",
     * "10", "20", "30", "40", "50".
     * The label table is then set on the slider by calling
     * {@code setLabelTable}.
     *
     * @param  n  new value for the {@code majorTickSpacing} property
     * @see #getMajorTickSpacing
     * @see #setPaintTicks
     * @see #setLabelTable
     * @see #createStandardLabels(int)
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Sets the number of values between major tick marks.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public int getMajorTickSpacing() {

    /**
     * This method returns the major tick spacing.  The number that is returned
     * represents the distance, measured in values, between each major tick mark.
     * If you have a slider with a range from 0 to 50 and the major tick spacing
     * is set to 10, you will get major ticks next to the following values:
     * 0, 10, 20, 30, 40, 50.
     *
     * @return the number of values between major ticks
     * @see #setMajorTickSpacing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setInverted( boolean b ) {

    /**
     * Specify true to reverse the value-range shown for the slider and false to
     * put the value range in the normal order.  The order depends on the
     * slider's <code>ComponentOrientation</code> property.  Normal (non-inverted)
     * horizontal sliders with a <code>ComponentOrientation</code> value of
     * <code>LEFT_TO_RIGHT</code> have their maximum on the right.
     * Normal horizontal sliders with a <code>ComponentOrientation</code> value of
     * <code>RIGHT_TO_LEFT</code> have their maximum on the left.  Normal vertical
     * sliders have their maximum on the top.  These labels are reversed when the
     * slider is inverted.
     * <p>
     * By default, the value of this property is {@code false}.
     *
     * @param b  true to reverse the slider values from their normal order
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: If true reverses the slider values from their normal order
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public boolean getInverted() {

    /**
     * Returns true if the value-range shown for the slider is reversed,
     *
     * @return true if the slider values are reversed from their normal order
     * @see #setInverted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public Hashtable createStandardLabels( int increment, int start ) {

    /**
     * Creates a {@code Hashtable} of numerical text labels, starting at the
     * starting point specified, and using the increment specified.
     * For example, if you call
     * <code>createStandardLabels( 10, 2 )</code>,
     * then labels will be created for the values 2, 12, 22, 32, and so on.
     * <p>
     * For the labels to be drawn on the slider, the returned {@code Hashtable}
     * must be passed into {@code setLabelTable}, and {@code setPaintLabels}
     * must be set to {@code true}.
     * <p>
     * For further details on the makeup of the returned {@code Hashtable}, see
     * the {@code setLabelTable} documentation.
     *
     * @param  increment  distance between labels in the generated hashtable
     * @param  start      value at which the labels will begin
     * @return a new {@code Hashtable} of labels
     * @see #setLabelTable
     * @see #setPaintLabels
     * @exception IllegalArgumentException if {@code start} is
     *          out of range, or if {@code increment} is less than or equal
     *          to zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public Hashtable createStandardLabels( int increment ) {

    /**
     * Creates a {@code Hashtable} of numerical text labels, starting at the
     * slider minimum, and using the increment specified.
     * For example, if you call <code>createStandardLabels( 10 )</code>
     * and the slider minimum is zero,
     * then labels will be created for the values 0, 10, 20, 30, and so on.
     * <p>
     * For the labels to be drawn on the slider, the returned {@code Hashtable}
     * must be passed into {@code setLabelTable}, and {@code setPaintLabels}
     * must be set to {@code true}.
     * <p>
     * For further details on the makeup of the returned {@code Hashtable}, see
     * the {@code setLabelTable} documentation.
     *
     * @param  increment  distance between labels in the generated hashtable
     * @return a new {@code Hashtable} of labels
     * @see #setLabelTable
     * @see #setPaintLabels
     * @throws IllegalArgumentException if {@code increment} is less than or
     *          equal to zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected void updateLabelUIs() {

    /**
     * Updates the UIs for the labels in the label table by calling
     * {@code updateUI} on each label.  The UIs are updated from
     * the current look and feel.  The labels are also set to their
     * preferred size.
     *
     * @see #setLabelTable
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setLabelTable( Dictionary labels ) {

    /**
     * Used to specify what label will be drawn at any given value.
     * The key-value pairs are of this format:
     * <code>{ Integer value, java.swing.JComponent label }</code>.
     * <p>
     * An easy way to generate a standard table of value labels is by using the
     * {@code createStandardLabels} method.
     * <p>
     * Once the labels have been set, this method calls {@link #updateLabelUIs}.
     * Note that the labels are only painted if the {@code paintLabels}
     * property is {@code true}.
     *
     * @param labels new {@code Dictionary} of labels, or {@code null} to
     *        remove all labels
     * @see #createStandardLabels(int)
     * @see #getLabelTable
     * @see #setPaintLabels
     * @beaninfo
     *       hidden: true
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Specifies what labels will be drawn for any given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public Dictionary getLabelTable() {

    /**
     * Returns the dictionary of what labels to draw at which values.
     *
     * @return the <code>Dictionary</code> containing labels and
     *    where to draw them
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {

    /**
     * {@inheritDoc}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setFont(Font font) {

    /**
     * {@inheritDoc}
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setOrientation(int orientation)

    /**
     * Set the slider's orientation to either {@code SwingConstants.VERTICAL} or
     * {@code SwingConstants.HORIZONTAL}.
     *
     * @param orientation {@code HORIZONTAL} or {@code VERTICAL}
     * @throws IllegalArgumentException if orientation is not one of {@code VERTICAL}, {@code HORIZONTAL}
     * @see #getOrientation
     * @beaninfo
     *    preferred: true
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Set the scrollbars orientation to either VERTICAL or HORIZONTAL.
     *         enum: VERTICAL JSlider.VERTICAL
     *               HORIZONTAL JSlider.HORIZONTAL
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public int getOrientation() {

    /**
     * Return this slider's vertical or horizontal orientation.
     * @return {@code SwingConstants.VERTICAL} or
     *  {@code SwingConstants.HORIZONTAL}
     * @see #setOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setExtent(int extent) {

    /**
     * Sets the size of the range "covered" by the knob.  Most look
     * and feel implementations will change the value by this amount
     * if the user clicks on either side of the knob.  This method just
     * forwards the new extent value to the model.
     * <p>
     * The data model (an instance of {@code BoundedRangeModel})
     * handles any mathematical
     * issues arising from assigning faulty values.  See the
     * {@code BoundedRangeModel} documentation for details.
     * <p>
     * If the new extent value is different from the previous extent value,
     * all change listeners are notified.
     *
     * @param extent the new extent
     * @see   #getExtent
     * @see   BoundedRangeModel#setExtent
     * @beaninfo
     *      expert: true
     * description: Size of the range covered by the knob.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public int getExtent() {

    /**
     * Returns the "extent" from the <code>BoundedRangeModel</code>.
     * This represents the range of values "covered" by the knob.
     *
     * @return an int representing the extent
     * @see #setExtent
     * @see BoundedRangeModel#getExtent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setValueIsAdjusting(boolean b) {

    /**
     * Sets the model's {@code valueIsAdjusting} property.  Slider look and
     * feel implementations should set this property to {@code true} when
     * a knob drag begins, and to {@code false} when the drag ends.
     *
     * @param b the new value for the {@code valueIsAdjusting} property
     * @see   #getValueIsAdjusting
     * @see   BoundedRangeModel#setValueIsAdjusting
     * @beaninfo
     *      expert: true
     * description: True if the slider knob is being dragged.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public boolean getValueIsAdjusting() {

    /**
     * Returns the {@code valueIsAdjusting} property from the model.  For
     * details on how this is used, see the {@code setValueIsAdjusting}
     * documentation.
     *
     * @return the value of the model's {@code valueIsAdjusting} property
     * @see #setValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setMaximum(int maximum) {

    /**
     * Sets the slider's maximum value to {@code maximum}.  This method
     * forwards the new maximum value to the model.
     * <p>
     * The data model (an instance of {@code BoundedRangeModel})
     * handles any mathematical
     * issues arising from assigning faulty values.  See the
     * {@code BoundedRangeModel} documentation for details.
     * <p>
     * If the new maximum value is different from the previous maximum value,
     * all change listeners are notified.
     *
     * @param maximum  the new maximum
     * @see #getMaximum
     * @see #addChangeListener
     * @see BoundedRangeModel#setMaximum
     * @beaninfo
     *       bound: true
     *   preferred: true
     * description: The sliders maximum value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public int getMaximum() {

    /**
     * Returns the maximum value supported by the slider
     * from the <code>BoundedRangeModel</code>.
     *
     * @return the value of the model's maximum property
     * @see #setMaximum
     * @see BoundedRangeModel#getMaximum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setMinimum(int minimum) {

    /**
     * Sets the slider's minimum value to {@code minimum}.  This method
     * forwards the new minimum value to the model.
     * <p>
     * The data model (an instance of {@code BoundedRangeModel})
     * handles any mathematical
     * issues arising from assigning faulty values.  See the
     * {@code BoundedRangeModel} documentation for details.
     * <p>
     * If the new minimum value is different from the previous minimum value,
     * all change listeners are notified.
     *
     * @param minimum  the new minimum
     * @see #getMinimum
     * @see    #addChangeListener
     * @see BoundedRangeModel#setMinimum
     * @beaninfo
     *       bound: true
     *   preferred: true
     * description: The sliders minimum value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public int getMinimum() {

    /**
     * Returns the minimum value supported by the slider
     * from the <code>BoundedRangeModel</code>.
     *
     * @return the value of the model's minimum property
     * @see #setMinimum
     * @see     BoundedRangeModel#getMinimum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setValue(int n) {

    /**
     * Sets the slider's current value to {@code n}.  This method
     * forwards the new value to the model.
     * <p>
     * The data model (an instance of {@code BoundedRangeModel})
     * handles any mathematical
     * issues arising from assigning faulty values.  See the
     * {@code BoundedRangeModel} documentation for details.
     * <p>
     * If the new value is different from the previous value,
     * all change listeners are notified.
     *
     * @param   n       the new value
     * @see     #getValue
     * @see     #addChangeListener
     * @see     BoundedRangeModel#setValue
     * @beaninfo
     *   preferred: true
     * description: The sliders current value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public int getValue() {

    /**
     * Returns the slider's current value
     * from the {@code BoundedRangeModel}.
     *
     * @return  the current value of the slider
     * @see     #setValue
     * @see     BoundedRangeModel#getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setModel(BoundedRangeModel newModel)

    /**
     * Sets the {@code BoundedRangeModel} that handles the slider's three
     * fundamental properties: minimum, maximum, value.
     *<p>
     * Attempts to pass a {@code null} model to this method result in
     * undefined behavior, and, most likely, exceptions.
     *
     * @param  newModel the new, {@code non-null} <code>BoundedRangeModel</code> to use
     *
     * @see #getModel
     * @see    BoundedRangeModel
     * @beaninfo
     *       bound: true
     * description: The sliders BoundedRangeModel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public BoundedRangeModel getModel() {

    /**
     * Returns the {@code BoundedRangeModel} that handles the slider's three
     * fundamental properties: minimum, maximum, value.
     *
     * @return the data model for this component
     * @see #setModel
     * @see    BoundedRangeModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected void fireStateChanged() {

    /**
     * Send a {@code ChangeEvent}, whose source is this {@code JSlider}, to
     * all {@code ChangeListener}s that have registered interest in
     * {@code ChangeEvent}s.
     * This method is called each time a {@code ChangeEvent} is received from
     * the model.
     * <p>
     * The event instance is created if necessary, and stored in
     * {@code changeEvent}.
     *
     * @see #addChangeListener
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this JSlider with addChangeListener().
     *
     * @return all of the <code>ChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a ChangeListener from the slider.
     *
     * @param l the ChangeListener to remove
     * @see #fireStateChanged
     * @see #addChangeListener

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a ChangeListener to the slider.
     *
     * @param l the ChangeListener to add
     * @see #fireStateChanged
     * @see #removeChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected ChangeListener createChangeListener() {

    /**
     * Subclasses that want to handle {@code ChangeEvent}s
     * from the model differently
     * can override this to return
     * an instance of a custom <code>ChangeListener</code> implementation.
     * The default {@code ChangeListener} simply calls the
     * {@code fireStateChanged} method to forward {@code ChangeEvent}s
     * to the {@code ChangeListener}s that have been added directly to the
     * slider.
     * @see #changeListener
     * @see #fireStateChanged
     * @see javax.swing.event.ChangeListener
     * @see javax.swing.BoundedRangeModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    private class ModelListener implements ChangeListener, Serializable {

    /**
     * We pass Change events along to the listeners with the
     * the slider (instead of the model itself) as the event source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return "SliderUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public void setUI(SliderUI ui) {

    /**
     * Sets the UI object which implements the L&amp;F for this component.
     *
     * @param ui the SliderUI L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the slider's LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public SliderUI getUI() {

    /**
     * Gets the UI object which implements the L&amp;F for this component.
     *
     * @return the SliderUI object that implements the Slider L&amp;F
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public JSlider(BoundedRangeModel brm)

    /**
     * Creates a horizontal slider using the specified
     * BoundedRangeModel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public JSlider(int orientation, int min, int max, int value)

    /**
     * Creates a slider with the specified orientation and the
     * specified minimum, maximum, and initial values.
     * The orientation can be
     * either <code>SwingConstants.VERTICAL</code> or
     * <code>SwingConstants.HORIZONTAL</code>.
     * <p>
     * The <code>BoundedRangeModel</code> that holds the slider's data
     * handles any issues that may arise from improperly setting the
     * minimum, initial, and maximum values on the slider.  See the
     * {@code BoundedRangeModel} documentation for details.
     *
     * @param orientation  the orientation of the slider
     * @param min  the minimum value of the slider
     * @param max  the maximum value of the slider
     * @param value  the initial value of the slider
     *
     * @throws IllegalArgumentException if orientation is not one of {@code VERTICAL}, {@code HORIZONTAL}
     *
     * @see BoundedRangeModel
     * @see #setOrientation
     * @see #setMinimum
     * @see #setMaximum
     * @see #setValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public JSlider(int min, int max, int value) {

    /**
     * Creates a horizontal slider using the specified min, max and value.
     * <p>
     * The <code>BoundedRangeModel</code> that holds the slider's data
     * handles any issues that may arise from improperly setting the
     * minimum, initial, and maximum values on the slider.  See the
     * {@code BoundedRangeModel} documentation for details.
     *
     * @param min  the minimum value of the slider
     * @param max  the maximum value of the slider
     * @param value  the initial value of the slider
     *
     * @see BoundedRangeModel
     * @see #setMinimum
     * @see #setMaximum
     * @see #setValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public JSlider(int min, int max) {

    /**
     * Creates a horizontal slider using the specified min and max
     * with an initial value equal to the average of the min plus max.
     * <p>
     * The <code>BoundedRangeModel</code> that holds the slider's data
     * handles any issues that may arise from improperly setting the
     * minimum and maximum values on the slider.  See the
     * {@code BoundedRangeModel} documentation for details.
     *
     * @param min  the minimum value of the slider
     * @param max  the maximum value of the slider
     *
     * @see BoundedRangeModel
     * @see #setMinimum
     * @see #setMaximum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public JSlider(int orientation) {

    /**
     * Creates a slider using the specified orientation with the
     * range {@code 0} to {@code 100} and an initial value of {@code 50}.
     * The orientation can be
     * either <code>SwingConstants.VERTICAL</code> or
     * <code>SwingConstants.HORIZONTAL</code>.
     *
     * @param  orientation  the orientation of the slider
     * @throws IllegalArgumentException if orientation is not one of {@code VERTICAL}, {@code HORIZONTAL}
     * @see #setOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    public JSlider() {

    /**
     * Creates a horizontal slider with the range 0 to 100 and
     * an initial value of 50.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected transient ChangeEvent changeEvent = null;

    /**
     * Only one <code>ChangeEvent</code> is needed per slider instance since the
     * event's only (read-only) state is the source property.  The source
     * of events generated here is always "this". The event is lazily
     * created the first time that an event notification is fired.
     *
     * @see #fireStateChanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected ChangeListener changeListener = createChangeListener();

    /**
     * The changeListener (no suffix) is the listener we add to the
     * slider's model.  This listener is initialized to the
     * {@code ChangeListener} returned from {@code createChangeListener},
     * which by default just forwards events
     * to {@code ChangeListener}s (if any) added directly to the slider.
     *
     * @see #addChangeListener
     * @see #createChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    private Dictionary labelTable;

    /**
     * {@code Dictionary} of what labels to draw at which values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected int orientation;

    /**
     * Whether the slider is horizontal or vertical
     * The default is horizontal.
     *
     * @see #setOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    boolean snapToValue = true;

    /**
     * If true, the knob (and the data value it represents)
     * resolve to the closest slider value next to where the user
     * positioned the knob.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected boolean snapToTicks = false;

    /**
     * If true, the knob (and the data value it represents)
     * resolve to the closest tick mark next to where the user
     * positioned the knob.  The default is false.
     * @see #setSnapToTicks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected int minorTickSpacing;

    /**
     * The number of values between the minor tick marks -- the
     * smaller marks that occur between the major tick marks.
     * @see #setMinorTickSpacing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected int majorTickSpacing;

    /**
     * The number of values between the major tick marks -- the
     * larger marks that break up the minor tick marks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
    protected BoundedRangeModel sliderModel;

    /**
     * The data model that handles the numeric maximum value,
     * minimum value, and current-position value for the slider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSlider.java
public class JSlider extends JComponent implements SwingConstants, Accessible {

/**
 * A component that lets the user graphically select a value by sliding
 * a knob within a bounded interval. The knob is always positioned
 * at the points that match integer values within the specified interval.
 * <p>
 * The slider can show both
 * major tick marks, and minor tick marks between the major ones.  The number of
 * values between the tick marks is controlled with
 * <code>setMajorTickSpacing</code> and <code>setMinorTickSpacing</code>.
 * Painting of tick marks is controlled by {@code setPaintTicks}.
 * <p>
 * Sliders can also print text labels at regular intervals (or at
 * arbitrary locations) along the slider track.  Painting of labels is
 * controlled by {@code setLabelTable} and {@code setPaintLabels}.
 * <p>
 * For further information and examples see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/slider.html">How to Use Sliders</a>,
 * a section in <em>The Java Tutorial.</em>
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @beaninfo
 *      attribute: isContainer false
 *    description: A component that supports selecting a integer value from a range.
 *
 * @author David Kloba
 */
