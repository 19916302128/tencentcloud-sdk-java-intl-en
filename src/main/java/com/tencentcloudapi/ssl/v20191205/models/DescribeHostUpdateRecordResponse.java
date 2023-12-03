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

public class DescribeHostUpdateRecordResponse extends AbstractModel {

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
    @SerializedName("DeployRecordList")
    @Expose
    private UpdateRecordInfo [] DeployRecordList;

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
     * @return DeployRecordList Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public UpdateRecordInfo [] getDeployRecordList() {
        return this.DeployRecordList;
    }

    /**
     * Set Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DeployRecordList Certificate deployment record list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeployRecordList(UpdateRecordInfo [] DeployRecordList) {
        this.DeployRecordList = DeployRecordList;
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

    public DescribeHostUpdateRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUpdateRecordResponse(DescribeHostUpdateRecordResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DeployRecordList != null) {
            this.DeployRecordList = new UpdateRecordInfo[source.DeployRecordList.length];
            for (int i = 0; i < source.DeployRecordList.length; i++) {
                this.DeployRecordList[i] = new UpdateRecordInfo(source.DeployRecordList[i]);
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
        this.setParamArrayObj(map, prefix + "DeployRecordList.", this.DeployRecordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

