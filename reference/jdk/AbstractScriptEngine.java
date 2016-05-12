_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    protected ScriptContext getScriptContext(Bindings nn) {

    /**
     * Returns a <code>SimpleScriptContext</code>.  The <code>SimpleScriptContext</code>:
     *<br><br>
     * <ul>
     * <li>Uses the specified <code>Bindings</code> for its <code>ENGINE_SCOPE</code>
     * </li>
     * <li>Uses the <code>Bindings</code> returned by the abstract <code>getGlobalScope</code>
     * method as its <code>GLOBAL_SCOPE</code>
     * </li>
     * <li>Uses the Reader and Writer in the default <code>ScriptContext</code> of this
     * <code>ScriptEngine</code>
     * </li>
     * </ul>
     * <br><br>
     * A <code>SimpleScriptContext</code> returned by this method is used to implement eval methods
     * using the abstract <code>eval(Reader,Bindings)</code> and <code>eval(String,Bindings)</code>
     * versions.
     *
     * @param nn Bindings to use for the <code>ENGINE_SCOPE</code>
     * @return The <code>SimpleScriptContext</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public Object eval(String script) throws ScriptException {

    /**
     * Same as <code>eval(Reader)</code> except that the abstract
     * <code>eval(String, ScriptContext)</code> is used.
     *
     * @param script A <code>String</code> containing the source of the script.
     * @return The return value from <code>eval(String, ScriptContext)</code>
     * @throws ScriptException if an error occurs in script.
     * @throws NullPointerException if any of the parameters is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public Object eval(Reader reader) throws ScriptException {

    /**
     * <code>eval(Reader)</code> calls the abstract
     * <code>eval(Reader, ScriptContext)</code> passing the value of the <code>context</code>
     * field.
     *
     * @param reader A <code>Reader</code> containing the source of the script.
     * @return The return value from <code>eval(Reader, ScriptContext)</code>
     * @throws ScriptException if an error occurs in script.
     * @throws NullPointerException if any of the parameters is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public Object eval(String script, Bindings bindings) throws ScriptException {

    /**
     * Same as <code>eval(Reader, Bindings)</code> except that the abstract
     * <code>eval(String, ScriptContext)</code> is used.
     *
     * @param script A <code>String</code> containing the source of the script.
     *
     * @param bindings A <code>Bindings</code> to use as the <code>ENGINE_SCOPE</code>
     * while the script executes.
     *
     * @return The return value from <code>eval(String, ScriptContext)</code>
     * @throws ScriptException if an error occurs in script.
     * @throws NullPointerException if any of the parameters is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public Object eval(Reader reader, Bindings bindings ) throws ScriptException {

    /**
     * <code>eval(Reader, Bindings)</code> calls the abstract
     * <code>eval(Reader, ScriptContext)</code> method, passing it a <code>ScriptContext</code>
     * whose Reader, Writers and Bindings for scopes other that <code>ENGINE_SCOPE</code>
     * are identical to those members of the protected <code>context</code> field.  The specified
     * <code>Bindings</code> is used instead of the <code>ENGINE_SCOPE</code>
     *
     * <code>Bindings</code> of the <code>context</code> field.
     *
     * @param reader A <code>Reader</code> containing the source of the script.
     * @param bindings A <code>Bindings</code> to use for the <code>ENGINE_SCOPE</code>
     * while the script executes.
     *
     * @return The return value from <code>eval(Reader, ScriptContext)</code>
     * @throws ScriptException if an error occurs in script.
     * @throws NullPointerException if any of the parameters is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public Object get(String key) {

    /**
     * Gets the value for the specified key in the <code>ENGINE_SCOPE</code> of the
     * protected <code>context</code> field.
     *
     * @return The value for the specified key.
     *
     * @throws NullPointerException if key is null.
     * @throws IllegalArgumentException if key is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public void put(String key, Object value) {

    /**
     * Sets the specified value with the specified key in the <code>ENGINE_SCOPE</code>
     * <code>Bindings</code> of the protected <code>context</code> field.
     *
     * @param key The specified key.
     * @param value The specified value.
     *
     * @throws NullPointerException if key is null.
     * @throws IllegalArgumentException if key is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public void setBindings(Bindings bindings, int scope) {

    /**
     * Sets the <code>Bindings</code> with the corresponding scope value in the
     * <code>context</code> field.
     *
     * @param bindings The specified <code>Bindings</code>.
     * @param scope The specified scope.
     *
     * @throws IllegalArgumentException if the value of scope is
     * invalid for the type the <code>context</code> field.
     * @throws NullPointerException if the bindings is null and the scope is
     * <code>ScriptContext.ENGINE_SCOPE</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public Bindings getBindings(int scope) {

    /**
     * Returns the <code>Bindings</code> with the specified scope value in
     * the protected <code>context</code> field.
     *
     * @param scope The specified scope
     *
     * @return The corresponding <code>Bindings</code>.
     *
     * @throws IllegalArgumentException if the value of scope is
     * invalid for the type the protected <code>context</code> field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public ScriptContext getContext() {

    /**
     * Returns the value of the protected <code>context</code> field.
     *
     * @return The value of the protected <code>context</code> field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public void setContext(ScriptContext ctxt) {

    /**
     * Sets the value of the protected <code>context</code> field to the specified
     * <code>ScriptContext</code>.
     *
     * @param ctxt The specified <code>ScriptContext</code>.
     * @throws NullPointerException if ctxt is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public AbstractScriptEngine(Bindings n) {

    /**
     * Creates a new instance using the specified <code>Bindings</code> as the
     * <code>ENGINE_SCOPE</code> <code>Bindings</code> in the protected <code>context</code> field.
     *
     * @param n The specified <code>Bindings</code>.
     * @throws NullPointerException if n is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    public AbstractScriptEngine() {

    /**
     * Creates a new instance of AbstractScriptEngine using a <code>SimpleScriptContext</code>
     * as its default <code>ScriptContext</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
    protected ScriptContext context;

    /**
     * The default <code>ScriptContext</code> of this <code>AbstractScriptEngine</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/script/AbstractScriptEngine.java
public abstract class AbstractScriptEngine  implements ScriptEngine {

/**
 * Provides a standard implementation for several of the variants of the <code>eval</code>
 * method.
 * <br><br>
 * <code><b>eval(Reader)</b></code><p><code><b>eval(String)</b></code><p>
 * <code><b>eval(String, Bindings)</b></code><p><code><b>eval(Reader, Bindings)</b></code>
 * <br><br> are implemented using the abstract methods
 * <br><br>
 * <code><b>eval(Reader,ScriptContext)</b></code> or
 * <code><b>eval(String, ScriptContext)</b></code>
 * <br><br>
 * with a <code>SimpleScriptContext</code>.
 * <br><br>
 * A <code>SimpleScriptContext</code> is used as the default <code>ScriptContext</code>
 * of the <code>AbstractScriptEngine</code>..
 *
 * @author Mike Grogan
 * @since 1.6
 */
