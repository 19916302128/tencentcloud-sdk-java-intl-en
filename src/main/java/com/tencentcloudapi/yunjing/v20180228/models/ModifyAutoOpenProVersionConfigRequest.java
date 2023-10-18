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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoOpenProVersionConfigRequest extends AbstractModel {

    /**
    * Auto-Activation status.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Auto-Activation status.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li> 
     * @return Status Auto-Activation status.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Auto-Activation status.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
     * @param Status Auto-Activation status.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyAutoOpenProVersionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoOpenProVersionConfigRequest(ModifyAutoOpenProVersionConfigRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

