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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryStatus extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Instance status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Additional status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Conditions")
    @Expose
    private RegistryCondition [] Conditions;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Instance status 
     * @return Status Instance status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status
     * @param Status Instance status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Additional status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Conditions Additional status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RegistryCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Additional status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Conditions Additional status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditions(RegistryCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    public RegistryStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryStatus(RegistryStatus source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Conditions != null) {
            this.Conditions = new RegistryCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RegistryCondition(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

