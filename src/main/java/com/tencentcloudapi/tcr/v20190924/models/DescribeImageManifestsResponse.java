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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageManifestsResponse extends AbstractModel {

    /**
    * Image manifest information
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * Image configuration information
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Image manifest information 
     * @return Manifest Image manifest information
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set Image manifest information
     * @param Manifest Image manifest information
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get Image configuration information 
     * @return Config Image configuration information
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Image configuration information
     * @param Config Image configuration information
     */
    public void setConfig(String Config) {
        this.Config = Config;
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

    public DescribeImageManifestsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageManifestsResponse(DescribeImageManifestsResponse source) {
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

