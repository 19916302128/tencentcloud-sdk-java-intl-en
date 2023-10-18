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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdbProxyInfoResponse extends AbstractModel {

    /**
    * Number of proxy groups Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Proxy group information Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyInfos")
    @Expose
    private ProxyGroupInfo [] ProxyInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of proxy groups Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Number of proxy groups Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of proxy groups Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Number of proxy groups Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Proxy group information Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyInfos Proxy group information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProxyGroupInfo [] getProxyInfos() {
        return this.ProxyInfos;
    }

    /**
     * Set Proxy group information Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyInfos Proxy group information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyInfos(ProxyGroupInfo [] ProxyInfos) {
        this.ProxyInfos = ProxyInfos;
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

    public DescribeCdbProxyInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdbProxyInfoResponse(DescribeCdbProxyInfoResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProxyInfos != null) {
            this.ProxyInfos = new ProxyGroupInfo[source.ProxyInfos.length];
            for (int i = 0; i < source.ProxyInfos.length; i++) {
                this.ProxyInfos[i] = new ProxyGroupInfo(source.ProxyInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "ProxyInfos.", this.ProxyInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

