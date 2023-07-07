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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrConf extends AbstractModel{

    /**
    * Speech-to-Text status. Valid values: `open`, `close`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Speech-to-Text status. Valid values: `open`, `close`. 
     * @return Status Speech-to-Text status. Valid values: `open`, `close`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Speech-to-Text status. Valid values: `open`, `close`.
     * @param Status Speech-to-Text status. Valid values: `open`, `close`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AsrConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrConf(AsrConf source) {
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

