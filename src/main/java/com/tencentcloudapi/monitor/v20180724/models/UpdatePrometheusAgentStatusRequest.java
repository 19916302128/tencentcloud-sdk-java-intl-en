/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePrometheusAgentStatusRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of agent IDs
    */
    @SerializedName("AgentIds")
    @Expose
    private String [] AgentIds;

    /**
    * Status to update
<li> 1 = enabled </li>
<li> 2 = disabled </li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get List of agent IDs 
     * @return AgentIds List of agent IDs
     */
    public String [] getAgentIds() {
        return this.AgentIds;
    }

    /**
     * Set List of agent IDs
     * @param AgentIds List of agent IDs
     */
    public void setAgentIds(String [] AgentIds) {
        this.AgentIds = AgentIds;
    }

    /**
     * Get Status to update
<li> 1 = enabled </li>
<li> 2 = disabled </li> 
     * @return Status Status to update
<li> 1 = enabled </li>
<li> 2 = disabled </li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status to update
<li> 1 = enabled </li>
<li> 2 = disabled </li>
     * @param Status Status to update
<li> 1 = enabled </li>
<li> 2 = disabled </li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdatePrometheusAgentStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePrometheusAgentStatusRequest(UpdatePrometheusAgentStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentIds != null) {
            this.AgentIds = new String[source.AgentIds.length];
            for (int i = 0; i < source.AgentIds.length; i++) {
                this.AgentIds[i] = new String(source.AgentIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "AgentIds.", this.AgentIds);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

