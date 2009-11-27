package org.opentaps.domain.base.entities;

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
 * Auto generated base entity ProductCategoryRole.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CATEGORY_ROLE")
public class ProductCategoryRole extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productCategoryId", "PRODUCT_CATEGORY_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("roleTypeId", "ROLE_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductCategoryRole", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductCategoryRole> {
    productCategoryId("productCategoryId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    comments("comments"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ProductCategoryRolePkBridge.class)
     private ProductCategoryRolePk id = new ProductCategoryRolePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductCategoryRolePk</code>
     */
      public ProductCategoryRolePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductCategoryRolePk</code> value to set
    */   
      public void setId(ProductCategoryRolePk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType roleType = null;
   private transient PartyRole partyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductCategory productCategory = null;

  /**
   * Default constructor.
   */
  public ProductCategoryRole() {
      super();
      this.baseEntityName = "ProductCategoryRole";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productCategoryId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductCategoryRole(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        id.setProductCategoryId(productCategoryId);
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        id.setPartyId(partyId);
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        id.setRoleTypeId(roleTypeId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
    public String getProductCategoryId() {
        return this.id.getProductCategoryId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.id.getPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.id.getRoleTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
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
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>RoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getRoleType() throws RepositoryException {
        if (this.roleType == null) {
            this.roleType = getRelatedOne(RoleType.class, "RoleType");
        }
        return this.roleType;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>PartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getPartyRole() throws RepositoryException {
        if (this.partyRole == null) {
            this.partyRole = getRelatedOne(PartyRole.class, "PartyRole");
        }
        return this.partyRole;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getProductCategory() throws RepositoryException {
        if (this.productCategory == null) {
            this.productCategory = getRelatedOne(ProductCategory.class, "ProductCategory");
        }
        return this.productCategory;
    }

    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param roleType the roleType to set
    */
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    /**
     * Auto generated value setter.
     * @param partyRole the partyRole to set
    */
    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }
    /**
     * Auto generated value setter.
     * @param productCategory the productCategory to set
    */
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setComments((String) mapValue.get("comments"));
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
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}