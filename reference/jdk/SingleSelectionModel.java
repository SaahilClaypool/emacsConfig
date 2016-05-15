_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/SingleSelectionModel.java
    void removeChangeListener(ChangeListener listener);

    /**
     * Removes <I>listener</I> as a listener to changes in the model.
     * @param listener the ChangeListener to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/SingleSelectionModel.java
    void addChangeListener(ChangeListener listener);

    /**
     * Adds <I>listener</I> as a listener to changes in the model.
     * @param listener the ChangeListener to add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/SingleSelectionModel.java
    public boolean isSelected();

    /**
     * Returns true if the selection model currently has a selected value.
     * @return true if a value is currently selected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/SingleSelectionModel.java
    public void clearSelection();

    /**
     * Clears the selection (to -1).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/SingleSelectionModel.java
    public void setSelectedIndex(int index);

    /**
     * Sets the model's selected index to <I>index</I>.
     *
     * Notifies any listeners if the model changes
     *
     * @param index an int specifying the model selection
     * @see   #getSelectedIndex
     * @see   #addChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/SingleSelectionModel.java
public interface SingleSelectionModel {

/**
 * A model that supports at most one indexed selection.
 *
 * @author Dave Moore
 */