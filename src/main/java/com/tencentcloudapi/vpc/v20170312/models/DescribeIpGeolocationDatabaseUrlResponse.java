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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpGeolocationDatabaseUrlResponse extends AbstractModel{

    /**
    * Download link of an IP location database
    */
    @SerializedName("DownLoadUrl")
    @Expose
    private String DownLoadUrl;

    /**
    * Link expiration time in UTC format following the ISO8601 standard.
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Download link of an IP location database 
     * @return DownLoadUrl Download link of an IP location database
     */
    public String getDownLoadUrl() {
        return this.DownLoadUrl;
    }

    /**
     * Set Download link of an IP location database
     * @param DownLoadUrl Download link of an IP location database
     */
    public void setDownLoadUrl(String DownLoadUrl) {
        this.DownLoadUrl = DownLoadUrl;
    }

    /**
     * Get Link expiration time in UTC format following the ISO8601 standard. 
     * @return ExpiredAt Link expiration time in UTC format following the ISO8601 standard.
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set Link expiration time in UTC format following the ISO8601 standard.
     * @param ExpiredAt Link expiration time in UTC format following the ISO8601 standard.
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
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

    public DescribeIpGeolocationDatabaseUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpGeolocationDatabaseUrlResponse(DescribeIpGeolocationDatabaseUrlResponse source) {
        if (source.DownLoadUrl != null) {
            this.DownLoadUrl = new String(source.DownLoadUrl);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownLoadUrl", this.DownLoadUrl);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

