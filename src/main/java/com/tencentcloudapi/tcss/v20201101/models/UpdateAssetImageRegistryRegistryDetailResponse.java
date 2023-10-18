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

public class UpdateAssetImageRegistryRegistryDetailResponse extends AbstractModel {

    /**
    * Connection error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthCheckErr")
    @Expose
    private String HealthCheckErr;

    /**
    * Name error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NameRepeatErr")
    @Expose
    private String NameRepeatErr;

    /**
    * Unique repository ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Connection error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthCheckErr Connection error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHealthCheckErr() {
        return this.HealthCheckErr;
    }

    /**
     * Set Connection error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthCheckErr Connection error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthCheckErr(String HealthCheckErr) {
        this.HealthCheckErr = HealthCheckErr;
    }

    /**
     * Get Name error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NameRepeatErr Name error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNameRepeatErr() {
        return this.NameRepeatErr;
    }

    /**
     * Set Name error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NameRepeatErr Name error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNameRepeatErr(String NameRepeatErr) {
        this.NameRepeatErr = NameRepeatErr;
    }

    /**
     * Get Unique repository ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryId Unique repository ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Unique repository ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryId Unique repository ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
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

    public UpdateAssetImageRegistryRegistryDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAssetImageRegistryRegistryDetailResponse(UpdateAssetImageRegistryRegistryDetailResponse source) {
        if (source.HealthCheckErr != null) {
            this.HealthCheckErr = new String(source.HealthCheckErr);
        }
        if (source.NameRepeatErr != null) {
            this.NameRepeatErr = new String(source.NameRepeatErr);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckErr", this.HealthCheckErr);
        this.setParamSimple(map, prefix + "NameRepeatErr", this.NameRepeatErr);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

