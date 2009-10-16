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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity AmazonOrderItemTaxAmount.
 */
@javax.persistence.Entity
@Table(name="AMAZON_ORDER_ITEM_TAX_AMOUNT")
public class AmazonOrderItemTaxAmount extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("amazonOrderId", "AMAZON_ORDER_ID");
        fields.put("amazonOrderItemCode", "AMAZON_ORDER_ITEM_CODE");
        fields.put("itemTaxJurisTypeId", "ITEM_TAX_JURIS_TYPE_ID");
        fields.put("taxAmountType", "TAX_AMOUNT_TYPE");
        fields.put("taxJurisdictionType", "TAX_JURISDICTION_TYPE");
        fields.put("taxCurrency", "TAX_CURRENCY");
        fields.put("taxAmount", "TAX_AMOUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AmazonOrderItemTaxAmount", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonOrderItemTaxAmount> {
    amazonOrderId("amazonOrderId"),
    amazonOrderItemCode("amazonOrderItemCode"),
    itemTaxJurisTypeId("itemTaxJurisTypeId"),
    taxAmountType("taxAmountType"),
    taxJurisdictionType("taxJurisdictionType"),
    taxCurrency("taxCurrency"),
    taxAmount("taxAmount"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.AmazonOrderItemTaxAmountPkBridge.class)
     private AmazonOrderItemTaxAmountPk id = new AmazonOrderItemTaxAmountPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>AmazonOrderItemTaxAmountPk</code>
     */
      public AmazonOrderItemTaxAmountPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>AmazonOrderItemTaxAmountPk</code> value to set
    */   
      public void setId(AmazonOrderItemTaxAmountPk id) {
         this.id = id;
      }
   @Column(name="TAX_CURRENCY")
   private String taxCurrency;
   @Column(name="TAX_AMOUNT")
   private BigDecimal taxAmount;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient AmazonOrderItem amazonOrderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ITEM_TAX_JURIS_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private AmazonOrderItemTaxJurisdtn amazonOrderItemTaxJurisdtn = null;

  /**
   * Default constructor.
   */
  public AmazonOrderItemTaxAmount() {
      super();
      this.baseEntityName = "AmazonOrderItemTaxAmount";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("amazonOrderId");this.primaryKeyNames.add("amazonOrderItemCode");this.primaryKeyNames.add("itemTaxJurisTypeId");this.primaryKeyNames.add("taxAmountType");this.primaryKeyNames.add("taxJurisdictionType");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("amazonOrderId");this.allFieldsNames.add("amazonOrderItemCode");this.allFieldsNames.add("itemTaxJurisTypeId");this.allFieldsNames.add("taxAmountType");this.allFieldsNames.add("taxJurisdictionType");this.allFieldsNames.add("taxCurrency");this.allFieldsNames.add("taxAmount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonOrderItemTaxAmount(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param amazonOrderId the amazonOrderId to set
     */
    public void setAmazonOrderId(String amazonOrderId) {
        id.setAmazonOrderId(amazonOrderId);
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemCode the amazonOrderItemCode to set
     */
    public void setAmazonOrderItemCode(String amazonOrderItemCode) {
        id.setAmazonOrderItemCode(amazonOrderItemCode);
    }
    /**
     * Auto generated value setter.
     * @param itemTaxJurisTypeId the itemTaxJurisTypeId to set
     */
    public void setItemTaxJurisTypeId(String itemTaxJurisTypeId) {
        id.setItemTaxJurisTypeId(itemTaxJurisTypeId);
    }
    /**
     * Auto generated value setter.
     * @param taxAmountType the taxAmountType to set
     */
    public void setTaxAmountType(String taxAmountType) {
        id.setTaxAmountType(taxAmountType);
    }
    /**
     * Auto generated value setter.
     * @param taxJurisdictionType the taxJurisdictionType to set
     */
    public void setTaxJurisdictionType(String taxJurisdictionType) {
        id.setTaxJurisdictionType(taxJurisdictionType);
    }
    /**
     * Auto generated value setter.
     * @param taxCurrency the taxCurrency to set
     */
    public void setTaxCurrency(String taxCurrency) {
        this.taxCurrency = taxCurrency;
    }
    /**
     * Auto generated value setter.
     * @param taxAmount the taxAmount to set
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
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
    public String getAmazonOrderId() {
        return this.id.getAmazonOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAmazonOrderItemCode() {
        return this.id.getAmazonOrderItemCode();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemTaxJurisTypeId() {
        return this.id.getItemTaxJurisTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAmountType() {
        return this.id.getTaxAmountType();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisdictionType() {
        return this.id.getTaxJurisdictionType();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxCurrency() {
        return this.taxCurrency;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
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
     * Auto generated method that gets the related <code>AmazonOrderItem</code> by the relation named <code>AmazonOrderItem</code>.
     * @return the <code>AmazonOrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonOrderItem getAmazonOrderItem() throws RepositoryException {
        if (this.amazonOrderItem == null) {
            this.amazonOrderItem = getRelatedOne(AmazonOrderItem.class, "AmazonOrderItem");
        }
        return this.amazonOrderItem;
    }
    /**
     * Auto generated method that gets the related <code>AmazonOrderItemTaxJurisdtn</code> by the relation named <code>AmazonOrderItemTaxJurisdtn</code>.
     * @return the <code>AmazonOrderItemTaxJurisdtn</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonOrderItemTaxJurisdtn getAmazonOrderItemTaxJurisdtn() throws RepositoryException {
        if (this.amazonOrderItemTaxJurisdtn == null) {
            this.amazonOrderItemTaxJurisdtn = getRelatedOne(AmazonOrderItemTaxJurisdtn.class, "AmazonOrderItemTaxJurisdtn");
        }
        return this.amazonOrderItemTaxJurisdtn;
    }

    /**
     * Auto generated value setter.
     * @param amazonOrderItem the amazonOrderItem to set
    */
    public void setAmazonOrderItem(AmazonOrderItem amazonOrderItem) {
        this.amazonOrderItem = amazonOrderItem;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemTaxJurisdtn the amazonOrderItemTaxJurisdtn to set
    */
    public void setAmazonOrderItemTaxJurisdtn(AmazonOrderItemTaxJurisdtn amazonOrderItemTaxJurisdtn) {
        this.amazonOrderItemTaxJurisdtn = amazonOrderItemTaxJurisdtn;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAmazonOrderId((String) mapValue.get("amazonOrderId"));
        setAmazonOrderItemCode((String) mapValue.get("amazonOrderItemCode"));
        setItemTaxJurisTypeId((String) mapValue.get("itemTaxJurisTypeId"));
        setTaxAmountType((String) mapValue.get("taxAmountType"));
        setTaxJurisdictionType((String) mapValue.get("taxJurisdictionType"));
        setTaxCurrency((String) mapValue.get("taxCurrency"));
        setTaxAmount(convertToBigDecimal(mapValue.get("taxAmount")));
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
        mapValue.put("amazonOrderId", getAmazonOrderId());
        mapValue.put("amazonOrderItemCode", getAmazonOrderItemCode());
        mapValue.put("itemTaxJurisTypeId", getItemTaxJurisTypeId());
        mapValue.put("taxAmountType", getTaxAmountType());
        mapValue.put("taxJurisdictionType", getTaxJurisdictionType());
        mapValue.put("taxCurrency", getTaxCurrency());
        mapValue.put("taxAmount", getTaxAmount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}