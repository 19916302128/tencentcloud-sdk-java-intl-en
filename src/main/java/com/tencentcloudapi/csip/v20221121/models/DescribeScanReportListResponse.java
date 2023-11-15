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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanReportListResponse extends AbstractModel {

    /**
    * Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of scan reports
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private ScanTaskInfo [] Data;

    /**
    * List of account UINs
    */
    @SerializedName("UINList")
    @Expose
    private String [] UINList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of entries
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of scan reports
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Data List of scan reports
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public ScanTaskInfo [] getData() {
        return this.Data;
    }

    /**
     * Set List of scan reports
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Data List of scan reports
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setData(ScanTaskInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get List of account UINs 
     * @return UINList List of account UINs
     */
    public String [] getUINList() {
        return this.UINList;
    }

    /**
     * Set List of account UINs
     * @param UINList List of account UINs
     */
    public void setUINList(String [] UINList) {
        this.UINList = UINList;
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

    public DescribeScanReportListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanReportListResponse(DescribeScanReportListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new ScanTaskInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ScanTaskInfo(source.Data[i]);
            }
        }
        if (source.UINList != null) {
            this.UINList = new String[source.UINList.length];
            for (int i = 0; i < source.UINList.length; i++) {
                this.UINList[i] = new String(source.UINList[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArraySimple(map, prefix + "UINList.", this.UINList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

