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

public class DescribeTargetGroupInstancesResponse extends AbstractModel {

    /**
    * Number of results returned for the current query
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of the bound server
    */
    @SerializedName("TargetGroupInstanceSet")
    @Expose
    private TargetGroupBackend [] TargetGroupInstanceSet;

    /**
    * The actual total number of bound instances, which is not affected by the setting of `Limit`, `Offset` and the CAM permissions.
    */
    @SerializedName("RealCount")
    @Expose
    private Long RealCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of results returned for the current query 
     * @return TotalCount Number of results returned for the current query
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of results returned for the current query
     * @param TotalCount Number of results returned for the current query
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of the bound server 
     * @return TargetGroupInstanceSet Information of the bound server
     */
    public TargetGroupBackend [] getTargetGroupInstanceSet() {
        return this.TargetGroupInstanceSet;
    }

    /**
     * Set Information of the bound server
     * @param TargetGroupInstanceSet Information of the bound server
     */
    public void setTargetGroupInstanceSet(TargetGroupBackend [] TargetGroupInstanceSet) {
        this.TargetGroupInstanceSet = TargetGroupInstanceSet;
    }

    /**
     * Get The actual total number of bound instances, which is not affected by the setting of `Limit`, `Offset` and the CAM permissions. 
     * @return RealCount The actual total number of bound instances, which is not affected by the setting of `Limit`, `Offset` and the CAM permissions.
     */
    public Long getRealCount() {
        return this.RealCount;
    }

    /**
     * Set The actual total number of bound instances, which is not affected by the setting of `Limit`, `Offset` and the CAM permissions.
     * @param RealCount The actual total number of bound instances, which is not affected by the setting of `Limit`, `Offset` and the CAM permissions.
     */
    public void setRealCount(Long RealCount) {
        this.RealCount = RealCount;
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

    public DescribeTargetGroupInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupInstancesResponse(DescribeTargetGroupInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TargetGroupInstanceSet != null) {
            this.TargetGroupInstanceSet = new TargetGroupBackend[source.TargetGroupInstanceSet.length];
            for (int i = 0; i < source.TargetGroupInstanceSet.length; i++) {
                this.TargetGroupInstanceSet[i] = new TargetGroupBackend(source.TargetGroupInstanceSet[i]);
            }
        }
        if (source.RealCount != null) {
            this.RealCount = new Long(source.RealCount);
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
        this.setParamArrayObj(map, prefix + "TargetGroupInstanceSet.", this.TargetGroupInstanceSet);
        this.setParamSimple(map, prefix + "RealCount", this.RealCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

