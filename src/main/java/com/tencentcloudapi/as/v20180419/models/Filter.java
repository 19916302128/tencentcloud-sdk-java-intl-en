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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * Field to be filtered.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter value of the field.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Field to be filtered. 
     * @return Name Field to be filtered.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field to be filtered.
     * @param Name Field to be filtered.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter value of the field. 
     * @return Values Filter value of the field.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter value of the field.
     * @param Values Filter value of the field.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

