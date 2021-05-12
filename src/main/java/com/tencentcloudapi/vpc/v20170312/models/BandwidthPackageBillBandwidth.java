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

public class BandwidthPackageBillBandwidth extends AbstractModel{

    /**
    * Current billable usage, in Mbps
    */
    @SerializedName("BandwidthUsage")
    @Expose
    private Long BandwidthUsage;

    /**
     * Get Current billable usage, in Mbps 
     * @return BandwidthUsage Current billable usage, in Mbps
     */
    public Long getBandwidthUsage() {
        return this.BandwidthUsage;
    }

    /**
     * Set Current billable usage, in Mbps
     * @param BandwidthUsage Current billable usage, in Mbps
     */
    public void setBandwidthUsage(Long BandwidthUsage) {
        this.BandwidthUsage = BandwidthUsage;
    }

    public BandwidthPackageBillBandwidth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthPackageBillBandwidth(BandwidthPackageBillBandwidth source) {
        if (source.BandwidthUsage != null) {
            this.BandwidthUsage = new Long(source.BandwidthUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthUsage", this.BandwidthUsage);

    }
}

