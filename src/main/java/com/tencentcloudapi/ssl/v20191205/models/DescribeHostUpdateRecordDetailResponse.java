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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostUpdateRecordDetailResponse extends AbstractModel {

    /**
    * Total count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RecordDetailList")
    @Expose
    private UpdateRecordDetails [] RecordDetailList;

    /**
    * Total successful deployments
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SuccessTotalCount")
    @Expose
    private Long SuccessTotalCount;

    /**
    * Total failed deployments
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FailedTotalCount")
    @Expose
    private Long FailedTotalCount;

    /**
    * Total running deployments
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunningTotalCount")
    @Expose
    private Long RunningTotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RecordDetailList Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public UpdateRecordDetails [] getRecordDetailList() {
        return this.RecordDetailList;
    }

    /**
     * Set Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RecordDetailList Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRecordDetailList(UpdateRecordDetails [] RecordDetailList) {
        this.RecordDetailList = RecordDetailList;
    }

    /**
     * Get Total successful deployments
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SuccessTotalCount Total successful deployments
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSuccessTotalCount() {
        return this.SuccessTotalCount;
    }

    /**
     * Set Total successful deployments
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SuccessTotalCount Total successful deployments
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSuccessTotalCount(Long SuccessTotalCount) {
        this.SuccessTotalCount = SuccessTotalCount;
    }

    /**
     * Get Total failed deployments
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FailedTotalCount Total failed deployments
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFailedTotalCount() {
        return this.FailedTotalCount;
    }

    /**
     * Set Total failed deployments
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FailedTotalCount Total failed deployments
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFailedTotalCount(Long FailedTotalCount) {
        this.FailedTotalCount = FailedTotalCount;
    }

    /**
     * Get Total running deployments
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RunningTotalCount Total running deployments
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRunningTotalCount() {
        return this.RunningTotalCount;
    }

    /**
     * Set Total running deployments
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RunningTotalCount Total running deployments
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunningTotalCount(Long RunningTotalCount) {
        this.RunningTotalCount = RunningTotalCount;
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

    public DescribeHostUpdateRecordDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUpdateRecordDetailResponse(DescribeHostUpdateRecordDetailResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RecordDetailList != null) {
            this.RecordDetailList = new UpdateRecordDetails[source.RecordDetailList.length];
            for (int i = 0; i < source.RecordDetailList.length; i++) {
                this.RecordDetailList[i] = new UpdateRecordDetails(source.RecordDetailList[i]);
            }
        }
        if (source.SuccessTotalCount != null) {
            this.SuccessTotalCount = new Long(source.SuccessTotalCount);
        }
        if (source.FailedTotalCount != null) {
            this.FailedTotalCount = new Long(source.FailedTotalCount);
        }
        if (source.RunningTotalCount != null) {
            this.RunningTotalCount = new Long(source.RunningTotalCount);
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
        this.setParamArrayObj(map, prefix + "RecordDetailList.", this.RecordDetailList);
        this.setParamSimple(map, prefix + "SuccessTotalCount", this.SuccessTotalCount);
        this.setParamSimple(map, prefix + "FailedTotalCount", this.FailedTotalCount);
        this.setParamSimple(map, prefix + "RunningTotalCount", this.RunningTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

