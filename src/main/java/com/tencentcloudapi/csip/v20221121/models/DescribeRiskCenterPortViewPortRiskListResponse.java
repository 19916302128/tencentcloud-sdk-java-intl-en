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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskCenterPortViewPortRiskListResponse extends AbstractModel {

    /**
    * Total number of entries
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of port risks by assets
    */
    @SerializedName("Data")
    @Expose
    private PortViewPortRisk [] Data;

    /**
    * List of risk levels
    */
    @SerializedName("LevelLists")
    @Expose
    private FilterDataObject [] LevelLists;

    /**
    * List of suggestions
    */
    @SerializedName("SuggestionLists")
    @Expose
    private FilterDataObject [] SuggestionLists;

    /**
    * List of check source
    */
    @SerializedName("FromLists")
    @Expose
    private FilterDataObject [] FromLists;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of entries 
     * @return TotalCount Total number of entries
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of entries
     * @param TotalCount Total number of entries
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of port risks by assets 
     * @return Data List of port risks by assets
     */
    public PortViewPortRisk [] getData() {
        return this.Data;
    }

    /**
     * Set List of port risks by assets
     * @param Data List of port risks by assets
     */
    public void setData(PortViewPortRisk [] Data) {
        this.Data = Data;
    }

    /**
     * Get List of risk levels 
     * @return LevelLists List of risk levels
     */
    public FilterDataObject [] getLevelLists() {
        return this.LevelLists;
    }

    /**
     * Set List of risk levels
     * @param LevelLists List of risk levels
     */
    public void setLevelLists(FilterDataObject [] LevelLists) {
        this.LevelLists = LevelLists;
    }

    /**
     * Get List of suggestions 
     * @return SuggestionLists List of suggestions
     */
    public FilterDataObject [] getSuggestionLists() {
        return this.SuggestionLists;
    }

    /**
     * Set List of suggestions
     * @param SuggestionLists List of suggestions
     */
    public void setSuggestionLists(FilterDataObject [] SuggestionLists) {
        this.SuggestionLists = SuggestionLists;
    }

    /**
     * Get List of check source 
     * @return FromLists List of check source
     */
    public FilterDataObject [] getFromLists() {
        return this.FromLists;
    }

    /**
     * Set List of check source
     * @param FromLists List of check source
     */
    public void setFromLists(FilterDataObject [] FromLists) {
        this.FromLists = FromLists;
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

    public DescribeRiskCenterPortViewPortRiskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskCenterPortViewPortRiskListResponse(DescribeRiskCenterPortViewPortRiskListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new PortViewPortRisk[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new PortViewPortRisk(source.Data[i]);
            }
        }
        if (source.LevelLists != null) {
            this.LevelLists = new FilterDataObject[source.LevelLists.length];
            for (int i = 0; i < source.LevelLists.length; i++) {
                this.LevelLists[i] = new FilterDataObject(source.LevelLists[i]);
            }
        }
        if (source.SuggestionLists != null) {
            this.SuggestionLists = new FilterDataObject[source.SuggestionLists.length];
            for (int i = 0; i < source.SuggestionLists.length; i++) {
                this.SuggestionLists[i] = new FilterDataObject(source.SuggestionLists[i]);
            }
        }
        if (source.FromLists != null) {
            this.FromLists = new FilterDataObject[source.FromLists.length];
            for (int i = 0; i < source.FromLists.length; i++) {
                this.FromLists[i] = new FilterDataObject(source.FromLists[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "LevelLists.", this.LevelLists);
        this.setParamArrayObj(map, prefix + "SuggestionLists.", this.SuggestionLists);
        this.setParamArrayObj(map, prefix + "FromLists.", this.FromLists);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

