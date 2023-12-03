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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainConfigRequest extends AbstractModel {

    /**
    * The domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Name of the configuration parameter.
    */
    @SerializedName("Route")
    @Expose
    private String Route;

    /**
    * Value of the configuration parameter. This field is serialized to a JSON string {key:value}, where **key** is fixed to `update`.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get The domain name. 
     * @return Domain The domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name.
     * @param Domain The domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Name of the configuration parameter. 
     * @return Route Name of the configuration parameter.
     */
    public String getRoute() {
        return this.Route;
    }

    /**
     * Set Name of the configuration parameter.
     * @param Route Name of the configuration parameter.
     */
    public void setRoute(String Route) {
        this.Route = Route;
    }

    /**
     * Get Value of the configuration parameter. This field is serialized to a JSON string {key:value}, where **key** is fixed to `update`. 
     * @return Value Value of the configuration parameter. This field is serialized to a JSON string {key:value}, where **key** is fixed to `update`.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value of the configuration parameter. This field is serialized to a JSON string {key:value}, where **key** is fixed to `update`.
     * @param Value Value of the configuration parameter. This field is serialized to a JSON string {key:value}, where **key** is fixed to `update`.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ModifyDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainConfigRequest(ModifyDomainConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Route != null) {
            this.Route = new String(source.Route);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Route", this.Route);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

