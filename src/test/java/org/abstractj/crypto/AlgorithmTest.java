/**
 * Copyright 2013 Bruno Oliveira, and individual contributors
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.abstractj.crypto;

import org.junit.Test;

import static org.abstractj.crypto.Algorithm.AES;
import static org.junit.Assert.assertEquals;

public class AlgorithmTest {
    @Test
    public void testAESToString() throws Exception {
        assertEquals("Should return the correct algorithm name", "AES", AES.toString());
    }

    @Test
    public void testGetAESKeySize() throws Exception {
        assertEquals("Should return the correct key size", 128, AES.getKeySize());
    }
}
