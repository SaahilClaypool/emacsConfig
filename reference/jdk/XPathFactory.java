_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
    public abstract XPathAPI newXPathAPI();

    /**
     * Get a new XPathAPI instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
    public static XPathFactory newInstance() {

    /**
     * Get a new XPathFactory instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
public abstract class XPathFactory {

/**
 * A Factory to return an XPathAPI instance. If Xalan is available it returns XalanXPathAPI. If not, then
 * it returns JDKXPathAPI.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
package com.sun.org.apache.xml.internal.security.utils;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathFactory.java
  XPath create(String exprString, SourceLocator locator,
               PrefixResolver prefixResolver, int type);

  /**
   * Create an XPath.
   *
   * @param exprString The XPath expression string.
   * @param locator The location of the expression string, mainly for diagnostic
   *                purposes.
   * @param prefixResolver This will be called in order to resolve prefixes
   *        to namespace URIs.
   * @param type One of {@link com.sun.org.apache.xpath.internal.XPath#SELECT} or
   *             {@link com.sun.org.apache.xpath.internal.XPath#MATCH}.
   *
   * @return an XPath ready for execution.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathFactory.java
public interface XPathFactory

/**
 * Factory class for creating an XPath.  Implementors of XPath derivatives
 * will need to make a derived class of this.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
    public abstract XPathAPI newXPathAPI();

    /**
     * Get a new XPathAPI instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
    public static XPathFactory newInstance() {

    /**
     * Get a new XPathFactory instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
public abstract class XPathFactory {

/**
 * A Factory to return an XPathAPI instance. If Xalan is available it returns XalanXPathAPI. If not, then
 * it returns JDKXPathAPI.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathFactory.java
package com.sun.org.apache.xml.internal.security.utils;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathFactory.java
  XPath create(String exprString, SourceLocator locator,
               PrefixResolver prefixResolver, int type);

  /**
   * Create an XPath.
   *
   * @param exprString The XPath expression string.
   * @param locator The location of the expression string, mainly for diagnostic
   *                purposes.
   * @param prefixResolver This will be called in order to resolve prefixes
   *        to namespace URIs.
   * @param type One of {@link com.sun.org.apache.xpath.internal.XPath#SELECT} or
   *             {@link com.sun.org.apache.xpath.internal.XPath#MATCH}.
   *
   * @return an XPath ready for execution.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathFactory.java
public interface XPathFactory

/**
 * Factory class for creating an XPath.  Implementors of XPath derivatives
 * will need to make a derived class of this.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public abstract XPath newXPath();

    /**
    * <p>Return a new <code>XPath</code> using the underlying object
    * model determined when the <code>XPathFactory</code> was instantiated.</p>
    *
    * @return New instance of an <code>XPath</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public abstract void setXPathFunctionResolver(XPathFunctionResolver resolver);

    /**
     * <p>Establish a default function resolver.</p>
     *
     * <p>Any <code>XPath</code> objects constructed from this factory will
     * use the specified resolver by default.</p>
     *
     * <p>A <code>NullPointerException</code> is thrown if
     * <code>resolver</code> is <code>null</code>.</p>
     *
     * @param resolver XPath function resolver.
     *
     * @throws NullPointerException If <code>resolver</code> is
     *   <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public abstract void setXPathVariableResolver(XPathVariableResolver resolver);

    /**
     * <p>Establish a default variable resolver.</p>
     *
     * <p>Any <code>XPath</code> objects constructed from this factory will use
     * the specified resolver by default.</p>
     *
     * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code>
     * is <code>null</code>.</p>
     *
     * @param resolver Variable resolver.
     *
     * @throws NullPointerException If <code>resolver</code> is
     *   <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public abstract boolean getFeature(String name)

    /**
     * <p>Get the state of the named feature.</p>
     *
     * <p>
     * Feature names are fully qualified {@link java.net.URI}s.
     * Implementations may define their own features.
     * An {@link XPathFactoryConfigurationException} is thrown if this
     * <code>XPathFactory</code> or the <code>XPath</code>s
     * it creates cannot support the feature.
     * It is possible for an <code>XPathFactory</code> to expose a feature value
     * but be unable to change its state.
     * </p>
     *
     * @param name Feature name.
     *
     * @return State of the named feature.
     *
     * @throws XPathFactoryConfigurationException if this
     *   <code>XPathFactory</code> or the <code>XPath</code>s
     *   it creates cannot support this feature.
     * @throws NullPointerException if <code>name</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public abstract void setFeature(String name, boolean value)

    /**
     * <p>Set a feature for this <code>XPathFactory</code> and
     * <code>XPath</code>s created by this factory.</p>
     *
     * <p>
     * Feature names are fully qualified {@link java.net.URI}s.
     * Implementations may define their own features.
     * An {@link XPathFactoryConfigurationException} is thrown if this
     * <code>XPathFactory</code> or the <code>XPath</code>s
     * it creates cannot support the feature.
     * It is possible for an <code>XPathFactory</code> to expose a feature value
     * but be unable to change its state.
     * </p>
     *
     * <p>
     * All implementations are required to support the {@link javax.xml.XMLConstants#FEATURE_SECURE_PROCESSING} feature.
     * When the feature is <code>true</code>, any reference to  an external function is an error.
     * Under these conditions, the implementation must not call the {@link XPathFunctionResolver}
     * and must throw an {@link XPathFunctionException}.
     * </p>
     *
     * @param name Feature name.
     * @param value Is feature state <code>true</code> or <code>false</code>.
     *
     * @throws XPathFactoryConfigurationException if this <code>XPathFactory</code> or the <code>XPath</code>s
     *   it creates cannot support this feature.
     * @throws NullPointerException if <code>name</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public abstract boolean isObjectModelSupported(String objectModel);

    /**
     * <p>Is specified object model supported by this <code>XPathFactory</code>?</p>
     *
     * @param objectModel Specifies the object model which the returned <code>XPathFactory</code> will understand.
     *
     * @return <code>true</code> if <code>XPathFactory</code> supports <code>objectModel</code>, else <code>false</code>.
     *
     * @throws NullPointerException If <code>objectModel</code> is <code>null</code>.
     * @throws IllegalArgumentException If <code>objectModel.length() == 0</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public static XPathFactory newInstance(String uri, String factoryClassName, ClassLoader classLoader)

    /**
     * <p>Obtain a new instance of a <code>XPathFactory</code> from a factory class name. <code>XPathFactory</code>
     * is returned if specified factory class supports the specified object model.
     * This function is useful when there are multiple providers in the classpath.
     * It gives more control to the application as it can specify which provider
     * should be loaded.</p>
     *
     *
     * <h2>Tip for Trouble-shooting</h2>
     * <p>Setting the <code>jaxp.debug</code> system property will cause
     * this method to print a lot of debug messages
     * to <code>System.err</code> about what it is doing and where it is looking at.</p>
     *
     * <p> If you have problems try:</p>
     * <pre>
     * java -Djaxp.debug=1 YourProgram ....
     * </pre>
     *
     * @param uri         Identifies the underlying object model. The specification only defines the URI
     *                    {@link #DEFAULT_OBJECT_MODEL_URI},<code>http://java.sun.com/jaxp/xpath/dom</code>
     *                    for the W3C DOM, the org.w3c.dom package, and implementations are free to introduce
     *                    other URIs for other object models.
     *
     * @param factoryClassName fully qualified factory class name that provides implementation of <code>javax.xml.xpath.XPathFactory</code>.
     *
     * @param classLoader <code>ClassLoader</code> used to load the factory class. If <code>null</code>
     *                     current <code>Thread</code>'s context classLoader is used to load the factory class.
     *
     *
     * @return New instance of a <code>XPathFactory</code>
     *
     * @throws XPathFactoryConfigurationException
     *                   if <code>factoryClassName</code> is <code>null</code>, or
     *                   the factory class cannot be loaded, instantiated
     *                   or the factory class does not support the object model specified
     *                   in the <code>uri</code> parameter.
     *
     * @throws NullPointerException If <code>uri</code> is <code>null</code>.
     * @throws IllegalArgumentException If <code>uri</code> is <code>null</code>
     *          or <code>uri.length() == 0</code>.
     *
     * @see #newInstance()
     * @see #newInstance(String uri)
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public static XPathFactory newInstance(final String uri)

    /**
    * <p>Get a new <code>XPathFactory</code> instance using the specified object model.</p>
    *
    * <p>To find a <code>XPathFactory</code> object,
    * this method looks the following places in the following order where "the class loader" refers to the context class loader:</p>
    * <ol>
    *   <li>
    *     If the system property {@link #DEFAULT_PROPERTY_NAME} + ":uri" is present,
    *     where uri is the parameter to this method, then its value is read as a class name.
    *     The method will try to create a new instance of this class by using the class loader,
    *     and returns it if it is successfully created.
    *   </li>
    *   <li>
    *     ${java.home}/lib/jaxp.properties is read and the value associated with the key being the system property above is looked for.
    *     If present, the value is processed just like above.
    *   </li>
    *   <li>
    *     Use the service-provider loading facilities, defined by the
    *     {@link java.util.ServiceLoader} class, to attempt to locate and load an
    *     implementation of the service using the {@linkplain
    *     java.util.ServiceLoader#load(java.lang.Class) default loading mechanism}:
    *     the service-provider loading facility will use the {@linkplain
    *     java.lang.Thread#getContextClassLoader() current thread's context class loader}
    *     to attempt to load the service. If the context class
    *     loader is null, the {@linkplain
    *     ClassLoader#getSystemClassLoader() system class loader} will be used.
    *     <br>
    *     Each potential service provider is required to implement the method
    *     {@link #isObjectModelSupported(String objectModel)}.
    *     The first service provider found that supports the specified object
    *     model is returned.
    *     <br>
    *     In case of {@link java.util.ServiceConfigurationError} an
    *     {@link XPathFactoryConfigurationException} will be thrown.
    *   </li>
    *   <li>
    *     Platform default <code>XPathFactory</code> is located in a platform specific way.
    *     There must be a platform default XPathFactory for the W3C DOM, i.e. {@link #DEFAULT_OBJECT_MODEL_URI}.
    *   </li>
    * </ol>
    * <p>If everything fails, an <code>XPathFactoryConfigurationException</code> will be thrown.</p>
    *
    * <p>Tip for Trouble-shooting:</p>
    * <p>See {@link java.util.Properties#load(java.io.InputStream)} for exactly how a property file is parsed.
    * In particular, colons ':' need to be escaped in a property file, so make sure the URIs are properly escaped in it.
    * For example:</p>
    * <pre>
    *   http\://java.sun.com/jaxp/xpath/dom=org.acme.DomXPathFactory
    * </pre>
    *
    * @param uri Identifies the underlying object model.
    *   The specification only defines the URI {@link #DEFAULT_OBJECT_MODEL_URI},
    *   <code>http://java.sun.com/jaxp/xpath/dom</code> for the W3C DOM,
    *   the org.w3c.dom package, and implementations are free to introduce other URIs for other object models.
    *
    * @return Instance of an <code>XPathFactory</code>.
    *
    * @throws XPathFactoryConfigurationException If the specified object model
    *      is unavailable, or if there is a configuration error.
    * @throws NullPointerException If <code>uri</code> is <code>null</code>.
    * @throws IllegalArgumentException If <code>uri</code> is <code>null</code>
    *   or <code>uri.length() == 0</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public static XPathFactory newInstance() {

    /**
     * <p>Get a new <code>XPathFactory</code> instance using the default object model,
     * {@link #DEFAULT_OBJECT_MODEL_URI},
     * the W3C DOM.</p>
     *
     * <p>This method is functionally equivalent to:</p>
     * <pre>
     *   newInstance(DEFAULT_OBJECT_MODEL_URI)
     * </pre>
     *
     * <p>Since the implementation for the W3C DOM is always available, this method will never fail.</p>
     *
     * @return Instance of an <code>XPathFactory</code>.
     *
     * @throws RuntimeException When there is a failure in creating an
     *   <code>XPathFactory</code> for the default object model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    protected XPathFactory() {

    /**
     * <p>Protected constructor as {@link #newInstance()} or {@link #newInstance(String uri)}
     * or {@link #newInstance(String uri, String factoryClassName, ClassLoader classLoader)}
     * should be used to create a new instance of an <code>XPathFactory</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    private static SecuritySupport ss = new SecuritySupport() ;

    /**
     *<p> Take care of restrictions imposed by java security model </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public static final String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";

    /**
     * <p>Default Object Model URI.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
    public static final String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";

    /**
     * <p>The default property name according to the JAXP spec.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactory.java
public abstract class XPathFactory {

/**
 * <p>An <code>XPathFactory</code> instance can be used to create
 * {@link javax.xml.xpath.XPath} objects.</p>
 *
 *<p>See {@link #newInstance(String uri)} for lookup mechanism.</p>
 *
 * <p>The {@link XPathFactory} class is not thread-safe. In other words,
 * it is the application's responsibility to ensure that at most
 * one thread is using a {@link XPathFactory} object at any
 * given moment. Implementations are encouraged to mark methods
 * as <code>synchronized</code> to protect themselves from broken clients.
 *
 * <p>{@link XPathFactory} is not re-entrant. While one of the
 * <code>newInstance</code> methods is being invoked, applications
 * may not attempt to recursively invoke a <code>newInstance</code> method,
 * even from the same thread.
 *
 * @author  <a href="mailto:Norman.Walsh@Sun.com">Norman Walsh</a>
 * @author  <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 *
 * @since 1.5
 */
