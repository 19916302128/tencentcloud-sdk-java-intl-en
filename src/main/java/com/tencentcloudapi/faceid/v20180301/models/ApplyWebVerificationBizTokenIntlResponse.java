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

public class ApplyWebVerificationBizTokenIntlResponse extends AbstractModel {

    /**
    * The token identifying this web-based verification process, valid for 7,200s after issuance. It is required for getting the result after the verification process is completed.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
    */
    @SerializedName("VerificationUrl")
    @Expose
    private String VerificationUrl;

    /**
    * The token for the web-based verification, which is generated using the ApplyWebVerificationBizTokenIntl API.
Example: 81EEF678-28EE-4759-A82E-6CBBBE6BC442
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * The verification URL to be opened with a browser to start the verification process.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
    */
    @SerializedName("VerificationURL")
    @Expose
    private String VerificationURL;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The token identifying this web-based verification process, valid for 7,200s after issuance. It is required for getting the result after the verification process is completed.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442 
     * @return VerificationUrl The token identifying this web-based verification process, valid for 7,200s after issuance. It is required for getting the result after the verification process is completed.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
     * @deprecated
     */
    @Deprecated
    public String getVerificationUrl() {
        return this.VerificationUrl;
    }

    /**
     * Set The token identifying this web-based verification process, valid for 7,200s after issuance. It is required for getting the result after the verification process is completed.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
     * @param VerificationUrl The token identifying this web-based verification process, valid for 7,200s after issuance. It is required for getting the result after the verification process is completed.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
     * @deprecated
     */
    @Deprecated
    public void setVerificationUrl(String VerificationUrl) {
        this.VerificationUrl = VerificationUrl;
    }

    /**
     * Get The token for the web-based verification, which is generated using the ApplyWebVerificationBizTokenIntl API.
Example: 81EEF678-28EE-4759-A82E-6CBBBE6BC442 
     * @return BizToken The token for the web-based verification, which is generated using the ApplyWebVerificationBizTokenIntl API.
Example: 81EEF678-28EE-4759-A82E-6CBBBE6BC442
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set The token for the web-based verification, which is generated using the ApplyWebVerificationBizTokenIntl API.
Example: 81EEF678-28EE-4759-A82E-6CBBBE6BC442
     * @param BizToken The token for the web-based verification, which is generated using the ApplyWebVerificationBizTokenIntl API.
Example: 81EEF678-28EE-4759-A82E-6CBBBE6BC442
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    /**
     * Get The verification URL to be opened with a browser to start the verification process.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442 
     * @return VerificationURL The verification URL to be opened with a browser to start the verification process.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
     */
    public String getVerificationURL() {
        return this.VerificationURL;
    }

    /**
     * Set The verification URL to be opened with a browser to start the verification process.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
     * @param VerificationURL The verification URL to be opened with a browser to start the verification process.
Example: https://intl.faceid.qq.com/reflect/?token=81EEF678-28EE-4759-A82E-6CBBBE6BC442
     */
    public void setVerificationURL(String VerificationURL) {
        this.VerificationURL = VerificationURL;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ApplyWebVerificationBizTokenIntlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyWebVerificationBizTokenIntlResponse(ApplyWebVerificationBizTokenIntlResponse source) {
        if (source.VerificationUrl != null) {
            this.VerificationUrl = new String(source.VerificationUrl);
        }
        if (source.BizToken != null) {
            this.BizToken = new String(source.BizToken);
        }
        if (source.VerificationURL != null) {
            this.VerificationURL = new String(source.VerificationURL);
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
        this.setParamSimple(map, prefix + "VerificationURL", this.VerificationURL);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

