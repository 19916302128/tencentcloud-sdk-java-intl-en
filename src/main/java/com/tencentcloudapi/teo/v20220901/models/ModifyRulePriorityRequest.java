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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRulePriorityRequest extends AbstractModel{

    /**
    * ID of the site
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Order of rule IDs. If there are multiple rules, they will be executed in order from top to bottom.
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
     * Get ID of the site 
     * @return ZoneId ID of the site
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site
     * @param ZoneId ID of the site
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Order of rule IDs. If there are multiple rules, they will be executed in order from top to bottom. 
     * @return RuleIds Order of rule IDs. If there are multiple rules, they will be executed in order from top to bottom.
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set Order of rule IDs. If there are multiple rules, they will be executed in order from top to bottom.
     * @param RuleIds Order of rule IDs. If there are multiple rules, they will be executed in order from top to bottom.
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    public ModifyRulePriorityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRulePriorityRequest(ModifyRulePriorityRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);

    }
}

