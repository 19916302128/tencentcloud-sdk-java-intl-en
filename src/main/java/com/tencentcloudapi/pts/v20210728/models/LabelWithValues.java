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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelWithValues extends AbstractModel {

    /**
    * Label Name.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * Label values.
    */
    @SerializedName("LabelValues")
    @Expose
    private String [] LabelValues;

    /**
     * Get Label Name. 
     * @return LabelName Label Name.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set Label Name.
     * @param LabelName Label Name.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get Label values. 
     * @return LabelValues Label values.
     */
    public String [] getLabelValues() {
        return this.LabelValues;
    }

    /**
     * Set Label values.
     * @param LabelValues Label values.
     */
    public void setLabelValues(String [] LabelValues) {
        this.LabelValues = LabelValues;
    }

    public LabelWithValues() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelWithValues(LabelWithValues source) {
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValues != null) {
            this.LabelValues = new String[source.LabelValues.length];
            for (int i = 0; i < source.LabelValues.length; i++) {
                this.LabelValues[i] = new String(source.LabelValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamArraySimple(map, prefix + "LabelValues.", this.LabelValues);

    }
}

