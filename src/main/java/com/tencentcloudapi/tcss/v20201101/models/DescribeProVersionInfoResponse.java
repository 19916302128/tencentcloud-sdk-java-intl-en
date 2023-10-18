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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProVersionInfoResponse extends AbstractModel {

    /**
    * Start time of the Pro Edition, which is not empty only when the edition is purchased.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the Pro Edition, which is not empty only when more resources are purchased.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of cores to be purchased
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * Upper limit for elastic billing
    */
    @SerializedName("MaxPostPayCoresCnt")
    @Expose
    private Long MaxPostPayCoresCnt;

    /**
    * Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
    */
    @SerializedName("BuyStatus")
    @Expose
    private String BuyStatus;

    /**
    * Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
    */
    @SerializedName("IsPurchased")
    @Expose
    private Boolean IsPurchased;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Start time of the Pro Edition, which is not empty only when the edition is purchased.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time of the Pro Edition, which is not empty only when the edition is purchased.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the Pro Edition, which is not empty only when the edition is purchased.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time of the Pro Edition, which is not empty only when the edition is purchased.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the Pro Edition, which is not empty only when more resources are purchased.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time of the Pro Edition, which is not empty only when more resources are purchased.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the Pro Edition, which is not empty only when more resources are purchased.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time of the Pro Edition, which is not empty only when more resources are purchased.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of cores to be purchased 
     * @return CoresCnt Number of cores to be purchased
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set Number of cores to be purchased
     * @param CoresCnt Number of cores to be purchased
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get Upper limit for elastic billing 
     * @return MaxPostPayCoresCnt Upper limit for elastic billing
     */
    public Long getMaxPostPayCoresCnt() {
        return this.MaxPostPayCoresCnt;
    }

    /**
     * Set Upper limit for elastic billing
     * @param MaxPostPayCoresCnt Upper limit for elastic billing
     */
    public void setMaxPostPayCoresCnt(Long MaxPostPayCoresCnt) {
        this.MaxPostPayCoresCnt = MaxPostPayCoresCnt;
    }

    /**
     * Get Resource ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceId Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceId Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated. 
     * @return BuyStatus Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
     */
    public String getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
     * @param BuyStatus Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
     */
    public void setBuyStatus(String BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get Whether it has been purchased before. Valid values: `false` (no); `true` (yes). 
     * @return IsPurchased Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
     */
    public Boolean getIsPurchased() {
        return this.IsPurchased;
    }

    /**
     * Set Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
     * @param IsPurchased Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
     */
    public void setIsPurchased(Boolean IsPurchased) {
        this.IsPurchased = IsPurchased;
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

    public DescribeProVersionInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProVersionInfoResponse(DescribeProVersionInfoResponse source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.MaxPostPayCoresCnt != null) {
            this.MaxPostPayCoresCnt = new Long(source.MaxPostPayCoresCnt);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BuyStatus != null) {
            this.BuyStatus = new String(source.BuyStatus);
        }
        if (source.IsPurchased != null) {
            this.IsPurchased = new Boolean(source.IsPurchased);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "MaxPostPayCoresCnt", this.MaxPostPayCoresCnt);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "IsPurchased", this.IsPurchased);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

