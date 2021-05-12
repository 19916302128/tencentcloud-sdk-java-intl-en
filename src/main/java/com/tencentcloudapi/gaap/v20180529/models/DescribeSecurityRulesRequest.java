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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityRulesRequest extends AbstractModel{

    /**
    * List of security rule IDs. Up to 20 security rules are supported.
    */
    @SerializedName("SecurityRuleIds")
    @Expose
    private String [] SecurityRuleIds;

    /**
     * Get List of security rule IDs. Up to 20 security rules are supported. 
     * @return SecurityRuleIds List of security rule IDs. Up to 20 security rules are supported.
     */
    public String [] getSecurityRuleIds() {
        return this.SecurityRuleIds;
    }

    /**
     * Set List of security rule IDs. Up to 20 security rules are supported.
     * @param SecurityRuleIds List of security rule IDs. Up to 20 security rules are supported.
     */
    public void setSecurityRuleIds(String [] SecurityRuleIds) {
        this.SecurityRuleIds = SecurityRuleIds;
    }

    public DescribeSecurityRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityRulesRequest(DescribeSecurityRulesRequest source) {
        if (source.SecurityRuleIds != null) {
            this.SecurityRuleIds = new String[source.SecurityRuleIds.length];
            for (int i = 0; i < source.SecurityRuleIds.length; i++) {
                this.SecurityRuleIds[i] = new String(source.SecurityRuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityRuleIds.", this.SecurityRuleIds);

    }
}

