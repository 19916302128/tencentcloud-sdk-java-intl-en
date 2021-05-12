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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDCDBInstancesResponse extends AbstractModel{

    /**
    * Async task ID. The task status can be queried through the `DescribeFlow` API.
    */
    @SerializedName("FlowIds")
    @Expose
    private Long [] FlowIds;

    /**
    * Passed through from the input parameters.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Async task ID. The task status can be queried through the `DescribeFlow` API. 
     * @return FlowIds Async task ID. The task status can be queried through the `DescribeFlow` API.
     */
    public Long [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set Async task ID. The task status can be queried through the `DescribeFlow` API.
     * @param FlowIds Async task ID. The task status can be queried through the `DescribeFlow` API.
     */
    public void setFlowIds(Long [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get Passed through from the input parameters. 
     * @return InstanceIds Passed through from the input parameters.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Passed through from the input parameters.
     * @param InstanceIds Passed through from the input parameters.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public InitDCDBInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InitDCDBInstancesResponse(InitDCDBInstancesResponse source) {
        if (source.FlowIds != null) {
            this.FlowIds = new Long[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new Long(source.FlowIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

