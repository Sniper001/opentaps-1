/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
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
package org.opentaps.gwt.purchasing.orders.client.form;

import org.opentaps.gwt.common.client.UtilUi;
import org.opentaps.gwt.common.client.form.FindEntityForm;
import org.opentaps.gwt.common.client.form.base.SubFormPanel;
import org.opentaps.gwt.common.client.form.field.CheckboxField;
import org.opentaps.gwt.common.client.form.field.DateField;
import org.opentaps.gwt.common.client.listviews.PurchaseOrderListView;
import org.opentaps.gwt.common.client.suggest.OrderStatusAutocomplete;
import org.opentaps.gwt.common.client.suggest.ProductAutocomplete;
import org.opentaps.gwt.common.client.suggest.SupplierAutocomplete;

import com.gwtext.client.widgets.form.TextField;

/**
 * Form class for find order in purchasing.
 */
public class FindOrdersForm extends FindEntityForm<PurchaseOrderListView> {

    private final SubFormPanel filterPanel;
    // Order Id
    private final TextField orderIdInput;
    // Order Name
    private final TextField orderNameInput;
    // Product Pattern
    private final ProductAutocomplete productPatternInput;
    // Supplier
    private final SupplierAutocomplete supplierInput;
    // Status
    private final OrderStatusAutocomplete orderStatusInput;
    // From Date
    private final DateField fromDateInput;
    // Thru Date
    private final DateField thruDateInput;
    // Created By
    private final TextField createdByInput;

    private final PurchaseOrderListView orderListView;
    
    // find all option
    private final CheckboxField findAllInput;

    /**
     * Default constructor.
     */
    public FindOrdersForm() {
        this(true);
    }

    /**
     * Constructor with autoLoad parameter, use this constructor if some filters need to be set prior to loading the grid data.
     * @param autoLoad sets the grid autoLoad parameter, set to <code>false</code> if some filters need to be set prior to loading the grid data
     */
    public FindOrdersForm(boolean autoLoad) {
        super(UtilUi.MSG.crmFindOrders());

        // change the form dimensions to accommodate two columns
        setLabelLength(100);
        setInputLength(180);
        setFormWidth(675);

        orderIdInput = new TextField(UtilUi.MSG.orderOrderId(), "orderId", getInputLength());
        orderNameInput = new TextField(UtilUi.MSG.orderOrderName(), "orderName", getInputLength());
        productPatternInput = new ProductAutocomplete(UtilUi.MSG.productProduct(), "externalId", getInputLength());
        supplierInput = new SupplierAutocomplete(UtilUi.MSG.productSupplier(), "partyIdSearch", getInputLength());
        orderStatusInput = new OrderStatusAutocomplete(UtilUi.MSG.commonStatus(), "statusId", getInputLength());
        fromDateInput = new DateField(UtilUi.MSG.commonFromDate(), "fromDate", getInputLength());
        thruDateInput = new DateField(UtilUi.MSG.commonThruDate(), "thruDate", getInputLength());
        createdByInput = new TextField(UtilUi.MSG.commonCreatedBy(), "createdBy", getInputLength());
        findAllInput = new CheckboxField(UtilUi.MSG.commonFindAll(), "findAll");

        // Build the filter tab
        filterPanel = getMainForm().addTab(UtilUi.MSG.crmFindOrders());
        // hide the tab bar since we only use one tab
        getMainForm().hideTabBar();

        filterPanel.addField(orderIdInput);
        filterPanel.addField(orderNameInput);
        filterPanel.addField(productPatternInput);
        filterPanel.addField(supplierInput);
        filterPanel.addField(orderStatusInput);
        filterPanel.addField(fromDateInput);
        filterPanel.addField(thruDateInput);
        filterPanel.addField(createdByInput);
        filterPanel.addField(findAllInput);

        orderListView = new PurchaseOrderListView();
        orderListView.setAutoLoad(autoLoad);
        orderListView.init();
        addListView(orderListView);
    }

    @Override protected void filter() {
        getListView().clearFilters();
        getListView().filterByOrderId(orderIdInput.getText());
        getListView().filterByProductPattern(productPatternInput.getText());
        getListView().filterByOrderName(orderNameInput.getText());
        getListView().filterBySupplierId(supplierInput.getText());
        getListView().filterByStatusId(orderStatusInput.getText());
        getListView().filterByFromDate(fromDateInput.getText());
        getListView().filterByThruDate(thruDateInput.getText());
        getListView().filterByCreatedBy(createdByInput.getText());
        if (orderStatusInput.getText() == null || "".equals(orderStatusInput.getText())) {
            getListView().filterHasIncludeInactiveOrders(findAllInput.getValue());
        } else {
            getListView().filterHasIncludeInactiveOrders(true);
        }
        getListView().applyFilters();
    }

}