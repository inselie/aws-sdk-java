/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of an <i>UpdateTable</i> operation.
 * </p>
 */
public class UpdateTableResult implements Serializable {

    /**
     * Represents the properties of a table.
     */
    private TableDescription tableDescription;

    /**
     * Represents the properties of a table.
     *
     * @return Represents the properties of a table.
     */
    public TableDescription getTableDescription() {
        return tableDescription;
    }
    
    /**
     * Represents the properties of a table.
     *
     * @param tableDescription Represents the properties of a table.
     */
    public void setTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
    }
    
    /**
     * Represents the properties of a table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableDescription Represents the properties of a table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTableResult withTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableDescription() != null) sb.append("TableDescription: " + getTableDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableDescription() == null) ? 0 : getTableDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateTableResult == false) return false;
        UpdateTableResult other = (UpdateTableResult)obj;
        
        if (other.getTableDescription() == null ^ this.getTableDescription() == null) return false;
        if (other.getTableDescription() != null && other.getTableDescription().equals(this.getTableDescription()) == false) return false; 
        return true;
    }
    
}
    