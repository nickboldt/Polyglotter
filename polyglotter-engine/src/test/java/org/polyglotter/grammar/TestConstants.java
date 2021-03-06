/*
 * Polyglotter (http://polyglotter.org)
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * See the AUTHORS.txt file in the distribution for a full listing of 
 * individual contributors.
 *
 * Polyglotter is free software. Unless otherwise indicated, all code in Polyglotter
 * is licensed to you under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * Polyglotter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.polyglotter.grammar;

import javax.xml.namespace.QName;

import org.polyglotter.operation.BaseOperation;

@SuppressWarnings( "javadoc" )
public interface TestConstants {
    
    QName ID = new QName( GrammarPart.NAMESPACE_URI, "TestId", GrammarPart.NAMESPACE_PREFIX );
    
    QName EMPTY_STRING_ID = new QName( ID.getNamespaceURI(), "EmptyString", ID.getPrefix() );
    String EMPTY_STRING_VALUE = "";
    TestStringTerm EMPTY_STRING = new TestStringTerm( EMPTY_STRING_ID, ID, EMPTY_STRING_VALUE );
    
    QName INT_1_ID = new QName( ID.getNamespaceURI(), "Int1", ID.getPrefix() );
    int INT_1_VALUE = 10;
    TestIntegerTerm INT_1 = new TestIntegerTerm( INT_1_ID, ID, INT_1_VALUE );
    
    QName INT_2_ID = new QName( ID.getNamespaceURI(), "Int2", ID.getPrefix() );
    int INT_2_VALUE = 25;
    TestIntegerTerm INT_2 = new TestIntegerTerm( INT_2_ID, ID, INT_2_VALUE );
    
    QName DOUBLE_1_ID = new QName( ID.getNamespaceURI(), "Double1", ID.getPrefix() );
    double DOUBLE_1_VALUE = 12.34D;
    TestDoubleTerm DOUBLE_1 = new TestDoubleTerm( DOUBLE_1_ID, ID, DOUBLE_1_VALUE );
    
    QName NULL_STRING_ID = new QName( ID.getNamespaceURI(), "NullString", ID.getPrefix() );
    String NULL_STRING_VALUE = null;
    TestStringTerm NULL_STRING = new TestStringTerm( NULL_STRING_ID, ID, NULL_STRING_VALUE );
    
    QName STRING_1_ID = new QName( ID.getNamespaceURI(), "String1", ID.getPrefix() );
    String STRING_1_VALUE = "value-1";
    TestStringTerm STRING_1 = new TestStringTerm( STRING_1_ID, ID, STRING_1_VALUE );
    
    QName STRING_2_ID = new QName( ID.getNamespaceURI(), "String2", ID.getPrefix() );
    String STRING_2_VALUE = "value-2";
    TestStringTerm STRING_2 = new TestStringTerm( STRING_2_ID, ID, STRING_2_VALUE );
    
    QName STRING_3_ID = new QName( ID.getNamespaceURI(), "String3", ID.getPrefix() );
    String STRING_3_VALUE = "value-3";
    TestStringTerm STRING_3 = new TestStringTerm( STRING_3_ID, ID, STRING_3_VALUE );
    
    QName TRANSFORM_ID =
        new QName( GrammarPart.NAMESPACE_URI, "TransformTest", GrammarPart.NAMESPACE_PREFIX );
    
    class TestStringOperation extends BaseOperation< String > {
        
        public TestStringOperation() {
            super( ID, TRANSFORM_ID );
        }
        
        /**
         * {@inheritDoc}
         * 
         * @see org.polyglotter.operation.BaseOperation#calculate()
         */
        @Override
        protected String calculate() {
            return null;
        }
        
        /**
         * {@inheritDoc}
         * 
         * @see org.polyglotter.grammar.Operation#category()
         */
        @Override
        public Category category() {
            return null;
        }
        
        /**
         * {@inheritDoc}
         * 
         * @see org.polyglotter.grammar.GrammarPart#description()
         */
        @Override
        public String description() {
            return null;
        }
        
        /**
         * {@inheritDoc}
         * 
         * @see org.polyglotter.grammar.GrammarPart#name()
         */
        @Override
        public String name() {
            return null;
        }
        
        /**
         * {@inheritDoc}
         * 
         * @see org.polyglotter.operation.BaseOperation#validate()
         */
        @Override
        protected void validate() {}
        
    }
    
}
