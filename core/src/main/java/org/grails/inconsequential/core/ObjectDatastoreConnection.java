/* Copyright (C) 2010 SpringSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.inconsequential.core;

import org.grails.inconsequential.engine.Persister;
import org.grails.inconsequential.mapping.MappingContext;

import java.util.List;

/**
 * Extends the Datastore interface adding operations for persisting
 * objects using
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface ObjectDatastoreConnection<T> extends Connection {

    /**
     * Obtains the MappingContext instance
     *
     * @return The MappingContext
     */
    MappingContext getMappingContext();

    /**
     * Creates a key that wraps a native key
     * @param nativeKey the native key
     * @return The key
     */
    Key<T> createKey(T nativeKey);

    /**
     * Stores and object and returns its key
     *
     * @param o The object
     * @return The the generated key
     */
    Key<T> persist(Object o);

    /**
     * Retrieves an individual object
     *
     * @param type The ty
     * @param key The key
     * @return The object
     */
    Object retrieve(Class type, Key<T> key);

    /**
     * Deletes one or many objects
     *
     * @param objects The objects to delete
     */
    void delete(Object... objects);
}