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

public class UploadCertificateResponse extends AbstractModel {

    /**
    * Certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * The ID of the repeatedly uploaded certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RepeatCertId")
    @Expose
    private String RepeatCertId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Certificate ID 
     * @return CertificateId Certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID
     * @param CertificateId Certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get The ID of the repeatedly uploaded certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RepeatCertId The ID of the repeatedly uploaded certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRepeatCertId() {
        return this.RepeatCertId;
    }

    /**
     * Set The ID of the repeatedly uploaded certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RepeatCertId The ID of the repeatedly uploaded certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRepeatCertId(String RepeatCertId) {
        this.RepeatCertId = RepeatCertId;
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

    public UploadCertificateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadCertificateResponse(UploadCertificateResponse source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.RepeatCertId != null) {
            this.RepeatCertId = new String(source.RepeatCertId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "RepeatCertId", this.RepeatCertId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

