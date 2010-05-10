package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity WorkEffortAssocAttribute.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_ASSOC_ATTRIBUTE")
public class WorkEffortAssocAttribute extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortIdFrom", "WORK_EFFORT_ID_FROM");
        fields.put("workEffortIdTo", "WORK_EFFORT_ID_TO");
        fields.put("workEffortAssocTypeId", "WORK_EFFORT_ASSOC_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("attrName", "ATTR_NAME");
        fields.put("attrValue", "ATTR_VALUE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkEffortAssocAttribute", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortAssocAttribute> {
    workEffortIdFrom("workEffortIdFrom"),
    workEffortIdTo("workEffortIdTo"),
    workEffortAssocTypeId("workEffortAssocTypeId"),
    fromDate("fromDate"),
    attrName("attrName"),
    attrValue("attrValue"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.WorkEffortAssocAttributePkBridge.class)
     private WorkEffortAssocAttributePk id = new WorkEffortAssocAttributePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkEffortAssocAttributePk</code>
     */
      public WorkEffortAssocAttributePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkEffortAssocAttributePk</code> value to set
    */   
      public void setId(WorkEffortAssocAttributePk id) {
         this.id = id;
      }
   @Column(name="FROM_DATE")
   private Timestamp fromDate;
   @Column(name="ATTR_VALUE")
   private String attrValue;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient WorkEffortAssoc workEffortAssoc = null;
   private transient List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrs = null;

  /**
   * Default constructor.
   */
  public WorkEffortAssocAttribute() {
      super();
      this.baseEntityName = "WorkEffortAssocAttribute";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortIdFrom");this.primaryKeyNames.add("workEffortIdTo");this.primaryKeyNames.add("workEffortAssocTypeId");this.primaryKeyNames.add("attrName");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortIdFrom");this.allFieldsNames.add("workEffortIdTo");this.allFieldsNames.add("workEffortAssocTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("attrName");this.allFieldsNames.add("attrValue");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortAssocAttribute(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortIdFrom the workEffortIdFrom to set
     */
    public void setWorkEffortIdFrom(String workEffortIdFrom) {
        id.setWorkEffortIdFrom(workEffortIdFrom);
    }
    /**
     * Auto generated value setter.
     * @param workEffortIdTo the workEffortIdTo to set
     */
    public void setWorkEffortIdTo(String workEffortIdTo) {
        id.setWorkEffortIdTo(workEffortIdTo);
    }
    /**
     * Auto generated value setter.
     * @param workEffortAssocTypeId the workEffortAssocTypeId to set
     */
    public void setWorkEffortAssocTypeId(String workEffortAssocTypeId) {
        id.setWorkEffortAssocTypeId(workEffortAssocTypeId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param attrName the attrName to set
     */
    public void setAttrName(String attrName) {
        id.setAttrName(attrName);
    }
    /**
     * Auto generated value setter.
     * @param attrValue the attrValue to set
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortIdFrom() {
        return this.id.getWorkEffortIdFrom();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortIdTo() {
        return this.id.getWorkEffortIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortAssocTypeId() {
        return this.id.getWorkEffortAssocTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttrName() {
        return this.id.getAttrName();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttrValue() {
        return this.attrValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>WorkEffortAssoc</code> by the relation named <code>WorkEffortAssoc</code>.
     * @return the <code>WorkEffortAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortAssoc getWorkEffortAssoc() throws RepositoryException {
        if (this.workEffortAssoc == null) {
            this.workEffortAssoc = getRelatedOne(WorkEffortAssoc.class, "WorkEffortAssoc");
        }
        return this.workEffortAssoc;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortAssocTypeAttr</code> by the relation named <code>WorkEffortAssocTypeAttr</code>.
     * @return the list of <code>WorkEffortAssocTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortAssocTypeAttr> getWorkEffortAssocTypeAttrs() throws RepositoryException {
        if (this.workEffortAssocTypeAttrs == null) {
            this.workEffortAssocTypeAttrs = getRelated(WorkEffortAssocTypeAttr.class, "WorkEffortAssocTypeAttr");
        }
        return this.workEffortAssocTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param workEffortAssoc the workEffortAssoc to set
    */
    public void setWorkEffortAssoc(WorkEffortAssoc workEffortAssoc) {
        this.workEffortAssoc = workEffortAssoc;
    }
    /**
     * Auto generated value setter.
     * @param workEffortAssocTypeAttrs the workEffortAssocTypeAttrs to set
    */
    public void setWorkEffortAssocTypeAttrs(List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrs) {
        this.workEffortAssocTypeAttrs = workEffortAssocTypeAttrs;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortIdFrom((String) mapValue.get("workEffortIdFrom"));
        setWorkEffortIdTo((String) mapValue.get("workEffortIdTo"));
        setWorkEffortAssocTypeId((String) mapValue.get("workEffortAssocTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setAttrName((String) mapValue.get("attrName"));
        setAttrValue((String) mapValue.get("attrValue"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("workEffortIdFrom", getWorkEffortIdFrom());
        mapValue.put("workEffortIdTo", getWorkEffortIdTo());
        mapValue.put("workEffortAssocTypeId", getWorkEffortAssocTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("attrName", getAttrName());
        mapValue.put("attrValue", getAttrValue());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}