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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubAppIdsResponse extends AbstractModel {

    /**
    * Subapplication information set.
    */
    @SerializedName("SubAppIdInfoSet")
    @Expose
    private SubAppIdInfo [] SubAppIdInfoSet;

    /**
    * Total number of subapplications.
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
     * Get Subapplication information set. 
     * @return SubAppIdInfoSet Subapplication information set.
     */
    public SubAppIdInfo [] getSubAppIdInfoSet() {
        return this.SubAppIdInfoSet;
    }

    /**
     * Set Subapplication information set.
     * @param SubAppIdInfoSet Subapplication information set.
     */
    public void setSubAppIdInfoSet(SubAppIdInfo [] SubAppIdInfoSet) {
        this.SubAppIdInfoSet = SubAppIdInfoSet;
    }

    /**
     * Get Total number of subapplications. 
     * @return TotalCount Total number of subapplications.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of subapplications.
     * @param TotalCount Total number of subapplications.
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

    public DescribeSubAppIdsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubAppIdsResponse(DescribeSubAppIdsResponse source) {
        if (source.SubAppIdInfoSet != null) {
            this.SubAppIdInfoSet = new SubAppIdInfo[source.SubAppIdInfoSet.length];
            for (int i = 0; i < source.SubAppIdInfoSet.length; i++) {
                this.SubAppIdInfoSet[i] = new SubAppIdInfo(source.SubAppIdInfoSet[i]);
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
        this.setParamArrayObj(map, prefix + "SubAppIdInfoSet.", this.SubAppIdInfoSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

