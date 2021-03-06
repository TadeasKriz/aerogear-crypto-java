/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.crypto;

import org.junit.Test;

import static org.jboss.aerogear.crypto.BlockCipher.Mode;
import static org.junit.Assert.assertEquals;

public class BlockModeTest {

    @Test
    public void testGcmToString() throws Exception {
        String expectedMode = "GCM/NoPadding";
        Mode mode = Mode.GCM;
        assertEquals("Should return formatted block mode", expectedMode, mode.toString());
    }
}
