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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyManagedRulesIdRequest extends AbstractModel{

    /**
    * List of rule IDs
    */
    @SerializedName("RuleId")
    @Expose
    private Long [] RuleId;

    /**
     * Get List of rule IDs 
     * @return RuleId List of rule IDs
     */
    public Long [] getRuleId() {
        return this.RuleId;
    }

    /**
     * Set List of rule IDs
     * @param RuleId List of rule IDs
     */
    public void setRuleId(Long [] RuleId) {
        this.RuleId = RuleId;
    }

    public DescribeSecurityPolicyManagedRulesIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyManagedRulesIdRequest(DescribeSecurityPolicyManagedRulesIdRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long[source.RuleId.length];
            for (int i = 0; i < source.RuleId.length; i++) {
                this.RuleId[i] = new Long(source.RuleId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleId.", this.RuleId);

    }
}

