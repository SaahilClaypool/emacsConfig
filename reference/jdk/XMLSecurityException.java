_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public Exception getOriginalException() {

    /**
     * Method getOriginalException
     *
     * @return the original exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public void printStackTrace(PrintStream printstream) {

    /**
     * Method printStackTrace
     *
     * @param printstream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public void printStackTrace(PrintWriter printwriter) {

    /**
     * Method printStackTrace
     *
     * @param printwriter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public void printStackTrace() {

    /**
     * Method printStackTrace
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public String toString() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public String getMsgID() {

    /**
     * Method getMsgID
     *
     * @return the messageId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID, Object exArgs[], Exception originalException) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param exArgs
     * @param originalException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID, Exception originalException) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param originalException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(Exception originalException) {

    /**
     * Constructor XMLSecurityException
     *
     * @param originalException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID, Object exArgs[]) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param exArgs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException() {

    /**
     * Constructor XMLSecurityException
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    protected String msgID;

    /** Field msgID */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    private static final long serialVersionUID = 1L;

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
public class XMLSecurityException extends Exception {

/**
 * The mother of all Exceptions in this bundle. It allows exceptions to have
 * their messages translated to the different locales.
 *
 * The <code>xmlsecurity_en.properties</code> file contains this line:
 * <pre>
 * xml.WrongElement = Can't create a {0} from a {1} element
 * </pre>
 *
 * Usage in the Java source is:
 * <pre>
 * {
 *    Object exArgs[] = { Constants._TAG_TRANSFORMS, "BadElement" };
 *
 *    throw new XMLSecurityException("xml.WrongElement", exArgs);
 * }
 * </pre>
 *
 * Additionally, if another Exception has been caught, we can supply it, too>
 * <pre>
 * try {
 *    ...
 * } catch (Exception oldEx) {
 *    Object exArgs[] = { Constants._TAG_TRANSFORMS, "BadElement" };
 *
 *    throw new XMLSecurityException("xml.WrongElement", exArgs, oldEx);
 * }
 * </pre>
 *
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
package com.sun.org.apache.xml.internal.security.exceptions;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public Exception getOriginalException() {

    /**
     * Method getOriginalException
     *
     * @return the original exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public void printStackTrace(PrintStream printstream) {

    /**
     * Method printStackTrace
     *
     * @param printstream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public void printStackTrace(PrintWriter printwriter) {

    /**
     * Method printStackTrace
     *
     * @param printwriter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public void printStackTrace() {

    /**
     * Method printStackTrace
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public String toString() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public String getMsgID() {

    /**
     * Method getMsgID
     *
     * @return the messageId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID, Object exArgs[], Exception originalException) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param exArgs
     * @param originalException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID, Exception originalException) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param originalException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(Exception originalException) {

    /**
     * Constructor XMLSecurityException
     *
     * @param originalException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID, Object exArgs[]) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     * @param exArgs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException(String msgID) {

    /**
     * Constructor XMLSecurityException
     *
     * @param msgID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    public XMLSecurityException() {

    /**
     * Constructor XMLSecurityException
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    protected String msgID;

    /** Field msgID */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
    private static final long serialVersionUID = 1L;

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
public class XMLSecurityException extends Exception {

/**
 * The mother of all Exceptions in this bundle. It allows exceptions to have
 * their messages translated to the different locales.
 *
 * The <code>xmlsecurity_en.properties</code> file contains this line:
 * <pre>
 * xml.WrongElement = Can't create a {0} from a {1} element
 * </pre>
 *
 * Usage in the Java source is:
 * <pre>
 * {
 *    Object exArgs[] = { Constants._TAG_TRANSFORMS, "BadElement" };
 *
 *    throw new XMLSecurityException("xml.WrongElement", exArgs);
 * }
 * </pre>
 *
 * Additionally, if another Exception has been caught, we can supply it, too>
 * <pre>
 * try {
 *    ...
 * } catch (Exception oldEx) {
 *    Object exArgs[] = { Constants._TAG_TRANSFORMS, "BadElement" };
 *
 *    throw new XMLSecurityException("xml.WrongElement", exArgs, oldEx);
 * }
 * </pre>
 *
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/exceptions/XMLSecurityException.java
package com.sun.org.apache.xml.internal.security.exceptions;

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
