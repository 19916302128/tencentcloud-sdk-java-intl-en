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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateReflectSequenceResponse extends AbstractModel {

    /**
    * The resource URL of the light sequence, which needs to be downloaded and passed through to the SDK to start the identity verification process.
    */
    @SerializedName("ReflectSequenceUrl")
    @Expose
    private String ReflectSequenceUrl;

    /**
    * The MD5 hash value of the light sequence, which is used to check whether the light sequence is altered.
    */
    @SerializedName("ReflectSequenceMd5")
    @Expose
    private String ReflectSequenceMd5;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The resource URL of the light sequence, which needs to be downloaded and passed through to the SDK to start the identity verification process. 
     * @return ReflectSequenceUrl The resource URL of the light sequence, which needs to be downloaded and passed through to the SDK to start the identity verification process.
     */
    public String getReflectSequenceUrl() {
        return this.ReflectSequenceUrl;
    }

    /**
     * Set The resource URL of the light sequence, which needs to be downloaded and passed through to the SDK to start the identity verification process.
     * @param ReflectSequenceUrl The resource URL of the light sequence, which needs to be downloaded and passed through to the SDK to start the identity verification process.
     */
    public void setReflectSequenceUrl(String ReflectSequenceUrl) {
        this.ReflectSequenceUrl = ReflectSequenceUrl;
    }

    /**
     * Get The MD5 hash value of the light sequence, which is used to check whether the light sequence is altered. 
     * @return ReflectSequenceMd5 The MD5 hash value of the light sequence, which is used to check whether the light sequence is altered.
     */
    public String getReflectSequenceMd5() {
        return this.ReflectSequenceMd5;
    }

    /**
     * Set The MD5 hash value of the light sequence, which is used to check whether the light sequence is altered.
     * @param ReflectSequenceMd5 The MD5 hash value of the light sequence, which is used to check whether the light sequence is altered.
     */
    public void setReflectSequenceMd5(String ReflectSequenceMd5) {
        this.ReflectSequenceMd5 = ReflectSequenceMd5;
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

    public GenerateReflectSequenceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateReflectSequenceResponse(GenerateReflectSequenceResponse source) {
        if (source.ReflectSequenceUrl != null) {
            this.ReflectSequenceUrl = new String(source.ReflectSequenceUrl);
        }
        if (source.ReflectSequenceMd5 != null) {
            this.ReflectSequenceMd5 = new String(source.ReflectSequenceMd5);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReflectSequenceUrl", this.ReflectSequenceUrl);
        this.setParamSimple(map, prefix + "ReflectSequenceMd5", this.ReflectSequenceMd5);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

