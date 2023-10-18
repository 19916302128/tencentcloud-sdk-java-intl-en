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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupsResponse extends AbstractModel {

    /**
    * Number of displayed results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information set of displayed target groups
    */
    @SerializedName("TargetGroupSet")
    @Expose
    private TargetGroupInfo [] TargetGroupSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of displayed results 
     * @return TotalCount Number of displayed results
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of displayed results
     * @param TotalCount Number of displayed results
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information set of displayed target groups 
     * @return TargetGroupSet Information set of displayed target groups
     */
    public TargetGroupInfo [] getTargetGroupSet() {
        return this.TargetGroupSet;
    }

    /**
     * Set Information set of displayed target groups
     * @param TargetGroupSet Information set of displayed target groups
     */
    public void setTargetGroupSet(TargetGroupInfo [] TargetGroupSet) {
        this.TargetGroupSet = TargetGroupSet;
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

    public DescribeTargetGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupsResponse(DescribeTargetGroupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TargetGroupSet != null) {
            this.TargetGroupSet = new TargetGroupInfo[source.TargetGroupSet.length];
            for (int i = 0; i < source.TargetGroupSet.length; i++) {
                this.TargetGroupSet[i] = new TargetGroupInfo(source.TargetGroupSet[i]);
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
        this.setParamArrayObj(map, prefix + "TargetGroupSet.", this.TargetGroupSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

