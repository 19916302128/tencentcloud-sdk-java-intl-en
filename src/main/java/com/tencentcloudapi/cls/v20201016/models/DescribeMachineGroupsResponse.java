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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineGroupsResponse extends AbstractModel{

    /**
    * Machine group information list
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineGroups")
    @Expose
    private MachineGroupInfo [] MachineGroups;

    /**
    * Total number of pages
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Machine group information list
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MachineGroups Machine group information list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public MachineGroupInfo [] getMachineGroups() {
        return this.MachineGroups;
    }

    /**
     * Set Machine group information list
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MachineGroups Machine group information list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMachineGroups(MachineGroupInfo [] MachineGroups) {
        this.MachineGroups = MachineGroups;
    }

    /**
     * Get Total number of pages 
     * @return TotalCount Total number of pages
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of pages
     * @param TotalCount Total number of pages
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeMachineGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineGroupsResponse(DescribeMachineGroupsResponse source) {
        if (source.MachineGroups != null) {
            this.MachineGroups = new MachineGroupInfo[source.MachineGroups.length];
            for (int i = 0; i < source.MachineGroups.length; i++) {
                this.MachineGroups[i] = new MachineGroupInfo(source.MachineGroups[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MachineGroups.", this.MachineGroups);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

