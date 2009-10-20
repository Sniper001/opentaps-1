/*
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
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
package org.opentaps.tests.service;

import java.sql.Timestamp;
import java.util.Locale;
import java.util.Map;

import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.UtilDateTime;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.GenericDelegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.service.DispatchContext;
import org.ofbiz.service.ServiceUtil;
import org.opentaps.common.util.UtilCommon;
import org.opentaps.common.util.UtilMessage;
/**
 * TestEntity services for Opentaps-Common, for verify eecas in hibernate.
 */
public class TestEntityServices {

    public static final String module = TestEntityServices.class.getName();

    /**
     * if testStringField equals GenericEntityException then just raise an GenericEntityException, else log a testEntity has updated.
     *  (insert a record into TestEntityModifyHistory).
     * @param dctx a <code>DispatchContext</code> value
     * @param context a <code>Map</code> value
     * @return a <code>Map</code> value
     */
    public static Map logTestEntityHasUpdated(DispatchContext dctx, Map context) {
        String testId = (String) context.get("testId");
        String testStringField = (String) context.get("testStringField");
        GenericDelegator delegator = dctx.getDelegator();
        String getNextSeqId = delegator.getNextSeqId("TestEntityModifyHistory");
        Timestamp timeStamp = UtilDateTime.nowTimestamp();
        try {
            //for test Eca rollback, just raise an GenericEntityException if testStringField equals "GenericEntityException".
            if (testStringField != null && testStringField.equals("GenericEntityException")) {
                Debug.logInfo("run opentaps.logTestEntityHasUpdated failed, throw an GenericEntityException", module);
                throw new GenericEntityException("Just for test Eca rollback in hibernate");
            }
            // else log a testEntity has updated.
            GenericValue value = delegator.create("TestEntityModifyHistory", UtilMisc.toMap("testEntityHistoryId", getNextSeqId, "testId", testId, "modifyTimestamp", timeStamp));
            Debug.logInfo("run opentaps.testReturnStoreTestEntitySeca sucessed, testEntityHistoryId : " + getNextSeqId + " testId : " + testId + " modifyTimestamp : " + timeStamp, module);
        } catch (GenericEntityException e) {
            Debug.logInfo("run opentaps.testReturnStoreTestEntitySeca failed, testEntityHistoryId : " + getNextSeqId + " testId : " + testId + " modifyTimestamp : " + timeStamp + "." + e.getMessage(), module);
            return UtilMessage.createAndLogServiceError(e, UtilCommon.getLocale(context), module);
        }
        return ServiceUtil.returnSuccess();
    }

}
