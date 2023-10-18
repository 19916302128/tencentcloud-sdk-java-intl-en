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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBEncryptAttributesResponse extends AbstractModel {

    /**
    * Whether encryption is enabled. Valid values: `1` (enabled), `2` (disabled).
    */
    @SerializedName("EncryptStatus")
    @Expose
    private Long EncryptStatus;

    /**
    * DEK key
    */
    @SerializedName("CipherText")
    @Expose
    private String CipherText;

    /**
    * DEK key expiration date
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether encryption is enabled. Valid values: `1` (enabled), `2` (disabled). 
     * @return EncryptStatus Whether encryption is enabled. Valid values: `1` (enabled), `2` (disabled).
     */
    public Long getEncryptStatus() {
        return this.EncryptStatus;
    }

    /**
     * Set Whether encryption is enabled. Valid values: `1` (enabled), `2` (disabled).
     * @param EncryptStatus Whether encryption is enabled. Valid values: `1` (enabled), `2` (disabled).
     */
    public void setEncryptStatus(Long EncryptStatus) {
        this.EncryptStatus = EncryptStatus;
    }

    /**
     * Get DEK key 
     * @return CipherText DEK key
     */
    public String getCipherText() {
        return this.CipherText;
    }

    /**
     * Set DEK key
     * @param CipherText DEK key
     */
    public void setCipherText(String CipherText) {
        this.CipherText = CipherText;
    }

    /**
     * Get DEK key expiration date 
     * @return ExpireDate DEK key expiration date
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set DEK key expiration date
     * @param ExpireDate DEK key expiration date
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
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

    public DescribeDBEncryptAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBEncryptAttributesResponse(DescribeDBEncryptAttributesResponse source) {
        if (source.EncryptStatus != null) {
            this.EncryptStatus = new Long(source.EncryptStatus);
        }
        if (source.CipherText != null) {
            this.CipherText = new String(source.CipherText);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptStatus", this.EncryptStatus);
        this.setParamSimple(map, prefix + "CipherText", this.CipherText);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

