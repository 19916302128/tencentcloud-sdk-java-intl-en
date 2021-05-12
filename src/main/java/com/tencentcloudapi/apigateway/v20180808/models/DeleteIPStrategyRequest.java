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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIPStrategyRequest extends AbstractModel{

    /**
    * Unique service ID of the IP policy to be deleted.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique ID of the IP policy to be deleted.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
     * Get Unique service ID of the IP policy to be deleted. 
     * @return ServiceId Unique service ID of the IP policy to be deleted.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID of the IP policy to be deleted.
     * @param ServiceId Unique service ID of the IP policy to be deleted.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique ID of the IP policy to be deleted. 
     * @return StrategyId Unique ID of the IP policy to be deleted.
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Unique ID of the IP policy to be deleted.
     * @param StrategyId Unique ID of the IP policy to be deleted.
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    public DeleteIPStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIPStrategyRequest(DeleteIPStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

