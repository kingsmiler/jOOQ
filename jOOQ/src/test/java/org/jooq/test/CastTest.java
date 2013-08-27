/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 * 
 * This work is dual-licensed Open Source, under LGPL and jOOQ EULA
 * =============================================================================
 * You may freely choose which license applies to you. For more information 
 * about licensing, please visit http://www.jooq.org/licenses
 * 
 * LGPL:  
 * -----------------------------------------------------------------------------
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.
 * If not, see http://www.gnu.org/licenses.
 * 
 * jOOQ End User License Agreement:
 * -----------------------------------------------------------------------------
 * This library is commercial software; you may not redistribute it nor
 * modify it.
 * 
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ End User
 * License Agreement for more details.
 * 
 * You should have received a copy of the jOOQ End User License Agreement
 * along with this library.
 * If not, see http://www.jooq.org/eula
 */
package org.jooq.test;

import static org.jooq.test.data.Table1.FIELD_ID1;
import static org.junit.Assert.assertEquals;

import org.jooq.impl.SQLDataType;

import org.junit.Test;


/**
 * Unit tests for casting.
 *
 * @author Lukas Eder
 */
public class CastTest extends AbstractTest {

    @Test
    public void testCastDecimal() {
        assertEquals("cast(\"TABLE1\".\"ID1\" as decimal)", create.render(FIELD_ID1.cast(SQLDataType.DECIMAL)));
        assertEquals("cast(\"TABLE1\".\"ID1\" as decimal(2))", create.render(FIELD_ID1.cast(SQLDataType.DECIMAL.precision(2))));
        assertEquals("cast(\"TABLE1\".\"ID1\" as decimal(2, 1))", create.render(FIELD_ID1.cast(SQLDataType.DECIMAL.precision(2, 1))));
    }
}