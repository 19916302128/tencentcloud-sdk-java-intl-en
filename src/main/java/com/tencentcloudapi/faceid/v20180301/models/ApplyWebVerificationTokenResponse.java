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

public class ApplyWebVerificationTokenResponse extends AbstractModel {

    /**
    * The verification URL to be opened with a browser to start the verification process.
    */
    @SerializedName("VerificationUrl")
    @Expose
    private String VerificationUrl;

    /**
    * The token used to identify a web-based verification process. It is valid for 7,200s and can be used to get the verification result after the process is completed.
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The verification URL to be opened with a browser to start the verification process. 
     * @return VerificationUrl The verification URL to be opened with a browser to start the verification process.
     */
    public String getVerificationUrl() {
        return this.VerificationUrl;
    }

    /**
     * Set The verification URL to be opened with a browser to start the verification process.
     * @param VerificationUrl The verification URL to be opened with a browser to start the verification process.
     */
    public void setVerificationUrl(String VerificationUrl) {
        this.VerificationUrl = VerificationUrl;
    }

    /**
     * Get The token used to identify a web-based verification process. It is valid for 7,200s and can be used to get the verification result after the process is completed. 
     * @return BizToken The token used to identify a web-based verification process. It is valid for 7,200s and can be used to get the verification result after the process is completed.
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set The token used to identify a web-based verification process. It is valid for 7,200s and can be used to get the verification result after the process is completed.
     * @param BizToken The token used to identify a web-based verification process. It is valid for 7,200s and can be used to get the verification result after the process is completed.
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
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

    public ApplyWebVerificationTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyWebVerificationTokenResponse(ApplyWebVerificationTokenResponse source) {
        if (source.VerificationUrl != null) {
            this.VerificationUrl = new String(source.VerificationUrl);
        }
        if (source.BizToken != null) {
            this.BizToken = new String(source.BizToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerificationUrl", this.VerificationUrl);
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

