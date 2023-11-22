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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConfigureInfo extends AbstractModel {

    /**
    * Audio (mute, bass, pop) detection switch, optional values: 
<li>ON: on; </li>
<li>OFF: off. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Audio (mute, bass, pop) detection switch, optional values: 
<li>ON: on; </li>
<li>OFF: off. </li> 
     * @return Switch Audio (mute, bass, pop) detection switch, optional values: 
<li>ON: on; </li>
<li>OFF: off. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Audio (mute, bass, pop) detection switch, optional values: 
<li>ON: on; </li>
<li>OFF: off. </li>
     * @param Switch Audio (mute, bass, pop) detection switch, optional values: 
<li>ON: on; </li>
<li>OFF: off. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public VoiceConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConfigureInfo(VoiceConfigureInfo source) {
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

