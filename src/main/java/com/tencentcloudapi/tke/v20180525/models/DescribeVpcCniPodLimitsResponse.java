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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcCniPodLimitsResponse extends AbstractModel{

    /**
    * The number of the models
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The model information and the maximum supported number of Pods in the VPC-CNI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PodLimitsInstanceSet")
    @Expose
    private PodLimitsInstance [] PodLimitsInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of the models
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return TotalCount The number of the models
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of the models
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param TotalCount The number of the models
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The model information and the maximum supported number of Pods in the VPC-CNI mode
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PodLimitsInstanceSet The model information and the maximum supported number of Pods in the VPC-CNI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public PodLimitsInstance [] getPodLimitsInstanceSet() {
        return this.PodLimitsInstanceSet;
    }

    /**
     * Set The model information and the maximum supported number of Pods in the VPC-CNI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PodLimitsInstanceSet The model information and the maximum supported number of Pods in the VPC-CNI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPodLimitsInstanceSet(PodLimitsInstance [] PodLimitsInstanceSet) {
        this.PodLimitsInstanceSet = PodLimitsInstanceSet;
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

    public DescribeVpcCniPodLimitsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcCniPodLimitsResponse(DescribeVpcCniPodLimitsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PodLimitsInstanceSet != null) {
            this.PodLimitsInstanceSet = new PodLimitsInstance[source.PodLimitsInstanceSet.length];
            for (int i = 0; i < source.PodLimitsInstanceSet.length; i++) {
                this.PodLimitsInstanceSet[i] = new PodLimitsInstance(source.PodLimitsInstanceSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PodLimitsInstanceSet.", this.PodLimitsInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

