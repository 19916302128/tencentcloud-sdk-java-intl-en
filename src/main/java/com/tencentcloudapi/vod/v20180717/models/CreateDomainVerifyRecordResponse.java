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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainVerifyRecordResponse extends AbstractModel {

    /**
    * DNS Verify Information
    */
    @SerializedName("DNSVerifyInfo")
    @Expose
    private DNSVerifyInfo DNSVerifyInfo;

    /**
    * File Verify Information
    */
    @SerializedName("FileVerifyInfo")
    @Expose
    private FileVerifyInfo FileVerifyInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DNS Verify Information 
     * @return DNSVerifyInfo DNS Verify Information
     */
    public DNSVerifyInfo getDNSVerifyInfo() {
        return this.DNSVerifyInfo;
    }

    /**
     * Set DNS Verify Information
     * @param DNSVerifyInfo DNS Verify Information
     */
    public void setDNSVerifyInfo(DNSVerifyInfo DNSVerifyInfo) {
        this.DNSVerifyInfo = DNSVerifyInfo;
    }

    /**
     * Get File Verify Information 
     * @return FileVerifyInfo File Verify Information
     */
    public FileVerifyInfo getFileVerifyInfo() {
        return this.FileVerifyInfo;
    }

    /**
     * Set File Verify Information
     * @param FileVerifyInfo File Verify Information
     */
    public void setFileVerifyInfo(FileVerifyInfo FileVerifyInfo) {
        this.FileVerifyInfo = FileVerifyInfo;
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

    public CreateDomainVerifyRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainVerifyRecordResponse(CreateDomainVerifyRecordResponse source) {
        if (source.DNSVerifyInfo != null) {
            this.DNSVerifyInfo = new DNSVerifyInfo(source.DNSVerifyInfo);
        }
        if (source.FileVerifyInfo != null) {
            this.FileVerifyInfo = new FileVerifyInfo(source.FileVerifyInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DNSVerifyInfo.", this.DNSVerifyInfo);
        this.setParamObj(map, prefix + "FileVerifyInfo.", this.FileVerifyInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

