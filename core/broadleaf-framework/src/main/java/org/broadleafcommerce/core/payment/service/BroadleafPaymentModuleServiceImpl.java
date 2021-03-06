/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.payment.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.broadleafcommerce.core.payment.service.workflow.PaymentSeed;
import org.springframework.stereotype.Service;

/**
 * @author Jerry Ocanas (jocanas)
 */
@Service("blPaymentModuleService")
public class BroadleafPaymentModuleServiceImpl implements BroadleafPaymentModuleService {

    private static final Log LOG = LogFactory.getLog(BroadleafPaymentModuleServiceImpl.class);

    @Override
    public void validateResponse(PaymentSeed paymentSeed) throws Exception {
        LOG.warn("Validate response has not been implemented.");
    }

    @Override
    public void manualPayment(PaymentSeed paymentSeed, String transactionID) {
        LOG.warn("Manual payment has not been implemented.");
    }

}
