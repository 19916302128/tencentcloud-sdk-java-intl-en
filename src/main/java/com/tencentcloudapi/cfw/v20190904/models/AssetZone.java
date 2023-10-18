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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetZone extends AbstractModel {

    /**
    * Region
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Region
    */
    @SerializedName("ZoneEng")
    @Expose
    private String ZoneEng;

    /**
     * Get Region 
     * @return Zone Region
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region
     * @param Zone Region
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Region 
     * @return ZoneEng Region
     */
    public String getZoneEng() {
        return this.ZoneEng;
    }

    /**
     * Set Region
     * @param ZoneEng Region
     */
    public void setZoneEng(String ZoneEng) {
        this.ZoneEng = ZoneEng;
    }

    public AssetZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetZone(AssetZone source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneEng != null) {
            this.ZoneEng = new String(source.ZoneEng);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneEng", this.ZoneEng);

    }
}

