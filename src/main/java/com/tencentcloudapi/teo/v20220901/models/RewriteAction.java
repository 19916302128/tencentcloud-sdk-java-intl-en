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

public class RewriteAction extends AbstractModel{

    /**
    * Feature name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the feature name.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Parameter
    */
    @SerializedName("Parameters")
    @Expose
    private RuleRewriteActionParams [] Parameters;

    /**
     * Get Feature name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the feature name. 
     * @return Action Feature name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the feature name.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Feature name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the feature name.
     * @param Action Feature name. You can call the [DescribeRulesSetting](https://tcloud4api.woa.com/document/product/1657/79433?!preview&!document=1) API to view the requirements for entering the feature name.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Parameter 
     * @return Parameters Parameter
     */
    public RuleRewriteActionParams [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set Parameter
     * @param Parameters Parameter
     */
    public void setParameters(RuleRewriteActionParams [] Parameters) {
        this.Parameters = Parameters;
    }

    public RewriteAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RewriteAction(RewriteAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Parameters != null) {
            this.Parameters = new RuleRewriteActionParams[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new RuleRewriteActionParams(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

