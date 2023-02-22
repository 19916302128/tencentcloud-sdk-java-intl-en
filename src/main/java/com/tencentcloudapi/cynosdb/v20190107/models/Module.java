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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Module extends AbstractModel{

    /**
    * Whether it is supported. Valid values: `yes`, `no`.
    */
    @SerializedName("IsDisable")
    @Expose
    private String IsDisable;

    /**
    * Module name
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
     * Get Whether it is supported. Valid values: `yes`, `no`. 
     * @return IsDisable Whether it is supported. Valid values: `yes`, `no`.
     */
    public String getIsDisable() {
        return this.IsDisable;
    }

    /**
     * Set Whether it is supported. Valid values: `yes`, `no`.
     * @param IsDisable Whether it is supported. Valid values: `yes`, `no`.
     */
    public void setIsDisable(String IsDisable) {
        this.IsDisable = IsDisable;
    }

    /**
     * Get Module name 
     * @return ModuleName Module name
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set Module name
     * @param ModuleName Module name
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    public Module() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Module(Module source) {
        if (source.IsDisable != null) {
            this.IsDisable = new String(source.IsDisable);
        }
        if (source.ModuleName != null) {
            this.ModuleName = new String(source.ModuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDisable", this.IsDisable);
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);

    }
}

