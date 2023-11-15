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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskCenterWeakPwdRiskInputParam extends AbstractModel {

    /**
    * Check item ID
    */
    @SerializedName("CheckItemId")
    @Expose
    private Long CheckItemId;

    /**
    * Whether to enable. `0`: no, `1`: yes.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get Check item ID 
     * @return CheckItemId Check item ID
     */
    public Long getCheckItemId() {
        return this.CheckItemId;
    }

    /**
     * Set Check item ID
     * @param CheckItemId Check item ID
     */
    public void setCheckItemId(Long CheckItemId) {
        this.CheckItemId = CheckItemId;
    }

    /**
     * Get Whether to enable. `0`: no, `1`: yes. 
     * @return Enable Whether to enable. `0`: no, `1`: yes.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. `0`: no, `1`: yes.
     * @param Enable Whether to enable. `0`: no, `1`: yes.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public TaskCenterWeakPwdRiskInputParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskCenterWeakPwdRiskInputParam(TaskCenterWeakPwdRiskInputParam source) {
        if (source.CheckItemId != null) {
            this.CheckItemId = new Long(source.CheckItemId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckItemId", this.CheckItemId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

