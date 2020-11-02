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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderRule extends AbstractModel{

    /**
    * HTTP header setting method. Valid values: `add` (add header), `set` (set header) or `del` (delete header).
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * HTTP header name
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * HTTP header value
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
     * Get HTTP header setting method. Valid values: `add` (add header), `set` (set header) or `del` (delete header). 
     * @return HeaderMode HTTP header setting method. Valid values: `add` (add header), `set` (set header) or `del` (delete header).
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set HTTP header setting method. Valid values: `add` (add header), `set` (set header) or `del` (delete header).
     * @param HeaderMode HTTP header setting method. Valid values: `add` (add header), `set` (set header) or `del` (delete header).
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get HTTP header name 
     * @return HeaderName HTTP header name
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set HTTP header name
     * @param HeaderName HTTP header name
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get HTTP header value 
     * @return HeaderValue HTTP header value
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set HTTP header value
     * @param HeaderValue HTTP header value
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderMode", this.HeaderMode);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);

    }
}

