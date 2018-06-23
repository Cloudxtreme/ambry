/**
 * Copyright 2017 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.github.ambry.store;

import java.util.Collection;
import java.util.Map;


/**
 * This is a service that can be used to convert store keys across different formats.
 * </p>
 * Typical usage will be to map b/w different formats of keys that refer to the same blob. The input/output
 * formats are expected to be set when the converter is constructed.
 */
public interface StoreKeyConverter {

  /**
   * Returns a mapping for every {@link StoreKey} in {@code input}. If a {@link StoreKey}
   * is already in the format desired or no mapping exists, returns the same {@link StoreKey}
   * as the mapping.
   * @param input the {@link StoreKey}s that need to be converted.
   * @return a mapping for each {@link StoreKey} in the new format.
   * @throws Exception that may be thrown when performing the conversion operation
   */
  public Map<StoreKey, StoreKey> convert(Collection<? extends StoreKey> input) throws Exception;
}