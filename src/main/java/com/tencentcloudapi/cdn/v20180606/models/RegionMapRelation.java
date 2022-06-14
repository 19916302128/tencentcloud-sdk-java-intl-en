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

public class RegionMapRelation extends AbstractModel{

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * List of sub-region IDs
    */
    @SerializedName("SubRegionIdList")
    @Expose
    private Long [] SubRegionIdList;

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get List of sub-region IDs 
     * @return SubRegionIdList List of sub-region IDs
     */
    public Long [] getSubRegionIdList() {
        return this.SubRegionIdList;
    }

    /**
     * Set List of sub-region IDs
     * @param SubRegionIdList List of sub-region IDs
     */
    public void setSubRegionIdList(Long [] SubRegionIdList) {
        this.SubRegionIdList = SubRegionIdList;
    }

    public RegionMapRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionMapRelation(RegionMapRelation source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.SubRegionIdList != null) {
            this.SubRegionIdList = new Long[source.SubRegionIdList.length];
            for (int i = 0; i < source.SubRegionIdList.length; i++) {
                this.SubRegionIdList[i] = new Long(source.SubRegionIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "SubRegionIdList.", this.SubRegionIdList);

    }
}

