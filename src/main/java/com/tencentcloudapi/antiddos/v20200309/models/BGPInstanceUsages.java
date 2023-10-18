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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPInstanceUsages extends AbstractModel {

    /**
    * Number of used protection chances
    */
    @SerializedName("ProtectCountUsage")
    @Expose
    private Long ProtectCountUsage;

    /**
    * Number of protected IPs
    */
    @SerializedName("ProtectIPNumberUsage")
    @Expose
    private Long ProtectIPNumberUsage;

    /**
    * Number of attack times in the last 7 days
    */
    @SerializedName("Last7DayAttackCount")
    @Expose
    private Long Last7DayAttackCount;

    /**
     * Get Number of used protection chances 
     * @return ProtectCountUsage Number of used protection chances
     */
    public Long getProtectCountUsage() {
        return this.ProtectCountUsage;
    }

    /**
     * Set Number of used protection chances
     * @param ProtectCountUsage Number of used protection chances
     */
    public void setProtectCountUsage(Long ProtectCountUsage) {
        this.ProtectCountUsage = ProtectCountUsage;
    }

    /**
     * Get Number of protected IPs 
     * @return ProtectIPNumberUsage Number of protected IPs
     */
    public Long getProtectIPNumberUsage() {
        return this.ProtectIPNumberUsage;
    }

    /**
     * Set Number of protected IPs
     * @param ProtectIPNumberUsage Number of protected IPs
     */
    public void setProtectIPNumberUsage(Long ProtectIPNumberUsage) {
        this.ProtectIPNumberUsage = ProtectIPNumberUsage;
    }

    /**
     * Get Number of attack times in the last 7 days 
     * @return Last7DayAttackCount Number of attack times in the last 7 days
     */
    public Long getLast7DayAttackCount() {
        return this.Last7DayAttackCount;
    }

    /**
     * Set Number of attack times in the last 7 days
     * @param Last7DayAttackCount Number of attack times in the last 7 days
     */
    public void setLast7DayAttackCount(Long Last7DayAttackCount) {
        this.Last7DayAttackCount = Last7DayAttackCount;
    }

    public BGPInstanceUsages() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPInstanceUsages(BGPInstanceUsages source) {
        if (source.ProtectCountUsage != null) {
            this.ProtectCountUsage = new Long(source.ProtectCountUsage);
        }
        if (source.ProtectIPNumberUsage != null) {
            this.ProtectIPNumberUsage = new Long(source.ProtectIPNumberUsage);
        }
        if (source.Last7DayAttackCount != null) {
            this.Last7DayAttackCount = new Long(source.Last7DayAttackCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectCountUsage", this.ProtectCountUsage);
        this.setParamSimple(map, prefix + "ProtectIPNumberUsage", this.ProtectIPNumberUsage);
        this.setParamSimple(map, prefix + "Last7DayAttackCount", this.Last7DayAttackCount);

    }
}

