/*
 * Copyright 2012-2018 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.client.command;

public final class FieldType {
	public static final int NAMESPACE = 0;
	public static final int TABLE = 1;
	public static final int KEY = 2;
	public static final int DIGEST_RIPE = 4;
	public final static int TRAN_ID = 7;	// user supplied transaction id, which is simply passed back
	public final static int SCAN_OPTIONS = 8;
	public final static int SCAN_TIMEOUT = 9;
	public final static int INDEX_NAME = 21;
	public final static int INDEX_RANGE = 22;
	public final static int INDEX_FILTER = 23;
	public final static int INDEX_LIMIT = 24;
	public final static int INDEX_ORDER_BY = 25;
	public final static int INDEX_TYPE = 26;
	public final static int UDF_PACKAGE_NAME = 30;
	public final static int UDF_FUNCTION = 31;
	public final static int UDF_ARGLIST = 32;
	public final static int UDF_OP = 33;
	public final static int QUERY_BINLIST = 40;
	public final static int BATCH_INDEX = 41;
	public final static int BATCH_INDEX_WITH_SET = 42;
	public final static int PREDEXP = 43;
}
