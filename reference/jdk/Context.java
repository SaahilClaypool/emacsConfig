_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String APPLET = "java.naming.applet";

    /**
     * Constant that holds the name of the environment property for
     * specifying an applet for the initial context constructor to use
     * when searching for other properties.
     * The value of this property is the
     * <tt>java.applet.Applet</tt> instance that is being executed.
     * This property may be specified in the environment parameter
     * passed to the initial context constructor.
     * When this property is set, each property that the initial context
     * constructor looks for in the system properties is first looked for
     * in the applet's parameter list.
     * If this property is unspecified, the initial context constructor
     * will search for properties only in the environment parameter
     * passed to it, the system properties, and application resource files.
     *
     * <p> The value of this constant is "java.naming.applet".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     * @see InitialContext
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String SECURITY_CREDENTIALS = "java.naming.security.credentials";

    /**
     * Constant that holds the name of the environment property for
     * specifying the credentials of the principal for authenticating
     * the caller to the service. The value of the property depends
     * on the authentication scheme. For example, it could be a hashed
     * password, clear-text password, key, certificate, and so on.
     * If this property is unspecified,
     * the behaviour is determined by the service provider.
     *
     * <p> The value of this constant is "java.naming.security.credentials".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String SECURITY_PRINCIPAL = "java.naming.security.principal";

    /**
     * Constant that holds the name of the environment property for
     * specifying the identity of the principal for authenticating
     * the caller to the service. The format of the principal
     * depends on the authentication scheme.
     * If this property is unspecified,
     * the behaviour is determined by the service provider.
     *
     * <p> The value of this constant is "java.naming.security.principal".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String SECURITY_AUTHENTICATION = "java.naming.security.authentication";

    /**
     * Constant that holds the name of the environment property for
     * specifying the security level to use.
     * Its value is one of the following strings:
     * "none", "simple", "strong".
     * If this property is unspecified,
     * the behaviour is determined by the service provider.
     *
     * <p> The value of this constant is "java.naming.security.authentication".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String SECURITY_PROTOCOL = "java.naming.security.protocol";

    /**
     * Constant that holds the name of the environment property for
     * specifying the security protocol to use.
     * Its value is a string determined by the service provider
     * (e.g. "ssl").
     * If this property is unspecified,
     * the behaviour is determined by the service provider.
     *
     * <p> The value of this constant is "java.naming.security.protocol".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String REFERRAL = "java.naming.referral";

    /**
     * Constant that holds the name of the environment property for
     * specifying how referrals encountered by the service provider
     * are to be processed. The value of the property is one of the
     * following strings:
     * <dl>
     * <dt>"follow"
     * <dd>follow referrals automatically
     * <dt>"ignore"
     * <dd>ignore referrals
     * <dt>"throw"
     * <dd>throw <tt>ReferralException</tt> when a referral is encountered.
     * </dl>
     * If this property is not specified, the default is
     * determined by the provider.
     *
     * <p> The value of this constant is "java.naming.referral".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String BATCHSIZE = "java.naming.batchsize";

    /**
     * Constant that holds the name of the environment property for
     * specifying the batch size to use when returning data via the
     * service's protocol. This is a hint to the provider to return
     * the results of operations in batches of the specified size, so
     * the provider can optimize its performance and usage of resources.
     * The value of the property is the string representation of an
     * integer.
     * If unspecified, the batch size is determined by the service
     * provider.
     *
     * <p> The value of this constant is "java.naming.batchsize".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String AUTHORITATIVE = "java.naming.authoritative";

    /**
     * Constant that holds the name of the environment property for
     * specifying the authoritativeness of the service requested.
     * If the value of the property is the string "true", it means
     * that the access is to the most authoritative source (i.e. bypass
     * any cache or replicas). If the value is anything else,
     * the source need not be (but may be) authoritative.
     * If unspecified, the value defaults to "false".
     *
     * <p> The value of this constant is "java.naming.authoritative".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String DNS_URL = "java.naming.dns.url";

    /**
     * Constant that holds the name of the environment property
     * for specifying the DNS host and domain names to use for the
     * JNDI URL context (for example, "dns://somehost/wiz.com").
     * This property may be specified in the environment,
     * an applet parameter, a system property, or a resource file.
     * If it is not specified in any of these sources
     * and the program attempts to use a JNDI URL containing a DNS name,
     * a <tt>ConfigurationException</tt> will be thrown.
     *
     * <p> The value of this constant is "java.naming.dns.url".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String PROVIDER_URL = "java.naming.provider.url";

    /**
     * Constant that holds the name of the environment property
     * for specifying configuration information for the service provider
     * to use. The value of the property should contain a URL string
     * (e.g. "ldap://somehost:389").
     * This property may be specified in the environment,
     * an applet parameter, a system property, or a resource file.
     * If it is not specified in any of these sources,
     * the default configuration is determined by the service provider.
     *
     * <p> The value of this constant is "java.naming.provider.url".
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     * @see #APPLET
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String URL_PKG_PREFIXES = "java.naming.factory.url.pkgs";

    /**
     * Constant that holds the name of the environment property
     * for specifying the list of package prefixes to use when
     * loading in URL context factories. The value
     * of the property should be a colon-separated list of package
     * prefixes for the class name of the factory class that will create
     * a URL context factory.
     * This property may be specified in the environment,
     * an applet parameter, a system property, or one or more
     * resource files.
     * The prefix <tt>com.sun.jndi.url</tt> is always appended to
     * the possibly empty list of package prefixes.
     *
     * <p> The value of this constant is "java.naming.factory.url.pkgs".
     *
     * @see javax.naming.spi.NamingManager#getObjectInstance
     * @see javax.naming.spi.NamingManager#getURLContext
     * @see javax.naming.spi.ObjectFactory
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     * @see #APPLET
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String STATE_FACTORIES = "java.naming.factory.state";

    /**
     * Constant that holds the name of the environment property
     * for specifying the list of state factories to use. The value
     * of the property should be a colon-separated list of the fully
     * qualified class names of state factory classes that will be used
     * to get an object's state given the object itself.
     * This property may be specified in the environment, an applet
     * parameter, a system property, or one or more resource files.
     *
     * <p> The value of this constant is "java.naming.factory.state".
     *
     * @see javax.naming.spi.NamingManager#getStateToBind
     * @see javax.naming.spi.StateFactory
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     * @see #APPLET
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String OBJECT_FACTORIES = "java.naming.factory.object";

    /**
     * Constant that holds the name of the environment property
     * for specifying the list of object factories to use. The value
     * of the property should be a colon-separated list of the fully
     * qualified class names of factory classes that will create an object
     * given information about the object.
     * This property may be specified in the environment, an applet
     * parameter, a system property, or one or more resource files.
     *
     * <p> The value of this constant is "java.naming.factory.object".
     *
     * @see javax.naming.spi.NamingManager#getObjectInstance
     * @see javax.naming.spi.ObjectFactory
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     * @see #APPLET
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    String INITIAL_CONTEXT_FACTORY = "java.naming.factory.initial";

    /**
     * Constant that holds the name of the environment property
     * for specifying the initial context factory to use. The value
     * of the property should be the fully qualified class name
     * of the factory class that will create an initial context.
     * This property may be specified in the environment parameter
     * passed to the initial context constructor, an applet parameter,
     * a system property, or an application resource file.
     * If it is not specified in any of these sources,
     * <tt>NoInitialContextException</tt> is thrown when an initial
     * context is required to complete an operation.
     *
     * <p> The value of this constant is "java.naming.factory.initial".
     *
     * @see InitialContext
     * @see javax.naming.directory.InitialDirContext
     * @see javax.naming.spi.NamingManager#getInitialContext
     * @see javax.naming.spi.InitialContextFactory
     * @see NoInitialContextException
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     * @see #APPLET
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public String getNameInNamespace() throws NamingException;

    /**
     * Retrieves the full name of this context within its own namespace.
     *
     * <p> Many naming services have a notion of a "full name" for objects
     * in their respective namespaces.  For example, an LDAP entry has
     * a distinguished name, and a DNS record has a fully qualified name.
     * This method allows the client application to retrieve this name.
     * The string returned by this method is not a JNDI composite name
     * and should not be passed directly to context methods.
     * In naming systems for which the notion of full name does not
     * make sense, <tt>OperationNotSupportedException</tt> is thrown.
     *
     * @return  this context's name in its own namespace; never null
     * @throws  OperationNotSupportedException if the naming system does
     *          not have the notion of a full name
     * @throws  NamingException if a naming exception is encountered
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void close() throws NamingException;

    /**
     * Closes this context.
     * This method releases this context's resources immediately, instead of
     * waiting for them to be released automatically by the garbage collector.
     *
     * <p> This method is idempotent:  invoking it on a context that has
     * already been closed has no effect.  Invoking any other method
     * on a closed context is not allowed, and results in undefined behaviour.
     *
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Hashtable<?,?> getEnvironment() throws NamingException;

    /**
     * Retrieves the environment in effect for this context.
     * See class description for more details on environment properties.
     *
     * <p> The caller should not make any changes to the object returned:
     * their effect on the context is undefined.
     * The environment of this context may be changed using
     * <tt>addToEnvironment()</tt> and <tt>removeFromEnvironment()</tt>.
     *
     * @return  the environment of this context; never null
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #addToEnvironment(String, Object)
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Object removeFromEnvironment(String propName)

    /**
     * Removes an environment property from the environment of this
     * context.  See class description for more details on environment
     * properties.
     *
     * @param propName
     *          the name of the environment property to remove; may not be null
     * @return  the previous value of the property, or null if the property was
     *          not in the environment
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #getEnvironment()
     * @see #addToEnvironment(String, Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Object addToEnvironment(String propName, Object propVal)

    /**
     * Adds a new environment property to the environment of this
     * context.  If the property already exists, its value is overwritten.
     * See class description for more details on environment properties.
     *
     * @param propName
     *          the name of the environment property to add; may not be null
     * @param propVal
     *          the value of the property to add; may not be null
     * @return  the previous value of the property, or null if the property was
     *          not in the environment before
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #getEnvironment()
     * @see #removeFromEnvironment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public String composeName(String name, String prefix)

    /**
     * Composes the name of this context with a name relative to
     * this context.
     * See {@link #composeName(Name, Name)} for details.
     *
     * @param name
     *          a name relative to this context
     * @param prefix
     *          the name of this context relative to one of its ancestors
     * @return  the composition of <code>prefix</code> and <code>name</code>
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Name composeName(Name name, Name prefix)

    /**
     * Composes the name of this context with a name relative to
     * this context.
     * Given a name (<code>name</code>) relative to this context, and
     * the name (<code>prefix</code>) of this context relative to one
     * of its ancestors, this method returns the composition of the
     * two names using the syntax appropriate for the naming
     * system(s) involved.  That is, if <code>name</code> names an
     * object relative to this context, the result is the name of the
     * same object, but relative to the ancestor context.  None of the
     * names may be null.
     * <p>
     * For example, if this context is named "wiz.com" relative
     * to the initial context, then
     * <pre>
     *  composeName("east", "wiz.com")  </pre>
     * might return <code>"east.wiz.com"</code>.
     * If instead this context is named "org/research", then
     * <pre>
     *  composeName("user/jane", "org/research")        </pre>
     * might return <code>"org/research/user/jane"</code> while
     * <pre>
     *  composeName("user/jane", "research")    </pre>
     * returns <code>"research/user/jane"</code>.
     *
     * @param name
     *          a name relative to this context
     * @param prefix
     *          the name of this context relative to one of its ancestors
     * @return  the composition of <code>prefix</code> and <code>name</code>
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #composeName(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public NameParser getNameParser(String name) throws NamingException;

    /**
     * Retrieves the parser associated with the named context.
     * See {@link #getNameParser(Name)} for details.
     *
     * @param name
     *          the name of the context from which to get the parser
     * @return  a name parser that can parse compound names into their atomic
     *          components
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public NameParser getNameParser(Name name) throws NamingException;

    /**
     * Retrieves the parser associated with the named context.
     * In a federation of namespaces, different naming systems will
     * parse names differently.  This method allows an application
     * to get a parser for parsing names into their atomic components
     * using the naming convention of a particular naming system.
     * Within any single naming system, <tt>NameParser</tt> objects
     * returned by this method must be equal (using the <tt>equals()</tt>
     * test).
     *
     * @param name
     *          the name of the context from which to get the parser
     * @return  a name parser that can parse compound names into their atomic
     *          components
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #getNameParser(String)
     * @see CompoundName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Object lookupLink(String name) throws NamingException;

    /**
     * Retrieves the named object, following links except
     * for the terminal atomic component of the name.
     * See {@link #lookupLink(Name)} for details.
     *
     * @param name
     *          the name of the object to look up
     * @return  the object bound to <tt>name</tt>, not following the
     *          terminal link (if any)
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Object lookupLink(Name name) throws NamingException;

    /**
     * Retrieves the named object, following links except
     * for the terminal atomic component of the name.
     * If the object bound to <tt>name</tt> is not a link,
     * returns the object itself.
     *
     * @param name
     *          the name of the object to look up
     * @return  the object bound to <tt>name</tt>, not following the
     *          terminal link (if any).
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #lookupLink(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Context createSubcontext(String name) throws NamingException;

    /**
     * Creates and binds a new context.
     * See {@link #createSubcontext(Name)} for details.
     *
     * @param name
     *          the name of the context to create; may not be empty
     * @return  the newly created context
     *
     * @throws  NameAlreadyBoundException if name is already bound
     * @throws  javax.naming.directory.InvalidAttributesException
     *          if creation of the subcontext requires specification of
     *          mandatory attributes
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Context createSubcontext(Name name) throws NamingException;

    /**
     * Creates and binds a new context.
     * Creates a new context with the given name and binds it in
     * the target context (that named by all but terminal atomic
     * component of the name).  All intermediate contexts and the
     * target context must already exist.
     *
     * @param name
     *          the name of the context to create; may not be empty
     * @return  the newly created context
     *
     * @throws  NameAlreadyBoundException if name is already bound
     * @throws  javax.naming.directory.InvalidAttributesException
     *          if creation of the subcontext requires specification of
     *          mandatory attributes
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #createSubcontext(String)
     * @see javax.naming.directory.DirContext#createSubcontext
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void destroySubcontext(String name) throws NamingException;

    /**
     * Destroys the named context and removes it from the namespace.
     * See {@link #destroySubcontext(Name)} for details.
     *
     * @param name
     *          the name of the context to be destroyed; may not be empty
     * @throws  NameNotFoundException if an intermediate context does not exist
     * @throws  NotContextException if the name is bound but does not name a
     *          context, or does not name a context of the appropriate type
     * @throws  ContextNotEmptyException if the named context is not empty
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void destroySubcontext(Name name) throws NamingException;

    /**
     * Destroys the named context and removes it from the namespace.
     * Any attributes associated with the name are also removed.
     * Intermediate contexts are not destroyed.
     *
     * <p> This method is idempotent.
     * It succeeds even if the terminal atomic name
     * is not bound in the target context, but throws
     * <tt>NameNotFoundException</tt>
     * if any of the intermediate contexts do not exist.
     *
     * <p> In a federated naming system, a context from one naming system
     * may be bound to a name in another.  One can subsequently
     * look up and perform operations on the foreign context using a
     * composite name.  However, an attempt destroy the context using
     * this composite name will fail with
     * <tt>NotContextException</tt>, because the foreign context is not
     * a "subcontext" of the context in which it is bound.
     * Instead, use <tt>unbind()</tt> to remove the
     * binding of the foreign context.  Destroying the foreign context
     * requires that the <tt>destroySubcontext()</tt> be performed
     * on a context from the foreign context's "native" naming system.
     *
     * @param name
     *          the name of the context to be destroyed; may not be empty
     * @throws  NameNotFoundException if an intermediate context does not exist
     * @throws  NotContextException if the name is bound but does not name a
     *          context, or does not name a context of the appropriate type
     * @throws  ContextNotEmptyException if the named context is not empty
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #destroySubcontext(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public NamingEnumeration<Binding> listBindings(String name)

    /**
     * Enumerates the names bound in the named context, along with the
     * objects bound to them.
     * See {@link #listBindings(Name)} for details.
     *
     * @param name
     *          the name of the context to list
     * @return  an enumeration of the bindings in this context.
     *          Each element of the enumeration is of type
     *          <tt>Binding</tt>.
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public NamingEnumeration<Binding> listBindings(Name name)

    /**
     * Enumerates the names bound in the named context, along with the
     * objects bound to them.
     * The contents of any subcontexts are not included.
     *
     * <p> If a binding is added to or removed from this context,
     * its effect on an enumeration previously returned is undefined.
     *
     * @param name
     *          the name of the context to list
     * @return  an enumeration of the bindings in this context.
     *          Each element of the enumeration is of type
     *          <tt>Binding</tt>.
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #listBindings(String)
     * @see #list(Name)
     * @see Binding
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public NamingEnumeration<NameClassPair> list(String name)

    /**
     * Enumerates the names bound in the named context, along with the
     * class names of objects bound to them.
     * See {@link #list(Name)} for details.
     *
     * @param name
     *          the name of the context to list
     * @return  an enumeration of the names and class names of the
     *          bindings in this context.  Each element of the
     *          enumeration is of type <tt>NameClassPair</tt>.
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public NamingEnumeration<NameClassPair> list(Name name)

    /**
     * Enumerates the names bound in the named context, along with the
     * class names of objects bound to them.
     * The contents of any subcontexts are not included.
     *
     * <p> If a binding is added to or removed from this context,
     * its effect on an enumeration previously returned is undefined.
     *
     * @param name
     *          the name of the context to list
     * @return  an enumeration of the names and class names of the
     *          bindings in this context.  Each element of the
     *          enumeration is of type <tt>NameClassPair</tt>.
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #list(String)
     * @see #listBindings(Name)
     * @see NameClassPair
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void rename(String oldName, String newName) throws NamingException;

    /**
     * Binds a new name to the object bound to an old name, and unbinds
     * the old name.
     * See {@link #rename(Name, Name)} for details.
     *
     * @param oldName
     *          the name of the existing binding; may not be empty
     * @param newName
     *          the name of the new binding; may not be empty
     * @throws  NameAlreadyBoundException if <tt>newName</tt> is already bound
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void rename(Name oldName, Name newName) throws NamingException;

    /**
     * Binds a new name to the object bound to an old name, and unbinds
     * the old name.  Both names are relative to this context.
     * Any attributes associated with the old name become associated
     * with the new name.
     * Intermediate contexts of the old name are not changed.
     *
     * @param oldName
     *          the name of the existing binding; may not be empty
     * @param newName
     *          the name of the new binding; may not be empty
     * @throws  NameAlreadyBoundException if <tt>newName</tt> is already bound
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #rename(String, String)
     * @see #bind(Name, Object)
     * @see #rebind(Name, Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void unbind(String name) throws NamingException;

    /**
     * Unbinds the named object.
     * See {@link #unbind(Name)} for details.
     *
     * @param name
     *          the name to unbind; may not be empty
     * @throws  NameNotFoundException if an intermediate context does not exist
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void unbind(Name name) throws NamingException;

    /**
     * Unbinds the named object.
     * Removes the terminal atomic name in <code>name</code>
     * from the target context--that named by all but the terminal
     * atomic part of <code>name</code>.
     *
     * <p> This method is idempotent.
     * It succeeds even if the terminal atomic name
     * is not bound in the target context, but throws
     * <tt>NameNotFoundException</tt>
     * if any of the intermediate contexts do not exist.
     *
     * <p> Any attributes associated with the name are removed.
     * Intermediate contexts are not changed.
     *
     * @param name
     *          the name to unbind; may not be empty
     * @throws  NameNotFoundException if an intermediate context does not exist
     * @throws  NamingException if a naming exception is encountered
     * @see #unbind(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void rebind(String name, Object obj) throws NamingException;

    /**
     * Binds a name to an object, overwriting any existing binding.
     * See {@link #rebind(Name, Object)} for details.
     *
     * @param name
     *          the name to bind; may not be empty
     * @param obj
     *          the object to bind; possibly null
     * @throws  javax.naming.directory.InvalidAttributesException
     *          if object did not supply all mandatory attributes
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void rebind(Name name, Object obj) throws NamingException;

    /**
     * Binds a name to an object, overwriting any existing binding.
     * All intermediate contexts and the target context (that named by all
     * but terminal atomic component of the name) must already exist.
     *
     * <p> If the object is a <tt>DirContext</tt>, any existing attributes
     * associated with the name are replaced with those of the object.
     * Otherwise, any existing attributes associated with the name remain
     * unchanged.
     *
     * @param name
     *          the name to bind; may not be empty
     * @param obj
     *          the object to bind; possibly null
     * @throws  javax.naming.directory.InvalidAttributesException
     *          if object did not supply all mandatory attributes
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #rebind(String, Object)
     * @see #bind(Name, Object)
     * @see javax.naming.directory.DirContext#rebind(Name, Object,
     *          javax.naming.directory.Attributes)
     * @see javax.naming.directory.DirContext
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void bind(String name, Object obj) throws NamingException;

    /**
     * Binds a name to an object.
     * See {@link #bind(Name, Object)} for details.
     *
     * @param name
     *          the name to bind; may not be empty
     * @param obj
     *          the object to bind; possibly null
     * @throws  NameAlreadyBoundException if name is already bound
     * @throws  javax.naming.directory.InvalidAttributesException
     *          if object did not supply all mandatory attributes
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public void bind(Name name, Object obj) throws NamingException;

    /**
     * Binds a name to an object.
     * All intermediate contexts and the target context (that named by all
     * but terminal atomic component of the name) must already exist.
     *
     * @param name
     *          the name to bind; may not be empty
     * @param obj
     *          the object to bind; possibly null
     * @throws  NameAlreadyBoundException if name is already bound
     * @throws  javax.naming.directory.InvalidAttributesException
     *          if object did not supply all mandatory attributes
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #bind(String, Object)
     * @see #rebind(Name, Object)
     * @see javax.naming.directory.DirContext#bind(Name, Object,
     *          javax.naming.directory.Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Object lookup(String name) throws NamingException;

    /**
     * Retrieves the named object.
     * See {@link #lookup(Name)} for details.
     * @param name
     *          the name of the object to look up
     * @return  the object bound to <tt>name</tt>
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
    public Object lookup(Name name) throws NamingException;

    /**
     * Retrieves the named object.
     * If <tt>name</tt> is empty, returns a new instance of this context
     * (which represents the same naming context as this context, but its
     * environment may be modified independently and it may be accessed
     * concurrently).
     *
     * @param name
     *          the name of the object to look up
     * @return  the object bound to <tt>name</tt>
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #lookup(String)
     * @see #lookupLink(Name)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Context.java
public interface Context {

/**
 * This interface represents a naming context, which
 * consists of a set of name-to-object bindings.
 * It contains methods for examining and updating these bindings.
 *
 * <h1>Names</h1>
 * Each name passed as an argument to a <tt>Context</tt> method is relative
 * to that context.  The empty name is used to name the context itself.
 * A name parameter may never be null.
 * <p>
 * Most of the methods have overloaded versions with one taking a
 * <code>Name</code> parameter and one taking a <code>String</code>.
 * These overloaded versions are equivalent in that if
 * the <code>Name</code> and <code>String</code> parameters are just
 * different representations of the same name, then the overloaded
 * versions of the same methods behave the same.
 * In the method descriptions below, only one version is fully documented.
 * The second version instead has a link to the first:  the same
 * documentation applies to both.
 * <p>
 * For systems that support federation, <tt>String</tt> name arguments to
 * <tt>Context</tt> methods are composite names. Name arguments that are
 * instances of <tt>CompositeName</tt> are treated as composite names,
 * while <tt>Name</tt> arguments that are not instances of
 * <tt>CompositeName</tt> are treated as compound names (which might be
 * instances of <tt>CompoundName</tt> or other implementations of compound
 * names). This allows the results of <tt>NameParser.parse()</tt> to be used as
 * arguments to the <tt>Context</tt> methods.
 * Prior to JNDI 1.2, all name arguments were treated as composite names.
 *<p>
 * Furthermore, for systems that support federation, all names returned
 * in a <tt>NamingEnumeration</tt>
 * from <tt>list()</tt> and <tt>listBindings()</tt> are composite names
 * represented as strings.
 * See <tt>CompositeName</tt> for the string syntax of names.
 *<p>
 * For systems that do not support federation, the name arguments (in
 * either <tt>Name</tt> or <tt>String</tt> forms) and the names returned in
 * <tt>NamingEnumeration</tt> may be names in their own namespace rather than
 * names in a composite namespace, at the discretion of the service
 * provider.
 *
 *<h1>Exceptions</h1>
 * All the methods in this interface can throw a <tt>NamingException</tt> or
 * any of its subclasses. See <tt>NamingException</tt> and their subclasses
 * for details on each exception.
 *
 *<h1>Concurrent Access</h1>
 * A Context instance is not guaranteed to be synchronized against
 * concurrent access by multiple threads.  Threads that need to access
 * a single Context instance concurrently should synchronize amongst
 * themselves and provide the necessary locking.  Multiple threads
 * each manipulating a different Context instance need not
 * synchronize.  Note that the {@link #lookup(Name) <tt>lookup</tt>}
 * method, when passed an empty name, will return a new Context instance
 * representing the same naming context.
 *<p>
 * For purposes of concurrency control,
 * a Context operation that returns a <tt>NamingEnumeration</tt> is
 * not considered to have completed while the enumeration is still in
 * use, or while any referrals generated by that operation are still
 * being followed.
 *
 *
 *<h1>Parameters</h1>
 * A <tt>Name</tt> parameter passed to any method of the
 * <tt>Context</tt> interface or one of its subinterfaces
 * will not be modified by the service provider.
 * The service provider may keep a reference to it
 * for the duration of the operation, including any enumeration of the
 * method's results and the processing of any referrals generated.
 * The caller should not modify the object during this time.
 * A <tt>Name</tt> returned by any such method is owned by the caller.
 * The caller may subsequently modify it; the service provider may not.
 *
 *
 *<h1>Environment Properties</h1>
 *<p>
 * JNDI applications need a way to communicate various preferences
 * and properties that define the environment in which naming and
 * directory services are accessed. For example, a context might
 * require specification of security credentials in order to access
 * the service. Another context might require that server configuration
 * information be supplied. These are referred to as the <em>environment</em>
 * of a context. The <tt>Context</tt> interface provides methods for
 * retrieving and updating this environment.
 *<p>
 * The environment is inherited from the parent context as
 * context methods proceed from one context to the next. Changes to
 * the environment of one context do not directly affect those
 * of other contexts.
 *<p>
 * It is implementation-dependent when environment properties are used
 * and/or verified for validity.  For example, some of the
 * security-related properties are used by service providers to "log in"
 * to the directory.  This login process might occur at the time the
 * context is created, or the first time a method is invoked on the
 * context.  When, and whether this occurs at all, is
 * implementation-dependent.  When environment properties are added or
 * removed from the context, verifying the validity of the changes is again
 * implementation-dependent. For example, verification of some properties
 * might occur at the time the change is made, or at the time the next
 * operation is performed on the context, or not at all.
 *<p>
 * Any object with a reference to a context may examine that context's
 * environment.  Sensitive information such as clear-text
 * passwords should not be stored there unless the implementation is
 * known to protect it.
 *
 *<p>
 *<a name=RESOURCEFILES></a>
 *<h1>Resource Files</h1>
 *<p>
 * To simplify the task of setting up the environment
 * required by a JNDI application,
 * application components and service providers may be distributed
 * along with <em>resource files.</em>
 * A JNDI resource file is a file in the properties file format (see
 * {@link java.util.Properties#load <tt>java.util.Properties</tt>}),
 * containing a list of key/value pairs.
 * The key is the name of the property (e.g. "java.naming.factory.object")
 * and the value is a string in the format defined
 * for that property.  Here is an example of a JNDI resource file:
 *
 * <blockquote>{@code
 * java.naming.factory.object=com.sun.jndi.ldap.AttrsToCorba:com.wiz.from.Person
 * java.naming.factory.state=com.sun.jndi.ldap.CorbaToAttrs:com.wiz.from.Person
 * java.naming.factory.control=com.sun.jndi.ldap.ResponseControlFactory
 * }</blockquote>
 *
 * The JNDI class library reads the resource files and makes the property
 * values freely available.  Thus JNDI resource files should be considered
 * to be "world readable", and sensitive information such as clear-text
 * passwords should not be stored there.
 *<p>
 * There are two kinds of JNDI resource files:
 * <em>provider</em> and <em>application</em>.
 *
 * <h2>Provider Resource Files</h2>
 *
 * Each service provider has an optional resource that lists properties
 * specific to that provider.  The name of this resource is:
 * <blockquote>
 * [<em>prefix</em>/]<tt>jndiprovider.properties</tt>
 * </blockquote>
 * where <em>prefix</em> is
 * the package name of the provider's context implementation(s),
 * with each period (".") converted to a slash ("/").
 *
 * For example, suppose a service provider defines a context
 * implementation with class name <tt>com.sun.jndi.ldap.LdapCtx</tt>.
 * The provider resource for this provider is named
 * <tt>com/sun/jndi/ldap/jndiprovider.properties</tt>.  If the class is
 * not in a package, the resource's name is simply
 * <tt>jndiprovider.properties</tt>.
 *
 * <p>
 * <a name=LISTPROPS></a>
 * Certain methods in the JNDI class library make use of the standard
 * JNDI properties that specify lists of JNDI factories:
 * <ul>
 * <li>java.naming.factory.object
 * <li>java.naming.factory.state
 * <li>java.naming.factory.control
 * <li>java.naming.factory.url.pkgs
 * </ul>
 * The JNDI library will consult the provider resource file
 * when determining the values of these properties.
 * Properties other than these may be set in the provider
 * resource file at the discretion of the service provider.
 * The service provider's documentation should clearly state which
 * properties are allowed; other properties in the file will be ignored.
 *
 * <h2>Application Resource Files</h2>
 *
 * When an application is deployed, it will generally have several
 * codebase directories and JARs in its classpath.  Similarly, when an
 * applet is deployed, it will have a codebase and archives specifying
 * where to find the applet's classes.  JNDI locates (using
 * {@link ClassLoader#getResources <tt>ClassLoader.getResources()</tt>})
 * all <em>application resource files</em> named <tt>jndi.properties</tt>
 * in the classpath.
 * In addition, if the file <i>java.home</i><tt>/lib/jndi.properties</tt>
 * exists and is readable,
 * JNDI treats it as an additional application resource file.
 * (<i>java.home</i> indicates the
 * directory named by the <tt>java.home</tt> system property.)
 * All of the properties contained in these files are placed
 * into the environment of the initial context.  This environment
 * is then inherited by other contexts.
 *
 * <p>
 * For each property found in more than one application resource file,
 * JNDI uses the first value found or, in a few cases where it makes
 * sense to do so, it concatenates all of the values (details are given
 * below).
 * For example, if the "java.naming.factory.object" property is found in
 * three <tt>jndi.properties</tt> resource files, the
 * list of object factories is a concatenation of the property
 * values from all three files.
 * Using this scheme, each deployable component is responsible for
 * listing the factories that it exports.  JNDI automatically
 * collects and uses all of these export lists when searching for factory
 * classes.
 *
 * <h2>Search Algorithm for Properties</h2>
 *
 * When JNDI constructs an initial context, the context's environment
 * is initialized with properties defined in the environment parameter
 * passed to the constructor, the system properties, the applet parameters,
 * and the application resource files.  See
 * <a href=InitialContext.html#ENVIRONMENT><tt>InitialContext</tt></a>
 * for details.
 * This initial environment is then inherited by other context instances.
 *
 * <p>
 * When the JNDI class library needs to determine
 * the value of a property, it does so by merging
 * the values from the following two sources, in order:
 * <ol>
 * <li>The environment of the context being operated on.
 * <li>The provider resource file (<tt>jndiprovider.properties</tt>)
 * for the context being operated on.
 * </ol>
 * For each property found in both of these two sources,
 * JNDI determines the property's value as follows.  If the property is
 * one of the standard JNDI properties that specify a list of JNDI
 * factories (listed <a href=#LISTPROPS>above</a>), the values are
 * concatenated into a single colon-separated list.  For other
 * properties, only the first value found is used.
 *
 * <p>
 * When a service provider needs to determine the value of a property,
 * it will generally take that value directly from the environment.
 * A service provider may define provider-specific properties
 * to be placed in its own provider resource file.  In that
 * case it should merge values as described in the previous paragraph.
 *
 * <p>
 * In this way, each service provider developer can specify a list of
 * factories to use with that service provider. These can be modified by
 * the application resources specified by the deployer of the application
 * or applet, which in turn can be modified by the user.
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 * @author R. Vasudevan
 *
 * @since 1.3
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
    abstract public NVList get_values(String start_scope, int op_flags,
                                      String pattern);

    /**
     * Retrieves the <code>NamedValue</code> objects whose
     * <code>name</code> field matches the given name or name
     * pattern.   This method allows for wildcard searches,
     * which means that there can be multiple matches and
     * therefore multiple values returned. If the
     * property is not found at the indicated level, the search
     * continues up the context object tree until a match is found or
     * all <code>Context</code> objects in the chain have been exhausted.
     * <P>
     * If no match is found, an error is returned and no property list
     * is returned.
     *
     * @param start_scope               a <code>String</code> object indicating the
     *                context object level at which to initiate the
     *                          search for the specified properties
     *                          (for example, "_USER", "_GROUP", "_SYSTEM"). Valid scope
     *                          names are implementation-specific. If a
     *                          scope name is omitted, the search
     *                          begins with the specified context
     *                          object. If the specified scope name is
     *                          not found, an exception is returned.
     * @param op_flags       an operation flag.  The one flag
     *                that may be specified is <code>CTX_RESTRICT_SCOPE</code>.
     *                If this flag is specified, searching is limited to the
     *                          specified <code>start_scope</code> or this
     *                <code>Context</code> object.
     * @param pattern           the property name whose values are to
     *                          be retrieved. <code>pattern</code> may be a
     *                name or a name with a
     *                          trailing wildcard character ("*").
     *
     * @return          an <code>NVList</code> containing all the property values
     *                (in the form of <code>NamedValue</code> objects)
     *                whose associated property name matches the given name or
     *                name pattern
     * @see #set_values
     * @see org.omg.CORBA.NamedValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
    public abstract void delete_values(String propname);

    /**
     * Deletes from this <code>Context</code> object the
     * <code>NamedValue</code> object(s) whose
     * <code>name</code> field matches the given property name.
     * If the <code>String</code> object supplied for
     * <code>propname</code> has a
     * trailing wildcard character ("*"), then
     * all <code>NamedValue</code> objects whose <code>name</code>
     * fields match will be deleted. The search scope is always
     * limited to this <code>Context</code> object.
     * <P>
     * If no matching property is found, an exception is returned.
     *
     * @param propname          name of the property to be deleted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
    public abstract void set_values(NVList values);

    /**
       I Sets one or more property values in this <code>Context</code>
       * object. The <code>NVList</code> supplied to this method
       * contains one or more <code>NamedValue</code> objects.
       * In each <code>NamedValue</code> object,
       * the <code>name</code> field holds the name of the property, and
       * the <code>flags</code> field must be set to zero.
       * The <code>NamedValue</code> object's <code>value</code> field
       * contains an <code>Any</code> object, which, in turn, contains the value
       * for the property.  Since the value is always a string,
       * the <code>Any</code> object must have the <code>kind</code>
       * field of its <code>TypeCode</code> set to <code>TCKind.tk_string</code>.
       *
       * @param values          an NVList containing the property
       *                                    names and associated values to be set
       *
       * @see #get_values
       * @see org.omg.CORBA.NamedValue
       * @see org.omg.CORBA.Any
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
    public abstract void set_one_value(String propname, Any propvalue);

    /**
     * Creates a <code>NamedValue</code> object and adds it to this
     * <code>Context</code> object.  The <code>name</code> field of the
     * new <code>NamedValue</code> object is set to the given string,
     * the <code>value</code> field is set to the given <code>Any</code>
     * object, and the <code>flags</code> field is set to zero.
     *
     * @param propname          the name of the property to be set
     * @param propvalue         the <code>Any</code> object to which the
     *                        value of the property will be set.  The
     *                        <code>Any</code> object's <code>value</code>
     *                        field contains the value to be associated
     *                        with the given propname; the
     *                        <code>kind</code> field must be set to
     *                        <code>TCKind.tk_string</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
    public abstract Context create_child(String child_ctx_name);

    /**
     * Creates a <code>Context</code> object with the given string as its
     * name and with this <code>Context</code> object set as its parent.
     * <P>
     * The new <code>Context</code> object is chained into its parent
     * <code>Context</code> object.  This means that in a search for
     * matching property names, if a match is not found in this context,
     * the search will continue in the parent.  If that is not successful,
     * the search will continue in the grandparent, if there is one, and
     * so on.
     *
     *
     * @param child_ctx_name    the <code>String</code> object to be set as
     *                        the name of the new <code>Context</code> object
     * @return                  the newly-created child <code>Context</code> object
     *                    initialized with the specified name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
    public abstract Context parent();

    /**
     * Retrieves the parent of this <code>Context</code> object.
     *
     * @return                  the <code>Context</code> object that is the
     *                    parent of this <code>Context</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
    public abstract String context_name();

    /**
     * Retrieves the name of this <code>Context</code> object.
     *
     * @return                  the name of this <code>Context</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Context.java
public abstract class Context {

/**
 * An object used in <code>Request</code> operations
 * to specify the context object in which context strings
 * must be resolved before being sent along with the request invocation.
 * A <code>Context</code> object
 * contains a list of properties in the form of <code>NamedValue</code>
 * objects. These properties represent information
 * about the client, the environment, or the circumstances of a request
 * and generally are properties that might be inconvenient
 * to pass as parameters.
 * <P>
 * A <code>Context</code> object is created by first calling the
 * <code>ORB</code> method <code>get_default_context</code>
 * and then calling the method <code>create_child</code> on the
 * default context.
 * <P>
 * Each property in a <code>Context</code> object is represented by
 * a <code>NamedValue</code> object.  The property name is contained
 * in the <code>NamedValue</code> object's <code>name</code> field, and
 * the value associated with the name is contained in the <code>Any</code>
 * object that was assigned to the <code>NamedValue</code> object's
 * <code>value</code> field.
 * <P>
 * <code>Context</code> properties can represent a portion of a client's
 * or application's environment that is meant to be propagated to
 * (and made implicitly part of) a server's environment.
 * (Examples might be a window identifier or user preference information).
 * Once a server has been invoked (that is, after the properties are
 * propagated), the server may query its <code>Context</code> object
 * for these properties using the method <code>get_values</code>.
 *
 *<P>
 * When an operation declaration includes a context clause,
 * the stubs and skeletons will have an additional argument
 * added for the context.  When an operation invocation occurs,
 * the ORB causes the properties that were named in the operation
 * definition in IDL and
 * that are present in the client's <code>Context</code> object
 * to be provided in the <code>Context</code> object parameter to
 * the invoked method.
 * <P>
 * <code>Context</code> property names (which are strings)
 * typically have the form of an OMG IDL identifier or
 * a series of OMG IDL identifiers separated by periods.
 * A context property name pattern is either a property name
 * or a property name followed by a single "*".  A property
 * name pattern without a trailing "*" is said to match only
 * itself.  A property name pattern of the form "&lt;name&gt;*" matches any
 * property name that starts with &lt;name&gt; and continues with zero
 * or more additional characters.
 * <P>
 * Property name patterns are used in the context clause of
 * an operation definition and as a parameter for the
 * method <code>Context.get_values</code>.
 * <P>
 * <code>Context</code> objects may be "chained" together to achieve a
 * particular defaulting behavior.  A <code>Context</code>
 * object created with the method <code>create_child</code> will
 * be chained to its parent (the <code>Context</code> object
 * that created it), and that means that the parent will be searched
 * after the child in a search for property names.
 *<P>
 * Properties defined in a particular <code>Context</code> object
 * effectively override those properties in the next higher level.
 * The scope used in a search for properties may be restricted by specifying a
 * starting scope and by using the flag <code>CTX_RESTRICT_SCOPE</code>
 * when invoking the method <code>get_values</code>.
 * <P>
 * A <code>Context</code> object may be named for purposes of specifying
 * a starting search scope.
 *
 * @since   JDK1.2
 */
