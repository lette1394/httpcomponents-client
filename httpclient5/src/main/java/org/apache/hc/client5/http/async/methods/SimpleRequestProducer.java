/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.hc.client5.http.async.methods;

import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.core5.http.nio.entity.StringAsyncEntityProducer;
import org.apache.hc.core5.util.Args;

public final class SimpleRequestProducer extends DefaultAsyncRequestProducer {

    public SimpleRequestProducer(final SimpleHttpRequest request, final RequestConfig requestConfig) {
        super(Args.notNull(request, "Request"), request.getBody() != null ?
                new StringAsyncEntityProducer(request.getBody(), request.getContentType()) : null, requestConfig);
    }

    public SimpleRequestProducer(final SimpleHttpRequest request) {
        this(request, null);
    }

}