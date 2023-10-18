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

public class DescribeAssetImageRegistryAssetStatusResponse extends AbstractModel {

    /**
    * Update progress. Valid values: `doing` (updating); `success` (updated successfully); `failed` (failed to update).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Err")
    @Expose
    private String Err;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Update progress. Valid values: `doing` (updating); `success` (updated successfully); `failed` (failed to update). 
     * @return Status Update progress. Valid values: `doing` (updating); `success` (updated successfully); `failed` (failed to update).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Update progress. Valid values: `doing` (updating); `success` (updated successfully); `failed` (failed to update).
     * @param Status Update progress. Valid values: `doing` (updating); `success` (updated successfully); `failed` (failed to update).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Err Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErr() {
        return this.Err;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Err Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErr(String Err) {
        this.Err = Err;
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

    public DescribeAssetImageRegistryAssetStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryAssetStatusResponse(DescribeAssetImageRegistryAssetStatusResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Err != null) {
            this.Err = new String(source.Err);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Err", this.Err);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

