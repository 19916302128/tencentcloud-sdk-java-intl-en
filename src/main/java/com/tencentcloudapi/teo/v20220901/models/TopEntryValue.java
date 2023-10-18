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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopEntryValue extends AbstractModel {

    /**
    * The item name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The number of items.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get The item name. 
     * @return Name The item name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The item name.
     * @param Name The item name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The number of items. 
     * @return Count The number of items.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of items.
     * @param Count The number of items.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public TopEntryValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopEntryValue(TopEntryValue source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

