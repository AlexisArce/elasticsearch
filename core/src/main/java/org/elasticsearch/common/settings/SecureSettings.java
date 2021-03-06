/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.common.settings;

import java.io.Closeable;
import java.security.GeneralSecurityException;

/**
 * An accessor for settings which are securely stored. See {@link SecureSetting}.
 */
public interface SecureSettings extends Closeable {

    /** Returns true iff the settings are loaded and retrievable. */
    boolean isLoaded();

    /** Returns true iff the given setting exists in this secure settings. */
    boolean hasSetting(String setting);

    /** Return a string setting. The {@link SecureString} should be closed once it is used. */
    SecureString getString(String setting) throws GeneralSecurityException;
}
