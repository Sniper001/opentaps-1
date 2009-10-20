package org.opentaps.domain.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the Honest Public License.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* Honest Public License for more details.
*
* You should have received a copy of the Honest Public License
* along with this program; if not, write to Funambol,
* 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
*/

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.io.Serializable;
import javax.persistence.*;

<#-- imports for all the fields' types -->
<#list pkFieldTypes as pkFieldType>
import ${pkFieldType};
</#list>

@Embeddable
public class ${pkName} implements Serializable {
    <#list primaryKeys as primaryKey>
    <#if (pkTypes.size() > 0) && pkTypes.get(primaryKey)?has_content>
    @Column(name="${columnNames.get(primaryKey)}")
    private ${pkTypes.get(primaryKey)} ${primaryKey};
    </#if>
    </#list>
    
<#-- set methods -->
  <#list primaryKeys as primaryKey>
  <#if (pkTypes.size() > 0) && pkTypes.get(primaryKey)?has_content>
    /**
     * Auto generated value setter.
     * @param ${primaryKey} the ${primaryKey} to set
     */
    public void ${setPkMethodNames.get(primaryKey)}(${pkTypes.get(primaryKey)} ${primaryKey}) {
        this.${primaryKey} = ${primaryKey};
    }
  </#if>
  </#list>

  <#-- get methods -->
  <#list primaryKeys as primaryKey>
  <#if (pkTypes.size() > 0) && pkTypes.get(primaryKey)?has_content>
    /**
     * Auto generated value accessor.
     * @return <code>${pkTypes.get(primaryKey)}</code>
     */  
    public ${pkTypes.get(primaryKey)} ${getPkMethodNames.get(primaryKey)}() {
        return this.${primaryKey};
    }
  </#if>
  </#list>  
}
