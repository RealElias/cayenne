/*****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ****************************************************************/
package org.apache.cayenne.access.translator;

import org.apache.cayenne.map.ProcedureParameter;

/**
 * Describes a PreparedStatement parameter binding mapped to a DbAttribute.
 *
 * @since 4.0
 */
public class ProcedureParameterBinding extends ParameterBinding {

	private final ProcedureParameter parameter;

	public ProcedureParameterBinding(ProcedureParameter procedureParameter) {
		super();
		this.parameter = procedureParameter;
	}

	public ProcedureParameter getParameter() {
		return parameter;
	}

	@Override
	public Integer getJdbcType() {
		return parameter.getType();
	}

	@Override
	public int getScale() {
		return parameter.getPrecision();
	}
}
