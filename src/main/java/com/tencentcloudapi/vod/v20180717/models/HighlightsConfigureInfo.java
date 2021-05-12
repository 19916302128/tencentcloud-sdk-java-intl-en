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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighlightsConfigureInfo extends AbstractModel{

    /**
    * Switch of an intelligent highlight generating task. Valid values:
<li>ON: enable an intelligent highlight generating task;</li>
<li>OFF: disable an intelligent highlight generating task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Switch of an intelligent highlight generating task. Valid values:
<li>ON: enable an intelligent highlight generating task;</li>
<li>OFF: disable an intelligent highlight generating task.</li> 
     * @return Switch Switch of an intelligent highlight generating task. Valid values:
<li>ON: enable an intelligent highlight generating task;</li>
<li>OFF: disable an intelligent highlight generating task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of an intelligent highlight generating task. Valid values:
<li>ON: enable an intelligent highlight generating task;</li>
<li>OFF: disable an intelligent highlight generating task.</li>
     * @param Switch Switch of an intelligent highlight generating task. Valid values:
<li>ON: enable an intelligent highlight generating task;</li>
<li>OFF: disable an intelligent highlight generating task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public HighlightsConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighlightsConfigureInfo(HighlightsConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

