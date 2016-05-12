_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    protected class AccessibleJFileChooser extends AccessibleJComponent {

    /**
     * This class implements accessibility support for the
     * <code>JFileChooser</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to file chooser user-interface
     * elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JFileChooser.
     * For file choosers, the AccessibleContext takes the form of an
     * AccessibleJFileChooser.
     * A new AccessibleJFileChooser instance is created if necessary.
     *
     * @return an AccessibleJFileChooser that serves as the
     *         AccessibleContext of this JFileChooser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JFileChooser</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JFileChooser</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    private void readObject(java.io.ObjectInputStream in)

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public FileChooserUI getUI() {

    /**
     * Gets the UI object which implements the L&amp;F for this component.
     *
     * @return the FileChooserUI object that implements the FileChooserUI L&amp;F
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public String getUIClassID() {

    /**
     * Returns a string that specifies the name of the L&amp;F class
     * that renders this component.
     *
     * @return the string "FileChooserUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     * @beaninfo
     *        expert: true
     *   description: A string that specifies the name of the L&amp;F class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    protected void fireActionPerformed(String command) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type. The event instance
     * is lazily created using the <code>command</code> parameter.
     *
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this file chooser.
     *
     * @return all of this file chooser's <code>ActionListener</code>s
     *         or an empty
     *         array if no action listeners are currently registered
     *
     * @see #addActionListener
     * @see #removeActionListener
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void removeActionListener(ActionListener l) {

    /**
     * Removes an <code>ActionListener</code> from the file chooser.
     *
     * @param l  the listener to be removed
     *
     * @see #addActionListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void addActionListener(ActionListener l) {

    /**
     * Adds an <code>ActionListener</code> to the file chooser.
     *
     * @param l  the listener to be added
     *
     * @see #approveSelection
     * @see #cancelSelection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void cancelSelection() {

    /**
     * Called by the UI when the user chooses the Cancel button.
     * This can also be called by the programmer.
     * This method causes an action event to fire
     * with the command string equal to
     * <code>CANCEL_SELECTION</code>.
     *
     * @see #CANCEL_SELECTION
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void approveSelection() {

    /**
     * Called by the UI when the user hits the Approve button
     * (labeled "Open" or "Save", by default). This can also be
     * called by the programmer.
     * This method causes an action event to fire
     * with the command string equal to
     * <code>APPROVE_SELECTION</code>.
     *
     * @see #APPROVE_SELECTION
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public FileSystemView getFileSystemView() {

    /**
     * Returns the file system view.
     * @return the <code>FileSystemView</code> object
     * @see #setFileSystemView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setFileSystemView(FileSystemView fsv) {

    /**
     * Sets the file system view that the <code>JFileChooser</code> uses for
     * accessing and creating file system resources, such as finding
     * the floppy drive and getting a list of root drives.
     * @param fsv  the new <code>FileSystemView</code>
     *
     * @beaninfo
     *      expert: true
     *       bound: true
     * description: Sets the FileSytemView used to get filesystem information.
     *
     * @see FileSystemView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean accept(File f) {

    /**
     * Returns true if the file should be displayed.
     * @param f the <code>File</code>
     * @return true if the file should be displayed, otherwise false
     * @see FileFilter#accept
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean isTraversable(File f) {

    /**
     * Returns true if the file (directory) can be visited.
     * Returns false if the directory cannot be traversed.
     * @param f the <code>File</code>
     * @return true if the file/directory can be traversed, otherwise false
     * @see FileView#isTraversable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public Icon getIcon(File f) {

    /**
     * Returns the icon for this file or type of file, depending
     * on the system.
     * @param f the <code>File</code>
     * @return the <code>Icon</code> for this file, or type of file
     * @see FileView#getIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public String getTypeDescription(File f) {

    /**
     * Returns the file type.
     * @param f the <code>File</code>
     * @return the <code>String</code> containing the file type description for
     *          <code>f</code>
     * @see FileView#getTypeDescription
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public String getDescription(File f) {

    /**
     * Returns the file description.
     * @param f the <code>File</code>
     * @return the <code>String</code> containing the file description for
     *          <code>f</code>
     * @see FileView#getDescription
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public String getName(File f) {

    /**
     * Returns the filename.
     * @param f the <code>File</code>
     * @return the <code>String</code> containing the filename for
     *          <code>f</code>
     * @see FileView#getName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public FileView getFileView() {

    /**
     * Returns the current file view.
     *
     * @see #setFileView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setFileView(FileView fileView) {

    /**
     * Sets the file view to used to retrieve UI information, such as
     * the icon that represents a file or the type description of a file.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Sets the File View used to get file type information.
     *
     * @see #getFileView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public FileFilter getFileFilter() {

    /**
     * Returns the currently selected file filter.
     *
     * @return the current file filter
     * @see #setFileFilter
     * @see #addChoosableFileFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setFileFilter(FileFilter filter) {

    /**
     * Sets the current file filter. The file filter is used by the
     * file chooser to filter out files from the user's view.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Sets the File Filter used to filter out files of type.
     *
     * @param filter the new current file filter to use
     * @see #getFileFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setFileHidingEnabled(boolean b) {

    /**
     * Sets file hiding on or off. If true, hidden files are not shown
     * in the file chooser. The job of determining which files are
     * shown is done by the <code>FileView</code>.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Sets file hiding on or off.
     *
     * @param b the boolean value that determines whether file hiding is
     *          turned on
     * @see #isFileHidingEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean isFileHidingEnabled() {

    /**
     * Returns true if hidden files are not shown in the file chooser;
     * otherwise, returns false.
     *
     * @return the status of the file hiding property
     * @see #setFileHidingEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean isMultiSelectionEnabled() {

    /**
     * Returns true if multiple files can be selected.
     * @return true if multiple files can be selected
     * @see #setMultiSelectionEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setMultiSelectionEnabled(boolean b) {

    /**
     * Sets the file chooser to allow multiple file selections.
     *
     * @param b true if multiple files may be selected
     * @beaninfo
     *       bound: true
     * description: Sets multiple file selection mode.
     *
     * @see #isMultiSelectionEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean isDirectorySelectionEnabled() {

    /**
     * Convenience call that determines if directories are selectable based
     * on the current file selection mode.
     *
     * @see #setFileSelectionMode
     * @see #getFileSelectionMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean isFileSelectionEnabled() {

    /**
     * Convenience call that determines if files are selectable based on the
     * current file selection mode.
     *
     * @see #setFileSelectionMode
     * @see #getFileSelectionMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public int getFileSelectionMode() {

    /**
     * Returns the current file-selection mode.  The default is
     * <code>JFilesChooser.FILES_ONLY</code>.
     *
     * @return the type of files to be displayed, one of the following:
     * <ul>
     * <li>JFileChooser.FILES_ONLY
     * <li>JFileChooser.DIRECTORIES_ONLY
     * <li>JFileChooser.FILES_AND_DIRECTORIES
     * </ul>
     * @see #setFileSelectionMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setFileSelectionMode(int mode) {

    /**
     * Sets the <code>JFileChooser</code> to allow the user to just
     * select files, just select
     * directories, or select both files and directories.  The default is
     * <code>JFilesChooser.FILES_ONLY</code>.
     *
     * @param mode the type of files to be displayed:
     * <ul>
     * <li>JFileChooser.FILES_ONLY
     * <li>JFileChooser.DIRECTORIES_ONLY
     * <li>JFileChooser.FILES_AND_DIRECTORIES
     * </ul>
     *
     * @exception IllegalArgumentException  if <code>mode</code> is an
     *                          illegal file selection mode
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Sets the types of files that the JFileChooser can choose.
     *        enum: FILES_ONLY JFileChooser.FILES_ONLY
     *              DIRECTORIES_ONLY JFileChooser.DIRECTORIES_ONLY
     *              FILES_AND_DIRECTORIES JFileChooser.FILES_AND_DIRECTORIES
     *
     *
     * @see #getFileSelectionMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setAccessory(JComponent newAccessory) {

    /**
     * Sets the accessory component. An accessory is often used to show a
     * preview image of the selected file; however, it can be used for anything
     * that the programmer wishes, such as extra custom file chooser controls.
     *
     * <p>
     * Note: if there was a previous accessory, you should unregister
     * any listeners that the accessory might have registered with the
     * file chooser.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Sets the accessory component on the JFileChooser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public JComponent getAccessory() {

    /**
     * Returns the accessory component.
     *
     * @return this JFileChooser's accessory component, or null
     * @see #setAccessory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setAcceptAllFileFilterUsed(boolean b) {

   /**
    * Determines whether the <code>AcceptAll FileFilter</code> is used
    * as an available choice in the choosable filter list.
    * If false, the <code>AcceptAll</code> file filter is removed from
    * the list of available file filters.
    * If true, the <code>AcceptAll</code> file filter will become the
    * the actively used file filter.
    *
    * @beaninfo
    *   preferred: true
    *       bound: true
    * description: Sets whether the AcceptAll FileFilter is used as an available choice in the choosable filter list.
    *
    * @see #isAcceptAllFileFilterUsed
    * @see #getAcceptAllFileFilter
    * @see #setFileFilter
    * @since 1.3
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean isAcceptAllFileFilterUsed() {

   /**
    * Returns whether the <code>AcceptAll FileFilter</code> is used.
    * @return true if the <code>AcceptAll FileFilter</code> is used
    * @see #setAcceptAllFileFilterUsed
    * @since 1.3
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public FileFilter getAcceptAllFileFilter() {

    /**
     * Returns the <code>AcceptAll</code> file filter.
     * For example, on Microsoft Windows this would be All Files (*.*).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void resetChoosableFileFilters() {

    /**
     * Resets the choosable file filter list to its starting state. Normally,
     * this removes all added file filters while leaving the
     * <code>AcceptAll</code> file filter.
     *
     * @see #addChoosableFileFilter
     * @see #getChoosableFileFilters
     * @see #removeChoosableFileFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean removeChoosableFileFilter(FileFilter f) {

    /**
     * Removes a filter from the list of user choosable file filters. Returns
     * true if the file filter was removed.
     *
     * @see #addChoosableFileFilter
     * @see #getChoosableFileFilters
     * @see #resetChoosableFileFilters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void addChoosableFileFilter(FileFilter filter) {

    /**
     * Adds a filter to the list of user choosable file filters.
     * For information on setting the file selection mode, see
     * {@link #setFileSelectionMode setFileSelectionMode}.
     *
     * @param filter the <code>FileFilter</code> to add to the choosable file
     *               filter list
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Adds a filter to the list of user choosable file filters.
     *
     * @see #getChoosableFileFilters
     * @see #removeChoosableFileFilter
     * @see #resetChoosableFileFilters
     * @see #setFileSelectionMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public FileFilter[] getChoosableFileFilters() {

    /**
     * Gets the list of user choosable file filters.
     *
     * @return a <code>FileFilter</code> array containing all the choosable
     *         file filters
     *
     * @see #addChoosableFileFilter
     * @see #removeChoosableFileFilter
     * @see #resetChoosableFileFilters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public String getApproveButtonText() {

    /**
     * Returns the text used in the <code>ApproveButton</code> in the
     * <code>FileChooserUI</code>.
     * If <code>null</code>, the UI object will determine the button's text.
     *
     * Typically, this would be "Open" or "Save".
     *
     * @return the text used in the <code>ApproveButton</code>
     *
     * @see #setApproveButtonText
     * @see #setDialogType
     * @see #showDialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    // PENDING(jeff) - have ui set this on dialog type change

    /**
     * Sets the text used in the <code>ApproveButton</code> in the
     * <code>FileChooserUI</code>.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The text that goes in the ApproveButton.
     *
     * @param approveButtonText the text used in the <code>ApproveButton</code>
     *
     * @see #getApproveButtonText
     * @see #setDialogType
     * @see #showDialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setApproveButtonMnemonic(char mnemonic) {

    /**
     * Sets the approve button's mnemonic using a character.
     * @param mnemonic  a character value for the mnemonic key
     *
     * @see #getApproveButtonMnemonic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setApproveButtonMnemonic(int mnemonic) {

    /**
     * Sets the approve button's mnemonic using a numeric keycode.
     *
     * @param mnemonic  an integer value for the mnemonic key
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The mnemonic key accelerator for the ApproveButton.
     *
     * @see #getApproveButtonMnemonic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public int getApproveButtonMnemonic() {

    /**
     * Returns the approve button's mnemonic.
     * @return an integer value for the mnemonic key
     *
     * @see #setApproveButtonMnemonic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public String getApproveButtonToolTipText() {

    /**
     * Returns the tooltip text used in the <code>ApproveButton</code>.
     * If <code>null</code>, the UI object will determine the button's text.
     *
     * @return the tooltip text used for the approve button
     *
     * @see #setApproveButtonText
     * @see #setDialogType
     * @see #showDialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setApproveButtonToolTipText(String toolTipText) {

    /**
     * Sets the tooltip text used in the <code>ApproveButton</code>.
     * If <code>null</code>, the UI object will determine the button's text.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The tooltip text for the ApproveButton.
     *
     * @param toolTipText the tooltip text for the approve button
     * @see #setApproveButtonText
     * @see #setDialogType
     * @see #showDialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public String getDialogTitle() {

    /**
     * Gets the string that goes in the <code>JFileChooser</code>'s titlebar.
     *
     * @see #setDialogTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setDialogTitle(String dialogTitle) {

    /**
     * Sets the string that goes in the <code>JFileChooser</code> window's
     * title bar.
     *
     * @param dialogTitle the new <code>String</code> for the title bar
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The title of the JFileChooser dialog window.
     *
     * @see #getDialogTitle
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    // PENDING(jeff) - fire button text change property

    /**
     * Sets the type of this dialog. Use <code>OPEN_DIALOG</code> when you
     * want to bring up a file chooser that the user can use to open a file.
     * Likewise, use <code>SAVE_DIALOG</code> for letting the user choose
     * a file for saving.
     * Use <code>CUSTOM_DIALOG</code> when you want to use the file
     * chooser in a context other than "Open" or "Save".
     * For instance, you might want to bring up a file chooser that allows
     * the user to choose a file to execute. Note that you normally would not
     * need to set the <code>JFileChooser</code> to use
     * <code>CUSTOM_DIALOG</code>
     * since a call to <code>setApproveButtonText</code> does this for you.
     * The default dialog type is <code>JFileChooser.OPEN_DIALOG</code>.
     *
     * @param dialogType the type of dialog to be displayed:
     * <ul>
     * <li>JFileChooser.OPEN_DIALOG
     * <li>JFileChooser.SAVE_DIALOG
     * <li>JFileChooser.CUSTOM_DIALOG
     * </ul>
     *
     * @exception IllegalArgumentException if <code>dialogType</code> is
     *                          not legal
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The type (open, save, custom) of the JFileChooser.
     *        enum:
     *              OPEN_DIALOG JFileChooser.OPEN_DIALOG
     *              SAVE_DIALOG JFileChooser.SAVE_DIALOG
     *              CUSTOM_DIALOG JFileChooser.CUSTOM_DIALOG
     *
     * @see #getDialogType
     * @see #setApproveButtonText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public int getDialogType() {

    /**
     * Returns the type of this dialog.  The default is
     * <code>JFileChooser.OPEN_DIALOG</code>.
     *
     * @return   the type of dialog to be displayed:
     * <ul>
     * <li>JFileChooser.OPEN_DIALOG
     * <li>JFileChooser.SAVE_DIALOG
     * <li>JFileChooser.CUSTOM_DIALOG
     * </ul>
     *
     * @see #setDialogType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setControlButtonsAreShown(boolean b) {

    /**
     * Sets the property
     * that indicates whether the <i>approve</i> and <i>cancel</i>
     * buttons are shown in the file chooser.  This property
     * is <code>true</code> by default.  Look and feels
     * that always show these buttons will ignore the value
     * of this property.
     * This method fires a property-changed event,
     * using the string value of
     * <code>CONTROL_BUTTONS_ARE_SHOWN_CHANGED_PROPERTY</code>
     * as the name of the property.
     *
     * @param b <code>false</code> if control buttons should not be
     *    shown; otherwise, <code>true</code>
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Sets whether the approve &amp; cancel buttons are shown.
     *
     * @see #getControlButtonsAreShown
     * @see #CONTROL_BUTTONS_ARE_SHOWN_CHANGED_PROPERTY
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean getControlButtonsAreShown() {

    /**
     * Returns the value of the <code>controlButtonsAreShown</code>
     * property.
     *
     * @return   the value of the <code>controlButtonsAreShown</code>
     *     property
     *
     * @see #setControlButtonsAreShown
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    protected JDialog createDialog(Component parent) throws HeadlessException {

    /**
     * Creates and returns a new <code>JDialog</code> wrapping
     * <code>this</code> centered on the <code>parent</code>
     * in the <code>parent</code>'s frame.
     * This method can be overriden to further manipulate the dialog,
     * to disable resizing, set the location, etc. Example:
     * <pre>
     *     class MyFileChooser extends JFileChooser {
     *         protected JDialog createDialog(Component parent) throws HeadlessException {
     *             JDialog dialog = super.createDialog(parent);
     *             dialog.setLocation(300, 200);
     *             dialog.setResizable(false);
     *             return dialog;
     *         }
     *     }
     * </pre>
     *
     * @param   parent  the parent component of the dialog;
     *                  can be <code>null</code>
     * @return a new <code>JDialog</code> containing this instance
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public int showDialog(Component parent, String approveButtonText)

    /**
     * Pops a custom file chooser dialog with a custom approve button.
     * For example, the following code
     * pops up a file chooser with a "Run Application" button
     * (instead of the normal "Save" or "Open" button):
     * <pre>
     * filechooser.showDialog(parentFrame, "Run Application");
     * </pre>
     *
     * Alternatively, the following code does the same thing:
     * <pre>
     *    JFileChooser chooser = new JFileChooser(null);
     *    chooser.setApproveButtonText("Run Application");
     *    chooser.showDialog(parentFrame, null);
     * </pre>
     *
     * <!--PENDING(jeff) - the following method should be added to the api:
     *      showDialog(Component parent);-->
     * <!--PENDING(kwalrath) - should specify modality and what
     *      "depends" means.-->
     *
     * <p>
     *
     * The <code>parent</code> argument determines two things:
     * the frame on which the open dialog depends and
     * the component whose position the look and feel
     * should consider when placing the dialog.  If the parent
     * is a <code>Frame</code> object (such as a <code>JFrame</code>)
     * then the dialog depends on the frame and
     * the look and feel positions the dialog
     * relative to the frame (for example, centered over the frame).
     * If the parent is a component, then the dialog
     * depends on the frame containing the component,
     * and is positioned relative to the component
     * (for example, centered over the component).
     * If the parent is <code>null</code>, then the dialog depends on
     * no visible window, and it's placed in a
     * look-and-feel-dependent position
     * such as the center of the screen.
     *
     * @param   parent  the parent component of the dialog;
     *                  can be <code>null</code>
     * @param   approveButtonText the text of the <code>ApproveButton</code>
     * @return  the return state of the file chooser on popdown:
     * <ul>
     * <li>JFileChooser.CANCEL_OPTION
     * <li>JFileChooser.APPROVE_OPTION
     * <li>JFileChooser.ERROR_OPTION if an error occurs or the
     *                  dialog is dismissed
     * </ul>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public int showSaveDialog(Component parent) throws HeadlessException {

    /**
     * Pops up a "Save File" file chooser dialog. Note that the
     * text that appears in the approve button is determined by
     * the L&amp;F.
     *
     * @param    parent  the parent component of the dialog,
     *                  can be <code>null</code>;
     *                  see <code>showDialog</code> for details
     * @return   the return state of the file chooser on popdown:
     * <ul>
     * <li>JFileChooser.CANCEL_OPTION
     * <li>JFileChooser.APPROVE_OPTION
     * <li>JFileChooser.ERROR_OPTION if an error occurs or the
     *                  dialog is dismissed
     * </ul>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #showDialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public int showOpenDialog(Component parent) throws HeadlessException {

    /**
     * Pops up an "Open File" file chooser dialog. Note that the
     * text that appears in the approve button is determined by
     * the L&amp;F.
     *
     * @param    parent  the parent component of the dialog,
     *                  can be <code>null</code>;
     *                  see <code>showDialog</code> for details
     * @return   the return state of the file chooser on popdown:
     * <ul>
     * <li>JFileChooser.CANCEL_OPTION
     * <li>JFileChooser.APPROVE_OPTION
     * <li>JFileChooser.ERROR_OPTION if an error occurs or the
     *                  dialog is dismissed
     * </ul>
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #showDialog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void ensureFileIsVisible(File f) {

    /**
     * Makes sure that the specified file is viewable, and
     * not hidden.
     *
     * @param f  a File object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void rescanCurrentDirectory() {

    /**
     * Tells the UI to rescan its files list from the current directory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void changeToParentDirectory() {

    /**
     * Changes the directory to be set to the parent of the
     * current directory.
     *
     * @see #getCurrentDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setCurrentDirectory(File dir) {

    /**
     * Sets the current directory. Passing in <code>null</code> sets the
     * file chooser to point to the user's default directory.
     * This default depends on the operating system. It is
     * typically the "My Documents" folder on Windows, and the user's
     * home directory on Unix.
     *
     * If the file passed in as <code>currentDirectory</code> is not a
     * directory, the parent of the file will be used as the currentDirectory.
     * If the parent is not traversable, then it will walk up the parent tree
     * until it finds a traversable directory, or hits the root of the
     * file system.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The directory that the JFileChooser is showing files of.
     *
     * @param dir the current directory to point to
     * @see #getCurrentDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public File getCurrentDirectory() {

    /**
     * Returns the current directory.
     *
     * @return the current directory
     * @see #setCurrentDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setSelectedFiles(File[] selectedFiles) {

    /**
     * Sets the list of selected files if the file chooser is
     * set to allow multiple selection.
     *
     * @beaninfo
     *       bound: true
     * description: The list of selected files if the chooser is in multiple selection mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public File[] getSelectedFiles() {

    /**
     * Returns a list of selected files if the file chooser is
     * set to allow multiple selection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setSelectedFile(File file) {

    /**
     * Sets the selected file. If the file's parent directory is
     * not the current directory, changes the current directory
     * to be the file's parent directory.
     *
     * @beaninfo
     *   preferred: true
     *       bound: true
     *
     * @see #getSelectedFile
     *
     * @param file the selected file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public File getSelectedFile() {

    /**
     * Returns the selected file. This can be set either by the
     * programmer via <code>setSelectedFile</code> or by a user action, such as
     * either typing the filename into the UI or selecting the
     * file from a list in the UI.
     *
     * @see #setSelectedFile
     * @return the selected file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public boolean getDragEnabled() {

    /**
     * Gets the value of the <code>dragEnabled</code> property.
     *
     * @return  the value of the <code>dragEnabled</code> property
     * @see #setDragEnabled
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public void setDragEnabled(boolean b) {

    /**
     * Sets the <code>dragEnabled</code> property,
     * which must be <code>true</code> to enable
     * automatic drag handling (the first part of drag and drop)
     * on this component.
     * The <code>transferHandler</code> property needs to be set
     * to a non-<code>null</code> value for the drag to do
     * anything.  The default value of the <code>dragEnabled</code>
     * property
     * is <code>false</code>.
     *
     * <p>
     *
     * When automatic drag handling is enabled,
     * most look and feels begin a drag-and-drop operation
     * whenever the user presses the mouse button over an item
     * and then moves the mouse a few pixels.
     * Setting this property to <code>true</code>
     * can therefore have a subtle effect on
     * how selections behave.
     *
     * <p>
     *
     * Some look and feels might not support automatic drag and drop;
     * they will ignore this property.  You can work around such
     * look and feels by modifying the component
     * to directly call the <code>exportAsDrag</code> method of a
     * <code>TransferHandler</code>.
     *
     * @param b the value to set the <code>dragEnabled</code> property to
     * @exception HeadlessException if
     *            <code>b</code> is <code>true</code> and
     *            <code>GraphicsEnvironment.isHeadless()</code>
     *            returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #getDragEnabled
     * @see #setTransferHandler
     * @see TransferHandler
     * @since 1.4
     *
     * @beaninfo
     *  description: determines whether automatic drag handling is enabled
     *        bound: false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    protected void setup(FileSystemView view) {

    /**
     * Performs common constructor initialization and setup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public JFileChooser(String currentDirectoryPath, FileSystemView fsv) {

    /**
     * Constructs a <code>JFileChooser</code> using the given current directory
     * path and <code>FileSystemView</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public JFileChooser(File currentDirectory, FileSystemView fsv) {

    /**
     * Constructs a <code>JFileChooser</code> using the given current directory
     * and <code>FileSystemView</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public JFileChooser(FileSystemView fsv) {

    /**
     * Constructs a <code>JFileChooser</code> using the given
     * <code>FileSystemView</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public JFileChooser(File currentDirectory) {

    /**
     * Constructs a <code>JFileChooser</code> using the given <code>File</code>
     * as the path. Passing in a <code>null</code> file
     * causes the file chooser to point to the user's default directory.
     * This default depends on the operating system. It is
     * typically the "My Documents" folder on Windows, and the user's
     * home directory on Unix.
     *
     * @param currentDirectory  a <code>File</code> object specifying
     *                          the path to a file or directory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public JFileChooser(String currentDirectoryPath) {

    /**
     * Constructs a <code>JFileChooser</code> using the given path.
     * Passing in a <code>null</code>
     * string causes the file chooser to point to the user's default directory.
     * This default depends on the operating system. It is
     * typically the "My Documents" folder on Windows, and the user's
     * home directory on Unix.
     *
     * @param currentDirectoryPath  a <code>String</code> giving the path
     *                          to a file or directory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public JFileChooser() {

    /**
     * Constructs a <code>JFileChooser</code> pointing to the user's
     * default directory. This default depends on the operating system.
     * It is typically the "My Documents" folder on Windows, and the
     * user's home directory on Unix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String CHOOSABLE_FILE_FILTER_CHANGED_PROPERTY = "ChoosableFileFilterChangedProperty";

    /**
     * Identifies a change in the list of predefined file filters
     * the user can choose from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String DIALOG_TYPE_CHANGED_PROPERTY = "DialogTypeChangedProperty";

    /**
     * Identifies a change in the type of files displayed (files only,
     * directories only, or both files and directories).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String DIALOG_TITLE_CHANGED_PROPERTY = "DialogTitleChangedProperty";

    /** Identifies a change in the dialog title. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String ACCEPT_ALL_FILE_FILTER_USED_CHANGED_PROPERTY = "acceptAllFileFilterUsedChanged";

    /**
     * Identifies whether a the AcceptAllFileFilter is used or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String ACCESSORY_CHANGED_PROPERTY = "AccessoryChangedProperty";

    /**
     * Says that a different accessory component is in use
     * (for example, to preview files).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String FILE_SELECTION_MODE_CHANGED_PROPERTY = "fileSelectionChanged";

    /**
     * Identifies a change in the kind of selection (single,
     * multiple, etc.).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String FILE_FILTER_CHANGED_PROPERTY = "fileFilterChanged";

    /** User changed the kind of files to display. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String FILE_HIDING_CHANGED_PROPERTY = "FileHidingChanged";

    /** Identifies a change in the display-hidden-files property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String FILE_VIEW_CHANGED_PROPERTY = "fileViewChanged";

    /**
     * Says that a different object is being used to retrieve file
     * information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String FILE_SYSTEM_VIEW_CHANGED_PROPERTY = "FileSystemViewChanged";

    /**
     * Says that a different object is being used to find available drives
     * on the system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String MULTI_SELECTION_ENABLED_CHANGED_PROPERTY = "MultiSelectionEnabledChangedProperty";

    /** Enables multiple-file selections. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String SELECTED_FILES_CHANGED_PROPERTY = "SelectedFilesChangedProperty";

    /** Identifies change in user's multiple-file selection. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String SELECTED_FILE_CHANGED_PROPERTY = "SelectedFileChangedProperty";

    /** Identifies change in user's single-file selection. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String DIRECTORY_CHANGED_PROPERTY = "directoryChanged";

    /** Identifies user's directory change. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String CONTROL_BUTTONS_ARE_SHOWN_CHANGED_PROPERTY = "ControlButtonsAreShownChangedProperty";

    /** Instruction to display the control buttons. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String APPROVE_BUTTON_MNEMONIC_CHANGED_PROPERTY = "ApproveButtonMnemonicChangedProperty";

    /** Identifies change in the mnemonic for the approve (yes, ok) button. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String APPROVE_BUTTON_TOOL_TIP_TEXT_CHANGED_PROPERTY = "ApproveButtonToolTipTextChangedProperty";

    /**
     * Identifies change in the tooltip text for the approve (yes, ok)
     * button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String APPROVE_BUTTON_TEXT_CHANGED_PROPERTY = "ApproveButtonTextChangedProperty";

    /** Identifies change in the text on the approve (yes, ok) button. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String APPROVE_SELECTION = "ApproveSelection";

    /**
     * Instruction to approve the current selection
     * (same as pressing yes or ok).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final String CANCEL_SELECTION = "CancelSelection";

    /** Instruction to cancel the current selection. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int FILES_AND_DIRECTORIES = 2;

    /** Instruction to display both files and directories. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int DIRECTORIES_ONLY = 1;

    /** Instruction to display only directories. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int FILES_ONLY = 0;

    /** Instruction to display only files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int ERROR_OPTION = -1;

    /**
     * Return value if an error occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int APPROVE_OPTION = 0;

    /**
     * Return value if approve (yes, ok) is chosen.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int CANCEL_OPTION = 1;

    /**
     * Return value if cancel is chosen.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int CUSTOM_DIALOG = 2;

    /**
     * Type value indicating that the <code>JFileChooser</code> supports a
     * developer-specified file operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int SAVE_DIALOG = 1;

    /**
     * Type value indicating that the <code>JFileChooser</code> supports a
     * "Save" file operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    public static final int OPEN_DIALOG = 0;

    /**
     * Type value indicating that the <code>JFileChooser</code> supports an
     * "Open" file operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
    private static final String uiClassID = "FileChooserUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JFileChooser.java
public class JFileChooser extends JComponent implements Accessible {

/**
 * <code>JFileChooser</code> provides a simple mechanism for the user to
 * choose a file.
 * For information about using <code>JFileChooser</code>, see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html">How to Use File Choosers</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * <p>
 *
 * The following code pops up a file chooser for the user's home directory that
 * sees only .jpg and .gif images:
 * <pre>
 *    JFileChooser chooser = new JFileChooser();
 *    FileNameExtensionFilter filter = new FileNameExtensionFilter(
 *        "JPG &amp; GIF Images", "jpg", "gif");
 *    chooser.setFileFilter(filter);
 *    int returnVal = chooser.showOpenDialog(parent);
 *    if(returnVal == JFileChooser.APPROVE_OPTION) {
 *       System.out.println("You chose to open this file: " +
 *            chooser.getSelectedFile().getName());
 *    }
 * </pre>
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
 *
 * @beaninfo
 *   attribute: isContainer false
 * description: A component which allows for the interactive selection of a file.
 *
 * @author Jeff Dinkins
 *
 */
