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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCLevelListResponse extends AbstractModel {

    /**
    * Total number of level-defining policies
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Total number of level-defining policies
    */
    @SerializedName("LevelList")
    @Expose
    private CCLevelPolicy [] LevelList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of level-defining policies 
     * @return Total Total number of level-defining policies
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of level-defining policies
     * @param Total Total number of level-defining policies
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Total number of level-defining policies 
     * @return LevelList Total number of level-defining policies
     */
    public CCLevelPolicy [] getLevelList() {
        return this.LevelList;
    }

    /**
     * Set Total number of level-defining policies
     * @param LevelList Total number of level-defining policies
     */
    public void setLevelList(CCLevelPolicy [] LevelList) {
        this.LevelList = LevelList;
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

    public DescribeCCLevelListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCLevelListResponse(DescribeCCLevelListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.LevelList != null) {
            this.LevelList = new CCLevelPolicy[source.LevelList.length];
            for (int i = 0; i < source.LevelList.length; i++) {
                this.LevelList[i] = new CCLevelPolicy(source.LevelList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "LevelList.", this.LevelList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

