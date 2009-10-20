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
package org.opentaps.gwt.common.server.lookup;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ofbiz.entity.condition.EntityExpr;
import org.ofbiz.entity.condition.EntityOperator;
import org.opentaps.domain.base.entities.Enumeration;
import org.opentaps.foundation.entity.EntityInterface;
import org.opentaps.foundation.infrastructure.InfrastructureException;
import org.opentaps.gwt.common.client.lookup.configuration.OpportunityTypeLookupConfiguration;
import org.opentaps.gwt.common.server.HttpInputProvider;
import org.opentaps.gwt.common.server.InputProviderInterface;
/**
 * The RPC service used to populate Opportunity Priority autocompleters widgets.
 */
public class OpportunityTypeLookupService extends EntityLookupAndSuggestService {

    protected OpportunityTypeLookupService(InputProviderInterface provider) {
        super(provider,
              Arrays.asList(OpportunityTypeLookupConfiguration.OUT_ENUM_ID,
                      OpportunityTypeLookupConfiguration.OUT_DESCRIPTION,
                      OpportunityTypeLookupConfiguration.OUT_SEQUENCE_ID));
    }

    /**
     * AJAX event to suggest Opportunity Priority.
     * @param request a <code>HttpServletRequest</code> value
     * @param response a <code>HttpServletResponse</code> value
     * @return the resulting JSON response
     * @throws InfrastructureException if an error occurs
     */
    public static String suggestOpportunityTypes(HttpServletRequest request, HttpServletResponse response) throws InfrastructureException {
        InputProviderInterface provider = new HttpInputProvider(request);
        JsonResponse json = new JsonResponse(response);
        OpportunityTypeLookupService service = new OpportunityTypeLookupService(provider);
        service.suggestOpportunityTypes();
        return json.makeSuggestResponse(OpportunityTypeLookupConfiguration.OUT_ENUM_ID, service);
    }

    /**
     * Gets all Opportunity priorities.
     * @return the list of party classifications <code>Enumeration</code>
     */
    public List<Enumeration> suggestOpportunityTypes() {
        return findList(Enumeration.class, new EntityExpr(Enumeration.Fields.enumTypeId.name(), EntityOperator.EQUALS, "SO_TYPES"));
    }

    @Override
    public String makeSuggestDisplayedText(EntityInterface suggest) {
        return suggest.getString(OpportunityTypeLookupConfiguration.OUT_DESCRIPTION);
    }
}
