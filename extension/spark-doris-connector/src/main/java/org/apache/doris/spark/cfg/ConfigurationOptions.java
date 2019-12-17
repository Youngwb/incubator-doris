// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.spark.cfg;

public interface ConfigurationOptions {
    // doris fe node address
    String DORIS_FENODES = "doris.fenodes";

    String DORIS_DEFAULT_CLUSTER = "default_cluster";

    String TABLE_IDENTIFIER = "table.identifier";
    String DORIS_TABLE_IDENTIFIER = "doris.table.identifier";
    String DORIS_READ_FIELD = "doris.read.field";
    String DORIS_FILTER_QUERY = "doris.filter.query";
    String DORIS_FILTER_QUERY_IN_MAX_COUNT = "doris.filter.query.in.max.count";
    int DORIS_FILTER_QUERY_IN_VALUE_UPPER_LIMIT = 10000;

    String DORIS_USER = "doris.user";
    String DORIS_REQUEST_AUTH_USER = "doris.request.auth.user";
    // use password to save doris.request.auth.password
    // reuse credentials mask method in spark ExternalCatalogUtils#maskCredentials
    String DORIS_PASSWORD = "doris.password";
    String DORIS_REQUEST_AUTH_PASSWORD = "doris.request.auth.password";

    String DORIS_REQUEST_RETRIES = "doris.request.retries";
    String DORIS_REQUEST_CONNECT_TIMEOUT_MS = "doris.request.connect.timeout.ms";
    String DORIS_REQUEST_READ_TIMEOUT_MS = "doris.request.read.timeout.ms";
    String DORIS_REQUEST_QUERY_TIMEOUT_S = "doris.request.query.timeout.s";
    int DORIS_REQUEST_RETRIES_DEFAULT = 3;
    int DORIS_REQUEST_CONNECT_TIMEOUT_MS_DEFAULT = 30 * 1000;
    int DORIS_REQUEST_READ_TIMEOUT_MS_DEFAULT = 30 * 1000;
    int DORIS_REQUEST_QUERY_TIMEOUT_S_DEFAULT = -1;

    String DORIS_TABLET_SIZE = "doris.request.tablet.size";
    int DORIS_TABLET_SIZE_DEFAULT = Integer.MAX_VALUE;
    int DORIS_TABLET_SIZE_MIN = 1;

    String DORIS_BATCH_SIZE = "doris.batch.size";
    int DORIS_BATCH_SIZE_DEFAULT = 1024;

    String DORIS_VALUE_READER_CLASS = "doris.value.reader.class";
}
