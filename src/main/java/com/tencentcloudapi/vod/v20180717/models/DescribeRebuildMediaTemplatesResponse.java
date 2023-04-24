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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRebuildMediaTemplatesResponse extends AbstractModel{

    /**
    * The total number of records that meet the conditions.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The details of the remaster templates.
    */
    @SerializedName("RebuildMediaTemplateSet")
    @Expose
    private RebuildMediaTemplate [] RebuildMediaTemplateSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of records that meet the conditions. 
     * @return TotalCount The total number of records that meet the conditions.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of records that meet the conditions.
     * @param TotalCount The total number of records that meet the conditions.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The details of the remaster templates. 
     * @return RebuildMediaTemplateSet The details of the remaster templates.
     */
    public RebuildMediaTemplate [] getRebuildMediaTemplateSet() {
        return this.RebuildMediaTemplateSet;
    }

    /**
     * Set The details of the remaster templates.
     * @param RebuildMediaTemplateSet The details of the remaster templates.
     */
    public void setRebuildMediaTemplateSet(RebuildMediaTemplate [] RebuildMediaTemplateSet) {
        this.RebuildMediaTemplateSet = RebuildMediaTemplateSet;
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

    public DescribeRebuildMediaTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRebuildMediaTemplatesResponse(DescribeRebuildMediaTemplatesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RebuildMediaTemplateSet != null) {
            this.RebuildMediaTemplateSet = new RebuildMediaTemplate[source.RebuildMediaTemplateSet.length];
            for (int i = 0; i < source.RebuildMediaTemplateSet.length; i++) {
                this.RebuildMediaTemplateSet[i] = new RebuildMediaTemplate(source.RebuildMediaTemplateSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RebuildMediaTemplateSet.", this.RebuildMediaTemplateSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

