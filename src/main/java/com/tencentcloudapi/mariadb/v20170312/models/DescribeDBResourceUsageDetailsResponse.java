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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBResourceUsageDetailsResponse extends AbstractModel{

    /**
    * Master node resource usage monitoring node
    */
    @SerializedName("Master")
    @Expose
    private ResourceUsageMonitorSet Master;

    /**
    * Slave 1 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Slave1")
    @Expose
    private ResourceUsageMonitorSet Slave1;

    /**
    * Slave 2 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Slave2")
    @Expose
    private ResourceUsageMonitorSet Slave2;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Master node resource usage monitoring node 
     * @return Master Master node resource usage monitoring node
     */
    public ResourceUsageMonitorSet getMaster() {
        return this.Master;
    }

    /**
     * Set Master node resource usage monitoring node
     * @param Master Master node resource usage monitoring node
     */
    public void setMaster(ResourceUsageMonitorSet Master) {
        this.Master = Master;
    }

    /**
     * Get Slave 1 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Slave1 Slave 1 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ResourceUsageMonitorSet getSlave1() {
        return this.Slave1;
    }

    /**
     * Set Slave 1 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Slave1 Slave 1 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSlave1(ResourceUsageMonitorSet Slave1) {
        this.Slave1 = Slave1;
    }

    /**
     * Get Slave 2 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Slave2 Slave 2 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ResourceUsageMonitorSet getSlave2() {
        return this.Slave2;
    }

    /**
     * Set Slave 2 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Slave2 Slave 2 resource usage monitoring node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSlave2(ResourceUsageMonitorSet Slave2) {
        this.Slave2 = Slave2;
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

    public DescribeDBResourceUsageDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBResourceUsageDetailsResponse(DescribeDBResourceUsageDetailsResponse source) {
        if (source.Master != null) {
            this.Master = new ResourceUsageMonitorSet(source.Master);
        }
        if (source.Slave1 != null) {
            this.Slave1 = new ResourceUsageMonitorSet(source.Slave1);
        }
        if (source.Slave2 != null) {
            this.Slave2 = new ResourceUsageMonitorSet(source.Slave2);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Master.", this.Master);
        this.setParamObj(map, prefix + "Slave1.", this.Slave1);
        this.setParamObj(map, prefix + "Slave2.", this.Slave2);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

